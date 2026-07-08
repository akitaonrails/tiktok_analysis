package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.poi.album.PoiAlbumPageApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gyK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.album.PoiAlbumPreloadHandler$preload$1", f = "PoiAlbumPreloadHandler.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C1186140gyK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PoiAlbumPageApi.PoiAlbumResponse>, Object> {
    public int LL;
    public final /* synthetic */ Function1<Class<PoiAlbumPageApi>, PoiAlbumPageApi> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1185410gx9 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1186140gyK(Function1<? super Class<PoiAlbumPageApi>, ? extends PoiAlbumPageApi> function1, String str, C1185410gx9 c1185410gx9, InterfaceC1364105Vn<? super C1186140gyK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
        this.LLILLL = str;
        this.LLILZ = c1185410gx9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1186140gyK(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        String requestExtraParams;
        String groupId;
        C1C7U.LIZ("PoiAlbumPreloadHandler@25c0.preload$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj2 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                Function1<Class<PoiAlbumPageApi>, PoiAlbumPageApi> function1 = this.LLILLJJLI;
                String str = this.LLILLL;
                C1185410gx9 c1185410gx9 = this.LLILZ;
                PoiAlbumPageApi poiAlbumPageApiInvoke = function1.invoke(PoiAlbumPageApi.class);
                if (c1185410gx9 != null) {
                    requestExtraParams = c1185410gx9.getRequestExtraParams();
                } else {
                    requestExtraParams = null;
                }
                if (c1185410gx9 == null) {
                    groupId = null;
                } else {
                    groupId = c1185410gx9.getGroupId();
                }
                this.LL = 1;
                obj = poiAlbumPageApiInvoke.LIZ(str, requestExtraParams, groupId, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PoiAlbumPreloadHandler@25c0.preload$1");
                    return objLJFF;
                }
            }
            c098200Yq = (PoiAlbumPageApi.PoiAlbumResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        C1C7U.LIZIZ("PoiAlbumPreloadHandler@25c0.preload$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PoiAlbumPageApi.PoiAlbumResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
