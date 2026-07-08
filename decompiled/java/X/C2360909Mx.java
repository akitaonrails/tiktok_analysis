package X;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.09Mx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2360909Mx {
    public static String LIZIZ;
    public static Point LIZJ;
    public static Reference<AbstractC2361009My> LJ;
    public static final C2360909Mx LIZ = new C2360909Mx();
    public static final C20577084h LIZLLL = new C20577084h();
    public static final Set<WeakReference<AbstractC2361009My>> LJFF = new LinkedHashSet();
    public static final String[] LJI = {"_data", "date_added"};
    public static final String[] LJII = {"_data", "date_added", "width", "height"};
    public static final String[] LJIIIIZZ = {"screenshot", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap"};

    public static void LIZIZ(boolean z) {
        LinkedHashMap linkedHashMap;
        ILocalServicePassThroughService iLocalServicePassThroughService;
        String str;
        AbstractC2361009My abstractC2361009My;
        Map<String, String> mapMobExtraParams;
        Reference<AbstractC2361009My> reference = LJ;
        if (reference != null && (abstractC2361009My = reference.get()) != null && (mapMobExtraParams = abstractC2361009My.mobExtraParams()) != null) {
            linkedHashMap = new LinkedHashMap(mapMobExtraParams);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("has_gallery_access", str);
        }
        try {
            ILocalServicePassThroughService iLocalServicePassThroughService2 = (ILocalServicePassThroughService) PluggableExtentionKt.pluggableSpi$default(ILocalServicePassThroughService.class, false, false, false, 14, null);
            if (iLocalServicePassThroughService2 != null && iLocalServicePassThroughService2.LJIILJJIL() && (iLocalServicePassThroughService = (ILocalServicePassThroughService) PluggableExtentionKt.pluggableSpi$default(ILocalServicePassThroughService.class, false, false, false, 14, null)) != null) {
                iLocalServicePassThroughService.LJII(PageFinder.via(BtmSDK.INSTANCE.getCurrentResumedPage()), "screen_shot", null, linkedHashMap);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C20684815ws.LJIILLIIL("screen_shot", linkedHashMap);
    }

    public static Cursor LIZ(C2360909Mx c2360909Mx, Uri uri, Context context) {
        c2360909Mx.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            Bundle bundle = new Bundle();
            bundle.putStringArray("android:query-arg-sort-columns", new String[]{"date_modified"});
            bundle.putInt("android:query-arg-sort-direction", 1);
            bundle.putInt("android:query-arg-limit", 1);
            return C2204961BRm.LJJIL(context.getContentResolver(), uri, LJII, bundle, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmrcZrL0iHICKT0MS8H9JZZ5eOteBlqNBR0qnoPF1yPs89yDA==", null));
        }
        return C2204961BRm.LJJJ(context.getContentResolver(), uri, LJI, null, null, "date_modified desc limit 1", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmrcZrL0iHICKT0MS8H9JZZ5eOteBlqNBR0qnoPF1yPs89yDA==", null));
    }
}
