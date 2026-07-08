package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.services.video.ICreativePageService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ra0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593900ra0 {
    public static final C1593900ra0 LIZ = new C1593900ra0();
    public static WeakReference<HomeTabAbility> LIZIZ;

    public static HomeTabAbility LIZ() {
        MainActivityScope mainActivityScopeLIZJ;
        WeakReference<HomeTabAbility> weakReference = LIZIZ;
        if (weakReference == null || weakReference.get() == null) {
            Activity activityLIZ = C2421209eE.LIZ();
            LIZIZ = new WeakReference<>(((activityLIZ instanceof InterfaceC1603190roz) && (activityLIZ instanceof C19EG) && (mainActivityScopeLIZJ = C0S4U.LIZJ((C19EG) activityLIZ)) != null) ? C0DMM.LIZ(mainActivityScopeLIZJ) : null);
        }
        WeakReference<HomeTabAbility> weakReference2 = LIZIZ;
        if (weakReference2 != null) {
            return weakReference2.get();
        }
        return null;
    }

    public static String LIZIZ(AbstractC1387200mCc abstractC1387200mCc) {
        Object obj;
        Activity activity;
        C19EG c19eg;
        String key;
        String strVn0;
        if (abstractC1387200mCc == null) {
            return "other";
        }
        Object obj2 = null;
        key = null;
        key = null;
        String key2 = null;
        String strZj2 = null;
        if (abstractC1387200mCc.LIZ instanceof InterfaceC1711206n0) {
            Activity activityLIZ = C2421209eE.LIZ();
            if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
                if (C486860J7k.LIZIZ(c19eg).FQ2("page_feed")) {
                    if (Intrinsics.LJFF(C343710Ddh.LIZ(c19eg).Wg(), "HOME")) {
                        HomeTabAbility homeTabAbilityLIZ = LIZ();
                        if (homeTabAbilityLIZ != null) {
                            strVn0 = homeTabAbilityLIZ.Vn0(false);
                            if (strVn0 != null) {
                                C1584320rKY.LIZ.getClass();
                                EnumC1584360rKc enumC1584360rKcLJII = C1584320rKY.LJII(strVn0);
                                if (enumC1584360rKcLJII != null) {
                                    key2 = enumC1584360rKcLJII.getKey();
                                }
                            }
                        } else {
                            strVn0 = null;
                        }
                        C20571715ed c20571715ed = C20571715ed.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("getCurrentPageName: ");
                        sbLIZ.append(strVn0);
                        sbLIZ.append(", sceneName = ");
                        sbLIZ.append(key2);
                        C2188811AlT.LIZIZ(sbLIZ);
                        c20571715ed.getClass();
                        if (key2 == null) {
                            return "other";
                        }
                        return key2;
                    }
                    HomeTabAbility homeTabAbilityLIZ2 = LIZ();
                    if (homeTabAbilityLIZ2 != null) {
                        strZj2 = homeTabAbilityLIZ2.Zj2();
                    }
                    C1584320rKY.LIZ.getClass();
                    EnumC1584360rKc enumC1584360rKcLJII2 = C1584320rKY.LJII(strZj2);
                    if (enumC1584360rKcLJII2 == null || (key = enumC1584360rKcLJII2.getKey()) == null) {
                        return "other";
                    }
                    return key;
                }
                return "other_profile";
            }
            C20571715ed.LIZ.getClass();
            C20571715ed.LIZ("getCurrentSceneName error, activity is null");
            return "other";
        }
        ICreativePageService iCreativePageService = (ICreativePageService) ServiceManager.get().getService(ICreativePageService.class);
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null) {
            obj = abstractC1387200mCcLJ.LIZ;
        } else {
            obj = null;
        }
        if (obj instanceof Activity) {
            activity = (Activity) obj;
        } else {
            activity = null;
        }
        if (iCreativePageService.isRecordPage(activity)) {
            return EnumC1584360rKc.SHOOT.getKey();
        }
        DetailFeedService detailFeedService = (DetailFeedService) ServiceManager.get().getService(DetailFeedService.class);
        AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ2 != null) {
            obj2 = abstractC1387200mCcLJ2.LIZ;
        }
        Fragment fragmentLJFF = detailFeedService.LJFF(obj2);
        if (fragmentLJFF != null) {
            C20571715ed.LIZ.getClass();
            if (C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(fragmentLJFF)) {
                return "story";
            }
        }
        return "other";
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordData r6) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1593900ra0.LIZJ(com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordData):void");
    }
}
