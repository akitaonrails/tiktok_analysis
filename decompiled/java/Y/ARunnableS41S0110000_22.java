package Y;

import X.C0CHQ;
import X.C1398350mUb;
import X.C1424850nBL;
import X.C1424910nBR;
import X.C1425080nBi;
import X.C1425160nBq;
import X.C1428470nHB;
import X.C1430410nKJ;
import X.C1445870njF;
import X.C1453280nvC;
import X.C1455250nyN;
import X.C1455260nyO;
import X.C19471511Fx;
import X.C19510811Va;
import X.C1C7U;
import X.C201955140j;
import X.C2188811AlT;
import X.C297610BlX;
import X.C299160Bo2;
import X.C573960MfC;
import X.C786410Ut5;
import X.ExecutorC527170Klv;
import X.InterfaceC1425150nBp;
import X.InterfaceC573980MfE;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes23.dex */
public class ARunnableS41S0110000_22 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (this.z1) {
            InterfaceC573980MfE interfaceC573980MfELJIIJ = C0CHQ.LIZ().LJIIJ();
            VideoPublishEditModel videoPublishEditModel = ((C1455260nyO) this.l0).LLLFZ;
            VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel != null ? videoPublishEditModel : null;
            C573960MfC.LIZ(interfaceC573980MfELJIIJ, videoPublishEditModel2, videoPublishEditModel2.getCreationId(), 1, null, 24);
            return;
        }
        if (C297610BlX.LIZ()) {
            VideoPublishEditModel videoPublishEditModel3 = ((C1455260nyO) this.l0).LLLFZ;
            if (C1428470nHB.LJLILLLLZI(videoPublishEditModel3 != null ? videoPublishEditModel3 : null)) {
                return;
            }
        }
        C0CHQ.LIZ().LJIIJ().LJFF();
    }

    public final void LIZ$1() {
        if (this.z1) {
            C573960MfC.LIZ(C0CHQ.LIZ().LJIIJ(), ((C1455250nyN) this.l0).getEditModel(), ((C1455250nyN) this.l0).getEditModel().getCreationId(), 1, null, 24);
        } else {
            if (C297610BlX.LIZ() && C1428470nHB.LJLILLLLZI(((C1455250nyN) this.l0).getEditModel())) {
                return;
            }
            C0CHQ.LIZ().LJIIJ().LJFF();
        }
    }

    public final void LIZ$2() {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateListView#setTemplateList: shouldPlay = true, isLoadMore: ");
        sbLIZ.append(this.z1);
        sbLIZ.append(": playVideo");
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (this.z1) {
            ((C1424850nBL) this.l0).LJIILIIL();
        } else {
            ((C1424850nBL) this.l0).LJIJJLI(false);
            ((C1424850nBL) this.l0).LJIILJJIL(false);
        }
    }

    public final void LIZ$3() {
        C1425160nBq c1425160nBq;
        InterfaceC1425150nBp interfaceC1425150nBpP5;
        if (this.z1) {
            ((C1424850nBL) this.l0).LJIILIIL();
            return;
        }
        C1424850nBL c1424850nBL = (C1424850nBL) this.l0;
        C1425080nBi c1425080nBiLIZIZ = c1424850nBL.LIZIZ(c1424850nBL.LLJLILLLLZIIL);
        if (c1425080nBiLIZIZ != null && (!C299160Bo2.LIZ() ? !((c1425160nBq = c1425080nBiLIZIZ.LLJJIJIIJIL) == null || !c1425160nBq.isPlaying()) : !((interfaceC1425150nBpP5 = c1425080nBiLIZIZ.P5()) == null || !interfaceC1425150nBpP5.isPlaying()))) {
            ((C1424850nBL) this.l0).LJIJJLI(false);
        }
        ((C1424850nBL) this.l0).LJIILJJIL(false);
    }

    public static final void run$0(ARunnableS41S0110000_22 aRunnableS41S0110000_22) {
        boolean zLIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C1C7U.LIZ("MultiAnchorPublishSettingItem@e31a.initUI$10");
        try {
            LinearLayout linearLayout = ((C19471511Fx) aRunnableS41S0110000_22.l0).LLILZIL;
            ViewGroup.LayoutParams layoutParams = null;
            if (linearLayout != null) {
                layoutParams = linearLayout.getLayoutParams();
            }
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                int i = C19510811Va.LLL;
                marginLayoutParams.leftMargin = C1430410nKJ.LIZ(aRunnableS41S0110000_22.z1);
                LinearLayout linearLayout2 = ((C19471511Fx) aRunnableS41S0110000_22.l0).LLILZIL;
                if (linearLayout2 != null) {
                    C786410Ut5.d6(linearLayout2, marginLayoutParams);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiAnchorPublishSettingItem@e31a.initUI$10");
    }

    public static final void run$1(ARunnableS41S0110000_22 aRunnableS41S0110000_22) {
        boolean zLIZ;
        C1C7U.LIZ("UploadRecoverPopView@b166.setVisibility$1");
        try {
            if (aRunnableS41S0110000_22.z1) {
                C786410Ut5.LJLLLLLL(0, ((C1445870njF) aRunnableS41S0110000_22.l0).LLILZIL);
            } else {
                ((C1445870njF) aRunnableS41S0110000_22.l0).LJIILIIL(false, false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UploadRecoverPopView@b166.setVisibility$1");
    }

    public static final void run$10(ARunnableS41S0110000_22 aRunnableS41S0110000_22) {
        boolean zLIZ;
        C1C7U.LIZ("TemplateListView@b16d.setTemplateList$3");
        try {
            aRunnableS41S0110000_22.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TemplateListView@b16d.setTemplateList$3");
    }

    public static final void run$11(ARunnableS41S0110000_22 aRunnableS41S0110000_22) {
        boolean zLIZ;
        C1C7U.LIZ("TemplateListView@b16d.startPlayTemplate$1");
        try {
            aRunnableS41S0110000_22.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TemplateListView@b16d.startPlayTemplate$1");
    }

    public static final void run$2(ARunnableS41S0110000_22 aRunnableS41S0110000_22) {
        boolean zLIZ;
        C1C7U.LIZ("EditRootScene@37d3.handleTextModeCheckPoint$1$1$2");
        try {
            aRunnableS41S0110000_22.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditRootScene@37d3.handleTextModeCheckPoint$1$1$2");
    }

    public static final void run$3(ARunnableS41S0110000_22 aRunnableS41S0110000_22) {
        boolean zLIZ;
        C1C7U.LIZ("EditRootScene@37d3.handleTextModeCheckPoint$1$1");
        try {
            C1455260nyO c1455260nyO = (C1455260nyO) aRunnableS41S0110000_22.l0;
            c1455260nyO.LLLZZIL(c1455260nyO.LLLI, c1455260nyO.LLLII, new Runnable() { // from class: X.0nfO
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("EditRootScene@37d3.handleTextModeCheckPoint$1$1$1");
                    C1C7U.LIZIZ("EditRootScene@37d3.handleTextModeCheckPoint$1$1$1");
                }
            }, new ARunnableS41S0110000_22(c1455260nyO, aRunnableS41S0110000_22.z1, 2), false, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditRootScene@37d3.handleTextModeCheckPoint$1$1");
    }

    public static final void run$4(ARunnableS41S0110000_22 aRunnableS41S0110000_22) {
        boolean zLIZ;
        C1C7U.LIZ("EditRootScene@37d3.handleTextModeCheckPoint$1");
        try {
            ExecutorC527170Klv.LLILLJJLI.execute(new ARunnableS41S0110000_22((C1455260nyO) aRunnableS41S0110000_22.l0, aRunnableS41S0110000_22.z1, 3));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditRootScene@37d3.handleTextModeCheckPoint$1");
    }

    public static final void run$5(ARunnableS41S0110000_22 aRunnableS41S0110000_22) {
        boolean zLIZ;
        C1C7U.LIZ("ImageAdjustScene@250a.showOrHide$1");
        try {
            ((C1453280nvC) aRunnableS41S0110000_22.l0).LLLLIIIILLL(aRunnableS41S0110000_22.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageAdjustScene@250a.showOrHide$1");
    }

    public static final void run$6(ARunnableS41S0110000_22 aRunnableS41S0110000_22) {
        boolean zLIZ;
        C1C7U.LIZ("SocialEditRootScene@8880.handleTextModeCheckPoint$1$1$2");
        try {
            aRunnableS41S0110000_22.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SocialEditRootScene@8880.handleTextModeCheckPoint$1$1$2");
    }

    public static final void run$7(ARunnableS41S0110000_22 aRunnableS41S0110000_22) {
        boolean zLIZ;
        C1C7U.LIZ("SocialEditRootScene@8880.handleTextModeCheckPoint$1$1");
        try {
            C1455250nyN c1455250nyN = (C1455250nyN) aRunnableS41S0110000_22.l0;
            c1455250nyN.LLLLZIL(c1455250nyN.LLJL, c1455250nyN.LLJLIL, new Runnable() { // from class: X.0nfN
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("SocialEditRootScene@8880.handleTextModeCheckPoint$1$1$1");
                    C1C7U.LIZIZ("SocialEditRootScene@8880.handleTextModeCheckPoint$1$1$1");
                }
            }, new ARunnableS41S0110000_22(c1455250nyN, aRunnableS41S0110000_22.z1, 6), false, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SocialEditRootScene@8880.handleTextModeCheckPoint$1$1");
    }

    public static final void run$8(ARunnableS41S0110000_22 aRunnableS41S0110000_22) {
        boolean zLIZ;
        C1C7U.LIZ("SocialEditRootScene@8880.handleTextModeCheckPoint$1");
        try {
            ExecutorC527170Klv.LLILLJJLI.execute(new ARunnableS41S0110000_22((C1455250nyN) aRunnableS41S0110000_22.l0, aRunnableS41S0110000_22.z1, 7));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SocialEditRootScene@8880.handleTextModeCheckPoint$1");
    }

    public static final void run$9(ARunnableS41S0110000_22 aRunnableS41S0110000_22) {
        boolean zLIZ;
        C1C7U.LIZ("TemplateItemLoadingMoreViewHolder@69c2.startAnimate$1");
        try {
            if (aRunnableS41S0110000_22.z1) {
                ((C1424910nBR) aRunnableS41S0110000_22.l0).LL.LIZJ();
            } else {
                ((C1424910nBR) aRunnableS41S0110000_22.l0).LL.LIZLLL();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TemplateItemLoadingMoreViewHolder@69c2.startAnimate$1");
    }

    public ARunnableS41S0110000_22(C1424910nBR c1424910nBR, int i) {
        this.$t = i;
        this.z1 = true;
        this.l0 = c1424910nBR;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS41S0110000_22(X.C1455250nyN r2, boolean r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 6 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r2
            r0.z1 = r3
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.z1 = r3
            r0.l0 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS41S0110000_22.<init>(X.0nyN, boolean, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS41S0110000_22(X.C1455260nyO r2, boolean r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 2 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r2
            r0.z1 = r3
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.z1 = r3
            r0.l0 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS41S0110000_22.<init>(X.0nyO, boolean, int):void");
    }

    public ARunnableS41S0110000_22(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
