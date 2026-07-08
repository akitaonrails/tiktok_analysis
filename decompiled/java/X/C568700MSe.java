package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;

/* JADX INFO: renamed from: X.0MSe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.SharedCommentExtKt", f = "SharedCommentExt.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT, LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "prefetchCommentImages")
public final class C568700MSe extends AbstractC23140094w {
    public CommentVideoModel LL;
    public /* synthetic */ Object LLILLJJLI;
    public int LLILLL;

    public C568700MSe(InterfaceC1364105Vn<? super C568700MSe> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharedCommentExtKt@2bc2.prefetchCommentImages$1");
        this.LLILLJJLI = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = C19610311nx.LIZJ(null, this);
        C1C7U.LIZIZ("SharedCommentExtKt@2bc2.prefetchCommentImages$1");
        return objLIZJ;
    }
}
