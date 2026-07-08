package X;

import com.bytedance.android.livesdk.sei.VoiceChatSeiAppData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bHp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967590bHp extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC954180awC LL;
    public final /* synthetic */ C945320ahu LLILLJJLI;
    public final /* synthetic */ VoiceChatSeiAppData LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967590bHp(InterfaceC954180awC interfaceC954180awC, C945320ahu c945320ahu, VoiceChatSeiAppData voiceChatSeiAppData) {
        super(0);
        this.LL = interfaceC954180awC;
        this.LLILLJJLI = c945320ahu;
        this.LLILLL = voiceChatSeiAppData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJJLIIIJ(this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
