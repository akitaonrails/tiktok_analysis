package X;

import com.ss.android.ugc.tools.chat.message.component.AiChatMessageInfraComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Zer, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904990Zer extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ AiChatMessageInfraComponent LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C904990Zer(AiChatMessageInfraComponent aiChatMessageInfraComponent, long j) {
        super(1);
        this.LL = aiChatMessageInfraComponent;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        num.intValue();
        this.LL.P4(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
