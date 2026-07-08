package X;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import com.bytedance.sdui.render.tasm.behavior.ui.utils.BackgroundDrawable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0kHn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313530kHn {
    public static final Map<EnumC1313790kID, Float> LJIIIZ;
    public final WeakReference<AbstractC1313520kHm> LIZIZ;
    public final WeakReference<View> LIZJ;
    public final C1314620kJY LIZ = new C1314620kJY();
    public final HashMap<String, Object> LIZLLL = new HashMap<>();
    public long LJ = -1;
    public C1313720kI6 LJFF = null;
    public ObjectAnimator[] LJI = null;
    public EnumC1313870kIL LJII = EnumC1313870kIL.IDLE;
    public C1313710kI5 LJIIIIZZ = null;

    static {
        HashMap map = new HashMap();
        LJIIIZ = map;
        EnumC1313790kID enumC1313790kID = EnumC1313790kID.TRANSLATE_X;
        Float fValueOf = Float.valueOf(0.0f);
        map.put(enumC1313790kID, fValueOf);
        map.put(EnumC1313790kID.TRANSLATE_Y, fValueOf);
        map.put(EnumC1313790kID.TRANSLATE_Z, fValueOf);
        map.put(EnumC1313790kID.ROTATE_X, fValueOf);
        map.put(EnumC1313790kID.ROTATE_Y, fValueOf);
        map.put(EnumC1313790kID.ROTATE_Z, fValueOf);
        EnumC1313790kID enumC1313790kID2 = EnumC1313790kID.SCALE_X;
        Float fValueOf2 = Float.valueOf(1.0f);
        map.put(enumC1313790kID2, fValueOf2);
        map.put(EnumC1313790kID.SCALE_Y, fValueOf2);
        map.put(EnumC1313790kID.OPACITY, fValueOf2);
        map.put(EnumC1313790kID.BG_COLOR, fValueOf);
    }

    public final void LIZLLL() {
        EnumC1313870kIL enumC1313870kIL = this.LJII;
        if (enumC1313870kIL == EnumC1313870kIL.RUNNING || enumC1313870kIL == EnumC1313870kIL.PAUSED) {
            ObjectAnimator[] objectAnimatorArr = this.LJI;
            if (objectAnimatorArr != null && objectAnimatorArr.length > 0) {
                for (ObjectAnimator objectAnimator : objectAnimatorArr) {
                    objectAnimator.cancel();
                }
            }
            this.LJI = null;
            this.LJII = EnumC1313870kIL.CANCELED;
        }
    }

    public final AbstractC1313520kHm LJFF() {
        return this.LIZIZ.get();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LJIIIIZZ() {
        C1313540kHo c1313540kHo;
        View view = this.LIZJ.get();
        AbstractC1313520kHm abstractC1313520kHmLJFF = LJFF();
        if (abstractC1313520kHmLJFF == null || view == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : this.LIZLLL.entrySet()) {
            String key = entry.getKey();
            key.getClass();
            switch (key.hashCode()) {
                case -1238332596:
                    if (key.equals("Transform") && (c1313540kHo = abstractC1313520kHmLJFF.LLLLLJIL) != null) {
                        c1313540kHo.LJ((List) entry.getValue());
                    }
                    break;
                case 63357246:
                    if (key.equals("Alpha")) {
                        C786410Ut5.T4(view, ((Float) entry.getValue()).floatValue());
                    }
                    break;
                case 65290051:
                    if (key.equals("Color")) {
                        LJ().setColor(((Integer) entry.getValue()).intValue());
                    }
                    break;
                case 290107061:
                    if (key.equals("BackgroundColor")) {
                        view.setBackgroundColor(((Integer) entry.getValue()).intValue());
                    }
                    break;
            }
        }
    }

    public final boolean LJIIJ() {
        AbstractC1313520kHm abstractC1313520kHm = this.LIZIZ.get();
        C1313720kI6 c1313720kI6 = this.LJFF;
        if (c1313720kI6 == null || !c1313720kI6.LJIIJ) {
            C1314240kIw c1314240kIw = LJFF().LLLIIIIL;
            if (c1314240kIw == null) {
                return false;
            }
            if (c1314240kIw.LIZIZ != 1 && c1314240kIw.LIZLLL != 1) {
                return false;
            }
        }
        return abstractC1313520kHm != null && (abstractC1313520kHm.LLLFF.equals(abstractC1313520kHm.LLLF) ^ true);
    }

    public final BackgroundDrawable LJ() {
        C1313540kHo c1313540kHo;
        AbstractC1313520kHm abstractC1313520kHmLJFF = LJFF();
        if (abstractC1313520kHmLJFF == null || (c1313540kHo = abstractC1313520kHmLJFF.LLLLLJIL) == null) {
            return null;
        }
        return c1313540kHo.LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1313710kI5 r19) {
        /*
            Method dump skipped, instruction units count: 2163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1313530kHn.LIZ(X.0kI5):void");
    }

    public final boolean LJI(C1313710kI5 c1313710kI5) {
        long j;
        if (this.LJ == -1) {
            return false;
        }
        int i = c1313710kI5.LLJIJIL;
        if (i >= 9.99999999E8d) {
            j = Long.MAX_VALUE;
        } else {
            j = (c1313710kI5.LLILLJJLI * ((long) (i + 1))) + c1313710kI5.LLILLL;
        }
        if (System.currentTimeMillis() - this.LJ < j) {
            return false;
        }
        return true;
    }

    public final void LJII(C1313710kI5 c1313710kI5) {
        boolean z;
        boolean z2 = true;
        if (c1313710kI5.LLJILLL == 0) {
            z = true;
        } else {
            z = false;
        }
        C1314420kJE.LIZ(z);
        if (this.LJII != EnumC1313870kIL.RUNNING) {
            z2 = false;
        }
        C1314420kJE.LIZ(z2);
        this.LJII = EnumC1313870kIL.PAUSED;
        ObjectAnimator[] objectAnimatorArr = this.LJI;
        if (objectAnimatorArr != null) {
            for (ObjectAnimator objectAnimator : objectAnimatorArr) {
                objectAnimator.pause();
            }
        }
        if (!LJI(c1313710kI5)) {
            C1314620kJY c1314620kJY = this.LIZ;
            if (c1314620kJY.LIZ == -1) {
                c1314620kJY.LIZ = System.currentTimeMillis();
            }
        }
        this.LJIIIIZZ = c1313710kI5;
    }

    public C1313530kHn(View view, AbstractC1313520kHm abstractC1313520kHm) {
        this.LIZIZ = new WeakReference<>(abstractC1313520kHm);
        this.LIZJ = new WeakReference<>(view);
    }

    public static PropertyValuesHolder LIZIZ(String str, ArrayList arrayList) {
        return PropertyValuesHolder.ofKeyframe(str, (Keyframe[]) arrayList.toArray(new Keyframe[arrayList.size()]));
    }

    public final void LJIIIZ(Object obj, String str) {
        if (!this.LIZLLL.containsKey(str)) {
            this.LIZLLL.put(str, obj);
        }
    }

    public static void LIZJ(float f, EnumC1313790kID enumC1313790kID, C1313720kI6 c1313720kI6) {
        if (f == 0.0f) {
            ((HashSet) c1313720kI6.LJIIL).add(enumC1313790kID);
        }
        if (f == 1.0f) {
            ((HashSet) c1313720kI6.LJIILIIL).add(enumC1313790kID);
        }
    }
}
