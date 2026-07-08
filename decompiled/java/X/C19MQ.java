package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: X.19MQ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19MQ {
    public final C21526919Ml LIZ;
    public C19MN LIZIZ;
    public C19MP LIZJ;
    public C19MP LJ;
    public MotionEvent LJIIJJI;
    public C21527519Mr LJIILJJIL;
    public boolean LJIILL;
    public float LJIILLIIL;
    public float LJIIZILJ;
    public final ArrayList<C19MP> LIZLLL = new ArrayList<>();
    public final ArrayList<C19MP> LJFF = new ArrayList<>();
    public final SparseArray<C19MB> LJI = new SparseArray<>();
    public final HashMap<String, Integer> LJII = new HashMap<>();
    public final SparseIntArray LJIIIIZZ = new SparseIntArray();
    public int LJIIIZ = 400;
    public int LJIIJ = 0;
    public boolean LJIIL = false;
    public boolean LJIILIIL = false;

    public final Interpolator LIZLLL() {
        C19MP c19mp = this.LIZJ;
        int i = c19mp.LJ;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.LIZ.getContext(), this.LIZJ.LJI);
        }
        if (i == -1) {
            final C19NB c19nbLIZJ = C19NB.LIZJ(c19mp.LJFF);
            return new Interpolator() { // from class: X.19MS
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f) {
                    return (float) c19nbLIZJ.LIZ(f);
                }
            };
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new AnticipateInterpolator();
        }
        if (i != 5) {
            return null;
        }
        return new BounceInterpolator();
    }

    public final float LJFF() {
        C19MT c19mt;
        C19MP c19mp = this.LIZJ;
        if (c19mp == null || (c19mt = c19mp.LJIIJJI) == null) {
            return 0.0f;
        }
        return c19mt.LJIILLIIL;
    }

    public final int LJI() {
        C19MP c19mp = this.LIZJ;
        if (c19mp == null) {
            return -1;
        }
        return c19mp.LIZLLL;
    }

    public final boolean LJIIL() {
        Iterator<C19MP> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJIIJJI != null) {
                return true;
            }
        }
        C19MP c19mp = this.LIZJ;
        return (c19mp == null || c19mp.LJIIJJI == null) ? false : true;
    }

    public final C19MB LIZIZ(int i) {
        int iLIZ;
        C19MN c19mn = this.LIZIZ;
        if (c19mn != null && (iLIZ = c19mn.LIZ(i)) != -1) {
            i = iLIZ;
        }
        if (this.LJI.get(i) == null) {
            SparseArray<C19MB> sparseArray = this.LJI;
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return this.LJI.get(i);
    }

    public final void LJ(C21528019Mw c21528019Mw) {
        C19MP c19mp = this.LIZJ;
        if (c19mp == null) {
            C19MP c19mp2 = this.LJ;
            if (c19mp2 != null) {
                Iterator<C19MU> it2 = c19mp2.LJIIJ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(c21528019Mw);
                }
                return;
            }
            return;
        }
        Iterator<C19MU> it3 = c19mp.LJIIJ.iterator();
        while (it3.hasNext()) {
            it3.next().LIZ(c21528019Mw);
        }
    }

    public final void LJIIIZ(int i) {
        int i2 = this.LJIIIIZZ.get(i);
        if (i2 > 0) {
            LJIIIZ(this.LJIIIIZZ.get(i));
            C19MB c19mb = this.LJI.get(i);
            C19MB c19mb2 = this.LJI.get(i2);
            if (c19mb2 == null) {
                return;
            }
            c19mb.getClass();
            for (Integer num : c19mb2.LIZJ.keySet()) {
                int iIntValue = num.intValue();
                C19MA c19ma = c19mb2.LIZJ.get(num);
                if (!c19mb.LIZJ.containsKey(Integer.valueOf(iIntValue))) {
                    c19mb.LIZJ.put(Integer.valueOf(iIntValue), new C19MA());
                }
                C19MA c19ma2 = c19mb.LIZJ.get(Integer.valueOf(iIntValue));
                C19M2 c19m2 = c19ma2.LIZLLL;
                if (!c19m2.LIZIZ) {
                    c19m2.LIZ(c19ma.LIZLLL);
                }
                C19M9 c19m9 = c19ma2.LIZIZ;
                if (!c19m9.LIZ) {
                    C19M9 c19m92 = c19ma.LIZIZ;
                    c19m9.LIZ = c19m92.LIZ;
                    c19m9.LIZIZ = c19m92.LIZIZ;
                    c19m9.LIZLLL = c19m92.LIZLLL;
                    c19m9.LJ = c19m92.LJ;
                    c19m9.LIZJ = c19m92.LIZJ;
                }
                C19M7 c19m7 = c19ma2.LJ;
                if (!c19m7.LIZ) {
                    c19m7.LIZ(c19ma.LJ);
                }
                C19MC c19mc = c19ma2.LIZJ;
                if (!c19mc.LIZ) {
                    c19mc.LIZ(c19ma.LIZJ);
                }
                for (String str : c19ma.LJFF.keySet()) {
                    if (!c19ma2.LJFF.containsKey(str)) {
                        c19ma2.LJFF.put(str, c19ma.LJFF.get(str));
                    }
                }
            }
            this.LJIIIIZZ.put(i, -1);
        }
    }

    public final void LJIIJ(C21526919Ml c21526919Ml) {
        for (int i = 0; i < this.LJI.size(); i++) {
            int iKeyAt = this.LJI.keyAt(i);
            int i2 = this.LJIIIIZZ.get(iKeyAt);
            int size = this.LJIIIIZZ.size();
            while (i2 > 0) {
                if (i2 != iKeyAt) {
                    int i3 = size - 1;
                    if (size >= 0) {
                        i2 = this.LJIIIIZZ.get(i2);
                        size = i3;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            LJIIIZ(iKeyAt);
        }
        for (int i4 = 0; i4 < this.LJI.size(); i4++) {
            C19MB c19mbValueAt = this.LJI.valueAt(i4);
            c19mbValueAt.getClass();
            int childCount = c21526919Ml.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = c21526919Ml.getChildAt(i5);
                C19ME c19me = (C19ME) childAt.getLayoutParams();
                int id = childAt.getId();
                if (c19mbValueAt.LIZIZ && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!c19mbValueAt.LIZJ.containsKey(Integer.valueOf(id))) {
                    c19mbValueAt.LIZJ.put(Integer.valueOf(id), new C19MA());
                }
                C19MA c19ma = c19mbValueAt.LIZJ.get(Integer.valueOf(id));
                if (!c19ma.LIZLLL.LIZIZ) {
                    c19ma.LIZIZ(id, c19me);
                    if (childAt instanceof C19MX) {
                        c19ma.LIZLLL.LJJJZ = ((C19MX) childAt).getReferencedIds();
                        if (childAt instanceof C19MW) {
                            C19MW c19mw = (C19MW) childAt;
                            c19ma.LIZLLL.LJJLIIIJILLIZJL = c19mw.allowsGoneWidget();
                            c19ma.LIZLLL.LJJJLIIL = c19mw.getType();
                            c19ma.LIZLLL.LJJJLL = c19mw.getMargin();
                        }
                    }
                    c19ma.LIZLLL.LIZIZ = true;
                }
                C19M9 c19m9 = c19ma.LIZIZ;
                if (!c19m9.LIZ) {
                    c19m9.LIZIZ = childAt.getVisibility();
                    c19ma.LIZIZ.LIZLLL = childAt.getAlpha();
                    c19ma.LIZIZ.LIZ = true;
                }
                C19M7 c19m7 = c19ma.LJ;
                if (!c19m7.LIZ) {
                    c19m7.LIZ = true;
                    c19m7.LIZIZ = childAt.getRotation();
                    c19ma.LJ.LIZJ = childAt.getRotationX();
                    c19ma.LJ.LIZLLL = childAt.getRotationY();
                    c19ma.LJ.LJ = childAt.getScaleX();
                    c19ma.LJ.LJFF = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        C19M7 c19m72 = c19ma.LJ;
                        c19m72.LJI = pivotX;
                        c19m72.LJII = pivotY;
                    }
                    c19ma.LJ.LJIIIIZZ = childAt.getTranslationX();
                    c19ma.LJ.LJIIIZ = childAt.getTranslationY();
                    c19ma.LJ.LJIIJ = childAt.getTranslationZ();
                    C19M7 c19m73 = c19ma.LJ;
                    if (c19m73.LJIIJJI) {
                        c19m73.LJIIL = childAt.getElevation();
                    }
                }
            }
        }
    }

    public static final int LIZJ(Context context, String str) {
        int iN3;
        if (str.contains("/")) {
            iN3 = C786410Ut5.n3(context.getResources(), str.substring(str.indexOf(47) + 1), FollowStatusChangeMethod.PARAM_UID, context.getPackageName());
            if (iN3 != -1) {
                return iN3;
            }
        } else {
            iN3 = -1;
        }
        if (str.length() > 1) {
            return CastIntegerProtector.parseInt(str.substring(1));
        }
        return iN3;
    }

    public final boolean LIZ(C21526919Ml c21526919Ml, int i) {
        if (this.LJIILJJIL != null) {
            return false;
        }
        for (C19MP c19mp : this.LIZLLL) {
            int i2 = c19mp.LJIILIIL;
            if (i2 != 0 && this.LIZJ != c19mp) {
                if (i == c19mp.LIZLLL && (i2 == 4 || i2 == 2)) {
                    EnumC21526419Mg enumC21526419Mg = EnumC21526419Mg.FINISHED;
                    c21526919Ml.setState(enumC21526419Mg);
                    c21526919Ml.setTransition(c19mp);
                    if (c19mp.LJIILIIL == 4) {
                        c21526919Ml.e0(1.0f);
                        c21526919Ml.setState(EnumC21526419Mg.SETUP);
                        c21526919Ml.setState(EnumC21526419Mg.MOVING);
                        return true;
                    }
                    c21526919Ml.setProgress(1.0f);
                    c21526919Ml.h0(true);
                    c21526919Ml.setState(EnumC21526419Mg.SETUP);
                    c21526919Ml.setState(EnumC21526419Mg.MOVING);
                    c21526919Ml.setState(enumC21526419Mg);
                    c21526919Ml.s0();
                    return true;
                }
                if (i == c19mp.LIZJ && (i2 == 3 || i2 == 1)) {
                    EnumC21526419Mg enumC21526419Mg2 = EnumC21526419Mg.FINISHED;
                    c21526919Ml.setState(enumC21526419Mg2);
                    c21526919Ml.setTransition(c19mp);
                    if (c19mp.LJIILIIL == 3) {
                        c21526919Ml.e0(0.0f);
                        c21526919Ml.setState(EnumC21526419Mg.SETUP);
                        c21526919Ml.setState(EnumC21526419Mg.MOVING);
                        return true;
                    }
                    c21526919Ml.setProgress(0.0f);
                    c21526919Ml.h0(true);
                    c21526919Ml.setState(EnumC21526419Mg.SETUP);
                    c21526919Ml.setState(EnumC21526419Mg.MOVING);
                    c21526919Ml.setState(enumC21526419Mg2);
                    c21526919Ml.s0();
                    return true;
                }
            }
        }
        return false;
    }

    public final void LJII(Context context, XmlPullParser xmlPullParser) {
        C19MB c19mb = new C19MB();
        c19mb.LIZIZ = false;
        int attributeCount = xmlPullParser.getAttributeCount();
        int iLIZJ = -1;
        int iLIZJ2 = -1;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            if (!attributeName.equals("deriveConstraintsFrom")) {
                if (attributeName.equals(FollowStatusChangeMethod.PARAM_UID)) {
                    iLIZJ = LIZJ(context, attributeValue);
                    HashMap<String, Integer> map = this.LJII;
                    int iIndexOf = attributeValue.indexOf(47);
                    if (iIndexOf >= 0) {
                        attributeValue = attributeValue.substring(iIndexOf + 1);
                    }
                    map.put(attributeValue, Integer.valueOf(iLIZJ));
                }
            } else {
                iLIZJ2 = LIZJ(context, attributeValue);
            }
        }
        if (iLIZJ != -1) {
            c19mb.LJIJJLI(context, xmlPullParser);
            if (iLIZJ2 != -1) {
                this.LJIIIIZZ.put(iLIZJ, iLIZJ2);
            }
            this.LJI.put(iLIZJ, c19mb);
        }
    }

    public final void LJIIIIZZ(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R$styleable.MotionScene);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.MotionScene_defaultDuration) {
                this.LJIIIZ = typedArrayObtainStyledAttributes.getInt(index, this.LJIIIZ);
            } else if (index == R$styleable.MotionScene_layoutDuringTransition) {
                this.LJIIJ = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(int r8, int r9) {
        /*
            r7 = this;
            X.19MN r0 = r7.LIZIZ
            r6 = -1
            if (r0 == 0) goto L40
            int r5 = r0.LIZ(r8)
            if (r5 != r6) goto Lc
            r5 = r8
        Lc:
            X.19MN r0 = r7.LIZIZ
            int r4 = r0.LIZ(r9)
            if (r4 == r6) goto L41
        L14:
            java.util.ArrayList<X.19MP> r0 = r7.LIZLLL
            java.util.Iterator r3 = r0.iterator()
        L1a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r2 = r3.next()
            X.19MP r2 = (X.C19MP) r2
            int r1 = r2.LIZJ
            if (r1 != r4) goto L2e
            int r0 = r2.LIZLLL
            if (r0 == r5) goto L34
        L2e:
            if (r1 != r9) goto L1a
            int r0 = r2.LIZLLL
            if (r0 != r8) goto L1a
        L34:
            r7.LIZJ = r2
            X.19MT r1 = r2.LJIIJJI
            if (r1 == 0) goto L3f
            boolean r0 = r7.LJIILL
            r1.LIZIZ(r0)
        L3f:
            return
        L40:
            r5 = r8
        L41:
            r4 = r9
            goto L14
        L43:
            X.19MP r3 = r7.LJ
            java.util.ArrayList<X.19MP> r0 = r7.LJFF
            java.util.Iterator r2 = r0.iterator()
        L4b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r1 = r2.next()
            X.19MP r1 = (X.C19MP) r1
            int r0 = r1.LIZJ
            if (r0 != r9) goto L4b
            r3 = r1
            goto L4b
        L5d:
            X.19MP r1 = new X.19MP
            r1.<init>(r7, r3)
            r1.LIZLLL = r5
            r1.LIZJ = r4
            if (r5 == r6) goto L6d
            java.util.ArrayList<X.19MP> r0 = r7.LIZLLL
            r0.add(r1)
        L6d:
            r7.LIZJ = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19MQ.LJIIJJI(int, int):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C19MQ(Context context, C21526919Ml c21526919Ml, int i) {
        int eventType;
        C19MP c19mp = null;
        this.LJ = null;
        this.LIZ = c21526919Ml;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (XmlPullParserException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        for (eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
            if (eventType != 0) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                LJII(context, xml);
                            } else {
                                continue;
                            }
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c19mp.LJIIJ.add(new C19MU(context, xml));
                            } else {
                                continue;
                            }
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                ArrayList<C19MP> arrayList = this.LIZLLL;
                                c19mp = new C19MP(this, context, xml);
                                arrayList.add(c19mp);
                                if (this.LIZJ == null && !c19mp.LIZIZ) {
                                    this.LIZJ = c19mp;
                                    C19MT c19mt = c19mp.LJIIJJI;
                                    if (c19mt != null) {
                                        c19mt.LIZIZ(this.LJIILL);
                                    }
                                }
                                if (c19mp.LIZIZ) {
                                    if (c19mp.LIZJ == -1) {
                                        this.LJ = c19mp;
                                    } else {
                                        this.LJFF.add(c19mp);
                                    }
                                    this.LIZLLL.remove(c19mp);
                                }
                            } else {
                                continue;
                            }
                            break;
                        case 312750793:
                            if (name.equals("OnClick")) {
                                c19mp.LJIIL.add(new C19MR(context, c19mp, xml));
                            } else {
                                continue;
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (c19mp == null) {
                                    context.getResources().getResourceEntryName(i);
                                    xml.getLineNumber();
                                }
                                c19mp.LJIIJJI = new C19MT(context, this.LIZ, xml);
                            } else {
                                continue;
                            }
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                LJIIIIZZ(context, xml);
                            } else {
                                continue;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.LIZIZ = new C19MN(context, xml);
                            } else {
                                continue;
                            }
                            break;
                        default:
                            continue;
                    }
                    TryCatchGuardChecker.doCheck(e);
                    this.LJI.put(R.id.om0, new C19MB());
                    this.LJII.put("motion_base", Integer.valueOf(R.id.om0));
                }
                continue;
            } else {
                xml.getName();
            }
        }
        this.LJI.put(R.id.om0, new C19MB());
        this.LJII.put("motion_base", Integer.valueOf(R.id.om0));
    }
}
