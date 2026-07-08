package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0xzf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840450xzf {
    public static final C1840450xzf LIZ = new C1840450xzf();
    public static final long LIZIZ = TimeUnit.DAYS.toMillis(3);

    public static boolean LIZ() {
        boolean zLJIILIIL = C10EU.LJIILIIL();
        if (zLJIILIIL) {
            return false;
        }
        ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIIIZ();
        if (!C14MJ.LJII() && (!((Boolean) C0AWQ.LIZ.getValue()).booleanValue())) {
            return false;
        }
        boolean zLIZ = C288820BTs.LIZ();
        boolean z = C1840470xzh.LIZ().getBoolean("keva_key_has_added_story_widget", false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldShowStoryWidgetGuideItem - isKidsMode: ");
        sbLIZ.append(zLJIILIIL);
        sbLIZ.append(", isInWidgetExp: ");
        sbLIZ.append(zLIZ);
        sbLIZ.append(", hasAlreadyAddedStoryWidget: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        return C1601110rld.LIZ() && zLIZ && !z;
    }
}
