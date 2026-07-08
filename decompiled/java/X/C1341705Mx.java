package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Mx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.AIMusicPreRequestCacheManager$reportPreCapsuleRequest$1", f = "AIMusicPreRequestCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C1341705Mx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Long LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1341705Mx(Long l, boolean z, InterfaceC1364105Vn<? super C1341705Mx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = l;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1341705Mx(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIMusicPreRequestCacheManager@c436.reportPreCapsuleRequest$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("music_id", this.LL.toString());
        c0lab.LIZ(this.LLILLJJLI ? 1 : 0, "is_same_cache_from_store");
        C20684815ws.LJIILLIIL("auto_music_use_pre_request", c0lab.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportPreCapsuleRequest musicId:");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isCacheFromSave:");
        sbLIZ.append(this.LLILLJJLI);
        C201955140j.LJIILIIL("AIMusicPreRequestCacheManager", C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIMusicPreRequestCacheManager@c436.reportPreCapsuleRequest$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
