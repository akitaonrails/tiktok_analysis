package X;

import com.bytedance.android.livesdk.model.message.ext.ECShortItemRefreshMessage;
import com.bytedance.android.livesdk.model.message.ext.ShortItemRefreshEntity;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.api.EcMessageApi;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.api.SlimShortTouch;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NSW, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.shorttouch.ShortTouchController$doRefreshShortTouchItems$1", f = "ShortTouchController.kt", l = {451}, m = "invokeSuspend")
public final class C0NSW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ C1741600vQE LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ ECShortItemRefreshMessage LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NSW(String str, String str2, List<String> list, C1741600vQE c1741600vQE, int i, ECShortItemRefreshMessage eCShortItemRefreshMessage, InterfaceC1364105Vn<? super C0NSW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = list;
        this.LLILZIL = c1741600vQE;
        this.LLILZLL = i;
        this.LLIZ = eCShortItemRefreshMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NSW(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<SlimShortTouch> list;
        boolean z;
        String str;
        boolean z2;
        String strLJJLIIIJ;
        ShortItemRefreshEntity shortItemRefreshEntity;
        List<String> list2;
        ShortItemRefreshEntity shortItemRefreshEntity2;
        List<String> list3;
        ShortItemRefreshEntity shortItemRefreshEntity3;
        int iIntValue;
        Object objLIZ = obj;
        C1C7U.LIZ("ShortTouchController@79c8.doRefreshShortTouchItems$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String strLJJLIIIJ2 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZ);
            } else {
                C155000ia.LIZIZ(objLIZ);
                C0NSX c0nsx = EcMessageApi.LIZ;
                String str2 = this.LLILLJJLI;
                String str3 = this.LLILLL;
                List<String> list4 = this.LLILZ;
                C1741600vQE c1741600vQE = this.LLILZIL;
                Integer numLJ = C2286608xc.LJ(this.LLILZLL);
                c1741600vQE.getClass();
                if (numLJ != null) {
                    iIntValue = numLJ.intValue();
                } else {
                    iIntValue = 0;
                }
                if (iIntValue < 0) {
                    iIntValue = 0;
                }
                long jLJIIJJI = C13LZ.LJIIJJI(AbstractC19994813Le.Default, new C354710DvR(0L, iIntValue)) + ((long) 0);
                this.LL = 1;
                objLIZ = c0nsx.LIZ(jLJIIJJI, str2, str3, list4, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("ShortTouchController@79c8.doRefreshShortTouchItems$1");
                    return objLJFF;
                }
            }
            list = (List) objLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            list = null;
        }
        ECShortItemRefreshMessage eCShortItemRefreshMessage = this.LLIZ;
        if (eCShortItemRefreshMessage != null && (shortItemRefreshEntity3 = eCShortItemRefreshMessage.entity) != null && shortItemRefreshEntity3.refreshMsgType == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "origin_message";
        } else {
            str = "addtional_message";
        }
        if (list != null && !list.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            String str4 = this.LLILLJJLI;
            ECShortItemRefreshMessage eCShortItemRefreshMessage2 = this.LLIZ;
            if (eCShortItemRefreshMessage2 != null && (shortItemRefreshEntity2 = eCShortItemRefreshMessage2.entity) != null && (list3 = shortItemRefreshEntity2.refreshItems) != null) {
                strLJJLIIIJ = C13LP.LJJLIIIJ(list3, ",", null, null, 0, null, null, 62);
            } else {
                strLJJLIIIJ = null;
            }
            C594270NSn.LIZIZ(6, str4, strLJJLIIIJ, "", str);
            String str5 = this.LLILLJJLI;
            ECShortItemRefreshMessage eCShortItemRefreshMessage3 = this.LLIZ;
            if (eCShortItemRefreshMessage3 != null && (shortItemRefreshEntity = eCShortItemRefreshMessage3.entity) != null && (list2 = shortItemRefreshEntity.refreshItems) != null) {
                strLJJLIIIJ2 = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62);
            }
            C594270NSn.LIZJ(C2286608xc.LJ(1), str5, strLJJLIIIJ2, "", str);
        }
        Room room = this.LLILZIL.LL;
        if (room != null) {
            C1741600vQE c1741600vQE2 = this.LLILZIL;
            if (list != null) {
                c1741600vQE2.LJ(room, list, false, str);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShortTouchController@79c8.doRefreshShortTouchItems$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
