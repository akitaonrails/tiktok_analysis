package X;

import android.view.View;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS666S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fRm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127520fRm implements InterfaceC1127800fSE {
    public final View LL;
    public final C1127870fSL LLILLJJLI;
    public Gift LLILZ;
    public C215500sL LLILZIL;
    public Pair<? extends List<GiftColorInfo>, Long> LLILLL = new Pair<>(C13BV.INSTANCE, 0L);
    public long LLILZLL = -1;
    public final EnumC1127500fRk LLIZ = EnumC1127500fRk.CHANGE_COLOR;
    public final C01GW LLIZLLLIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(this, 527));

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
        this.LLILZIL = null;
    }

    @Override // X.InterfaceC1127800fSE
    /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public final C1128340fT6 LJ() {
        return (C1128340fT6) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC1127800fSE
    public final EnumC1127500fRk getBannerType() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1127800fSE
    public final boolean LJFF(C1124680fNC c1124680fNC) {
        Gift.ColorPickerInfo colorPickerInfo;
        Boolean boolValueOf;
        LiveMode streamType;
        Gift gift = c1124680fNC.LJ;
        if (gift != null) {
            colorPickerInfo = gift.colorPickerInfo;
        } else {
            colorPickerInfo = null;
        }
        boolean zLIZIZ = C1128300fT2.LIZIZ(colorPickerInfo);
        if (!zLIZIZ) {
            if (gift != null) {
                boolValueOf = Boolean.valueOf(gift.LIZJ());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf) && gift != null && gift.giftPanelBanner != null) {
                Room room = c1124680fNC.LJIIJJI;
                if (room != null) {
                    streamType = room.getStreamType();
                } else {
                    streamType = null;
                }
                if (streamType == LiveMode.VIDEO) {
                    C1127870fSL c1127870fSL = this.LLILLJJLI;
                    c1127870fSL.LIZ = null;
                    c1127870fSL.LIZIZ = null;
                    c1127870fSL.LIZJ = null;
                    return false;
                }
            }
        }
        Pair<? extends List<GiftColorInfo>, Long> pairLIZ = C1128300fT2.LIZ(c1124680fNC.LIZIZ);
        this.LLILLL = pairLIZ;
        this.LLILZ = gift;
        if (pairLIZ.getFirst().size() <= 1 && !zLIZIZ) {
            C1127870fSL c1127870fSL2 = this.LLILLJJLI;
            c1127870fSL2.LIZ = null;
            c1127870fSL2.LIZIZ = null;
            c1127870fSL2.LIZJ = null;
            this.LLILZIL = null;
            return false;
        }
        return true;
    }

    public C1127520fRm(View view, C1127870fSL c1127870fSL) {
        this.LL = view;
        this.LLILLJJLI = c1127870fSL;
    }

    @Override // X.InterfaceC1127800fSE
    public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
        Gift.ColorPickerInfo colorPickerInfo;
        GiftColorInfo giftColorInfoLJII;
        List listLJ;
        long jLongValue;
        Long l;
        Long l2;
        Gift gift = this.LLILZ;
        Long l3 = null;
        if (gift != null) {
            colorPickerInfo = gift.colorPickerInfo;
        } else {
            colorPickerInfo = null;
        }
        List<GiftColorInfo> first = this.LLILLL.getFirst();
        long j = c1124680fNC.LJFF;
        this.LLILLJJLI.LIZ(j);
        C215500sL c215500sL = this.LLILZIL;
        if (c215500sL == null || c215500sL.LIZ != j) {
            this.LLILZIL = null;
        }
        C1128300fT2 c1128300fT2 = C1128300fT2.LIZ;
        boolean zLIZIZ = C1128300fT2.LIZIZ(colorPickerInfo);
        if (zLIZIZ) {
            giftColorInfoLJII = C1128300fT2.LJII(j, colorPickerInfo, first);
        } else {
            giftColorInfoLJII = null;
        }
        GiftColorInfo giftColorInfoLJIIIZ = C1128300fT2.LJIIIZ(j, colorPickerInfo, first);
        if (giftColorInfoLJIIIZ != null) {
            listLJ = C1128300fT2.LJ(first, giftColorInfoLJIIIZ, this.LLILLJJLI.LIZ);
        } else {
            C1127870fSL c1127870fSL = this.LLILLJJLI;
            c1127870fSL.getClass();
            listLJ = C1128300fT2.LJ(first, giftColorInfoLJII, c1127870fSL.LIZ);
        }
        if (giftColorInfoLJIIIZ != null && (l2 = giftColorInfoLJIIIZ.colorId) != null) {
            jLongValue = l2.longValue();
        } else if (giftColorInfoLJII != null && (l = giftColorInfoLJII.colorId) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = this.LLILLL.getSecond().longValue();
        }
        Gift gift2 = this.LLILZ;
        C1127870fSL c1127870fSL2 = this.LLILLJJLI;
        GiftColorInfo giftColorInfo = c1127870fSL2.LIZ;
        if (giftColorInfo != null) {
            l3 = giftColorInfo.colorId;
        }
        long jLJIIJ = C1128300fT2.LJIIJ(c1128300fT2, gift2, jLongValue, l3, c1127870fSL2.LIZIZ, null, null, 240);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJ, 10));
        Iterator it2 = listLJ.iterator();
        while (it2.hasNext()) {
            arrayList.add(((GiftColorInfo) it2.next()).colorId);
        }
        C215500sL c215500sL2 = new C215500sL(arrayList, j, jLJIIJ);
        boolean zLJFF = Intrinsics.LJFF(this.LLILZIL, c215500sL2);
        this.LLILZIL = c215500sL2;
        if (!zLJFF) {
            LJ().e0(new C1128330fT5(listLJ, jLJIIJ, j));
        }
        LJ().setShowMoreButton(zLIZIZ);
        LJ().LLILZ = new AwS666S0100000_17(this, 5);
        LJ().setOnMoreClickListener(new C1128290fT1(this, jLongValue, j, first, colorPickerInfo));
        return LJ();
    }
}
