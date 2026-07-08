package X;

import com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoeffect.ui.VideoEffectFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08rI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoeffect.ui.VideoEffectFragment$initFavorite$1", f = "VideoEffectFragment.kt", l = {503}, m = "invokeSuspend")
public final class C2247408rI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VideoEffectFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2247408rI(VideoEffectFragment videoEffectFragment, InterfaceC1364105Vn<? super C2247408rI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = videoEffectFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2247408rI(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objSS0;
        C1C7U.LIZ("VideoEffectFragment@fd67.initFavorite$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            objSS0 = ((C189200o6) obj).m10unboximpl();
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC361290EEl interfaceC361290EEl = this.LLILLJJLI.LLLFZ;
            if (interfaceC361290EEl != null) {
                this.LL = 1;
                objSS0 = interfaceC361290EEl.SS0("editingeffect", true, this);
                if (objSS0 == objLJFF) {
                    C1C7U.LIZIZ("VideoEffectFragment@fd67.initFavorite$1");
                    return objLJFF;
                }
            }
            this.LLILLJJLI.getClass();
            throw null;
        }
        C189200o6.m1boximpl(objSS0);
        this.LLILLJJLI.getClass();
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
