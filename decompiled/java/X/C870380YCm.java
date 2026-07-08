package X;

/* JADX INFO: renamed from: X.0YCm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870380YCm {
    public final C0YEM LIZ;
    public final InterfaceC864790XwD LIZIZ;
    public final C0Y5R LIZJ;

    public C870380YCm(C0YEM c0yem) {
        this.LIZ = c0yem;
        this.LIZIZ = c0yem.LJIIZILJ();
        this.LIZJ = c0yem.LJIIZILJ().LIZIZ();
    }

    public static C870400YCo LIZ(InterfaceC869470Y8z interfaceC869470Y8z) {
        C870400YCo c870400YCo = new C870400YCo();
        c870400YCo.LL = interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(C0YAG.COLUMN_CONVERSATION_ID.key));
        c870400YCo.LLILLJJLI = interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(C0YAG.COLUMN_USER_ID.key));
        long j = interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(C0YAG.COLUMN_MIN_INDEX.key));
        if (c870400YCo.LLILLL < j) {
            c870400YCo.LLILLL = j;
        }
        long j2 = interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(C0YAG.COLUMN_READ_INDEX.key));
        if (c870400YCo.LLILZ < j2) {
            c870400YCo.LLILZ = j2;
        }
        long j3 = interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(C0YAG.COLUMN_READ_ORDER.key));
        if (c870400YCo.LLILZIL < j3) {
            c870400YCo.LLILZIL = j3;
        }
        return c870400YCo;
    }
}
