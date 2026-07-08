package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MNv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.CommentNotice$generateCommentNoticePreviewCover$2$1", f = "CommentNotice.kt", l = {92, 115, 192}, m = "invokeSuspend")
public final class C567570MNv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public float LLIZLLLIL;
    public int LLJ;
    public final /* synthetic */ Context LLJI;
    public final /* synthetic */ InterfaceC1364105Vn<Bitmap> LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ Comment LLJILJILJ;
    public final /* synthetic */ ForwardMedia LLJILLL;
    public final /* synthetic */ float LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C567570MNv(Context context, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn, boolean z, Comment comment, ForwardMedia forwardMedia, float f, InterfaceC1364105Vn<? super C567570MNv> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLJI = context;
        this.LLJIJIL = interfaceC1364105Vn;
        this.LLJILJIL = z;
        this.LLJILJILJ = comment;
        this.LLJILLL = forwardMedia;
        this.LLJJ = f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C567570MNv(this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0395  */
    /* JADX WARN: Type inference failed for: r1v29, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.view.ViewGroup] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 1172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C567570MNv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
