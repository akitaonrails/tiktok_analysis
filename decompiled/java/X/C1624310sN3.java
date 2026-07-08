package X;

import Y.AObjectS246S0100000_25;
import Y.AObserverS227S0100000_25;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: renamed from: X.0sN3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624310sN3 {
    public final C19EG LIZ;
    public final ShortVideoContext LIZIZ;
    public final q LIZJ;
    public FaceStickerBean LIZLLL;
    public final InterfaceC1647420syK LJ;

    public final InterfaceC1628590sTx LIZ() {
        return this.LJ.NL1().LIZJ();
    }

    public final InterfaceC1624370sN9 LIZIZ() {
        return this.LJ.wa2().LIZJ();
    }

    public final void LIZJ(FaceStickerBean faceStickerBean) {
        AVMusic aVMusicExtractAVMusic;
        Integer num;
        String forceBindMusicPath;
        if (this.LIZ.isFinishing() || this.LIZIZ.LJJLL()) {
            return;
        }
        C1441190nbh c1441190nbh = this.LIZIZ.cameraComponentModel.mDurings;
        if ((c1441190nbh == null || c1441190nbh.isEmpty()) && faceStickerBean != null && !Intrinsics.LJFF(faceStickerBean, this.LIZLLL)) {
            if (faceStickerBean.isForceBind() && C0IKQ.LIZIZ(faceStickerBean.getMusicIds()) && ((aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LIZIZ.creativeModel.musicBuzModel)) == null || aVMusicExtractAVMusic.getMusicPriority() <= -1)) {
                if (C1624350sN7.LIZ(faceStickerBean) != null && (forceBindMusicPath = faceStickerBean.getForceBindMusicPath()) != null && forceBindMusicPath.length() != 0) {
                    num = 1;
                } else {
                    num = null;
                }
                InterfaceC1628590sTx interfaceC1628590sTxLIZ = LIZ();
                if (interfaceC1628590sTxLIZ != null) {
                    interfaceC1628590sTxLIZ.nv(num);
                }
            }
            this.LIZLLL = faceStickerBean;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.ss.android.ugc.effectmanager.effect.model.Effect r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r4 = X.C1441210nbj.LIZ(r6)
            X.0sTx r0 = r5.LIZ()
            r3 = 0
            if (r0 == 0) goto La4
            kotlin.Pair r0 = r0.mF0()
            if (r0 == 0) goto La4
            java.lang.Object r1 = r0.getFirst()
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r1
        L17:
            X.0sTx r0 = r5.LIZ()
            if (r0 == 0) goto La2
            kotlin.Pair r0 = r0.mF0()
            if (r0 == 0) goto La2
            java.lang.Object r0 = r0.getSecond()
        L27:
            if (r6 == 0) goto L48
            if (r1 == 0) goto L48
            if (r0 == 0) goto L48
            java.lang.String r2 = r1.getEffectId()
            long r0 = r4.getStickerId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L48
            X.0sTx r0 = r5.LIZ()
            if (r0 == 0) goto L48
            r0.oV(r3)
        L48:
            r2 = 1
            r1 = 0
            if (r4 == 0) goto L92
            int r0 = r4.getEffectType()
            if (r0 == r2) goto L92
            boolean r0 = r4.isBusi()
            if (r0 != 0) goto L92
            X.0njf r0 = X.C1446130njf.LIZ
            r0.getClass()
            java.lang.String r0 = "photosensitive"
            boolean r0 = X.C1446130njf.LIZ(r4, r0, r1)
            if (r0 != 0) goto L6d
            java.lang.String r0 = "disturbing_effect"
            boolean r0 = X.C1446130njf.LIZ(r4, r0, r1)
            if (r0 == 0) goto L92
        L6d:
            if (r6 != 0) goto L88
            X.0sN9 r0 = r5.LIZIZ()
            if (r0 == 0) goto L78
            r0.ZS0(r2)
        L78:
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r2 = X.C2296808zG.LIZ(r0)
            X.05EG r1 = new X.05EG
            r1.<init>(r5, r3)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r3, r3, r1, r0)
        L87:
            return
        L88:
            X.0sN9 r0 = r5.LIZIZ()
            if (r0 == 0) goto L87
            r0.ZS0(r1)
            return
        L92:
            boolean r0 = X.C1624200sMs.LJIIL(r4)
            if (r0 != 0) goto L6d
            lnn.q r0 = r5.LIZJ
            boolean r0 = X.C1624010sMZ.LIZJ(r0)
            r5.LJ(r4, r0)
            goto L6d
        La2:
            r0 = r3
            goto L27
        La4:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1624310sN3.LIZLLL(com.ss.android.ugc.effectmanager.effect.model.Effect):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1624310sN3.LJ(com.ss.android.ugc.aweme.sticker.model.FaceStickerBean, boolean):void");
    }

    public C1624310sN3(C1DRG c1drg, C19GS c19gs, LifecycleOwner lifecycleOwner, ShortVideoContext shortVideoContext, q qVar) {
        this.LIZ = c19gs;
        this.LIZIZ = shortVideoContext;
        this.LIZJ = qVar;
        this.LJ = (InterfaceC1647420syK) c1drg.LJII(InterfaceC1647420syK.class, null);
        qVar.rV1().LIZ(lifecycleOwner, new AObjectS246S0100000_25(this, 569));
        qVar.C0().LJII().LJIJJLI().observe(lifecycleOwner, new AObserverS227S0100000_25(this, 63));
        qVar.C0().LJII().LIZ().observe(lifecycleOwner, new AObserverS227S0100000_25(this, 64));
        qVar.C0().LJII().LIZLLL().observe(lifecycleOwner, new AObserverS227S0100000_25(this, 68));
        qVar.sk(new InterfaceC1622080sJS() { // from class: X.0sMr
            @Override // X.InterfaceC1622080sJS
            public final int getPriority() {
                return C1623350sLV.LIZ();
            }

            @Override // X.InterfaceC1622080sJS
            public final C1623370sLX LJIILL(InterfaceC1622070sJR interfaceC1622070sJR, AbstractC1627380sS0 abstractC1627380sS0) {
                C1623370sLX c1623370sLXLIZ = interfaceC1622070sJR.LIZ(abstractC1627380sS0);
                if (abstractC1627380sS0 instanceof C1627370sRz) {
                    C1627370sRz c1627370sRz = (C1627370sRz) abstractC1627380sS0;
                    if (c1627370sRz.LIZJ != EnumC1448980noG.RECOVER) {
                        this.LL.LJ(C1441210nbj.LIZ(c1627370sRz.LIZ), C1624010sMZ.LIZJ(this.LL.LIZJ));
                    }
                }
                return c1623370sLXLIZ;
            }
        });
        qVar.dN1().LIZ(lifecycleOwner, new AObjectS246S0100000_25(this, 600));
        qVar.C0().LJII().LJIIZILJ().observe(lifecycleOwner, new AObserverS227S0100000_25(this, 69));
    }
}
