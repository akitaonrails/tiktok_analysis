package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0Oaz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C622310Oaz {
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0Ob0] */
    public static C622300Oay LIZ(final InterfaceC622260Oau interfaceC622260Oau, String str) {
        interfaceC622260Oau.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createOpenHelper: name:");
        sbLIZ.append(str);
        sbLIZ.append(" password:");
        sbLIZ.append(Arrays.toString((byte[]) null));
        sbLIZ.append(", version:");
        sbLIZ.append(3);
        sbLIZ.append(", factory:");
        sbLIZ.append((Object) null);
        C622290Oax.LJFF("BulletinSQLiteHelper", C2188811AlT.LIZIZ(sbLIZ));
        return new C622300Oay(interfaceC622260Oau, str, new InterfaceC875360YVq() { // from class: X.0Ob0
            public final /* synthetic */ byte[] LIZIZ = null;
            public final /* synthetic */ int LIZJ = 3;
            public final C622530ObL LIZ = new C622530ObL();

            /* JADX WARN: Removed duplicated region for block: B:22:0x00a7 A[Catch: all -> 0x00f9, SQLiteException -> 0x00fc, TryCatch #7 {SQLiteException -> 0x00fc, all -> 0x00f9, blocks: (B:20:0x0084, B:22:0x00a7, B:23:0x00aa), top: B:64:0x0084 }] */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00f3  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x0140  */
            @Override // X.InterfaceC875360YVq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(com.tencent.wcdb.database.SQLiteDatabase r18) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 333
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C622320Ob0.LIZ(com.tencent.wcdb.database.SQLiteDatabase):void");
            }
        });
    }
}
