package X;

import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0kBa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1309680kBa {
    public final WeakReference<LynxBaseUI> LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final ReadableMap LJ;
    public final String LJFF;
    public final JavaOnlyMap LJI;
    public final JavaOnlyMap LJII;

    public final HashMap<String, Object> LIZ() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("exposure-id", this.LIZIZ);
        map.put("exposure-scene", this.LIZJ);
        map.put("dataset", this.LJ);
        map.put("unique-id", this.LJFF);
        map.put("extra-data", this.LJI);
        return map;
    }

    public final int hashCode() {
        LynxBaseUI lynxBaseUI = this.LIZ.get();
        if (lynxBaseUI != null) {
            return lynxBaseUI.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1309680kBa.class != obj.getClass()) {
            return false;
        }
        C1309680kBa c1309680kBa = (C1309680kBa) obj;
        if (this.LIZLLL == c1309680kBa.LIZLLL && this.LIZJ.equals(c1309680kBa.LIZJ) && this.LIZIZ.equals(c1309680kBa.LIZIZ) && this.LJFF.equals(c1309680kBa.LJFF)) {
            return true;
        }
        return false;
    }

    public C1309680kBa(LynxBaseUI lynxBaseUI, String str, JavaOnlyMap javaOnlyMap, JavaOnlyMap javaOnlyMap2) {
        JavaOnlyMap javaOnlyMap3;
        this.LIZ = new WeakReference<>(lynxBaseUI);
        String str2 = lynxBaseUI.mExposureID;
        if (str2 == null) {
            this.LIZIZ = "";
        } else {
            this.LIZIZ = str2;
        }
        String str3 = lynxBaseUI.mExposureScene;
        if (str3 == null) {
            this.LIZJ = "";
        } else {
            this.LIZJ = str3;
        }
        this.LIZLLL = lynxBaseUI.getSign();
        this.LJ = lynxBaseUI.getDataset();
        this.LJFF = str == null ? "" : str;
        if (javaOnlyMap != null) {
            javaOnlyMap3 = JavaOnlyMap.from(javaOnlyMap);
        } else {
            javaOnlyMap3 = new JavaOnlyMap();
        }
        this.LJI = javaOnlyMap3;
        this.LJII = javaOnlyMap2;
    }
}
