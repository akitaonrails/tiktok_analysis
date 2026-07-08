package X;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z6D, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.voice.IMVoiceTranscriptPlaybackViewModel$requestMessageRefreshForPlayback$1", f = "IMVoiceTranscriptPlaybackViewModel.kt", l = {251}, m = "invokeSuspend")
public final class C0Z6D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2230008oU LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z6D(C2230008oU c2230008oU, C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C0Z6D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2230008oU;
        this.LLILLL = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Z6D(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJJIJIL = obj;
        C1C7U.LIZ("IMVoiceTranscriptPlaybackViewModel@c03c.requestMessageRefreshForPlayback$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJJIJIL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJJIJIL);
            C2230008oU c2230008oULIZ = C2230008oU.LIZ(this.LLILLJJLI, 0, null, null, null, null, C2286608xc.LJ(1), null, C2286608xc.LJFF(System.currentTimeMillis()), null, null, null, null, 521727);
            C2230108oV.LIZ.put(this.LLILLL.getUuid(), c2230008oULIZ);
            InterfaceC874680YTa interfaceC874680YTaLIZ = C0YNY.LIZ(InterfaceC874680YTa.LIZ);
            List<Long> listSingletonList = Collections.singletonList(C2286608xc.LJFF(this.LLILLL.getMsgId()));
            this.LL = 1;
            objLJJIJIL = interfaceC874680YTaLIZ.LJJIJIL(listSingletonList, this);
            if (objLJJIJIL == objLJFF) {
                C1C7U.LIZIZ("IMVoiceTranscriptPlaybackViewModel@c03c.requestMessageRefreshForPlayback$1");
                return objLJFF;
            }
        }
        C869590Y9l c869590Y9l = (C869590Y9l) C13LP.LJJJLL((List) objLJJIJIL);
        if (c869590Y9l == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMVoiceTranscriptPlaybackViewModel@c03c.requestMessageRefreshForPlayback$1");
            return unit;
        }
        C0Z85.LIZIZ.LIZ.LIZLLL(c869590Y9l);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMVoiceTranscriptPlaybackViewModel@c03c.requestMessageRefreshForPlayback$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
