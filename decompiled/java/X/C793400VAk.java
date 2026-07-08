package X;

import android.content.ContentValues;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0VAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793400VAk extends AbstractC793410VAl<C793390VAj> {
    public static volatile C793400VAk LJ;
    public static final String[] LJFF = {"_id", "front", "type", "timestamp", "accumulation", "version_id", "source", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Scene.SCENE_SERVICE, "process", "main_process", "sid"};

    public static final C793390VAj LJ(C793420VAm c793420VAm) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        long jLIZIZ = c793420VAm.LIZIZ("_id");
        long jLIZIZ2 = c793420VAm.LIZIZ("front");
        String strLIZJ = c793420VAm.LIZJ("type");
        long jLIZIZ3 = c793420VAm.LIZIZ("timestamp");
        long jLIZIZ4 = c793420VAm.LIZIZ("accumulation");
        long jLIZIZ5 = c793420VAm.LIZIZ("version_id");
        String strLIZJ2 = c793420VAm.LIZJ("source");
        long jLIZIZ6 = c793420VAm.LIZIZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        String strLIZJ3 = c793420VAm.LIZJ(Scene.SCENE_SERVICE);
        try {
            i = c793420VAm.LIZ.getInt(c793420VAm.LIZ("main_process"));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            i = -1;
        }
        String strLIZJ4 = c793420VAm.LIZJ("process");
        if (jLIZIZ2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (jLIZIZ6 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C793390VAj c793390VAj = new C793390VAj(strLIZJ, jLIZIZ3, jLIZIZ4, strLIZJ3, strLIZJ2, z, z2);
        c793390VAj.LJIIIZ = strLIZJ4;
        c793390VAj.LIZ = jLIZIZ;
        c793390VAj.LJIIIIZZ = jLIZIZ5;
        if (i == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        c793390VAj.LJIIJ = z3;
        c793390VAj.LJIIJJI = c793420VAm.LIZJ("sid");
        return c793390VAj;
    }

    public final synchronized void LJFF(C793390VAj c793390VAj) {
        int i;
        int i2;
        try {
            ContentValues contentValues = new ContentValues();
            int i3 = 1;
            if (c793390VAj.LIZIZ) {
                i = 1;
            } else {
                i = 0;
            }
            contentValues.put("front", Integer.valueOf(i));
            contentValues.put("source", c793390VAj.LJII);
            contentValues.put("type", c793390VAj.LIZLLL);
            contentValues.put("timestamp", Long.valueOf(c793390VAj.LIZJ));
            contentValues.put("accumulation", Long.valueOf(c793390VAj.LJI));
            contentValues.put("version_id", Long.valueOf(c793390VAj.LJIIIIZZ));
            if (c793390VAj.LJ) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            contentValues.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(i2));
            contentValues.put(Scene.SCENE_SERVICE, c793390VAj.LJFF);
            if (!c793390VAj.LJIIJ) {
                i3 = 0;
            }
            contentValues.put("main_process", Integer.valueOf(i3));
            contentValues.put("process", c793390VAj.LJIIIZ);
            contentValues.put("sid", c793390VAj.LJIIJJI);
            LIZIZ(contentValues);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final synchronized void LJI(long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("delete_flag", (Integer) 1);
        try {
            C2204961BRm.LJJJI(C792400V6o.LIZ.getContentResolver(), LIZ(), contentValues, "_id <= ? ", new String[]{String.valueOf(j)}, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++dO64Aq4UVs9P2jBX/eCHk/Ngg==", null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
