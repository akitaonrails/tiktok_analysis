package X;

import android.os.Build;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0yJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1853000yJu {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<MediaModel> LIZ(List<? extends MediaModel> list) {
        if (Build.VERSION.SDK_INT < 29 || list.isEmpty()) {
            return list;
        }
        C1853190yKD c1853190yKD = new C1853190yKD();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (c1853190yKD.LIZ((MediaModel) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
