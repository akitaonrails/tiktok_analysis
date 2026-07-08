package X;

import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.game.GameParticipantScoreComponent;

/* JADX INFO: renamed from: X.18jq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21368418jq {
    public static final GameParticipantScoreComponent LIZ(C1CNI c1cni) {
        long jLongValue;
        double dDoubleValue;
        int iIntValue;
        Long l = c1cni.user_id;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Double d = c1cni.score;
        if (d != null) {
            dDoubleValue = d.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        Integer num = c1cni.rank;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return new GameParticipantScoreComponent(dDoubleValue, iIntValue, jLongValue);
    }
}
