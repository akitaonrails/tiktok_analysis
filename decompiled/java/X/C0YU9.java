package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatlist.api.model.LastMessageProperty;

/* JADX INFO: renamed from: X.0YU9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YU9 {
    public static final long LIZ(LastMessageProperty lastMessageProperty) {
        long jLongValue;
        Long create_at_in_seconds;
        if (lastMessageProperty != null && (create_at_in_seconds = lastMessageProperty.getCreate_at_in_seconds()) != null) {
            jLongValue = create_at_in_seconds.longValue();
        } else {
            jLongValue = 0;
        }
        return jLongValue * 1000;
    }

    public static final boolean LIZIZ(LastMessageProperty lastMessageProperty) {
        Integer mark_read;
        if (lastMessageProperty != null && ((mark_read = lastMessageProperty.getMark_read()) == null || mark_read.intValue() != 1)) {
            if (lastMessageProperty.getCreate_at_in_seconds() == null) {
                return true;
            }
            long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - lastMessageProperty.getCreate_at_in_seconds().longValue();
            long jLJFF = 604800;
            try {
                SettingsManager.LIZLLL().getClass();
                jLJFF = SettingsManager.LJFF("im_reaction_as_count_interval_in_seconds", 604800L);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (jCurrentTimeMillis <= jLJFF) {
                return true;
            }
        }
        return false;
    }
}
