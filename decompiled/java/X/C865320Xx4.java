package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS33S1110000_14;
import njp.a;

/* JADX INFO: renamed from: X.0Xx4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationSettingsManager$setMute$$inlined$scopedIO$1", f = "DefaultConversationSettingsManager.kt", l = {75, 78}, m = "invokeSuspend")
public final class C865320Xx4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<C0Y8T>>, Object> {
    public int LL;
    public final /* synthetic */ Map LLILLJJLI;
    public final /* synthetic */ C865340Xx6 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865320Xx4(InterfaceC1364105Vn interfaceC1364105Vn, Map map, C865340Xx6 c865340Xx6, String str, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = map;
        this.LLILLL = c865340Xx6;
        this.LLILZ = str;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865320Xx4(interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<C0Y8T>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultConversationSettingsManager@6c8c.setMute$$inlined$scopedIO$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI.isEmpty()) {
                AwS33S1110000_14 awS33S1110000_14 = new AwS33S1110000_14(this.LLILLL, this.LLILZ, this.LLILZIL, 2);
                this.LL = 1;
                obj = C867000Xzm.LIZ(this, awS33S1110000_14);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("DefaultConversationSettingsManager@6c8c.setMute$$inlined$scopedIO$1");
                    return objLJFF;
                }
            } else {
                C865330Xx5 c865330Xx5 = new C865330Xx5(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILLJJLI);
                this.LL = 2;
                obj = C867000Xzm.LIZ(this, c865330Xx5);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("DefaultConversationSettingsManager@6c8c.setMute$$inlined$scopedIO$1");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("DefaultConversationSettingsManager@6c8c.setMute$$inlined$scopedIO$1");
        return obj;
    }
}
