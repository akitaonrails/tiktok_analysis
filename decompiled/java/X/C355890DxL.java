package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.ui.AudioBeatsPanelFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DxL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.ui.AudioBeatsPanelFragment$initPlayer$1", f = "AudioBeatsPanelFragment.kt", l = {593}, m = "invokeSuspend")
public final class C355890DxL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AudioBeatsPanelFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C355890DxL(AudioBeatsPanelFragment audioBeatsPanelFragment, InterfaceC1364105Vn<? super C355890DxL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = audioBeatsPanelFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C355890DxL(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AudioBeatsPanelFragment@8e62.initPlayer$1");
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
            AudioBeatsPanelFragment audioBeatsPanelFragment = this.LLILLJJLI;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C355880DxK c355880DxK = new C355880DxK(audioBeatsPanelFragment, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(audioBeatsPanelFragment, state, c355880DxK, this) == objLJFF) {
                C1C7U.LIZIZ("AudioBeatsPanelFragment@8e62.initPlayer$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AudioBeatsPanelFragment@8e62.initPlayer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
