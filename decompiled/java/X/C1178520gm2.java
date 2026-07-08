package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gm2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178520gm2 {
    public static void LIZ(C1178520gm2 c1178520gm2, Context context, InterfaceC1177250gjz interfaceC1177250gjz, C1177960gl8 c1177960gl8, final Double d, final Double d2, final Double d3, final Double d4, Double d5, Integer num, Integer num2, List list, Function1 function1, Function0 function0, int i) {
        final Integer numValueOf;
        int i2;
        Object c098200Yq;
        Function1 function12 = function1;
        Integer num3 = num2;
        Integer num4 = num;
        if ((i & 256) != 0) {
            num4 = null;
        }
        if ((i & 512) != 0) {
            num3 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            list = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            function12 = null;
        }
        if ((i & 8192) != 0) {
            function0 = null;
        }
        if (context != null) {
            interfaceC1177250gjz.LJIILLIIL();
            InterfaceC1178030glF[] interfaceC1178030glFArr = new InterfaceC1178030glF[2];
            interfaceC1178030glFArr[0] = new InterfaceC1178030glF(d, d2, d3, d4) { // from class: X.0gk8
                public final Double LIZ;
                public final Double LIZIZ;
                public final Double LIZJ;
                public final Double LIZLLL;

                {
                    this.LIZ = d;
                    this.LIZIZ = d2;
                    this.LIZJ = d3;
                    this.LIZLLL = d4;
                }

                @Override // X.InterfaceC1178030glF
                public final boolean LIZ(C1177960gl8 c1177960gl82, InterfaceC1177250gjz interfaceC1177250gjz2, Integer num5, Integer num6) {
                    Double d6 = this.LIZ;
                    if (d6 != null) {
                        double dDoubleValue = d6.doubleValue();
                        Double d7 = this.LIZIZ;
                        if (d7 != null) {
                            double dDoubleValue2 = d7.doubleValue();
                            Double d8 = this.LIZJ;
                            if (d8 != null) {
                                double dDoubleValue3 = d8.doubleValue();
                                Double d9 = this.LIZLLL;
                                if (d9 != null) {
                                    double dDoubleValue4 = d9.doubleValue();
                                    if (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d && dDoubleValue3 == 0.0d && dDoubleValue4 == 0.0d) {
                                        return false;
                                    }
                                    Pair pair = new Pair(Double.valueOf(c1177960gl82.lat), Double.valueOf(c1177960gl82.lon));
                                    double dDoubleValue5 = ((Number) pair.getFirst()).doubleValue();
                                    double dDoubleValue6 = ((Number) pair.getSecond()).doubleValue();
                                    double dMax = Math.max(Math.abs(dDoubleValue6 - dDoubleValue4), Math.abs(dDoubleValue6 - dDoubleValue3));
                                    double dMax2 = Math.max(Math.abs(dDoubleValue5 - dDoubleValue2), Math.abs(dDoubleValue5 - dDoubleValue));
                                    Pair pair2 = new Pair(Double.valueOf(dDoubleValue5 + dMax2), Double.valueOf(dDoubleValue6 - dMax));
                                    double dDoubleValue7 = ((Number) pair2.getFirst()).doubleValue();
                                    double dDoubleValue8 = ((Number) pair2.getSecond()).doubleValue();
                                    Pair pair3 = new Pair(Double.valueOf(dDoubleValue5 - dMax2), Double.valueOf(dDoubleValue6 + dMax));
                                    double dDoubleValue9 = ((Number) pair3.getFirst()).doubleValue();
                                    double dDoubleValue10 = ((Number) pair3.getSecond()).doubleValue();
                                    if (num5 != null && num5.intValue() != 0 && num6 != null && num6.intValue() != 0) {
                                        interfaceC1177250gjz2.LJIIIZ(new C1177960gl8(dDoubleValue7, dDoubleValue8), new C1177960gl8(dDoubleValue9, dDoubleValue10), num5.intValue(), num6.intValue(), null);
                                        return true;
                                    }
                                    interfaceC1177250gjz2.LJIJJLI(new C1177960gl8(dDoubleValue7, dDoubleValue8), new C1177960gl8(dDoubleValue9, dDoubleValue10), null);
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            };
            if (d5 != null) {
                numValueOf = Integer.valueOf((int) d5.doubleValue());
            } else {
                numValueOf = null;
            }
            interfaceC1178030glFArr[1] = new InterfaceC1178030glF(numValueOf) { // from class: X.0gm1
                public final Integer LIZ;

                {
                    this.LIZ = numValueOf;
                }

                @Override // X.InterfaceC1178030glF
                public final boolean LIZ(C1177960gl8 c1177960gl82, InterfaceC1177250gjz interfaceC1177250gjz2, Integer num5, Integer num6) {
                    Integer num7 = this.LIZ;
                    if (num7 != null) {
                        int iIntValue = num7.intValue();
                        if (iIntValue == -1) {
                            iIntValue = 14;
                        }
                        interfaceC1177250gjz2.LIZIZ(c1177960gl82, Float.valueOf(iIntValue), null);
                        return true;
                    }
                    return false;
                }
            };
            List listLJIIJJI = C1697810uHb.LJIIJJI(interfaceC1178030glFArr);
            if (C960203pA.LIZIZ(context)) {
                i2 = R.drawable.cuz;
            } else {
                i2 = R.drawable.cv0;
            }
            float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            float fLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i2;
            int i3 = (int) fLIZIZ;
            c419910GdJ.LIZIZ = i3;
            int i4 = (int) fLIZIZ2;
            c419910GdJ.LIZJ = i4;
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            try {
                c098200Yq = Bitmap.createBitmap(tuxIconDrawableLIZ.LIZJ(), tuxIconDrawableLIZ.LIZIZ(), Bitmap.Config.ARGB_8888);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Bitmap bitmap = (Bitmap) c098200Yq;
            if (bitmap != null) {
                Canvas canvas = new Canvas(bitmap);
                tuxIconDrawableLIZ.setBounds(0, 0, i3, i4);
                tuxIconDrawableLIZ.draw(canvas);
                if (list != null) {
                    for (C1178530gm3 c1178530gm3 : list) {
                        C1177960gl8 c1177960gl82 = c1178530gm3.LIZ;
                        C1178140glQ c1178140glQ = c1178530gm3.LIZIZ;
                        if (c1178140glQ == null) {
                            c1178140glQ = new C1178140glQ();
                        }
                        if (c1178140glQ.LIZ == null) {
                            c1178140glQ.LIZ = bitmap;
                        }
                        interfaceC1177250gjz.LJIIL(c1177960gl82, c1178140glQ);
                    }
                }
            }
            Iterator it2 = listLJIIJJI.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((InterfaceC1178030glF) next).LIZ(c1177960gl8, interfaceC1177250gjz, num4, num3)) {
                    if (next != null) {
                        if (function12 != null) {
                            function12.invoke(next);
                            return;
                        }
                        return;
                    }
                }
            }
            if (function0 != null) {
                function0.invoke();
            }
        }
    }
}
