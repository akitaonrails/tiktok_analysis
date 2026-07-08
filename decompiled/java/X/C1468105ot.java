package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.detail.keyframe.util.SearchThumbImageLoadUtil$loadImageFromUrlByRegion$1", f = "SearchThumbImageLoadUtil.kt", l = {217, 220}, m = "invokeSuspend")
public final class C1468105ot extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ LifecycleOwner LLILLL;
    public final /* synthetic */ Rect LLILZ;
    public final /* synthetic */ ImageView LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1468105ot(String str, LifecycleOwner lifecycleOwner, Rect rect, ImageView imageView, InterfaceC1364105Vn<? super C1468105ot> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = rect;
        this.LLILZIL = imageView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1468105ot(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        AnonymousClass0957<BitmapRegionDecoder> anonymousClass0957PutIfAbsent;
        C1C7U.LIZ("SearchThumbImageLoadUtil@484c.loadImageFromUrlByRegion$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SearchThumbImageLoadUtil@484c.loadImageFromUrlByRegion$1");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ConcurrentHashMap<String, AnonymousClass0957<BitmapRegionDecoder>> concurrentHashMap = C09MB.LJ;
            String str = this.LLILLJJLI;
            LifecycleOwner lifecycleOwner = this.LLILLL;
            AnonymousClass0957<BitmapRegionDecoder> anonymousClass0957LIZIZ = concurrentHashMap.get(str);
            if (anonymousClass0957LIZIZ == null && (anonymousClass0957PutIfAbsent = concurrentHashMap.putIfAbsent(str, (anonymousClass0957LIZIZ = C23250099c.LIZIZ(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C1468205ou(str, null), 3)))) != null) {
                anonymousClass0957LIZIZ = anonymousClass0957PutIfAbsent;
            }
            this.LL = 1;
            obj = anonymousClass0957LIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchThumbImageLoadUtil@484c.loadImageFromUrlByRegion$1");
                return objLJFF;
            }
        }
        BitmapRegionDecoder bitmapRegionDecoder = (BitmapRegionDecoder) obj;
        if (bitmapRegionDecoder == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("SearchThumbImageLoadUtil@484c.loadImageFromUrlByRegion$1");
            return unit2;
        }
        Rect rect = this.LLILZ;
        ImageView imageView = this.LLILZIL;
        Bitmap bitmapDecodeRegion = bitmapRegionDecoder.decodeRegion(rect, (BitmapFactory.Options) C09MB.LIZIZ.getValue());
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1468005os c1468005os = new C1468005os(imageView, bitmapDecodeRegion, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1468005os) == objLJFF) {
            C1C7U.LIZIZ("SearchThumbImageLoadUtil@484c.loadImageFromUrlByRegion$1");
            return objLJFF;
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("SearchThumbImageLoadUtil@484c.loadImageFromUrlByRegion$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
