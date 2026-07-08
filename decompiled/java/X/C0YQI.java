package X;

import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.repair.RepairKit;

/* JADX INFO: renamed from: X.0YQI, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public class C0YQI {
    public long LIZ;
    public final byte[] LIZIZ;

    public final void finalize() throws Throwable {
        long j = this.LIZ;
        if (j != 0) {
            RepairKit.nativeFreeMaster(j);
            this.LIZ = 0L;
        }
        super.finalize();
    }

    public static C0YQI LIZ(String str) {
        if (str == null) {
            long jNativeMakeMaster = RepairKit.nativeMakeMaster(null);
            if (jNativeMakeMaster != 0) {
                return new C0YQI(jNativeMakeMaster, null);
            }
            throw new SQLiteException("Cannot create MasterInfo.");
        }
        byte[] bArr = new byte[16];
        long jNativeLoadMaster = RepairKit.nativeLoadMaster(str, null, null, bArr);
        if (jNativeLoadMaster != 0) {
            return new C0YQI(jNativeLoadMaster, bArr);
        }
        throw new SQLiteException("Cannot create MasterInfo.");
    }

    public C0YQI(long j, byte[] bArr) {
        this.LIZ = j;
        this.LIZIZ = bArr;
    }
}
