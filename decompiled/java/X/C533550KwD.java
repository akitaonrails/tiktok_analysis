package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDatabaseImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KwD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDatabaseImpl$queryByFragmentId$2", f = "LiveRecordingsDatabaseImpl.kt", l = {}, m = "invokeSuspend")
public final class C533550KwD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C533710KwT>, Object> {
    public final /* synthetic */ LiveRecordingsDatabaseImpl LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533550KwD(LiveRecordingsDatabaseImpl liveRecordingsDatabaseImpl, long j, InterfaceC1364105Vn<? super C533550KwD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveRecordingsDatabaseImpl;
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C533550KwD(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveRecordingsDatabaseImpl@52f0.queryByFragmentId$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C533710KwT c533710KwT = this.LL.LIZJ.get(C2286608xc.LJFF(this.LLILLJJLI));
        C1C7U.LIZIZ("LiveRecordingsDatabaseImpl@52f0.queryByFragmentId$2");
        return c533710KwT;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C533710KwT> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
