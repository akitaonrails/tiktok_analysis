package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.gamora.editor.audio.tts.base.model.TTSAudioParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.11FG, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$processTtsWithOutUIFailResult$1", f = "TTSPanelUIComponent.kt", l = {}, m = "invokeSuspend")
public final class C11FG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C11Y7 LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11FG(C11Y7 c11y7, int i, String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C11FG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c11y7;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C11FG(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("TTSPanelUIComponent@ceaf.processTtsWithOutUIFailResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLLJ.LIZ(this.LLILLJJLI);
        C11YC c11yc = this.LL.LLLJ;
        String str = this.LLILLL;
        String str2 = "unknown error";
        if (str == null) {
            str = "unknown error";
        }
        c11yc.LIZIZ(str);
        this.LL.LLLJ.LIZJ(C11YJ.SAMI_SERVER.getValue());
        C11YC c11yc2 = this.LL.LLLJ;
        String str3 = this.LLILZ;
        if (str3 != null) {
            str2 = str3;
        }
        c11yc2.LIZ.put("task_id", str2);
        this.LL.LLLJ.LIZLLL();
        this.LL.U9(this.LLILLL);
        C345410DgR.LIZ(this.LL.W6());
        C11Y7 c11y7 = this.LL;
        C11FI<TTSAudioParam, TextStickerData> c11fi = c11y7.LLLLIILL;
        if (c11fi != null) {
            if (Intrinsics.LJFF(c11fi.W().getAudioText(), this.LLILZLL)) {
                c11y7.o7().Vh0(c11fi);
            } else {
                c11y7.n5(c11fi.W(), "");
            }
        }
        C11Y7 c11y72 = this.LL;
        C09TF c09tf = c11y72.LLLLIILLL;
        if (c09tf != null) {
            c09tf.LJI = C09TL.FAIL;
        }
        C09TF c09tfLIZ = c11y72.s7().LIZ(this.LLILZIL, this.LLILZLL);
        if (c09tfLIZ != null) {
            c09tfLIZ.LJI = C09TL.FAIL;
        }
        this.LL.ma(this.LLILZIL, this.LLILZLL);
        this.LL.Ya(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.processTtsWithOutUIFailResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
