package X;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.rank.impl.sticker.base.RankStickerExtra;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankStickerCenterFilterSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankStickerResolveConflictSetting;
import com.bytedance.android.livesdk.rank.api.RankAnimationType;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0y9u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846800y9u {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045 A[PHI: r5
      0x0045: PHI (r5v1 X.0yA7) = (r5v0 X.0yA7), (r5v4 X.0yA7), (r5v4 X.0yA7) binds: [B:21:0x003e, B:10:0x001c, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1846810y9v LIZIZ(com.bytedance.android.livesdk.rank.model.RankEntrance r9) {
        /*
            com.bytedance.android.livesdk.rank.model.ClassInfo r8 = r9.classInfo
            com.bytedance.android.livesdk.rank.model.AffiliatedInfo r6 = r9.affiliatedContent
            r3 = 0
            r7 = 0
            if (r6 == 0) goto L33
            com.bytedance.android.livesdk.rank.model.SettleInfo r0 = r6.settleInfo
            if (r0 == 0) goto L33
            com.bytedance.android.livesdk.rank.model.ClassInfo r0 = r0.newClassInfo
            if (r0 == 0) goto L33
            X.0yA7 r5 = new X.0yA7
            int r2 = r0.classType
            long r0 = r0.starCount
            r5.<init>(r2, r0)
        L1a:
            com.bytedance.android.livesdk.rank.model.SettleInfo r0 = r6.settleInfo
            if (r0 == 0) goto L45
            com.bytedance.android.livesdk.rank.model.ClassInfo r2 = r0.oldClassInfo
            if (r2 == 0) goto L45
            X.0yA7 r1 = new X.0yA7
            int r0 = r2.classType
            long r2 = r2.starCount
            r1.<init>(r0, r2)
        L2b:
            int r7 = r6.stickerShowScene
        L2d:
            X.0y9v r0 = new X.0y9v
            r0.<init>(r7, r5, r1)
            return r0
        L33:
            X.0yA7 r5 = new X.0yA7
            if (r8 == 0) goto L41
            int r2 = r8.classType
            long r0 = r8.starCount
        L3b:
            r5.<init>(r2, r0)
            if (r6 == 0) goto L45
            goto L1a
        L41:
            r2 = 0
            r0 = 0
            goto L3b
        L45:
            X.0yA7 r1 = new X.0yA7
            if (r8 == 0) goto L53
            int r0 = r8.classType
            long r3 = r8.starCount
        L4d:
            r1.<init>(r0, r3)
            if (r6 == 0) goto L2d
            goto L2b
        L53:
            r0 = 0
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1846800y9u.LIZIZ(com.bytedance.android.livesdk.rank.model.RankEntrance):X.0y9v");
    }

    public static final C1847040yAI LIZLLL(String str) {
        int iLJJJ = a0.LJJJ(str, "[fragment_icon]", 0, false, 6);
        int i = iLJJJ + 15;
        if (iLJJJ < 0) {
            return null;
        }
        return new C1847040yAI(a0.LJLIIIL(str.substring(0, iLJJJ)).toString(), a0.LJLIIIL(str.substring(i, str.length())).toString(), "");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (r2.equals("fans_team_rankbonus_time") != false) goto L13;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.android.livesdk.rank.api.RankTypeV2 LJI(java.lang.String r2) {
        /*
            r1 = 0
            if (r2 != 0) goto L4
            return r1
        L4:
            int r0 = r2.hashCode()
            switch(r0) {
                case -1995196612: goto L15;
                case -1587014877: goto Lc;
                case -1090784367: goto L22;
                case -740831747: goto L2f;
                case -285012848: goto L3c;
                case 702914360: goto L49;
                default: goto Lb;
            }
        Lb:
            return r1
        Lc:
            java.lang.String r0 = "team_rank_spotlight"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1d
            return r1
        L15:
            java.lang.String r0 = "fans_team_rankbonus_time"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
        L1d:
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r0 = com.bytedance.android.livesdk.rank.api.RankTypeV2.LIZ
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r1 = com.bytedance.android.livesdk.rank.api.RankTypeV2.LJIJJLI
            return r1
        L22:
            java.lang.String r0 = "class_rank_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r0 = com.bytedance.android.livesdk.rank.api.RankTypeV2.LIZ
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r1 = com.bytedance.android.livesdk.rank.api.RankTypeV2.LJIL
            return r1
        L2f:
            java.lang.String r0 = "game_daily_rank_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r0 = com.bytedance.android.livesdk.rank.api.RankTypeV2.LIZ
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r1 = com.bytedance.android.livesdk.rank.api.RankTypeV2.LJIILJJIL
            return r1
        L3c:
            java.lang.String r0 = "daily_rank_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r0 = com.bytedance.android.livesdk.rank.api.RankTypeV2.LIZ
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r1 = com.bytedance.android.livesdk.rank.api.RankTypeV2.LJIIL
            return r1
        L49:
            java.lang.String r0 = "hourly_rank_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r0 = com.bytedance.android.livesdk.rank.api.RankTypeV2.LIZ
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r1 = com.bytedance.android.livesdk.rank.api.RankTypeV2.LIZ
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1846800y9u.LJI(java.lang.String):com.bytedance.android.livesdk.rank.api.RankTypeV2");
    }

    public static final String LJII(long j) {
        if (j < 10) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('0');
            sbLIZ.append(j);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return String.valueOf(j);
    }

    public static final C1846930yA7 LJIIIIZZ(C1119420fEi c1119420fEi) {
        if (c1119420fEi == null) {
            return null;
        }
        C1846810y9v c1846810y9v = c1119420fEi.LJIIIIZZ;
        if (c1846810y9v != null && c1846810y9v.LIZ == 2) {
            return c1846810y9v.LIZIZ;
        }
        return c1119420fEi.LJIIIZ;
    }

    public static final RankTypeV2 LJIIIZ(DataChannel dataChannel) {
        if (dataChannel == null) {
            return null;
        }
        InterfaceC1846850y9z interfaceC1846850y9z = (InterfaceC1846850y9z) dataChannel.gg0(C1119080fEA.class);
        if (interfaceC1846850y9z != null && interfaceC1846850y9z.LJIIIZ()) {
            RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
            return RankTypeV2.LJIIL;
        }
        InterfaceC1846850y9z interfaceC1846850y9z2 = (InterfaceC1846850y9z) dataChannel.gg0(C1119110fED.class);
        if (interfaceC1846850y9z2 != null && interfaceC1846850y9z2.LJIIIZ()) {
            RankTypeV2 rankTypeV22 = RankTypeV2.LIZ;
            return RankTypeV2.LJIJJLI;
        }
        InterfaceC1846850y9z interfaceC1846850y9z3 = (InterfaceC1846850y9z) dataChannel.gg0(C1119070fE9.class);
        if (interfaceC1846850y9z3 != null && interfaceC1846850y9z3.LJIIIZ()) {
            RankTypeV2 rankTypeV23 = RankTypeV2.LIZ;
            return RankTypeV2.LJIL;
        }
        InterfaceC1846850y9z interfaceC1846850y9z4 = (InterfaceC1846850y9z) dataChannel.gg0(C1119090fEB.class);
        if (interfaceC1846850y9z4 != null && interfaceC1846850y9z4.LJIIIZ()) {
            RankTypeV2 rankTypeV24 = RankTypeV2.LIZ;
            return RankTypeV2.LJIILJJIL;
        }
        InterfaceC1846850y9z interfaceC1846850y9z5 = (InterfaceC1846850y9z) dataChannel.gg0(C1119100fEC.class);
        if (interfaceC1846850y9z5 == null || !interfaceC1846850y9z5.LJIIIZ()) {
            return null;
        }
        RankTypeV2 rankTypeV25 = RankTypeV2.LIZ;
        return RankTypeV2.LIZ;
    }

    public static final String LJIIJ(long j) {
        if (1 <= j && j < 100) {
            return String.valueOf(j);
        }
        return "99+";
    }

    public static final void LJIIJJI(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public static final boolean LJIIL(DataChannel dataChannel) {
        if (dataChannel == null) {
            return false;
        }
        InterfaceC1846850y9z interfaceC1846850y9z = (InterfaceC1846850y9z) dataChannel.gg0(C1119110fED.class);
        InterfaceC1846850y9z interfaceC1846850y9z2 = (InterfaceC1846850y9z) dataChannel.gg0(C1119080fEA.class);
        InterfaceC1846850y9z interfaceC1846850y9z3 = (InterfaceC1846850y9z) dataChannel.gg0(C1119100fEC.class);
        InterfaceC1846850y9z interfaceC1846850y9z4 = (InterfaceC1846850y9z) dataChannel.gg0(C1119070fE9.class);
        InterfaceC1846850y9z interfaceC1846850y9z5 = (InterfaceC1846850y9z) dataChannel.gg0(C1119090fEB.class);
        if ((interfaceC1846850y9z == null || !interfaceC1846850y9z.LJIIIZ()) && ((interfaceC1846850y9z2 == null || !interfaceC1846850y9z2.LJIIIZ()) && ((interfaceC1846850y9z3 == null || !interfaceC1846850y9z3.LJIIIZ()) && ((interfaceC1846850y9z4 == null || !interfaceC1846850y9z4.LJIIIZ()) && (interfaceC1846850y9z5 == null || !interfaceC1846850y9z5.LJIIIZ()))))) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILIIL(DataChannel dataChannel) {
        if (C1810700xDg.LJ(dataChannel) != ((int) EnumC1118970fDz.RANK_SWITCH_STATUS_ON.getValue())) {
            return true;
        }
        return false;
    }

    public static final void LJIILJJIL(DataChannel dataChannel) {
        InterfaceC1846850y9z interfaceC1846850y9z = (InterfaceC1846850y9z) dataChannel.gg0(C1119110fED.class);
        InterfaceC1846850y9z interfaceC1846850y9z2 = (InterfaceC1846850y9z) dataChannel.gg0(C1119080fEA.class);
        InterfaceC1846850y9z interfaceC1846850y9z3 = (InterfaceC1846850y9z) dataChannel.gg0(C1119100fEC.class);
        InterfaceC1846850y9z interfaceC1846850y9z4 = (InterfaceC1846850y9z) dataChannel.gg0(C1119090fEB.class);
        InterfaceC1846850y9z interfaceC1846850y9z5 = (InterfaceC1846850y9z) dataChannel.gg0(C1119070fE9.class);
        if (interfaceC1846850y9z != null) {
            interfaceC1846850y9z.LIZ(EnumC1846750y9p.REPLACE);
        }
        if (interfaceC1846850y9z2 != null) {
            interfaceC1846850y9z2.LIZ(EnumC1846750y9p.REPLACE);
        }
        if (interfaceC1846850y9z3 != null) {
            interfaceC1846850y9z3.LIZ(EnumC1846750y9p.REPLACE);
        }
        if (interfaceC1846850y9z4 != null) {
            interfaceC1846850y9z4.LIZ(EnumC1846750y9p.REPLACE);
        }
        if (interfaceC1846850y9z5 != null) {
            interfaceC1846850y9z5.LIZ(EnumC1846750y9p.REPLACE);
        }
    }

    public static final String LJIILLIIL(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateTimeFormatter.ofPattern("HH:mm").withZone(TimeZone.getDefault().toZoneId()).format(Instant.ofEpochSecond(j));
        }
        return String.valueOf(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041 A[PHI: r5
      0x0041: PHI (r5v1 X.0yA7) = (r5v0 X.0yA7), (r5v4 X.0yA7), (r5v4 X.0yA7) binds: [B:21:0x003a, B:10:0x0018, B:12:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1846810y9v LIZ(com.bytedance.android.livesdk.model.message.RankUpdate.AffiliatedInfo r7, com.bytedance.android.livesdk.rank.model.ClassInfo r8) {
        /*
            r2 = 0
            r6 = 0
            if (r7 == 0) goto L2f
            com.bytedance.android.livesdk.rank.model.SettleInfo r0 = r7.settleInfo
            if (r0 == 0) goto L2f
            com.bytedance.android.livesdk.rank.model.ClassInfo r0 = r0.newClassInfo
            if (r0 == 0) goto L2f
            X.0yA7 r5 = new X.0yA7
            int r4 = r0.classType
            long r0 = r0.starCount
            r5.<init>(r4, r0)
        L16:
            com.bytedance.android.livesdk.rank.model.SettleInfo r0 = r7.settleInfo
            if (r0 == 0) goto L41
            com.bytedance.android.livesdk.rank.model.ClassInfo r4 = r0.oldClassInfo
            if (r4 == 0) goto L41
            X.0yA7 r1 = new X.0yA7
            int r0 = r4.classType
            long r2 = r4.starCount
            r1.<init>(r0, r2)
        L27:
            int r6 = r7.stickerShowScene
        L29:
            X.0y9v r0 = new X.0y9v
            r0.<init>(r6, r5, r1)
            return r0
        L2f:
            X.0yA7 r5 = new X.0yA7
            if (r8 == 0) goto L3d
            int r4 = r8.classType
            long r0 = r8.starCount
        L37:
            r5.<init>(r4, r0)
            if (r7 == 0) goto L41
            goto L16
        L3d:
            r4 = 0
            r0 = 0
            goto L37
        L41:
            X.0yA7 r1 = new X.0yA7
            if (r8 == 0) goto L4f
            int r0 = r8.classType
            long r2 = r8.starCount
        L49:
            r1.<init>(r0, r2)
            if (r7 == 0) goto L29
            goto L27
        L4f:
            r0 = 0
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1846800y9u.LIZ(com.bytedance.android.livesdk.model.message.RankUpdate$AffiliatedInfo, com.bytedance.android.livesdk.rank.model.ClassInfo):X.0y9v");
    }

    public static final String LJFF(long j, boolean z) {
        StringBuilder sbLIZ;
        long j2 = ((j + 499) / 1000) % ((long) 86400);
        long j3 = 3600;
        long j4 = j2 / j3;
        long j5 = j2 % j3;
        long j6 = 60;
        long j7 = j5 / j6;
        long j8 = j5 % j6;
        if (j4 > 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(LJII(j4));
            sbLIZ2.append("h ");
            sbLIZ2.append(LJII(j7));
            sbLIZ2.append('m');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (j7 > 0) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(LJII(j7));
            sbLIZ3.append("m ");
            sbLIZ3.append(LJII(j8));
            sbLIZ3.append('s');
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (j8 > 0) {
            if (z) {
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("00m ");
            } else {
                sbLIZ = C2188811AlT.LIZ();
            }
            sbLIZ.append(LJII(j8));
            sbLIZ.append('s');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (z) {
            return "00m 00s";
        }
        return "0s";
    }

    public static final void LJIILL(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        C786410Ut5.W5(view, layoutParams);
    }

    public static final boolean LJIIZILJ(Integer num, Integer num2) {
        if (num != null) {
            if (num.intValue() == 0) {
                if (num2 == null || num2.intValue() != 2) {
                    return true;
                }
                return false;
            }
            if (num.intValue() == 1) {
                if (num2 != null && num2.intValue() == 2) {
                    return true;
                }
                return false;
            }
            num.intValue();
            return false;
        }
        return false;
    }

    public static final Pair<Boolean, Boolean> LIZJ(DataChannel dataChannel, boolean z, RankTypeV2 rankTypeV2) {
        String str;
        String str2;
        String str3;
        String str4;
        InterfaceC1846850y9z interfaceC1846850y9z = (InterfaceC1846850y9z) dataChannel.gg0(C1119110fED.class);
        InterfaceC1846850y9z interfaceC1846850y9z2 = (InterfaceC1846850y9z) dataChannel.gg0(C1119080fEA.class);
        InterfaceC1846850y9z interfaceC1846850y9z3 = (InterfaceC1846850y9z) dataChannel.gg0(C1119100fEC.class);
        InterfaceC1846850y9z interfaceC1846850y9z4 = (InterfaceC1846850y9z) dataChannel.gg0(C1119090fEB.class);
        InterfaceC1846850y9z interfaceC1846850y9z5 = (InterfaceC1846850y9z) dataChannel.gg0(C1119070fE9.class);
        if ((interfaceC1846850y9z != null && interfaceC1846850y9z.LJIIIZ()) || ((interfaceC1846850y9z2 != null && interfaceC1846850y9z2.LJIIIZ()) || ((interfaceC1846850y9z3 != null && interfaceC1846850y9z3.LJIIIZ()) || ((interfaceC1846850y9z4 != null && interfaceC1846850y9z4.LJIIIZ()) || (interfaceC1846850y9z5 != null && interfaceC1846850y9z5.LJIIIZ()))))) {
            if (z) {
                RankStickerExtra rankStickerExtra = (RankStickerExtra) dataChannel.gg0(C1E80.class);
                String str5 = null;
                if (rankStickerExtra != null) {
                    str = rankStickerExtra.showType;
                } else {
                    str = null;
                }
                if (!Intrinsics.LJFF(str, "active_set")) {
                    RankStickerExtra rankStickerExtra2 = (RankStickerExtra) dataChannel.gg0(C2276311E7x.class);
                    if (rankStickerExtra2 != null) {
                        str2 = rankStickerExtra2.showType;
                    } else {
                        str2 = null;
                    }
                    if (!Intrinsics.LJFF(str2, "active_set")) {
                        RankStickerExtra rankStickerExtra3 = (RankStickerExtra) dataChannel.gg0(C2276331E7z.class);
                        if (rankStickerExtra3 != null) {
                            str3 = rankStickerExtra3.showType;
                        } else {
                            str3 = null;
                        }
                        if (!Intrinsics.LJFF(str3, "active_set")) {
                            RankStickerExtra rankStickerExtra4 = (RankStickerExtra) dataChannel.gg0(C2276321E7y.class);
                            if (rankStickerExtra4 != null) {
                                str4 = rankStickerExtra4.showType;
                            } else {
                                str4 = null;
                            }
                            if (!Intrinsics.LJFF(str4, "active_set")) {
                                RankStickerExtra rankStickerExtra5 = (RankStickerExtra) dataChannel.gg0(C2276301E7w.class);
                                if (rankStickerExtra5 != null) {
                                    str5 = rankStickerExtra5.showType;
                                }
                                if (!Intrinsics.LJFF(str5, "active_set")) {
                                    if (!LiveRankStickerResolveConflictSetting.INSTANCE.getValue()) {
                                        Boolean bool = Boolean.FALSE;
                                        return new Pair<>(bool, bool);
                                    }
                                    List listLJIILJJIL = C1697810uHb.LJIILJJIL(RankTypeV2.LJIIL, RankTypeV2.LJIJJLI, RankTypeV2.LJIL, RankTypeV2.LJIILJJIL, RankTypeV2.LIZ);
                                    RankTypeV2 rankTypeV2LJIIIZ = LJIIIZ(dataChannel);
                                    if (rankTypeV2LJIIIZ == null) {
                                        rankTypeV2LJIIIZ = rankTypeV2;
                                    }
                                    if (listLJIILJJIL.indexOf(rankTypeV2) <= listLJIILJJIL.indexOf(rankTypeV2LJIIIZ)) {
                                        LJIILJJIL(dataChannel);
                                        return new Pair<>(Boolean.FALSE, Boolean.TRUE);
                                    }
                                    return new Pair<>(Boolean.TRUE, Boolean.FALSE);
                                }
                            }
                        }
                    }
                }
                return new Pair<>(Boolean.TRUE, Boolean.FALSE);
            }
            LJIILJJIL(dataChannel);
            return new Pair<>(Boolean.FALSE, Boolean.TRUE);
        }
        Boolean bool2 = Boolean.FALSE;
        return new Pair<>(bool2, bool2);
    }

    public static final boolean LJ(DataChannel dataChannel, int i, RankTypeV2 rankTypeV2, RankTypeV2 rankTypeV22) {
        InterfaceC1846850y9z interfaceC1846850y9z;
        boolean zLJIIIZ;
        InterfaceC1846850y9z interfaceC1846850y9z2;
        InterfaceC1846850y9z interfaceC1846850y9z3;
        InterfaceC1846850y9z interfaceC1846850y9z4;
        InterfaceC1846850y9z interfaceC1846850y9z5;
        InterfaceC1846850y9z interfaceC1846850y9z6;
        RankAnimationType rankAnimationType = RankAnimationType.LIZ;
        if (i != RankAnimationType.LJ.type && i != RankAnimationType.LJFF.type) {
            if (i != RankAnimationType.LJI.type && i != RankAnimationType.LJII.type) {
                return false;
            }
            RankTypeV2 rankTypeV23 = RankTypeV2.LIZ;
            if (Intrinsics.LJFF(rankTypeV22, RankTypeV2.LJIIL)) {
                if (dataChannel == null || (interfaceC1846850y9z6 = (InterfaceC1846850y9z) dataChannel.gg0(C1119080fEA.class)) == null) {
                    return false;
                }
                zLJIIIZ = interfaceC1846850y9z6.LJIIIZ();
            } else if (Intrinsics.LJFF(rankTypeV22, RankTypeV2.LIZ)) {
                if (dataChannel == null || (interfaceC1846850y9z5 = (InterfaceC1846850y9z) dataChannel.gg0(C1119100fEC.class)) == null) {
                    return false;
                }
                zLJIIIZ = interfaceC1846850y9z5.LJIIIZ();
            } else {
                if (!Intrinsics.LJFF(rankTypeV22, RankTypeV2.LJIL) || dataChannel == null || (interfaceC1846850y9z4 = (InterfaceC1846850y9z) dataChannel.gg0(C1119070fE9.class)) == null) {
                    return false;
                }
                zLJIIIZ = interfaceC1846850y9z4.LJIIIZ();
            }
        } else {
            RankTypeV2 rankTypeV24 = RankTypeV2.LIZ;
            RankTypeV2 rankTypeV25 = RankTypeV2.LJIIL;
            if (Intrinsics.LJFF(rankTypeV2, rankTypeV25) && Intrinsics.LJFF(rankTypeV22, rankTypeV25)) {
                if (dataChannel == null || (interfaceC1846850y9z3 = (InterfaceC1846850y9z) dataChannel.gg0(C1119080fEA.class)) == null) {
                    return false;
                }
                zLJIIIZ = interfaceC1846850y9z3.LJIIIZ();
            } else {
                RankTypeV2 rankTypeV26 = RankTypeV2.LIZ;
                if (Intrinsics.LJFF(rankTypeV2, rankTypeV26) && Intrinsics.LJFF(rankTypeV22, rankTypeV26)) {
                    if (dataChannel == null || (interfaceC1846850y9z2 = (InterfaceC1846850y9z) dataChannel.gg0(C1119100fEC.class)) == null) {
                        return false;
                    }
                    zLJIIIZ = interfaceC1846850y9z2.LJIIIZ();
                } else {
                    RankTypeV2 rankTypeV27 = RankTypeV2.LJIL;
                    if (!Intrinsics.LJFF(rankTypeV2, rankTypeV27) || !Intrinsics.LJFF(rankTypeV22, rankTypeV27) || dataChannel == null || (interfaceC1846850y9z = (InterfaceC1846850y9z) dataChannel.gg0(C1119070fE9.class)) == null) {
                        return false;
                    }
                    zLJIIIZ = interfaceC1846850y9z.LJIIIZ();
                }
            }
        }
        if (!zLJIIIZ || ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJ(DataChannel dataChannel, RankTypeV2 rankTypeV2, boolean z, C1119420fEi c1119420fEi, C1119420fEi c1119420fEi2) {
        C1846810y9v c1846810y9v;
        Integer numValueOf;
        if ((!Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIL) || C463680IGg.LIZ > 0) && z && LiveRankStickerCenterFilterSetting.INSTANCE.getValue() && c1119420fEi2 != null && (c1846810y9v = c1119420fEi2.LJIIIIZZ) != null && (numValueOf = Integer.valueOf(c1846810y9v.LIZ)) != null) {
            if (numValueOf.intValue() == 0) {
                C1846810y9v c1846810y9v2 = c1119420fEi.LJIIIIZZ;
                if (c1846810y9v2 == null || c1846810y9v2.LIZ != 2) {
                    return true;
                }
            } else if (numValueOf.intValue() == 1) {
                C1846810y9v c1846810y9v3 = c1119420fEi.LJIIIIZZ;
                if (c1846810y9v3 == null || c1846810y9v3.LIZ != 1) {
                    return true;
                }
            } else if (numValueOf.intValue() == 2) {
                C1846810y9v c1846810y9v4 = c1119420fEi.LJIIIIZZ;
                if (c1846810y9v4 != null && c1846810y9v4.LIZ == 0) {
                    return true;
                }
            } else {
                return true;
            }
            C1119440fEk.LIZ(dataChannel, c1119420fEi2, c1119420fEi, rankTypeV2, "sticker_center");
            return false;
        }
        return true;
    }
}
