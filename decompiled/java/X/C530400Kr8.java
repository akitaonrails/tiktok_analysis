package X;

import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsConfigResponse;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Kr8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "dmt.av.video.task.LiveRecordingsConfigTask$run$1$1", f = "LiveRecordingsConfigTask.kt", l = {}, m = "invokeSuspend")
public final class C530400Kr8 extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super LiveRecordingsConfigResponse>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C530400Kr8(InterfaceC1364105Vn<? super C530400Kr8> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        C533770KwZ c533770KwZ = C533770KwZ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchLiveRecordingsConfig failed. e: ");
        sbLIZ.append(obj2);
        C537680L6w.LIZ(c533770KwZ, "LiveRecordingsConfigTask", C2188811AlT.LIZIZ(sbLIZ), null);
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super LiveRecordingsConfigResponse> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C530400Kr8 c530400Kr8 = new C530400Kr8(interfaceC1364105Vn);
        c530400Kr8.LL = th;
        return c530400Kr8.invokeSuspend(Unit.LIZ);
    }
}
