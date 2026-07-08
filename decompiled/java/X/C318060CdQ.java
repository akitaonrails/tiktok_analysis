package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.profile.business.effect.StickerItemList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CdQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.effect.EffectProfileListRepository$fetchStickerItemList$result$1", f = "EffectProfileListRepository.kt", l = {}, m = "invokeSuspend")
public final class C318060CdQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends StickerItemList>>, Object> {
    public final /* synthetic */ C318050CdP LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318060CdQ(C318050CdP c318050CdP, boolean z, InterfaceC1364105Vn<? super C318060CdQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c318050CdP;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318060CdQ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("EffectProfileListRepository@4ea9.fetchStickerItemList$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C318050CdP c318050CdP = this.LL;
            InterfaceC318090CdT interfaceC318090CdT = c318050CdP.LIZIZ;
            String strLIZ = c318050CdP.LIZ.LIZ();
            this.LL.LIZ.LIZIZ();
            StickerItemList stickerItemListLJ = c318050CdP.LJ(interfaceC318090CdT.LIZ(strLIZ, 0L, 10, 1).LJFF());
            if (this.LLILLJJLI && C306690C0l.LIZ()) {
                C23250099c.LIZLLL(this.LL.LIZ.scope(), C0PEM.LIZJ, null, new C318070CdR(this.LL.LIZ.LIZ(), stickerItemListLJ, null), 2);
            }
            C189200o6.m2constructorimpl(stickerItemListLJ);
            obj2 = stickerItemListLJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("EffectProfileListRepository", th.toString());
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj2 = c098200Yq;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(obj2);
        C1C7U.LIZIZ("EffectProfileListRepository@4ea9.fetchStickerItemList$result$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends StickerItemList>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
