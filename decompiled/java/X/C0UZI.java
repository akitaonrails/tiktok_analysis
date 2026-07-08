package X;

import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0UZI, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0UZI extends C1696260uF6 implements Function0<Unit> {
    public C0UZI(Object obj) {
        super(0, obj, VoiceChatBroadcastFragment.class, "onFinishBroadcastPopupShow", "onFinishBroadcastPopupShow(ZI)V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((VoiceChatBroadcastFragment) this.receiver).BS(0, false);
        return Unit.LIZ;
    }
}
