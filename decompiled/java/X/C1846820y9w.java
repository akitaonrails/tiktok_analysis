package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.live.rank.impl.sticker.base.RankStickerExtra;
import com.bytedance.android.live.rank.impl.sticker.team.TeamRankStickerModelChannel;
import com.bytedance.android.livesdk.livesetting.rank.TeamRankStickerSetting;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0y9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846820y9w extends AbstractC1847300yAi {
    public final InterfaceC1846850y9z LLJI;
    public final InterfaceC1846720y9m<C1119420fEi> LLJIJIL;
    public final C1846650y9f LLJILJIL;
    public final InterfaceC1846720y9m<C1119430fEj> LLJILJILJ;
    public final C11NJ LLJILLL;
    public final int LLJJ;
    public final int LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;

    @Override // X.AbstractC1847300yAi
    public final Pair<Integer, Integer> B0() {
        return new Pair<>(Integer.valueOf(this.LLJJ), Integer.valueOf(this.LLJJI));
    }

    @Override // X.AbstractC1847300yAi
    public final C1847220yAa i0() {
        return new C1847220yAa(AFwS216S0000000_27.get$arr$(370));
    }

    @Override // X.AbstractC1847300yAi
    public final void l0() {
        super.l0();
        InterfaceC1846850y9z interfaceC1846850y9z = this.LLJI;
        if (interfaceC1846850y9z != null) {
            interfaceC1846850y9z.LJII(true);
        }
        this.LLJJIJIIJIL = true;
        getDataChannel().DQ2(TeamRankStickerModelChannel.class, this, new AwS606S0100000_27(this, 665));
    }

    @Override // X.AbstractC1847300yAi
    public final void p0() {
        super.p0();
        this.LLJILJILJ.onDestroy();
        this.LLJILLL.LJ();
        getDataChannel().zQ2(this);
    }

    @Override // X.AbstractC1847300yAi
    public final void s0() {
        super.s0();
        this.LLJJIII = false;
        this.LLJILJILJ.onDestroy();
        getDataChannel().zQ2(this);
        this.LLJILLL.LJ();
        InterfaceC1846850y9z interfaceC1846850y9z = this.LLJI;
        if (interfaceC1846850y9z != null) {
            interfaceC1846850y9z.LJII(false);
        }
        getDataChannel().SX0(C1E80.class, null);
        if (C500260Jjc.LJIIZILJ(getDataChannel())) {
            try {
                RankStickerExtra rankStickerExtra = (RankStickerExtra) C19748512Ol.LIZIZ.LJII(getSticker().extra, RankStickerExtra.class);
                DataChannel dataChannel = getDataChannel();
                RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
                C1119410fEh.LIZLLL(dataChannel, C235000vU.LIZ(rankStickerExtra.rankType, 0), rankStickerExtra.showType, null);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public C1846820y9w(RoomSticker roomSticker, Context context, DataChannel dataChannel) {
        InterfaceC1846720y9m<C1119420fEi> c1846660y9g;
        InterfaceC1846720y9m<C1119430fEj> c1846680y9i;
        int i;
        super(context, roomSticker, dataChannel, R.layout.hq6);
        this.LLJI = (InterfaceC1846850y9z) dataChannel.gg0(C1119110fED.class);
        TeamRankStickerSetting teamRankStickerSetting = TeamRankStickerSetting.INSTANCE;
        if (teamRankStickerSetting.getUseNewStyle()) {
            c1846660y9g = new C1847180yAW((C1091250eVH) findViewById(R.id.i1h));
        } else {
            c1846660y9g = new C1846660y9g((C1091250eVH) findViewById(R.id.i1h));
        }
        this.LLJIJIL = c1846660y9g;
        C1846650y9f c1846650y9f = new C1846650y9f((C1091250eVH) findViewById(R.id.i1h));
        this.LLJILJIL = c1846650y9f;
        if (teamRankStickerSetting.getUseNewStyle()) {
            c1846680y9i = new C1846690y9j((C1091250eVH) findViewById(R.id.i1h), false);
        } else {
            c1846680y9i = new C1846680y9i((C1091250eVH) findViewById(R.id.i1h), false);
        }
        this.LLJILJILJ = c1846680y9i;
        this.LLJILLL = new C11NJ();
        View viewFindViewById = findViewById(R.id.c8r);
        if (teamRankStickerSetting.getUseNewStyle()) {
            i = 8;
        } else {
            i = 0;
        }
        int visibility = viewFindViewById.getVisibility();
        viewFindViewById.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, viewFindViewById);
        C786410Ut5.LJZL(teamRankStickerSetting.getUseNewStyle() ? 0 : 8, (LinearLayout) findViewById(R.id.squ));
        Pair<Integer, Integer> pairLIZ = c1846660y9g.LIZ();
        Pair<Integer, Integer> pairLIZ2 = c1846650y9f.LIZ();
        Pair<Integer, Integer> pairLIZ3 = c1846680y9i.LIZ();
        int iIntValue = pairLIZ.getSecond().intValue() + pairLIZ2.getSecond().intValue() + pairLIZ3.getSecond().intValue();
        this.LLJJI = iIntValue;
        int iIntValue2 = pairLIZ.getFirst().intValue();
        int iIntValue3 = pairLIZ2.getFirst().intValue();
        iIntValue2 = iIntValue2 < iIntValue3 ? iIntValue3 : iIntValue2;
        int iIntValue4 = pairLIZ3.getFirst().intValue();
        iIntValue2 = iIntValue2 < iIntValue4 ? iIntValue4 : iIntValue2;
        this.LLJJ = iIntValue2;
        C1091250eVH c1091250eVH = (C1091250eVH) findViewById(R.id.i1h);
        ViewGroup.LayoutParams layoutParams = c1091250eVH.getLayoutParams();
        layoutParams.width = iIntValue2;
        layoutParams.height = iIntValue;
        C786410Ut5.A6(c1091250eVH, layoutParams);
        c1091250eVH.setEnableFixedSize(true);
        this.LLJJIJIIJIL = true;
    }
}
