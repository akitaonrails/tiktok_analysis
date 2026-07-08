package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.PurePreviewMediaEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05eY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.PurePreviewMediaEngine$Video$1$1$1", f = "PurePreviewMediaEngine.kt", l = {369}, m = "invokeSuspend")
public final class C1404005eY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05P0 LL;
    public int LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ SocMediaResource LLILZ;
    public final /* synthetic */ C05P0<Bitmap> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1404005eY(Context context, SocMediaResource socMediaResource, C05P0<Bitmap> c05p0, InterfaceC1364105Vn<? super C1404005eY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = context;
        this.LLILZ = socMediaResource;
        this.LLILZIL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1404005eY(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05P0 c05p0;
        C1C7U.LIZ("PurePreviewMediaEngine@cdc6.Video$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c05p0 = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c05p0 = this.LLILZIL;
            C23216097u c23216097u = C23215097t.LIZ;
            Context context = this.LLILLL;
            TikTokMediaModel tikTokMediaModel = this.LLILZ.tiktokMediaModel;
            TikTokMediaModel tikTokMediaModel2 = this.LLILZ.tiktokMediaModel;
            Size size = new Size(tikTokMediaModel2.width, tikTokMediaModel2.height);
            this.LL = c05p0;
            this.LLILLJJLI = 1;
            obj = C23215097t.LJI(context, tikTokMediaModel, size, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PurePreviewMediaEngine@cdc6.Video$1$1$1");
                return objLJFF;
            }
        }
        C1404305eb c1404305eb = PurePreviewMediaEngine.Companion;
        c05p0.setValue(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PurePreviewMediaEngine@cdc6.Video$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
