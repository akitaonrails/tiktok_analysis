package X;

/* JADX INFO: renamed from: X.0Mx7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C585070Mx7 implements InterfaceC584750Mwb {
    @Override // X.InterfaceC584750Mwb
    public final InterfaceC585080Mx8 LIZ(final C585050Mx5 c585050Mx5) {
        String str = c585050Mx5.LJ;
        str.getClass();
        if (!str.equals("test_command")) {
            return null;
        }
        return new InterfaceC585080Mx8(c585050Mx5) { // from class: X.0Mx6
            public final C585050Mx5 LIZ;

            @Override // X.InterfaceC585080Mx8
            public final void execute() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TestCommand execute: ");
                sbLIZ.append(this.LIZ.toString());
                C1481110oe5.LIZIZ("test_command", C2188811AlT.LIZIZ(sbLIZ));
            }

            {
                this.LIZ = c585050Mx5;
            }
        };
    }
}
