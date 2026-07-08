package X;

import Y.ARunnableS109S0100000_9;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DjN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2263951DjN extends AbstractC1023470cjx implements InterfaceC2258911DbF {
    public static final C01GW<Gson> LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(568));
    public final C1023630ckD<?>[] LIZ;

    public C2263951DjN() {
        super(new Object[0]);
        C2268371DqV.LIZ.getClass();
        this.LIZ = new C1023630ckD[]{new C1023630ckD<>(C2268371DqV.LJJLIIIJJI, AFwS252S0000000_16.get$arr$(588)), new C1023630ckD<>(C2268371DqV.LJI, AFwS252S0000000_16.get$arr$(589)), new C1023630ckD<>(C2268371DqV.LJLZ, AFwS252S0000000_16.get$arr$(590)), new C1023630ckD<>(C2268371DqV.LJJLIIIJL, AFwS252S0000000_16.get$arr$(591)), new C1023630ckD<>(C2268371DqV.LIZLLL, AFwS252S0000000_16.get$arr$(592)), new C1023630ckD<>(C2268371DqV.LJL, AFwS252S0000000_16.get$arr$(593)), new C1023630ckD<>(C2268371DqV.LJJLIL, AFwS252S0000000_16.get$arr$(594))};
    }

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    @Override // X.InterfaceC2258861DbA
    public final void LIZLLL(C19980813Fu c19980813Fu) {
        String str = c19980813Fu.LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : c19980813Fu.LIZLLL.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Object> entry2 : c19980813Fu.LJ.entrySet()) {
            linkedHashMap.put(entry2.getKey(), entry2.getValue());
        }
        Map<String, Object> map = c19980813Fu.LIZJ;
        Map<String, Object> map2 = c19980813Fu.LJFF;
        Map<String, Object> map3 = c19980813Fu.LJI;
        C0N23 c0n23 = c19980813Fu.LIZ;
        Aweme aweme = (Aweme) ((ConcurrentHashMap) C585270MxR.LIZ).get(c0n23);
        if (aweme == null) {
            return;
        }
        C1066000dqY c1066000dqY = new C1066000dqY(c0n23, aweme, linkedHashMap, map, map2, map3);
        C2263951DjN c2263951DjN = new C2263951DjN();
        c2263951DjN.withContext(aweme);
        if (Intrinsics.LJFF(str, "show")) {
            c2263951DjN.LJI(c1066000dqY);
            return;
        }
        if (Intrinsics.LJFF(str, "play")) {
            c2263951DjN.LJIIZILJ(c1066000dqY);
            return;
        }
        if (Intrinsics.LJFF(str, "over")) {
            c2263951DjN.LJIJI(c1066000dqY);
            return;
        }
        if (Intrinsics.LJFF(str, "break")) {
            c2263951DjN.LJIIL(c1066000dqY);
        } else if (C13LQ.LJJIJIIJI(str, C1046960dLq.LIZ) >= 0) {
            c2263951DjN.LJJIII(str, c1066000dqY);
        } else {
            if (!Intrinsics.LJFF(str, "extreme_position_error")) {
                return;
            }
            c2263951DjN.LJJIFFI(str, c1066000dqY);
        }
    }

    @Override // X.InterfaceC2258911DbF
    public final void LJI(C1066000dqY c1066000dqY) {
        C1023960ckk c1023960ckk;
        if (C2264471DkD.LJ()) {
            c1023960ckk = C2268381DqW.LIZ;
        } else if (!C2264471DkD.LIZJ()) {
            return;
        } else {
            c1023960ckk = C2268401DqY.LIZ;
        }
        C2258901DbE.LIZ(this, c1066000dqY, c1023960ckk, "Expose");
        logAd(c1023960ckk, new AwS382S0200000_16(this, c1066000dqY, 93));
        C11S5.LIZ().LIZIZ(new ARunnableS109S0100000_9(c1066000dqY.LIZ.getAwemeRawAd(), 211));
    }

    @Override // X.InterfaceC2258911DbF
    public final void LJIIL(C1066000dqY c1066000dqY) {
        C1023960ckk c1023960ckk;
        if (C2264471DkD.LJ()) {
            c1023960ckk = C2268321DqQ.LIZ;
        } else if (!C2264471DkD.LIZJ()) {
            return;
        } else {
            c1023960ckk = C2265281DlW.LIZ;
        }
        C2258901DbE.LIZ(this, c1066000dqY, c1023960ckk, "Break");
        logAd(c1023960ckk, new AwS382S0200000_16(this, c1066000dqY, 92));
    }

    @Override // X.InterfaceC2258911DbF
    public final void LJIIZILJ(C1066000dqY c1066000dqY) {
        C1023960ckk c1023960ckk;
        if (C2264471DkD.LJ()) {
            c1023960ckk = C2264021DjU.LIZ;
        } else if (!C2264471DkD.LIZJ()) {
            return;
        } else {
            c1023960ckk = C2264761Dkg.LIZ;
        }
        C2258901DbE.LIZ(this, c1066000dqY, c1023960ckk, "Play");
        logAd(c1023960ckk, new AwS382S0200000_16(this, c1066000dqY, 95));
    }

    @Override // X.InterfaceC2258911DbF
    public final void LJIJI(C1066000dqY c1066000dqY) {
        C1023960ckk c1023960ckk;
        if (C2264471DkD.LJ()) {
            c1023960ckk = C2265481Dlq.LIZ;
        } else if (!C2264471DkD.LIZJ()) {
            return;
        } else {
            c1023960ckk = C2265301DlY.LIZ;
        }
        C2258901DbE.LIZ(this, c1066000dqY, c1023960ckk, "Over");
        logAd(c1023960ckk, new AwS382S0200000_16(this, c1066000dqY, 94));
    }

    public static final void LJJIIZ(C1023640ckE c1023640ckE, C1066000dqY c1066000dqY) {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        Long lValueOf5;
        Long lValueOf6;
        Integer num;
        String json;
        String json2;
        Object reusableExtraParam;
        Long lValueOf7;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Map<String, Object> map = c1066000dqY.LIZIZ;
        C2264031DjV.LIZ.getClass();
        C1002190cBd c1002190cBd = C2264031DjV.LJIIJJI;
        Object obj = map.get("duration");
        String string = null;
        if (!(obj instanceof Long)) {
            obj = null;
        }
        c1023640ckE.withParam(c1002190cBd, obj);
        C1002190cBd c1002190cBd2 = C2264031DjV.LJJIZ;
        Object obj2 = map.get("player_duration");
        if (!(obj2 instanceof Long)) {
            obj2 = null;
        }
        c1023640ckE.withParam(c1002190cBd2, obj2);
        C1002190cBd c1002190cBd3 = C2264031DjV.LJJIJ;
        Object obj3 = map.get("video_length");
        if (!(obj3 instanceof Long)) {
            obj3 = null;
        }
        c1023640ckE.withParam(c1002190cBd3, obj3);
        C1002190cBd c1002190cBd4 = C2264031DjV.LJIILIIL;
        Object obj4 = map.get("play_order");
        if ((obj4 instanceof Integer) && (num7 = (Integer) obj4) != null) {
            lValueOf = Long.valueOf(num7.intValue());
        } else {
            lValueOf = null;
        }
        c1023640ckE.withParam(c1002190cBd4, lValueOf);
        C1002190cBd c1002190cBd5 = C2264031DjV.LJIIZILJ;
        Object obj5 = map.get("refer_bits");
        if (!(obj5 instanceof String)) {
            obj5 = null;
        }
        c1023640ckE.withParam(c1002190cBd5, obj5);
        C1002190cBd c1002190cBd6 = C2264031DjV.LJIJJ;
        Object obj6 = map.get("order_bits");
        if (!(obj6 instanceof String)) {
            obj6 = null;
        }
        c1023640ckE.withParam(c1002190cBd6, obj6);
        C1002190cBd c1002190cBd7 = C2264031DjV.LJJJJI;
        Object obj7 = map.get("is_current_dup");
        if ((obj7 instanceof Integer) && (num6 = (Integer) obj7) != null) {
            lValueOf2 = Long.valueOf(num6.intValue());
        } else {
            lValueOf2 = null;
        }
        c1023640ckE.withParam(c1002190cBd7, lValueOf2);
        C1002190cBd c1002190cBd8 = C2264031DjV.LJIILJJIL;
        Object obj8 = map.get("is_missing_pre");
        if ((obj8 instanceof Integer) && (num5 = (Integer) obj8) != null) {
            lValueOf3 = Long.valueOf(num5.intValue());
        } else {
            lValueOf3 = null;
        }
        c1023640ckE.withParam(c1002190cBd8, lValueOf3);
        C1002190cBd c1002190cBd9 = C2264031DjV.LJIILL;
        Object obj9 = map.get("is_order_error");
        if ((obj9 instanceof Integer) && (num4 = (Integer) obj9) != null) {
            lValueOf4 = Long.valueOf(num4.intValue());
        } else {
            lValueOf4 = null;
        }
        c1023640ckE.withParam(c1002190cBd9, lValueOf4);
        C1002190cBd c1002190cBd10 = C2264031DjV.LJJIJLIJ;
        Object obj10 = map.get("is_consistency_broken");
        if ((obj10 instanceof Integer) && (num3 = (Integer) obj10) != null) {
            lValueOf5 = Long.valueOf(num3.intValue());
        } else {
            lValueOf5 = null;
        }
        c1023640ckE.withParam(c1002190cBd10, lValueOf5);
        C2264471DkD.LIZ.getClass();
        if (C2264471DkD.LIZIZ() == 1 || C2264471DkD.LIZIZ() == 3) {
            C1002190cBd c1002190cBd11 = C2264031DjV.LJJIJIIJI;
            Object obj11 = map.get("should_drop");
            if ((obj11 instanceof Integer) && (num = (Integer) obj11) != null) {
                lValueOf6 = Long.valueOf(num.intValue());
            } else {
                lValueOf6 = null;
            }
            c1023640ckE.withParam(c1002190cBd11, lValueOf6);
        }
        if (C2264471DkD.LIZIZ() == 2) {
            C1002190cBd c1002190cBd12 = C2264031DjV.LJJJIL;
            Object obj12 = map.get("should_drop");
            if ((obj12 instanceof Integer) && (num2 = (Integer) obj12) != null) {
                lValueOf7 = Long.valueOf(num2.intValue());
            } else {
                lValueOf7 = null;
            }
            c1023640ckE.withParam(c1002190cBd12, lValueOf7);
        }
        C2265271DlV.LIZ.getClass();
        C1002190cBd c1002190cBd13 = C2265271DlV.LJ;
        Object obj13 = map.get("lost_events");
        if (!(obj13 instanceof String)) {
            obj13 = null;
        }
        c1023640ckE.withParam(c1002190cBd13, obj13);
        C1002190cBd c1002190cBd14 = C2264031DjV.LJ;
        if (!map.isEmpty()) {
            json = GsonProtectorUtils.toJson(LIZIZ.getValue(), map);
        } else {
            json = null;
        }
        c1023640ckE.withParam(c1002190cBd14, json);
        C1002190cBd c1002190cBd15 = C2264031DjV.LJJJI;
        Map<String, Object> map2 = c1066000dqY.LIZJ;
        if (!map2.isEmpty()) {
            json2 = GsonProtectorUtils.toJson(LIZIZ.getValue(), map2);
        } else {
            json2 = null;
        }
        c1023640ckE.withParam(c1002190cBd15, json2);
        C1002190cBd c1002190cBd16 = C2264031DjV.LJIIIIZZ;
        AwemeRawAd awemeRawAdLIZIZ = C587350N1x.LIZIZ(c1066000dqY.LIZ);
        if (awemeRawAdLIZIZ != null && (reusableExtraParam = awemeRawAdLIZIZ.getReusableExtraParam("aweme_updated")) != null) {
            string = reusableExtraParam.toString();
        }
        c1023640ckE.withParam(c1002190cBd16, string);
        if (C2264471DkD.LIZIZ() == 1) {
            c1023640ckE.withParam(C2264031DjV.LJJIII, "1");
        }
        if (C2264471DkD.LIZIZ() == 2) {
            c1023640ckE.withParam(C2264031DjV.LJIJ, "1");
        }
        if (C2264471DkD.LIZJ()) {
            c1023640ckE.withParam(C2264031DjV.LJJI, "1");
        }
    }

    @Override // X.InterfaceC2258911DbF
    public final void LJJIFFI(String str, C1066000dqY c1066000dqY) {
        C1023960ckk c1023960ckk;
        if (Intrinsics.LJFF(str, "extreme_position_error")) {
            if (C2264471DkD.LJ()) {
                c1023960ckk = C2258931DbH.LIZ;
            } else if (C2264471DkD.LIZJ()) {
                c1023960ckk = C2264741Dke.LIZ;
            } else {
                return;
            }
            if (c1023960ckk != null) {
                C2258901DbE.LIZ(this, c1066000dqY, c1023960ckk, String.valueOf(str));
                logAd(c1023960ckk, new AwS401S0200000_35(this, c1066000dqY, 69));
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC2258911DbF
    public final void LJJIII(String str, C1066000dqY c1066000dqY) {
        C1023960ckk c1023960ckk;
        switch (str.hashCode()) {
            case -232065072:
                if (!str.equals("view_thirdquartile")) {
                    return;
                }
                if (C2264471DkD.LJ()) {
                    c1023960ckk = C2268281DqM.LIZ;
                } else {
                    if (!C2264471DkD.LIZJ()) {
                        return;
                    }
                    c1023960ckk = C2264881Dks.LIZ;
                }
                break;
                break;
            case 139885730:
                if (!str.equals("view_midpoint")) {
                    return;
                }
                if (C2264471DkD.LJ()) {
                    c1023960ckk = C2268261DqK.LIZ;
                } else {
                    if (!C2264471DkD.LIZJ()) {
                        return;
                    }
                    c1023960ckk = C2264861Dkq.LIZ;
                }
                break;
                break;
            case 454226523:
                if (!str.equals("view_2s")) {
                    return;
                }
                if (C2264471DkD.LJ()) {
                    c1023960ckk = C2268341DqS.LIZ;
                } else {
                    if (!C2264471DkD.LIZJ()) {
                        return;
                    }
                    c1023960ckk = C2264801Dkk.LIZ;
                }
                break;
                break;
            case 454226647:
                if (!str.equals("view_6s")) {
                    return;
                }
                if (C2264471DkD.LJ()) {
                    c1023960ckk = C2268361DqU.LIZ;
                } else {
                    if (!C2264471DkD.LIZJ()) {
                        return;
                    }
                    c1023960ckk = C2264821Dkm.LIZ;
                }
                break;
                break;
            case 1196117557:
                if (!str.equals("view_15s")) {
                    return;
                }
                if (C2264471DkD.LJ()) {
                    c1023960ckk = C2268301DqO.LIZ;
                } else {
                    if (!C2264471DkD.LIZJ()) {
                        return;
                    }
                    c1023960ckk = C2264781Dki.LIZ;
                }
                break;
                break;
            case 1665985561:
                if (!str.equals("view_firstquartile")) {
                    return;
                }
                if (C2264471DkD.LJ()) {
                    c1023960ckk = C2268241DqI.LIZ;
                } else {
                    if (!C2264471DkD.LIZJ()) {
                        return;
                    }
                    c1023960ckk = C2264841Dko.LIZ;
                }
                break;
                break;
            default:
                return;
        }
        if (c1023960ckk == null) {
            return;
        }
        C2258901DbE.LIZ(this, c1066000dqY, c1023960ckk, str);
        logAd(c1023960ckk, new AwS401S0200000_35(this, c1066000dqY, 70));
    }
}
