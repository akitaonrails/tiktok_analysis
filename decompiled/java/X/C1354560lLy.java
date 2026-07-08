package X;

import Y.ACListenerS86S0300000_21;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lLy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.commentpost.CommentNoticePreviewSheetKt$producePreviewContainer$1$1", f = "CommentNoticePreviewSheet.kt", l = {}, m = "invokeSuspend")
public final class C1354560lLy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Bitmap LL;
    public final /* synthetic */ C1354570lLz LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1354560lLy(Bitmap bitmap, C1354570lLz c1354570lLz, InterfaceC1364105Vn<? super C1354560lLy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
        this.LLILLJJLI = c1354570lLz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1354560lLy(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentNoticePreviewSheetKt@c9f.producePreviewContainer$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == null) {
            TuxIconView errorViewFromXml = this.LLILLJJLI.getErrorViewFromXml();
            if (errorViewFromXml != null) {
                C786410Ut5.LLLLLLZZ(errorViewFromXml, 0);
            }
        } else {
            C1354570lLz c1354570lLz = this.LLILLJJLI;
            C1390410mHn dualBallLoadingFromXml = c1354570lLz.getDualBallLoadingFromXml();
            if (dualBallLoadingFromXml != null) {
                dualBallLoadingFromXml.LIZLLL();
            }
            FrameLayout statusViewFromXml = c1354570lLz.getStatusViewFromXml();
            if (statusViewFromXml != null) {
                C786410Ut5.LJZ(8, statusViewFromXml);
            }
            C1354570lLz c1354570lLz2 = this.LLILLJJLI;
            c1354570lLz2.getCoverVideoViewFromXml().setImageBitmap(this.LL);
            C1354570lLz c1354570lLz3 = this.LLILLJJLI;
            Bitmap bitmap = this.LL;
            C1354620lM4 c1354620lM4 = c1354570lLz3.LLJ;
            if (c1354620lM4 != null) {
                C786410Ut5.O7(c1354570lLz3.getQuickPublishFromXml(), new ACListenerS86S0300000_21(c1354620lM4, bitmap, c1354570lLz3, 8));
                C786410Ut5.R7(c1354570lLz3.getStoryNormalQuickPostFromXml(), new ACListenerS86S0300000_21(c1354620lM4, bitmap, c1354570lLz3, 9));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentNoticePreviewSheetKt@c9f.producePreviewContainer$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
