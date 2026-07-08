package X;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01RP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSRequestLogicComponent$fetchTTSAudioFile$1$1$2", f = "TTSRequestLogicComponent.kt", l = {134}, m = "invokeSuspend")
public final class C01RP extends C09AX implements InterfaceC1631630sYr<InterfaceC346701Wf<? super C443120HZe<? extends List<? extends String>, ? extends Integer, ? extends String>>, Throwable, Long, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public /* synthetic */ long LLILLL;

    public C01RP(InterfaceC1364105Vn<? super C01RP> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        C1C7U.LIZ("TTSRequestLogicComponent@4d24.fetchTTSAudioFile$1$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                j = this.LLILLL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILLJJLI;
            j = this.LLILLL;
            if (obj2 instanceof RuntimeException) {
                this.LLILLL = j;
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                    C1C7U.LIZIZ("TTSRequestLogicComponent@4d24.fetchTTSAudioFile$1$1$2");
                    return objLJFF;
                }
            }
        }
        if (j >= 2) {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("TTSRequestLogicComponent@4d24.fetchTTSAudioFile$1$1$2");
        return boolValueOf;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(InterfaceC346701Wf<? super C443120HZe<? extends List<? extends String>, ? extends Integer, ? extends String>> interfaceC346701Wf, Throwable th, Long l, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        long jLongValue = l.longValue();
        C01RP c01rp = new C01RP(interfaceC1364105Vn);
        c01rp.LLILLJJLI = th;
        c01rp.LLILLL = jLongValue;
        return c01rp.invokeSuspend(Unit.LIZ);
    }
}
