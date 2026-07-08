package com.bytedance.android.live.effect.livegoal;

import X.C01GW;
import X.C0IPN;
import X.C0UA1;
import X.C0UFI;
import X.C0UFJ;
import X.C0UFN;
import X.C0UFO;
import X.C0UFP;
import X.C0UFR;
import X.C0UFW;
import X.C0UFX;
import X.C1119920fFW;
import X.C1143920fsE;
import X.C1161920gLG;
import X.C1324720kZq;
import X.C13LE;
import X.C13LP;
import X.C162100jj;
import X.C1697810uHb;
import X.C19748512Ol;
import X.C20441214yg;
import X.C20743416Fc;
import X.C21657019pI;
import X.C452501pT;
import X.C486790J7d;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C766290U4d;
import X.C769080UEw;
import X.C770220UJg;
import X.C784440Upu;
import X.C786410Ut5;
import X.InterfaceC772190UQv;
import Y.ACListenerS147S0100000_12;
import Y.AObjectS355S0100000_12;
import Y.ARunnableS112S0100000_12;
import Y.ATListenerS446S0100000_12;
import Y.AfS148S0200000_12;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.GreenScreenLiveGoalBlockGlobalChannel;
import com.bytedance.android.live.effect.api.LiveGoalDialogShow;
import com.bytedance.android.live.effect.api.LiveGoalEffectChannel;
import com.bytedance.android.live.effect.api.LiveGoalHighLightEvent;
import com.bytedance.android.live.effect.livegoal.LiveGoalBackgroundDialogFragment;
import com.bytedance.android.live.effect.model.LastPosition;
import com.bytedance.android.live.effect.model.LiveGoalInfo;
import com.bytedance.android.live.effect.model.VideoSize;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveGoalDialogShowChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamGoalEditWebLinkSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.n;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveGoalBackgroundDialogFragment extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4ZyM6PiHELIOSArJi4/ZgklPyoUJyQgCy4wIyI+Jjo9LAElKCM8LwM+KCg+LSs4";
    public ConstraintLayout LL;
    public C0UFN LLILLJJLI;
    public C0UFN LLILLL;
    public C0UFN LLILZ;
    public C0UFN LLILZIL;
    public LiveIconView LLILZLL;
    public ConstraintLayout LLIZ;
    public C1324720kZq LLIZLLLIL;
    public JSONObject LLJ;
    public boolean LLJIJIL;
    public String LLJILJIL;
    public C20743416Fc LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public View LLJJJIL;
    public View LLJJJJ;
    public String LLJJJJJIL;
    public List<C0UFN> LLJJJJLIIL;
    public VideoSize LLJJL;
    public boolean LLJL;
    public List<? extends LiveEffect> LLJI = new ArrayList();
    public String LLJILJILJ = "";
    public final AnimatorSet LLJILLL = new AnimatorSet();
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 51));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 50));
    public final C1143920fsE LLJJLIIIJLLLLLLLZ = new C1143920fsE();
    public final C0UFO LLJLIL = new C0UFO(this);
    public final C0UFP LLJLILLLLZIIL = new C0UFW() { // from class: X.0UFP
        /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
        @Override // X.C0UFW
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZ(X.C0UFR r7) {
            /*
                Method dump skipped, instruction units count: 239
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C0UFP.LIZ(X.0UFR):void");
        }

        @Override // X.C0UFW
        public final void LIZIZ(C0UFN c0ufn) {
            LiveGoalBackgroundDialogFragment liveGoalBackgroundDialogFragment = this.LIZ;
            if (c0ufn == null) {
                liveGoalBackgroundDialogFragment.getClass();
                return;
            }
            List<C0UFN> list = liveGoalBackgroundDialogFragment.LLJJJJLIIL;
            if (list == null) {
                return;
            }
            for (C0UFN c0ufn2 : list) {
                if (c0ufn.getType() == c0ufn2.getType()) {
                    c0ufn2.getItemViewFromXml().setBackgroundResource(R.drawable.f1b);
                } else {
                    c0ufn2.getItemViewFromXml().setBackgroundResource(R.drawable.f1c);
                }
            }
        }
    };
    public final ATListenerS446S0100000_12 LLJLL = new ATListenerS446S0100000_12(this, 4);
    public final AObjectS355S0100000_12 LLJLLIL = new AObjectS355S0100000_12(this, 0);

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final void MR() {
        this.LLJLIL.LIZ = false;
        this.LLJJLIIIJLLLLLLLZ.LIZ();
        C1324720kZq c1324720kZqPR = PR();
        if (c1324720kZqPR != null) {
            C500260Jjc.LJIILIIL(c1324720kZqPR);
        }
        View view = this.LLJJIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLJJJ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        ConstraintLayout constraintLayoutSR = SR();
        if (constraintLayoutSR != null) {
            constraintLayoutSR.setOnTouchListener(this.LLJLL);
        }
    }

    public final C0UFN NR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.io3) : null;
            this.LLILLL = (C0UFN) viewFindViewById;
        }
        return (C0UFN) viewFindViewById;
    }

    public final C0UFN OR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.jrh) : null;
            this.LLILZ = (C0UFN) viewFindViewById;
        }
        return (C0UFN) viewFindViewById;
    }

    public final C1324720kZq PR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.myq) : null;
            this.LLIZLLLIL = (C1324720kZq) viewFindViewById;
        }
        return (C1324720kZq) viewFindViewById;
    }

    public final C0UFN RR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.pb5) : null;
            this.LLILLJJLI = (C0UFN) viewFindViewById;
        }
        return (C0UFN) viewFindViewById;
    }

    public final ConstraintLayout SR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tsc) : null;
            this.LL = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final C0UFN UR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.vertical_item) : null;
            this.LLILZIL = (C0UFN) viewFindViewById;
        }
        return (C0UFN) viewFindViewById;
    }

    public final void VR() {
        LiveEffect liveEffect;
        LiveEffect next;
        LiveEffect next2;
        LiveEffect next3;
        LiveEffect.LiveGoalExtra liveGoalExtra;
        LiveEffect.LiveGoalExtra liveGoalExtra2;
        LiveEffect.LiveGoalExtra liveGoalExtra3;
        if (this.LLJI.size() >= 4) {
            RR().setLiveEffect((LiveEffect) ListProtector.get(this.LLJI, 0));
            NR().setLiveEffect((LiveEffect) ListProtector.get(this.LLJI, 1));
            OR().setLiveEffect((LiveEffect) ListProtector.get(this.LLJI, 2));
            UR().setLiveEffect((LiveEffect) ListProtector.get(this.LLJI, 3));
        }
        C0UFN c0ufnRR = RR();
        Iterator<? extends LiveEffect> it2 = this.LLJI.iterator();
        while (true) {
            liveEffect = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (next.LJJIJIIJI()) {
                    break;
                }
            }
        }
        c0ufnRR.setLiveEffect(next);
        C0UFN c0ufnNR = NR();
        Iterator<? extends LiveEffect> it3 = this.LLJI.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL = next2.LJLJLLL();
            if (stickerSDKExtraLJLJLLL != null && (liveGoalExtra3 = stickerSDKExtraLJLJLLL.liveGoalExtra) != null && liveGoalExtra3.isFullScreen()) {
                break;
            }
        }
        c0ufnNR.setLiveEffect(next2);
        C0UFN c0ufnOR = OR();
        Iterator<? extends LiveEffect> it4 = this.LLJI.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
            LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL2 = next3.LJLJLLL();
            if (stickerSDKExtraLJLJLLL2 != null && (liveGoalExtra2 = stickerSDKExtraLJLJLLL2.liveGoalExtra) != null && liveGoalExtra2.isHorizontal()) {
                break;
            }
        }
        c0ufnOR.setLiveEffect(next3);
        C0UFN c0ufnUR = UR();
        Iterator<? extends LiveEffect> it5 = this.LLJI.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            LiveEffect next4 = it5.next();
            LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL3 = next4.LJLJLLL();
            if (stickerSDKExtraLJLJLLL3 != null && (liveGoalExtra = stickerSDKExtraLJLJLLL3.liveGoalExtra) != null && liveGoalExtra.isVertical()) {
                liveEffect = next4;
                break;
            }
        }
        c0ufnUR.setLiveEffect(liveEffect);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g85);
        c500980Jkm.LIZJ = R.style.ajh;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJIILIIL = 3;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() throws Throwable {
        Object objLJJJLL;
        DataChannel dataChannel;
        C20743416Fc c20743416Fc;
        Window window;
        View decorView;
        CharSequence text;
        String strOptString;
        super.onStart();
        C766290U4d.LIZIZ(this);
        C0UFI c0ufi = C0UFI.LIZ;
        Integer numLIZIZ = InterfaceC772190UQv.X3.LIZIZ();
        if ((numLIZIZ == null || numLIZIZ.intValue() != 0) && (objLJJJLL = C13LP.LJJJLL(C0UA1.LIZ().qr("livebackground"))) != null && (dataChannel = C0UFI.LIZJ) != null) {
            dataChannel.SX0(C0UFX.class, objLJJJLL);
        }
        n nVarLIZIZ = InterfaceC772190UQv.V3.LIZIZ();
        String json = nVarLIZIZ.LJJIIZ("time") != null ? GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, nVarLIZIZ.LJJIIZ("time")) : new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format((Object) Long.MAX_VALUE);
        if ((nVarLIZIZ.LJJIIZ("last_position") != null ? C769080UEw.LIZIZ(nVarLIZIZ.LJJIIZ("last_position"), LastPosition.class) : null) == null) {
            new LastPosition(10000, 10000);
        }
        String strLJII = C0UFI.LJII();
        String str = "";
        if (strLJII == null) {
            strLJII = "";
        }
        JSONObject jSONObject = this.LLJ;
        Long lValueOf = jSONObject != null ? Long.valueOf(jSONObject.optLong("goal_num")) : null;
        JSONObject jSONObject2 = this.LLJ;
        Long lValueOf2 = jSONObject2 != null ? Long.valueOf(jSONObject2.optLong("cur_num")) : null;
        JSONObject jSONObject3 = this.LLJ;
        if (jSONObject3 != null && (strOptString = jSONObject3.optString("goal_str")) != null) {
            str = strOptString;
        }
        LastPosition lastPosition = new LastPosition(10000, 10000);
        VideoSize videoSize = this.LLJJL;
        int length = 0;
        LiveGoalInfo liveGoalInfo = new LiveGoalInfo(strLJII, lValueOf, lValueOf2, str, json, 0.38f, null, null, null, null, lastPosition, ((videoSize == null || !videoSize.isFullScreen) ? 0 : 1) ^ 1, InterfaceC772190UQv.Y3.LIZIZ().intValue(), 0, 1, null, null);
        C0UFN c0ufnRR = RR();
        if (c0ufnRR != null) {
            c0ufnRR.setLiveGoalInfo(liveGoalInfo);
        }
        C0UFN c0ufnNR = NR();
        if (c0ufnNR != null) {
            c0ufnNR.setLiveGoalInfo(liveGoalInfo);
        }
        C0UFN c0ufnOR = OR();
        if (c0ufnOR != null) {
            c0ufnOR.setLiveGoalInfo(liveGoalInfo);
        }
        C0UFN c0ufnUR = UR();
        if (c0ufnUR != null) {
            c0ufnUR.setLiveGoalInfo(liveGoalInfo);
        }
        C20743416Fc c20743416Fc2 = this.LLJJIII;
        if (c20743416Fc2 != null && (text = c20743416Fc2.getText()) != null) {
            length = text.length();
        }
        if (length < 26) {
            C1119920fFW.LJFF(this.LLJJIII, 3, OppoPermissionPopupMaskDelayExp.DEFAULT);
        } else {
            C1119920fFW.LJFF(this.LLJJIII, 8, OppoPermissionPopupMaskDelayExp.DEFAULT);
            if (length > 34 && (c20743416Fc = this.LLJJIII) != null) {
                c20743416Fc.setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Context context = getContext();
        if (context != null) {
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, C500260Jjc.LJJIIZ(this.LLJILJILJ) ? this.LLJILJILJ : C500260Jjc.LJJIJLIJ() ? LiveStreamGoalEditWebLinkSetting.INSTANCE.getPreviewValue() : LiveStreamGoalEditWebLinkSetting.INSTANCE.getValue(), new AwS591S0100000_12(this, 44));
        }
        RR().setDataChannel(null);
        NR().setDataChannel(null);
        OR().setDataChannel(null);
        UR().setDataChannel(null);
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        LiveGoalInfo liveGoalInfo;
        Integer numLIZIZ;
        super.onResume();
        n nVar = C0UFI.LJ;
        if (nVar != null && (liveGoalInfo = (LiveGoalInfo) C769080UEw.LIZIZ(nVar, LiveGoalInfo.class)) != null && ((numLIZIZ = InterfaceC772190UQv.X3.LIZIZ()) == null || numLIZIZ.intValue() != 0)) {
            C486790J7d.LIZLLL(new ARunnableS112S0100000_12(liveGoalInfo, 26), null, 500L);
        }
        C0UFJ c0ufj = C0UFJ.LIZ;
        C0UFJ.LIZ(this.dataChannel, "livesdk_stream_goal_background_panel_show").LIZ();
    }

    public final void WR(boolean z) {
        String str;
        if (z) {
            View view = this.LLJJIJIL;
            if (view != null && view.getVisibility() == 0) {
                return;
            }
            View view2 = this.LLJJJ;
            if (view2 != null && view2.getVisibility() == 0) {
                return;
            }
            View view3 = this.LLJJIJIL;
            if (view3 != null) {
                C786410Ut5.T4(view3, 1.0f);
            }
            View view4 = this.LLJJJ;
            if (view4 != null) {
                C786410Ut5.T4(view4, 1.0f);
            }
            View view5 = this.LLJJIJIL;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(0, view5);
            }
            View view6 = this.LLJJJ;
            if (view6 != null) {
                C786410Ut5.LJLLLLLL(0, view6);
            }
            str = "VISIBLE";
        } else {
            View view7 = this.LLJJIJIL;
            if (view7 != null) {
                C786410Ut5.T4(view7, 0.0f);
            }
            View view8 = this.LLJJJ;
            if (view8 != null) {
                C786410Ut5.T4(view8, 0.0f);
            }
            View view9 = this.LLJJJIL;
            if (view9 != null) {
                C786410Ut5.LJLLLLLL(4, view9);
            }
            View view10 = this.LLJJJJ;
            if (view10 != null) {
                C786410Ut5.LJLLLLLL(4, view10);
            }
            View view11 = this.LLJJIJIL;
            if (view11 != null) {
                C786410Ut5.LJLLLLLL(4, view11);
            }
            View view12 = this.LLJJJ;
            if (view12 != null) {
                C786410Ut5.LJLLLLLL(4, view12);
            }
            str = "INVISIBLE";
        }
        C20441214yg.LIZIZ("LiveGoalEffect", str);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String strOptString;
        super.onCreate(bundle);
        C0UFI c0ufi = C0UFI.LIZ;
        JSONObject jSONObject = this.LLJ;
        if (jSONObject != null) {
            strOptString = jSONObject.optString("icon_url");
        } else {
            strOptString = null;
        }
        C0UFI.LJ(strOptString, this.LLJJJJJIL, this.LLJLLIL);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(LiveGoalDialogShow.class, Boolean.FALSE);
        }
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LJ(C13LE.LIZ(LiveGoalDialogShowChannel.class));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<? extends LiveEffect> list;
        Integer numValueOf;
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (list = (List) dataChannel.gg0(LiveGoalEffectChannel.class)) == null) {
            list = this.LLJI;
        }
        this.LLJI = list;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.LC0(LiveGoalDialogShow.class, Boolean.TRUE);
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.EQ2(this, LiveGoalEffectChannel.class, new AwS591S0100000_12(this, 80));
            dataChannel3.BQ2(this, LiveGoalHighLightEvent.class, new AwS591S0100000_12(this, 81));
        }
        Room roomLIZ = C162100jj.LIZ(this.dataChannel);
        if (roomLIZ != null) {
            long id = roomLIZ.getId();
            IUserManageService iUserManageService = (IUserManageService) C1161920gLG.LIZJ(IUserManageService.class);
            getContext();
            iUserManageService.w60(id, this.dataChannel, 8, false, null);
        }
        DataChannelGlobal.LLILZ.EQ2(this, this, GreenScreenLiveGoalBlockGlobalChannel.class, new AwS591S0100000_12(this, 82));
        C784440Upu.LIZ().LIZJ(this, C21657019pI.class).LIZJ(new AfS148S0200000_12(this, view, 19));
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LIZLLL(C13LE.LIZ(LiveGoalDialogShowChannel.class));
        this.LLJJJJLIIL = C1697810uHb.LJIIJJI(RR(), NR(), OR(), UR());
        this.LLJJIII = (C20743416Fc) view.findViewById(R.id.fti);
        this.LLJJIJI = view.findViewById(R.id.iuq);
        View viewFindViewById = view.findViewById(R.id.y_r);
        this.LLJJIJIIJIL = viewFindViewById;
        C500260Jjc.LJLJL(C497740JfY.LJIJ(), viewFindViewById);
        this.LLJJIJIL = view.findViewById(R.id.yc5);
        this.LLJJJ = view.findViewById(R.id.cfj);
        View view2 = this.LLJJIJIL;
        if (view2 != null) {
            C786410Ut5.T4(view2, 0.0f);
        }
        View view3 = this.LLJJJ;
        if (view3 != null) {
            C786410Ut5.T4(view3, 0.0f);
        }
        this.LLJJJIL = view.findViewById(R.id.yaj);
        this.LLJJJJ = view.findViewById(R.id.cdv);
        C0UFN c0ufnRR = RR();
        if (c0ufnRR != null) {
            c0ufnRR.LIZIZ(C0IPN.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1"), "ttlive_live_goal_none.png");
            c0ufnRR.setText(2131842912);
            c0ufnRR.setPosition(0);
            c0ufnRR.setDataChannel(this.dataChannel);
            c0ufnRR.setListener(this.LLJLIL);
            c0ufnRR.setClickListener(this.LLJLILLLLZIIL);
        }
        C0UFN c0ufnNR = NR();
        if (c0ufnNR != null) {
            c0ufnNR.LIZIZ(C0IPN.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1"), "ttlive_live_goal_full_screen.png");
            c0ufnNR.setText(2131842910);
            c0ufnNR.setPosition(1);
            c0ufnNR.setDataChannel(this.dataChannel);
            c0ufnNR.setListener(this.LLJLIL);
            c0ufnNR.setClickListener(this.LLJLILLLLZIIL);
        }
        C0UFN c0ufnOR = OR();
        if (c0ufnOR != null) {
            c0ufnOR.LIZIZ(C0IPN.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1"), "ttlive_live_goal_horizontal.png");
            c0ufnOR.setText(2131842911);
            c0ufnOR.setPosition(2);
            c0ufnOR.setDataChannel(this.dataChannel);
            c0ufnOR.setListener(this.LLJLIL);
            c0ufnOR.setClickListener(this.LLJLILLLLZIIL);
        }
        C0UFN c0ufnUR = UR();
        if (c0ufnUR != null) {
            c0ufnUR.LIZIZ(C0IPN.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1"), "ttlive_live_goal_vertical.png");
            c0ufnUR.setText(2131842913);
            c0ufnUR.setPosition(3);
            c0ufnUR.setDataChannel(this.dataChannel);
            c0ufnUR.setListener(this.LLJLIL);
            c0ufnUR.setClickListener(this.LLJLILLLLZIIL);
        }
        VR();
        Integer numLIZIZ = InterfaceC772190UQv.X3.LIZIZ();
        C0UFI c0ufi = C0UFI.LIZ;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C0UFI.LJI.qr("livegame"));
        if (arrayList.size() > 0) {
            numLIZIZ = 0;
        }
        List<C0UFN> list2 = this.LLJJJJLIIL;
        View viewFindViewById2 = null;
        if (list2 != null) {
            Iterator<C0UFN> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C0UFN next = it2.next();
                C0UFR type = next.getType();
                if (type != null) {
                    numValueOf = Integer.valueOf(type.getValue());
                } else {
                    numValueOf = null;
                }
                if (Intrinsics.LJFF(numLIZIZ, numValueOf) && !this.LLJL) {
                    next.getItemViewFromXml().setBackgroundResource(R.drawable.f1b);
                    break;
                }
            }
        }
        View viewFindViewById3 = this.LLILZLL;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.bn2);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILZLL = (LiveIconView) viewFindViewById3;
        }
        LiveIconView liveIconView = (LiveIconView) viewFindViewById3;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS147S0100000_12(this, 48));
        }
        ConstraintLayout constraintLayoutSR = SR();
        if (constraintLayoutSR != null) {
            constraintLayoutSR.setOnTouchListener(this.LLJLL);
        }
        if (this.LLJIJIL) {
            View view5 = this.LLIZ;
            if (view5 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById2 = view6.findViewById(R.id.pcl);
                }
                this.LLIZ = (ConstraintLayout) viewFindViewById2;
                view5 = viewFindViewById2;
            }
            C786410Ut5.LL(8, (ConstraintLayout) view5);
        }
    }
}
