package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;

/* JADX INFO: renamed from: X.0LIO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.exit.TextToImageExitController", f = "TextToImageExitController.kt", l = {348}, m = "realSaveDraftWithNewCreationId")
public final class C0LIO extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public VideoPublishEditModel LLILZ;
    public CreativeDialogWrapper LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C0LIL LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LIO(C0LIL c0lil, InterfaceC1364105Vn<? super C0LIO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c0lil;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextToImageExitController@5a6.realSaveDraftWithNewCreationId$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLIZ.LJIIIZ(false, this);
        C1C7U.LIZIZ("TextToImageExitController@5a6.realSaveDraftWithNewCreationId$1");
        return objLJIIIZ;
    }
}
