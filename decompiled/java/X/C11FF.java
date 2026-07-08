package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.gamora.editor.audio.tts.base.model.TTSAudioParam;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.11FF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$processTtsFailResult$1", f = "TTSPanelUIComponent.kt", l = {}, m = "invokeSuspend")
public final class C11FF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C11Y7 LL;
    public final /* synthetic */ ReadTextEffectBean LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11FF(C11Y7 c11y7, ReadTextEffectBean readTextEffectBean, String str, InterfaceC1364105Vn<? super C11FF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c11y7;
        this.LLILLJJLI = readTextEffectBean;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C11FF(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSPanelUIComponent@ceaf.processTtsFailResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C11Y7 c11y7 = this.LL;
        C11FI<TTSAudioParam, TextStickerData> c11fi = c11y7.LLLLIILL;
        if (c11fi != null) {
            if (Intrinsics.LJFF(c11fi.W().getAudioText(), this.LLILLL)) {
                c11y7.o7().Vh0(c11fi);
            } else {
                c11y7.n5(c11fi.W(), "");
            }
        }
        C09TF c09tf = this.LL.LLLLIILLL;
        if (c09tf != null && Intrinsics.LJFF(c09tf.LJFF, true)) {
            C345410DgR.LIZ(this.LL.W6());
        }
        C11Y7 c11y72 = this.LL;
        C09TF c09tf2 = c11y72.LLLLIILLL;
        if (c09tf2 != null) {
            c09tf2.LJI = C09TL.FAIL;
        }
        C09TF c09tfLIZ = c11y72.s7().LIZ(this.LLILLJJLI.mSpeaker.speakreID, this.LLILLL);
        if (c09tfLIZ != null) {
            c09tfLIZ.LJI = C09TL.FAIL;
        }
        this.LL.ma(this.LLILLJJLI.mSpeaker.speakreID, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.processTtsFailResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
