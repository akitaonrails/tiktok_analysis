package X;

/* JADX INFO: renamed from: X.19pF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21656719pF {
    public final InterfaceC21656819pG LIZ;

    public C21656719pF(InterfaceC21656819pG interfaceC21656819pG) {
        this.LIZ = interfaceC21656819pG;
    }

    public void onEvent(C21657019pI c21657019pI) {
        if (c21657019pI != null) {
            int i = c21657019pI.LIZ;
            C21656619pE c21656619pE = c21657019pI.LIZIZ;
            switch (i) {
                case 201:
                    float f = c21656619pE.LIZIZ;
                    float f2 = c21656619pE.LIZJ;
                    int i2 = c21656619pE.LIZ;
                    InterfaceC21656819pG interfaceC21656819pG = this.LIZ;
                    if (interfaceC21656819pG != null) {
                        interfaceC21656819pG.processTouchDownEvent(f, f2, i2);
                    }
                    break;
                case 202:
                    float f3 = c21656619pE.LIZIZ;
                    float f4 = c21656619pE.LIZJ;
                    int i3 = c21656619pE.LIZ;
                    InterfaceC21656819pG interfaceC21656819pG2 = this.LIZ;
                    if (interfaceC21656819pG2 != null) {
                        interfaceC21656819pG2.processTouchUpEvent(f3, f4, i3);
                    }
                    break;
                case 203:
                    float f5 = c21656619pE.LIZIZ;
                    float f6 = c21656619pE.LIZJ;
                    float f7 = c21656619pE.LIZLLL;
                    float f8 = c21656619pE.LJ;
                    float f9 = c21656619pE.LJFF;
                    InterfaceC21656819pG interfaceC21656819pG3 = this.LIZ;
                    if (interfaceC21656819pG3 != null) {
                        interfaceC21656819pG3.processPanEvent(f5, f6, f7, f8, f9);
                    }
                    break;
                case 204:
                    float f10 = c21656619pE.LIZIZ;
                    float f11 = c21656619pE.LIZJ;
                    InterfaceC21656819pG interfaceC21656819pG4 = this.LIZ;
                    if (interfaceC21656819pG4 != null) {
                        interfaceC21656819pG4.processLongPressEvent(f10, f11);
                    }
                    break;
                case 205:
                    float f12 = c21656619pE.LJI;
                    float f13 = c21656619pE.LJFF;
                    InterfaceC21656819pG interfaceC21656819pG5 = this.LIZ;
                    if (interfaceC21656819pG5 != null) {
                        interfaceC21656819pG5.processScaleEvent(f12, f13);
                    }
                    break;
                case 206:
                    float f14 = c21656619pE.LIZIZ;
                    float f15 = c21656619pE.LIZJ;
                    InterfaceC21656819pG interfaceC21656819pG6 = this.LIZ;
                    if (interfaceC21656819pG6 != null) {
                        interfaceC21656819pG6.processTouchEvent(f14, f15);
                    }
                    break;
                case 207:
                    long j = c21656619pE.LJIIIIZZ;
                    float f16 = c21656619pE.LIZIZ;
                    float f18 = c21656619pE.LIZJ;
                    float f19 = c21656619pE.LJIIIZ;
                    float f20 = c21656619pE.LJIIJ;
                    int i4 = c21656619pE.LJIIJJI;
                    int i5 = c21656619pE.LJIIL;
                    InterfaceC21656819pG interfaceC21656819pG7 = this.LIZ;
                    if (interfaceC21656819pG7 != null) {
                        interfaceC21656819pG7.processTouchEventWithTouchType(j, f16, f18, f19, f20, i4, i5);
                    }
                    break;
                case 208:
                    float f21 = c21656619pE.LJII;
                    float f22 = c21656619pE.LJFF;
                    InterfaceC21656819pG interfaceC21656819pG8 = this.LIZ;
                    if (interfaceC21656819pG8 != null) {
                        interfaceC21656819pG8.processRotationEvent(f21, f22);
                    }
                    break;
            }
        }
    }
}
