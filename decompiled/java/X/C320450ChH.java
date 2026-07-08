package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationEntranceInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;
import njp.a;

/* JADX INFO: renamed from: X.0ChH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.multiconversation.TakoSubConversationGenerator$preloadWelcomeSubConversation$1", f = "TakoSubConversationGenerator.kt", l = {205}, m = "invokeSuspend")
public final class C320450ChH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320450ChH(int i, long j, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = i;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320450ChH(this.LLILLL, this.LLILLJJLI, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("TakoSubConversationGenerator@d807.preloadWelcomeSubConversation$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1863400yag c1863400yag = C1863400yag.LIZ;
            C844470XAv.LIZ.getClass();
            C1863380yae c1863380yaeLIZIZ = C1863400yag.LIZIZ(c1863400yag, C844470XAv.LIZ(), AFwS190S0000000_4.get$arr$(4186), null, null, null, null, null, this.LLILLJJLI, this.LLILLL, 0, 0, false, false, this.LLILZ, new SubConversationEntranceInfo(null, this.LLILZ, null, C2286608xc.LJ(5)), AFwS232S0000000_4.get$arr$(226), false, null, 408828);
            if (((Number) C1819607As.LIZ.getValue()).intValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = !z;
            this.LL = 1;
            if (C1863380yae.LJIJJ(c1863380yaeLIZIZ, z2, false, false, 0, null, z2, null, this, 185) == objLJFF) {
                C1C7U.LIZIZ("TakoSubConversationGenerator@d807.preloadWelcomeSubConversation$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoSubConversationGenerator@d807.preloadWelcomeSubConversation$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
