package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xmk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.image.ImageHeaderModule$onCoverUpdate$1$1", f = "ImageHeaderModule.kt", l = {}, m = "invokeSuspend")
public final class C858920Xmk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C214848196g LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Bitmap LLILZ;
    public final /* synthetic */ VideoPublishEditModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C858920Xmk(int i, Bitmap bitmap, VideoPublishEditModel videoPublishEditModel, C214848196g c214848196g, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c214848196g;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = bitmap;
        this.LLILZIL = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C214848196g c214848196g = this.LL;
        return new C858920Xmk(this.LLILLJJLI, this.LLILZ, this.LLILZIL, c214848196g, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            java.lang.String r5 = "ImageHeaderModule@1844.onCoverUpdate$1$1"
            X.C1C7U.LIZ(r5)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r18)
            r2 = r17
            X.196g r0 = r2.LL
            X.19EG r0 = r0.LJIIIIZZ
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L95
            X.196g r0 = r2.LL
            X.196S r0 = r0.LJIIL
            if (r0 == 0) goto La7
            float r12 = r0.getThumbnailImageSizeMultiple()
        L21:
            X.196g r0 = r2.LL
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.LIZ
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r0.getImageAlbumData()
            if (r0 == 0) goto La5
            java.util.List r1 = r0.getImageList()
            if (r1 == 0) goto La5
            int r0 = r2.LLILLJJLI
            java.lang.Object r4 = X.C13LP.LJJJLZIJ(r0, r1)
            com.ss.android.ugc.aweme.creative.model.edit.SingleImageData r4 = (com.ss.android.ugc.aweme.creative.model.edit.SingleImageData) r4
        L39:
            X.196g r0 = r2.LL
            X.196S r3 = r0.LJIIL
            if (r3 == 0) goto L7c
            int r1 = r2.LLILLJJLI
            X.196X r6 = new X.196X
            java.lang.String r7 = r2.LLILLL
            android.graphics.Bitmap r0 = r2.LLILZ
            int r8 = r0.getWidth()
            android.graphics.Bitmap r0 = r2.LLILZ
            int r9 = r0.getHeight()
            r10 = 0
            r11 = 0
            if (r4 == 0) goto La3
            X.196g r0 = r2.LL
            r0.getClass()
            boolean r13 = X.C214848196g.LJIIIIZZ(r4)
        L5e:
            if (r4 == 0) goto La0
            X.196g r0 = r2.LL
            r0.getClass()
            com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode r14 = X.C214848196g.LIZLLL(r4)
            if (r14 == 0) goto La0
        L6b:
            X.196g r0 = r2.LL
            r0.getClass()
            boolean r15 = X.C214848196g.LJ(r4)
            r16 = 56
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.LJI(r1, r6)
        L7c:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.LLILZIL
            X.C565950MHp.LIZ(r0)
            X.196g r0 = r2.LL
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r0.LIZ
            if (r1 == 0) goto L8c
            java.lang.String r0 = r2.LLILLL
            r1.setVideoCoverPath(r0)
        L8c:
            X.196g r0 = r2.LL
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r0.LIZ
            java.lang.String r0 = r2.LLILLL
            X.C1440950nbJ.LIZJ(r1, r0)
        L95:
            android.graphics.Bitmap r0 = r2.LLILZ
            X.C2475309mx.LJ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        La0:
            com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode r14 = com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode.STATIC
            goto L6b
        La3:
            r13 = 0
            goto L5e
        La5:
            r4 = 0
            goto L39
        La7:
            r12 = 1065353216(0x3f800000, float:1.0)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C858920Xmk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
