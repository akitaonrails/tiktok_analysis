package X;

import android.content.ContentResolver;
import com.ss.android.ttve.nativePort.TEImageFactory;
import com.ss.android.ugc.aweme.port.internal.IMediaCacheService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09nL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.UpdateImageInformationCacheKt$updateImageInformationCache$1", f = "UpdateImageInformationCache.kt", l = {28, 31}, m = "invokeSuspend")
public final class C2477709nL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ ContentResolver LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2477709nL(ContentResolver contentResolver, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = str;
        this.LLIZ = contentResolver;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2477709nL c2477709nL = new C2477709nL(this.LLIZ, this.LLILZLL, interfaceC1364105Vn);
        c2477709nL.LLILZIL = obj;
        return c2477709nL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0957 anonymousClass0957LIZIZ;
        IMediaCacheService iMediaCacheServiceLJIILL;
        String str;
        int width;
        int height;
        C1C7U.LIZ("UpdateImageInformationCacheKt@8add.updateImageInformationCache$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    height = this.LLILLL;
                    width = this.LLILLJJLI;
                    str = (String) this.LL;
                    iMediaCacheServiceLJIILL = (IMediaCacheService) this.LLILZIL;
                    C155000ia.LIZIZ(obj);
                    iMediaCacheServiceLJIILL.cacheImageSize(str, width, height, ((Number) obj).intValue());
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("UpdateImageInformationCacheKt@8add.updateImageInformationCache$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anonymousClass0957LIZIZ = (AnonymousClass0957) this.LLILZIL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILZIL;
            C1DFB c1dfb = C0PEM.LIZJ;
            C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, c1dfb, null, new C2477609nK(this.LLIZ, this.LLILZLL, null), 2);
            anonymousClass0957LIZIZ = C23250099c.LIZIZ(interfaceC497601wk, c1dfb, null, new C2477809nM(this.LLILZLL, null), 2);
            this.LLILZIL = anonymousClass0957LIZIZ;
            this.LLILZ = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UpdateImageInformationCacheKt@8add.updateImageInformationCache$1");
                return objLJFF;
            }
        }
        TEImageFactory.ImageInfo imageInfo = (TEImageFactory.ImageInfo) obj;
        C0CHQ.LIZ().LJIILL().updateMediaTypeCache(this.LLILZLL, imageInfo.getMimeType());
        iMediaCacheServiceLJIILL = C0CHQ.LIZ().LJIILL();
        str = this.LLILZLL;
        width = imageInfo.getWidth();
        height = imageInfo.getHeight();
        this.LLILZIL = iMediaCacheServiceLJIILL;
        this.LL = str;
        this.LLILLJJLI = width;
        this.LLILLL = height;
        this.LLILZ = 2;
        obj = anonymousClass0957LIZIZ.LJLIIIL(this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("UpdateImageInformationCacheKt@8add.updateImageInformationCache$1");
            return objLJFF;
        }
        iMediaCacheServiceLJIILL.cacheImageSize(str, width, height, ((Number) obj).intValue());
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("UpdateImageInformationCacheKt@8add.updateImageInformationCache$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
