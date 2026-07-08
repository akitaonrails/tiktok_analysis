package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS368S0200000_2;
import njp.a;

/* JADX INFO: renamed from: X.064W, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.utils.ShareHelper$shareVideo$2", f = "ShareHelper.kt", l = {438}, m = "invokeSuspend")
public final class C064W extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1369790lkX LLILLJJLI;
    public final /* synthetic */ SharePackage LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ Aweme LLILZLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLIZ;
    public final /* synthetic */ View LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C064W(InterfaceC1369790lkX interfaceC1369790lkX, SharePackage sharePackage, int i, Context context, Aweme aweme, Function1<? super Boolean, Unit> function1, View view, InterfaceC1364105Vn<? super C064W> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1369790lkX;
        this.LLILLL = sharePackage;
        this.LLILZ = i;
        this.LLILZIL = context;
        this.LLILZLL = aweme;
        this.LLIZ = function1;
        this.LLIZLLLIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C064W(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ShareHelper@8fdf.shareVideo$2");
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
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C064V c064v = new C064V(this.LLILZLL, this.LLILLL, this.LLILLJJLI, this.LLILZIL, this.LLIZLLLIL, this.LLILZ, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, abstractC2238408pq, c064v);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ShareHelper@8fdf.shareVideo$2");
                return objLJFF;
            }
        }
        C443120HZe c443120HZe = (C443120HZe) obj;
        String str = (String) c443120HZe.getFirst();
        boolean zBooleanValue = ((Boolean) c443120HZe.getSecond()).booleanValue();
        String str2 = (String) c443120HZe.getThird();
        if (zBooleanValue) {
            C1373550lqb c1373550lqb = C1373550lqb.LIZ;
            InterfaceC1369790lkX interfaceC1369790lkX = this.LLILLJJLI;
            SharePackage sharePackage = this.LLILLL;
            int i2 = this.LLILZ;
            Context context = this.LLILZIL;
            Aweme aweme = this.LLILZLL;
            c1373550lqb.getClass();
            if (str != null && C123100dR.LIZ(str)) {
                C1373540lqa c1373540lqa = C1373850lr5.LIZ;
                AwS368S0200000_2 awS368S0200000_2 = new AwS368S0200000_2(sharePackage, interfaceC1369790lkX, context, 0);
                c1373540lqa.getClass();
                C1373540lqa.LIZIZ(aweme, interfaceC1369790lkX, sharePackage, str, i2, str2, awS368S0200000_2);
            }
        }
        this.LLIZ.invoke(Boolean.valueOf(zBooleanValue));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareHelper@8fdf.shareVideo$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
