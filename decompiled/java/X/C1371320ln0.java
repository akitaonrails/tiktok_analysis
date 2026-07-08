package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ln0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler$handle$1", f = "BaseChannelShareHandler.kt", l = {60}, m = "invokeSuspend")
public final class C1371320ln0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BaseChannelShareHandler<T> LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ BaseSharePackage LLILZIL;
    public final /* synthetic */ InterfaceC1369790lkX LLILZLL;
    public final /* synthetic */ View LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1371320ln0(BaseChannelShareHandler<T> baseChannelShareHandler, Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, View view, InterfaceC1364105Vn<? super C1371320ln0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = baseChannelShareHandler;
        this.LLILZ = context;
        this.LLILZIL = baseSharePackage;
        this.LLILZLL = interfaceC1369790lkX;
        this.LLIZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1371320ln0 c1371320ln0 = new C1371320ln0(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1371320ln0.LLILLJJLI = obj;
        return c1371320ln0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1371340ln2 interfaceC1371340ln2LJFF;
        Object objLJLIIIL = obj;
        C1C7U.LIZ("BaseChannelShareHandler@1053.handle$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC1371340ln2LJFF = (InterfaceC1371340ln2) this.LLILLJJLI;
                C155000ia.LIZIZ(objLJLIIIL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJLIIIL);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            interfaceC1371340ln2LJFF = this.LLILLL.LJFF();
            if (interfaceC1371340ln2LJFF != null) {
                interfaceC1371340ln2LJFF.LIZ(this.LLILZ, this.LLILZIL, this.LLILZLL);
            }
            C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1371310lmz(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, null), 3);
            this.LLILLJJLI = interfaceC1371340ln2LJFF;
            this.LL = 1;
            objLJLIIIL = c099gLIZIZ.LJLIIIL(this);
            if (objLJLIIIL == objLJFF) {
                C1C7U.LIZIZ("BaseChannelShareHandler@1053.handle$1");
                return objLJFF;
            }
        }
        if (((Boolean) objLJLIIIL).booleanValue()) {
            BaseChannelShareHandler<T> baseChannelShareHandler = this.LLILLL;
            InterfaceC1369790lkX interfaceC1369790lkX = this.LLILZLL;
            Context context = this.LLILZ;
            BaseSharePackage baseSharePackage = this.LLILZIL;
            baseChannelShareHandler.getClass();
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1371330ln1(context, baseChannelShareHandler, interfaceC1371340ln2LJFF, baseSharePackage, interfaceC1369790lkX, null), 3);
        } else if (interfaceC1371340ln2LJFF != null) {
            interfaceC1371340ln2LJFF.LIZIZ(this.LLILZ, this.LLILZIL, this.LLILZLL, new C1374170lrb("pre share intercept", 1));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseChannelShareHandler@1053.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
