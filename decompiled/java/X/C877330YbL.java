package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.service.IMInboxBatchActionServiceImpl$batchChangeConvSettingInfo$1", f = "IMInboxBatchActionServiceImpl.kt", l = {105}, m = "invokeSuspend")
public final class C877330YbL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC879010Ye3 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ EnumC885270Yo9 LLILZ;
    public final /* synthetic */ Activity LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C877330YbL(InterfaceC879010Ye3 interfaceC879010Ye3, String str, EnumC885270Yo9 enumC885270Yo9, Activity activity, boolean z, boolean z2, Function0<Unit> function0, InterfaceC1364105Vn<? super C877330YbL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC879010Ye3;
        this.LLILLL = str;
        this.LLILZ = enumC885270Yo9;
        this.LLILZIL = activity;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C877330YbL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C878950Ydx c878950Ydx;
        C1C7U.LIZ("IMInboxBatchActionServiceImpl@e929.batchChangeConvSettingInfo$1");
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
            C877320YbK c877320YbK = C877320YbK.LIZ;
            InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLJJLI;
            if (interfaceC879010Ye3 instanceof C878950Ydx) {
                c878950Ydx = (C878950Ydx) interfaceC879010Ye3;
            } else {
                c878950Ydx = null;
            }
            c877320YbK.getClass();
            List listLJIIIZ = C877320YbK.LJIIIZ(c878950Ydx);
            if (listLJIIIZ == null) {
                listLJIIIZ = C13BV.INSTANCE;
            }
            IMChatListApi.LJJIII.getClass();
            C890330YwJ.LIZ().LIZIZ().LJ(listLJIIIZ.size(), this.LLILLL, "direct_click", this.LLILZ.getBatchActionTypeMobValue(), C877320YbK.LJIIJ(this.LLILLJJLI));
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C877340YbM c877340YbM = new C877340YbM(this.LLILZ, this.LLILZIL, this.LLILLL, listLJIIIZ, this.LLILLJJLI, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c877340YbM) == objLJFF) {
                C1C7U.LIZIZ("IMInboxBatchActionServiceImpl@e929.batchChangeConvSettingInfo$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMInboxBatchActionServiceImpl@e929.batchChangeConvSettingInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
