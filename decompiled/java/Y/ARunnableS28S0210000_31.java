package Y;

import X.C15DG;
import X.C15LD;
import X.C15LG;
import X.C15QB;
import X.C15X3;
import X.C15X4;
import X.C15X5;
import X.C1697810uHb;
import X.C1C7U;
import X.C20441214yg;
import X.C20483515Dd;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426160GnO;
import X.C786410Ut5;
import X.C814420VxA;
import X.C978500bZQ;
import X.TextureViewSurfaceTextureListenerC1288630jdd;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchLowEndOptimizationSettings;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoLinkItem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS397S0200000_31;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS28S0210000_31 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C426160GnO c426160GnO;
        C15X5 c15x5;
        C786410Ut5.LJJJJZ(((C15X3) this.l0).LLILLJJLI);
        int width = (((C15X3) this.l0).LLILLJJLI.getWidth() - ((C15X3) this.l0).LLILLJJLI.getPaddingStart()) - ((C15X3) this.l0).LLILLJJLI.getPaddingEnd();
        if (!this.z2) {
            ((C15X3) this.l0).LIZIZ(width, (List) this.l1);
            return;
        }
        C15X3 c15x3 = (C15X3) this.l0;
        List list = (List) this.l1;
        c15x3.getClass();
        if (list == null || list.isEmpty() || !(!false) || list == null) {
            return;
        }
        boolean z = false;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            TakoLinkItem takoLinkItem = (TakoLinkItem) obj;
            C15X4 c15x4LJFF = c15x3.LJFF(i, takoLinkItem);
            if (c15x4LJFF != null) {
                width -= c15x4LJFF.LIZIZ;
                z = width < 0;
                C426160GnO c426160GnO2 = c15x3.LLILLJJLI;
                if (c426160GnO2 != null) {
                    c426160GnO2.addView(c15x4LJFF.LIZ);
                }
                String str = takoLinkItem.link;
                if (str.length() > 0 && (c15x5 = c15x3.LL) != null) {
                    c15x5.g9(i, takoLinkItem.name, str, CardStruct.IStatusCode.DEFAULT);
                }
            }
            i = i2;
        }
        if (z) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZ = R.raw.icon_chevron_up_small_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            C15X4 c15x4LIZLLL = c15x3.LIZLLL(C15QB.LLILLL, C15X3.LIZJ(c15x3.getContext().getString(2131849878), c419910GdJ.LIZIZ(2, c15x3.getContext())), new AwS397S0200000_31(c15x3, (C15X3) list, (List<TakoLinkItem>) 113));
            if (c15x4LIZLLL == null || (c426160GnO = c15x3.LLILLJJLI) == null) {
                return;
            }
            c426160GnO.addView(c15x4LIZLLL.LIZ);
        }
    }

    public final void LIZ$1() {
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd = ((C15DG) this.l0).LLILLL;
        if (textureViewSurfaceTextureListenerC1288630jdd == null || textureViewSurfaceTextureListenerC1288630jdd.getPlayer().oi()) {
            return;
        }
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd2 = ((C15DG) this.l0).LLILLL;
        if (textureViewSurfaceTextureListenerC1288630jdd2 != null) {
            textureViewSurfaceTextureListenerC1288630jdd2.stop();
        }
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd3 = ((C15DG) this.l0).LLILLL;
        if (textureViewSurfaceTextureListenerC1288630jdd3 != null) {
            C786410Ut5.b(textureViewSurfaceTextureListenerC1288630jdd3, 8);
        }
        C978500bZQ.LIZIZ("match_punish_prepare");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show result , result = ");
        sbLIZ.append((Integer) this.l1);
        C20441214yg.LIZIZ("MatchResultComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (this.z2 || !LiveMatchLowEndOptimizationSettings.INSTANCE.isEnabled() || C20483515Dd.LIZJ()) {
            Integer num = (Integer) this.l1;
            if (num != null) {
                ((C15DG) this.l0).LJIIJJI(num.intValue());
                return;
            }
            return;
        }
        Integer num2 = (Integer) this.l1;
        if (num2 != null) {
            ((C15DG) this.l0).LJIIL(num2.intValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$2() {
        /*
            r14 = this;
            java.lang.Object r2 = r14.l0
            X.154h r2 = (X.C204605154h) r2
            X.154J r1 = r2.LJIIL
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.LJI = r0
            r7 = 0
            r0 = 1
            r2.LJIIIIZZ(r7, r0)
            boolean r0 = X.C297110Bkj.LIZ()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r14.l1
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L44
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L44
            X.14yU r2 = X.C20440014yU.LJIIJ
            java.lang.Object r0 = r14.l0
            X.154h r0 = (X.C204605154h) r0
            X.129L r0 = r0.LJIIJJI
            if (r0 == 0) goto L31
            java.util.List r1 = r0.getData()
            if (r1 != 0) goto L33
        L31:
            X.13BV r1 = X.C13BV.INSTANCE
        L33:
            java.lang.Object r0 = r14.l0
            X.154h r0 = (X.C204605154h) r0
            boolean r0 = r0.LJ()
            r2.getClass()
            boolean r0 = X.C20440014yU.LIZJ(r1, r0)
            if (r0 == 0) goto L62
        L44:
            X.154j r3 = new X.154j
            java.lang.Object r4 = r14.l1
            java.util.List r4 = (java.util.List) r4
            r5 = 0
            boolean r9 = r14.z2
            r11 = 0
            r13 = 494(0x1ee, float:6.92E-43)
            r8 = r7
            r10 = r7
            r12 = r11
            r3.<init>(r4, r5, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r2 = r14.l0
            X.154h r2 = (X.C204605154h) r2
            X.154J r1 = r2.LJIIL
            boolean r0 = r2.LJIILIIL
            r2.LJIIIZ(r1, r3, r0)
        L62:
            java.lang.Object r0 = r14.l0
            X.154h r0 = (X.C204605154h) r0
            r0.LJIILIIL = r7
            return
        L69:
            X.154j r3 = new X.154j
            java.lang.Object r4 = r14.l1
            java.util.List r4 = (java.util.List) r4
            r5 = 0
            boolean r9 = r14.z2
            r11 = 0
            r13 = 494(0x1ee, float:6.92E-43)
            r8 = r7
            r10 = r7
            r12 = r11
            r3.<init>(r4, r5, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r2 = r14.l0
            X.154h r2 = (X.C204605154h) r2
            X.154J r1 = r2.LJIIL
            boolean r0 = r2.LJIILIIL
            r2.LJIIIZ(r1, r3, r0)
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS28S0210000_31.LIZ$2():void");
    }

    public static final void run$0(ARunnableS28S0210000_31 aRunnableS28S0210000_31) {
        boolean zLIZ;
        C1C7U.LIZ("TakoAnswerLinkFlowLayout@51e9.bind$1");
        try {
            aRunnableS28S0210000_31.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoAnswerLinkFlowLayout@51e9.bind$1");
    }

    public static final void run$1(ARunnableS28S0210000_31 aRunnableS28S0210000_31) {
        boolean zLIZ;
        C1C7U.LIZ("MatchResultAnimationComponent@3ead.show$1");
        try {
            aRunnableS28S0210000_31.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MatchResultAnimationComponent@3ead.show$1");
    }

    public static final void run$2(ARunnableS28S0210000_31 aRunnableS28S0210000_31) {
        C15LD c15ld = (C15LD) aRunnableS28S0210000_31.l0;
        MusicModel musicModel = (MusicModel) aRunnableS28S0210000_31.l1;
        boolean z = aRunnableS28S0210000_31.z2;
        c15ld.getClass();
        C1C7U.LIZ("MusicDetailDownloadHelper@4836.doDownload$2$onStart$1L");
        C15LG c15lg = c15ld.LJFF.LJ;
        if (c15lg != null) {
            c15lg.Nw(musicModel, z);
        }
        C1C7U.LIZIZ("MusicDetailDownloadHelper@4836.doDownload$2$onStart$1L");
    }

    public static final void run$3(ARunnableS28S0210000_31 aRunnableS28S0210000_31) {
        boolean zLIZ;
        C1C7U.LIZ("CollectionMusicTabViewV2@bcbb.buildCollectMusicList$1$onRefreshResult$2");
        try {
            aRunnableS28S0210000_31.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CollectionMusicTabViewV2@bcbb.buildCollectMusicList$1$onRefreshResult$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS28S0210000_31(Object obj, C15X3 c15x3, boolean z, List<TakoLinkItem> list) {
        this.$t = list;
        this.l0 = obj;
        this.z2 = c15x3;
        this.l1 = z;
    }
}
