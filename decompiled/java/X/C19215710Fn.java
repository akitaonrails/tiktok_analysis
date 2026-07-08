package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import java.util.List;

/* JADX INFO: renamed from: X.10Fn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19215710Fn {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ() {
        String string = Keva.getRepo("geofencing_region_list").getString("regions", "");
        return (string == null || string.length() == 0) ? C13BV.INSTANCE : C08JS.LJ(TranslatedRegion[].class, string);
    }
}
