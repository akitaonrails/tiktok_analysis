package X;

import android.app.Activity;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.preload.SearchAdPreloadModule;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cKd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.preload.SearchAdPreloadModule$beforChunkRead$1", f = "SearchAdPreloadModule.kt", l = {}, m = "invokeSuspend")
public final class C1007770cKd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ SearchAdPreloadModule LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007770cKd(Aweme aweme, int i, Aweme aweme2, SearchAdPreloadModule searchAdPreloadModule, InterfaceC1364105Vn<? super C1007770cKd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
        this.LLILLJJLI = i;
        this.LLILLL = aweme2;
        this.LLILZ = searchAdPreloadModule;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1007770cKd(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchAdPreloadModule@33e4.beforChunkRead$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Aweme aweme = this.LL;
        if ((aweme != null && AwemeExtKt.isAdTraffic(aweme)) || C1010120cOQ.LJJIJ(this.LL)) {
            SearchAdPreloadModule searchAdPreloadModule = this.LLILZ;
            Aweme aweme2 = this.LL;
            int i = this.LLILLJJLI;
            searchAdPreloadModule.getClass();
            if (aweme2 != null && !C1010120cOQ.LJJIJ(aweme2)) {
                SAFHelper.LIZ.getClass();
                Activity activityLJIIIIZZ = SAFHelper.LJIIIIZZ(null);
                if (i == 65280 || i == 62) {
                    searchAdPreloadModule.LJFF();
                }
                Set<EnumC1007780cKe> set = searchAdPreloadModule.LIZ;
                EnumC1007780cKe enumC1007780cKe = EnumC1007780cKe.ANCHOR_LAYOUT;
                if (!set.contains(enumC1007780cKe) && C1010120cOQ.LJIILL(aweme2)) {
                    C21146717pB.LIZJ(activityLJIIIIZZ, R.layout.et3);
                    searchAdPreloadModule.LIZ.add(enumC1007780cKe);
                }
                Set<EnumC1007780cKe> set2 = searchAdPreloadModule.LIZ;
                EnumC1007780cKe enumC1007780cKe2 = EnumC1007780cKe.RELATION_BTN_LAYOUT;
                if (!set2.contains(enumC1007780cKe2) && C1010120cOQ.LIZJ(aweme2)) {
                    C21146717pB.LIZJ(activityLJIIIIZZ, R.layout.et4);
                    searchAdPreloadModule.LIZ.add(enumC1007780cKe2);
                }
            }
            SearchAdPreloadModule searchAdPreloadModule2 = this.LLILZ;
            Set<EnumC1007780cKe> set3 = searchAdPreloadModule2.LIZ;
            EnumC1007780cKe enumC1007780cKe3 = EnumC1007780cKe.EVENT_TRACKER;
            if (!set3.contains(enumC1007780cKe3)) {
                C1009980cOC c1009980cOC = C1009980cOC.LIZ;
                C1009970cOB c1009970cOB = C1009970cOB.LIZ;
                searchAdPreloadModule2.LIZ.add(enumC1007780cKe3);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SearchAdPreloadModule@33e4.beforChunkRead$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchAdPreloadModule@33e4.beforChunkRead$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
