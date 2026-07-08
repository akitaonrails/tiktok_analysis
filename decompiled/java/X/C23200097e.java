package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.097e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaCacheRepository$updateMediaTypeCache$2", f = "MediaCacheRepository.kt", l = {}, m = "invokeSuspend")
public final class C23200097e extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23200097e(String str, InterfaceC1364105Vn<? super C23200097e> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23200097e(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaCacheRepository@601f.updateMediaTypeCache$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean zLJJIII = C2471909mP.LJJIII(this.LL, true, 4);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set ");
        sbLIZ.append(this.LL);
        sbLIZ.append("-->isImage:");
        sbLIZ.append(zLJJIII);
        C201955140j.LIZIZ("MediaCacheRepository", C2188811AlT.LIZIZ(sbLIZ));
        C23203097h.LIZ.put(this.LL, Boolean.valueOf(zLJJIII));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaCacheRepository@601f.updateMediaTypeCache$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
