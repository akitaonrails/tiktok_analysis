package X;

import Y.ARunnableS0S0210100_26;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0w2P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.module.header.opt.SeaHeaderImageLogger$onFirstHeaderImageStart$1", f = "SeaHeaderImageLogger.kt", l = {}, m = "invokeSuspend")
public final class C1765270w2P extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Image LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1765300w2S LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1765270w2P(Image image, boolean z, C1765300w2S c1765300w2S, long j, InterfaceC1364105Vn<? super C1765270w2P> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = image;
        this.LLILLJJLI = z;
        this.LLILLL = c1765300w2S;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1765270w2P(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("SeaHeaderImageLogger@abb3.onFirstHeaderImageStart$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<String> urls = this.LL.getUrls();
        String str2 = null;
        if (urls != null) {
            str = (String) C13LP.LJJJLL(urls);
        } else {
            str = null;
        }
        boolean zLIZIZ = C1325420kay.LIZIZ(str);
        boolean z = true;
        if (this.LLILLJJLI) {
            C1765300w2S c1765300w2S = this.LLILLL;
            c1765300w2S.LIZIZ = true;
            c1765300w2S.LJFF = !zLIZIZ;
            List<String> urls2 = this.LL.getUrls();
            if (urls2 != null) {
                str2 = (String) C13LP.LJJJLL(urls2);
            }
            Pair<Integer, Integer> pairLIZ = C1743690vTb.LIZ(str2);
            if (pairLIZ != null && pairLIZ.getSecond().intValue() != 0) {
                this.LLILLL.LIZJ = pairLIZ.getFirst().floatValue() / pairLIZ.getSecond().intValue();
            }
        } else {
            String uri = this.LL.getUri();
            C1765300w2S c1765300w2S2 = this.LLILLL;
            if (C703302op.LIZ(uri)) {
                C01GW c01gw = C1066190dqr.LIZ;
                if (C1066190dqr.LJIIIIZZ(this.LLILLL.LIZ.getProductId(), uri) != null || zLIZIZ) {
                    z = false;
                }
            }
            c1765300w2S2.LJI = z;
            Integer width = this.LL.getWidth();
            Integer height = this.LL.getHeight();
            if (width != null && height != null && height.intValue() != 0 && width.intValue() != 0) {
                this.LLILLL.LIZLLL = width.intValue() / height.intValue();
            }
            C1765300w2S c1765300w2S3 = this.LLILLL;
            c1765300w2S3.LJII = this.LLILZ;
            ARunnableS0S0210100_26 aRunnableS0S0210100_26 = c1765300w2S3.LJIIIIZZ;
            if (aRunnableS0S0210100_26 != null) {
                aRunnableS0S0210100_26.run();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaHeaderImageLogger@abb3.onFirstHeaderImageStart$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
