package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.widget.change.InboxListChangeConfigModel;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zIs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1890800zIs {
    public static boolean LIZIZ;
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(604));
    public static final ConcurrentHashMap<String, AbstractC1890770zIp> LIZJ = new ConcurrentHashMap<>();
    public static String LIZLLL = "";

    public static String LIZ(String str) {
        if (a0.LJJIIZI(str, "inbox-dm-avatar", false)) {
            return "dm";
        }
        if (a0.LJJIIZI(str, "inbox-avatar", false)) {
            return "entrance";
        }
        if (!a0.LJJIIZI(str, "activity-avatar", false) && !a0.LJJIIZI(str, "activity-cover", false) && !a0.LJJIIZI(str, "follower-avatar", false) && !a0.LJJIIZI(str, "follower-cover", false)) {
            if (!a0.LJJIIZI(str, "Relation_rec_user_inbox_first_page_avatar", false) && !a0.LJJIIZI(str, "Relation_rec_user_new_activities_avatar", false) && !a0.LJJIIZI(str, "Relation_rec_user_new_followers_avatar", false)) {
                if (!a0.LJJIIZI(str, "inbox-skylight-avatar", false)) {
                    return str;
                }
                return "skylight";
            }
            return "recommend";
        }
        return "notice";
    }

    public static void LIZIZ(long j, String str, String str2) {
        if (!C1890720zIk.LIZ().enable) {
            return;
        }
        String str3 = LIZLLL;
        int iHashCode = str3.hashCode();
        if (iHashCode != -1655966961) {
            if (iHashCode != -1307214883) {
                if (iHashCode == 100344454 && str3.equals("inbox")) {
                    if (!a0.LJJIIZI(str2, "inbox-skylight-avatar", false) && !a0.LJJIIZI(str2, "inbox-dm-avatar", false) && !a0.LJJIIZI(str2, "inbox-avatar", false) && !a0.LJJIIZI(str2, "Relation_rec_user_inbox_first_page_avatar", false)) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (str3.equals("new_follower")) {
                if (!a0.LJJIIZI(str2, "follower-avatar", false) && !a0.LJJIIZI(str2, "follower-cover", false) && !a0.LJJIIZI(str2, "Relation_rec_user_new_followers_avatar", false)) {
                    return;
                }
            } else {
                return;
            }
        } else if (str3.equals("activity")) {
            if (!a0.LJJIIZI(str2, "activity-avatar", false) && !a0.LJJIIZI(str2, "activity-cover", false) && !a0.LJJIIZI(str2, "Relation_rec_user_new_activities_avatar", false)) {
                return;
            }
        } else {
            return;
        }
        try {
            URL url = new URL(str);
            str = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), null, null).toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
        ConcurrentHashMap<String, AbstractC1890770zIp> concurrentHashMap = LIZJ;
        if (!concurrentHashMap.containsKey(str)) {
            if (j > ((InboxListChangeConfigModel) LIZ.getValue()).imgLoadThreshold) {
                final String strLIZ = LIZ(str2);
                concurrentHashMap.put(str, new AbstractC1890770zIp(strLIZ) { // from class: X.0zIr
                });
            } else {
                final String strLIZ2 = LIZ(str2);
                concurrentHashMap.put(str, new AbstractC1890770zIp(strLIZ2) { // from class: X.0zIq
                });
            }
        }
    }
}
