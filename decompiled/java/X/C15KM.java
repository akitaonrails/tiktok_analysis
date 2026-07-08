package X;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.15KM, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15KM {
    public static MusicModel LIZ(File file) {
        return ((IMusicService) ServiceManager.get().getService(IMusicService.class)).buildMusicModelFromFile(file, null, null, true, false);
    }

    public static List LIZIZ(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C20448614zs(0, (MusicModel) ListProtector.get(arrayList2, i), 12));
        }
        return arrayList;
    }

    public static boolean LIZJ(Context context, Uri uri) throws Throwable {
        boolean z = false;
        if (!C2400409as.LJIIIZ(context, uri)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Throwable th = null;
            Cursor cursorLJJJ = C2204961BRm.LJJJ(context.getContentResolver(), uri, new String[]{"is_trashed"}, null, null, "title_key", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgbJDd2T/+hJ7f32hVlYOBJ+ZbLyKfa0gqFKUIm1uzQ4CN4YDmSkhi", null));
            if (cursorLJJJ != null) {
                try {
                    if (cursorLJJJ.moveToFirst()) {
                        if (cursorLJJJ.getInt(cursorLJJJ.getColumnIndex("is_trashed")) != 1) {
                            z = true;
                        }
                        C2107108Nh.LIZ(cursorLJJJ, null);
                        return z;
                    }
                    C2107108Nh.LIZ(cursorLJJJ, null);
                } catch (Throwable th2) {
                    try {
                        TryCatchGuardChecker.doCheck(th2);
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th2;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(cursorLJJJ, th);
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
            }
        }
        return true;
    }
}
