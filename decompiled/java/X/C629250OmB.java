package X;

import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedAcceptResponse;
import com.ss.android.ugc.aweme.vibefeed.network.IVibeApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OmB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.repository.VibeFeedEntranceRepository$operator$1$acceptInvite$2", f = "VibeFeedEntranceRepository.kt", l = {65}, m = "invokeSuspend")
public final class C629250OmB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super VibeFeedAcceptResponse>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ EnumC912680ZrG LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C629250OmB(String str, String str2, String str3, EnumC912680ZrG enumC912680ZrG, InterfaceC1364105Vn<? super C629250OmB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = enumC912680ZrG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C629250OmB(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VibeFeedEntranceRepository@4cf1.operator$1$acceptInvite$2");
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
            String strLJII = C1575440r6E.LJII(this.LLILLJJLI);
            IVibeApi.LIZ.getClass();
            IVibeApi iVibeApiLIZ = C629310OmH.LIZ();
            if (iVibeApiLIZ != null) {
                String str = this.LLILLL;
                String str2 = this.LLILZ;
                int value = this.LLILZIL.getValue();
                this.LL = 1;
                obj = iVibeApiLIZ.acceptInvite(str, str2, value, strLJII, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("VibeFeedEntranceRepository@4cf1.operator$1$acceptInvite$2");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        C1C7U.LIZIZ("VibeFeedEntranceRepository@4cf1.operator$1$acceptInvite$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super VibeFeedAcceptResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
