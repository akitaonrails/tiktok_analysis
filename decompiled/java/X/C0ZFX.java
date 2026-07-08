package X;

import com.ss.android.ugc.aweme.fangroup.settings.GroupChatConfig;

/* JADX INFO: renamed from: X.0ZFX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZFX {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(String str) {
        C01GW c01gw = C896540ZFc.LIZIZ;
        Integer num = ((GroupChatConfig) c01gw.getValue()).groupMemberConfigMap.get(str);
        if (num == null && (num = ((GroupChatConfig) c01gw.getValue()).groupMemberConfigMap.get("default")) == null) {
            return 0;
        }
        return num.intValue();
    }
}
