package X;

import Y.ARunnableS46S0110000_27;
import android.util.SparseLongArray;
import com.bytedance.android.live.rank.impl.sticker.hourly.HourlyRankStickerModelChannel;
import com.bytedance.android.livesdk.dataChannel.DeleteStickerChannel;
import com.bytedance.android.livesdk.livesetting.gift.LiveAnchorGiftDisableSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.model.AffiliatedInfo;
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

/* JADX INFO: renamed from: X.0yA2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846880yA2 extends AbstractC1846900yA4<C1119420fEi> implements InterfaceC1842770y3P {
    @Override // X.AbstractC1846900yA4
    public final void LJIILIIL() {
    }

    @Override // X.InterfaceC1846850y9z
    public final void LJFF() {
        T t = this.LIZLLL;
        if (t != 0) {
            this.LIZJ = t;
            this.LIZ.zW(HourlyRankStickerModelChannel.class, t);
        }
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
        if (C463670IGf.LIZ == 0 || LiveAnchorGiftDisableSetting.INSTANCE.getValue()) {
            return false;
        }
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZ);
        return !(roomLJJLIIIIJ == null || C781520UlC.LIZIZ(roomLJJLIIIIJ)) || C1AJI.LIZIZ(this.LIZ);
    }

    @Override // X.AbstractC1846900yA4
    public final boolean LJIIJJI() {
        return InterfaceC1094280eaA.Qd.LIZIZ().booleanValue();
    }

    @Override // X.AbstractC1846900yA4
    public final long LJIILL() {
        C1119210fEN c1119210fEN = C1119210fEN.LIZ;
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        c1119210fEN.getClass();
        return C1119210fEN.LIZJ(rankTypeV2);
    }

    @Override // X.InterfaceC1842770y3P
    public final void onCreate() {
        this.LJ = 600;
        this.LIZ.SX0(C1119100fEC.class, this);
    }

    @Override // X.InterfaceC1842770y3P
    public final void onDestroy() {
        this.LJFF.removeCallbacksAndMessages(null);
    }

    public C1846880yA2(DataChannel dataChannel) {
        super(dataChannel);
    }

    @Override // X.InterfaceC1846850y9z
    public final void LIZ(EnumC1846750y9p enumC1846750y9p) {
        String str;
        if (C500260Jjc.LJIIZILJ(this.LIZ) && this.LIZIZ) {
            int i = C1846790y9t.LIZ[enumC1846750y9p.ordinal()];
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
            C1119410fEh.LIZLLL = str;
            this.LIZ.zW(DeleteStickerChannel.class, 10);
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
                Pair<Boolean, Boolean> pairLIZJ = C1846800y9u.LIZJ(this.LIZ, z, RankTypeV2.LIZ);
                if (pairLIZJ.getFirst().booleanValue()) {
                    return false;
                }
                ARunnableS46S0110000_27 aRunnableS46S0110000_27 = new ARunnableS46S0110000_27(this, z, 7);
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
        SettleInfo settleInfo;
        SettleInfo settleInfo2;
        C1846880yA2 c1846880yA2 = this;
        if (!c1846880yA2.LJIIIIZZ()) {
            return;
        }
        Iterator<RankEntranceV3Response.EntranceGroup> it2 = list.iterator();
        while (it2.hasNext()) {
            for (RankEntrance rankEntrance : it2.next().data.entrances) {
                int i = rankEntrance.rankType;
                RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
                if (i == RankTypeV2.LIZ.type) {
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
                    c1846880yA2.LJII = j2;
                    if (affiliatedInfo != null && (settleInfo = affiliatedInfo.settleInfo) != null) {
                        j3 = settleInfo.rankSettleTimestamp;
                    } else {
                        j3 = 0;
                    }
                    Map<String, String> map = null;
                    if (affiliatedInfo != null) {
                        text = affiliatedInfo.stickerGapDesc;
                    } else {
                        text = null;
                    }
                    RankTypeV2 rankTypeV2LIZ = C235000vU.LIZ(i, 0);
                    long j4 = rankEntrance.ownerRankIdx;
                    long j5 = rankEntrance.resetTime;
                    long j6 = rankEntrance.windowSize;
                    long j7 = rankEntrance.currentScore;
                    C1846810y9v c1846810y9vLIZIZ = C1846800y9u.LIZIZ(rankEntrance);
                    AffiliatedInfo affiliatedInfo2 = rankEntrance.affiliatedContent;
                    if (affiliatedInfo2 != null) {
                        map = affiliatedInfo2.stickerTrackParam;
                    }
                    C1119420fEi c1119420fEi = new C1119420fEi(rankTypeV2LIZ, j4, text, j5, j6, j7, 0L, j, c1846810y9vLIZIZ, null, map);
                    if (c1119420fEi.LIZLLL > 0 && j6 > 0) {
                        c1846880yA2 = c1846880yA2;
                        c1846880yA2.LJIIZILJ(c1119420fEi, j2, j3, true);
                        if (!c1846880yA2.LJI) {
                            c1846880yA2.LJI = true;
                            c1846880yA2.LJIIJ();
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    @Override // X.InterfaceC1842770y3P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.bytedance.android.livesdk.model.message.RankUpdateMessage r37) {
        /*
            r36 = this;
            r35 = r36
            boolean r0 = r35.LJIIIIZZ()
            if (r0 != 0) goto L9
            return
        L9:
            r0 = r35
            T extends X.0fEi r9 = r0.LIZJ
            if (r9 == 0) goto Lac
            r0 = r37
            java.util.List<com.bytedance.android.livesdk.model.message.RankUpdate> r0 = r0.updates
            if (r0 == 0) goto Lac
            java.util.Iterator r16 = r0.iterator()
        L19:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto Lac
            java.lang.Object r8 = r16.next()
            com.bytedance.android.livesdk.model.message.RankUpdate r8 = (com.bytedance.android.livesdk.model.message.RankUpdate) r8
            int r6 = r8.rankType
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r0 = com.bytedance.android.livesdk.rank.api.RankTypeV2.LIZ
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r0 = com.bytedance.android.livesdk.rank.api.RankTypeV2.LIZ
            int r0 = r0.type
            if (r6 != r0) goto L19
            com.bytedance.android.livesdk.model.message.RankUpdate$AffiliatedInfo r1 = r8.affiliatedInfo
            if (r1 == 0) goto La9
            com.bytedance.android.livesdk.rank.model.SettleInfo r0 = r1.settleInfo
            if (r0 == 0) goto La9
            long r4 = r0.ownerSettleRank
        L39:
            if (r1 == 0) goto La4
            long r10 = r1.stickerSettleShowDuration
            com.bytedance.android.livesdk.rank.model.SettleInfo r0 = r1.settleInfo
            if (r0 == 0) goto La6
            long r2 = r0.rankSettleTimestamp
        L43:
            r12 = 0
            if (r1 == 0) goto La1
            com.bytedance.android.livesdk.model.message.common.Text r0 = r1.stickerGapDesc
            r23 = r0
        L4a:
            X.0fEi r13 = new X.0fEi
            r0 = 0
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r18 = X.C235000vU.LIZ(r6, r0)
            long r0 = r8.ownRank
            r21 = r0
            long r0 = r9.LIZLLL
            r24 = r0
            long r0 = r9.LJ
            long r6 = r8.currentScore
            r19 = r6
            long r14 = r9.LJI
            com.bytedance.android.livesdk.model.message.RankUpdate$AffiliatedInfo r7 = r8.affiliatedInfo
            com.bytedance.android.livesdk.rank.model.ClassInfo r6 = r8.classInfo
            X.0y9v r32 = X.C1846800y9u.LIZ(r7, r6)
            r33 = 0
            com.bytedance.android.livesdk.model.message.RankUpdate$AffiliatedInfo r6 = r8.affiliatedInfo
            if (r6 == 0) goto L71
            java.util.Map<java.lang.String, java.lang.String> r12 = r6.stickerTrackParam
        L71:
            r26 = r19
            r28 = r14
            r30 = r4
            r34 = r12
            r17 = r13
            r19 = r21
            r21 = r23
            r22 = r24
            r24 = r0
            r17.<init>(r18, r19, r21, r22, r24, r26, r28, r30, r32, r33, r34)
            long r4 = r13.LIZLLL
            r7 = 0
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 <= 0) goto L19
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 <= 0) goto L19
            r23 = 0
            r17 = r35
            r18 = r13
            r19 = r10
            r21 = r2
            r17.LJIIZILJ(r18, r19, r21, r23)
            goto L19
        La1:
            r23 = r12
            goto L4a
        La4:
            r10 = 0
        La6:
            r2 = 0
            goto L43
        La9:
            long r4 = r8.ownRank
            goto L39
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1846880yA2.LJ(com.bytedance.android.livesdk.model.message.RankUpdateMessage):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIZILJ(C1119420fEi c1119420fEi, long j, long j2, boolean z) {
        if (!Intrinsics.LJFF(this.LIZJ, c1119420fEi)) {
            DataChannel dataChannel = this.LIZ;
            RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
            if (C1846800y9u.LJIJ(dataChannel, rankTypeV2, this.LIZIZ, c1119420fEi, this.LIZJ)) {
                c1119420fEi.LJI = AbstractC1846900yA4.LJIILJJIL(c1119420fEi, rankTypeV2, j, j2, z);
                this.LIZJ = c1119420fEi;
                this.LIZ.zW(HourlyRankStickerModelChannel.class, c1119420fEi);
                LJIILLIIL();
            }
        }
    }
}
