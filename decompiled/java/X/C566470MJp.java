package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.router.UploadActionInterceptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MJp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.router.UploadActionInterceptor$onInterceptRoute$1", f = "UploadActionInterceptor.kt", l = {134, 138}, m = "invokeSuspend")
public final class C566470MJp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ UploadActionInterceptor LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Bundle LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C566470MJp(UploadActionInterceptor uploadActionInterceptor, Context context, String str, Bundle bundle, long j, boolean z, long j2, String str2, String str3, String str4, InterfaceC1364105Vn<? super C566470MJp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = uploadActionInterceptor;
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = bundle;
        this.LLILZLL = j;
        this.LLIZ = z;
        this.LLIZLLLIL = j2;
        this.LLJ = str2;
        this.LLJI = str3;
        this.LLJIJIL = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C566470MJp(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJ = obj;
        C1C7U.LIZ("UploadActionInterceptor@7bd5.onInterceptRoute$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("UploadActionInterceptor@7bd5.onInterceptRoute$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJ);
        } else {
            C155000ia.LIZIZ(objLJ);
            UploadActionInterceptor uploadActionInterceptor = this.LLILLJJLI;
            Context context = this.LLILLL;
            String str = this.LLILZ;
            Bundle bundle = this.LLILZIL;
            long j = this.LLILZLL;
            this.LL = 1;
            uploadActionInterceptor.getClass();
            objLJ = C2296808zG.LJ(new C575970MiR(uploadActionInterceptor, bundle, j, str, context, null), this);
            if (objLJ == objLJFF) {
                C1C7U.LIZIZ("UploadActionInterceptor@7bd5.onInterceptRoute$1");
                return objLJFF;
            }
        }
        Bundle bundle2 = (Bundle) objLJ;
        if (this.LLIZ && this.LLIZLLLIL > 0) {
            C577580Ml2.LIZ.LJ(System.currentTimeMillis() - this.LLIZLLLIL);
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C575990MiT c575990MiT = new C575990MiT(this.LLILLL, this.LLIZ, this.LLILLJJLI, this.LLILZ, this.LLJ, this.LLJI, this.LLJIJIL, bundle2, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c575990MiT) == objLJFF) {
            C1C7U.LIZIZ("UploadActionInterceptor@7bd5.onInterceptRoute$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("UploadActionInterceptor@7bd5.onInterceptRoute$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
