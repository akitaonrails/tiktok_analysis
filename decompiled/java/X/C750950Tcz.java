package X;

import Y.AfS148S0200000_12;
import com.bytedance.android.livesdk.function.MuteRuleApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tcz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.commonactionpanel.HotCommentMuteBehavior$itemClick$1$1", f = "HotCommentMuteBehavior.kt", l = {35}, m = "invokeSuspend")
public final class C750950Tcz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C750960Td0 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C750950Tcz(C750960Td0 c750960Td0, InterfaceC1364105Vn<? super C750950Tcz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c750960Td0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C750950Tcz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HotCommentMuteBehavior@967f.itemClick$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C480460Ism.LIZ().getClass();
                MuteRuleApi muteRuleApi = (MuteRuleApi) C480460Ism.LIZLLL(MuteRuleApi.class);
                long jLIZIZ = C500260Jjc.LIZIZ(this.LLILLJJLI.LLILZIL.LJIIIZ);
                long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(this.LLILLJJLI.LLILZIL.LJIIIZ);
                String str = this.LLILLJJLI.LLILZIL.LJIIJJI;
                this.LL = 1;
                obj = muteRuleApi.muteRuleCheck(jLIZIZ, jLJJLIIIJ, str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("HotCommentMuteBehavior@967f.itemClick$1$1");
                    return objLJFF;
                }
            }
            C751460Tdo.LIZIZ(this.LLILLJJLI.LLILZIL.LJIIIZ).LJJIIJZLJL(new AfS148S0200000_12(this.LLILLJJLI, (C470590Icr) obj, 69));
            InterfaceC752920TgA interfaceC752920TgA = this.LLILLJJLI.LLILLL;
            if (interfaceC752920TgA != null) {
                interfaceC752920TgA.dismiss();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C766270U4b.LIZLLL(2131837817);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HotCommentMuteBehavior@967f.itemClick$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
