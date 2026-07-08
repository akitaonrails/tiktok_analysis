package X;

import Y.ARunnableS46S0110000_27;
import android.util.SparseLongArray;
import com.bytedance.android.live.rank.impl.sticker.classrank.ClassRankStickerModel;
import com.bytedance.android.livesdk.dataChannel.DeleteStickerChannel;
import com.bytedance.android.livesdk.livesetting.gift.LiveAnchorGiftDisableSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.model.AffiliatedInfo;
import com.bytedance.android.livesdk.rank.model.ClassInfo;
import com.bytedance.android.livesdk.rank.model.RankEntrance;
import com.bytedance.android.livesdk.rank.model.RankEntranceV3Response;
import com.bytedance.android.livesdk.rank.model.SettleInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yA1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846870yA1 extends AbstractC1846900yA4<C1119420fEi> implements InterfaceC1842770y3P {
    @Override // X.AbstractC1846900yA4
    public final void LJIILIIL() {
    }

    @Override // X.InterfaceC1846850y9z
    public final void LJFF() {
        T t = this.LIZLLL;
        if (t != 0) {
            this.LIZJ = t;
            this.LIZ.zW(ClassRankStickerModel.class, t);
        }
        this.LIZLLL = null;
    }

    @Override // X.InterfaceC1846850y9z
    public final void LJI() {
        T t = this.LIZJ;
        if (t != 0) {
            C1846810y9v c1846810y9v = t.LJIIIIZZ;
            if (c1846810y9v != null) {
                c1846810y9v.LIZ = 1;
            }
            t.LJIILIIL = C497740JfY.LJIJI(2131855522);
        }
    }

    @Override // X.InterfaceC1846850y9z
    public final boolean LJIIIIZZ() {
        if (C463680IGg.LIZ <= 0 || LiveAnchorGiftDisableSetting.INSTANCE.getValue()) {
            return false;
        }
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZ);
        return !(roomLJJLIIIIJ == null || C781520UlC.LIZIZ(roomLJJLIIIIJ)) || C1AJI.LIZIZ(this.LIZ);
    }

    @Override // X.AbstractC1846900yA4
    public final boolean LJIIJJI() {
        return InterfaceC1106030et7.B9.LIZIZ().booleanValue();
    }

    @Override // X.AbstractC1846900yA4
    public final long LJIILL() {
        C1119210fEN c1119210fEN = C1119210fEN.LIZ;
        RankTypeV2 rankTypeV2 = RankTypeV2.LJIL;
        c1119210fEN.getClass();
        return C1119210fEN.LIZJ(rankTypeV2);
    }

    @Override // X.InterfaceC1842770y3P
    public final void onCreate() {
        this.LJ = 3600;
        this.LIZ.SX0(C1119070fE9.class, this);
    }

    @Override // X.InterfaceC1842770y3P
    public final void onDestroy() {
        this.LJFF.removeCallbacksAndMessages(null);
    }

    public C1846870yA1(DataChannel dataChannel) {
        super(dataChannel);
    }

    @Override // X.InterfaceC1846850y9z
    public final void LIZ(EnumC1846750y9p enumC1846750y9p) {
        String str;
        if (C500260Jjc.LJIIZILJ(this.LIZ) && this.LIZIZ) {
            int i = C1846760y9q.LIZ[enumC1846750y9p.ordinal()];
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
            C1119410fEh.LJ = str;
            this.LIZ.zW(DeleteStickerChannel.class, 11);
            if (enumC1846750y9p == EnumC1846750y9p.ACTIVE) {
                C766270U4b.LIZLLL(2131855328);
            }
        }
    }

    @Override // X.InterfaceC1846850y9z
    public final boolean LIZIZ(boolean z) {
        if (C500260Jjc.LJIIZILJ(this.LIZ) && LJIIIIZZ() && !this.LIZIZ) {
            SparseLongArray sparseLongArray = C1810700xDg.LIZ;
            if (C1810700xDg.LJ(this.LIZ) == ((int) EnumC1118970fDz.RANK_SWITCH_STATUS_ON.getValue())) {
                Pair<Boolean, Boolean> pairLIZJ = C1846800y9u.LIZJ(this.LIZ, z, RankTypeV2.LJIL);
                if (pairLIZJ.getFirst().booleanValue()) {
                    return false;
                }
                ARunnableS46S0110000_27 aRunnableS46S0110000_27 = new ARunnableS46S0110000_27(this, z, 4);
                if (!pairLIZJ.getSecond().booleanValue()) {
                    aRunnableS46S0110000_27.run();
                    return true;
                }
                C786410Ut5.LJLIIL(1000L, this.LJFF, aRunnableS46S0110000_27);
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1846850y9z
    public final void LIZJ(String str) {
        T t;
        if (str != null && (t = this.LIZJ) != 0) {
            C1846810y9v c1846810y9v = t.LJIIIIZZ;
            if (c1846810y9v != null) {
                c1846810y9v.LIZ = 2;
            }
            t.LJIILIIL = str;
            t.LJI = C158B.LIZJ() + this.LJII;
            LJIILLIIL();
        }
    }

    @Override // X.InterfaceC1842770y3P
    public final void LIZLLL(List<RankEntranceV3Response.EntranceGroup> list) {
        long j;
        long j2;
        long j3;
        Text text;
        int i;
        long j4;
        Map<String, String> map;
        SettleInfo settleInfo;
        SettleInfo settleInfo2;
        if (!LJIIIIZZ()) {
            return;
        }
        Iterator<RankEntranceV3Response.EntranceGroup> it2 = list.iterator();
        while (it2.hasNext()) {
            for (RankEntrance rankEntrance : it2.next().data.entrances) {
                int i2 = rankEntrance.rankType;
                RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
                if (i2 == RankTypeV2.LJIL.type) {
                    AffiliatedInfo affiliatedInfo = rankEntrance.affiliatedContent;
                    if (affiliatedInfo != null && (settleInfo2 = affiliatedInfo.settleInfo) != null) {
                        j = settleInfo2.ownerSettleRank;
                    } else {
                        j = rankEntrance.ownerRankIdx;
                    }
                    if (affiliatedInfo != null) {
                        j2 = affiliatedInfo.stickerSettleShowDuration;
                    } else {
                        j2 = 0;
                    }
                    this.LJII = j2;
                    if (affiliatedInfo != null && (settleInfo = affiliatedInfo.settleInfo) != null) {
                        j3 = settleInfo.rankSettleTimestamp;
                    } else {
                        j3 = 0;
                    }
                    RankTypeV2 rankTypeV2LIZ = C235000vU.LIZ(i2, 0);
                    long j5 = rankEntrance.ownerRankIdx;
                    AffiliatedInfo affiliatedInfo2 = rankEntrance.affiliatedContent;
                    if (affiliatedInfo2 != null) {
                        text = affiliatedInfo2.stickerGapDesc;
                    } else {
                        text = null;
                    }
                    long j6 = rankEntrance.resetTime;
                    long j7 = rankEntrance.windowSize;
                    long j8 = rankEntrance.currentScore;
                    C1846810y9v c1846810y9vLIZIZ = C1846800y9u.LIZIZ(rankEntrance);
                    ClassInfo classInfo = rankEntrance.classInfo;
                    if (classInfo != null) {
                        i = classInfo.classType;
                    } else {
                        i = 0;
                    }
                    if (classInfo != null) {
                        j4 = classInfo.starCount;
                    } else {
                        j4 = 0;
                    }
                    C1846930yA7 c1846930yA7 = new C1846930yA7(i, j4);
                    AffiliatedInfo affiliatedInfo3 = rankEntrance.affiliatedContent;
                    if (affiliatedInfo3 != null) {
                        map = affiliatedInfo3.stickerTrackParam;
                    } else {
                        map = null;
                    }
                    C1119420fEi c1119420fEi = new C1119420fEi(rankTypeV2LIZ, j5, text, j6, j7, j8, 0L, j, c1846810y9vLIZIZ, c1846930yA7, map);
                    if (c1119420fEi.LIZLLL > 0 && j7 > 0) {
                        LJIIZILJ(c1119420fEi, j2, j3, true);
                        if (!this.LJI) {
                            this.LJI = true;
                            LJIIJ();
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    @Override // X.InterfaceC1842770y3P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.bytedance.android.livesdk.model.message.RankUpdateMessage r39) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1846870yA1.LJ(com.bytedance.android.livesdk.model.message.RankUpdateMessage):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIZILJ(C1119420fEi c1119420fEi, long j, long j2, boolean z) {
        if (!Intrinsics.LJFF(this.LIZLLL, c1119420fEi)) {
            this.LIZLLL = c1119420fEi;
        }
        if (!Intrinsics.LJFF(this.LIZJ, c1119420fEi)) {
            DataChannel dataChannel = this.LIZ;
            RankTypeV2 rankTypeV2 = RankTypeV2.LJIL;
            if (C1846800y9u.LJIJ(dataChannel, rankTypeV2, this.LIZIZ, c1119420fEi, this.LIZJ)) {
                c1119420fEi.LJI = AbstractC1846900yA4.LJIILJJIL(c1119420fEi, rankTypeV2, j, j2, z);
                this.LIZJ = c1119420fEi;
                this.LIZ.zW(ClassRankStickerModel.class, c1119420fEi);
                LJIILLIIL();
            }
        }
    }
}
