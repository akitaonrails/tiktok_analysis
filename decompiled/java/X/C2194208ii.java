package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.edit.opt.StoryAlbumVeNlePreloadComponent$onFirstAlbumThumbnailLoaded$2", f = "StoryAlbumVeNlePreloadComponent.kt", l = {}, m = "invokeSuspend")
public final class C2194208ii extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C2194208ii(InterfaceC1364105Vn<? super C2194208ii> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2194208ii c2194208ii = new C2194208ii(interfaceC1364105Vn);
        c2194208ii.LL = obj;
        return c2194208ii;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("StoryAlbumVeNlePreloadComponent@adf4.onFirstAlbumThumbnailLoaded$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            c098200Yq = Boolean.valueOf(C0FGC.LIZ(2));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryAlbumVeNlePreloadComponent@adf4.onFirstAlbumThumbnailLoaded$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
