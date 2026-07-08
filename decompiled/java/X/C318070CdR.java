package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.effect.StickerItemList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import njp.a;

/* JADX INFO: renamed from: X.0CdR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.effect.EffectProfileListRepository$fetchStickerItemList$result$1$1", f = "EffectProfileListRepository.kt", l = {}, m = "invokeSuspend")
public final class C318070CdR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ StickerItemList LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318070CdR(String str, StickerItemList stickerItemList, InterfaceC1364105Vn<? super C318070CdR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = stickerItemList;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318070CdR(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectProfileListRepository@4ea9.fetchStickerItemList$result$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C318080CdS c318080CdS = C318080CdS.LIZ;
        String str = this.LL;
        StickerItemList stickerItemList = this.LLILLJJLI;
        c318080CdS.getClass();
        try {
            C0VSJ c0vsjLIZ = C318080CdS.LIZ(str);
            if (c0vsjLIZ != null) {
                String strLJIILL = C7740030o.LIZ().getGson().LJIILL(stickerItemList);
                synchronized (c318080CdS) {
                    try {
                        C09BH.LJIIIZ(c0vsjLIZ, strLJIILL, Charsets.UTF_8);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("saveCache success, size: ");
                sbLIZ.append(stickerItemList.getStickers().size());
                C1720106oR.LJI("EffectProfileCacheManager", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("saveCache error: ");
            sbLIZ2.append(e.getMessage());
            C1720106oR.LIZ("EffectProfileCacheManager", C2188811AlT.LIZIZ(sbLIZ2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectProfileListRepository@4ea9.fetchStickerItemList$result$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
