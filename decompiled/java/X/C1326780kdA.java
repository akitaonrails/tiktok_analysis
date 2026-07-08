package X;

import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceImageModel;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourcePreloadModel;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0kdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander$handlePreloadForUrls$1", f = "EcomResourceBystander.kt", l = {530}, m = "invokeSuspend")
public final class C1326780kdA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EcomResourceImageModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ EcomResourcePreloadModel LLILZIL;
    public final /* synthetic */ List<String> LLILZLL;
    public final /* synthetic */ InterfaceC1631630sYr<String, Boolean, String, C1326860kdI, Unit> LLIZ;
    public final /* synthetic */ C20160213uS LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ EnumC1335820krk LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ List<C1326860kdI> LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1326780kdA(EcomResourceImageModel ecomResourceImageModel, String str, long j, EcomResourcePreloadModel ecomResourcePreloadModel, List<String> list, InterfaceC1631630sYr<? super String, ? super Boolean, ? super String, ? super C1326860kdI, Unit> interfaceC1631630sYr, C20160213uS c20160213uS, String str2, String str3, EnumC1335820krk enumC1335820krk, boolean z, String str4, List<C1326860kdI> list2, InterfaceC1364105Vn<? super C1326780kdA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ecomResourceImageModel;
        this.LLILLL = str;
        this.LLILZ = j;
        this.LLILZIL = ecomResourcePreloadModel;
        this.LLILZLL = list;
        this.LLIZ = interfaceC1631630sYr;
        this.LLIZLLLIL = c20160213uS;
        this.LLJ = str2;
        this.LLJI = str3;
        this.LLJIJIL = enumC1335820krk;
        this.LLJILJIL = z;
        this.LLJILJILJ = str4;
        this.LLJILLL = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1326780kdA(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcomResourceBystander@3e02.handlePreloadForUrls$1");
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
            long jLongValue = this.LLILLJJLI.delayMs.longValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                C1C7U.LIZIZ("EcomResourceBystander@3e02.handlePreloadForUrls$1");
                return objLJFF;
            }
        }
        C1326660kcy c1326660kcy = C1326660kcy.LIZ;
        String str = this.LLILLL;
        long j = this.LLILZ;
        CopyOnWriteArrayList<C1326670kcz> copyOnWriteArrayList = C1326660kcy.LIZJ.get(str);
        if (copyOnWriteArrayList != null && C1326660kcy.LJFF(copyOnWriteArrayList, new C1326670kcz(null, null, Long.valueOf(j), 3)) != null) {
            EcomResourceBystander.LJIILL(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLILLJJLI, this.LLILLL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcomResourceBystander@3e02.handlePreloadForUrls$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
