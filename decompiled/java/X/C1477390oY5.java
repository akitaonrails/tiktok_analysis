package X;

import android.util.Pair;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.AutoBitrateSet;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.GearConfig;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oY5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477390oY5 {
    public static final C1477390oY5 LIZ = new C1477390oY5();

    /* JADX WARN: Multi-variable type inference failed */
    public static SimBitRate LIZ(List list, RateSettingsResponse rateSettingsResponse) throws JSONException {
        double d;
        C1477560oYM c1477560oYM;
        C1477600oYQ c1477600oYQ;
        final C1477460oYC c1477460oYC;
        InterfaceC1475360oUo interfaceC1475360oUo;
        InterfaceC1475640oVG c1476850oXD;
        C1477330oXz c1477330oXz;
        C1477320oXy c1477320oXy;
        C1477670oYX c1477670oYX;
        InterfaceC1477220oXo interfaceC1477220oXo;
        InterfaceC1478280oZW interfaceC1478280oZW;
        InterfaceC1477480oYE interfaceC1477480oYE;
        InterfaceC1475360oUo interfaceC1475360oUo2;
        C1479130oat c1479130oatLJIIIIZZ = C1479130oat.LJIIIIZZ();
        Object obj = null;
        if (c1479130oatLJIIIIZZ == null) {
            return null;
        }
        int speed = (int) c1479130oatLJIIIIZZ.getSpeed();
        if (rateSettingsResponse == null) {
            return null;
        }
        InterfaceC1478050oZ9 interfaceC1478050oZ9Build = ((InterfaceC1477720oYc) C1126604au.LIZ("com.ss.android.ugc.aweme.bitrateselector.impl.DTBitrateSelectorServiceImpl")).build();
        GearConfig adaptiveGearGroup = rateSettingsResponse.getAdaptiveGearGroup();
        AutoBitrateSet autoBitrateSetMusic = rateSettingsResponse.getAutoBitrateSetMusic();
        if (autoBitrateSetMusic != null) {
            d = autoBitrateSetMusic.minBitrate;
        } else {
            d = 0.0d;
        }
        Pair pair = new Pair(Double.valueOf(d), rateSettingsResponse.getAdaptiveGearGroup().LIZLLL().second);
        if (adaptiveGearGroup == null) {
            c1477560oYM = null;
        } else {
            c1477560oYM = new C1477560oYM(adaptiveGearGroup, pair);
        }
        C1477500oYG c1477500oYG = new C1477500oYG(c1477560oYM);
        c1477500oYG.LIZJ = EnumC1477530oYJ.SHIFT;
        AutoBitrateSet autoBitrateSetMusic2 = rateSettingsResponse.getAutoBitrateSetMusic();
        if (autoBitrateSetMusic2 == null) {
            c1477600oYQ = null;
        } else {
            c1477600oYQ = new C1477600oYQ(autoBitrateSetMusic2);
        }
        c1477500oYG.LIZIZ = c1477600oYQ;
        C1477490oYF c1477490oYF = new C1477490oYF(c1477500oYG);
        C1477710oYb c1477710oYb = (C1477710oYb) interfaceC1478050oZ9Build;
        c1477710oYb.getClass();
        int i = C1477520oYI.LIZ[c1477490oYF.LIZJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                final InterfaceC1478070oZB interfaceC1478070oZB = c1477490oYF.LIZ;
                if (interfaceC1478070oZB == null) {
                    interfaceC1477480oYE = null;
                } else {
                    interfaceC1477480oYE = new InterfaceC1477480oYE() { // from class: X.0oYC
                        @Override // X.InterfaceC1477480oYE
                        public final Set<String> LIZ() {
                            return ((C1477560oYM) interfaceC1478070oZB).LIZ.LIZ();
                        }

                        @Override // X.InterfaceC1477480oYE
                        public final String LIZIZ() {
                            return ((C1477560oYM) interfaceC1478070oZB).LIZ.LIZIZ();
                        }

                        @Override // X.InterfaceC1477480oYE
                        public final double LIZJ() {
                            return ((C1477560oYM) interfaceC1478070oZB).LIZ.LIZJ();
                        }

                        @Override // X.InterfaceC1477480oYE
                        public final Pair<Double, Double> LIZLLL() {
                            C1477560oYM c1477560oYM2 = (C1477560oYM) interfaceC1478070oZB;
                            Pair<Double, Double> pair2 = c1477560oYM2.LIZIZ;
                            return pair2 == null ? c1477560oYM2.LIZ.LIZLLL() : pair2;
                        }
                    };
                }
                C1477450oYB c1477450oYB = new C1477450oYB(interfaceC1477480oYE);
                c1477450oYB.LIZIZ = null;
                c1477450oYB.LIZJ = null;
                final InterfaceC1478060oZA interfaceC1478060oZA = c1477490oYF.LIZIZ;
                if (interfaceC1478060oZA == null) {
                    interfaceC1475360oUo2 = null;
                } else {
                    interfaceC1475360oUo2 = new InterfaceC1475360oUo() { // from class: X.0oYH
                        @Override // X.InterfaceC1475360oUo
                        public final double LIZ() {
                            return ((C1477600oYQ) interfaceC1478060oZA).LIZ.LIZ();
                        }

                        @Override // X.InterfaceC1475360oUo
                        public final double LIZIZ() {
                            return ((C1477600oYQ) interfaceC1478060oZA).LIZ.LIZIZ();
                        }

                        @Override // X.InterfaceC1475360oUo
                        public final double LIZJ() {
                            return ((C1477600oYQ) interfaceC1478060oZA).LIZ.LIZJ();
                        }

                        @Override // X.InterfaceC1475360oUo
                        public final double LIZLLL() {
                            return ((C1477600oYQ) interfaceC1478060oZA).LIZ.LIZLLL();
                        }

                        @Override // X.InterfaceC1475360oUo
                        public final double LJ() {
                            return ((C1477600oYQ) interfaceC1478060oZA).LIZ.LJ();
                        }
                    };
                }
                c1477450oYB.LIZLLL = interfaceC1475360oUo2;
                c1476850oXD = c1477450oYB.LIZ();
            } else {
                c1476850oXD = new C1476850oXD();
            }
        } else {
            final InterfaceC1478070oZB interfaceC1478070oZB2 = c1477490oYF.LIZ;
            if (interfaceC1478070oZB2 == null) {
                c1477460oYC = 0;
            } else {
                c1477460oYC = new InterfaceC1477480oYE() { // from class: X.0oYC
                    @Override // X.InterfaceC1477480oYE
                    public final Set<String> LIZ() {
                        return ((C1477560oYM) interfaceC1478070oZB2).LIZ.LIZ();
                    }

                    @Override // X.InterfaceC1477480oYE
                    public final String LIZIZ() {
                        return ((C1477560oYM) interfaceC1478070oZB2).LIZ.LIZIZ();
                    }

                    @Override // X.InterfaceC1477480oYE
                    public final double LIZJ() {
                        return ((C1477560oYM) interfaceC1478070oZB2).LIZ.LIZJ();
                    }

                    @Override // X.InterfaceC1477480oYE
                    public final Pair<Double, Double> LIZLLL() {
                        C1477560oYM c1477560oYM2 = (C1477560oYM) interfaceC1478070oZB2;
                        Pair<Double, Double> pair2 = c1477560oYM2.LIZIZ;
                        return pair2 == null ? c1477560oYM2.LIZ.LIZLLL() : pair2;
                    }
                };
            }
            AbstractC1477470oYD abstractC1477470oYD = new AbstractC1477470oYD(c1477460oYC) { // from class: X.0oYL
            };
            abstractC1477470oYD.LIZIZ = null;
            abstractC1477470oYD.LIZJ = null;
            final InterfaceC1478060oZA interfaceC1478060oZA2 = c1477490oYF.LIZIZ;
            if (interfaceC1478060oZA2 == null) {
                interfaceC1475360oUo = null;
            } else {
                interfaceC1475360oUo = new InterfaceC1475360oUo() { // from class: X.0oYH
                    @Override // X.InterfaceC1475360oUo
                    public final double LIZ() {
                        return ((C1477600oYQ) interfaceC1478060oZA2).LIZ.LIZ();
                    }

                    @Override // X.InterfaceC1475360oUo
                    public final double LIZIZ() {
                        return ((C1477600oYQ) interfaceC1478060oZA2).LIZ.LIZIZ();
                    }

                    @Override // X.InterfaceC1475360oUo
                    public final double LIZJ() {
                        return ((C1477600oYQ) interfaceC1478060oZA2).LIZ.LIZJ();
                    }

                    @Override // X.InterfaceC1475360oUo
                    public final double LIZLLL() {
                        return ((C1477600oYQ) interfaceC1478060oZA2).LIZ.LIZLLL();
                    }

                    @Override // X.InterfaceC1475360oUo
                    public final double LJ() {
                        return ((C1477600oYQ) interfaceC1478060oZA2).LIZ.LJ();
                    }
                };
            }
            abstractC1477470oYD.LIZLLL = interfaceC1475360oUo;
            C1477080oXa c1477080oXa = new C1477080oXa(c1477460oYC);
            C1477430oY9 c1477430oY9 = new C1477430oY9(c1477460oYC);
            c1477430oY9.LIZIZ = null;
            c1477430oY9.LIZJ = null;
            c1477430oY9.LIZLLL = interfaceC1475360oUo;
            InterfaceC1475640oVG interfaceC1475640oVGLIZ = c1477430oY9.LIZ();
            AbstractC1477410oY7 abstractC1477410oY7 = (AbstractC1477410oY7) interfaceC1475640oVGLIZ;
            abstractC1477410oY7.LIZIZ = abstractC1477470oYD.LIZIZ;
            abstractC1477410oY7.LIZJ = abstractC1477470oYD.LIZJ;
            abstractC1477410oY7.LIZLLL = abstractC1477470oYD.LIZLLL;
            c1477080oXa.LJ = interfaceC1475640oVGLIZ;
            c1476850oXD = c1477080oXa;
        }
        c1477710oYb.LIZ = c1476850oXD;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final SimBitRate simBitRate = (SimBitRate) it2.next();
            if (simBitRate == null) {
                interfaceC1478280oZW = null;
            } else {
                interfaceC1478280oZW = new InterfaceC1478280oZW() { // from class: X.0oXx
                    @Override // X.InterfaceC1478280oZW
                    public final /* synthetic */ long getFps() {
                        return -1L;
                    }

                    @Override // X.InterfaceC1478280oZW
                    public final /* synthetic */ int getVideoHeight() {
                        return -1;
                    }

                    @Override // X.InterfaceC1478280oZW
                    public final /* synthetic */ int getVideoWidth() {
                        return -1;
                    }

                    @Override // X.InterfaceC1478280oZW
                    public final int getBitRate() {
                        return simBitRate.getBitRate();
                    }

                    @Override // X.InterfaceC1478280oZW
                    public final String getChecksum() {
                        return simBitRate.getChecksum();
                    }

                    @Override // X.InterfaceC1478280oZW
                    public final String getGearName() {
                        return simBitRate.getGearName();
                    }

                    @Override // X.InterfaceC1478280oZW
                    public final int getHdrBit() {
                        return simBitRate.getHdrBit();
                    }

                    @Override // X.InterfaceC1478280oZW
                    public final int getHdrType() {
                        return simBitRate.getHdrType();
                    }

                    @Override // X.InterfaceC1478280oZW
                    public final int getQualityType() {
                        return simBitRate.getQualityType();
                    }

                    @Override // X.InterfaceC1478280oZW
                    public final int getSize() {
                        return simBitRate.getSize();
                    }

                    @Override // X.InterfaceC1478280oZW
                    public final String getUrlKey() {
                        return simBitRate.getUrlKey();
                    }

                    @Override // X.InterfaceC1478280oZW
                    public final int isBytevc1() {
                        return simBitRate.isBytevc1();
                    }

                    @Override // X.InterfaceC1478280oZW
                    public final List<String> urlList() {
                        return simBitRate.urlList();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("SimBitRate{bitRate=");
                        sbLIZ.append(simBitRate.getBitRate());
                        sbLIZ.append(", gearName='");
                        sbLIZ.append(simBitRate.getGearName());
                        sbLIZ.append('\'');
                        sbLIZ.append(", qualityType=");
                        sbLIZ.append(simBitRate.getQualityType());
                        sbLIZ.append(", isBytevc1=");
                        sbLIZ.append(simBitRate.isBytevc1());
                        sbLIZ.append('}');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }
                };
            }
            arrayList.add(interfaceC1478280oZW);
        }
        ArrayList<InterfaceC1478280oZW> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((InterfaceC1478280oZW) obj2).urlList().isEmpty()) {
                arrayList2.add(obj2);
            }
        }
        C07RY c07ry = new C07RY();
        ((HashMap) c07ry.LIZ).put("internet_speed", Integer.valueOf(speed));
        Map<String, Object> map = c07ry.LIZ;
        InterfaceC1475640oVG interfaceC1475640oVG = c1477710oYb.LIZ;
        ArrayList arrayList3 = new ArrayList();
        for (final InterfaceC1478280oZW interfaceC1478280oZW2 : arrayList2) {
            if (interfaceC1478280oZW2 == null) {
                interfaceC1477220oXo = null;
            } else {
                interfaceC1477220oXo = new InterfaceC1477220oXo() { // from class: X.0oZV
                    @Override // X.InterfaceC1477220oXo
                    public final /* synthetic */ String getAudioFileId() {
                        return null;
                    }

                    @Override // X.InterfaceC1477220oXo
                    public final int getBitRate() {
                        return interfaceC1478280oZW2.getBitRate();
                    }

                    @Override // X.InterfaceC1477220oXo
                    public final String getChecksum() {
                        return interfaceC1478280oZW2.getChecksum();
                    }

                    @Override // X.InterfaceC1477220oXo
                    public final long getFps() {
                        return interfaceC1478280oZW2.getFps();
                    }

                    @Override // X.InterfaceC1477220oXo
                    public final String getGearName() {
                        return interfaceC1478280oZW2.getGearName();
                    }

                    @Override // X.InterfaceC1477220oXo
                    public final int getHdrBit() {
                        return interfaceC1478280oZW2.getHdrBit();
                    }

                    @Override // X.InterfaceC1477220oXo
                    public final int getHdrType() {
                        return interfaceC1478280oZW2.getHdrType();
                    }

                    @Override // X.InterfaceC1477220oXo
                    public final int getQualityType() {
                        return interfaceC1478280oZW2.getQualityType();
                    }

                    @Override // X.InterfaceC1477220oXo
                    public final int getSize() {
                        return interfaceC1478280oZW2.getSize();
                    }

                    @Override // X.InterfaceC1477220oXo
                    public final String getUrlKey() {
                        return interfaceC1478280oZW2.getUrlKey();
                    }

                    @Override // X.InterfaceC1477220oXo
                    public final int getVideoHeight() {
                        return interfaceC1478280oZW2.getVideoHeight();
                    }

                    @Override // X.InterfaceC1477220oXo
                    public final int getVideoWidth() {
                        return interfaceC1478280oZW2.getVideoWidth();
                    }

                    @Override // X.InterfaceC1477220oXo
                    public final int isBytevc1() {
                        return interfaceC1478280oZW2.isBytevc1();
                    }

                    @Override // X.InterfaceC1477220oXo
                    public final List<String> urlList() {
                        return interfaceC1478280oZW2.urlList();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("SimBitRate{bitRate=");
                        sbLIZ.append(interfaceC1478280oZW2.getBitRate());
                        sbLIZ.append(", gearName='");
                        sbLIZ.append(interfaceC1478280oZW2.getGearName());
                        sbLIZ.append('\'');
                        sbLIZ.append(", qualityType=");
                        sbLIZ.append(interfaceC1478280oZW2.getQualityType());
                        sbLIZ.append(", isBytevc1=");
                        sbLIZ.append(interfaceC1478280oZW2.isBytevc1());
                        sbLIZ.append('}');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }
                };
            }
            arrayList3.add(interfaceC1477220oXo);
        }
        C1477120oXe c1477120oXeLIZIZ = interfaceC1475640oVG.LIZIZ(arrayList3, map);
        if (c1477120oXeLIZIZ == null) {
            c1477330oXz = null;
        } else {
            c1477330oXz = new C1477330oXz();
            InterfaceC1477220oXo interfaceC1477220oXo2 = c1477120oXeLIZIZ.LL;
            if (interfaceC1477220oXo2 == null) {
                c1477320oXy = null;
            } else {
                c1477320oXy = new C1477320oXy(interfaceC1477220oXo2);
            }
            c1477330oXz.LIZ = c1477320oXy;
            c1477330oXz.LIZJ = c1477120oXeLIZIZ.LLILZLL;
            C1477070oXZ c1477070oXZ = c1477120oXeLIZIZ.LLILZIL;
            if (c1477070oXZ == null) {
                c1477670oYX = 0;
            } else {
                final int code = c1477070oXZ.getCode();
                final String message = c1477070oXZ.getMessage();
                c1477670oYX = new Exception(code, message) { // from class: X.0oYX
                    public final int LL;

                    public int getCode() {
                        return this.LL;
                    }

                    {
                        super(message);
                        this.LL = code;
                    }
                };
            }
            c1477330oXz.LIZIZ = c1477670oYX;
        }
        if (c1477330oXz.LIZIZ != null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("video_quality", Integer.valueOf(c1477330oXz.getQualityType()));
        jSONObject.put("calc_bitrate", Double.valueOf(c1477330oXz.LIZJ));
        jSONObject.put("bitrate_set", list);
        jSONObject.put("internet_speed", speed);
        jSONObject.put("enter_from", "single_song");
        C20684815ws.LJIJ("video_play_quality", jSONObject);
        Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            SimBitRate simBitRate2 = (SimBitRate) next;
            if (simBitRate2.getBitRate() == c1477330oXz.getBitRate() && Intrinsics.LJFF(simBitRate2.getGearName(), c1477330oXz.getGearName())) {
                obj = next;
                break;
            }
        }
        return (SimBitRate) obj;
    }
}
