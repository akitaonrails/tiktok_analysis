package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDatabaseImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDatabaseImpl$insertOrUpdate$2", f = "LiveRecordingsDatabaseImpl.kt", l = {}, m = "invokeSuspend")
public final class C533650KwN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LiveRecordingsDatabaseImpl LLILLJJLI;
    public final /* synthetic */ C533710KwT LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533650KwN(LiveRecordingsDatabaseImpl liveRecordingsDatabaseImpl, C533710KwT c533710KwT, InterfaceC1364105Vn<? super C533650KwN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveRecordingsDatabaseImpl;
        this.LLILLL = c533710KwT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C533650KwN c533650KwN = new C533650KwN(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c533650KwN.LL = obj;
        return c533650KwN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveRecordingsDatabaseImpl@52f0.insertOrUpdate$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        this.LLILLJJLI.LIZJ.put(C2286608xc.LJFF(this.LLILLL.LIZ), this.LLILLL);
        C2400609au.LIZLLL.put(String.valueOf(this.LLILLL.LIZ), this.LLILLL.LIZJ);
        C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ.plus(C2296908zH.LIZ()), null, new C533640KwM(this.LLILLJJLI, this.LLILLL, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveRecordingsDatabaseImpl@52f0.insertOrUpdate$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
