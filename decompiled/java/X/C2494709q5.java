package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09q5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.nextstep.interceptor.Check4KVideoInterceptor$intercept$contains4K$1", f = "Check4KVideoInterceptor.kt", l = {}, m = "invokeSuspend")
public final class C2494709q5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C2494909q7 LL;
    public final /* synthetic */ List<TikTokMediaModel> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2494709q5(C2494909q7 c2494909q7, List<? extends TikTokMediaModel> list, InterfaceC1364105Vn<? super C2494709q5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2494909q7;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2494709q5(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("Check4KVideoInterceptor@473b.intercept$contains4K$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2494909q7 c2494909q7 = this.LL;
        List<TikTokMediaModel> list = this.LLILLJJLI;
        c2494909q7.getClass();
        Iterator<TikTokMediaModel> it2 = list.iterator();
        while (true) {
            z = false;
            if (!it2.hasNext()) {
                break;
            }
            TikTokMediaModel next = it2.next();
            C533730KwV c533730KwV = C533730KwV.LIZ;
            String strLJFF = next.LJFF();
            c533730KwV.getClass();
            if (!C533730KwV.LJIIJ(strLJFF)) {
                int i = next.width;
                int i2 = next.height;
                if (i <= 0 || i2 <= 0) {
                    int[] iArr = new int[10];
                    if (C574790MgX.LIZIZ(next.LJFF(), iArr) == 0) {
                        i = iArr[0];
                        i2 = iArr[1];
                        next.width = i;
                        next.height = i2;
                    }
                }
                if (Math.min(i, i2) > 1100) {
                    z = true;
                    break;
                }
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("Check4KVideoInterceptor@473b.intercept$contains4K$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
