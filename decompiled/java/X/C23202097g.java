package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.097g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaCacheRepository$updateFileSize$1", f = "MediaCacheRepository.kt", l = {}, m = "invokeSuspend")
public final class C23202097g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23202097g(String str, InterfaceC1364105Vn<? super C23202097g> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23202097g(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long length;
        C1C7U.LIZ("MediaCacheRepository@601f.updateFileSize$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL;
        if (C2471909mP.LJJIIZI(str)) {
            length = C570280MYg.LJ(UriProtector.parse(str));
        } else {
            length = new C0VSJ(str).length();
        }
        if (length > 0) {
            C23203097h.LJFF.put(this.LL, C2286608xc.LJFF(length));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaCacheRepository@601f.updateFileSize$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
