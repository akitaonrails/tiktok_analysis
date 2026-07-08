package X;

import Y.AUListenerS221S0200000_14;
import android.animation.Animator;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem;
import com.ss.android.ugc.aweme.transcript.IMVoiceTranscribeModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ZX7, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem$observeTranscript$1", f = "VoiceAssem.kt", l = {1163}, m = "invokeSuspend")
public final class C0ZX7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VoiceAssem LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ IMVoiceTranscribeModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZX7(VoiceAssem voiceAssem, Function0<Unit> function0, String str, IMVoiceTranscribeModel iMVoiceTranscribeModel, InterfaceC1364105Vn<? super C0ZX7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = voiceAssem;
        this.LLILLL = function0;
        this.LLILZ = str;
        this.LLILZIL = iMVoiceTranscribeModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZX7(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VoiceAssem@7e6f.observeTranscript$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252321DDq c2252321DDqLIZLLL = this.LLILLJJLI.LLLL.LIZLLL();
            final VoiceAssem voiceAssem = this.LLILLJJLI;
            final Function0<Unit> function0 = this.LLILLL;
            final String str = this.LLILZ;
            final IMVoiceTranscribeModel iMVoiceTranscribeModel = this.LLILZIL;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0ZX8
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    C0ZX0 c0zx0 = (C0ZX0) obj2;
                    Animator animator = voiceAssem.LLLLILI;
                    if (animator != null) {
                        animator.cancel();
                    }
                    if (Intrinsics.LJFF(c0zx0, C458470HyP.LIZ) || (c0zx0 instanceof C901180ZWy)) {
                        function0.invoke();
                    } else if (c0zx0 instanceof C0ZX6) {
                        if (!Intrinsics.LJFF(((C0ZX6) c0zx0).LIZ, str)) {
                            function0.invoke();
                        } else {
                            voiceAssem.Ep(iMVoiceTranscribeModel, true);
                        }
                    } else if (c0zx0 instanceof C0ZX4) {
                        if (!Intrinsics.LJFF(((C0ZX4) c0zx0).LIZ, str)) {
                            function0.invoke();
                        } else {
                            VoiceAssem voiceAssem2 = voiceAssem;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            VoiceAssem voiceAssem3 = voiceAssem;
                            IMVoiceTranscribeModel iMVoiceTranscribeModel2 = iMVoiceTranscribeModel;
                            valueAnimatorOfFloat.setRepeatCount(-1);
                            valueAnimatorOfFloat.setRepeatMode(1);
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS221S0200000_14(voiceAssem3, iMVoiceTranscribeModel2, 1));
                            valueAnimatorOfFloat.start();
                            voiceAssem2.LLLLILI = valueAnimatorOfFloat;
                        }
                    } else {
                        throw new C1954807lC();
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c2252321DDqLIZLLL.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("VoiceAssem@7e6f.observeTranscript$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
