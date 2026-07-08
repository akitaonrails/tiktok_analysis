package X;

import com.ss.android.ugc.aweme.im.messagelist.protocols.ShareLiveCardAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ZZY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.protocols.ShareLiveCardAssem$resetLivePlayer$1", f = "ShareLiveMessageProtocol.kt", l = {465}, m = "invokeSuspend")
public final class C0ZZY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ShareLiveCardAssem LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C0ZZ3 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZZY(ShareLiveCardAssem shareLiveCardAssem, String str, C0ZZ3 c0zz3, InterfaceC1364105Vn<? super C0ZZY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = shareLiveCardAssem;
        this.LLILLL = str;
        this.LLILZ = c0zz3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZZY(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareLiveCardAssem@cf68.resetLivePlayer$1");
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
            long j = this.LLILLJJLI.LLLL;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ShareLiveCardAssem@cf68.resetLivePlayer$1");
                return objLJFF;
            }
        }
        if (Intrinsics.LJFF(this.LLILLJJLI.yp().LLIZLLLIL.getValue(), this.LLILLL)) {
            this.LLILLJJLI.Fp(((C0ZZB) this.LLILZ).LIZJ.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareLiveCardAssem@cf68.resetLivePlayer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
