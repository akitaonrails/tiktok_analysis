package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDatabaseImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KwG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDatabaseImpl$deleteHighlight$2", f = "LiveRecordingsDatabaseImpl.kt", l = {}, m = "invokeSuspend")
public final class C533580KwG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LiveRecordingsDatabaseImpl LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533580KwG(LiveRecordingsDatabaseImpl liveRecordingsDatabaseImpl, long j, InterfaceC1364105Vn<? super C533580KwG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveRecordingsDatabaseImpl;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C533580KwG c533580KwG = new C533580KwG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c533580KwG.LL = obj;
        return c533580KwG;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveRecordingsDatabaseImpl@52f0.deleteHighlight$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        this.LLILLJJLI.LIZJ.remove(C2286608xc.LJFF(this.LLILLL));
        C2400609au.LIZLLL.remove(String.valueOf(this.LLILLL));
        C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ.plus(C2296908zH.LIZ()), null, new C533620KwK(this.LLILLJJLI, this.LLILLL, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveRecordingsDatabaseImpl@52f0.deleteHighlight$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
