package X;

import android.os.Message;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hq1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.trendinghashtag.MusicChartVideoListModel$fetchList$1", f = "MusicChartVideoListModel.kt", l = {51}, m = "invokeSuspend")
public final class C1219430hq1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1243280iSU LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219430hq1(C1243280iSU c1243280iSU, int i, InterfaceC1364105Vn<? super C1219430hq1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1243280iSU;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1219430hq1(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicChartVideoListModel@a063.fetchList$1");
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
            C1243280iSU c1243280iSU = this.LLILLJJLI;
            String str = c1243280iSU.LL;
            int i2 = this.LLILLL;
            String str2 = c1243280iSU.LLILLJJLI;
            this.LL = 1;
            obj = c1243280iSU.LJIIJJI(i2, str, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MusicChartVideoListModel@a063.fetchList$1");
                return objLJFF;
            }
        }
        Message message = new Message();
        message.obj = obj;
        this.LLILLJJLI.mHandler.sendMessage(message);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicChartVideoListModel@a063.fetchList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
