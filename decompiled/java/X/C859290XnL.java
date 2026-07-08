package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0XnL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.audio.ui.player.AudioPlaybackPreviewView$startProgressUpdates$1", f = "AudioPlaybackPreviewView.kt", l = {284}, m = "invokeSuspend")
public final class C859290XnL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1348310lBt LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859290XnL(String str, C1348310lBt c1348310lBt, InterfaceC1364105Vn<? super C859290XnL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c1348310lBt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859290XnL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AudioPlaybackPreviewView@51fe.startProgressUpdates$1");
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
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Progress update coroutine started for playId: ");
            sbLIZ.append(this.LLILLJJLI);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        while (Intrinsics.LJFF(this.LLILLL.LLJ, this.LLILLJJLI) && this.LLILLL.getAudioPlayer().LJIIJ(this.LLILLJJLI)) {
            this.LLILLL.LIZIZ(this.LLILLJJLI);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(80L, this) == objLJFF) {
                C1C7U.LIZIZ("AudioPlaybackPreviewView@51fe.startProgressUpdates$1");
                return objLJFF;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Progress update coroutine ended for playId: ");
        sbLIZ2.append(this.LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AudioPlaybackPreviewView@51fe.startProgressUpdates$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
