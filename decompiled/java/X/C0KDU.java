package X;

import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.subscribe.model.RefundInfo;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubsTransitionPeriodInfo;
import com.bytedance.android.pgcsdk.subscribe.model.PGCTipsInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KDU, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KDU extends C09AY implements Function1<C513800KDa, C513800KDa> {
    public final /* synthetic */ SubInfo LL;
    public final /* synthetic */ Boolean LLILLJJLI;
    public final /* synthetic */ Boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ RefundInfo LLIZ;
    public final /* synthetic */ Integer LLIZLLLIL;
    public final /* synthetic */ Boolean LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ PGCTipsInfo LLJIJIL;
    public final /* synthetic */ PGCSubsTransitionPeriodInfo LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KDU(SubInfo subInfo, Boolean bool, Boolean bool2, String str, Boolean bool3, String str2, RefundInfo refundInfo, Integer num, Boolean bool4, String str3, PGCTipsInfo pGCTipsInfo, PGCSubsTransitionPeriodInfo pGCSubsTransitionPeriodInfo) {
        super(1);
        this.LL = subInfo;
        this.LLILLJJLI = bool;
        this.LLILLL = bool2;
        this.LLILZ = str;
        this.LLILZIL = bool3;
        this.LLILZLL = str2;
        this.LLIZ = refundInfo;
        this.LLIZLLLIL = num;
        this.LLJ = bool4;
        this.LLJI = str3;
        this.LLJIJIL = pGCTipsInfo;
        this.LLJILJIL = pGCSubsTransitionPeriodInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C513800KDa invoke(C513800KDa c513800KDa) {
        C513800KDa c513800KDa2 = c513800KDa;
        C0KDT c0kdt = c513800KDa2.LLILZLL;
        C0KDT c0kdt2 = new C0KDT(c0kdt.LIZ, c0kdt.LIZIZ, c0kdt.LIZJ, c0kdt.LIZLLL, c0kdt.LJ, c0kdt.LJFF, c0kdt.LJI, c0kdt.LJII, c0kdt.LJIIIIZZ, c0kdt.LJIIIZ, c0kdt.LJIIJ, c0kdt.LJIIJJI, c0kdt.LJIIL);
        SubInfo subInfo = this.LL;
        if (subInfo != null) {
            c0kdt2.LIZ = subInfo;
        }
        Boolean bool = this.LLILLJJLI;
        if (bool != null) {
            c0kdt2.LIZIZ = bool.booleanValue();
            c0kdt2.LJIIJ = C0K7G.LJIIIZ();
        }
        Boolean bool2 = this.LLILLL;
        if (bool2 != null) {
            c0kdt2.LIZJ = bool2.booleanValue();
        }
        String str = this.LLILZ;
        if (str != null && str.length() != 0) {
            c0kdt2.LIZLLL = this.LLILZ;
        }
        Boolean bool3 = this.LLILZIL;
        if (bool3 != null) {
            c0kdt2.LJ = bool3.booleanValue();
        }
        if (this.LLILZLL.length() > 0) {
            c0kdt2.LJFF = this.LLILZLL;
        }
        RefundInfo refundInfo = this.LLIZ;
        if (refundInfo != null) {
            c0kdt2.LJII = refundInfo;
        }
        Integer num = this.LLIZLLLIL;
        if (num != null) {
            c0kdt2.LJI = num.intValue();
        }
        Boolean bool4 = this.LLJ;
        if (bool4 != null) {
            c0kdt2.LJIIIIZZ = bool4.booleanValue();
        }
        String str2 = this.LLJI;
        if (str2 != null) {
            c0kdt2.LJIIIZ = str2;
        }
        PGCTipsInfo pGCTipsInfo = this.LLJIJIL;
        if (pGCTipsInfo != null) {
            c0kdt2.LJIIJJI = pGCTipsInfo;
        }
        PGCSubsTransitionPeriodInfo pGCSubsTransitionPeriodInfo = this.LLJILJIL;
        if (pGCSubsTransitionPeriodInfo != null) {
            c0kdt2.LJIIL = pGCSubsTransitionPeriodInfo;
        }
        return C513800KDa.LIZ(c513800KDa2, null, null, null, null, c0kdt2, null, null, 479);
    }
}
