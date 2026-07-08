package X;

import android.content.Context;
import com.tencent.wcdb.FileUtils;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteGlobal;
import java.io.File;

/* JADX INFO: renamed from: X.08hS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2186408hS {
    static {
        SQLiteGlobal.loadLib();
    }

    public static SQLiteDatabase LIZ(Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i, InterfaceC2186508hT interfaceC2186508hT, InterfaceC875360YVq interfaceC875360YVq) {
        C0VSJ c0vsj;
        C0VSJ c0vsj2;
        C0VSJ c0vsj3;
        int i2;
        int i3;
        char cCharAt = str.charAt(0);
        char c = File.separatorChar;
        if (cCharAt == c) {
            c0vsj = new C0VSJ(str.substring(0, str.lastIndexOf(c)));
            c0vsj3 = new C0VSJ(c0vsj, str.substring(str.lastIndexOf(File.separatorChar)));
        } else if (context != null) {
            String str2 = context.getApplicationInfo().dataDir;
            if (str2 != null) {
                c0vsj2 = new C0VSJ(str2);
            } else {
                c0vsj2 = null;
            }
            c0vsj = new C0VSJ(c0vsj2, "databases");
            if (c0vsj.getPath().equals("databases")) {
                c0vsj = new C0VSJ("/data/system");
            }
            if (str.indexOf(File.separatorChar) < 0) {
                c0vsj3 = new C0VSJ(c0vsj, str);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("File ");
                sbLIZ.append(str);
                sbLIZ.append(" contains a path separator");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            throw new RuntimeException("Not supported in system context");
        }
        if (!c0vsj.isDirectory() && c0vsj.mkdir()) {
            FileUtils.setPermissions(c0vsj.getPath(), 505, -1, -1);
        }
        if ((i & 8) != 0) {
            i2 = 805306368;
        } else {
            i2 = 268435456;
        }
        SQLiteDatabase sQLiteDatabaseLJJLIIIJL = SQLiteDatabase.LJJLIIIJL(c0vsj3.getPath(), bArr, sQLiteCipherSpec, interfaceC2186508hT, i2, interfaceC875360YVq);
        String path = c0vsj3.getPath();
        if ((i & 1) != 0) {
            i3 = 436;
        } else {
            i3 = 432;
        }
        if ((i & 2) != 0) {
            i3 |= 2;
        }
        FileUtils.setPermissions(path, i3, -1, -1);
        return sQLiteDatabaseLJJLIIIJL;
    }
}
