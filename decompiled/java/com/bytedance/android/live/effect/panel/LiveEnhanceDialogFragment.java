package com.bytedance.android.live.effect.panel;

import X.C011Z;
import X.C0IJT;
import X.C0U5V;
import X.C0U61;
import X.C0U76;
import X.C0U7C;
import X.C0U7R;
import X.C0U7T;
import X.C0UA1;
import X.C0URX;
import X.C1161920gLG;
import X.C158B;
import X.C20441214yg;
import X.C2097608Jq;
import X.C21648719nx;
import X.C2188811AlT;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C761910Tuf;
import X.C766290U4d;
import X.C767120U7i;
import X.C767140U7k;
import X.C767200U7q;
import X.C768300UBw;
import X.C770910ULx;
import X.C782110Um9;
import X.C786410Ut5;
import X.C946050aj5;
import X.C946060aj6;
import X.EnumC761940Tui;
import X.EnumC767070U7d;
import X.InterfaceC766480U4w;
import Y.ATListenerS446S0100000_12;
import Y.AcS110S1100000_12;
import Y.AcS29S2100000_12;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.AIBeautyInterceptEvent;
import com.bytedance.android.live.effect.OnFilterSelectedByClickEvent;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.live.effect.panel.LiveEnhanceDialogFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastBgClearMemory;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautySetting;
import com.bytedance.android.livesdk.model.EnhanceChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS88S1000000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import webcast.api.room.Modification;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveEnhanceDialogFragment extends LiveDialogFragment implements View.OnLayoutChangeListener {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4HELIOSZz8yJiAgZwM6PiAJJycyJiYpDSYyJCorDz0yLygpJzs=";
    public FrameLayout LL;
    public C0U5V LLILLJJLI;
    public FrameLayout LLILLL;
    public long LLILZ;
    public VelocityTracker LLILZIL;
    public GestureDetector LLILZLL;
    public final float LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.h6k);
        C766290U4d.LIZ(c500980Jkm);
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        if (MR("") || C761910Tuf.LIZ) {
            return true;
        }
        return super.onBackPressed();
    }

    public LiveEnhanceDialogFragment() {
        this.LLIZ = C497740JfY.LJJ() ? -C497740JfY.LJIIZILJ() : C497740JfY.LJIIZILJ();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C946060aj6 c946060aj6LIZ;
        C946050aj5 c946050aj5LIZIZ;
        FrameLayout frameLayout;
        super.onDestroyView();
        View view = getView();
        if (view != null && (frameLayout = (FrameLayout) view.findViewById(R.id.gvn)) != null) {
            C0U5V c0u5v = this.LLILLJJLI;
            C786410Ut5.LJJJZ(c0u5v != null ? c0u5v.getView() : null, frameLayout);
        }
        this.LLILLJJLI = null;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (c946060aj6LIZ = C0URX.LIZ(dataChannel, EnhanceChannel.class)) != null && (c946050aj5LIZIZ = c946060aj6LIZ.LIZIZ()) != null) {
            c946050aj5LIZIZ.LIZIZ(2);
        }
        this.LL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C766290U4d.LIZIZ(this);
        C0U5V c0u5v = this.LLILLJJLI;
        if (c0u5v != null) {
            c0u5v.onDialogForeground();
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C0U5V c0u5v = this.LLILLJJLI;
        if (c0u5v != null) {
            c0u5v.onDialogBackground();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean requireE2EAdaption() {
        return true;
    }

    public final boolean MR(String str) {
        boolean z;
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("intercept: exp: ");
        LiveAIBeautySetting liveAIBeautySetting = LiveAIBeautySetting.INSTANCE;
        sbLIZ.append(liveAIBeautySetting.enableAIBeauty());
        sbLIZ.append(", should: ");
        EnumC767070U7d enumC767070U7d = ((LiveSmallItemBeautyViewModel) C0U61.LIZ(new C0U76()).get(LiveSmallItemBeautyViewModel.class)).LLILZLL;
        EnumC767070U7d enumC767070U7d2 = EnumC767070U7d.ANALYZING;
        if (enumC767070U7d == enumC767070U7d2) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("AIBeauty", C2188811AlT.LIZIZ(sbLIZ));
        if (liveAIBeautySetting.enableAIBeauty() && ((LiveSmallItemBeautyViewModel) C0U61.LIZ(new C0U76()).get(LiveSmallItemBeautyViewModel.class)).LLILZLL == enumC767070U7d2) {
            if (str.length() > 0 && !Intrinsics.LJFF(str, "Cancel")) {
                str2 = "change_tab";
            } else if (str.length() == 0) {
                str2 = "click_blank";
            } else {
                str2 = "click_cancel";
            }
            C782110Um9 c782110Um9 = new C782110Um9(getContext());
            c782110Um9.LIZJ = C497740JfY.LJIJI(2131851219);
            c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131851217));
            c782110Um9.LJIILLIIL = false;
            c782110Um9.LJIILL = false;
            c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131851220), new AcS110S1100000_12(this, str2, 3));
            c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131851218), new AcS29S2100000_12(this, str2, str, 0));
            LiveDialog liveDialogLIZ = c782110Um9.LIZ();
            NR(str2, "show", "");
            C786410Ut5.E4(liveDialogLIZ);
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, X.InterfaceC513210KAt
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        boolean z;
        String str2;
        String str3;
        C767140U7k c767140U7k;
        boolean z2;
        String strLJLL;
        long j;
        long j2;
        Integer numValueOf;
        Integer numValueOf2;
        long j3;
        C0UA1.LIZ().LJJIII();
        C767200U7q.LJIILJJIL = false;
        C0U5V c0u5v = this.LLILLJJLI;
        if (c0u5v != null) {
            c0u5v.LIZIZ();
        }
        VelocityTracker velocityTracker = this.LLILZIL;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        VelocityTracker velocityTracker2 = this.LLILZIL;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
        }
        this.LLILZIL = null;
        super.onDismiss(dialogInterface);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(LiveDialogStatusChannel.class, new C770910ULx(false, 0, hashCode(), EnumC761940Tui.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
        }
        C0U7R c0u7r = C0U7R.LIZ;
        c0u7r.LIZIZ(false);
        DataChannel dataChannel2 = this.dataChannel;
        long jLIZ = C158B.LIZ() - this.LLILZ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_beauty_panel_duration");
        c474500IjALIZ.LJIJJLI(dataChannel2);
        c474500IjALIZ.LJJII(Long.valueOf(jLIZ), "use_time");
        if (C500260Jjc.LJJIJLIJ()) {
            str = "live_take_page";
        } else {
            str = "live_take_detail";
        }
        c474500IjALIZ.LJJII(str, "event_page");
        c474500IjALIZ.LIZ();
        float f = 0.0f;
        if (C500260Jjc.LJJ() && C500260Jjc.LJJIFFI(Boolean.valueOf(C0U7R.LJIIIZ))) {
            C768300UBw.LIZIZ(2L);
            C0U7R.LJIIL = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene();
            Iterator it2 = ((LinkedHashMap) C2097608Jq.LJIIL(C0U7R.LIZLLL, C0U7R.LJ)).entrySet().iterator();
            boolean z3 = false;
            while (true) {
                String str4 = "";
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                LiveEffect liveEffect = ((C0U7T) entry.getValue()).LIZLLL;
                long effectId = liveEffect.getEffectId();
                String name = liveEffect.getName();
                if (name == null) {
                    name = "";
                }
                String resourceId = liveEffect.getResourceId();
                Long lValueOf = Long.valueOf(C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                String strLJLL2 = liveEffect.LJLL();
                if (strLJLL2 != null) {
                    str4 = strLJLL2;
                }
                LiveEffect.ComposerConfig composerConfigLJIIJ = C0U7C.LJIIJ(liveEffect);
                if (composerConfigLJIIJ != null) {
                    numValueOf = Integer.valueOf(composerConfigLJIIJ.LIZ);
                } else {
                    numValueOf = null;
                }
                LiveEffect.ComposerConfig composerConfigLJIIJ2 = C0U7C.LJIIJ(liveEffect);
                if (composerConfigLJIIJ2 != null) {
                    numValueOf2 = Integer.valueOf(composerConfigLJIIJ2.LIZIZ);
                } else {
                    numValueOf2 = null;
                }
                if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
                    j3 = 1;
                } else {
                    j3 = 2;
                }
                C768300UBw.LJII(2L, new Modification(effectId, name, resourceId, 2L, lValueOf, null, 0L, str4, Long.valueOf(j3), 1L, Float.valueOf(((C0U7T) entry.getValue()).LIZIZ), null, C0U7R.LJIIL, null, null, 0L, 0));
                z3 = true;
            }
            for (Map.Entry entry2 : ((LinkedHashMap) C2097608Jq.LJIIL(C0U7R.LJ, C0U7R.LJFF)).entrySet()) {
                boolean zContains = C0U7R.LJIIJJI.contains(entry2.getKey());
                LiveEffect liveEffect2 = ((C0U7T) entry2.getValue()).LIZLLL;
                C0U7T c0u7t = (C0U7T) ((LinkedHashMap) C0U7R.LIZIZ).get(entry2.getKey());
                if (c0u7t != null && c0u7t.LIZIZ != f) {
                    long effectId2 = liveEffect2.getEffectId();
                    String name2 = liveEffect2.getName();
                    String resourceId2 = liveEffect2.getResourceId();
                    long j4 = c0u7t.LJI;
                    long j5 = LSPassThroughRecordSizeConfig.DEFAULT;
                    Long lValueOf2 = Long.valueOf(j4 / j5);
                    Long lValueOf3 = Long.valueOf(C158B.LIZ() / j5);
                    String strLJLL3 = liveEffect2.LJLL();
                    if (strLJLL3 == null) {
                        strLJLL3 = "";
                    }
                    if (c0u7t.LJ) {
                        j = 1;
                    } else {
                        j = 2;
                    }
                    Long lValueOf4 = Long.valueOf(j);
                    if (zContains) {
                        j2 = 2;
                    } else {
                        j2 = 1;
                    }
                    C768300UBw.LJII(2L, new Modification(effectId2, name2, resourceId2, 2L, lValueOf2, lValueOf3, 0L, strLJLL3, lValueOf4, Long.valueOf(j2), Float.valueOf(c0u7t.LIZIZ), null, C0U7R.LJIIL, null, null, 0L, 0));
                    z3 = true;
                }
                f = 0.0f;
            }
            if (z3) {
                C0U7R.LJIIIZ = true;
                C768300UBw.LJIILIIL(2L);
            }
        }
        c0u7r.LIZJ(this.dataChannel, false);
        c0u7r.LIZLLL(this.dataChannel, false);
        c0u7r.LJI(this.dataChannel);
        DataChannel dataChannel3 = this.dataChannel;
        if (!C500260Jjc.LJJIFFI(InterfaceC766480U4w.LJJ.LIZIZ())) {
            for (Map.Entry entry3 : ((LinkedHashMap) C0U7R.LJFF).entrySet()) {
                if (!C500260Jjc.LJJIFFI(Boolean.valueOf(C0U7R.LJIILIIL)) || (strLJLL = ((C0U7T) entry3.getValue()).LIZLLL.LJLL()) == null || !u.LJJIIJZLJL(strLJLL, "beauty", false)) {
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_take_beauty_close");
                    c474500IjALIZ2.LJIJJLI(dataChannel3);
                    C0U7R.LJIIIZ(c474500IjALIZ2, ((C0U7T) entry3.getValue()).LIZLLL);
                    c474500IjALIZ2.LJJII(Boolean.valueOf(C0U7R.LJIIIIZZ()), "beauty_status");
                    c474500IjALIZ2.LJJII(CardStruct.IStatusCode.DEFAULT, "is_switch_to_off");
                    c474500IjALIZ2.LIZ();
                }
            }
            C0U7R.LJIILIIL = true;
        }
        C0U7R.LJIILIIL();
        c0u7r.LIZ();
        C767120U7i c767120U7i = C767120U7i.LIZ;
        C767120U7i.LIZJ("LiveBeautyFilterDialogFragmentOpt#onDismiss", false);
        if (!Intrinsics.LJFF(C767120U7i.LIZJ, C767120U7i.LIZIZ) && C500260Jjc.LJJ() && C500260Jjc.LJJIFFI(Boolean.valueOf(C767120U7i.LJIIIIZZ))) {
            if (C767120U7i.LIZJ == null && C767120U7i.LIZIZ == null) {
                z2 = true;
            } else {
                z2 = true;
                C767120U7i.LJIIIIZZ = true;
            }
            C768300UBw.LIZIZ(3L);
            z = false;
            C768300UBw.LJFF(C767120U7i.LIZJ, false);
            C768300UBw.LJFF(C767120U7i.LIZIZ, z2);
            C768300UBw.LJIILIIL(3L);
        } else {
            z = false;
        }
        C767120U7i.LJI(this.dataChannel, "LiveBeautyFilterDialogFragmentOpt#onDismiss", z, this.LLIZLLLIL);
        C767120U7i.LJ(this.dataChannel, "LiveBeautyFilterDialogFragmentOpt#onDismiss", z, this.LLIZLLLIL);
        C767120U7i.LJIIIIZZ(this.dataChannel, "LiveBeautyFilterDialogFragmentOpt#onDismiss");
        DataChannel dataChannel4 = this.dataChannel;
        C767140U7k c767140U7k2 = C767120U7i.LIZIZ;
        if (c767140U7k2 != null && (C767120U7i.LIZJ == null || (c767140U7k2.LIZJ != 0.0f && (c767140U7k = C767120U7i.LIZJ) != null && c767140U7k.LIZJ == 0.0f))) {
            C474500IjA c474500IjALIZ3 = C0IJT.LIZ("live_take_filter_close");
            c474500IjALIZ3.LJIJJLI(dataChannel4);
            C767140U7k c767140U7k3 = C767120U7i.LIZJ;
            if (c767140U7k3 != null) {
                str2 = c767140U7k3.LIZIZ;
            } else {
                str2 = null;
            }
            c474500IjALIZ3.LJJII(str2, "resource_id");
            C767140U7k c767140U7k4 = C767120U7i.LIZJ;
            if (c767140U7k4 != null) {
                str3 = c767140U7k4.LIZ;
            } else {
                str3 = null;
            }
            c474500IjALIZ3.LJJII(str3, "filter_id");
            c474500IjALIZ3.LIZ();
        }
        C767120U7i.LJIIIZ();
        C767120U7i.LIZ("LiveBeautyFilterDialogFragmentOpt#onDismiss");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        C946060aj6 c946060aj6LIZ;
        C946050aj5 c946050aj5LIZIZ;
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (c946060aj6LIZ = C0URX.LIZ(dataChannel, EnhanceChannel.class)) != null && (c946050aj5LIZIZ = c946060aj6LIZ.LIZIZ()) != null) {
            c946050aj5LIZIZ.LJFF(0);
        }
        this.LLILZ = C158B.LIZ();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, OnFilterSelectedByClickEvent.class, new AwS591S0100000_12(this, 93));
            dataChannel2.BQ2(this, AIBeautyInterceptEvent.class, new AwS591S0100000_12(this, 94));
        }
        this.LLILLL = (FrameLayout) view.findViewById(R.id.fy5);
        C0U5V c0u5v = this.LLILLJJLI;
        if (c0u5v != null && (view2 = c0u5v.getView()) != null && view2.getParent() == null) {
            ((ViewGroup) view.findViewById(R.id.gvn)).addView(view2);
        } else {
            dismiss();
        }
        this.LLILZLL = new GestureDetector(getContext(), new C21648719nx() { // from class: X.0U7n
            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                LiveEnhanceDialogFragment liveEnhanceDialogFragment = this.LL;
                liveEnhanceDialogFragment.LLJI = false;
                C767200U7q.LIZ.LIZ(liveEnhanceDialogFragment.dataChannel, true);
                C767200U7q.LJIILJJIL = true;
                C20441214yg.LJIIIZ("LiveBeautyFilterDialogFragmentOpt", "onDown");
                return true;
            }

            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                Boolean boolValueOf;
                LiveEnhanceDialogFragment liveEnhanceDialogFragment = this.LL;
                liveEnhanceDialogFragment.LLJI = false;
                if (liveEnhanceDialogFragment.MR("")) {
                    return true;
                }
                C0U5V c0u5v2 = this.LL.LLILLJJLI;
                if (c0u5v2 != null) {
                    boolValueOf = Boolean.valueOf(c0u5v2.LIZJ());
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJJI(boolValueOf)) {
                    C20441214yg.LJIIIZ("LiveBeautyFilterDialogFragmentOpt", "onSingleTapUp, ignoreDismiss = true");
                    return true;
                }
                this.LL.dismiss();
                C20441214yg.LJIIIZ("LiveBeautyFilterDialogFragmentOpt", "onSingleTapUp, dismiss");
                return true;
            }

            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                boolean z;
                if (motionEvent2 == null || motionEvent == null) {
                    return false;
                }
                this.LL.LLJI = false;
                if (Math.abs(motionEvent.getRawX() - motionEvent2.getRawX()) > Math.abs(motionEvent.getRawY() - motionEvent2.getRawY())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C20441214yg.LJIIIZ("LiveBeautyFilterDialogFragmentOpt", "onFling, isScrollX = true");
                    C767200U7q.LIZ.LJ(null);
                    return true;
                }
                C20441214yg.LJIIIZ("LiveBeautyFilterDialogFragmentOpt", "onFling, isScrollX = false");
                return false;
            }

            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                float fAbs;
                boolean z;
                if (motionEvent2 == null || motionEvent == null) {
                    return false;
                }
                this.LL.LLJI = true;
                float rawX = motionEvent.getRawX();
                C767200U7q c767200U7q = C767200U7q.LIZ;
                if (C767200U7q.LJ) {
                    if (motionEvent2.getRawX() - rawX > 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C767200U7q.LJFF = z;
                    c767200U7q.LIZ(this.LL.dataChannel, false);
                    c767200U7q.LJIIJ();
                }
                if (C767200U7q.LJFF) {
                    fAbs = Math.abs(Math.max(motionEvent2.getRawX() - motionEvent.getRawX(), 0.0f) / this.LL.LLIZ);
                } else {
                    fAbs = 1 - Math.abs(Math.min(motionEvent2.getRawX() - motionEvent.getRawX(), 0.0f) / this.LL.LLIZ);
                }
                c767200U7q.LIZJ(fAbs);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onScroll, ratio = ");
                sbLIZ.append(fAbs);
                C20441214yg.LJIIIZ("LiveBeautyFilterDialogFragmentOpt", C2188811AlT.LIZIZ(sbLIZ));
                return true;
            }
        });
        FrameLayout frameLayout = this.LLILLL;
        if (frameLayout != null) {
            frameLayout.setOnTouchListener(new ATListenerS446S0100000_12(this, 23));
        }
        C0U5V c0u5v2 = this.LLILLJJLI;
        if (c0u5v2 != null) {
            c0u5v2.LIZLLL(this);
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(this, BroadcastBgClearMemory.class, new AwS591S0100000_12(this, 95));
        }
    }

    public final void NR(String str, String str2, String str3) {
        C0U7R c0u7r = C0U7R.LIZ;
        DataChannel dataChannel = this.dataChannel;
        String str4 = ((LiveSmallItemBeautyViewModel) C0U61.LIZ(new C0U76()).get(LiveSmallItemBeautyViewModel.class)).LLJIJIL;
        int iDQ2 = ((LiveSmallItemBeautyViewModel) C0U61.LIZ(new C0U76()).get(LiveSmallItemBeautyViewModel.class)).DQ2();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_optimize_wait_popup");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str2, "action_type");
        c474500IjALIZ.LJJIIZ(str3, "click_position", new AwS88S1000000_3(str3, 6));
        c474500IjALIZ.LJJII(str, "enter_method");
        c474500IjALIZ.LJJII(str4, "task_id");
        c474500IjALIZ.LJJII(Integer.valueOf(iDQ2), "task_round");
        c474500IjALIZ.LIZ();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = getView();
        if (view2 != null) {
            int height = view2.getHeight();
            View viewFindViewById = this.LL;
            if (viewFindViewById == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById = view3.findViewById(R.id.fy5);
                } else {
                    viewFindViewById = null;
                }
                this.LL = (FrameLayout) viewFindViewById;
            }
            int height2 = height - viewFindViewById.getHeight();
            if (this.LLJ != height2) {
                this.LLJ = height2;
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.zW(LiveDialogStatusChannel.class, new C770910ULx(true, height2, hashCode(), EnumC761940Tui.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
                }
            }
        }
    }
}
