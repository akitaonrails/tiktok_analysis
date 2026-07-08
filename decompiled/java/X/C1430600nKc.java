package X;

import com.ss.android.ugc.aweme.liveevent.LiveEventResponse;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.MultiAnchorPublishExtension$handleLiveEventAddClick$1", f = "MultiAnchorPublishExtension.kt", l = {1793}, m = "invokeSuspend")
public final class C1430600nKc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19510811Va LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1430600nKc(C19510811Va c19510811Va, InterfaceC1364105Vn<? super C1430600nKc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19510811Va;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1430600nKc(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiAnchorPublishExtension@182f.handleLiveEventAddClick$1");
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
            C0XQ7.LJ();
            String curUserId = C0XQ7.LIZ.LJIIJ().getCurUserId();
            C1433010nOV.LIZ.getClass();
            LiveEventResponse liveEventResponseLIZ = C1433010nOV.LIZ(curUserId);
            if (liveEventResponseLIZ != null) {
                this.LLILLJJLI.LLJL = new ArrayList(liveEventResponseLIZ.eventList);
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C1430590nKb c1430590nKb = new C1430590nKb(this.LLILLJJLI, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c1430590nKb) == objLJFF) {
                    C1C7U.LIZIZ("MultiAnchorPublishExtension@182f.handleLiveEventAddClick$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiAnchorPublishExtension@182f.handleLiveEventAddClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
