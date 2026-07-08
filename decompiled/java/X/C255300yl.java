package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveRevenueHighTrafficQpsSettings;
import com.bytedance.android.livesdk.livesetting.gift.QpsThresholds;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00yl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C255300yl {
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public DataChannel LJIIIIZZ;
    public C11JF LJIIIZ;
    public InterfaceC1100800ekg LJIIJ;
    public final Map<Class<? extends AbstractC1136060ffY>, Long> LIZ = new LinkedHashMap();
    public final Map<Class<? extends AbstractC1136060ffY>, Long> LIZIZ = new LinkedHashMap();
    public final Map<Class<? extends AbstractC1136060ffY>, Boolean> LIZJ = new LinkedHashMap();
    public final Class<? extends AbstractC1136060ffY>[] LJIIJJI = {GiftMessage.class, LikeMessage.class, MemberMessage.class, ChatMessage.class};

    public static float LIZIZ(Class cls) {
        QpsThresholds value = LiveRevenueHighTrafficQpsSettings.INSTANCE.getValue();
        if (Intrinsics.LJFF(cls, GiftMessage.class)) {
            return value.giftQPs;
        }
        if (Intrinsics.LJFF(cls, MemberMessage.class)) {
            return value.enterQps;
        }
        if (Intrinsics.LJFF(cls, ChatMessage.class)) {
            return value.chatQps;
        }
        if (Intrinsics.LJFF(cls, LikeMessage.class)) {
            return value.likeQps;
        }
        return 0.0f;
    }

    public static Object LIZ(Map map, Object obj, Object obj2) {
        Object obj3 = ((LinkedHashMap) map).get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }
}
