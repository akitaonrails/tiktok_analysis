package X;

import Y.AfS41S1100000_3;
import Y.AkS468S0100000_3;
import android.content.Context;
import android.os.Environment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: X.09nV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2478709nV {
    public static volatile C2478709nV LIZJ;
    public final C13TF LIZ;
    public final Map<String, Object> LIZIZ;

    public C2478709nV(Context context) {
        try {
            C13TF c13tf = this.LIZ;
            if (c13tf != null) {
                c13tf.close();
                this.LIZ = null;
            }
            C13TF c13tfLJII = C13TF.LJII(LIZ(context));
            this.LIZ = c13tfLJII;
            Map<String, Object> map = (Map) C1965507mv.LIZJ(c13tfLJII, "lruEntries");
            this.LIZIZ = map;
            if (map != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("entries: ");
                sbLIZ.append(map.size());
                C20441214yg.LJ("yyy", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static C0VSJ LIZ(Context context) {
        String path;
        if (("mounted".equals(C786410Ut5.X3()) || !Environment.isExternalStorageRemovable()) && C786410Ut5.x2(context) != null) {
            path = C786410Ut5.x2(context).getPath();
        } else {
            path = C786410Ut5.w2(context).getPath();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(path);
        sbLIZ.append(File.separator);
        sbLIZ.append("shareClikedCache");
        return new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static C2478709nV LIZIZ(Context context) {
        if (LIZJ == null) {
            synchronized (C2478709nV.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C2478709nV(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final void LIZJ(final long j, final String str) {
        C11NZ.LJJJJZ(Long.valueOf(j)).LJJJ(new AkS468S0100000_3(this, 21), false).LJJIJIIJIL(new AfS41S1100000_3(this, str, 8)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN<byte[]>() { // from class: X.09nU
            @Override // X.C09JN
            public final void accept(byte[] bArr) {
                C1C7U.LIZ("RoomShareDiskCacheController@a2e7.put$1");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("entries key = ");
                sbLIZ.append(str);
                sbLIZ.append(",value = ");
                sbLIZ.append(j);
                C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("RoomShareDiskCacheController@a2e7.put$1");
            }
        });
    }
}
