package Y;

import X.C0MBV;
import X.C0MH8;
import X.C118300cf;
import X.C1428470nHB;
import X.C1441920ncs;
import X.C1452440ntq;
import X.C1455250nyN;
import X.C1455260nyO;
import X.C1456230nzx;
import X.C1457050o1H;
import X.C1457060o1I;
import X.C15O7;
import X.C1C7U;
import X.C259800zU;
import X.C348100Dkm;
import X.C352130DrH;
import X.C524780Ki4;
import X.InterfaceC1452170ntP;
import X.InterfaceC1457180o1U;
import X.InterfaceC1487280oo2;
import X.InterfaceC2385309Wh;
import Y.ARunnableS0S0720000_22;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS601S0100000_22;
import v7.o;

/* JADX INFO: loaded from: classes23.dex */
public class ARunnableS0S0720000_22 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public boolean z7;
    public boolean z8;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, Y.AkS483S0100000_22] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, Y.AkS483S0100000_22] */
    /* JADX WARN: Type inference failed for: r2v9, types: [T, Y.AkS328S0200000_22] */
    public final void LIZ$0() {
        final List listLIZIZ;
        InterfaceC1452170ntP interfaceC1452170ntPD;
        InterfaceC1452170ntP interfaceC1452170ntPD2;
        C524780Ki4.LIZ.step("av_video_publish", "compile_sticker_done");
        VideoPublishEditModel videoPublishEditModel = ((C1455260nyO) this.l0).LLLFZ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        if (C1428470nHB.LLIIIJ(videoPublishEditModel) || (interfaceC1452170ntPD2 = ((C1455260nyO) this.l0).d()) == null) {
            listLIZIZ = null;
        } else {
            VideoPublishEditModel videoPublishEditModel2 = ((C1455260nyO) this.l0).LLLFZ;
            if (videoPublishEditModel2 == null) {
                videoPublishEditModel2 = null;
            }
            listLIZIZ = C1441920ncs.LIZIZ(videoPublishEditModel2.getInfoStickerModel(), interfaceC1452170ntPD2);
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty((CharSequence) ((C259800zU) this.l1).element)) {
            C1455260nyO.LLZ((o) this.l4, (Runnable) this.l5, (C1455260nyO) this.l0, this.z7, this.z8, (Runnable) this.l6);
        } else {
            VideoPublishEditModel videoPublishEditModel3 = ((C1455260nyO) this.l0).LLLFZ;
            if (videoPublishEditModel3 == null) {
                videoPublishEditModel3 = null;
            }
            videoPublishEditModel3.setVideoCoverPath((String) ((C259800zU) this.l1).element);
            C259800zU c259800zU = new C259800zU();
            C1455260nyO c1455260nyO = (C1455260nyO) this.l0;
            c259800zU.element = new AkS483S0100000_22(c1455260nyO, 2);
            VideoPublishEditModel videoPublishEditModel4 = c1455260nyO.LLLFZ;
            if (videoPublishEditModel4 == null) {
                videoPublishEditModel4 = null;
            }
            if (videoPublishEditModel4.notUseCanvasSize()) {
                c259800zU.element = new AkS483S0100000_22((C1455260nyO) this.l0, 1);
            } else {
                c259800zU.element = new AkS328S0200000_22((InterfaceC1487280oo2) c259800zU.element, (C1455260nyO) this.l0, 1);
            }
            VideoPublishEditModel videoPublishEditModel5 = ((C1455260nyO) this.l0).LLLFZ;
            if (videoPublishEditModel5 == null) {
                videoPublishEditModel5 = null;
            }
            if (videoPublishEditModel5.isDuet() && (interfaceC1452170ntPD = ((C1455260nyO) this.l0).d()) != null) {
                VideoPublishEditModel videoPublishEditModel6 = ((C1455260nyO) this.l0).LLLFZ;
                if (videoPublishEditModel6 == null) {
                    videoPublishEditModel6 = null;
                }
                int videoCanvasWidth = videoPublishEditModel6.getVideoCanvasWidth();
                VideoPublishEditModel videoPublishEditModel7 = ((C1455260nyO) this.l0).LLLFZ;
                if (videoPublishEditModel7 == null) {
                    videoPublishEditModel7 = null;
                }
                interfaceC1452170ntPD.Vf(videoCanvasWidth, videoPublishEditModel7.getVideoCanvasHeight());
            }
            VideoPublishEditModel videoPublishEditModel8 = ((C1455260nyO) this.l0).LLLFZ;
            if (videoPublishEditModel8 == null) {
                videoPublishEditModel8 = null;
            }
            C1456230nzx c1456230nzx = new C1456230nzx(videoPublishEditModel8);
            InterfaceC1452170ntP interfaceC1452170ntPD3 = ((C1455260nyO) this.l0).d();
            C1457050o1H c1457050o1H = c1456230nzx.LIZ;
            c1457050o1H.LJIIIIZZ = interfaceC1452170ntPD3;
            c1457050o1H.LIZIZ = (String) ((C259800zU) this.l1).element;
            C0MH8 c0mh8 = C0MH8.LIZ;
            VideoPublishEditModel videoPublishEditModel9 = ((C1455260nyO) this.l0).LLLFZ;
            VideoPublishEditModel videoPublishEditModel10 = videoPublishEditModel9 != null ? videoPublishEditModel9 : null;
            c0mh8.getClass();
            int iLJIIIIZZ = C0MH8.LJIIIIZZ(videoPublishEditModel10);
            C1457050o1H c1457050o1H2 = c1456230nzx.LIZ;
            c1457050o1H2.LIZLLL = iLJIIIIZZ;
            c1457050o1H2.LJFF = ((C118300cf) this.l2).element;
            AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(c259800zU, (C259800zU<String>) 312);
            C1457050o1H c1457050o1H3 = c1456230nzx.LIZ;
            c1457050o1H3.LJIIIZ = awS601S0100000_22;
            final Runnable runnable = (Runnable) this.l3;
            final C1455260nyO c1455260nyO2 = (C1455260nyO) this.l0;
            final o oVar = (o) this.l4;
            c1457050o1H3.LJIIJ = new InterfaceC1457180o1U() { // from class: X.0nyt
                @Override // X.InterfaceC1457180o1U
                public final void onError(int i, String str) {
                    ARunnableS0S0720000_22.LIZIZ$1(c1455260nyO2, oVar, listLIZIZ);
                    C201955140j.LJ(str);
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            };
            final Runnable runnable2 = (Runnable) this.l5;
            final boolean z = this.z7;
            final boolean z2 = this.z8;
            final Runnable runnable3 = (Runnable) this.l6;
            c1457050o1H3.LIZJ = new C0MBV(jCurrentTimeMillis, oVar, c1455260nyO2, listLIZIZ, runnable2, z, z2, runnable3) { // from class: X.0nyk
                public final /* synthetic */ o<Unit> LIZ;
                public final /* synthetic */ C1455260nyO LIZIZ;
                public final /* synthetic */ List<String> LIZJ;
                public final /* synthetic */ Runnable LIZLLL;
                public final /* synthetic */ boolean LJ;
                public final /* synthetic */ boolean LJFF;
                public final /* synthetic */ Runnable LJI;

                {
                    this.LIZ = oVar;
                    this.LIZIZ = c1455260nyO2;
                    this.LIZJ = listLIZIZ;
                    this.LIZLLL = runnable2;
                    this.LJ = z;
                    this.LJFF = z2;
                    this.LJI = runnable3;
                }

                @Override // X.C0MBV
                public final void LIZLLL() {
                    o<Unit> oVar2 = this.LIZ;
                    C1455260nyO c1455260nyO3 = this.LIZIZ;
                    List<String> list = this.LIZJ;
                    Runnable runnable4 = this.LIZLLL;
                    boolean z3 = this.LJ;
                    boolean z4 = this.LJFF;
                    Runnable runnable5 = this.LJI;
                    ARunnableS0S0720000_22.LIZIZ$1(c1455260nyO3, oVar2, list);
                    if (C297620BlY.LIZ() && !C371410EhH.LIZ()) {
                        C571900Mbs.LIZ("cover task not in Main Thread");
                    }
                    if (oVar2.LIZ.LJIILJJIL()) {
                        return;
                    }
                    C1455260nyO.LLZ(oVar2, runnable4, c1455260nyO3, z3, z4, runnable5);
                }
            };
            C1457060o1I.LIZIZ(c1457050o1H3);
        }
        C15O7<Void> c15o7LJIIIIZZ = C15O7.LJIIIIZZ(Mp4ScreenVideoLoadTimeout.CONTROL);
        final o oVar2 = (o) this.l4;
        final Runnable runnable4 = (Runnable) this.l5;
        final C1455260nyO c1455260nyO3 = (C1455260nyO) this.l0;
        final boolean z3 = this.z7;
        final boolean z4 = this.z8;
        final Runnable runnable5 = (Runnable) this.l6;
        c15o7LJIIIIZZ.LJII(new InterfaceC2385309Wh() { // from class: X.0nyj
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("EditRootScene@37d3.getCoverOptimizedLogic$generateVideoCoverTask$1$6");
                if (!oVar2.LIZ.LJIILJJIL()) {
                    C571900Mbs.LIZ("cover task not completed");
                    C1455260nyO.LLZ(oVar2, runnable4, c1455260nyO3, z3, z4, runnable5);
                }
                C15O7 c15o7LJIIJ = C15O7.LJIIJ(null);
                C1C7U.LIZIZ("EditRootScene@37d3.getCoverOptimizedLogic$generateVideoCoverTask$1$6");
                return c15o7LJIIJ;
            }
        }, C15O7.LJIIIIZZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, Y.AkS483S0100000_22] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, Y.AkS483S0100000_22] */
    /* JADX WARN: Type inference failed for: r3v8, types: [T, Y.AkS328S0200000_22] */
    public final void LIZ$2() {
        InterfaceC1452170ntP interfaceC1452170ntPLLLLZLLIL;
        InterfaceC1452170ntP interfaceC1452170ntPLLLLZLLIL2;
        C524780Ki4.LIZ.step("av_video_publish", "compile_sticker_done");
        final List listLIZIZ = (C1428470nHB.LLIIIJ(((C1455250nyN) this.l0).getEditModel()) || (interfaceC1452170ntPLLLLZLLIL2 = ((C1455250nyN) this.l0).LLLLZLLIL()) == null) ? null : C1441920ncs.LIZIZ(((C1455250nyN) this.l0).getEditModel().getInfoStickerModel(), interfaceC1452170ntPLLLLZLLIL2);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty((CharSequence) ((C259800zU) this.l1).element)) {
            o oVar = (o) this.l4;
            Runnable runnable = (Runnable) this.l5;
            C1455250nyN c1455250nyN = (C1455250nyN) this.l0;
            boolean z = this.z7;
            boolean z2 = this.z8;
            Runnable runnable2 = (Runnable) this.l6;
            oVar.LIZJ(null);
            if (runnable != null) {
                runnable.run();
            } else {
                c1455250nyN.LLLZLL(z, z2, runnable2, false);
            }
        } else {
            ((C1455250nyN) this.l0).getEditModel().setVideoCoverPath((String) ((C259800zU) this.l1).element);
            C259800zU c259800zU = new C259800zU();
            C1455250nyN c1455250nyN2 = (C1455250nyN) this.l0;
            c259800zU.element = new AkS483S0100000_22(c1455250nyN2, 5);
            if (c1455250nyN2.getEditModel().notUseCanvasSize()) {
                c259800zU.element = new AkS483S0100000_22((C1455250nyN) this.l0, 4);
            } else {
                c259800zU.element = new AkS328S0200000_22((InterfaceC1487280oo2) c259800zU.element, (C1455250nyN) this.l0, 2);
            }
            if (((C1455250nyN) this.l0).getEditModel().isDuet() && (interfaceC1452170ntPLLLLZLLIL = ((C1455250nyN) this.l0).LLLLZLLIL()) != null) {
                interfaceC1452170ntPLLLLZLLIL.Vf(((C1455250nyN) this.l0).getEditModel().getVideoCanvasWidth(), ((C1455250nyN) this.l0).getEditModel().getVideoCanvasHeight());
            }
            C1456230nzx c1456230nzx = new C1456230nzx(((C1455250nyN) this.l0).getEditModel());
            InterfaceC1452170ntP interfaceC1452170ntPLLLLZLLIL3 = ((C1455250nyN) this.l0).LLLLZLLIL();
            C1457050o1H c1457050o1H = c1456230nzx.LIZ;
            c1457050o1H.LJIIIIZZ = interfaceC1452170ntPLLLLZLLIL3;
            c1457050o1H.LIZIZ = (String) ((C259800zU) this.l1).element;
            c1457050o1H.LJFF = ((C118300cf) this.l2).element;
            AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(c259800zU, (C259800zU<String>) 692);
            C1457050o1H c1457050o1H2 = c1456230nzx.LIZ;
            c1457050o1H2.LJIIIZ = awS601S0100000_22;
            final Runnable runnable3 = (Runnable) this.l3;
            final C1455250nyN c1455250nyN3 = (C1455250nyN) this.l0;
            final o oVar2 = (o) this.l4;
            c1457050o1H2.LJIIJ = new InterfaceC1457180o1U() { // from class: X.0nys
                @Override // X.InterfaceC1457180o1U
                public final void onError(int i, String str) {
                    ARunnableS0S0720000_22.LIZIZ$3(c1455250nyN3, oVar2, listLIZIZ);
                    C201955140j.LJ(str);
                    Runnable runnable4 = runnable3;
                    if (runnable4 != null) {
                        runnable4.run();
                    }
                }
            };
            final Runnable runnable4 = (Runnable) this.l5;
            final boolean z3 = this.z7;
            final boolean z4 = this.z8;
            final Runnable runnable5 = (Runnable) this.l6;
            c1457050o1H2.LIZJ = new C0MBV(jCurrentTimeMillis, oVar2, c1455250nyN3, listLIZIZ, runnable4, z3, z4, runnable5) { // from class: X.0nyi
                public final /* synthetic */ o<Unit> LIZ;
                public final /* synthetic */ C1455250nyN LIZIZ;
                public final /* synthetic */ List<String> LIZJ;
                public final /* synthetic */ Runnable LIZLLL;
                public final /* synthetic */ boolean LJ;
                public final /* synthetic */ boolean LJFF;
                public final /* synthetic */ Runnable LJI;

                {
                    this.LIZ = oVar2;
                    this.LIZIZ = c1455250nyN3;
                    this.LIZJ = listLIZIZ;
                    this.LIZLLL = runnable4;
                    this.LJ = z3;
                    this.LJFF = z4;
                    this.LJI = runnable5;
                }

                @Override // X.C0MBV
                public final void LIZLLL() {
                    o<Unit> oVar3 = this.LIZ;
                    C1455250nyN c1455250nyN4 = this.LIZIZ;
                    List<String> list = this.LIZJ;
                    Runnable runnable6 = this.LIZLLL;
                    boolean z5 = this.LJ;
                    boolean z6 = this.LJFF;
                    Runnable runnable7 = this.LJI;
                    ARunnableS0S0720000_22.LIZIZ$3(c1455250nyN4, oVar3, list);
                    if (C297620BlY.LIZ() && !C371410EhH.LIZ()) {
                        C571900Mbs.LIZ("cover task not in Main Thread");
                    }
                    if (oVar3.LIZ.LJIILJJIL()) {
                        return;
                    }
                    oVar3.LIZJ(null);
                    if (runnable6 != null) {
                        runnable6.run();
                    } else {
                        c1455250nyN4.LLLZLL(z5, z6, runnable7, false);
                    }
                }
            };
            C1457060o1I.LIZIZ(c1457050o1H2);
        }
        C15O7<Void> c15o7LJIIIIZZ = C15O7.LJIIIIZZ(Mp4ScreenVideoLoadTimeout.CONTROL);
        final o oVar3 = (o) this.l4;
        final Runnable runnable6 = (Runnable) this.l5;
        final C1455250nyN c1455250nyN4 = (C1455250nyN) this.l0;
        final boolean z5 = this.z7;
        final boolean z6 = this.z8;
        final Runnable runnable7 = (Runnable) this.l6;
        c15o7LJIIIIZZ.LJII(new InterfaceC2385309Wh() { // from class: X.0nyh
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("SocialEditRootScene@8880.getCoverOptimizedLogic$generateVideoCoverTask$1$6");
                if (!oVar3.LIZ.LJIILJJIL()) {
                    C571900Mbs.LIZ("cover task not completed");
                    o<Unit> oVar4 = oVar3;
                    Runnable runnable8 = runnable6;
                    C1455250nyN c1455250nyN5 = c1455250nyN4;
                    boolean z7 = z5;
                    boolean z8 = z6;
                    Runnable runnable9 = runnable7;
                    C1456670o0f c1456670o0f = C1455250nyN.LLLLLLLLLL;
                    oVar4.LIZJ(null);
                    if (runnable8 != null) {
                        runnable8.run();
                    } else {
                        c1455250nyN5.LLLZLL(z7, z8, runnable9, false);
                    }
                }
                C15O7 c15o7LJIIJ = C15O7.LJIIJ(null);
                C1C7U.LIZIZ("SocialEditRootScene@8880.getCoverOptimizedLogic$generateVideoCoverTask$1$6");
                return c15o7LJIIJ;
            }
        }, C15O7.LJIIIIZZ);
    }

    public static final void run$0(ARunnableS0S0720000_22 aRunnableS0S0720000_22) {
        boolean zLIZ;
        C1C7U.LIZ("EditRootScene@37d3.getCoverOptimizedLogic$generateVideoCoverTask$1");
        try {
            aRunnableS0S0720000_22.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditRootScene@37d3.getCoverOptimizedLogic$generateVideoCoverTask$1");
    }

    public static final void run$1(ARunnableS0S0720000_22 aRunnableS0S0720000_22) {
        boolean zLIZ;
        C1C7U.LIZ("SocialEditRootScene@8880.getCoverOptimizedLogic$generateVideoCoverTask$1");
        try {
            aRunnableS0S0720000_22.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SocialEditRootScene@8880.getCoverOptimizedLogic$generateVideoCoverTask$1");
    }

    public static final void LIZIZ$1(C1455260nyO c1455260nyO, o<Unit> oVar, List<String> list) {
        InterfaceC1452170ntP interfaceC1452170ntPD = c1455260nyO.d();
        if (interfaceC1452170ntPD != null && C1452440ntq.LIZ(interfaceC1452170ntPD)) {
            InterfaceC1452170ntP interfaceC1452170ntPD2 = c1455260nyO.d();
            if (interfaceC1452170ntPD2 != null && list != null) {
                for (String str : list) {
                    C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPD2);
                    if (c348100DkmLIZIZ != null) {
                        c348100DkmLIZIZ.LJIIIZ().LJIILJJIL(str);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                return;
            }
            return;
        }
        if (!oVar.LIZ.LJIILJJIL() && !oVar.LIZ.LJIILIIL()) {
            oVar.LIZJ(null);
        }
    }

    public static final void LIZIZ$3(C1455250nyN c1455250nyN, o<Unit> oVar, List<String> list) {
        InterfaceC1452170ntP interfaceC1452170ntPLLLLZLLIL = c1455250nyN.LLLLZLLIL();
        if (interfaceC1452170ntPLLLLZLLIL != null && C1452440ntq.LIZ(interfaceC1452170ntPLLLLZLLIL)) {
            InterfaceC1452170ntP interfaceC1452170ntPLLLLZLLIL2 = c1455250nyN.LLLLZLLIL();
            if (interfaceC1452170ntPLLLLZLLIL2 != null && list != null) {
                for (String str : list) {
                    C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLLLLZLLIL2);
                    if (c348100DkmLIZIZ != null) {
                        c348100DkmLIZIZ.LJIIIZ().LJIILJJIL(str);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                return;
            }
            return;
        }
        oVar.LIZJ(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS0S0720000_22(Object obj, C1455260nyO c1455260nyO, C259800zU<String> c259800zU, C118300cf c118300cf, Runnable runnable, o<Unit> oVar, Runnable runnable2, boolean z, boolean z2, Runnable runnable3) {
        this.$t = runnable3;
        this.l0 = obj;
        this.l1 = c1455260nyO;
        this.l2 = c259800zU;
        this.l3 = c118300cf;
        this.l4 = runnable;
        this.l5 = oVar;
        this.z7 = runnable2;
        this.z8 = z;
        this.l6 = z2;
    }
}
