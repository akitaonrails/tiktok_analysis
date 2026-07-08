package X;

import com.bytedance.im.core.proto.BatchUpdateConversationParticipantResponseBody;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0XxK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C865480XxK extends C09AY implements Function1<InterfaceC863600XuI<BatchUpdateConversationParticipantResponseBody>, Unit> {
    public final /* synthetic */ C865530XxP LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<Long> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865480XxK(C865530XxP c865530XxP, String str, List<Long> list, int i, Map<String, String> map) {
        super(1);
        this.LL = c865530XxP;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = i;
        this.LLILZIL = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC863600XuI<BatchUpdateConversationParticipantResponseBody> interfaceC863600XuI) {
        this.LL.LIZIZ.invoke(this.LLILLJJLI).LLIILII(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC863600XuI);
        return Unit.LIZ;
    }
}
