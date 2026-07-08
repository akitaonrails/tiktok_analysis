package X;

/* JADX INFO: renamed from: X.0oN0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1470520oN0 {
    public AbstractC1470590oN7 LIZ;
    public AbstractC1469000oKY LIZIZ;

    public final void LIZ(InterfaceC1470560oN4 interfaceC1470560oN4) {
        if (interfaceC1470560oN4 == null) {
            NullPointerException nullPointerException = new NullPointerException();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TTKMain must not be null Plugin: ");
            sbLIZ.append(this.LIZ.LIZLLL());
            sbLIZ.append(", ");
            sbLIZ.append(getClass().getName());
            C1481110oe5.LJFF(nullPointerException, C2188811AlT.LIZIZ(sbLIZ));
            if (C1481110oe5.LIZ) {
                throw new AssertionError("plugin is null");
            }
        }
    }

    public C1470520oN0(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc) {
        this.LIZ = abstractC1470590oN7;
        this.LIZIZ = (AbstractC1469000oKY) interfaceC1469660oLc;
    }
}
