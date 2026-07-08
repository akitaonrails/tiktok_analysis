package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08aS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.PopularStickerListManager$writeTabPagesToFile$2", f = "PopularStickerListManager.kt", l = {}, m = "invokeSuspend")
public final class C2143008aS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C452680Hp4 LL;
    public final /* synthetic */ List<C452690Hp5> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2143008aS(C452680Hp4 c452680Hp4, List<C452690Hp5> list, InterfaceC1364105Vn<? super C2143008aS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c452680Hp4;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2143008aS(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0VSJ c0vsjLIZJ;
        C1C7U.LIZ("PopularStickerListManager@7b34.writeTabPagesToFile$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C2138108Zf c2138108Zf = InterfaceC2138008Ze.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C2112608Pk.LJII(C2213981Bky.LIZIZ.getApplicationContext()));
            sbLIZ.append("/sticker_store_resources/pop_sticker_tab/");
            this.LL.getClass();
            sbLIZ.append(C452680Hp4.LIZ());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2138108Zf.getClass();
            c0vsjLIZJ = C2106108Mx.LIZJ(strLIZIZ, true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (c0vsjLIZJ == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PopularStickerListManager@7b34.writeTabPagesToFile$2");
            return unit;
        }
        C0XMK.LIZIZ(c0vsjLIZJ, this.LLILLJJLI);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PopularStickerListManager@7b34.writeTabPagesToFile$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
