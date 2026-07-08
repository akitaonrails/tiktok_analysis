package X;

import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.ui.AudioBeatsPanelFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS549S0100000_5;
import njp.a;

/* JADX INFO: renamed from: X.0DtO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.ui.AudioBeatsPanelFragment$initListeners$1$onScrollXChange$1", f = "AudioBeatsPanelFragment.kt", l = {464}, m = "invokeSuspend")
public final class C353440DtO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AudioBeatsPanelFragment LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353440DtO(AudioBeatsPanelFragment audioBeatsPanelFragment, int i, InterfaceC1364105Vn<? super C353440DtO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = audioBeatsPanelFragment;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353440DtO(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0E55 player;
        C1C7U.LIZ("AudioBeatsPanelFragment@8e62.initListeners$1$onScrollXChange$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(50L, this) == objLJFF) {
                C1C7U.LIZIZ("AudioBeatsPanelFragment@8e62.initListeners$1$onScrollXChange$1");
                return objLJFF;
            }
        }
        AudioBeatsPanelFragment audioBeatsPanelFragment = this.LLILLJJLI;
        audioBeatsPanelFragment.LLLLILI = false;
        C0E48 c0e48 = audioBeatsPanelFragment.LL;
        if (c0e48 != null && (player = c0e48.getPlayer()) != null) {
            player.LJIJ(this.LLILLL, true, new AwS549S0100000_5(this.LLILLJJLI, 1661));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AudioBeatsPanelFragment@8e62.initListeners$1$onScrollXChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
