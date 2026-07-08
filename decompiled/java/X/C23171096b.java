package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.service.TemplateMediaServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.096b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.TemplateMediaServiceImpl$compressSingleVideo$2", f = "TemplateMediaServiceImpl.kt", l = {149}, m = "invokeSuspend")
public final class C23171096b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ TemplateMediaServiceImpl LLILZLL;
    public final /* synthetic */ Context LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23171096b(TemplateMediaServiceImpl templateMediaServiceImpl, Context context, String str, String str2, String str3, int i, InterfaceC1364105Vn<? super C23171096b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = templateMediaServiceImpl;
        this.LLIZ = context;
        this.LLIZLLLIL = str;
        this.LLJ = str2;
        this.LLJI = str3;
        this.LLJIJIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23171096b(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateMediaServiceImpl@c2fb.compressSingleVideo$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            TemplateMediaServiceImpl templateMediaServiceImpl = this.LLILZLL;
            Context context = this.LLIZ;
            String str = this.LLIZLLLIL;
            String str2 = this.LLJ;
            String str3 = this.LLJI;
            int i2 = this.LLJIJIL;
            this.LL = context;
            this.LLILLJJLI = str;
            this.LLILLL = str2;
            this.LLILZ = str3;
            this.LLILZIL = 1;
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            templateMediaServiceImpl.LIZIZ(context, str, str2, C096Y.VIDEO, new C23177096h(str3, new int[]{0}, new int[]{i2}, new InterfaceC352560Dry() { // from class: X.096c
                @Override // X.InterfaceC352560Dry
                public final void LIZJ(C352570Drz c352570Drz) {
                }

                @Override // X.InterfaceC352560Dry
                public final void onProgress(float f) {
                }

                @Override // X.InterfaceC352560Dry
                public final void LIZIZ(String str4, String str5) {
                    C2473009ma c2473009ma = C2473009ma.LIZ;
                    C0VSJ c0vsj = new C0VSJ(str5);
                    c2473009ma.getClass();
                    C2473009ma.LJIIIIZZ(c0vsj);
                }

                @Override // X.InterfaceC352560Dry
                public final void LJJI(String str4, String str5) {
                    try {
                        InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = c23260099m;
                        Boolean bool = Boolean.TRUE;
                        C189200o6.m2constructorimpl(bool);
                        interfaceC1364105Vn.resumeWith(bool);
                    } catch (IllegalStateException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C201955140j.LJII(C1398350mUb.LIZIZ, "compressSingleVideo onSuccess resume failed");
                    }
                }

                @Override // X.InterfaceC352560Dry
                public final void LIZ(String str4, String str5, String str6) {
                    C2473009ma c2473009ma = C2473009ma.LIZ;
                    C0VSJ c0vsj = new C0VSJ(str5);
                    c2473009ma.getClass();
                    C2473009ma.LJIIIIZZ(c0vsj);
                    try {
                        InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = c23260099m;
                        Boolean bool = Boolean.TRUE;
                        C189200o6.m2constructorimpl(bool);
                        interfaceC1364105Vn.resumeWith(bool);
                    } catch (IllegalStateException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C201955140j.LJII(C1398350mUb.LIZIZ, "compressSingleVideo onError resume failed");
                    }
                }
            }));
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TemplateMediaServiceImpl@c2fb.compressSingleVideo$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TemplateMediaServiceImpl@c2fb.compressSingleVideo$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
