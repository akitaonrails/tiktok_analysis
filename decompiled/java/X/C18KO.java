package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpAwemeInfo;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpPageInfo;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.18KO, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18KO implements InterfaceC20673715v5<C18KP> {
    public static final C18KO LIZ = new C18KO();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20673715v5
    public final void LIZ(C20673615v4 c20673615v4) {
        C19EG c19eg;
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        T t = c20673615v4.LIZIZ;
        Object obj = ((C18KP) t).LIZ;
        FcpAwemeInfo fcpAwemeInfo = ((C18KP) t).LIZLLL;
        C18KJ.LIZ.getClass();
        WeakHashMap<Object, String> weakHashMap = C18KJ.LIZIZ;
        String string = weakHashMap.get(obj);
        if (string == null || string.length() == 0) {
            string = UUID.randomUUID().toString();
            weakHashMap.put(obj, string);
        }
        C18KP c18kp = (C18KP) c20673615v4.LIZIZ;
        FcpPageInfo.Companion.getClass();
        c18kp.LJI = new FcpPageInfo(string, fcpAwemeInfo, new LinkedHashSet(), false);
        C1584400rKg c1584400rKg = C1584400rKg.LIZ;
        FcpPageInfo fcpPageInfo = ((C18KP) c20673615v4.LIZIZ).LJI;
        c1584400rKg.getClass();
        if ((obj instanceof C19EG) && (c19eg = (C19EG) obj) != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg)) != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
            String strCt0 = homeTabAbilityLIZ.Ct0();
            if (strCt0 != null && fcpPageInfo != null) {
                fcpPageInfo.appendUniqueId(strCt0);
            }
            String strZj2 = homeTabAbilityLIZ.Zj2();
            if (strZj2 != null && fcpPageInfo != null) {
                fcpPageInfo.appendUniqueId(strZj2);
            }
        }
        c20673615v4.LIZ();
    }
}
