package X;

import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ncs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment$onRestart$2", f = "TabStoreFragment.kt", l = {205, 207}, m = "invokeSuspend")
public final class C598000Ncs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TabStoreFragment LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598000Ncs(TabStoreFragment tabStoreFragment, boolean z, String str, InterfaceC1364105Vn<? super C598000Ncs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = tabStoreFragment;
        this.LLILLL = z;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598000Ncs(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TabStoreFragment@633c.onRestart$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.getClass();
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "close_profile_shop_preload", true, false) && !this.LLILLL) {
                TabStoreFragment tabStoreFragment = this.LLILLJJLI;
                String str = this.LLILZ;
                this.LL = 2;
                if (tabStoreFragment.RS(str, this) == objLJFF) {
                    C1C7U.LIZIZ("TabStoreFragment@633c.onRestart$2");
                    return objLJFF;
                }
            } else {
                TabStoreFragment tabStoreFragment2 = this.LLILLJJLI;
                String str2 = this.LLILZ;
                this.LL = 1;
                if (tabStoreFragment2.QS(str2, this) == objLJFF) {
                    C1C7U.LIZIZ("TabStoreFragment@633c.onRestart$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TabStoreFragment@633c.onRestart$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
