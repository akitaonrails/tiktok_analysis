package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tts.pigeon.paas.detailpage.container.PigeonConversationDetailContainer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0YXc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C875740YXc extends C09AY implements InterfaceC1631630sYr<String, PigeonConversationDetailContainer, C0YXO, CompletionBlock<InterfaceC875750YXd>, Unit> {
    public final /* synthetic */ C0YY7 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C875740YXc(C0YY7 c0yy7) {
        super(4);
        this.LL = c0yy7;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(String str, PigeonConversationDetailContainer pigeonConversationDetailContainer, C0YXO c0yxo, CompletionBlock<InterfaceC875750YXd> completionBlock) {
        String str2 = str;
        CompletionBlock<InterfaceC875750YXd> completionBlock2 = completionBlock;
        InterfaceC866540Xz2 interfaceC866540Xz2LJFF = c0yxo.LLILZIL.getPigeonIMClient().LIZIZ.LJFF(this.LL.getConversationId());
        Map<String, Object> ext = this.LL.getExt();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : ext.entrySet()) {
            if (entry.getValue() instanceof String) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
        }
        interfaceC866540Xz2LJFF.LJJLIIIJLLLLLLLZ(linkedHashMap2, new C914110ZtZ(completionBlock2, str2, 1));
        return Unit.LIZ;
    }
}
