package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05o4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.detail.keyframe.ui.BaseKeyframeCell$onBindItemView$1$1", f = "SearchDetailKeyframeItem.kt", l = {280}, m = "invokeSuspend")
public final class C1463005o4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0H8A LLILLJJLI;
    public final /* synthetic */ ImageView LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1463005o4(C0H8A c0h8a, ImageView imageView, InterfaceC1364105Vn<? super C1463005o4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0h8a;
        this.LLILLL = imageView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1463005o4(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        C1C7U.LIZ("BaseKeyframeCell@2200.onBindItemView$1$1");
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
            AnonymousClass0957<Bitmap> anonymousClass0957 = this.LLILLJJLI.LL;
            if (anonymousClass0957 != null) {
                this.LL = 1;
                obj = anonymousClass0957.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BaseKeyframeCell@2200.onBindItemView$1$1");
                    return objLJFF;
                }
            } else {
                bitmap = null;
                this.LLILLL.setImageBitmap(bitmap);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BaseKeyframeCell@2200.onBindItemView$1$1");
                return unit;
            }
        }
        bitmap = (Bitmap) obj;
        this.LLILLL.setImageBitmap(bitmap);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BaseKeyframeCell@2200.onBindItemView$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
