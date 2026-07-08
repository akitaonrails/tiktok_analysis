package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;

/* JADX INFO: renamed from: X.0FCx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386370FCx extends AbstractC386380FCy {
    public final /* synthetic */ C0FE8 LIZ;

    @Override // X.InterfaceC386690FEd
    public final InterfaceC1452170ntP LJII() {
        return null;
    }

    @Override // X.InterfaceC386690FEd
    public final NLEEditor LJI() {
        C0E48 c0e48W1 = this.LIZ.W1();
        if (c0e48W1 != null) {
            return c0e48W1.LLFII().LJI();
        }
        return null;
    }

    @Override // X.InterfaceC386690FEd
    public final INLEMediaSession f1() {
        C0E48 c0e48W1 = this.LIZ.W1();
        if (c0e48W1 != null) {
            return c0e48W1.f1();
        }
        return null;
    }

    public C386370FCx(C0FE8 c0fe8) {
        this.LIZ = c0fe8;
    }
}
