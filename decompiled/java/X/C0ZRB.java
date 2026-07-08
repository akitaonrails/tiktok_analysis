package X;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ZRB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.voice.IMVoiceTranscriptMessageHandler$startTranscribe$3", f = "IMVoiceTranscriptMessageHandler.kt", l = {148}, m = "invokeSuspend")
public final class C0ZRB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZRB(long j, C869590Y9l c869590Y9l, Function0<Unit> function0, String str, Function0<Unit> function02, InterfaceC1364105Vn<? super C0ZRB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c869590Y9l;
        this.LLILZ = function0;
        this.LLILZIL = str;
        this.LLILZLL = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZRB(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("IMVoiceTranscriptMessageHandler@b201.startTranscribe$3");
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
            C458620Hye c458620Hye = C458620Hye.LIZ;
            long j = this.LLILLJJLI;
            long msgId = this.LLILLL.getMsgId();
            this.LL = 1;
            obj = c458620Hye.transcribe(j, msgId, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMVoiceTranscriptMessageHandler@b201.startTranscribe$3");
                return objLJFF;
            }
        }
        InterfaceC458490HyR interfaceC458490HyR = (InterfaceC458490HyR) obj;
        if (Intrinsics.LJFF(interfaceC458490HyR, C458480HyQ.LIZ)) {
            C0ZRA.LIZJ();
            C823170WQx<String> c823170WQx = C0ZRA.LIZIZ;
            c823170WQx.remove(this.LLILLL.getUuid());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startTranscribe clean up inProgressSet: ");
            sbLIZ.append(c823170WQx);
            C2188811AlT.LIZIZ(sbLIZ);
            C0ZRA.LIZJ();
            this.LLILZ.invoke();
            C0ZRA.LJ(this.LLILLL.getMsgId(), "Voice Message Transcript: transcribe error", AFwS248S0000000_14.get$arr$(165));
            C458640Hyg.LJ(this.LLILLL.getMsgId(), this.LLILLL.getConversationId(), this.LLILZIL, "fail");
            C2485509ob.LIZIZ(new Runnable() { // from class: X.09mG
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    Fragment fragmentLIZLLL;
                    C19EG activity;
                    C1C7U.LIZ("IMVoiceTranscriptMessageHandler@b201.startTranscribe$3$2");
                    try {
                        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                        if (abstractC1387200mCcLIZIZ != null && (fragmentLIZLLL = abstractC1387200mCcLIZIZ.LIZLLL()) != null && (activity = fragmentLIZLLL.getActivity()) != null) {
                            C1389890mGx c1389890mGx = new C1389890mGx(activity);
                            c1389890mGx.LJIIIZ(2131832166);
                            c1389890mGx.LJIIJJI();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("IMVoiceTranscriptMessageHandler@b201.startTranscribe$3$2");
                }
            });
        } else if (interfaceC458490HyR instanceof C00GY) {
            boolean z = C0ZRA.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("startTranscribe transcribe success: ");
            sbLIZ2.append(interfaceC458490HyR);
            C2188811AlT.LIZIZ(sbLIZ2);
            C0ZRA.LIZJ();
            C823170WQx<String> c823170WQx2 = C0ZRA.LIZIZ;
            c823170WQx2.remove(this.LLILLL.getUuid());
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("startTranscribe clean up inProgressSet: ");
            sbLIZ3.append(c823170WQx2);
            C2188811AlT.LIZIZ(sbLIZ3);
            C0ZRA.LIZJ();
            this.LLILZLL.invoke();
            C0ZRA.LJ(this.LLILLL.getMsgId(), "Voice Message Transcript: transcribe success", new AwS593S0100000_14(interfaceC458490HyR, 78));
            String conversationId = this.LLILLL.getConversationId();
            String str2 = this.LLILZIL;
            long msgId2 = this.LLILLL.getMsgId();
            if (((C00GY) interfaceC458490HyR).LIZ.transcript.length() == 0) {
                str = "no_content";
            } else {
                str = "success";
            }
            C458640Hyg.LJ(msgId2, conversationId, str2, str);
        } else {
            throw new C1954807lC();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMVoiceTranscriptMessageHandler@b201.startTranscribe$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
