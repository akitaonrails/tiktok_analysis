package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05na, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.fakewrite.IMMockConvAvatarCacheManager$loadLocalAvatar$1", f = "IMMockConvAvatarCacheManager.kt", l = {189, 190}, m = "invokeSuspend")
public final class C1460005na extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AbstractC1460205nc LLILZIL;
    public final /* synthetic */ C1322110kVd LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Resources LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1460005na(AbstractC1460205nc abstractC1460205nc, C1322110kVd c1322110kVd, String str, Resources resources, InterfaceC1364105Vn<? super C1460005na> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = abstractC1460205nc;
        this.LLILZLL = c1322110kVd;
        this.LLIZ = str;
        this.LLIZLLLIL = resources;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1460005na c1460005na = new C1460005na(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1460005na.LLILZ = obj;
        return c1460005na;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1322110kVd c1322110kVd;
        String str;
        Resources resources;
        Object objLJLIIIL = obj;
        C1C7U.LIZ("IMMockConvAvatarCacheManager@3db3.loadLocalAvatar$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJLIIIL);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("IMMockConvAvatarCacheManager@3db3.loadLocalAvatar$1");
                return unit;
            }
            resources = (Resources) this.LLILLJJLI;
            str = (String) this.LL;
            c1322110kVd = (C1322110kVd) this.LLILZ;
            C155000ia.LIZIZ(objLJLIIIL);
        } else {
            C155000ia.LIZIZ(objLJLIIIL);
            AbstractC1460205nc abstractC1460205nc = this.LLILZIL;
            c1322110kVd = this.LLILZLL;
            str = this.LLIZ;
            resources = this.LLIZLLLIL;
            C05XL<Bitmap> c05xl = ((C1460105nb) abstractC1460205nc).LIZ;
            this.LLILZ = c1322110kVd;
            this.LL = str;
            this.LLILLJJLI = resources;
            this.LLILLL = 1;
            objLJLIIIL = c05xl.LJLIIIL(this);
            if (objLJLIIIL == objLJFF) {
                C1C7U.LIZIZ("IMMockConvAvatarCacheManager@3db3.loadLocalAvatar$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1460605ng c1460605ng = new C1460605ng(c1322110kVd, str, (Bitmap) objLJLIIIL, resources, null);
        this.LLILZ = null;
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1460605ng) == objLJFF) {
            C1C7U.LIZIZ("IMMockConvAvatarCacheManager@3db3.loadLocalAvatar$1");
            return objLJFF;
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMMockConvAvatarCacheManager@3db3.loadLocalAvatar$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
