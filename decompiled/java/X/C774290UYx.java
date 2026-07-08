package X;

import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.bytedance.bpea.basics.Cert;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UYx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C774290UYx extends C2217421BqW implements Function1<Cert, Unit> {
    public C774290UYx(Object obj) {
        super(1, obj, VoiceChatBroadcastFragment.class, "onFinishBroadcastConfirmClick", "onFinishBroadcastConfirmClick(Lcom/bytedance/bpea/basics/Cert;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Cert cert) {
        ((VoiceChatBroadcastFragment) this.receiver).zS();
        return Unit.LIZ;
    }
}
