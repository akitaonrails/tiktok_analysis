package X;

import Y.ACListenerS146S0100000_11;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.cla.et.newet.ClickSeeOriginalEvent;
import com.ss.android.ugc.aweme.cla.et.newet.ClickSeeTranslationEvent;
import com.ss.android.ugc.aweme.cla.et.newet.SeeOriginalButtonShowEvent;
import com.ss.android.ugc.aweme.cla.et.newet.SeeTranslationButtonShowEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0SB7, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SB7 {
    public final C0SRL LIZ;
    public TuxTextView LIZIZ;
    public View LIZJ;
    public TuxTextView LIZLLL;
    public TuxIconView LJ;
    public final C0SBA LJFF;

    public C0SB7(C0SRL c0srl) {
        ViewGroup viewGroup;
        this.LIZ = c0srl;
        C0SBA c0sbaDk = c0srl.LJIIL.Dk();
        this.LJFF = c0sbaDk;
        LifecycleCoroutineScope lifecycleCoroutineScopeLJIILJJIL = c0srl.LJIILJJIL();
        View viewLIZIZ = C21146717pB.LIZIZ(c0srl.LIZLLL(), R.layout.ea7, null, false);
        ViewGroup viewGroup2 = c0srl.LJ;
        if (viewGroup2 != null && (viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.rlg)) != null) {
            viewGroup.addView(viewLIZIZ);
        }
        this.LIZIZ = (TuxTextView) viewLIZIZ.findViewById(R.id.dmc);
        this.LIZJ = viewLIZIZ.findViewById(R.id.yit);
        this.LIZLLL = (TuxTextView) viewLIZIZ.findViewById(R.id.yiv);
        this.LJ = (TuxIconView) viewLIZIZ.findViewById(R.id.yiu);
        if (C281410B1f.LIZ() && c0sbaDk != null && c0sbaDk.LIZ() != null) {
            lifecycleCoroutineScopeLJIILJJIL.launchWhenStarted(new C0HJ8(this, null));
            lifecycleCoroutineScopeLJIILJJIL.launchWhenStarted(new C707580RpE(this, null));
        } else {
            LIZLLL(null);
        }
    }

    public final void LIZIZ(boolean z) {
        Class cls;
        String str;
        String str2;
        Aweme aweme = this.LIZ.LIZJ;
        if (aweme == null) {
            return;
        }
        if (z) {
            cls = SeeTranslationButtonShowEvent.class;
        } else {
            cls = SeeOriginalButtonShowEvent.class;
        }
        C0SB9 c0sb9 = new C017D() { // from class: X.0SB9
            @Override // X.C017D
            public final List<InterfaceC1282004zy> LIZ(List<? extends Class<? extends InterfaceC0241006d>> list) {
                return C13BV.INSTANCE;
            }
        };
        AnonymousClass0175 anonymousClass0175 = new AnonymousClass0175();
        PostModeDetailParams postModeDetailParams = this.LIZ.LJII;
        if (postModeDetailParams == null || (str = postModeDetailParams.eventType) == null) {
            str = "";
        }
        int awemeType = aweme.getAwemeType();
        String aid = aweme.getAid();
        if (C746760TRa.LIZ().LJLILLLLZI()) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        C207069161b.LJ(cls, c0sb9, anonymousClass0175, Collections.singletonList(new C2737014d(str, awemeType, aid, null, null, 0, "graphic_detail", str2, null)), 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.Integer r4) {
        /*
            r3 = this;
            com.bytedance.tux.input.TuxTextView r2 = r3.LIZLLL
            if (r2 != 0) goto L5
            r2 = 0
        L5:
            if (r4 == 0) goto L1b
            int r1 = r4.intValue()
            X.0SRL r0 = r3.LIZ
            android.content.Context r0 = r0.LIZLLL()
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto L1b
        L17:
            r2.setText(r0)
            return
        L1b:
            java.lang.String r0 = ""
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SB7.LIZJ(java.lang.Integer):void");
    }

    public final void LIZLLL(C0S5P c0s5p) {
        C0SKK c0skk;
        int i;
        View view = null;
        if (!C161N.LIZIZ.LJLLJ(this.LIZ.LIZJ, C0SBD.FULL_PAGE, "")) {
            TuxTextView tuxTextView = this.LIZIZ;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            View view2 = this.LIZJ;
            if (view2 != null) {
                view = view2;
            }
            C786410Ut5.LJLLLLLL(8, view);
            return;
        }
        TuxTextView tuxTextView2 = this.LIZIZ;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 0);
        View view3 = this.LIZJ;
        if (view3 == null) {
            view3 = null;
        }
        C786410Ut5.LJLLLLLL(0, view3);
        if (c0s5p != null) {
            c0skk = c0s5p.LIZ;
        } else {
            c0skk = null;
        }
        TuxIconView tuxIconView = this.LJ;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        if (c0skk != null && (i = C0SB8.LIZ[c0skk.ordinal()]) != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new C1954807lC();
                        }
                    } else {
                        LIZJ(Integer.valueOf(R.string.suj));
                        LIZIZ(false);
                        View view4 = this.LIZJ;
                        if (view4 != null) {
                            view = view4;
                        }
                        C786410Ut5.I7(new ACListenerS146S0100000_11(this, 81), view);
                        return;
                    }
                } else {
                    LIZJ(2131850755);
                    View view5 = this.LIZJ;
                    if (view5 == null) {
                        view5 = null;
                    }
                    C786410Ut5.I7(null, view5);
                    return;
                }
            } else {
                LIZJ(2131847255);
                LIZIZ(true);
                View view6 = this.LIZJ;
                if (view6 != null) {
                    view = view6;
                }
                C786410Ut5.I7(new ACListenerS146S0100000_11(this, 79), view);
                return;
            }
        }
        LIZJ(null);
        View view7 = this.LIZJ;
        if (view7 == null) {
            view7 = null;
        }
        C786410Ut5.I7(null, view7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(final String str, final String str2, final boolean z) {
        final String str3;
        final int i;
        Class cls;
        C0S9P c0s9p;
        C05YD<C0S5R> c05ydLIZIZ;
        C721190SQr c721190SQr = C721190SQr.LIZ;
        C0SRL c0srl = this.LIZ;
        final Aweme aweme = c0srl.LIZJ;
        final Context contextLIZLLL = c0srl.LIZLLL();
        PostModeDetailParams postModeDetailParams = this.LIZ.LJII;
        final C0S5R value = null;
        if (postModeDetailParams != null) {
            str3 = postModeDetailParams.eventType;
        } else {
            str3 = null;
        }
        C0SBA c0sba = this.LJFF;
        if (c0sba != null && (c05ydLIZIZ = c0sba.LIZIZ()) != null) {
            value = c05ydLIZIZ.getValue();
        }
        PostModeFullPageViewModel postModeFullPageViewModel = this.LIZ.LJIIIZ;
        if (postModeFullPageViewModel != null && (c0s9p = (C0S9P) postModeFullPageViewModel.getState()) != null) {
            i = c0s9p.LL;
        } else {
            i = 0;
        }
        c721190SQr.getClass();
        if (aweme != null && contextLIZLLL != null) {
            if (z) {
                cls = ClickSeeTranslationEvent.class;
            } else {
                cls = ClickSeeOriginalEvent.class;
            }
            C207069161b.LJ(cls, new C017D() { // from class: X.0S5u
                /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00d7 A[PHI: r3
                  0x00d7: PHI (r3v2 boolean) = (r3v1 boolean), (r3v6 boolean) binds: [B:46:0x00d3, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // X.C017D
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.util.List<X.InterfaceC1282004zy> LIZ(java.util.List<? extends java.lang.Class<? extends X.InterfaceC0241006d>> r18) {
                    /*
                        Method dump skipped, instruction units count: 226
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C715760S5u.LIZ(java.util.List):java.util.List");
                }
            }, new AnonymousClass0175(), C13BV.INSTANCE, 16);
        }
    }
}
