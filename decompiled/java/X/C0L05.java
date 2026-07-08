package X;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L05, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaCacheRepository$cacheImageColor$1", f = "MediaCacheRepository.kt", l = {}, m = "invokeSuspend")
public final class C0L05 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L05(String str, int i, boolean z, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L05(this.LLILLJJLI, this.LLILLL, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        double d;
        AbstractC1325130kaV abstractC1325130kaV;
        Bitmap underlyingBitmap;
        C1C7U.LIZ("MediaCacheRepository@601f.cacheImageColor$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL && C0C64.LJIILLIIL().LJIIIZ(31744, "close_color_extraction_on_photo_uploading", true, false)) {
            z = true;
        } else {
            z = false;
        }
        C0MOJ c0moj = new C0MOJ(z, false, 2);
        Pair pair = new Pair(this.LLILLJJLI, C2286608xc.LJ(this.LLILLL));
        C578520MmY c578520MmY = InterfaceC540790LIv.LJI;
        if (c578520MmY.getOpenAlbumOptiGroup() == 1) {
            d = 0.8d;
        } else if (c578520MmY.getOpenAlbumOptiGroup() == 2) {
            d = 0.6d;
        } else {
            d = 1.0d;
        }
        int iIntValue = ((Number) pair.getSecond()).intValue() * ((int) d);
        AbstractC1327750kej abstractC1327750kej = null;
        if (iIntValue > 0) {
            Class<?> cls = C1322200kVm.LIZ;
            C1325170kaZ<InterfaceC1324680kZm, AbstractC1327750kej> c1325170kaZLJII = C1328130kfL.LJIILIIL().LJII();
            String string = C2471909mP.LJIILIIL((String) pair.getFirst()).toString();
            C1324630kZh c1324630kZh = new C1324630kZh(iIntValue, iIntValue);
            C1324670kZl c1324670kZl = C1324670kZl.LIZJ;
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
            imageDecodeOptionsBuilder.getClass();
            C1323050kX9<AbstractC1327750kej> c1323050kX9 = c1325170kaZLJII.get(new C1324660kZk(string, c1324630kZh, c1324670kZl, new C1329360khK(imageDecodeOptionsBuilder), null, null, null));
            if (c1323050kX9 != null) {
                abstractC1327750kej = c1323050kX9.get();
            }
            if ((abstractC1327750kej instanceof C1325120kaU) && (abstractC1325130kaV = (AbstractC1325130kaV) abstractC1327750kej) != null && (underlyingBitmap = abstractC1325130kaV.getUnderlyingBitmap()) != null) {
                Pair<Integer, Integer> pairLIZIZ = c0moj.LIZIZ(underlyingBitmap);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cacheImageColor ");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append("-->");
                sbLIZ.append(pairLIZIZ);
                C201955140j.LIZIZ("MediaCacheRepository", C2188811AlT.LIZIZ(sbLIZ));
                C23203097h.LIZJ.put(this.LLILLJJLI, pairLIZIZ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaCacheRepository@601f.cacheImageColor$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
