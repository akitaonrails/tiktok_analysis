package X;

import com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageListComponent;

/* JADX INFO: renamed from: X.0NZ7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageListComponent", f = "PigeonMessageListComponent.kt", l = {197}, m = "configConversationChange")
public final class C0NZ7 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PigeonMessageListComponent LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NZ7(PigeonMessageListComponent pigeonMessageListComponent, InterfaceC1364105Vn<? super C0NZ7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = pigeonMessageListComponent;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PigeonMessageListComponent@9fc5.configConversationChange$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJLIIIJJI = this.LLILLJJLI.LJJLIIIJJI(this);
        C1C7U.LIZIZ("PigeonMessageListComponent@9fc5.configConversationChange$1");
        return objLJJLIIIJJI;
    }
}
