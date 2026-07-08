package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import njp.a;

/* JADX INFO: renamed from: X.08hJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$readTextWithOutUI$4$1", f = "TTSPanelUIComponent.kt", l = {2533}, m = "invokeSuspend")
public final class C2185508hJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ TextStickerData LLILZ;
    public final /* synthetic */ C11Y7 LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Effect LLIZLLLIL;
    public final /* synthetic */ SpeakerCenter.KevaSpeakerBean LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ CoroutineExceptionHandler LLJIJIL;
    public final /* synthetic */ C013C LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2185508hJ(C259800zU<String> c259800zU, C259800zU<String> c259800zU2, TextStickerData textStickerData, C11Y7 c11y7, String str, String str2, Effect effect, SpeakerCenter.KevaSpeakerBean kevaSpeakerBean, long j, CoroutineExceptionHandler coroutineExceptionHandler, C013C c013c, InterfaceC1364105Vn<? super C2185508hJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c259800zU2;
        this.LLILZ = textStickerData;
        this.LLILZIL = c11y7;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = effect;
        this.LLJ = kevaSpeakerBean;
        this.LLJI = j;
        this.LLJIJIL = coroutineExceptionHandler;
        this.LLJILJIL = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2185508hJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSPanelUIComponent@ceaf.readTextWithOutUI$4$1");
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
            C2271608vC c2271608vC = new C2271608vC(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c2271608vC) == objLJFF) {
                C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.readTextWithOutUI$4$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.readTextWithOutUI$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
