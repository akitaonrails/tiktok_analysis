package X;

import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import lth.o;

/* JADX INFO: renamed from: X.0Kgb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523870Kgb {
    public static final C528230Knd LIZ(Intent intent) {
        String stringExtra;
        try {
            Gson gson = o.LIZIZ;
            try {
                stringExtra = intent.getStringExtra("album_mob_params");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            return (C528230Knd) gson.LJII(stringExtra, C528230Knd.class);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static final C522350Ke9 LIZIZ(Intent intent, C0L92 c0l92, String str) {
        C528230Knd c528230KndLIZ;
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra == null || (c528230KndLIZ = LIZ(intent)) == null) {
            return null;
        }
        String creationId = C537520L6g.LIZ(intent).getCreationId();
        String str2 = c528230KndLIZ.LIZJ;
        String str3 = c528230KndLIZ.LIZLLL;
        String str4 = c528230KndLIZ.LJI;
        String str5 = c528230KndLIZ.LJII;
        long longExtra = intent.getLongExtra("start_next_time", -1L);
        int intExtra = intent.getIntExtra("key_choose_scene", -1);
        String value = c0l92.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parcelableArrayListExtra) {
            if (((MediaModel) obj).LJIIJ()) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : parcelableArrayListExtra) {
            if (((MediaModel) obj2).LJIILJJIL()) {
                arrayList2.add(obj2);
            }
        }
        return new C522350Ke9(creationId, intExtra, str2, str3, str4, str5, longExtra, value, str, size, arrayList2.size(), 512);
    }
}
