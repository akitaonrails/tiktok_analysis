package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zQJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895410zQJ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ ViewGroup LLILLJJLI;
    public final /* synthetic */ SpecActServiceImpl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1895410zQJ(Fragment fragment, ViewGroup viewGroup, SpecActServiceImpl specActServiceImpl) {
        super(0);
        this.LL = fragment;
        this.LLILLJJLI = viewGroup;
        this.LLILLL = specActServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
        C1894330zOZ.LIZ().LJIIJ(this.LLILLJJLI, this.LL);
        C01GW<FeedTimerPendantManger> c01gw2 = FeedTimerPendantManger.LLJL;
        C1893440zN8.LIZ().LJIIJ(this.LLILLJJLI, this.LL);
        C1900180zY0 c1900180zY0 = C1900180zY0.LL;
        C736950SvV c736950SvV = C1900180zY0.LLILLJJLI;
        C736680Sv4.LJIIIIZZ(c1900180zY0, c736950SvV.getValue(), new C2217381BqS() { // from class: X.0zPp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1895070zPl) obj).LL;
            }
        }, null, new C1895420zQK(), 6);
        C736680Sv4.LJIIIIZZ(c1900180zY0, c736950SvV.getValue(), new C2217381BqS() { // from class: X.0zQE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1895070zPl) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new C1895430zQL(), 4);
        this.LLILLL.getClass();
        return Unit.LIZ;
    }
}
