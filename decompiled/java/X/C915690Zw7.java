package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.linkmic.RandomLinkMicOptimiseQuickInviteCountdownTimeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Zw7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915690Zw7 {
    public final LifecycleOwner LIZ;
    public final DataChannel LIZIZ;
    public Boolean LIZJ;
    public final Map<String, Boolean> LIZLLL = C2097608Jq.LJIIJ(new Pair("hasNoCoHostPermission", null), new Pair("isInMultiGuest", null), new Pair("isInMatch", null), new Pair("isViewerLimited", null), new Pair("hasMaxLinkedUsers", null), new Pair("isCompetitionInProcess", null));
    public final Map<String, Boolean> LJ = C2097608Jq.LJIIJ(new Pair("isInMicRoom", null));
    public final Map<String, Boolean> LJFF = new LinkedHashMap();
    public final Map<String, Boolean> LJI = C2097608Jq.LJIIJ(new Pair("hasNoCoHostPermission", null), new Pair("isInMultiGuest", null), new Pair("isViewerLimited", null), new Pair("isCoHosted", null));
    public final AwS629S0100000_15 LJII = new AwS629S0100000_15(this, 89);
    public final AwS594S0100000_15 LJIIIIZZ = new AwS594S0100000_15(this, 1019);
    public final AwS629S0100000_15 LJIIIZ = new AwS629S0100000_15(this, 88);
    public final C915710Zw9 LJIIJ = new InterfaceC915740ZwC() { // from class: X.0Zw9
        @Override // X.InterfaceC915740ZwC
        public final void LIZ(boolean z) {
            this.LIZ.LIZ("isInMultiGuest", z);
            this.LIZ.LIZIZ("isInMultiGuest", z);
        }
    };
    public final AwS594S0100000_15 LJIIJJI = new AwS594S0100000_15(this, 1012);
    public final AwS594S0100000_15 LJIIL = new AwS594S0100000_15(this, 1011);
    public final AwS594S0100000_15 LJIILIIL = new AwS594S0100000_15(this, 1013);
    public final AwS594S0100000_15 LJIILJJIL = new AwS594S0100000_15(this, 1010);
    public final AFwS250S0000000_15 LJIILL = AFwS250S0000000_15.get$arr$(223);
    public final AwS594S0100000_15 LJIILLIIL = new AwS594S0100000_15(this, 1017);
    public final AwS594S0100000_15 LJIIZILJ = new AwS594S0100000_15(this, 1015);
    public final AwS594S0100000_15 LJIJ = new AwS594S0100000_15(this, 1014);
    public final AwS594S0100000_15 LJIJI = new AwS594S0100000_15(this, 1018);
    public final AwS594S0100000_15 LJIJJ = new AwS594S0100000_15(this, 1016);
    public final AFwS250S0000000_15 LJIJJLI = AFwS250S0000000_15.get$arr$(222);
    public final AFwS250S0000000_15 LJIL = AFwS250S0000000_15.get$arr$(224);
    public final AFwS250S0000000_15 LJJ = AFwS250S0000000_15.get$arr$(225);

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0Zw9] */
    public C915690Zw7(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = dataChannel;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7 A[EDGE_INSN: B:44:0x00f7->B:36:0x00c7 BREAK  A[LOOP:0: B:40:0x00e5->B:65:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C915690Zw7.LIZ(java.lang.String, boolean):void");
    }

    public final void LIZIZ(String str, boolean z) {
        if (!LiveDirectMatchSetting.INSTANCE.isEnabled()) {
            return;
        }
        int i = 1;
        if (this.LJI.containsKey(str) && !Intrinsics.LJFF(((LinkedHashMap) this.LJI).get(str), Boolean.valueOf(z))) {
            this.LJI.put(str, Boolean.valueOf(z));
            Collection collectionValues = ((LinkedHashMap) this.LJI).values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    if (it2.next() == null) {
                        return;
                    }
                }
            }
            Collection collectionValues2 = ((LinkedHashMap) this.LJI).values();
            if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                Iterator it3 = collectionValues2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    } else if (!Intrinsics.LJFF(it3.next(), Boolean.FALSE)) {
                        i = 0;
                        break;
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("directBattleEnable", i);
            jSONObject.put("battleEnable", 0);
            C389001fE.LIZ("BattleStatusEnableChangeEvent", jSONObject, System.currentTimeMillis(), false);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BattleStatusEnableChangeEvent, params=");
            sbLIZ.append(jSONObject);
            C20441214yg.LIZIZ("CoHostEventSender", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZJ(C915690Zw7 c915690Zw7, String str, boolean z, int i) {
        String str2;
        long jLJII;
        Object objValueOf;
        Long lLJIILIIL;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        c915690Zw7.getClass();
        if (C915700Zw8.LIZ[C915980Zwa.LJIIIZ().LJFF().ordinal()] == 1) {
            str2 = "BattleQuickMatchStatusChangeEvent";
        } else {
            str2 = "CohostQuickMatchStatusChangeEvent";
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) c915690Zw7.LJFF).entrySet()) {
            jSONObject.put((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
        }
        if (z) {
            objValueOf = Integer.valueOf(RandomLinkMicOptimiseQuickInviteCountdownTimeSetting.INSTANCE.getValue());
        } else {
            if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                jLJII = lLJIILIIL.longValue();
            } else {
                jLJII = C915980Zwa.LJIIIZ().LJII();
            }
            objValueOf = Long.valueOf(jLJII);
        }
        jSONObject.put("countdown", objValueOf);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("eventName=");
        sbLIZ.append(str2);
        sbLIZ.append(", params=");
        sbLIZ.append(jSONObject);
        C20441214yg.LIZIZ("CoHostEventSender", C2188811AlT.LIZIZ(sbLIZ));
        C389001fE.LIZ(str2, jSONObject, System.currentTimeMillis(), false);
    }
}
