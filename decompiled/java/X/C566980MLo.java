package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MLo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.CommentForwardResolver$resolve$1$saveCoverTask$1", f = "CommentForwardResolver.kt", l = {}, m = "invokeSuspend")
public final class C566980MLo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ C0MN4 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C566980MLo(VideoPublishEditModel videoPublishEditModel, C0MN4 c0mn4, InterfaceC1364105Vn<? super C566980MLo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = c0mn4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C566980MLo(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objValueOf;
        int i;
        C1C7U.LIZ("CommentForwardResolver@871e.resolve$1$saveCoverTask$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C493401w4.LIZ()) {
            this.LL.generateVideoCoverPath(true, -2);
            C0MH8 c0mh8 = C0MH8.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LL;
            Bitmap coverBitmap = this.LLILLJJLI.getCoverBitmap();
            if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                i = 1001;
            } else {
                i = LSPassThroughRecordSizeConfig.DEFAULT;
            }
            c0mh8.getClass();
            objValueOf = Boolean.valueOf(C0MH8.LJIJ(videoPublishEditModel, coverBitmap, i, -1, null, 100));
        } else {
            this.LL.generateVideoCoverPath();
            Bitmap coverBitmap2 = this.LLILLJJLI.getCoverBitmap();
            objValueOf = null;
            if (coverBitmap2 != null) {
                String videoCoverPath = this.LL.getVideoCoverPath();
                if (videoCoverPath != null) {
                    C2477909nN.LJI(coverBitmap2, videoCoverPath, null, 0, 6);
                    objValueOf = Unit.LIZ;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
        C1C7U.LIZIZ("CommentForwardResolver@871e.resolve$1$saveCoverTask$1");
        return objValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
