package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ml.process.bl.AfOPModel;
import com.ss.android.ml.process.bl.MLConfigModel;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0pSF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1512210pSF implements InterfaceC1440050nZr {
    public MLConfigModel LIZ;
    public MappedByteBuffer LIZIZ;
    public float[][] LIZJ;
    public ByteBuffer LIZLLL;
    public int LJ = -1;
    public final ArrayList<Float> LJFF = new ArrayList<>();
    public boolean LJI = false;
    public C1511890pRj LJII;

    public abstract boolean LIZLLL(MappedByteBuffer mappedByteBuffer, MLConfigModel mLConfigModel);

    public abstract void LJI(ByteBuffer byteBuffer, float[][] fArr, MLConfigModel mLConfigModel);

    /* JADX WARN: Removed duplicated region for block: B:73:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(java.util.HashMap r13, java.util.List r14) {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1512210pSF.LJFF(java.util.HashMap, java.util.List):void");
    }

    public final void LJII(C0VSP c0vsp, MLConfigModel mLConfigModel) {
        int size;
        List<String> list;
        this.LIZ = mLConfigModel;
        FileChannel channel = c0vsp.getChannel();
        this.LIZIZ = channel.map(FileChannel.MapMode.READ_ONLY, channel.position(), channel.size());
        AfOPModel afOPModel = mLConfigModel.output;
        if (afOPModel != null && (list = afOPModel.labels) != null) {
            size = list.size();
        } else {
            size = 1;
        }
        if (size == 2) {
            size = 1;
        }
        this.LIZJ = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 1, size);
        this.LJI = LIZLLL(this.LIZIZ, mLConfigModel);
    }

    public final void LJIIIIZZ(HashMap map, List list) {
        List<String> list2;
        if (list != null && !list.isEmpty()) {
            C1511890pRj c1511890pRj = this.LJII;
            if (c1511890pRj != null && c1511890pRj.LIZ) {
                c1511890pRj.LJIIJJI.LIZ = System.currentTimeMillis();
            }
            MLConfigModel mLConfigModel = this.LIZ;
            if (mLConfigModel != null) {
                list2 = mLConfigModel.feature_list;
            } else {
                list2 = null;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC1512760pT8 interfaceC1512760pT8 = (InterfaceC1512760pT8) it2.next();
                C1512580pSq c1512580pSq = new C1512580pSq((HashMap<String, Object>) map, interfaceC1512760pT8, list2);
                String operator = interfaceC1512760pT8.getOperator();
                InterfaceC1512420pSa interfaceC1512420pSa = C1512650pSx.LIZIZ.LIZ.get(operator);
                if (interfaceC1512420pSa != null) {
                    try {
                        interfaceC1512420pSa.LIZ(c1512580pSq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1512320pSQ.LIZIZ(th);
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(operator);
                    sbLIZ.append(" don't support now");
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            C1511890pRj c1511890pRj2 = this.LJII;
            if (c1511890pRj2 != null && c1511890pRj2.LIZ) {
                c1511890pRj2.LJIIJJI.LIZIZ = System.currentTimeMillis();
            }
        }
    }

    public static void LJ(AfOPModel afOPModel, Map map, float[][] fArr) {
        if (afOPModel.getLabels() != null && !afOPModel.getLabels().isEmpty()) {
            List<String> labels = afOPModel.getLabels();
            int size = labels.size();
            if (size == 2) {
                map.put(ListProtector.get(labels, 0), Float.valueOf(1.0f - fArr[0][0]));
                map.put(ListProtector.get(labels, 1), Float.valueOf(fArr[0][0]));
            } else {
                if (size != fArr[0].length) {
                    return;
                }
                Iterator<String> it2 = labels.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    map.put(it2.next(), Float.valueOf(fArr[0][i]));
                    i++;
                }
            }
            if (C1512320pSQ.LIZ) {
                map.toString();
            }
        }
    }

    public final void LIZ(AfOPModel afOPModel, List list, float[] fArr) {
        if (afOPModel == null) {
            return;
        }
        C1511890pRj c1511890pRj = this.LJII;
        if (c1511890pRj != null && c1511890pRj.LIZ) {
            c1511890pRj.LJIILIIL.LIZ = System.currentTimeMillis();
        }
        C1512580pSq c1512580pSq = new C1512580pSq(afOPModel, list, fArr);
        String operator = afOPModel.getOperator();
        InterfaceC1512420pSa interfaceC1512420pSa = C1512650pSx.LIZIZ.LIZ.get(operator);
        if (interfaceC1512420pSa != null) {
            try {
                interfaceC1512420pSa.LIZ(c1512580pSq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1512320pSQ.LIZIZ(th);
            }
            C1511890pRj c1511890pRj2 = this.LJII;
            if (c1511890pRj2 != null && c1511890pRj2.LIZ) {
                c1511890pRj2.LJIILIIL.LIZIZ = System.currentTimeMillis();
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(operator);
        sbLIZ.append(" don't support now");
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final float LIZIZ(Map map, List list, AfOPModel afOPModel, List list2) {
        C1511890pRj c1511890pRj = this.LJII;
        if (c1511890pRj != null && c1511890pRj.LIZ) {
            c1511890pRj.LJIIJ.LIZ = System.currentTimeMillis();
        }
        boolean z = false;
        try {
            this.LIZJ[0][0] = 0.0f;
            HashMap map2 = new HashMap(map);
            LJIIIIZZ(map2, list);
            LJFF(map2, list2);
            C1511890pRj c1511890pRj2 = this.LJII;
            if (c1511890pRj2 != null && c1511890pRj2.LIZ) {
                c1511890pRj2.LJIIL.LIZ = System.currentTimeMillis();
            }
            ByteBuffer byteBuffer = this.LIZLLL;
            if (byteBuffer != null) {
                LJI(byteBuffer, this.LIZJ, this.LIZ);
            }
            C1511890pRj c1511890pRj3 = this.LJII;
            if (c1511890pRj3 != null && c1511890pRj3.LIZ) {
                c1511890pRj3.LJIIL.LIZIZ = System.currentTimeMillis();
            }
            LIZ(afOPModel, null, this.LIZJ[0]);
            try {
                float f = this.LIZJ[0][0];
                C1511890pRj c1511890pRj4 = this.LJII;
                if (c1511890pRj4 != null) {
                    c1511890pRj4.LIZLLL(f, true);
                }
                return f;
            } catch (Throwable th) {
                th = th;
                z = true;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C1512320pSQ.LIZ) {
                        C1512320pSQ.LIZIZ(th);
                        C1511890pRj c1511890pRj5 = this.LJII;
                        if (c1511890pRj5 != null) {
                            c1511890pRj5.LIZLLL(0.0f, z);
                        }
                        return 0.0f;
                    }
                    throw th;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C1511890pRj c1511890pRj6 = this.LJII;
                    if (c1511890pRj6 != null) {
                        c1511890pRj6.LIZLLL(0.0f, z);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final List LIZJ(Map map, List list, AfOPModel afOPModel, List list2, Map map2) {
        C1511890pRj c1511890pRj = this.LJII;
        if (c1511890pRj != null && c1511890pRj.LIZ) {
            c1511890pRj.LJIIJ.LIZ = System.currentTimeMillis();
        }
        String str = "";
        boolean z = false;
        float fFloatValue = -1.0f;
        try {
            this.LIZJ[0][0] = 0.0f;
            HashMap map3 = new HashMap(map);
            LJIIIIZZ(map3, list);
            LJFF(map3, list2);
            C1511890pRj c1511890pRj2 = this.LJII;
            if (c1511890pRj2 != null && c1511890pRj2.LIZ) {
                c1511890pRj2.LJIIL.LIZ = System.currentTimeMillis();
            }
            ByteBuffer byteBuffer = this.LIZLLL;
            if (byteBuffer != null) {
                LJI(byteBuffer, this.LIZJ, this.LIZ);
            }
            C1511890pRj c1511890pRj3 = this.LJII;
            if (c1511890pRj3 != null && c1511890pRj3.LIZ) {
                c1511890pRj3.LJIIL.LIZIZ = System.currentTimeMillis();
            }
            ArrayList arrayList = new ArrayList();
            LIZ(afOPModel, arrayList, this.LIZJ[0]);
            LJ(afOPModel, map2, this.LIZJ);
            try {
                if (arrayList.size() > 0) {
                    String str2 = (String) arrayList.get(0);
                    try {
                        Float f = (Float) map2.get(str2);
                        if (f != null) {
                            fFloatValue = f.floatValue();
                        }
                        str = str2;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        str = str2;
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            if (!C1512320pSQ.LIZ) {
                                C1512320pSQ.LIZIZ(th);
                                ArrayList arrayList2 = new ArrayList();
                                C1511890pRj c1511890pRj4 = this.LJII;
                                if (c1511890pRj4 != null) {
                                    c1511890pRj4.LJ(str, fFloatValue, z);
                                }
                                return arrayList2;
                            }
                            throw th;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C1511890pRj c1511890pRj5 = this.LJII;
                            if (c1511890pRj5 != null) {
                                c1511890pRj5.LJ(str, fFloatValue, z);
                            }
                            throw th2;
                        }
                    }
                }
                C1511890pRj c1511890pRj6 = this.LJII;
                if (c1511890pRj6 != null) {
                    c1511890pRj6.LJ(str, fFloatValue, true);
                }
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                z = true;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
