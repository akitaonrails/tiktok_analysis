package X;

/* JADX INFO: renamed from: X.01RY, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSRequestLogicComponent", f = "TTSRequestLogicComponent.kt", l = {346, 347}, m = "fetchVoiceListByOnlyCategory")
public final class C01RY extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C09SX LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01RY(C09SX c09sx, InterfaceC1364105Vn<? super C01RY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c09sx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSRequestLogicComponent@4d24.fetchVoiceListByOnlyCategory$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objUY = this.LLILLJJLI.UY(null, null, this);
        C1C7U.LIZIZ("TTSRequestLogicComponent@4d24.fetchVoiceListByOnlyCategory$1");
        return objUY;
    }
}
