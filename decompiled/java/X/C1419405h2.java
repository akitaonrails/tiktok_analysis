package X;

import android.graphics.Bitmap;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05h2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.PurePreviewMediaEngine$AndroidViewImagePreview$2$1$1", f = "PurePreviewMediaEngine.kt", l = {310}, m = "invokeSuspend")
public final class C1419405h2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SocMediaResource LLILLJJLI;
    public final /* synthetic */ SmartImageView LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1419405h2(SocMediaResource socMediaResource, SmartImageView smartImageView, InterfaceC1364105Vn<? super C1419405h2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socMediaResource;
        this.LLILLL = smartImageView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1419405h2(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PurePreviewMediaEngine@cdc6.AndroidViewImagePreview$2$1$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C1419305h1 c1419305h1 = new C1419305h1(this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c1419305h1);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PurePreviewMediaEngine@cdc6.AndroidViewImagePreview$2$1$1");
                return objLJFF;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.LLILLL.setImageBitmap(bitmap);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PurePreviewMediaEngine@cdc6.AndroidViewImagePreview$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
