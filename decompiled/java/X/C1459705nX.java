package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05nX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.detail.keyframe.ui.KeyframeBottomCellImageStyle$onBindItemView$1$1", f = "TakoDetailKeyframeItem.kt", l = {98}, m = "invokeSuspend")
public final class C1459705nX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ ImageView LLILLL;
    public final /* synthetic */ C0H8B LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1459705nX(ImageView imageView, C0H8B c0h8b, InterfaceC1364105Vn<? super C1459705nX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = imageView;
        this.LLILZ = c0h8b;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1459705nX(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ImageView imageView;
        Bitmap bitmap;
        C1C7U.LIZ("KeyframeBottomCellImageStyle@ef0c.onBindItemView$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                imageView = (ImageView) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            imageView = this.LLILLL;
            AnonymousClass0957<Bitmap> anonymousClass0957 = this.LLILZ.LL;
            if (anonymousClass0957 != null) {
                this.LL = imageView;
                this.LLILLJJLI = 1;
                obj = anonymousClass0957.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("KeyframeBottomCellImageStyle@ef0c.onBindItemView$1$1");
                    return objLJFF;
                }
            } else {
                bitmap = null;
                imageView.setImageBitmap(bitmap);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("KeyframeBottomCellImageStyle@ef0c.onBindItemView$1$1");
                return unit;
            }
        }
        bitmap = (Bitmap) obj;
        imageView.setImageBitmap(bitmap);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("KeyframeBottomCellImageStyle@ef0c.onBindItemView$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
