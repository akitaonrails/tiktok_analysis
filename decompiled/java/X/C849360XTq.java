package X;

/* JADX INFO: renamed from: X.0XTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C849360XTq implements C0XTR {
    public final InterfaceC849390XTt LIZ;

    public C849360XTq(InterfaceC849390XTt interfaceC849390XTt) {
        this.LIZ = interfaceC849390XTt;
    }

    @Override // X.C0XTR
    public void onResult(int i, int i2, Object obj) {
        InterfaceC849390XTt interfaceC849390XTt = this.LIZ;
        if (interfaceC849390XTt != null && i == 1) {
            if (i2 == 1) {
                interfaceC849390XTt.LIZ();
            } else {
                interfaceC849390XTt.LIZIZ();
            }
        }
    }
}
