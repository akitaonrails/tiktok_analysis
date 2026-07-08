package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ErZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377790ErZ extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C377730ErT LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ AIGCGenerationParamType LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C377790ErZ(C377730ErT c377730ErT, String str, String str2, AIGCGenerationParamType aIGCGenerationParamType, Function0<Unit> function0) {
        super(1);
        this.LL = c377730ErT;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = aIGCGenerationParamType;
        this.LLILZIL = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        bool.booleanValue();
        InterfaceC377650ErL interfaceC377650ErLC5 = this.LL.C5();
        if (interfaceC377650ErLC5 != null) {
            interfaceC377650ErLC5.et1(this.LLILLJJLI, new C377390Eqv(false, true, false, false, 13));
        }
        InterfaceC377650ErL interfaceC377650ErLC52 = this.LL.C5();
        if (interfaceC377650ErLC52 != null) {
            interfaceC377650ErLC52.rX0(this.LLILLL, this.LLILZ, new C377390Eqv(false, true, false, false, 13));
        }
        this.LLILZIL.invoke();
        return Unit.LIZ;
    }
}
