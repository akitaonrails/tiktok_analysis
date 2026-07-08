package X;

import android.net.Uri;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DRd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.image.UsEcommercePopCardImageFetcher$loadImage$1", f = "UsEcommercePopCardImageFetcher.kt", l = {}, m = "invokeSuspend")
public final class C339110DRd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C05XL<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C339110DRd(String str, C05XL<Unit> c05xl, InterfaceC1364105Vn<? super C339110DRd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c05xl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C339110DRd(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UsEcommercePopCardImageFetcher@4f46.loadImage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LruCache<String, C05XL<Unit>> lruCache = C339120DRe.LIZ;
        String str = this.LL;
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        Uri uri = UriProtector.parse(str);
        c1326790kdB.getClass();
        if (!C1326790kdB.LIZIZ(uri)) {
            String str2 = this.LL;
            C05XL<Unit> c05xl = this.LLILLJJLI;
            c1326790kdB.getClass();
            C1326790kdB.LIZLLL(str2).LJJII(new C339130DRf(str2, c05xl));
        } else {
            Boolean.valueOf(this.LLILLJJLI.LJIIZILJ(Unit.LIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UsEcommercePopCardImageFetcher@4f46.loadImage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
