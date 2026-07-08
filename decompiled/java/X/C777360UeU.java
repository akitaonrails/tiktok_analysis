package X;

import Y.AfS148S0200000_12;
import Y.AfS181S0100000_12;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.game.LiveGameSafetyReporterSetting;
import com.bytedance.android.livesdk.livesetting.game.LiveGameSafetyReporterSetting2;
import com.bytedance.android.livesdk.livesetting.game.LiveGameSafetyReporterSettingConfig2;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import webcast.api.game.TnsPiracyDetail;

/* JADX INFO: renamed from: X.0UeU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C777360UeU implements InterfaceC471501sX {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public final SensorManager LIZLLL;
    public final float[] LJ = new float[9];
    public final float[] LJFF = new float[3];
    public final float[] LJI = new float[3];
    public final float[] LJII = new float[3];
    public final float[] LJIIIIZZ = new float[3];
    public final C777370UeV LJIIIZ = new SensorEventListener() { // from class: X.0UeV
        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            Sensor sensor;
            Integer numValueOf;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (sensorEvent != null && (sensor = sensorEvent.sensor) != null && (numValueOf = Integer.valueOf(C2204961BRm.LJJLIIIJLJLI(sensor, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MyFf9A4/HWWwV5PNZ0jwG3VI0uCC1yI0e2CIMnZG2zaA==", null)))) != null) {
                if (numValueOf.intValue() == 10) {
                    C777360UeU c777360UeU = this.LL;
                    if (jCurrentTimeMillis - c777360UeU.LIZ < 500) {
                        return;
                    } else {
                        c777360UeU.LIZ = jCurrentTimeMillis;
                    }
                } else if (numValueOf.intValue() == 1) {
                    C777360UeU c777360UeU2 = this.LL;
                    if (jCurrentTimeMillis - c777360UeU2.LIZIZ < 500) {
                        return;
                    } else {
                        c777360UeU2.LIZIZ = jCurrentTimeMillis;
                    }
                } else if (numValueOf.intValue() == 2) {
                    C777360UeU c777360UeU3 = this.LL;
                    if (jCurrentTimeMillis - c777360UeU3.LIZJ < 500) {
                        return;
                    } else {
                        c777360UeU3.LIZJ = jCurrentTimeMillis;
                    }
                }
            }
            C11NZ.LJJJJZ(Boolean.TRUE).LJJJLZIJ(C11S5.LIZ).LJJLJLI(new AfS148S0200000_12(sensorEvent, this.LL, 8));
        }
    };
    public List<Double> LJIIJ;
    public final LiveGameSafetyReporterSettingConfig2.GameLiveSafetyReporterConfig2 LJIIJJI;

    @Override // X.InterfaceC471501sX
    public final void start() {
        Map<String, Object> map = C1338270kvh.LIZ;
        C11NZ.LJJJJZ(Boolean.TRUE).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS181S0100000_12(this, 16));
    }

    @Override // X.InterfaceC471501sX
    public final void stop() {
        Map<String, Object> map = C1338270kvh.LIZ;
        C11NZ.LJJJJZ(Boolean.TRUE).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS181S0100000_12(this, 17));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0UeV] */
    public C777360UeU(GameBroadcastFragment gameBroadcastFragment) {
        Object objJ2;
        C19EG activity = gameBroadcastFragment.getActivity();
        if (activity != null) {
            objJ2 = C786410Ut5.J2(activity, "sensor");
        } else {
            objJ2 = null;
        }
        this.LIZLLL = (SensorManager) objJ2;
        this.LJIIJJI = LiveGameSafetyReporterSettingConfig2.INSTANCE.getValue();
    }

    @Override // X.InterfaceC471501sX
    public final void LIZ(TnsPiracyDetail tnsPiracyDetail) {
        boolean z;
        double dDoubleValue;
        double dDoubleValue2;
        double dDoubleValue3;
        double dDoubleValue4;
        double dDoubleValue5;
        double dDoubleValue6;
        double dDoubleValue7;
        double dDoubleValue8;
        double dDoubleValue9;
        double dDoubleValue10;
        double dDoubleValue11;
        Double d;
        Double d2;
        Double d3;
        Double d4;
        Double d5;
        Double d6;
        Double d7;
        Double d8;
        Double d9;
        Map<String, Object> map = C1338270kvh.LIZ;
        SensorManager.getRotationMatrix(this.LJ, null, this.LJII, this.LJIIIIZZ);
        SensorManager.getOrientation(this.LJ, this.LJFF);
        if (tnsPiracyDetail.angle == null) {
            z = true;
        } else {
            z = false;
        }
        double dDoubleValue12 = 0.0d;
        if (z) {
            tnsPiracyDetail.angle = C1697810uHb.LJIILJJIL(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d));
        }
        if (tnsPiracyDetail.acceleration == null) {
            tnsPiracyDetail.acceleration = C1697810uHb.LJIILJJIL(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d));
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        try {
            List<Double> list = tnsPiracyDetail.acceleration;
            if (list != null) {
                list.set(0, Double.valueOf(CastDoubleProtector.parseDouble(decimalFormat.format(Float.valueOf(this.LJI[0])))));
            }
            List<Double> list2 = tnsPiracyDetail.acceleration;
            if (list2 != null) {
                list2.set(1, Double.valueOf(CastDoubleProtector.parseDouble(decimalFormat.format(Float.valueOf(this.LJI[1])))));
            }
            List<Double> list3 = tnsPiracyDetail.acceleration;
            if (list3 != null) {
                list3.set(2, Double.valueOf(CastDoubleProtector.parseDouble(decimalFormat.format(Float.valueOf(this.LJI[2])))));
            }
            List<Double> list4 = tnsPiracyDetail.angle;
            if (list4 != null) {
                list4.set(0, Double.valueOf(CastDoubleProtector.parseDouble(decimalFormat.format(Float.valueOf(this.LJFF[0])))));
            }
            List<Double> list5 = tnsPiracyDetail.angle;
            if (list5 != null) {
                list5.set(1, Double.valueOf(CastDoubleProtector.parseDouble(decimalFormat.format(Float.valueOf(this.LJFF[1])))));
            }
            List<Double> list6 = tnsPiracyDetail.angle;
            if (list6 != null) {
                list6.set(2, Double.valueOf(CastDoubleProtector.parseDouble(decimalFormat.format(Float.valueOf(this.LJFF[2])))));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            List<Double> list7 = tnsPiracyDetail.acceleration;
            if (list7 != null) {
                ListProtector.set(list7, 0, Double.valueOf(this.LJI[0]));
            }
            List<Double> list8 = tnsPiracyDetail.acceleration;
            if (list8 != null) {
                ListProtector.set(list8, 1, Double.valueOf(this.LJI[1]));
            }
            List<Double> list9 = tnsPiracyDetail.acceleration;
            if (list9 != null) {
                ListProtector.set(list9, 2, Double.valueOf(this.LJI[2]));
            }
            List<Double> list10 = tnsPiracyDetail.angle;
            if (list10 != null) {
                ListProtector.set(list10, 0, Double.valueOf(this.LJFF[0]));
            }
            List<Double> list11 = tnsPiracyDetail.angle;
            if (list11 != null) {
                ListProtector.set(list11, 1, Double.valueOf(this.LJFF[1]));
            }
            List<Double> list12 = tnsPiracyDetail.angle;
            if (list12 != null) {
                ListProtector.set(list12, 2, Double.valueOf(this.LJFF[2]));
            }
        }
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(tnsPiracyDetail.angle, "g_broadcast_xyz_angel_list");
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(tnsPiracyDetail.acceleration, "g_broadcast_xyz_acceleration_list");
        if (LiveGameSafetyReporterSetting2.INSTANCE.isDefault()) {
            Map<String, Object> map2 = C1338270kvh.LIZ;
            if (this.LJIIJ == null) {
                List<Double> listLJIILJJIL = C1697810uHb.LJIILJJIL(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d));
                List<Double> list13 = tnsPiracyDetail.angle;
                if (list13 != null && (d9 = (Double) ListProtector.get(list13, 0)) != null) {
                    ListProtector.set(listLJIILJJIL, 0, Double.valueOf(d9.doubleValue()));
                }
                List<Double> list14 = tnsPiracyDetail.angle;
                if (list14 != null && (d8 = (Double) ListProtector.get(list14, 1)) != null) {
                    ListProtector.set(listLJIILJJIL, 1, Double.valueOf(d8.doubleValue()));
                }
                List<Double> list15 = tnsPiracyDetail.angle;
                if (list15 != null && (d7 = (Double) ListProtector.get(list15, 2)) != null) {
                    ListProtector.set(listLJIILJJIL, 2, Double.valueOf(d7.doubleValue()));
                }
                this.LJIIJ = listLJIILJJIL;
            } else {
                List<Double> list16 = tnsPiracyDetail.angle;
                if (list16 != null && (d6 = (Double) ListProtector.get(list16, 0)) != null) {
                    dDoubleValue6 = d6.doubleValue();
                } else {
                    dDoubleValue6 = 0.0d;
                }
                List<Double> list17 = this.LJIIJ;
                if (list17 != null) {
                    dDoubleValue7 = ((Number) ListProtector.get(list17, 0)).doubleValue();
                } else {
                    dDoubleValue7 = 0.0d;
                }
                double d10 = dDoubleValue6 - dDoubleValue7;
                double d11 = 180;
                double d12 = (d10 * d11) / 3.141592653589793d;
                List<Double> list18 = tnsPiracyDetail.angle;
                if (list18 != null && (d5 = (Double) ListProtector.get(list18, 1)) != null) {
                    dDoubleValue8 = d5.doubleValue();
                } else {
                    dDoubleValue8 = 0.0d;
                }
                List<Double> list19 = this.LJIIJ;
                if (list19 != null) {
                    dDoubleValue9 = ((Number) ListProtector.get(list19, 1)).doubleValue();
                } else {
                    dDoubleValue9 = 0.0d;
                }
                double d13 = ((dDoubleValue8 - dDoubleValue9) * d11) / 3.141592653589793d;
                List<Double> list20 = tnsPiracyDetail.angle;
                if (list20 != null && (d4 = (Double) ListProtector.get(list20, 2)) != null) {
                    dDoubleValue10 = d4.doubleValue();
                } else {
                    dDoubleValue10 = 0.0d;
                }
                List<Double> list21 = this.LJIIJ;
                if (list21 != null) {
                    dDoubleValue11 = ((Number) ListProtector.get(list21, 2)).doubleValue();
                } else {
                    dDoubleValue11 = 0.0d;
                }
                double d14 = ((dDoubleValue10 - dDoubleValue11) * d11) / 3.141592653589793d;
                int i = this.LJIIJJI.count;
                if (tnsPiracyDetail.gyroXThresholdHits == null) {
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 < i; i2++) {
                        arrayList.add(Boolean.FALSE);
                    }
                    tnsPiracyDetail.gyroXThresholdHits = arrayList;
                }
                List<Boolean> list22 = tnsPiracyDetail.gyroXThresholdHits;
                if (list22 != null) {
                    LIZIZ(Math.abs(d12), list22);
                }
                if (tnsPiracyDetail.gyroYThresholdHits == null) {
                    ArrayList arrayList2 = new ArrayList(i);
                    for (int i3 = 0; i3 < i; i3++) {
                        arrayList2.add(Boolean.FALSE);
                    }
                    tnsPiracyDetail.gyroYThresholdHits = arrayList2;
                }
                List<Boolean> list23 = tnsPiracyDetail.gyroYThresholdHits;
                if (list23 != null) {
                    LIZIZ(Math.abs(d13), list23);
                }
                if (tnsPiracyDetail.gyroZThresholdHits == null) {
                    ArrayList arrayList3 = new ArrayList(i);
                    for (int i4 = 0; i4 < i; i4++) {
                        arrayList3.add(Boolean.FALSE);
                    }
                    tnsPiracyDetail.gyroZThresholdHits = arrayList3;
                }
                List<Boolean> list24 = tnsPiracyDetail.gyroZThresholdHits;
                if (list24 != null) {
                    LIZIZ(Math.abs(d14), list24);
                }
                tnsPiracyDetail.signalVersion = this.LJIIJJI.version;
                Map<String, Object> map3 = C1338270kvh.LIZ;
                List<Double> list25 = this.LJIIJ;
                if (list25 != null) {
                    List<Double> list26 = tnsPiracyDetail.angle;
                    if (list26 != null && (d3 = (Double) ListProtector.get(list26, 0)) != null) {
                        ListProtector.set(list25, 0, Double.valueOf(d3.doubleValue()));
                    }
                    List<Double> list27 = tnsPiracyDetail.angle;
                    if (list27 != null && (d2 = (Double) ListProtector.get(list27, 1)) != null) {
                        ListProtector.set(list25, 1, Double.valueOf(d2.doubleValue()));
                    }
                    List<Double> list28 = tnsPiracyDetail.angle;
                    if (list28 != null && (d = (Double) ListProtector.get(list28, 2)) != null) {
                        ListProtector.set(list25, 2, Double.valueOf(d.doubleValue()));
                    }
                }
            }
        }
        boolean z2 = C777230UeH.LIZJ;
        List<Double> list29 = tnsPiracyDetail.acceleration;
        List<Double> list30 = tnsPiracyDetail.angle;
        if (LiveGameSafetyReporterSetting.INSTANCE.getValue().f29switch) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onCollectGyroscope, acceleration: ");
            sbLIZ.append(list29);
            sbLIZ.append(", angle: ");
            sbLIZ.append(list30);
            C20441214yg.LIZIZ("SafetyFeatureCollector", C2188811AlT.LIZIZ(sbLIZ));
            Double d15 = (Double) C13LP.LJJJLZIJ(0, list29);
            if (d15 != null) {
                dDoubleValue = d15.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
            Double d16 = (Double) C13LP.LJJJLZIJ(1, list29);
            if (d16 != null) {
                dDoubleValue2 = d16.doubleValue();
            } else {
                dDoubleValue2 = 0.0d;
            }
            Double d17 = (Double) C13LP.LJJJLZIJ(2, list29);
            if (d17 != null) {
                dDoubleValue3 = d17.doubleValue();
            } else {
                dDoubleValue3 = 0.0d;
            }
            Double d18 = (Double) C13LP.LJJJLZIJ(0, list29);
            if (d18 != null) {
                dDoubleValue4 = d18.doubleValue();
            } else {
                dDoubleValue4 = 0.0d;
            }
            Double d19 = (Double) C13LP.LJJJLZIJ(0, list29);
            if (d19 != null) {
                dDoubleValue5 = d19.doubleValue();
            } else {
                dDoubleValue5 = 0.0d;
            }
            Double d20 = (Double) C13LP.LJJJLZIJ(0, list29);
            if (d20 != null) {
                dDoubleValue12 = d20.doubleValue();
            }
            double dSqrt = Math.sqrt((dDoubleValue * dDoubleValue) + (dDoubleValue2 * dDoubleValue2) + (dDoubleValue3 * dDoubleValue3));
            double d21 = C777230UeH.LJI;
            C777230UeH.LJ = (C777230UeH.LJ * d21) + ((((double) 1) - d21) * dSqrt);
            double dExp = 1.0d / (Math.exp(-((((dSqrt - r5) * 60.0d) - 5.0d) + (Math.sqrt(((dDoubleValue4 * dDoubleValue4) + (dDoubleValue5 * dDoubleValue5)) + (dDoubleValue12 * dDoubleValue12)) * (-30.0d)))) + 1.0d);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("processGyroscope2Touch, probability: ");
            sbLIZ2.append(dExp);
            C20441214yg.LIZIZ("SafetyFeatureCollector", C2188811AlT.LIZIZ(sbLIZ2));
            if (dExp > C777230UeH.LJFF) {
                C777230UeH.LIZIZ = System.currentTimeMillis();
                C20441214yg.LIZIZ("SafetyFeatureCollector", "onCollectGyroscope, judge click");
            } else {
                C20441214yg.LIZIZ("SafetyFeatureCollector", "onCollectGyroscope, judge no click");
            }
            if (System.currentTimeMillis() - C777230UeH.LIZIZ < 30000) {
                C777230UeH.LIZ(Boolean.TRUE, "g_screen_click_background_period");
                C777230UeH.LIZJ = true;
            } else {
                C777230UeH.LIZ(Boolean.FALSE, "g_screen_click_background_period");
                C777230UeH.LIZJ = false;
            }
        }
    }

    public final void LIZIZ(double d, List<Boolean> list) {
        int i;
        Collections.fill(list, Boolean.FALSE);
        LiveGameSafetyReporterSettingConfig2.GameLiveSafetyReporterConfig2 gameLiveSafetyReporterConfig2 = this.LJIIJJI;
        int i2 = gameLiveSafetyReporterConfig2.step;
        if (i2 > 0 && (i = gameLiveSafetyReporterConfig2.count) > 0) {
            double d2 = gameLiveSafetyReporterConfig2.initValue;
            if (d < d2) {
                return;
            }
            int i3 = (int) ((d - d2) / ((double) i2));
            int i4 = i - 1;
            if (i3 > i4) {
                i3 = i4;
            }
            ListProtector.set(list, i3, Boolean.TRUE);
        }
    }
}
