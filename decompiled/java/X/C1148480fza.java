package X;

import com.bytedance.android.livesdk.livesetting.other.PartnershipAnchorFrequencyControlSetting;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fza, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1148480fza extends C09AY implements Function0<C1085410eLr> {
    public C1148480fza() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0eLr] */
    @Override // kotlin.jvm.functions.Function0
    public final C1085410eLr invoke() {
        return new InterfaceC1878550yz7() { // from class: X.0eLr
            public final C01GW LIZ = C452501pT.LIZIZ(new C1085420eLs());

            @Override // X.InterfaceC1878550yz7
            public final void Gf(int i, String str, String str2, long j, String str3, String str4) {
                try {
                    if (!PartnershipAnchorFrequencyControlSetting.INSTANCE.getConfig().enable) {
                        C20441214yg.LIZIZ("GamePartnershipAnchorHandler", "PartnershipAnchorFrequencyControlSetting Limit Disable");
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("logGIPAnchorShow itemID: ");
                    sbLIZ.append(str);
                    sbLIZ.append(", uid: ");
                    sbLIZ.append(str2);
                    sbLIZ.append(", did: ");
                    sbLIZ.append(str3);
                    sbLIZ.append(", enterFrom: ");
                    sbLIZ.append(str4);
                    sbLIZ.append(", promoteAdType: ");
                    sbLIZ.append(i);
                    sbLIZ.append(", timestamp: ");
                    sbLIZ.append(j);
                    C20441214yg.LIZIZ("GamePartnershipAnchorHandler", C2188811AlT.LIZIZ(sbLIZ));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append('-');
                    sbLIZ2.append(str2);
                    sbLIZ2.append('-');
                    sbLIZ2.append(str3);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    C20337914i1<HashMap<String, String>> c20337914i1 = InterfaceC772390URp.A0;
                    HashMap<String, String> mapLIZIZ = c20337914i1.LIZIZ();
                    C20337914i1<HashMap<String, String>> c20337914i12 = InterfaceC772390URp.B0;
                    HashMap<String, String> mapLIZIZ2 = c20337914i12.LIZIZ();
                    if (mapLIZIZ2.containsKey(strLIZIZ) && mapLIZIZ.containsKey(strLIZIZ)) {
                        String str5 = mapLIZIZ2.get(strLIZIZ);
                        String str6 = mapLIZIZ.get(strLIZIZ);
                        if (str5 != null && j - CastLongProtector.parseLong(str5) < 86400000) {
                            if (str6 != null && Intrinsics.LJFF(str4, "video_anchor")) {
                                mapLIZIZ.put(strLIZIZ, String.valueOf(CastIntegerProtector.parseInt(str6) + 1));
                            }
                            c20337914i1.LJFF(mapLIZIZ);
                            String str7 = mapLIZIZ.get(strLIZIZ);
                            String str8 = mapLIZIZ2.get(strLIZIZ);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("GIPAnchorShow key: ");
                            sbLIZ3.append(strLIZIZ);
                            sbLIZ3.append(", displayCounts: ");
                            sbLIZ3.append(str7);
                            sbLIZ3.append(", lastDisplayTimes: ");
                            sbLIZ3.append(str8);
                            sbLIZ3.append(' ');
                            C20441214yg.LIZIZ("GamePartnershipAnchorHandler", C2188811AlT.LIZIZ(sbLIZ3));
                            return;
                        }
                        mapLIZIZ.put(strLIZIZ, CardStruct.IStatusCode.DEFAULT);
                        mapLIZIZ2.put(strLIZIZ, String.valueOf(j));
                        c20337914i1.LJFF(mapLIZIZ);
                        c20337914i12.LJFF(mapLIZIZ2);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("GIPAnchorShow arrive new interval ,key: ");
                        sbLIZ4.append(strLIZIZ);
                        sbLIZ4.append(',');
                        C20441214yg.LIZIZ("GamePartnershipAnchorHandler", C2188811AlT.LIZIZ(sbLIZ4));
                        return;
                    }
                    mapLIZIZ.put(strLIZIZ, CardStruct.IStatusCode.DEFAULT);
                    mapLIZIZ2.put(strLIZIZ, String.valueOf(j));
                    c20337914i1.LJFF(mapLIZIZ);
                    c20337914i12.LJFF(mapLIZIZ2);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("GIPAnchorShow arrive new interval ,key: ");
                    sbLIZ5.append(strLIZIZ);
                    sbLIZ5.append(',');
                    C20441214yg.LIZIZ("GamePartnershipAnchorHandler", C2188811AlT.LIZIZ(sbLIZ5));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C20441214yg.LJ("GamePartnershipAnchorHandler", th.toString());
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x0103  */
            @Override // X.InterfaceC1878550yz7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean rp(java.lang.String r18, java.lang.String r19, java.lang.String r20, long r21, java.lang.String r23, int r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28) {
                /*
                    Method dump skipped, instruction units count: 509
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1085410eLr.rp(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
            }
        };
    }
}
