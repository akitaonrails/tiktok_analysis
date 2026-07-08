package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hyE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.im.contact.selector.impl.utils.ContactSelectorPreloadHelper$tryPreRefresh$1", f = "ContactSelectorPreloadHelper.kt", l = {37}, m = "invokeSuspend")
public final class C1224520hyE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<InterfaceC1224210hxj> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C1224530hyF LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1224520hyE(List<? extends InterfaceC1224210hxj> list, int i, C1224530hyF c1224530hyF, InterfaceC1364105Vn<? super C1224520hyE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = i;
        this.LLILZ = c1224530hyF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1224520hyE(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContactSelectorPreloadHelper@82ed.tryPreRefresh$1");
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
            InterfaceC1224180hxg interfaceC1224180hxgLIZIZ = ((InterfaceC1224210hxj) ListProtector.get(this.LLILLJJLI, this.LLILLL)).LIZIZ();
            this.LL = 1;
            obj = interfaceC1224180hxgLIZIZ.LJJIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ContactSelectorPreloadHelper@82ed.tryPreRefresh$1");
                return objLJFF;
            }
        }
        this.LLILZ.LJ.LJJLIIIJILLIZJL(obj);
        InterfaceC1224480hyA interfaceC1224480hyALJII = this.LLILZ.LIZ.LJII();
        if (interfaceC1224480hyALJII != null) {
            interfaceC1224480hyALJII.LJII();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ContactSelectorPreloadHelper@82ed.tryPreRefresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
