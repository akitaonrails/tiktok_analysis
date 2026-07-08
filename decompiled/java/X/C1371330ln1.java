package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ln1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler$executeShare$1", f = "BaseChannelShareHandler.kt", l = {122}, m = "invokeSuspend")
public final class C1371330ln1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1371340ln2 LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ BaseSharePackage LLILZ;
    public final /* synthetic */ InterfaceC1369790lkX LLILZIL;
    public final /* synthetic */ BaseChannelShareHandler<BaseSharePackage> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1371330ln1(Context context, BaseChannelShareHandler baseChannelShareHandler, InterfaceC1371340ln2 interfaceC1371340ln2, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1371340ln2;
        this.LLILLL = context;
        this.LLILZ = baseSharePackage;
        this.LLILZIL = interfaceC1369790lkX;
        this.LLILZLL = baseChannelShareHandler;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        InterfaceC1371340ln2 interfaceC1371340ln2 = this.LLILLJJLI;
        return new C1371330ln1(this.LLILLL, this.LLILZLL, interfaceC1371340ln2, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ = obj;
        C1C7U.LIZ("BaseChannelShareHandler@1053.executeShare$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                C155000ia.LIZIZ(objLIZIZ);
                BaseChannelShareHandler<BaseSharePackage> baseChannelShareHandler = this.LLILZLL;
                InterfaceC1371340ln2 interfaceC1371340ln2 = this.LLILLJJLI;
                InterfaceC1369790lkX interfaceC1369790lkX = this.LLILZIL;
                C1373960lrG c1373960lrG = new C1373960lrG(this.LLILLL, baseChannelShareHandler, interfaceC1371340ln2, this.LLILZ, interfaceC1369790lkX, null);
                this.LL = 1;
                objLIZIZ = C2296908zH.LIZIZ(c1373960lrG, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("BaseChannelShareHandler@1053.executeShare$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC1371340ln2 interfaceC1371340ln22 = this.LLILLJJLI;
            if (interfaceC1371340ln22 != null) {
                interfaceC1371340ln22.LIZIZ(this.LLILLL, this.LLILZ, this.LLILZIL, new C1374170lrb(String.valueOf(e.getMessage()), 1));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseChannelShareHandler@1053.executeShare$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
