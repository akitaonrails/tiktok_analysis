package X;

import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12HQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$initComposerNodes$2", f = "BeautySource.kt", l = {337}, m = "invokeSuspend")
public final class C12HQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C12HN LLILLL;
    public final /* synthetic */ ArrayList<BeautyCategory> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12HQ(C12HN c12hn, ArrayList<BeautyCategory> arrayList, InterfaceC1364105Vn<? super C12HQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c12hn;
        this.LLILZ = arrayList;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C12HQ c12hq = new C12HQ(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c12hq.LLILLJJLI = obj;
        return c12hq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BeautySource@786f.initComposerNodes$2");
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
            C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILLJJLI, C0PEM.LIZJ, null, new C12HO(this.LLILLL, this.LLILZ, null), 2);
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BeautySource@786f.initComposerNodes$2");
                return objLJFF;
            }
        }
        C12HN c12hn = this.LLILLL;
        C12HW.LIZ(c12hn, new C12HZ((C12HU) obj));
        c12hn.Be();
        c12hn.Ce();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BeautySource@786f.initComposerNodes$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
