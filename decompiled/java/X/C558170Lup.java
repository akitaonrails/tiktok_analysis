package X;

import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;

/* JADX INFO: renamed from: X.0Lup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageListScene", f = "Text2ImageListScene.kt", l = {368}, m = "constructAIItem")
public final class C558170Lup extends AbstractC23140094w {
    public TextImageTaskInfo LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C558180Luq LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C558170Lup(C558180Luq c558180Luq, InterfaceC1364105Vn<? super C558170Lup> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c558180Luq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Text2ImageListScene@1b50.constructAIItem$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLLLII = this.LLILZLL.LLLII(null, false, false, false, this);
        C1C7U.LIZIZ("Text2ImageListScene@1b50.constructAIItem$1");
        return objLLLII;
    }
}
