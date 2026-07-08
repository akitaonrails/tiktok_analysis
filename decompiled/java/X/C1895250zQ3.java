package X;

import com.bytedance.touchpoint.core.pendant.BaseTouchPointManager;
import com.bytedance.touchpoint.core.pendant.ad.AdFeedTimerPendantManager;
import com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger;
import com.bytedance.touchpoint.core.pendant.feed.lite.LiteFeedTimerPendantManger;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.bytedance.touchpoint.core.shortdrama.ShortDramaTimerPendantManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS23S1110000_28;

/* JADX INFO: renamed from: X.0zQ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895250zQ3 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ EnumC1895270zQ5 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1895250zQ3(EnumC1895270zQ5 enumC1895270zQ5) {
        super(0);
        this.LL = enumC1895270zQ5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        C2178808gE.LIZ().LIZ();
        Iterator<? extends InterfaceC1895290zQ7> it2 = C1895370zQF.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIIZZ(this.LL);
        }
        C01GW<SpecActPendantManager> c01gw2 = SpecActPendantManager.LLJJIJIIJIL;
        C1894330zOZ.LIZ().LJIIIIZZ(this.LL);
        C01GW<FeedTimerPendantManger> c01gw3 = FeedTimerPendantManger.LLJL;
        C1893440zN8.LIZ().LJIIIIZZ(this.LL);
        LiteFeedTimerPendantManger.LLJLLL.getValue().LJIIIIZZ(this.LL);
        C01GW<ShortDramaTimerPendantManager> c01gw4 = ShortDramaTimerPendantManager.LLJJJJ;
        C1893450zN9.LIZ().LJIIIIZZ(this.LL);
        List listLLIIII = C13LP.LLIIII(((LinkedHashMap) AdFeedTimerPendantManager.LLJJL).values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLLIIII) {
            if (((BaseTouchPointManager) obj).LJJ()) {
                arrayList.add(obj);
            }
        }
        EnumC1895270zQ5 enumC1895270zQ5 = this.LL;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((AbstractC1895130zPr) it3.next()).LJIIIIZZ(enumC1895270zQ5);
        }
        EnumC1895270zQ5 enumC1895270zQ52 = this.LL;
        if (enumC1895270zQ52 == EnumC1895270zQ5.TYPE_LOGIN || enumC1895270zQ52 == EnumC1895270zQ5.TYPE_SWITCH) {
            C1898040zUY.LIZ();
        }
        C1895720zQo.LIZIZ();
        C0T82.LJFF();
        int i = 8;
        C1896300zRk c1896300zRk = (C1896300zRk) C1619720sFe.LIZ.LIZ(8);
        if (c1896300zRk != null) {
            c1896300zRk.LJ();
        }
        C01GW<C759500Tqm> c01gw5 = C759500Tqm.LJ;
        C739380SzQ.LIZ().LIZ("UserInfoChanged");
        C1895370zQF c1895370zQF = C1895370zQF.LIZ;
        int i2 = C1895260zQ4.LIZ[this.LL.ordinal()];
        if (i2 == 1) {
            i = 7;
        } else if (i2 != 2) {
            i = i2 != 3 ? 1 : 10;
        }
        C1895370zQF.LIZIZ(c1895370zQF, Integer.valueOf(i));
        String value = EnumC1893950zNx.LOGIN_UPDATE.getValue();
        C1893940zNw value2 = C1893940zNw.LJI.getValue();
        value2.getClass();
        C01U6.LIZJ(new AwS23S1110000_28(value2, false, value, 0));
        return Unit.LIZ;
    }
}
