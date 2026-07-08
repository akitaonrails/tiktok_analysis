package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lLx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.commentpost.CommentNoticePreviewSheetKt$producePreviewContainer$1", f = "CommentNoticePreviewSheet.kt", l = {196, 202}, m = "invokeSuspend")
public final class C1354550lLx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ Comment LLILLL;
    public final /* synthetic */ ForwardMedia LLILZ;
    public final /* synthetic */ C1354570lLz LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1354550lLx(Context context, Comment comment, ForwardMedia forwardMedia, C1354570lLz c1354570lLz, InterfaceC1364105Vn<? super C1354550lLx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = comment;
        this.LLILZ = forwardMedia;
        this.LLILZIL = c1354570lLz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1354550lLx(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("CommentNoticePreviewSheetKt@c9f.producePreviewContainer$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CommentNoticePreviewSheetKt@c9f.producePreviewContainer$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1E2V c1e2v = C1E2V.LIZIZ;
            Context context = this.LLILLJJLI;
            Comment comment = this.LLILLL;
            ForwardMedia forwardMedia = this.LLILZ;
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "inbox_add_as_post_video_style", true, false)) {
                z = true;
            } else {
                z = false;
            }
            this.LL = 1;
            obj = c1e2v.generateCommentNoticePreviewCover(context, comment, forwardMedia, z, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommentNoticePreviewSheetKt@c9f.producePreviewContainer$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1354560lLy c1354560lLy = new C1354560lLy((Bitmap) obj, this.LLILZIL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1354560lLy) == objLJFF) {
            C1C7U.LIZIZ("CommentNoticePreviewSheetKt@c9f.producePreviewContainer$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CommentNoticePreviewSheetKt@c9f.producePreviewContainer$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
