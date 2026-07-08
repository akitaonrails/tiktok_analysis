package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.097d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaCacheRepository$cacheImageSize$1", f = "MediaCacheRepository.kt", l = {}, m = "invokeSuspend")
public final class C23199097d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23199097d(String str, InterfaceC1364105Vn<? super C23199097d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23199097d(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaCacheRepository@601f.cacheImageSize$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair<Integer, Integer> pairLIZJ = C097U.LIZJ(this.LL);
        if (pairLIZJ.getFirst().intValue() != 0 && pairLIZJ.getSecond().intValue() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cacheImageSize ");
            sbLIZ.append(this.LL);
            sbLIZ.append("-->");
            sbLIZ.append(pairLIZJ);
            C201955140j.LIZIZ("MediaCacheRepository", C2188811AlT.LIZIZ(sbLIZ));
            C23203097h.LIZIZ.put(this.LL, pairLIZJ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaCacheRepository@601f.cacheImageSize$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
