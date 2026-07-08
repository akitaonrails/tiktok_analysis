package X;

import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsConfigResponse;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsRepositoryImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kuy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsRepositoryImpl$fetchLiveRecordingsConfig$2$1", f = "LiveRecordingsRepositoryImpl.kt", l = {}, m = "invokeSuspend")
public final class C532780Kuy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveRecordingsRepositoryImpl LL;
    public final /* synthetic */ LiveRecordingsConfigResponse LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532780Kuy(LiveRecordingsRepositoryImpl liveRecordingsRepositoryImpl, LiveRecordingsConfigResponse liveRecordingsConfigResponse, InterfaceC1364105Vn<? super C532780Kuy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveRecordingsRepositoryImpl;
        this.LLILLJJLI = liveRecordingsConfigResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C532780Kuy(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveRecordingsRepositoryImpl@495a.fetchLiveRecordingsConfig$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJI = this.LLILLJJLI;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveRecordingsRepositoryImpl@495a.fetchLiveRecordingsConfig$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
