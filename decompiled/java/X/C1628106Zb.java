package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.voice.LocalVoiceCache;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Zb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.voice.IMVoiceTranscriptMessageHandler$updateMessage$1", f = "IMVoiceTranscriptMessageHandler.kt", l = {244}, m = "invokeSuspend")
public final class C1628106Zb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Function1<LocalVoiceCache, LocalVoiceCache> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1628106Zb(long j, Function1<? super LocalVoiceCache, LocalVoiceCache> function1, String str, InterfaceC1364105Vn<? super C1628106Zb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = function1;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1628106Zb(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMVoiceTranscriptMessageHandler@b201.updateMessage$1");
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
            InterfaceC874680YTa interfaceC874680YTaLIZ = C0YNY.LIZ(InterfaceC874680YTa.LIZ);
            List<Long> listSingletonList = Collections.singletonList(C2286608xc.LJFF(this.LLILLJJLI));
            this.LL = 1;
            obj = interfaceC874680YTaLIZ.LJJIJIL(listSingletonList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMVoiceTranscriptMessageHandler@b201.updateMessage$1");
                return objLJFF;
            }
        }
        C869590Y9l c869590Y9l = (C869590Y9l) C13LP.LJJJLL((List) obj);
        if (c869590Y9l == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMVoiceTranscriptMessageHandler@b201.updateMessage$1");
            return unit;
        }
        LocalVoiceCache localVoiceCacheInvoke = this.LLILLL.invoke(C0ZRA.LIZ(c869590Y9l));
        try {
            C1227904rF.LIZ.getClass();
            String strLJIILLIIL = C1227904rF.LIZLLL().LJIILLIIL(localVoiceCacheInvoke, LocalVoiceCache.class);
            c869590Y9l.getLocalExt().put("im_voice_message_transcribe", strLJIILLIIL);
            C603540Nlo.LIZ(C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ(), c869590Y9l, "im_voice_message_transcribe", new C0Y3R(strLJIILLIIL), new C0Y3I(this.LLILZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMVoiceTranscriptMessageHandler@b201.updateMessage$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
