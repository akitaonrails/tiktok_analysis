package X;

import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Sj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment$processTtsCancel$1", f = "TTSFragment.kt", l = {}, m = "invokeSuspend")
public final class C2375109Sj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ TTSFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2375109Sj(int i, TTSFragment tTSFragment, InterfaceC1364105Vn<? super C2375109Sj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = tTSFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2375109Sj(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C19416910xr c19416910xr;
        C1C7U.LIZ("TTSFragment@b180.processTtsCancel$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        if (i >= 0 && i < this.LLILLJJLI.LLLLII.size() + 1 && (c19416910xr = this.LLILLJJLI.LLLLILI) != null) {
            c19416910xr.LLLFZ(this.LL, 0, false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSFragment@b180.processTtsCancel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
