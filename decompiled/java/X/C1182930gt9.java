package X;

import com.ss.android.ugc.aweme.slash.data.SlashPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gt9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182930gt9 extends C09AY implements Function1<C1182980gtE, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ SlashPage LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1182930gt9(long j, SlashPage slashPage, boolean z) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = slashPage;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1182980gtE c1182980gtE) {
        C1182980gtE c1182980gtE2 = c1182980gtE;
        c1182980gtE2.LJIILIIL = "location_net_track_osp";
        c1182980gtE2.LIZLLL = "/tiktok/ls/order/slash/v1";
        c1182980gtE2.LJ = "poi_order_prepare";
        c1182980gtE2.LIZ = Long.valueOf(this.LL);
        c1182980gtE2.LIZIZ = Long.valueOf(System.currentTimeMillis());
        c1182980gtE2.LIZJ = this.LLILLJJLI;
        c1182980gtE2.LJIIIZ = Integer.valueOf(!this.LLILLL ? 1 : 0);
        return Unit.LIZ;
    }
}
