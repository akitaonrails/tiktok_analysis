package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fN5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124610fN5 implements InterfaceC1127800fSE {
    public final Context LL;
    public final EnumC1127500fRk LLILLJJLI = EnumC1127500fRk.GAMEPLAY_OPT_OUT;
    public final C01GW LLILLL;

    @Override // X.InterfaceC1127800fSE
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1127800fSE
    public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE, View view, C1124680fNC c1124680fNC) {
    }

    @Override // X.InterfaceC1127800fSE
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJII() {
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC1127800fSE
    public final C0T8B LJ() {
        return (C1124630fN7) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC1127800fSE
    public final EnumC1127500fRk getBannerType() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1127800fSE
    public final boolean LJFF(C1124680fNC c1124680fNC) {
        Gift gift;
        GiftLockInfo giftLockInfo;
        C1094360eaI c1094360eaIHP;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = c1124680fNC.LIZIZ;
        Object obj = null;
        if (abstractC1126600fQI != null) {
            obj = abstractC1126600fQI.LIZIZ;
        }
        if ((obj instanceof Gift) && (gift = (Gift) obj) != null && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLockType == 8 && (c1094360eaIHP = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).HP()) != null && c1094360eaIHP.LJFF == 2) {
            return true;
        }
        return false;
    }

    public C1124610fN5(Context context, View view) {
        this.LL = context;
        this.LLILLL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view, 547));
    }

    @Override // X.InterfaceC1127800fSE
    public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
        ((C1124630fN7) this.LLILLL.getValue()).h0();
        ((C1124630fN7) this.LLILLL.getValue()).setBannerClickListener(new AwS418S0200000_17(c1124680fNC, this, 90));
        return (View) this.LLILLL.getValue();
    }
}
