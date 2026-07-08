package X;

import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Igs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473080Igs {
    public static final List<TranslatedRegion> LIZ(List<TranslatedRegion> list) {
        ArrayList arrayList = new ArrayList();
        for (TranslatedRegion translatedRegion : list) {
            arrayList.add(translatedRegion.copy(translatedRegion.code, translatedRegion.translation, translatedRegion.selected));
        }
        return arrayList;
    }
}
