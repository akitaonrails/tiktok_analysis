package X;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.19J5, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C19J5 {
    public final Context LIZ;
    public final String LIZIZ;
    public final Map<Float, String> LIZJ;
    public final C19JE LIZLLL;
    public final C19JH LJI;
    public final List<PropertyValuesHolder> LJFF = new ArrayList();
    public final List<Keyframe> LJ = new ArrayList();

    public abstract TypeEvaluator LIZIZ();

    public abstract void LIZJ();

    public abstract void LIZLLL(float f, String str);

    public final void LIZ() {
        Map<Float, String> map = this.LIZJ;
        if (map == null || map.size() <= 0) {
            return;
        }
        Map<Float, String> map2 = this.LIZJ;
        if (map2 == null || map2.size() <= 0 || !this.LIZJ.containsKey(Float.valueOf(0.0f))) {
            LIZJ();
        }
        for (Map.Entry<Float, String> entry : this.LIZJ.entrySet()) {
            if (entry != null) {
                LIZLLL(entry.getKey().floatValue() / 100.0f, entry.getValue());
            }
        }
        Map<Float, String> map3 = this.LIZJ;
        if (map3 == null || map3.size() <= 0) {
            return;
        }
        Map<Float, String> map4 = this.LIZJ;
        if (map4 instanceof TreeMap) {
            float fFloatValue = ((Float) ((TreeMap) map4).lastKey()).floatValue();
            if (fFloatValue != 100.0f) {
                LIZLLL(100.0f, this.LIZJ.get(Float.valueOf(fFloatValue)));
            }
        }
    }

    public List<PropertyValuesHolder> LJ() {
        String strPropertyValue = this.LIZLLL.propertyValue();
        LIZ();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strPropertyValue, (Keyframe[]) ((ArrayList) this.LJ).toArray(new Keyframe[0]));
        TypeEvaluator typeEvaluatorLIZIZ = LIZIZ();
        if (typeEvaluatorLIZIZ != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorLIZIZ);
        }
        ((ArrayList) this.LJFF).add(propertyValuesHolderOfKeyframe);
        return this.LJFF;
    }

    public C19J5(Context context, C19JH c19jh, String str, Map<Float, String> map) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = map;
        this.LIZLLL = C19JE.fromName(str);
        this.LJI = c19jh;
    }
}
