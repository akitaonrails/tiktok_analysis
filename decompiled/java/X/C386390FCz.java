package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;

/* JADX INFO: renamed from: X.0FCz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386390FCz extends AbstractC386380FCy {
    public final InterfaceC1452170ntP LIZ;

    @Override // X.InterfaceC386690FEd
    public final NLEEditor LJI() {
        C1463670oBx c1463670oBx;
        C348100Dkm c348100DkmLIZLLL;
        InterfaceC1452170ntP interfaceC1452170ntP = this.LIZ;
        if (!(interfaceC1452170ntP instanceof C1463670oBx) || (c1463670oBx = (C1463670oBx) interfaceC1452170ntP) == null || (c348100DkmLIZLLL = c1463670oBx.LIZLLL()) == null) {
            return null;
        }
        return c348100DkmLIZLLL.LIZ;
    }

    @Override // X.InterfaceC386690FEd
    public final INLEMediaSession f1() {
        C1463670oBx c1463670oBx;
        C348100Dkm c348100DkmLIZLLL;
        InterfaceC1452170ntP interfaceC1452170ntP = this.LIZ;
        if (!(interfaceC1452170ntP instanceof C1463670oBx) || (c1463670oBx = (C1463670oBx) interfaceC1452170ntP) == null || (c348100DkmLIZLLL = c1463670oBx.LIZLLL()) == null) {
            return null;
        }
        return c348100DkmLIZLLL.LIZIZ;
    }

    @Override // X.InterfaceC386690FEd
    public final InterfaceC1452170ntP LJII() {
        return this.LIZ;
    }

    public C386390FCz(InterfaceC1452170ntP interfaceC1452170ntP) {
        this.LIZ = interfaceC1452170ntP;
    }
}
