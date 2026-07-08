package X;

/* JADX INFO: renamed from: X.09TP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.audiodownload.impl.TTSStreamImpl", f = "TTSStreamImpl.kt", l = {275}, m = "processTask")
public final class C09TP extends AbstractC23140094w {
    public C09TS LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C09TR LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09TP(C09TR c09tr, InterfaceC1364105Vn<? super C09TP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c09tr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TTSStreamImpl@3dd.processTask$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(null, this);
        C1C7U.LIZIZ("TTSStreamImpl@3dd.processTask$1");
        return objLIZJ;
    }
}
