package X;

import Y.ARunnableS46S0110000_27;
import android.os.Looper;
import android.util.SparseLongArray;
import com.bytedance.android.live.rank.impl.sticker.team.TeamRankStickerModelChannel;
import com.bytedance.android.livesdk.dataChannel.DeleteStickerChannel;
import com.bytedance.android.livesdk.livesetting.gift.LiveAnchorGiftDisableSetting;
import com.bytedance.android.livesdk.livesetting.rank.TeamRankStickerSetting;
import com.bytedance.android.livesdk.model.message.RankUpdate;
import com.bytedance.android.livesdk.model.message.RankUpdateMessage;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846730y9n implements InterfaceC1846850y9z, InterfaceC1842770y3P {
    public final DataChannel LIZ;
    public C1119430fEj LIZIZ;
    public boolean LIZJ;
    public final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());
    public boolean LJ;

    @Override // X.InterfaceC1846850y9z
    public final void LIZJ(String str) {
    }

    @Override // X.InterfaceC1846850y9z
    public final void LJFF() {
    }

    @Override // X.InterfaceC1846850y9z
    public final void LJI() {
    }

    public static final boolean LJIIJ() {
        return InterfaceC1094280eaA.Od.LIZIZ().booleanValue() || InterfaceC1094280eaA.Pd.LIZIZ().booleanValue();
    }

    @Override // X.InterfaceC1846850y9z
    public final boolean LJIIIIZZ() {
        if (!TeamRankStickerSetting.INSTANCE.getValue() || LiveAnchorGiftDisableSetting.INSTANCE.getValue()) {
            return false;
        }
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZ);
        return !(roomLJJLIIIIJ == null || C781520UlC.LIZIZ(roomLJJLIIIIJ)) || C1AJI.LIZIZ(this.LIZ);
    }

    public final boolean LJIIJJI() {
        Room roomLJJLIIIIJ;
        return (LiveAnchorGiftDisableSetting.INSTANCE.getValue() || (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZ)) == null || C781520UlC.LIZIZ(roomLJJLIIIIJ)) ? false : true;
    }

    @Override // X.InterfaceC1842770y3P
    public final void onCreate() {
        this.LIZ.SX0(C1119110fED.class, this);
    }

    @Override // X.InterfaceC1842770y3P
    public final void onDestroy() {
        this.LIZLLL.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC1846850y9z
    public final boolean LJIIIZ() {
        return this.LIZJ;
    }

    public C1846730y9n(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // X.InterfaceC1846850y9z
    public final void LIZ(EnumC1846750y9p enumC1846750y9p) {
        String str;
        if (C500260Jjc.LJIIZILJ(this.LIZ) && this.LIZJ) {
            int i = C1846740y9o.LIZ[enumC1846750y9p.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "";
                    } else {
                        str = "replace";
                    }
                } else {
                    str = "passive";
                }
            } else {
                str = "active";
            }
            C1119410fEh.LIZJ = str;
            this.LIZ.zW(DeleteStickerChannel.class, 9);
            if (enumC1846750y9p == EnumC1846750y9p.ACTIVE) {
                C766270U4b.LIZLLL(2131855328);
            }
        }
    }

    @Override // X.InterfaceC1846850y9z
    public final boolean LIZIZ(boolean z) {
        C1119430fEj c1119430fEj;
        if (C500260Jjc.LJIIZILJ(this.LIZ) && LJIIIIZZ() && !this.LIZJ) {
            SparseLongArray sparseLongArray = C1810700xDg.LIZ;
            if (C1810700xDg.LJ(this.LIZ) != ((int) EnumC1118970fDz.RANK_SWITCH_STATUS_ON.getValue()) || (c1119430fEj = this.LIZIZ) == null) {
                return false;
            }
            if (!z) {
                long j = c1119430fEj.LJIILL;
                long j2 = c1119430fEj.LJIILLIIL;
                long jLIZJ = C158B.LIZJ();
                if (j > jLIZJ || jLIZJ >= j2) {
                    return false;
                }
            }
            Pair<Boolean, Boolean> pairLIZJ = C1846800y9u.LIZJ(this.LIZ, z, RankTypeV2.LJIJJLI);
            if (pairLIZJ.getFirst().booleanValue()) {
                return false;
            }
            ARunnableS46S0110000_27 aRunnableS46S0110000_27 = new ARunnableS46S0110000_27(this, z, 8);
            if (!pairLIZJ.getSecond().booleanValue()) {
                aRunnableS46S0110000_27.run();
                return true;
            }
            C786410Ut5.LJLIIL(1000L, this.LIZLLL, aRunnableS46S0110000_27);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0177 A[PHI: r6
      0x0177: PHI (r6v1 long) = (r6v0 long), (r6v7 long) binds: [B:90:0x0173, B:31:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1842770y3P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.util.List<com.bytedance.android.livesdk.rank.model.RankEntranceV3Response.EntranceGroup> r27) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1846730y9n.LIZLLL(java.util.List):void");
    }

    @Override // X.InterfaceC1842770y3P
    public final void LJ(RankUpdateMessage rankUpdateMessage) {
        C1119430fEj c1119430fEj;
        List<RankUpdate> list;
        if (!C500260Jjc.LJIIZILJ(this.LIZ) || LJIIIIZZ()) {
            if ((!C500260Jjc.LJIJI(this.LIZ) || LJIIJJI()) && (c1119430fEj = this.LIZIZ) != null && (list = rankUpdateMessage.updates) != null) {
                for (RankUpdate rankUpdate : list) {
                    if (rankUpdate.rankType == RankTypeV2.LJIJJLI.type) {
                        C1119430fEj c1119430fEj2 = new C1119430fEj(rankUpdate.ownRank, c1119430fEj.LJIILL, c1119430fEj.LJIILLIIL, c1119430fEj.LIZLLL, c1119430fEj.LJ);
                        if (!Intrinsics.LJFF(this.LIZIZ, c1119430fEj2)) {
                            this.LIZIZ = c1119430fEj2;
                            this.LIZ.zW(TeamRankStickerModelChannel.class, c1119430fEj2);
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1846850y9z
    public final void LJII(boolean z) {
        this.LIZJ = z;
    }
}
