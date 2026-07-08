package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08b2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$fetchVoiceEffectList$1$2", f = "TTSPanelUIComponent.kt", l = {}, m = "invokeSuspend")
public final class C2146608b2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<ReadTextEffectBean> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C11Y7 LLILLL;
    public final /* synthetic */ TextStickerData LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2146608b2(List<? extends ReadTextEffectBean> list, boolean z, C11Y7 c11y7, TextStickerData textStickerData, Function0<Unit> function0, InterfaceC1364105Vn<? super C2146608b2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = z;
        this.LLILLL = c11y7;
        this.LLILZ = textStickerData;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2146608b2(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSPanelUIComponent@ceaf.fetchVoiceEffectList$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.isEmpty()) {
            if (!this.LLILLJJLI) {
                this.LLILLL.M5(this.LLILZ);
            }
        } else if (!this.LLILLJJLI) {
            this.LLILLL.LLJLIL = true;
            this.LLILLL.k5(this.LLILZ);
        }
        this.LLILZIL.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.fetchVoiceEffectList$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
