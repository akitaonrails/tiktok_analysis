package X;

/* JADX INFO: renamed from: X.0tID, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659750tID implements InterfaceC1660130tIp<C1659910tIT>, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C1664750tQH LLILZ;
    public final AnonymousClass0951 LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1659750tID.class, "cameraComponent", "getCameraComponent()Lcom/ss/android/ugc/aweme/social/creation/record/launch/component/SocialCameraApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1659750tID.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1659750tID.class, "frontFlashApi", "getFrontFlashApi()Lcom/ss/android/ugc/gamora/recorder/frontflash/FrontFlashApiComponent;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public final InterfaceC1659790tIH LIZJ() {
        return (InterfaceC1659790tIH) this.LLILLJJLI.getValue(this, LLILZLL[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    @Override // X.InterfaceC1660130tIp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r6 = this;
            X.0tIH r0 = r6.LIZJ()
            boolean r0 = r0.Lf1()
            if (r0 == 0) goto Lb
            return
        Lb:
            X.0tIH r0 = r6.LIZJ()
            X.05YD r0 = r0.UP()
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L3e
            X.0tQH r1 = r6.LLILZ
            X.1Bqa<java.lang.Object>[] r0 = X.C1659750tID.LLILZLL
            r0 = r0[r5]
            java.lang.Object r1 = r1.getValue(r6, r0)
            X.0t3U r1 = (X.InterfaceC1650620t3U) r1
            int r0 = r1.getNextFlashMode()
            r1.qh(r0)
            if (r0 == 0) goto L6b
        L36:
            X.0tIH r0 = r6.LIZJ()
            r0.u20(r4)
            return
        L3e:
            X.0tQH r1 = r6.LLILLL
            X.1Bqa<java.lang.Object>[] r3 = X.C1659750tID.LLILZLL
            r0 = r3[r4]
            java.lang.Object r0 = r1.getValue(r6, r0)
            X.0t2n r0 = (X.InterfaceC1650190t2n) r0
            int r2 = r0.getNextFlashMode()
            X.0tQH r1 = r6.LLILLL
            r0 = r3[r4]
            java.lang.Object r0 = r1.getValue(r6, r0)
            X.0t2n r0 = (X.InterfaceC1650190t2n) r0
            r0.qh(r2)
            X.0tQH r1 = r6.LLILZ
            r0 = r3[r5]
            java.lang.Object r0 = r1.getValue(r6, r0)
            X.0t3U r0 = (X.InterfaceC1650620t3U) r0
            r0.nR(r2)
            if (r2 == 0) goto L6b
            goto L36
        L6b:
            r4 = 0
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1659750tID.LIZIZ():void");
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1660130tIp
    public final C05YD<C1659770tIF> getState() {
        return this.LLILZIL;
    }

    public C1659750tID(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZ(c1drg, InterfaceC1659790tIH.class, null);
        this.LLILLL = C1664770tQJ.LIZ(c1drg, InterfaceC1650230t2r.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, InterfaceC1650620t3U.class, null);
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
        C1698270uIL c1698270uIL = new C1698270uIL(LIZJ().wU0(), 17);
        C05YW.LIZ.getClass();
        this.LLILZIL = C09IC.LJJIJIL(c1698270uIL, c054gLIZ, C1370905Yd.LIZIZ, new C1659770tIF(LIZJ().wU0().getValue().booleanValue()));
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZ(InterfaceC1660090tIl interfaceC1660090tIl) {
        C1660080tIk.LIZ(this, interfaceC1660090tIl);
    }
}
