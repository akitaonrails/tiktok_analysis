package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ndt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.us.room.UsPreviewBagHelper$handleBagPreviewV1$1", f = "UsPreviewBagHelper.kt", l = {46, 52}, m = "invokeSuspend")
public final class C598630Ndt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C598650Ndv LLILLL;
    public final /* synthetic */ Room LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ Function1<String, Unit> LLILZLL;
    public final /* synthetic */ HashMap<String, String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C598630Ndt(C598650Ndv c598650Ndv, Room room, long j, Function1<? super String, Unit> function1, HashMap<String, String> map, InterfaceC1364105Vn<? super C598630Ndt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c598650Ndv;
        this.LLILZ = room;
        this.LLILZIL = j;
        this.LLILZLL = function1;
        this.LLIZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C598630Ndt c598630Ndt = new C598630Ndt(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c598630Ndt.LLILLJJLI = obj;
        return c598630Ndt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("UsPreviewBagHelper@6b12.handleBagPreviewV1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C2341109Fh.LIZ.getClass();
                    C2341109Fh.LJ("don't need check preview data");
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("UsPreviewBagHelper@6b12.handleBagPreviewV1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            SettingsManager.LIZLLL().getClass();
            long jLJFF = SettingsManager.LJFF("ec_shopping_bag_preview_start_interval", 500L);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLJFF, this) == objLJFF) {
                C1C7U.LIZIZ("UsPreviewBagHelper@6b12.handleBagPreviewV1$1");
                return objLJFF;
            }
        }
        if (this.LLILLL.LIZ.get()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJII("cancel before start");
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("UsPreviewBagHelper@6b12.handleBagPreviewV1$1");
            return unit2;
        }
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("fetchShoppingBagPreview");
        C21190617wG c21190617wG = C21190617wG.LIZ;
        String strValueOf = String.valueOf(this.LLILZ.getId());
        String strValueOf2 = String.valueOf(this.LLILZ.getOwnerUserId());
        long j = this.LLILZIL;
        EnumC598510Ndh enumC598510Ndh = EnumC598510Ndh.ROOM_ENTER;
        Function1<String, Unit> function1 = this.LLILZLL;
        HashMap<String, String> map = this.LLIZ;
        this.LLILLJJLI = null;
        this.LL = 2;
        if (c21190617wG.LIZ(interfaceC497601wk, strValueOf, strValueOf2, false, true, j, enumC598510Ndh, function1, map, this) == objLJFF) {
            C1C7U.LIZIZ("UsPreviewBagHelper@6b12.handleBagPreviewV1$1");
            return objLJFF;
        }
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("don't need check preview data");
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("UsPreviewBagHelper@6b12.handleBagPreviewV1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
