package X;

import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08et, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$downloadAudio$2", f = "TTSPanelUIComponent.kt", l = {1124}, m = "invokeSuspend")
public final class C2170508et extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C11Y7 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ ReadTextEffectBean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ C013C LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2170508et(C11Y7 c11y7, String str, ReadTextEffectBean readTextEffectBean, String str2, int i, C013C c013c, InterfaceC1364105Vn<? super C2170508et> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c11y7;
        this.LLILLL = str;
        this.LLILZ = readTextEffectBean;
        this.LLILZIL = str2;
        this.LLILZLL = i;
        this.LLIZ = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2170508et(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSPanelUIComponent@ceaf.downloadAudio$2");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C2271708vD c2271708vD = new C2271708vD(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c2271708vD) == objLJFF) {
                C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.downloadAudio$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.downloadAudio$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
