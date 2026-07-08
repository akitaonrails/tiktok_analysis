package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OgC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineModeCacheVideoManager$cacheVideos$2$urlKey$2$1", f = "OfflineModeCacheVideoManager.kt", l = {309}, m = "invokeSuspend")
public final class C625540OgC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Aweme LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C625540OgC(Aweme aweme, InterfaceC1364105Vn<? super C625540OgC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C625540OgC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineModeCacheVideoManager@1e1d.cacheVideos$2$urlKey$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C625530OgB c625530OgB = C625530OgB.LIZ;
                String aid = this.LLILLJJLI.getAid();
                this.LL = 1;
                c625530OgB.getClass();
                obj = C625530OgB.LJJI(aid);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OfflineModeCacheVideoManager@1e1d.cacheVideos$2$urlKey$2$1");
                    return objLJFF;
                }
            }
            if (((Number) obj).intValue() > 0) {
                MLDataCenterService.Companion.getClass();
                C1349505Px.LIZ.saveAwemeContentListForScore(Collections.singletonList(this.LLILLJJLI));
                C01GW c01gw = C625420Og0.LIZ;
                C625460Og4.LIZ.getClass();
                C625420Og0.LJIIJJI(C625460Og4.LJII() / 1024.0d);
                C625530OgB.LIZ.getClass();
                C625420Og0.LJIIL(C625530OgB.LIZIZ());
                if (C625420Og0.LIZJ() >= C625420Og0.LIZ()) {
                    if (C625420Og0.LJFF() == EnumC624770Oex.DOWNLOADING) {
                        C625460Og4.LJIIJJI(EnumC624960OfG.DOWNLOAD_FINISH.getValue());
                    }
                    C625420Og0.LJIILIIL(EnumC624770Oex.DOWNLOADED);
                }
                C19319410i8 c19319410i8 = C625460Og4.LIZLLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("update cache state ");
                sbLIZ.append(this.LLILLJJLI.getAid());
                c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                C625690OgR c625690OgR = C625690OgR.LIZ;
                String aid2 = this.LLILLJJLI.getAid();
                Aweme aweme = this.LLILLJJLI;
                c625690OgR.getClass();
                C625690OgR.LIZ(aweme, aid2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C625460Og4.LIZLLL.LJ(String.valueOf(e));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OfflineModeCacheVideoManager@1e1d.cacheVideos$2$urlKey$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
