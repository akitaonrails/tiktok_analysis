package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.exp.IMStickerFavPageSizeConfig;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.model.GetStickerFavoritesResp;
import com.ss.android.ugc.aweme.stickerstore.api.StickerApiV2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Hkv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.basic.repo.BasicStickerRepository$refreshFavouriteStickers$1", f = "BasicStickerRepository.kt", l = {260}, m = "invokeSuspend")
public final class C450110Hkv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C450100Hku LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C450110Hkv(C450100Hku c450100Hku, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c450100Hku;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C450110Hkv c450110Hkv = new C450110Hkv(this.LLILZ, this.LLILLL, interfaceC1364105Vn);
        c450110Hkv.LLILLJJLI = obj;
        return c450110Hkv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        long jLongValue;
        C1C7U.LIZ("BasicStickerRepository@45d8.refreshFavouriteStickers$1");
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
                String str = this.LLILLL;
                StickerApiV2 stickerApiV2LIZIZ = C452670Hp3.LIZIZ();
                long j = ((IMStickerFavPageSizeConfig.Config) IMStickerFavPageSizeConfig.LIZIZ.getValue()).refreshCount;
                boolean zLIZ = C454510Hs1.LIZ();
                this.LL = 1;
                obj = stickerApiV2LIZIZ.LJ(0L, j, zLIZ, str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BasicStickerRepository@45d8.refreshFavouriteStickers$1");
                    return objLJFF;
                }
            }
            c098200Yq = (GetStickerFavoritesResp) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C450100Hku c450100Hku = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            GetStickerFavoritesResp getStickerFavoritesResp = (GetStickerFavoritesResp) c098200Yq;
            c450100Hku.LJIIJ = true;
            Long cursor = getStickerFavoritesResp.getCursor();
            if (cursor != null) {
                jLongValue = cursor.longValue();
            } else {
                jLongValue = 0;
            }
            c450100Hku.LJIILIIL = jLongValue;
            c450100Hku.LJIIL = Intrinsics.LJFF(getStickerFavoritesResp.getHasMore(), true);
            List<StickerItem> stickers = getStickerFavoritesResp.getStickers();
            if (stickers == null) {
                stickers = C13BV.INSTANCE;
            }
            c450100Hku.LJ.setValue(new C450040Hko(stickers, c450100Hku.LJIIL));
        }
        C450100Hku c450100Hku2 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c450100Hku2.LJ.setValue(new C450050Hkp(thM5exceptionOrNullimpl));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BasicStickerRepository@45d8.refreshFavouriteStickers$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
