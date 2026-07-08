package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pSx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512650pSx {
    public static final C1512650pSx LIZIZ = new C1512650pSx();
    public final HashMap<String, InterfaceC1512420pSa> LIZ;

    public C1512650pSx() {
        HashMap<String, InterfaceC1512420pSa> map = new HashMap<>();
        this.LIZ = map;
        map.put("log", new InterfaceC1512420pSa() { // from class: X.0pT4
            @Override // X.InterfaceC1512420pSa
            public final void LIZ(C1512580pSq c1512580pSq) {
                HashMap<String, Object> map2 = c1512580pSq.LIZ;
                InterfaceC1512760pT8 interfaceC1512760pT8 = c1512580pSq.LIZLLL;
                Iterator<String> it2 = interfaceC1512760pT8.getArgs().iterator();
                while (it2.hasNext()) {
                    if (((Number) C1510930pQB.LIZ(it2.next(), map2)) != null) {
                        map2.put(interfaceC1512760pT8.getFeature(), Float.valueOf((float) Math.log(r0.floatValue())));
                    }
                }
            }
        });
        map.put("log1p", new InterfaceC1512420pSa() { // from class: X.0pT6
            @Override // X.InterfaceC1512420pSa
            public final void LIZ(C1512580pSq c1512580pSq) {
                HashMap<String, Object> map2 = c1512580pSq.LIZ;
                InterfaceC1512760pT8 interfaceC1512760pT8 = c1512580pSq.LIZLLL;
                Iterator<String> it2 = interfaceC1512760pT8.getArgs().iterator();
                while (it2.hasNext()) {
                    if (((Number) C1510930pQB.LIZ(it2.next(), map2)) != null) {
                        map2.put(interfaceC1512760pT8.getFeature(), Float.valueOf((float) Math.log1p(r0.floatValue() + 1.0f)));
                    }
                }
            }
        });
        map.put("sigmoid", new InterfaceC1512420pSa() { // from class: X.0pT5
            @Override // X.InterfaceC1512420pSa
            public final void LIZ(C1512580pSq c1512580pSq) {
                HashMap<String, Object> map2 = c1512580pSq.LIZ;
                InterfaceC1512760pT8 interfaceC1512760pT8 = c1512580pSq.LIZLLL;
                Iterator<String> it2 = interfaceC1512760pT8.getArgs().iterator();
                while (it2.hasNext()) {
                    if (((Number) C1510930pQB.LIZ(it2.next(), map2)) != null) {
                        map2.put(interfaceC1512760pT8.getFeature(), Double.valueOf(1.0d / (Math.exp(-r0.floatValue()) + 1.0d)));
                    }
                }
            }
        });
        map.put("div", new InterfaceC1512420pSa() { // from class: X.0pT7
            @Override // X.InterfaceC1512420pSa
            public final void LIZ(C1512580pSq c1512580pSq) {
                float fFloatValue;
                HashMap<String, Object> map2 = c1512580pSq.LIZ;
                InterfaceC1512760pT8 interfaceC1512760pT8 = c1512580pSq.LIZLLL;
                List<String> args = interfaceC1512760pT8.getArgs();
                Number number = (Number) C1510930pQB.LIZ((String) ListProtector.get(args, 0), map2);
                Number number2 = (Number) C1510930pQB.LIZ((String) ListProtector.get(args, 1), map2);
                float fFloatValue2 = 0.0f;
                if (number != null) {
                    fFloatValue = number.floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                if (number2 != null) {
                    fFloatValue2 = number2.floatValue();
                }
                map2.put(interfaceC1512760pT8.getFeature(), Float.valueOf(fFloatValue / fFloatValue2));
            }
        });
        map.put("max", new InterfaceC1512420pSa() { // from class: X.0pT0
            @Override // X.InterfaceC1512420pSa
            public final void LIZ(C1512580pSq c1512580pSq) {
                HashMap<String, Object> map2 = c1512580pSq.LIZ;
                InterfaceC1512760pT8 interfaceC1512760pT8 = c1512580pSq.LIZLLL;
                List<String> args = interfaceC1512760pT8.getArgs();
                List<Float> oPTs = interfaceC1512760pT8.getOPTs();
                Iterator<String> it2 = args.iterator();
                while (it2.hasNext()) {
                    Number number = (Number) C1510930pQB.LIZ(it2.next(), map2);
                    if (number != null) {
                        map2.put(interfaceC1512760pT8.getFeature(), Float.valueOf(Math.max(number.floatValue(), ((Float) ListProtector.get(oPTs, 0)).floatValue())));
                    }
                }
            }
        });
        map.put("min", new InterfaceC1512420pSa() { // from class: X.0pT1
            @Override // X.InterfaceC1512420pSa
            public final void LIZ(C1512580pSq c1512580pSq) {
                HashMap<String, Object> map2 = c1512580pSq.LIZ;
                InterfaceC1512760pT8 interfaceC1512760pT8 = c1512580pSq.LIZLLL;
                List<String> args = interfaceC1512760pT8.getArgs();
                List<Float> oPTs = interfaceC1512760pT8.getOPTs();
                Iterator<String> it2 = args.iterator();
                while (it2.hasNext()) {
                    Number number = (Number) C1510930pQB.LIZ(it2.next(), map2);
                    if (number != null) {
                        map2.put(interfaceC1512760pT8.getFeature(), Float.valueOf(Math.min(number.floatValue(), ((Float) ListProtector.get(oPTs, 0)).floatValue())));
                    }
                }
            }
        });
        map.put("normalize", new InterfaceC1512420pSa() { // from class: X.0pT2
            @Override // X.InterfaceC1512420pSa
            public final void LIZ(C1512580pSq c1512580pSq) {
                HashMap<String, Object> map2 = c1512580pSq.LIZ;
                InterfaceC1512760pT8 interfaceC1512760pT8 = c1512580pSq.LIZLLL;
                List<String> args = interfaceC1512760pT8.getArgs();
                List<Float> oPTs = interfaceC1512760pT8.getOPTs();
                Iterator<String> it2 = args.iterator();
                while (it2.hasNext()) {
                    Number number = (Number) C1510930pQB.LIZ(it2.next(), map2);
                    if (number != null) {
                        float fFloatValue = number.floatValue();
                        float fFloatValue2 = ((Float) ListProtector.get(oPTs, 0)).floatValue();
                        float fFloatValue3 = ((Float) ListProtector.get(oPTs, 1)).floatValue();
                        map2.put(interfaceC1512760pT8.getFeature(), Float.valueOf((fFloatValue - fFloatValue3) / (fFloatValue2 - fFloatValue3)));
                    }
                }
            }
        });
        map.put("standardize", new InterfaceC1512420pSa() { // from class: X.0pT3
            @Override // X.InterfaceC1512420pSa
            public final void LIZ(C1512580pSq c1512580pSq) {
                HashMap<String, Object> map2 = c1512580pSq.LIZ;
                InterfaceC1512760pT8 interfaceC1512760pT8 = c1512580pSq.LIZLLL;
                List<String> args = interfaceC1512760pT8.getArgs();
                List<Float> oPTs = interfaceC1512760pT8.getOPTs();
                Iterator<String> it2 = args.iterator();
                while (it2.hasNext()) {
                    Number number = (Number) C1510930pQB.LIZ(it2.next(), map2);
                    if (number != null) {
                        float fFloatValue = number.floatValue();
                        float fFloatValue2 = ((Float) ListProtector.get(oPTs, 0)).floatValue();
                        map2.put(interfaceC1512760pT8.getFeature(), Float.valueOf((fFloatValue - fFloatValue2) / ((Float) ListProtector.get(oPTs, 1)).floatValue()));
                    }
                }
            }
        });
        map.put("predict_regression", new InterfaceC1512420pSa() { // from class: X.0pSt
            @Override // X.InterfaceC1512420pSa
            public final void LIZ(C1512580pSq c1512580pSq) {
                float[] fArr = c1512580pSq.LIZIZ;
                List<Float> oPTs = c1512580pSq.LJ.getOPTs();
                if (oPTs != null && oPTs.size() >= 2) {
                    float fFloatValue = ((Float) ListProtector.get(oPTs, 0)).floatValue();
                    fArr[0] = (fArr[0] * fFloatValue) + ((Float) ListProtector.get(oPTs, 1)).floatValue();
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PredictRegressionOP evaluate invalid! opts:");
                    sbLIZ.append(oPTs);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        });
        map.put("predict_bin", new InterfaceC1512420pSa() { // from class: X.0pSs
            @Override // X.InterfaceC1512420pSa
            public final void LIZ(C1512580pSq c1512580pSq) {
                float[] fArr = c1512580pSq.LIZIZ;
                InterfaceC1512630pSv interfaceC1512630pSv = c1512580pSq.LJ;
                List<String> list = c1512580pSq.LIZJ;
                List<Float> oPTs = interfaceC1512630pSv.getOPTs();
                List<String> labels = interfaceC1512630pSv.getLabels();
                if (fArr[0] > ((Float) ListProtector.get(oPTs, 0)).floatValue()) {
                    list.add((String) ListProtector.get(labels, 1));
                } else {
                    list.add((String) ListProtector.get(labels, 0));
                }
            }
        });
        map.put("onehotEncode", new InterfaceC1512420pSa() { // from class: X.0pSw
            @Override // X.InterfaceC1512420pSa
            public final void LIZ(C1512580pSq c1512580pSq) {
                String feature;
                String upperCase;
                float fFloatValue;
                int iIndexOf;
                float f;
                String upperCase2;
                String[] strArrSplit;
                HashMap<String, Object> map2 = c1512580pSq.LIZ;
                InterfaceC1512760pT8 interfaceC1512760pT8 = c1512580pSq.LIZLLL;
                List<String> labels = interfaceC1512760pT8.getLabels();
                List<String> args = interfaceC1512760pT8.getArgs();
                List<Float> oPTs = interfaceC1512760pT8.getOPTs();
                if (args != null) {
                    feature = (String) ListProtector.get(args, 0);
                } else {
                    feature = interfaceC1512760pT8.getFeature();
                }
                Object objLIZ = C1510930pQB.LIZ(feature, map2);
                if (objLIZ == null) {
                    upperCase = "";
                } else {
                    upperCase = objLIZ.toString().toUpperCase(Locale.getDefault());
                }
                if (oPTs != null) {
                    fFloatValue = ((Float) ListProtector.get(oPTs, 0)).floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                int i = (int) fFloatValue;
                int i2 = 0;
                loop0: while (true) {
                    if (i2 >= labels.size()) {
                        break;
                    }
                    if (ListProtector.get(labels, i2) == null) {
                        upperCase2 = "";
                    } else {
                        upperCase2 = ((String) ListProtector.get(labels, i2)).toUpperCase(Locale.getDefault());
                    }
                    if (TextUtils.equals(upperCase2, upperCase)) {
                        i = i2;
                        break;
                    }
                    if (upperCase2.contains("|") && (strArrSplit = upperCase2.split("\\|")) != null) {
                        for (String str : strArrSplit) {
                            if (TextUtils.equals(str, upperCase)) {
                                i = i2;
                                break loop0;
                            }
                        }
                    }
                    i2++;
                }
                List<String> list = c1512580pSq.LJFF;
                if (list != null && (iIndexOf = list.indexOf(feature)) >= 0) {
                    list.remove(feature);
                } else {
                    iIndexOf = -1;
                }
                for (int i3 = 0; i3 < labels.size(); i3++) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(feature);
                    sbLIZ.append("#");
                    sbLIZ.append(i3);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (i == i3) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    map2.put(strLIZIZ, Float.valueOf(f));
                    if (list != null && !list.contains(strLIZIZ)) {
                        if (iIndexOf >= 0) {
                            ListProtector.add(list, iIndexOf, strLIZIZ);
                            iIndexOf++;
                        } else {
                            list.add(strLIZIZ);
                        }
                    }
                }
            }
        });
        map.put("predict_multi", new InterfaceC1512420pSa() { // from class: X.0pSr
            @Override // X.InterfaceC1512420pSa
            public final void LIZ(C1512580pSq c1512580pSq) {
                float[] fArr = c1512580pSq.LIZIZ;
                InterfaceC1512630pSv interfaceC1512630pSv = c1512580pSq.LJ;
                List<String> list = c1512580pSq.LIZJ;
                List<String> labels = interfaceC1512630pSv.getLabels();
                int i = -1;
                float f = 0.0f;
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    float f2 = fArr[i2];
                    if (f <= f2) {
                        i = i2;
                        f = f2;
                    }
                }
                list.add((String) ListProtector.get(labels, i));
            }
        });
        map.put("embedding", new InterfaceC1512420pSa() { // from class: X.0pSz
            @Override // X.InterfaceC1512420pSa
            public final void LIZ(C1512580pSq c1512580pSq) {
                HashMap<String, Object> map2 = c1512580pSq.LIZ;
                InterfaceC1512760pT8 interfaceC1512760pT8 = c1512580pSq.LIZLLL;
                String feature = interfaceC1512760pT8.getFeature();
                int length = interfaceC1512760pT8.getLength();
                String type = interfaceC1512760pT8.getType();
                Float[] fArr = new Float[length];
                for (int i = 0; i < length; i++) {
                    fArr[i] = Float.valueOf(0.0f);
                }
                try {
                    String str = (String) C1510930pQB.LIZ("server_feature_embedding_map", map2);
                    if (!TextUtils.isEmpty(str)) {
                        String strOptString = new JSONObject(str).optString(feature);
                        if (!TextUtils.isEmpty(strOptString) && type != null && TextUtils.equals(type.toLowerCase(), "float16_hex")) {
                            C1512770pT9.LIZ(strOptString, fArr, length);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1512290pSN.LIZ("ml#evaluator", "embedding evaluate error: ", th);
                }
                map2.put(feature, fArr);
            }
        });
        map.put("embedding_vector", new InterfaceC1512420pSa() { // from class: X.0pSy
            @Override // X.InterfaceC1512420pSa
            public final void LIZ(C1512580pSq c1512580pSq) {
                HashMap<String, Object> map2 = c1512580pSq.LIZ;
                InterfaceC1512760pT8 interfaceC1512760pT8 = c1512580pSq.LIZLLL;
                String feature = interfaceC1512760pT8.getFeature();
                int length = interfaceC1512760pT8.getLength();
                String type = interfaceC1512760pT8.getType();
                Float[] fArr = new Float[length];
                for (int i = 0; i < length; i++) {
                    fArr[i] = Float.valueOf(0.0f);
                }
                try {
                    ArrayList arrayList = (ArrayList) C1510930pQB.LIZ("server_feature_embedding_vector", map2);
                    if (arrayList != null && !arrayList.isEmpty()) {
                        int vectorLength = interfaceC1512760pT8.getVectorLength();
                        int vectorNum = interfaceC1512760pT8.getVectorNum();
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < vectorNum && i2 < size; i2++) {
                            String str = (String) arrayList.get(i2);
                            if (!TextUtils.isEmpty(str)) {
                                String strOptString = new JSONObject(str).optString(feature);
                                if (!TextUtils.isEmpty(strOptString) && type != null && TextUtils.equals(type.toLowerCase(), "float16_hex")) {
                                    Float[] fArr2 = new Float[vectorLength];
                                    for (int i3 = 0; i3 < vectorLength; i3++) {
                                        fArr2[i3] = Float.valueOf(0.0f);
                                    }
                                    C1512770pT9.LIZ(strOptString, fArr2, vectorLength);
                                    for (int i4 = 0; i4 < vectorLength; i4++) {
                                        fArr[(i2 * vectorLength) + i4] = fArr2[i4];
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1512290pSN.LIZ("ml#evaluator", "embedding vector evaluate error: ", th);
                }
                if (C1512320pSQ.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("embedding vector feature: ");
                    sbLIZ.append(feature);
                    sbLIZ.append(" embedding: ");
                    sbLIZ.append(Arrays.toString(fArr));
                    sbLIZ.append(" len: ");
                    sbLIZ.append(length);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                map2.put(feature, fArr);
            }
        });
    }
}
