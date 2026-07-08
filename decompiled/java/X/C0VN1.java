package X;

/* JADX INFO: renamed from: X.0VN1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VN1 implements C0VOJ {
    public final String LL;
    public final Object[] LLILLJJLI;

    @Override // X.C0VOJ
    public final String LIZIZ() {
        return this.LL;
    }

    @Override // X.C0VOJ
    public final void LIZ(InterfaceC590330NDj interfaceC590330NDj) {
        long j;
        Object[] objArr = this.LLILLJJLI;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    interfaceC590330NDj.LLD(i);
                } else if (obj instanceof byte[]) {
                    interfaceC590330NDj.LJJIIJZLJL(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    interfaceC590330NDj.LJJI(((Float) obj).floatValue(), i);
                } else if (obj instanceof Double) {
                    interfaceC590330NDj.LJJI(((Double) obj).doubleValue(), i);
                } else if (obj instanceof Long) {
                    interfaceC590330NDj.LJIJ(i, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    interfaceC590330NDj.LJIJ(i, ((Integer) obj).intValue());
                } else if (obj instanceof Short) {
                    interfaceC590330NDj.LJIJ(i, ((Short) obj).shortValue());
                } else if (obj instanceof Byte) {
                    interfaceC590330NDj.LJIJ(i, ((Byte) obj).byteValue());
                } else if (obj instanceof String) {
                    interfaceC590330NDj.LJIILIIL(i, (String) obj);
                } else if (obj instanceof Boolean) {
                    if (((Boolean) obj).booleanValue()) {
                        j = 1;
                    } else {
                        j = 0;
                    }
                    interfaceC590330NDj.LJIJ(i, j);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Cannot bind ");
                    sbLIZ.append(obj);
                    sbLIZ.append(" at index ");
                    sbLIZ.append(i);
                    sbLIZ.append(" Supported types: null, byte[], float, double, long, int, short, byte, string");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
    }

    public C0VN1(String str, Object[] objArr) {
        this.LL = str;
        this.LLILLJJLI = objArr;
    }
}
