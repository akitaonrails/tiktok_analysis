package X;

import android.graphics.Bitmap;
import com.bytedance.common.utility.BitmapUtils;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import x5h.d;

/* JADX INFO: renamed from: X.08na, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.photo.processor.OptimizeTakePhotoProcessor$onProcess$2$getAuditFileTask$1", f = "OptimizeTakePhotoProcessor.kt", l = {223, 235}, m = "invokeSuspend")
public final class C2224408na extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<Pair<Bitmap, Long>> LLILLJJLI;
    public final /* synthetic */ d LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2224408na(AnonymousClass0957<Pair<Bitmap, Long>> anonymousClass0957, d dVar, C259800zU<String> c259800zU, InterfaceC1364105Vn<? super C2224408na> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
        this.LLILLL = dVar;
        this.LLILZ = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2224408na(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("OptimizeTakePhotoProcessor@e73a.onProcess$2$getAuditFileTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("OptimizeTakePhotoProcessor@e73a.onProcess$2$getAuditFileTask$1");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0957<Pair<Bitmap, Long>> anonymousClass0957 = this.LLILLJJLI;
            this.LL = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OptimizeTakePhotoProcessor@e73a.onProcess$2$getAuditFileTask$1");
                return objLJFF;
            }
        }
        Bitmap bitmap = (Bitmap) ((Pair) obj).getFirst();
        if (bitmap != null) {
            int i2 = C2224308nZ.LIZ[0];
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (i2 < width) {
                height = (int) (((double) i2) * ((((double) height) * 1.0d) / ((double) width)));
            } else {
                i2 = width;
            }
            Bitmap bitmapResizeBitmap = BitmapUtils.resizeBitmap(bitmap, i2, height);
            d dVar = this.LLILLL;
            String str = this.LLILZ.element;
            if (str != null) {
                this.LL = 2;
                dVar.getClass();
                obj = d.LJ(bitmapResizeBitmap, str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OptimizeTakePhotoProcessor@e73a.onProcess$2$getAuditFileTask$1");
                    return objLJFF;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            obj = null;
            this.LLILZ.element = null;
        }
        C1C7U.LIZIZ("OptimizeTakePhotoProcessor@e73a.onProcess$2$getAuditFileTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
