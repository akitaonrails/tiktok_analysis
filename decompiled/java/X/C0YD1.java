package X;

/* JADX INFO: renamed from: X.0YD1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YD1 {
    public final C0YEM LIZ;
    public final InterfaceC864330XvT LIZIZ;
    public final int LIZJ = C0YMR.BATCH_GET_MESSAGES.getValue();

    public C0YD1(C0YEM c0yem, InterfaceC864330XvT interfaceC864330XvT) {
        this.LIZ = c0yem;
        this.LIZIZ = interfaceC864330XvT;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<com.bytedance.im.core.proto.MessageKey> r27, int r28, X.InterfaceC863600XuI<java.lang.Boolean> r29, java.lang.Long r30, java.lang.String r31, X.InterfaceC1364105Vn<? super kotlin.Unit> r32) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YD1.LIZ(java.util.List, int, X.0XuI, java.lang.Long, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C864760XwA r37, int r38, X.InterfaceC863600XuI<java.lang.Boolean> r39, long r40, java.lang.String r42, long r43, int r45, X.InterfaceC1364105Vn<? super kotlin.Unit> r46) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YD1.LIZIZ(X.0XwA, int, X.0XuI, long, java.lang.String, long, int, X.05Vn):java.lang.Object");
    }

    public final void LIZJ(InterfaceC863600XuI<Boolean> interfaceC863600XuI, Integer num, String str, String str2, long j, String str3, long j2, boolean z, int i, Throwable th) {
        int iIntValue;
        String str4;
        String str5 = str;
        int iIntValue2 = -1;
        String str6 = "";
        if (interfaceC863600XuI != null) {
            C0YMX c0ymxNewBuilder = C0YMW.newBuilder();
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            C0YMW c0ymw = c0ymxNewBuilder.LIZ;
            c0ymw.code = iIntValue;
            if (str5 == null) {
                str5 = "";
            }
            c0ymw.statusMsg = str5;
            if (str2 == null) {
                str4 = "";
            } else {
                str4 = str2;
            }
            c0ymw.logId = str4;
            c0ymw.throwable = th;
            interfaceC863600XuI.LIZIZ(c0ymw);
        }
        C870460YCu c870460YCuLIZ = this.LIZ.LJIIZILJ().LJFF().LIZ();
        if (num != null) {
            iIntValue2 = num.intValue();
        }
        if (str2 != null) {
            str6 = str2;
        }
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - j2);
        Long lValueOf2 = Long.valueOf(j);
        Boolean bool = Boolean.FALSE;
        c870460YCuLIZ.LIZJ(1, iIntValue2, str6, lValueOf, lValueOf2, bool, bool, bool, Boolean.valueOf(z), i, str3);
    }
}
