package X;

import Y.AgS289S0100000_8;
import com.ss.android.ugc.aweme.aigc.FileServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.b;
import njp.a;

/* JADX INFO: renamed from: X.0LN1, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.FileServiceImpl$downloadToCache$1$collectBlock$1", f = "FileServiceImpl.kt", l = {231}, m = "invokeSuspend")
public final class C0LN1 extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FileServiceImpl LLILLJJLI;
    public final /* synthetic */ C0LN8 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ InterfaceC332260D0u<C0LN4<String>> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LN1(int i, FileServiceImpl fileServiceImpl, C0LN8 c0ln8, String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC332260D0u interfaceC332260D0u) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = fileServiceImpl;
        this.LLILLL = c0ln8;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = i;
        this.LLIZ = str3;
        this.LLIZLLLIL = interfaceC332260D0u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LN1(this.LLILZLL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLIZ, interfaceC1364105Vn, this.LLIZLLLIL);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FileServiceImpl@6a32.downloadToCache$1$collectBlock$1");
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
            FileServiceImpl fileServiceImpl = this.LLILLJJLI;
            C0LN8 c0ln8 = this.LLILLL;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            int i2 = this.LLILZLL;
            String str3 = this.LLIZ;
            fileServiceImpl.getClass();
            b bVarLJ = C09IC.LJ(new C541860LMy(fileServiceImpl, c0ln8, str3, str2, str, i2, null));
            AgS289S0100000_8 agS289S0100000_8 = new AgS289S0100000_8(this.LLIZLLLIL, 41);
            this.LL = 1;
            if (bVarLJ.collect(agS289S0100000_8, this) == objLJFF) {
                C1C7U.LIZIZ("FileServiceImpl@6a32.downloadToCache$1$collectBlock$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FileServiceImpl@6a32.downloadToCache$1$collectBlock$1");
        return unit;
    }
}
