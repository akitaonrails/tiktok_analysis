package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18VU, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.input.component.AiChatInputFeatureComponent$showKeyBoard$1", f = "AiChatInputFeatureComponent.kt", l = {490}, m = "invokeSuspend")
public final class C18VU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C18VZ LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18VU(C18VZ c18vz, boolean z, InterfaceC1364105Vn<? super C18VU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c18vz;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C18VU(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC21291818Ua interfaceC21291818UaLIZLLL;
        AnonymousClass0951 anonymousClass0951LIZJ;
        C1C7U.LIZ("AiChatInputFeatureComponent@26d0.showKeyBoard$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
            if (iAiChatFeatureService != null && (interfaceC21291818UaLIZLLL = iAiChatFeatureService.LIZLLL()) != null && (anonymousClass0951LIZJ = interfaceC21291818UaLIZLLL.LIZJ()) != null) {
                final C18VZ c18vz = this.LLILLJJLI;
                final boolean z = this.LLILLL;
                InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.18VW
                    @Override // X.InterfaceC346701Wf
                    public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                        if (((Boolean) obj2).booleanValue()) {
                            C18VZ.y8(c18vz, z, 0L, EnumC21295018Vg.UI_ACTION_OPEN_DEFAULT);
                        }
                        return Unit.LIZ;
                    }
                };
                this.LL = 1;
                if (anonymousClass0951LIZJ.collect(interfaceC346701Wf, this) == objLJFF) {
                    C1C7U.LIZIZ("AiChatInputFeatureComponent@26d0.showKeyBoard$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AiChatInputFeatureComponent@26d0.showKeyBoard$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
