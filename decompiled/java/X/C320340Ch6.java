package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import defpackage.k9;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Ch6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.model.conversation.ConversationModel$handleSug$2", f = "ConversationModel.kt", l = {728, 729}, m = "invokeSuspend")
public final class C320340Ch6 extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1863380yae LLILLJJLI;
    public final /* synthetic */ TakoSug LLILLL;
    public final /* synthetic */ k9 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320340Ch6(C1863380yae c1863380yae, TakoSug takoSug, k9 k9Var, InterfaceC1364105Vn<? super C320340Ch6> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1863380yae;
        this.LLILLL = takoSug;
        this.LLILZ = k9Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320340Ch6(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJJLIIIJLJLI = obj;
        C1C7U.LIZ("ConversationModel@ae6d.handleSug$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJJLIIIJLJLI);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ConversationModel@ae6d.handleSug$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJJLIIIJLJLI);
        } else {
            C155000ia.LIZIZ(objLJJLIIIJLJLI);
            C1863380yae c1863380yae = this.LLILLJJLI;
            this.LL = 1;
            objLJJLIIIJLJLI = c1863380yae.LJIILL.LJJLIIIJLJLI(c1863380yae, this);
            if (objLJJLIIIJLJLI == objLJFF) {
                C1C7U.LIZIZ("ConversationModel@ae6d.handleSug$2");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) objLJJLIIIJLJLI).booleanValue();
        C2252331DDr c2252331DDr = this.LLILLJJLI.LJIJ;
        TakoSug takoSugLIZ = TakoSug.LIZ(this.LLILLL, false, null, null, 0L, null, false, zBooleanValue, this.LLILZ, 0, 0L, null, false, false, false, null, -25165825, 31);
        this.LL = 2;
        if (c2252331DDr.emit(takoSugLIZ, this) == objLJFF) {
            C1C7U.LIZIZ("ConversationModel@ae6d.handleSug$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ConversationModel@ae6d.handleSug$2");
        return unit2;
    }
}
