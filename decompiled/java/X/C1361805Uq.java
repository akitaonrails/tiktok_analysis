package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05Uq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.factory.ComposePagerSignupManager$updateComposePager$1$1$1$1", f = "ComposePagerSignupManager.kt", l = {190}, m = "invokeSuspend")
public final class C1361805Uq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1665500tRU<String> LLILLJJLI;
    public final /* synthetic */ AbstractC1690640u62 LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1361805Uq(InterfaceC1665500tRU<String> interfaceC1665500tRU, AbstractC1690640u62 abstractC1690640u62, String str, InterfaceC1364105Vn<? super C1361805Uq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1665500tRU;
        this.LLILLL = abstractC1690640u62;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1361805Uq(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ComposePagerSignupManager@c5c3.updateComposePager$1$1$1$1");
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
            InterfaceC1665500tRU<String> interfaceC1665500tRU = this.LLILLJJLI;
            String str = this.LLILZ;
            Iterator<String> it2 = interfaceC1665500tRU.iterator();
            int i2 = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next(), str)) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            AbstractC1690640u62 abstractC1690640u62 = this.LLILLL;
            this.LL = 1;
            if (AbstractC1690640u62.LJIJJLI(abstractC1690640u62, i2, this) == objLJFF) {
                C1C7U.LIZIZ("ComposePagerSignupManager@c5c3.updateComposePager$1$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ComposePagerSignupManager@c5c3.updateComposePager$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
