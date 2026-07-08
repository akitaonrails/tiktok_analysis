package X;

import android.content.Context;
import com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ln4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler$executeShare$1$1$preShareMediaJob$1", f = "BaseChannelShareHandler.kt", l = {138}, m = "invokeSuspend")
public final class C1371360ln4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String[]>, Object> {
    public int LL;
    public final /* synthetic */ BaseChannelShareHandler<BaseSharePackage> LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ InterfaceC1369790lkX LLILZ;
    public final /* synthetic */ BaseSharePackage LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1371360ln4(BaseChannelShareHandler<BaseSharePackage> baseChannelShareHandler, Context context, InterfaceC1369790lkX interfaceC1369790lkX, BaseSharePackage baseSharePackage, InterfaceC1364105Vn<? super C1371360ln4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseChannelShareHandler;
        this.LLILLL = context;
        this.LLILZ = interfaceC1369790lkX;
        this.LLILZIL = baseSharePackage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1371360ln4(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseChannelShareHandler@1053.executeShare$1$1$preShareMediaJob$1");
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
            BaseChannelShareHandler<BaseSharePackage> baseChannelShareHandler = this.LLILLJJLI;
            Context context = this.LLILLL;
            InterfaceC1369790lkX interfaceC1369790lkX = this.LLILZ;
            BaseSharePackage baseSharePackage = this.LLILZIL;
            this.LL = 1;
            obj = baseChannelShareHandler.LJIIJ(context, baseSharePackage, interfaceC1369790lkX, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaseChannelShareHandler@1053.executeShare$1$1$preShareMediaJob$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BaseChannelShareHandler@1053.executeShare$1$1$preShareMediaJob$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String[]> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
