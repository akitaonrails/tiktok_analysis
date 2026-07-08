package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Cka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.videmodel.TakoFeedRightBottomEntranceFixedViewModel$initViewPagerListenerIfNot$3$1", f = "TakoFeedRightBottomEntranceViewModel.kt", l = {}, m = "invokeSuspend")
public final class C322500Cka extends C09AX implements InterfaceC1685420txc<Aweme, Map<String, ? extends Boolean>, Map<String, ? extends Boolean>, Map<String, ? extends Integer>, InterfaceC1364105Vn<? super C322510Ckb>, Object> {
    public /* synthetic */ Aweme LL;
    public /* synthetic */ Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C013C LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C322500Cka(C013C c013c, InterfaceC1364105Vn<? super C322500Cka> interfaceC1364105Vn) {
        super(5, interfaceC1364105Vn);
        this.LLILZIL = c013c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        C322510Ckb c322510Ckb;
        boolean z;
        Boolean bool;
        C1C7U.LIZ("TakoFeedRightBottomEntranceFixedViewModel@ccb0.initViewPagerListenerIfNot$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Aweme aweme = this.LL;
        Map map = (Map) this.LLILLJJLI;
        Map map2 = (Map) this.LLILLL;
        Map map3 = (Map) this.LLILZ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        int iIntValue = 0;
        if (aid == null) {
            c322510Ckb = new C322510Ckb(false, 0);
        } else {
            Boolean bool2 = (Boolean) map.get(aid);
            if (bool2 != null && bool2.booleanValue() && (bool = (Boolean) map2.get(aid)) != null && bool.booleanValue() && !this.LLILZIL.element) {
                z = true;
            } else {
                z = false;
            }
            Integer num = (Integer) map3.get(aid);
            if (num != null) {
                iIntValue = num.intValue();
            }
            c322510Ckb = new C322510Ckb(z, iIntValue);
        }
        C1C7U.LIZIZ("TakoFeedRightBottomEntranceFixedViewModel@ccb0.initViewPagerListenerIfNot$3$1");
        return c322510Ckb;
    }

    @Override // X.InterfaceC1685420txc
    public final Object invoke(Aweme aweme, Map<String, ? extends Boolean> map, Map<String, ? extends Boolean> map2, Map<String, ? extends Integer> map3, InterfaceC1364105Vn<? super C322510Ckb> interfaceC1364105Vn) {
        C322500Cka c322500Cka = new C322500Cka(this.LLILZIL, interfaceC1364105Vn);
        c322500Cka.LL = aweme;
        c322500Cka.LLILLJJLI = map;
        c322500Cka.LLILLL = map2;
        c322500Cka.LLILZ = map3;
        return c322500Cka.invokeSuspend(Unit.LIZ);
    }
}
