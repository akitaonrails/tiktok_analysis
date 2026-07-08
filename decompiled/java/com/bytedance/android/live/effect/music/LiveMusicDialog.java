package com.bytedance.android.live.effect.music;

import X.C036E;
import X.C09JN;
import X.C0U56;
import X.C0UBY;
import X.C0UBZ;
import X.C0URX;
import X.C11NZ;
import X.C11S5;
import X.C16FV;
import X.C1701940uOG;
import X.C20743416Fc;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C766290U4d;
import X.C768190UBl;
import X.C768200UBm;
import X.C770910ULx;
import X.C786410Ut5;
import X.C946050aj5;
import X.C946060aj6;
import X.EnumC761940Tui;
import X.InterfaceC1478005qU;
import X.InterfaceC768210UBn;
import X.RunnableC781530UlD;
import X.ViewOnClickListenerC1836610xtT;
import Y.ACListenerS147S0100000_12;
import Y.AfS181S0100000_12;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.music.LiveMusicDialog;
import com.bytedance.android.live.effect.music.entity.Accompaniment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.android.livesdk.model.MusicChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.text.a0;
import u4.q0;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveMusicDialog extends LiveDialogFragment implements InterfaceC768210UBn, View.OnLayoutChangeListener {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCHELIOSk1LSY4ZyImOywvZwM6PiABPDw6KwElKCM8Lw==";
    public LinearLayout LL;
    public View LLILLJJLI;
    public ViewOnClickListenerC1836610xtT LLILLL;
    public ImageView LLILZ;
    public RunnableC781530UlD LLILZIL;
    public C16FV LLILZLL;
    public C16FV LLIZ;
    public C20743416Fc LLIZLLLIL;
    public Long LLJ;
    public boolean LLJI;
    public long LLJIJIL;
    public C0UBY LLJILJIL;
    public final Drawable LLJILJILJ = C497740JfY.LJIIJ(R.drawable.epb);
    public final Drawable LLJILLL = C497740JfY.LJIIJ(R.drawable.epc);
    public final Drawable LLJJ = C497740JfY.LJIIJ(R.drawable.epd);
    public final Drawable LLJJI = C497740JfY.LJIIJ(R.drawable.ep_);
    public final Drawable LLJJIII = C497740JfY.LJIIJ(R.drawable.epa);
    public final Drawable LLJJIJI = C497740JfY.LJIIJ(R.drawable.epe);
    public final Drawable LLJJIJIIJIL = C497740JfY.LJIIJ(R.drawable.epf);
    public int LLJJIJIL;
    public String LLJJJ;
    public String LLJJJIL;

    @Override // X.InterfaceC768210UBn
    public final void Dq() {
        UR(false);
    }

    @Override // X.InterfaceC768210UBn
    public final void LLLLILI() {
        UR(true);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // X.InterfaceC768210UBn
    public final void onPlayerPause() {
        UR(false);
    }

    public final LinearLayout MR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.eu1) : null;
            this.LL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final ViewOnClickListenerC1836610xtT NR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ovs) : null;
            this.LLILLL = (ViewOnClickListenerC1836610xtT) viewFindViewById;
        }
        return (ViewOnClickListenerC1836610xtT) viewFindViewById;
    }

    public final C20743416Fc OR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ow6) : null;
            this.LLIZLLLIL = (C20743416Fc) viewFindViewById;
        }
        return (C20743416Fc) viewFindViewById;
    }

    public final C16FV PR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p8o) : null;
            this.LLILZLL = (C16FV) viewFindViewById;
        }
        return (C16FV) viewFindViewById;
    }

    public final ImageView RR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qna) : null;
            this.LLILZ = (ImageView) viewFindViewById;
        }
        return (ImageView) viewFindViewById;
    }

    public final C16FV SR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.volume_button) : null;
            this.LLIZ = (C16FV) viewFindViewById;
        }
        return (C16FV) viewFindViewById;
    }

    public final void VR() {
        final String str;
        Accompaniment accompaniment;
        Accompaniment accompaniment2;
        C0UBZ c0ubz = C0UBZ.LL;
        C768190UBl c768190UBl = C0UBZ.LLJJIJI;
        if (c768190UBl == null || (accompaniment2 = c768190UBl.accompaniment) == null || (str = accompaniment2.title) == null) {
            str = "";
        }
        C768190UBl c768190UBl2 = C0UBZ.LLJJIJI;
        final String str2 = (c768190UBl2 == null || (accompaniment = c768190UBl2.accompaniment) == null) ? null : accompaniment.author;
        C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0DYc
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<CharSequence> c09aj) {
                String strLIZIZ;
                Integer numValueOf;
                C1C7U.LIZ("LiveMusicDialog@ab7.updateMusicInfo$1");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (C1533950q1J.LJ(str2)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(" - ");
                    sbLIZ.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = str;
                }
                spannableStringBuilder.append((CharSequence) strLIZIZ);
                LiveMusicDialog liveMusicDialog = this;
                String str3 = str;
                liveMusicDialog.getClass();
                if (!TextUtils.isEmpty(strLIZIZ) && !TextUtils.isEmpty(str3) && str3 != null && (numValueOf = Integer.valueOf(a0.LJJJ(strLIZIZ, str3, 0, false, 6))) != null && numValueOf.intValue() != -1) {
                    C1119920fFW.LJIIIIZZ(spannableStringBuilder, numValueOf.intValue(), numValueOf.intValue() + str3.length(), 33, 400);
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C497740JfY.LJFF(R.color.f569bc)), numValueOf.intValue(), numValueOf.intValue() + str3.length(), 33);
                }
                c09aj.onNext(spannableStringBuilder);
                C1C7U.LIZIZ("LiveMusicDialog@ab7.updateMusicInfo$1");
            }
        }).LJL(C11S5.LIZIZ).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 43), new C09JN() { // from class: X.0DYd
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("LiveMusicDialog@ab7.updateMusicInfo$3");
                C1C7U.LIZIZ("LiveMusicDialog@ab7.updateMusicInfo$3");
            }
        });
    }

    @Override // X.InterfaceC768210UBn
    public final void bE() {
        C0UBY c0uby = this.LLJILJIL;
        if (c0uby == null) {
            c0uby = null;
        }
        if (c0uby.LLILZIL) {
            c0uby.LLILZIL = false;
            c0uby.notifyDataSetChanged();
        }
        RR().setClickable(true);
        VR();
        UR(true);
        Long l = this.LLJ;
        C0UBZ c0ubz = C0UBZ.LL;
        long j = C0UBZ.LLJJIII;
        if (l != null && l.longValue() == j && this.LLJI) {
            this.LLJI = false;
            this.LLJ = null;
            C0UBZ.LJII(false);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g9v);
        C766290U4d.LIZ(c500980Jkm);
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C946060aj6 c946060aj6LIZ;
        C946050aj5 c946050aj5LIZIZ;
        super.onDestroyView();
        MR().removeOnLayoutChangeListener(this);
        C0UBZ c0ubz = C0UBZ.LL;
        C0UBZ.LJFF().remove(this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(LiveDialogStatusChannel.class, new C770910ULx(false, 0, hashCode(), EnumC761940Tui.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (c946060aj6LIZ = C0URX.LIZ(dataChannel2, MusicChannel.class)) != null && (c946050aj5LIZIZ = c946060aj6LIZ.LIZIZ()) != null) {
            c946050aj5LIZIZ.LIZIZ(2);
        }
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C766290U4d.LIZIZ(this);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C0U56 getPanelType() {
        return C0U56.PANEL_MUSIC;
    }

    @Override // X.InterfaceC768210UBn
    public final void Mc(long j) {
        if (!C0UBZ.LLJJIJIL) {
            C0UBY c0uby = this.LLJILJIL;
            if (c0uby == null) {
                c0uby = null;
            }
            if (c0uby.LLILZ == j) {
                c0uby.LLILZIL = true;
                c0uby.notifyDataSetChanged();
            }
            OR().setText(C497740JfY.LJIJI(2131842669));
            RR().setClickable(false);
            UR(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void UR(boolean r7) {
        /*
            r6 = this;
            X.0UBZ r0 = X.C0UBZ.LL
            X.0UBl r0 = X.C0UBZ.LLJJIJI
            if (r0 == 0) goto L63
            r5 = 1
        L7:
            android.widget.ImageView r1 = r6.RR()
            if (r7 == 0) goto L60
            android.graphics.drawable.Drawable r0 = r6.LLJILJILJ
        Lf:
            r1.setImageDrawable(r0)
            android.widget.ImageView r1 = r6.RR()
            if (r7 == 0) goto L5d
            java.lang.String r0 = r6.LLJJJIL
        L1a:
            r1.setContentDescription(r0)
        L1d:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "hasData: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "LiveMusicDialog"
            X.C20441214yg.LIZIZ(r0, r1)
            X.16FV r1 = r6.PR()
            if (r5 == 0) goto L5a
            android.graphics.drawable.Drawable r0 = r6.LLJJI
        L3a:
            r1.setImageDrawable(r0)
            X.16FV r0 = r6.PR()
            r0.setClickable(r5)
            X.16FV r1 = r6.SR()
            if (r5 == 0) goto L57
            android.graphics.drawable.Drawable r0 = r6.LLJJIJI
        L4c:
            r1.setImageDrawable(r0)
            X.16FV r0 = r6.SR()
            r0.setClickable(r5)
            return
        L57:
            android.graphics.drawable.Drawable r0 = r6.LLJJIJIIJIL
            goto L4c
        L5a:
            android.graphics.drawable.Drawable r0 = r6.LLJJIII
            goto L3a
        L5d:
            java.lang.String r0 = r6.LLJJJ
            goto L1a
        L60:
            android.graphics.drawable.Drawable r0 = r6.LLJILLL
            goto Lf
        L63:
            r5 = 0
            long r3 = X.C0UBZ.LLJJIII
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L7
            android.widget.ImageView r1 = r6.RR()
            android.graphics.drawable.Drawable r0 = r6.LLJJ
            r1.setImageDrawable(r0)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.music.LiveMusicDialog.UR(boolean):void");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C946060aj6 c946060aj6;
        C946050aj5 c946050aj5LIZIZ;
        super.onCreate(bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (c946060aj6 = (C946060aj6) dataChannel.gg0(MusicChannel.class)) != null && (c946050aj5LIZIZ = c946060aj6.LIZIZ()) != null) {
            c946050aj5LIZIZ.LJFF(0);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        MR().addOnLayoutChangeListener(this);
        MR().getLayoutParams().height = Math.max((getResources().getDisplayMetrics().heightPixels * 34) / 100, (int) C497740JfY.LIZIZ(260.0f));
        MR().getBackground().setAlpha(255);
        View viewFindViewById = this.LLILLJJLI;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.pvv);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = viewFindViewById;
        }
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 50), viewFindViewById);
        View view3 = this.LLILZIL;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.osj);
            }
            this.LLILZIL = (RunnableC781530UlD) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        RecyclerView recyclerView = (RecyclerView) view3;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        C0UBY c0uby = new C0UBY(this.dataChannel, new AwS591S0100000_12(this, 827));
        this.LLJILJIL = c0uby;
        recyclerView.setAdapter(c0uby);
        recyclerView.addItemDecoration(new C768200UBm());
        recyclerView.setHasFixedSize(true);
        C0UBZ c0ubz = C0UBZ.LL;
        C0UBZ.LJFF().add(this);
        VR();
        C500260Jjc.LJLIIIL(500L, PR(), new AwS591S0100000_12(this, 824));
        C500260Jjc.LJLIIIL(500L, SR(), new AwS591S0100000_12(this, 825));
        C500260Jjc.LJLIIIL(500L, RR(), new AwS591S0100000_12(this, 826));
        UR(C0UBZ.LLJJIJIL);
        getContext();
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!C036E.LIZ.LIZIZ()) {
            NR().LJII();
        } else {
            NR().LJI();
            C0UBZ c0ubz2 = C0UBZ.LL;
            C0UBZ.LIZIZ(new AwS591S0100000_12(this, 823));
        }
        q0.LJIJI(MR().findViewById(R.id.title), true);
        this.LLJJJIL = view.getContext().getResources().getString(2131840897);
        this.LLJJJ = view.getContext().getResources().getString(2131840898);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.LLJJIJIL != MR().getHeight()) {
            int height = MR().getHeight();
            this.LLJJIJIL = height;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(LiveDialogStatusChannel.class, new C770910ULx(true, height, hashCode(), EnumC761940Tui.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
            }
        }
    }
}
