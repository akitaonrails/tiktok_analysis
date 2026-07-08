package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.e;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.09Iz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2350709Iz {
    public static final String LIZ(ArrayList<TimeSpeedModelExtension> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<TimeSpeedModelExtension> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().toJson(C2219091BtD.LIZJ()));
        }
        e eVar = new e();
        eVar.LJI = true;
        return GsonProtectorUtils.toJson(eVar.LIZ(), arrayList2);
    }
}
