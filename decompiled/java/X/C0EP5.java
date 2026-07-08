package X;

import com.ss.android.ugc.gamora.editor.lyric.service.LyricMiniDraftServiceImpl;

/* JADX INFO: renamed from: X.0EP5, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.service.LyricMiniDraftServiceImpl", f = "LyricMiniDraftServiceImpl.kt", l = {67}, m = "requestLyricMiniDraft")
public final class C0EP5 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LyricMiniDraftServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0EP5(LyricMiniDraftServiceImpl lyricMiniDraftServiceImpl, InterfaceC1364105Vn<? super C0EP5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = lyricMiniDraftServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricMiniDraftServiceImpl@2f97.requestLyricMiniDraft$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, null, null, this);
        C1C7U.LIZIZ("LyricMiniDraftServiceImpl@2f97.requestLyricMiniDraft$1");
        return objLIZIZ;
    }
}
