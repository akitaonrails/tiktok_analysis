package X;

import com.bytedance.android.livesdk.comp.impl.musicgift.data.network.MusicGiftRetrofitApi;
import com.bytedance.android.livesdk.gift.model.MusicGiftFavouriteUpdateParams;
import com.bytedance.android.livesdk.gift.model.MusicGiftFavouriteUpdateResponse;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fyI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.data.repository.MusicGiftRepository$updateFavourite$2", f = "MusicGiftRepository.kt", l = {86}, m = "invokeSuspend")
public final class C1147680fyI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1147530fy3<? extends List<? extends Gift>>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1147690fyJ LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ List<Long> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147680fyI(C1147690fyJ c1147690fyJ, int i, List<Long> list, InterfaceC1364105Vn<? super C1147680fyI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1147690fyJ;
        this.LLILZ = i;
        this.LLILZIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1147680fyI c1147680fyI = new C1147680fyI(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1147680fyI.LLILLJJLI = obj;
        return c1147680fyI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object obj2;
        C1C7U.LIZ("MusicGiftRepository@a574.updateFavourite$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    Object obj3 = this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                    obj2 = obj3;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C1147690fyJ c1147690fyJ = this.LLILLL;
                int i2 = this.LLILZ;
                List<Long> list = this.LLILZIL;
                MusicGiftFavouriteUpdateParams musicGiftFavouriteUpdateParams = new MusicGiftFavouriteUpdateParams();
                musicGiftFavouriteUpdateParams.updateType = i2;
                musicGiftFavouriteUpdateParams.giftIds = new ArrayList(list);
                MusicGiftRetrofitApi musicGiftRetrofitApi = c1147690fyJ.LIZ;
                this.LLILLJJLI = c1147690fyJ;
                this.LL = 1;
                obj = musicGiftRetrofitApi.updateMusicGiftFavourite(musicGiftFavouriteUpdateParams, this);
                obj2 = c1147690fyJ;
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MusicGiftRepository@a574.updateFavourite$2");
                    return objLJFF;
                }
            }
            C470590Icr c470590Icr = (C470590Icr) obj;
            obj2.getClass();
            c098200Yq = C1147690fyJ.LJ(c470590Icr);
            if (c098200Yq == null) {
                MusicGiftFavouriteUpdateResponse.Data data = (MusicGiftFavouriteUpdateResponse.Data) c470590Icr.data;
                if (data == null) {
                    c098200Yq = new C1147540fy4(null, "MusicGift response data is empty", 1);
                } else {
                    c098200Yq = new C1147590fy9(data.gifts);
                }
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c098200Yq = new C1147540fy4(thM5exceptionOrNullimpl, null, 2);
        }
        C1C7U.LIZIZ("MusicGiftRepository@a574.updateFavourite$2");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1147530fy3<? extends List<? extends Gift>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
