package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS3S1300100_27;
import njp.a;

/* JADX INFO: renamed from: X.0yOr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.tako.SearchTakoRouteWrapper$openWithTryOnGallery$1$1", f = "SearchTakoRouteWrapper.kt", l = {351, 353}, m = "invokeSuspend")
public final class C1856070yOr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ List<C1853170yKB> LLILZ;
    public final /* synthetic */ AnonymousClass0957<String> LLILZIL;
    public final /* synthetic */ AnonymousClass0957<String> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ C1856090yOt LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Context LLJI;
    public final /* synthetic */ long LLJIJIL;
    public final /* synthetic */ C1318505Dz LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1856070yOr(List<C1853170yKB> list, AnonymousClass0957<String> anonymousClass0957, AnonymousClass0957<String> anonymousClass09572, Function0<Unit> function0, C1856090yOt c1856090yOt, String str, Context context, long j, C1318505Dz c1318505Dz, String str2, InterfaceC1364105Vn<? super C1856070yOr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
        this.LLILZIL = anonymousClass0957;
        this.LLILZLL = anonymousClass09572;
        this.LLIZ = function0;
        this.LLIZLLLIL = c1856090yOt;
        this.LLJ = str;
        this.LLJI = context;
        this.LLJIJIL = j;
        this.LLJILJIL = c1318505Dz;
        this.LLJILJILJ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1856070yOr(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Collection collection;
        Object obj2;
        Collection collection2;
        String str;
        Object objLJLIIIL = obj;
        C1C7U.LIZ("SearchTakoRouteWrapper@fad0.openWithTryOnGallery$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    obj2 = this.LLILLJJLI;
                    Collection collection3 = (Collection) this.LL;
                    C155000ia.LIZIZ(objLJLIIIL);
                    collection2 = collection3;
                    str = (String) objLJLIIIL;
                    if (str == null && str.length() > 0) {
                        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                        c13dvLIZIZ.add(obj2);
                        c13dvLIZIZ.addAll(collection2);
                        c13dvLIZIZ.add(str);
                        List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
                        Function0<Unit> function0 = this.LLIZ;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        C1856090yOt c1856090yOt = this.LLIZLLLIL;
                        C682830QqP.LIZ(c1856090yOt.LJFF, this.LLJ, new AwS3S1300100_27(this.LLJIJIL, (long) this.LLJILJIL, (C1318505Dz) listLIZ, (List<String>) c1856090yOt, (C1856090yOt) this.LLJILJILJ, (String) 1)).LJII(this.LLJI);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("SearchTakoRouteWrapper@fad0.openWithTryOnGallery$1$1");
                        return unit;
                    }
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("SearchTakoRouteWrapper@fad0.openWithTryOnGallery$1$1");
                    return unit2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Collection collection4 = (Collection) this.LL;
            C155000ia.LIZIZ(objLJLIIIL);
            collection = collection4;
        } else {
            C155000ia.LIZIZ(objLJLIIIL);
            List<C1853170yKB> list = this.LLILZ;
            ArrayList arrayList = new ArrayList();
            for (C1853170yKB c1853170yKB : list) {
                String str2 = c1853170yKB.LIZIZ;
                if (c1853170yKB.LIZ() && str2.length() > 0) {
                    arrayList.add(str2);
                }
            }
            if (!arrayList.isEmpty()) {
                AnonymousClass0957<String> anonymousClass0957 = this.LLILZIL;
                this.LL = arrayList;
                this.LLILLL = 1;
                objLJLIIIL = anonymousClass0957.LJLIIIL(this);
                collection = arrayList;
                if (objLJLIIIL == objLJFF) {
                    C1C7U.LIZIZ("SearchTakoRouteWrapper@fad0.openWithTryOnGallery$1$1");
                    return objLJFF;
                }
            } else {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("SearchTakoRouteWrapper@fad0.openWithTryOnGallery$1$1");
                return unit3;
            }
        }
        String str3 = (String) objLJLIIIL;
        if (str3 != null && str3.length() > 0) {
            AnonymousClass0957<String> anonymousClass09572 = this.LLILZLL;
            this.LL = collection;
            this.LLILLJJLI = str3;
            this.LLILLL = 2;
            Object objLJLIIIL2 = anonymousClass09572.LJLIIIL(this);
            if (objLJLIIIL2 == objLJFF) {
                C1C7U.LIZIZ("SearchTakoRouteWrapper@fad0.openWithTryOnGallery$1$1");
                return objLJFF;
            }
            obj2 = str3;
            objLJLIIIL = objLJLIIIL2;
            collection2 = collection;
            str = (String) objLJLIIIL;
            if (str == null) {
            }
            Unit unit22 = Unit.LIZ;
            C1C7U.LIZIZ("SearchTakoRouteWrapper@fad0.openWithTryOnGallery$1$1");
            return unit22;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("SearchTakoRouteWrapper@fad0.openWithTryOnGallery$1$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
