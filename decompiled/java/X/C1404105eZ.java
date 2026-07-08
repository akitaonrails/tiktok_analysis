package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05eZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.PurePreviewMediaEngine$ComposeThumbnail$2$1$thumbBitmap$1", f = "PurePreviewMediaEngine.kt", l = {240}, m = "invokeSuspend")
public final class C1404105eZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ SocMediaResource LLILLL;
    public final /* synthetic */ Size LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1404105eZ(Context context, SocMediaResource socMediaResource, Size size, InterfaceC1364105Vn<? super C1404105eZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = socMediaResource;
        this.LLILZ = size;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1404105eZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PurePreviewMediaEngine@cdc6.ComposeThumbnail$2$1$thumbBitmap$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C23216097u c23216097u = C23215097t.LIZ;
            Context context = this.LLILLJJLI;
            TikTokMediaModel tikTokMediaModel = this.LLILLL.tiktokMediaModel;
            Size size = this.LLILZ;
            this.LL = 1;
            obj = C23215097t.LJI(context, tikTokMediaModel, size, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PurePreviewMediaEngine@cdc6.ComposeThumbnail$2$1$thumbBitmap$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PurePreviewMediaEngine@cdc6.ComposeThumbnail$2$1$thumbBitmap$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
