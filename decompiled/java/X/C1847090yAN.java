package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.rank.impl.sticker.base.RankStickerExtra;
import com.bytedance.android.live.rank.impl.sticker.hourly.HourlyRankStickerModelChannel;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0yAN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847090yAN extends AbstractC1847300yAi implements InterfaceC1846980yAC {
    public final InterfaceC1846850y9z LLJI;
    public final C1847050yAJ LLJIJIL;
    public final C1847010yAF LLJILJIL;
    public final C1847170yAV LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public final C1846910yA5 LLJJI;
    public boolean LLJJIII;

    @Override // X.AbstractC1847300yAi
    public final Pair<Integer, Integer> B0() {
        return new Pair<>(Integer.valueOf(this.LLJILLL), Integer.valueOf(this.LLJJ));
    }

    @Override // X.InterfaceC1846980yAC
    public final void LLIILZL() {
        this.LLJJI.LIZIZ(new AwS606S0100000_27(this, 657));
        if (this.LLJJIII) {
            C0((RankStickerExtra) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, getSticker().extra, RankStickerExtra.class));
        }
    }

    @Override // X.InterfaceC1846980yAC
    public final void LLJIJIL() {
        this.LLJJI.LIZJ(new AwS606S0100000_27(this, 656));
    }

    @Override // X.AbstractC1847300yAi
    public final C1847220yAa i0() {
        return new C1847220yAa(AFwS216S0000000_27.get$arr$(362));
    }

    @Override // X.AbstractC1847300yAi
    public final void l0() {
        super.l0();
        InterfaceC1846850y9z interfaceC1846850y9z = this.LLJI;
        if (interfaceC1846850y9z != null) {
            interfaceC1846850y9z.LJII(true);
        }
        getDataChannel().DQ2(HourlyRankStickerModelChannel.class, this, new AwS606S0100000_27(this, 655));
    }

    @Override // X.AbstractC1847300yAi
    public final void p0() {
        super.p0();
        this.LLJILJILJ.onDestroy();
        getDataChannel().zQ2(this);
    }

    @Override // X.AbstractC1847300yAi
    public final void s0() {
        super.s0();
        this.LLJILJILJ.onDestroy();
        getDataChannel().zQ2(this);
        InterfaceC1846850y9z interfaceC1846850y9z = this.LLJI;
        if (interfaceC1846850y9z != null) {
            interfaceC1846850y9z.LJII(false);
        }
        getDataChannel().SX0(C2276331E7z.class, null);
        if (C500260Jjc.LJIIZILJ(getDataChannel())) {
            try {
                RankStickerExtra rankStickerExtra = (RankStickerExtra) C19748512Ol.LIZIZ.LJII(getSticker().extra, RankStickerExtra.class);
                DataChannel dataChannel = getDataChannel();
                RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
                C1119410fEh.LIZLLL(dataChannel, C235000vU.LIZ(rankStickerExtra.rankType, 0), rankStickerExtra.showType, this.LLJJI.LIZ());
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        this.LLJJI.LIZLLL();
    }

    @Override // X.AbstractC1847300yAi
    public final void hide() {
        super.hide();
    }

    @Override // X.AbstractC1847300yAi
    public final void u0() {
        super.u0();
    }

    public final void C0(RankStickerExtra rankStickerExtra) {
        InterfaceC1846850y9z interfaceC1846850y9z;
        C1119420fEi c1119420fEiLIZ;
        C1846810y9v c1846810y9v;
        if (rankStickerExtra != null && (interfaceC1846850y9z = this.LLJI) != null && interfaceC1846850y9z.LJIIIZ()) {
            if (!this.LLJJIII || ((c1119420fEiLIZ = this.LLJJI.LIZ()) != null && (c1846810y9v = c1119420fEiLIZ.LJIIIIZZ) != null && c1846810y9v.LIZ == 2)) {
                DataChannel dataChannel = getDataChannel();
                RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
                C1119410fEh.LJIIIIZZ(dataChannel, C235000vU.LIZ(rankStickerExtra.rankType, 0), rankStickerExtra.showType, this.LLJJI.LIZ());
                this.LLJJIII = true;
            }
        }
    }

    public C1847090yAN(RoomSticker roomSticker, Context context, DataChannel dataChannel) {
        super(context, roomSticker, dataChannel, R.layout.hkg);
        this.LLJI = (InterfaceC1846850y9z) dataChannel.gg0(C1119100fEC.class);
        C1847050yAJ c1847050yAJ = new C1847050yAJ((C1091250eVH) findViewById(R.id.i1h), 2131855526);
        this.LLJIJIL = c1847050yAJ;
        C1091250eVH c1091250eVH = (C1091250eVH) findViewById(R.id.i1h);
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        C1847010yAF c1847010yAF = new C1847010yAF(c1091250eVH, rankTypeV2);
        this.LLJILJIL = c1847010yAF;
        C1847170yAV c1847170yAV = new C1847170yAV(findViewById(R.id.i1h), false);
        this.LLJILJILJ = c1847170yAV;
        this.LLJJI = new C1846910yA5(dataChannel, rankTypeV2);
        Pair<Integer, Integer> pairLIZ = c1847050yAJ.LIZ();
        Pair<Integer, Integer> pairLIZ2 = c1847010yAF.LIZ();
        Pair<Integer, Integer> pairLIZ3 = c1847170yAV.LIZ();
        int iIntValue = pairLIZ.getSecond().intValue() + pairLIZ2.getSecond().intValue() + pairLIZ3.getSecond().intValue();
        this.LLJJ = iIntValue;
        int iIntValue2 = pairLIZ.getFirst().intValue();
        int iIntValue3 = pairLIZ2.getFirst().intValue();
        iIntValue2 = iIntValue2 < iIntValue3 ? iIntValue3 : iIntValue2;
        int iIntValue4 = pairLIZ3.getFirst().intValue();
        iIntValue2 = iIntValue2 < iIntValue4 ? iIntValue4 : iIntValue2;
        this.LLJILLL = iIntValue2;
        C1091250eVH c1091250eVH2 = (C1091250eVH) findViewById(R.id.i1h);
        ViewGroup.LayoutParams layoutParams = c1091250eVH2.getLayoutParams();
        layoutParams.width = iIntValue2;
        layoutParams.height = iIntValue;
        C786410Ut5.A6(c1091250eVH2, layoutParams);
        c1091250eVH2.setEnableFixedSize(true);
        c1847170yAV.LJIIJ = this;
    }
}
