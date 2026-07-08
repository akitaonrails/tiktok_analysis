package X;

import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0UYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C774080UYc extends C2217421BqW implements Function2<Boolean, Integer, Unit> {
    public C774080UYc(Object obj) {
        super(2, obj, VoiceChatBroadcastFragment.class, "onFinishBroadcastCancelClick", "onFinishBroadcastCancelClick(ZI)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        ((VoiceChatBroadcastFragment) this.receiver).yS(num.intValue(), zBooleanValue);
        return Unit.LIZ;
    }
}
