package X;

import android.view.View;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0fNC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124680fNC {
    public final int LIZ;
    public final AbstractC1126600fQI<? extends AnonymousClass0054> LIZIZ;
    public final AbstractC1126600fQI<? extends AnonymousClass0054> LIZJ;
    public final View LIZLLL;
    public final Gift LJ;
    public final long LJFF;
    public final GiftListResult LJI;
    public final GiftPanelBanner LJII;
    public final GiftPanelBanner LJIIIIZZ;
    public final EnumC1127640fRy LJIIIZ;
    public final AbstractC1100450ek7 LJIIJ;
    public final Room LJIIJJI;
    public final C1127920fSQ LJIIL;

    public static C1124680fNC LIZ(C1124680fNC c1124680fNC, EnumC1127640fRy enumC1127640fRy) {
        int i = c1124680fNC.LIZ;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = c1124680fNC.LIZIZ;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = c1124680fNC.LIZJ;
        View view = c1124680fNC.LIZLLL;
        Gift gift = c1124680fNC.LJ;
        long j = c1124680fNC.LJFF;
        GiftListResult giftListResult = c1124680fNC.LJI;
        GiftPanelBanner giftPanelBanner = c1124680fNC.LJII;
        GiftPanelBanner giftPanelBanner2 = c1124680fNC.LJIIIIZZ;
        AbstractC1100450ek7 abstractC1100450ek7 = c1124680fNC.LJIIJ;
        Room room = c1124680fNC.LJIIJJI;
        C1127920fSQ c1127920fSQ = c1124680fNC.LJIIL;
        c1124680fNC.getClass();
        return new C1124680fNC(i, abstractC1126600fQI, abstractC1126600fQI2, view, gift, j, giftListResult, giftPanelBanner, giftPanelBanner2, enumC1127640fRy, abstractC1100450ek7, room, c1127920fSQ);
    }

    public C1124680fNC(int i, AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI, AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2, View view, Gift gift, long j, GiftListResult giftListResult, GiftPanelBanner giftPanelBanner, GiftPanelBanner giftPanelBanner2, EnumC1127640fRy enumC1127640fRy, AbstractC1100450ek7 abstractC1100450ek7, Room room, C1127920fSQ c1127920fSQ) {
        this.LIZ = i;
        this.LIZIZ = abstractC1126600fQI;
        this.LIZJ = abstractC1126600fQI2;
        this.LIZLLL = view;
        this.LJ = gift;
        this.LJFF = j;
        this.LJI = giftListResult;
        this.LJII = giftPanelBanner;
        this.LJIIIIZZ = giftPanelBanner2;
        this.LJIIIZ = enumC1127640fRy;
        this.LJIIJ = abstractC1100450ek7;
        this.LJIIJJI = room;
        this.LJIIL = c1127920fSQ;
    }
}
