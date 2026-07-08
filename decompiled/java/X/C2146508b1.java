package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08b1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$fetchVoiceEffectList$1", f = "TTSPanelUIComponent.kt", l = {1904, 1906, 1908, 1913}, m = "invokeSuspend")
public final class C2146508b1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C11Y7 LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ TextStickerData LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2146508b1(C11Y7 c11y7, boolean z, TextStickerData textStickerData, Function0<Unit> function0, InterfaceC1364105Vn<? super C2146508b1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c11y7;
        this.LLILZIL = z;
        this.LLILZLL = textStickerData;
        this.LLIZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2146508b1 c2146508b1 = new C2146508b1(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c2146508b1.LLILLL = obj;
        return c2146508b1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2146508b1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
