package X;

/* JADX INFO: renamed from: X.0tFt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1658310tFt implements InterfaceC1659690tI7 {
    public static final C1658310tFt LIZ = new C1658310tFt();

    public static void LIZ(String str) {
        Thread threadU3 = C786410Ut5.u3();
        C201954140i c201954140i = C201954140i.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append("EffectCoreLine");
        sbLIZ.append("]#[thread-id:");
        sbLIZ.append(threadU3.getId());
        sbLIZ.append(' ');
        sbLIZ.append(threadU3.getName());
        sbLIZ.append("]: ");
        sbLIZ.append(str);
        C201955140j.LJIILJJIL(c201954140i, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1659690tI7
    public final void d(String str) {
        Thread threadU3 = C786410Ut5.u3();
        C201954140i c201954140i = C201954140i.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append("ALS Framework");
        sbLIZ.append("]#[thread-id:");
        sbLIZ.append(threadU3.getId());
        sbLIZ.append(' ');
        sbLIZ.append(threadU3.getName());
        sbLIZ.append("]: ");
        sbLIZ.append(str);
        C201955140j.LIZJ(c201954140i, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1659690tI7
    public final void e(String str, String str2) {
        Thread threadU3 = C786410Ut5.u3();
        C201954140i c201954140i = C201954140i.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(str);
        sbLIZ.append("]#[thread-id:");
        sbLIZ.append(threadU3.getId());
        sbLIZ.append(' ');
        sbLIZ.append(threadU3.getName());
        sbLIZ.append("]: ");
        sbLIZ.append(str2);
        C201955140j.LJII(c201954140i, C2188811AlT.LIZIZ(sbLIZ));
    }
}
