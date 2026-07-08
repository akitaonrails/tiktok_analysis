package X;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05h0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.BasicMediaEngine$Image$1$2$1$1$thumbnail$1", f = "MediaEngine.kt", l = {}, m = "invokeSuspend")
public final class C1419205h0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public final /* synthetic */ SocMediaResource LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1419205h0(SocMediaResource socMediaResource, InterfaceC1364105Vn<? super C1419205h0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socMediaResource;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1419205h0(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BasicMediaEngine@5e35.Image$1$2$1$1$thumbnail$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmapCreateVideoThumbnail = ThumbnailUtils.createVideoThumbnail(this.LL.path, 2);
        C1C7U.LIZIZ("BasicMediaEngine@5e35.Image$1$2$1$1$thumbnail$1");
        return bitmapCreateVideoThumbnail;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
