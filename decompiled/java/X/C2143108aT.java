package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08aT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.PopularStickerListManager$readCacheFromFile$2", f = "PopularStickerListManager.kt", l = {}, m = "invokeSuspend")
public final class C2143108aT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<Object>>, Object> {
    public final /* synthetic */ C452680Hp4 LL;
    public final /* synthetic */ Class<Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2143108aT(C452680Hp4 c452680Hp4, Class<Object> cls, InterfaceC1364105Vn<? super C2143108aT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c452680Hp4;
        this.LLILLJJLI = cls;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2143108aT(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List listLLIIII;
        C1C7U.LIZ("PopularStickerListManager@7b34.readCacheFromFile$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C2112608Pk.LJII(C2213981Bky.LIZIZ.getApplicationContext()));
            this.LL.getClass();
            String strLJIIIIZZ = C452680Hp4.LJIIIIZZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("/sticker_store_resources/pop_sticker/");
            sbLIZ2.append(strLJIIIIZZ);
            sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
            List listLIZ = C0XMK.LIZ(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)), this.LLILLJJLI);
            if (listLIZ != null) {
                listLLIIII = C13LP.LLIIII(listLIZ);
            } else {
                listLLIIII = null;
            }
            C1C7U.LIZIZ("PopularStickerListManager@7b34.readCacheFromFile$2");
            return listLLIIII;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C13BV c13bv = C13BV.INSTANCE;
            C1C7U.LIZIZ("PopularStickerListManager@7b34.readCacheFromFile$2");
            return c13bv;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<Object>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
