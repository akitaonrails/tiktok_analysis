package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15po, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20641015po extends C09AY implements Function0<PriorityQueue<InnerPushMessage>> {
    public C20641015po() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final PriorityQueue<InnerPushMessage> invoke() {
        return new PriorityQueue<>(11, new Comparator<InnerPushMessage>() { // from class: X.15pp
            @Override // java.util.Comparator
            public final int compare(InnerPushMessage innerPushMessage, InnerPushMessage innerPushMessage2) {
                int i;
                int i2;
                InnerPushMessage innerPushMessage3 = innerPushMessage;
                InnerPushMessage innerPushMessage4 = innerPushMessage2;
                InnerPushConfig config = innerPushMessage3.getConfig();
                if (config != null) {
                    i = config.priority;
                } else {
                    i = 0;
                }
                InnerPushConfig config2 = innerPushMessage4.getConfig();
                if (config2 != null) {
                    i2 = config2.priority;
                } else {
                    i2 = 0;
                }
                int i3 = i - i2;
                if (i3 == 0) {
                    long createTime = innerPushMessage3.getCreateTime() - innerPushMessage4.getCreateTime();
                    if (innerPushMessage3.getType() == 21 && innerPushMessage4.getType() == 21) {
                        if (createTime <= 0) {
                            if (createTime >= 0) {
                                return 0;
                            }
                        } else {
                            return 1;
                        }
                    } else if (createTime <= 0) {
                        if (createTime >= 0) {
                            return 0;
                        }
                        return 1;
                    }
                    return -1;
                }
                return i3;
            }
        });
    }
}
