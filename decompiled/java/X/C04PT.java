package X;

import com.ss.android.ugc.aweme.im.common.analytics.userexperience.IDMUserExperienceMonitorService;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.04PT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04PT implements IDMUserExperienceMonitorService {
    public static final C04PT LIZ = new C04PT();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(831));

    @Override // com.ss.android.ugc.aweme.im.common.analytics.userexperience.IDMUserExperienceMonitorService
    public final C0Z7C LIZ() {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ.getValue();
        Object c1495105tF = concurrentHashMap.get("dm_chat_list_user_experience_event");
        if (c1495105tF == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent("dm_chat_list_user_experience_event", (c1495105tF = new C1495105tF()))) != null) {
            c1495105tF = objPutIfAbsent;
        }
        return (C0Z7C) c1495105tF;
    }
}
