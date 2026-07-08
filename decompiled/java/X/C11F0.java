package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.gamora.editor.audio.tts.base.model.TTSAudioParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.11F0, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$processTtsFirstAudioReceived$1", f = "TTSPanelUIComponent.kt", l = {}, m = "invokeSuspend")
public final class C11F0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C11Y7 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11F0(String str, C11Y7 c11y7, InterfaceC1364105Vn<? super C11F0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c11y7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C11F0(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSPanelUIComponent@ceaf.processTtsFirstAudioReceived$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!Intrinsics.LJFF(this.LL, this.LLILLJJLI.LLLLIL)) {
            this.LLILLJJLI.gb(this.LL);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.processTtsFirstAudioReceived$1");
            return unit;
        }
        C11Y7 c11y7 = this.LLILLJJLI;
        C11FI<TTSAudioParam, TextStickerData> c11fi = c11y7.LLLLIILL;
        if (c11fi != null) {
            c11y7.o7().IQ(c11fi);
        }
        this.LLILLJJLI.gb(this.LL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.processTtsFirstAudioReceived$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
