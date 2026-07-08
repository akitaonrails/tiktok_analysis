package X;

import Y.AComparatorS39S0000000_20;
import Y.AUListenerS269S0100000_20;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0kHT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313330kHT {
    public WeakReference<LynxUI> LIZIZ;
    public WeakReference<View> LIZJ;
    public final C1314630kJZ LIZ = new C1314630kJZ();
    public final HashMap<String, Object> LIZLLL = new HashMap<>();
    public long LJ = -1;
    public C1313420kHc LJFF = null;
    public ObjectAnimator[] LJI = null;
    public EnumC1313880kIM LJII = EnumC1313880kIM.IDLE;
    public C1313370kHX LJIIIIZZ = null;

    public final void LJ() {
        EnumC1313880kIM enumC1313880kIM = this.LJII;
        if (enumC1313880kIM == EnumC1313880kIM.RUNNING || enumC1313880kIM == EnumC1313880kIM.PAUSED) {
            ObjectAnimator[] objectAnimatorArr = this.LJI;
            if (objectAnimatorArr != null && objectAnimatorArr.length > 0) {
                for (ObjectAnimator objectAnimator : objectAnimatorArr) {
                    objectAnimator.cancel();
                }
            }
            this.LJI = null;
            this.LJII = EnumC1313880kIM.CANCELED;
        }
    }

    public final void LJFF() {
        EnumC1313880kIM enumC1313880kIM = this.LJII;
        if (enumC1313880kIM == EnumC1313880kIM.CANCELED || enumC1313880kIM == EnumC1313880kIM.RUNNING || enumC1313880kIM == EnumC1313880kIM.PAUSED) {
            LynxUI lynxUILJII = LJII();
            C1313370kHX c1313370kHX = this.LJIIIIZZ;
            C1313290kHP.LIZ(lynxUILJII, "animationcancel", c1313370kHX != null ? c1313370kHX.LL : "");
        }
        LJ();
        LJIIJ();
        this.LJII = EnumC1313880kIM.DESTROYED;
    }

    public final LynxUI LJII() {
        return this.LIZIZ.get();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LJIIJ() {
        C1313200kHG c1313200kHG;
        View view = this.LIZJ.get();
        LynxUI lynxUILJII = LJII();
        if (lynxUILJII == null || view == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : this.LIZLLL.entrySet()) {
            String key = entry.getKey();
            key.getClass();
            switch (key.hashCode()) {
                case -1238332596:
                    if (key.equals("Transform") && (c1313200kHG = lynxUILJII.mBackgroundManager) != null) {
                        c1313200kHG.LJIJI((List) entry.getValue());
                    }
                    break;
                case 63357246:
                    if (key.equals("Alpha")) {
                        C786410Ut5.T4(view, ((Float) entry.getValue()).floatValue());
                    }
                    break;
                case 65290051:
                    if (key.equals("Color")) {
                        LJI().setColor(((Integer) entry.getValue()).intValue());
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

    public final boolean LJIIL() {
        LynxUI lynxUI = this.LIZIZ.get();
        C1313420kHc c1313420kHc = this.LJFF;
        if (c1313420kHc == null || !c1313420kHc.LJIIJ) {
            C1314250kIx c1314250kIx = LJII().mTransformOrigin;
            if (c1314250kIx == null) {
                return false;
            }
            if (c1314250kIx.LIZIZ != 1 && c1314250kIx.LIZLLL != 1) {
                return false;
            }
        }
        return lynxUI != null && lynxUI.hasSizeChanged();
    }

    public final BackgroundDrawable LJI() {
        C1313200kHG c1313200kHG;
        LynxUI lynxUILJII = LJII();
        if (lynxUILJII == null || (c1313200kHG = lynxUILJII.mBackgroundManager) == null) {
            return null;
        }
        return (BackgroundDrawable) c1313200kHG.LIZIZ;
    }

    public final void LIZ(C1313370kHX c1313370kHX) {
        boolean z;
        boolean z2;
        C1313370kHX c1313370kHX2 = this.LJIIIIZZ;
        boolean z3 = true;
        if (c1313370kHX2 != null && !c1313370kHX.LL.equals(c1313370kHX2.LL)) {
            z = false;
        } else {
            z = true;
        }
        LynxLog.DCHECK(z);
        if (LJII() == null) {
            return;
        }
        int i = C1314030kIb.LIZ[this.LJII.ordinal()];
        long jCurrentTimeMillis = 0;
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                return;
            }
            C1313370kHX c1313370kHX3 = this.LJIIIIZZ;
            if (c1313370kHX3 != null && c1313370kHX.LIZ(c1313370kHX3) && c1313370kHX.LLJILLL == c1313370kHX3.LLJILLL && !LJIIL()) {
                return;
            }
            C1313370kHX c1313370kHX4 = this.LJIIIIZZ;
            if (c1313370kHX.LIZ(c1313370kHX4) && c1313370kHX.LLJILLL != c1313370kHX4.LLJILLL) {
                EnumC1313880kIM enumC1313880kIM = this.LJII;
                EnumC1313880kIM enumC1313880kIM2 = EnumC1313880kIM.PAUSED;
                if (enumC1313880kIM == enumC1313880kIM2) {
                    if (c1313370kHX.LLJILLL == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    LynxLog.DCHECK(z2);
                    if (this.LJII != enumC1313880kIM2) {
                        z3 = false;
                    }
                    LynxLog.DCHECK(z3);
                    this.LJII = EnumC1313880kIM.RUNNING;
                    ObjectAnimator[] objectAnimatorArr = this.LJI;
                    if (objectAnimatorArr != null) {
                        for (ObjectAnimator objectAnimator : objectAnimatorArr) {
                            objectAnimator.resume();
                        }
                    }
                    long j = this.LJ;
                    C1314630kJZ c1314630kJZ = this.LIZ;
                    if (c1314630kJZ.LIZ != -1) {
                        jCurrentTimeMillis = System.currentTimeMillis() - c1314630kJZ.LIZ;
                        c1314630kJZ.LIZ = -1L;
                    }
                    this.LJ = j + jCurrentTimeMillis;
                    this.LJIIIIZZ = c1313370kHX;
                    return;
                }
                LJIIIZ(c1313370kHX);
                return;
            }
            LJ();
            LIZ(c1313370kHX);
            return;
        }
        C1313370kHX c1313370kHX5 = this.LJIIIIZZ;
        if ((c1313370kHX5 != null && c1313370kHX.LIZ(c1313370kHX5) && c1313370kHX.LLJILLL == c1313370kHX5.LLJILLL && this.LJII == EnumC1313880kIM.IDLE && !LJIIL()) || c1313370kHX.LLJIJIL < 0 || c1313370kHX.LLILLJJLI <= 0) {
            return;
        }
        LIZIZ(c1313370kHX);
    }

    public final void LIZIZ(C1313370kHX c1313370kHX) {
        boolean z;
        int i;
        PropertyValuesHolder[] propertyValuesHolderArr;
        PropertyValuesHolder propertyValuesHolderLIZJ;
        int i2;
        PropertyValuesHolder[] propertyValuesHolderArr2;
        boolean z2;
        int length;
        Object obj;
        int i3;
        long jCurrentTimeMillis;
        EnumC1313880kIM enumC1313880kIM = this.LJII;
        int i4 = 1;
        if (enumC1313880kIM != EnumC1313880kIM.IDLE && enumC1313880kIM != EnumC1313880kIM.CANCELED) {
            z = false;
        } else {
            z = true;
        }
        LynxLog.DCHECK(z);
        View view = this.LIZJ.get();
        LynxUI lynxUILJII = LJII();
        if (view != null && lynxUILJII != null && c1313370kHX != null) {
            int i5 = 3;
            if (this.LJFF == null || LJIIL()) {
                ReadableMap keyframes = lynxUILJII.getKeyframes(c1313370kHX.LL);
                if (keyframes != null) {
                    C1313420kHc c1313420kHc = new C1313420kHc();
                    ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = keyframes.keySetIterator();
                    while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                        String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                        float f = CastFloatProtector.parseFloat(strNextKey);
                        int i6 = c1313370kHX.LLJILJILJ;
                        if (i6 == i4 || i6 == i5) {
                            f = 1.0f - f;
                        }
                        ReadableMap map = keyframes.getMap(strNextKey);
                        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator2 = map.keySetIterator();
                        while (readableMapKeySetIteratorKeySetIterator2.hasNextKey()) {
                            String strNextKey2 = readableMapKeySetIteratorKeySetIterator2.nextKey();
                            if (strNextKey2.equals("opacity")) {
                                LJIIJJI(Float.valueOf(this.LIZJ.get().getAlpha()), "Alpha");
                                LIZLLL(f, EnumC1313800kIE.OPACITY, c1313420kHc);
                                float f2 = (float) map.getDouble(strNextKey2);
                                if (f2 >= 0.0f && f2 <= 1.0f) {
                                    c1313420kHc.LIZ.add(Keyframe.ofFloat(f, f2));
                                    i4 = 1;
                                    i5 = 3;
                                }
                            } else {
                                if (strNextKey2.equals("transform")) {
                                    LJIIJJI(lynxUILJII.mTransformRaw, "Transform");
                                    List<C1313280kHO> listLIZLLL = C1313280kHO.LIZLLL(map.getArray(strNextKey2));
                                    lynxUILJII.mContext.LLJILJILJ.getLatestWidth();
                                    lynxUILJII.mContext.LLJILJILJ.getLatestHeight();
                                    C1313230kHJ c1313230kHJLJIIL = C1313230kHJ.LJIIL(listLIZLLL, lynxUILJII.getLatestWidth(), lynxUILJII.getLatestHeight());
                                    if (c1313230kHJLJIIL != null) {
                                        if (C1313280kHO.LIZ(listLIZLLL)) {
                                            c1313420kHc.LJIIJ = true;
                                        }
                                        LIZLLL(f, EnumC1313800kIE.TRANSLATE_X, c1313420kHc);
                                        c1313420kHc.LIZIZ.add(Keyframe.ofFloat(f, c1313230kHJLJIIL.LJIIIZ()));
                                        LIZLLL(f, EnumC1313800kIE.TRANSLATE_Y, c1313420kHc);
                                        c1313420kHc.LIZJ.add(Keyframe.ofFloat(f, c1313230kHJLJIIL.LJIIJ()));
                                        lynxUILJII.mView.setOutlineProvider(null);
                                        LIZLLL(f, EnumC1313800kIE.TRANSLATE_Z, c1313420kHc);
                                        c1313420kHc.LIZLLL.add(Keyframe.ofFloat(f, c1313230kHJLJIIL.LJIIJJI()));
                                        LIZLLL(f, EnumC1313800kIE.ROTATE_Z, c1313420kHc);
                                        c1313420kHc.LJ.add(Keyframe.ofFloat(f, c1313230kHJLJIIL.LIZJ()));
                                        LIZLLL(f, EnumC1313800kIE.ROTATE_X, c1313420kHc);
                                        c1313420kHc.LJFF.add(Keyframe.ofFloat(f, c1313230kHJLJIIL.LIZLLL()));
                                        LIZLLL(f, EnumC1313800kIE.ROTATE_Y, c1313420kHc);
                                        c1313420kHc.LJI.add(Keyframe.ofFloat(f, c1313230kHJLJIIL.LJ()));
                                        LIZLLL(f, EnumC1313800kIE.SCALE_X, c1313420kHc);
                                        c1313420kHc.LJII.add(Keyframe.ofFloat(f, c1313230kHJLJIIL.LJFF()));
                                        LIZLLL(f, EnumC1313800kIE.SCALE_Y, c1313420kHc);
                                        c1313420kHc.LJIIIIZZ.add(Keyframe.ofFloat(f, c1313230kHJLJIIL.LJI()));
                                    }
                                } else if (strNextKey2.equals("background-color")) {
                                    if (LJI() == null) {
                                        LJIIJJI(Integer.valueOf(lynxUILJII.getBackgroundColor()), "BackgroundColor");
                                    } else {
                                        LJIIJJI(Integer.valueOf(lynxUILJII.getBackgroundColor()), "Color");
                                    }
                                    LIZLLL(f, EnumC1313800kIE.BG_COLOR, c1313420kHc);
                                    c1313420kHc.LJIIIZ.add(Keyframe.ofInt(f, map.getInt(strNextKey2)));
                                }
                                i4 = 1;
                                i5 = 3;
                            }
                        }
                    }
                    if (LJI() != null) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    int i7 = 0;
                    do {
                        View view2 = this.LIZJ.get();
                        LynxUI lynxUILJII2 = LJII();
                        if (view2 != null && lynxUILJII2 != null) {
                            ArrayList arrayList = new ArrayList();
                            AComparatorS39S0000000_20 aComparatorS39S0000000_20 = new AComparatorS39S0000000_20(10);
                            if (c1313420kHc.LIZ.size() != 0 && i7 == 0) {
                                Set<EnumC1313800kIE> set = c1313420kHc.LJIIJJI;
                                EnumC1313800kIE enumC1313800kIE = EnumC1313800kIE.OPACITY;
                                if (!((HashSet) set).contains(enumC1313800kIE)) {
                                    c1313420kHc.LIZ.add(Keyframe.ofFloat(0.0f, view2.getAlpha()));
                                }
                                if (!((HashSet) c1313420kHc.LJIIL).contains(enumC1313800kIE)) {
                                    c1313420kHc.LIZ.add(Keyframe.ofFloat(1.0f, view2.getAlpha()));
                                }
                                Collections.sort(c1313420kHc.LIZ, aComparatorS39S0000000_20);
                                arrayList.add(LIZJ("Alpha", c1313420kHc.LIZ));
                            }
                            if (c1313420kHc.LIZIZ.size() != 0 && i7 == 0) {
                                Set<EnumC1313800kIE> set2 = c1313420kHc.LJIIJJI;
                                EnumC1313800kIE enumC1313800kIE2 = EnumC1313800kIE.TRANSLATE_X;
                                if (!((HashSet) set2).contains(enumC1313800kIE2)) {
                                    c1313420kHc.LIZIZ.add(Keyframe.ofFloat(0.0f, view2.getTranslationX()));
                                }
                                if (!((HashSet) c1313420kHc.LJIIL).contains(enumC1313800kIE2)) {
                                    c1313420kHc.LIZIZ.add(Keyframe.ofFloat(1.0f, view2.getTranslationX()));
                                }
                                Collections.sort(c1313420kHc.LIZIZ, aComparatorS39S0000000_20);
                                arrayList.add(LIZJ("TranslationX", c1313420kHc.LIZIZ));
                            }
                            if (c1313420kHc.LIZJ.size() != 0 && i7 == 0) {
                                Set<EnumC1313800kIE> set3 = c1313420kHc.LJIIJJI;
                                EnumC1313800kIE enumC1313800kIE3 = EnumC1313800kIE.TRANSLATE_Y;
                                if (!((HashSet) set3).contains(enumC1313800kIE3)) {
                                    c1313420kHc.LIZJ.add(Keyframe.ofFloat(0.0f, view2.getTranslationY()));
                                }
                                if (!((HashSet) c1313420kHc.LJIIL).contains(enumC1313800kIE3)) {
                                    c1313420kHc.LIZJ.add(Keyframe.ofFloat(1.0f, view2.getTranslationY()));
                                }
                                Collections.sort(c1313420kHc.LIZJ, aComparatorS39S0000000_20);
                                arrayList.add(LIZJ("TranslationY", c1313420kHc.LIZJ));
                            }
                            if (c1313420kHc.LIZLLL.size() != 0 && i7 == 0) {
                                float translationZ = view2.getTranslationZ();
                                Set<EnumC1313800kIE> set4 = c1313420kHc.LJIIJJI;
                                EnumC1313800kIE enumC1313800kIE4 = EnumC1313800kIE.TRANSLATE_Z;
                                if (!((HashSet) set4).contains(enumC1313800kIE4)) {
                                    c1313420kHc.LIZLLL.add(Keyframe.ofFloat(0.0f, translationZ));
                                }
                                if (!((HashSet) c1313420kHc.LJIIL).contains(enumC1313800kIE4)) {
                                    c1313420kHc.LIZLLL.add(Keyframe.ofFloat(1.0f, translationZ));
                                }
                                Collections.sort(c1313420kHc.LIZLLL, aComparatorS39S0000000_20);
                                arrayList.add(LIZJ("TranslationZ", c1313420kHc.LIZLLL));
                            }
                            if (c1313420kHc.LJ.size() != 0 && i7 == 0) {
                                Set<EnumC1313800kIE> set5 = c1313420kHc.LJIIJJI;
                                EnumC1313800kIE enumC1313800kIE5 = EnumC1313800kIE.ROTATE_Z;
                                if (!((HashSet) set5).contains(enumC1313800kIE5)) {
                                    c1313420kHc.LJ.add(Keyframe.ofFloat(0.0f, view2.getRotation()));
                                }
                                if (!((HashSet) c1313420kHc.LJIIL).contains(enumC1313800kIE5)) {
                                    c1313420kHc.LJ.add(Keyframe.ofFloat(1.0f, view2.getRotation()));
                                }
                                Collections.sort(c1313420kHc.LJ, aComparatorS39S0000000_20);
                                arrayList.add(LIZJ("Rotation", c1313420kHc.LJ));
                            }
                            if (c1313420kHc.LJFF.size() != 0 && i7 == 0) {
                                Set<EnumC1313800kIE> set6 = c1313420kHc.LJIIJJI;
                                EnumC1313800kIE enumC1313800kIE6 = EnumC1313800kIE.ROTATE_X;
                                if (!((HashSet) set6).contains(enumC1313800kIE6)) {
                                    c1313420kHc.LJFF.add(Keyframe.ofFloat(0.0f, view2.getRotationX()));
                                }
                                if (!((HashSet) c1313420kHc.LJIIL).contains(enumC1313800kIE6)) {
                                    c1313420kHc.LJFF.add(Keyframe.ofFloat(1.0f, view2.getRotationX()));
                                }
                                Collections.sort(c1313420kHc.LJFF, aComparatorS39S0000000_20);
                                arrayList.add(LIZJ("RotationX", c1313420kHc.LJFF));
                            }
                            if (c1313420kHc.LJI.size() != 0 && i7 == 0) {
                                Set<EnumC1313800kIE> set7 = c1313420kHc.LJIIJJI;
                                EnumC1313800kIE enumC1313800kIE7 = EnumC1313800kIE.ROTATE_Y;
                                if (!((HashSet) set7).contains(enumC1313800kIE7)) {
                                    c1313420kHc.LJI.add(Keyframe.ofFloat(0.0f, view2.getRotationY()));
                                }
                                if (!((HashSet) c1313420kHc.LJIIL).contains(enumC1313800kIE7)) {
                                    c1313420kHc.LJI.add(Keyframe.ofFloat(1.0f, view2.getRotationY()));
                                }
                                Collections.sort(c1313420kHc.LJI, aComparatorS39S0000000_20);
                                arrayList.add(LIZJ("RotationY", c1313420kHc.LJI));
                            }
                            if (c1313420kHc.LJII.size() != 0 && i7 == 0) {
                                Set<EnumC1313800kIE> set8 = c1313420kHc.LJIIJJI;
                                EnumC1313800kIE enumC1313800kIE8 = EnumC1313800kIE.SCALE_X;
                                if (!((HashSet) set8).contains(enumC1313800kIE8)) {
                                    c1313420kHc.LJII.add(Keyframe.ofFloat(0.0f, view2.getScaleX()));
                                }
                                if (!((HashSet) c1313420kHc.LJIIL).contains(enumC1313800kIE8)) {
                                    c1313420kHc.LJII.add(Keyframe.ofFloat(1.0f, view2.getScaleX()));
                                }
                                Collections.sort(c1313420kHc.LJII, aComparatorS39S0000000_20);
                                arrayList.add(LIZJ("ScaleX", c1313420kHc.LJII));
                            }
                            if (c1313420kHc.LJIIIIZZ.size() != 0 && i7 == 0) {
                                Set<EnumC1313800kIE> set9 = c1313420kHc.LJIIJJI;
                                EnumC1313800kIE enumC1313800kIE9 = EnumC1313800kIE.SCALE_Y;
                                if (!((HashSet) set9).contains(enumC1313800kIE9)) {
                                    c1313420kHc.LJIIIIZZ.add(Keyframe.ofFloat(0.0f, view2.getScaleY()));
                                }
                                if (!((HashSet) c1313420kHc.LJIIL).contains(enumC1313800kIE9)) {
                                    c1313420kHc.LJIIIIZZ.add(Keyframe.ofFloat(1.0f, view2.getScaleY()));
                                }
                                Collections.sort(c1313420kHc.LJIIIIZZ, aComparatorS39S0000000_20);
                                arrayList.add(LIZJ("ScaleY", c1313420kHc.LJIIIIZZ));
                            }
                            if (c1313420kHc.LJIIIZ.size() != 0 && i7 + 1 == i) {
                                Set<EnumC1313800kIE> set10 = c1313420kHc.LJIIJJI;
                                EnumC1313800kIE enumC1313800kIE10 = EnumC1313800kIE.BG_COLOR;
                                if (!((HashSet) set10).contains(enumC1313800kIE10)) {
                                    c1313420kHc.LJIIIZ.add(Keyframe.ofInt(0.0f, lynxUILJII2.getBackgroundColor()));
                                }
                                if (!((HashSet) c1313420kHc.LJIIL).contains(enumC1313800kIE10)) {
                                    c1313420kHc.LJIIIZ.add(Keyframe.ofInt(1.0f, lynxUILJII2.getBackgroundColor()));
                                }
                                Collections.sort(c1313420kHc.LJIIIZ, aComparatorS39S0000000_20);
                                if (i7 == 0) {
                                    propertyValuesHolderLIZJ = LIZJ("BackgroundColor", c1313420kHc.LJIIIZ);
                                } else {
                                    propertyValuesHolderLIZJ = LIZJ("Color", c1313420kHc.LJIIIZ);
                                }
                                propertyValuesHolderLIZJ.setEvaluator(new ArgbEvaluator());
                                arrayList.add(propertyValuesHolderLIZJ);
                            }
                            if (arrayList.size() != 0 && (propertyValuesHolderArr = (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[arrayList.size()])) != null) {
                                if (i7 == 0) {
                                    c1313420kHc.LJIILIIL = propertyValuesHolderArr;
                                } else if (i7 == 1) {
                                    c1313420kHc.LJIILJJIL = propertyValuesHolderArr;
                                }
                            }
                        }
                        i7++;
                    } while (i7 < i);
                    this.LJFF = c1313420kHc;
                }
                LynxLog.e("Lynx", "Keyframes input error.");
                return;
            }
            long j = this.LJ;
            long j2 = 0;
            if (j != -1 && c1313370kHX.LLJILLL == 1) {
                C1314630kJZ c1314630kJZ = this.LIZ;
                if (c1314630kJZ.LIZ == -1) {
                    jCurrentTimeMillis = 0;
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis() - c1314630kJZ.LIZ;
                    c1314630kJZ.LIZ = -1L;
                }
                this.LJ = j + jCurrentTimeMillis;
            }
            BackgroundDrawable backgroundDrawableLJI = LJI();
            if (backgroundDrawableLJI != null) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            ObjectAnimator[] objectAnimatorArr = new ObjectAnimator[i2];
            int i8 = 0;
            int i9 = 0;
            do {
                C1313420kHc c1313420kHc2 = this.LJFF;
                if (i8 == 1) {
                    propertyValuesHolderArr2 = c1313420kHc2.LJIILJJIL;
                } else {
                    propertyValuesHolderArr2 = c1313420kHc2.LJIILIIL;
                }
                if (propertyValuesHolderArr2 != null) {
                    if (i8 == 1) {
                        obj = backgroundDrawableLJI;
                    } else {
                        obj = view;
                    }
                    ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, propertyValuesHolderArr2);
                    objectAnimatorOfPropertyValuesHolder.addUpdateListener(new AUListenerS269S0100000_20(this, 5));
                    objectAnimatorArr[i8] = objectAnimatorOfPropertyValuesHolder;
                    objectAnimatorOfPropertyValuesHolder.setDuration(c1313370kHX.LLILLJJLI);
                    objectAnimatorOfPropertyValuesHolder.setRepeatCount(c1313370kHX.LLJIJIL);
                    int i10 = c1313370kHX.LLJILJILJ;
                    if (i10 != 2 && i10 != 3) {
                        objectAnimatorOfPropertyValuesHolder.setRepeatMode(1);
                    } else {
                        objectAnimatorOfPropertyValuesHolder.setRepeatMode(2);
                    }
                    objectAnimatorOfPropertyValuesHolder.setInterpolator(C1313380kHY.LIZ(c1313370kHX));
                    if (c1313370kHX.LLILLL != j2 && ((i3 = c1313370kHX.LLJILJIL) == 2 || i3 == 3)) {
                        ObjectAnimator objectAnimatorClone = objectAnimatorOfPropertyValuesHolder.clone();
                        objectAnimatorClone.setDuration(10000000L);
                        objectAnimatorClone.addListener(new AnimatorListenerAdapter() { // from class: X.0kJ6
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animator) {
                                super.onAnimationStart(animator);
                                animator.cancel();
                            }
                        });
                        C786410Ut5.Pd(objectAnimatorClone);
                    }
                    i9++;
                    long j3 = c1313370kHX.LLILLL;
                    if (j3 >= j2) {
                        objectAnimatorOfPropertyValuesHolder.setStartDelay(j3);
                    } else {
                        objectAnimatorOfPropertyValuesHolder.setCurrentPlayTime(j3 * (-1));
                    }
                    if (this.LJ != -1) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LJ;
                        long j4 = c1313370kHX.LLILLL;
                        if (jCurrentTimeMillis2 < j4) {
                            objectAnimatorOfPropertyValuesHolder.setStartDelay(j4 - jCurrentTimeMillis2);
                        } else {
                            objectAnimatorOfPropertyValuesHolder.setCurrentPlayTime(jCurrentTimeMillis2 - j4);
                        }
                    }
                    C786410Ut5.Pd(objectAnimatorOfPropertyValuesHolder);
                }
                i8++;
                j2 = 0;
            } while (i8 < i2);
            if (i9 == 0) {
                this.LJI = null;
            } else if (i9 == i2) {
                this.LJI = objectAnimatorArr;
            } else {
                this.LJI = new ObjectAnimator[i9];
                int i11 = 0;
                int i12 = 0;
                do {
                    ObjectAnimator objectAnimator = objectAnimatorArr[i11];
                    if (objectAnimator != null) {
                        this.LJI[i12] = objectAnimator;
                        i12++;
                    }
                    i11++;
                } while (i11 < i2);
            }
            ObjectAnimator[] objectAnimatorArr2 = this.LJI;
            if (objectAnimatorArr2 != null && (length = objectAnimatorArr2.length) > 0) {
                objectAnimatorArr2[length - 1].addListener(new C1313290kHP(this));
            }
            if (this.LJ == -1) {
                this.LJ = System.currentTimeMillis();
            }
            if (!LJIIIIZZ(c1313370kHX)) {
                EnumC1313880kIM enumC1313880kIM2 = this.LJII;
                EnumC1313880kIM enumC1313880kIM3 = EnumC1313880kIM.IDLE;
                if (enumC1313880kIM2 == enumC1313880kIM3) {
                    C1313290kHP.LIZ(lynxUILJII, "animationstart", c1313370kHX.LL);
                }
                EnumC1313880kIM enumC1313880kIM4 = this.LJII;
                if (enumC1313880kIM4 != enumC1313880kIM3 && enumC1313880kIM4 != EnumC1313880kIM.CANCELED) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                LynxLog.DCHECK(z2);
                this.LJII = EnumC1313880kIM.RUNNING;
                if (c1313370kHX.LLJILLL == 0) {
                    LJIIIZ(c1313370kHX);
                }
            }
            this.LJIIIIZZ = c1313370kHX;
        }
    }

    public final boolean LJIIIIZZ(C1313370kHX c1313370kHX) {
        long j;
        if (this.LJ == -1) {
            return false;
        }
        int i = c1313370kHX.LLJIJIL;
        if (i >= 9.99999999E8d) {
            j = Long.MAX_VALUE;
        } else {
            j = (c1313370kHX.LLILLJJLI * ((long) (i + 1))) + c1313370kHX.LLILLL;
        }
        if (System.currentTimeMillis() - this.LJ < j) {
            return false;
        }
        return true;
    }

    public final void LJIIIZ(C1313370kHX c1313370kHX) {
        boolean z;
        boolean z2 = true;
        if (c1313370kHX.LLJILLL == 0) {
            z = true;
        } else {
            z = false;
        }
        LynxLog.DCHECK(z);
        if (this.LJII != EnumC1313880kIM.RUNNING) {
            z2 = false;
        }
        LynxLog.DCHECK(z2);
        this.LJII = EnumC1313880kIM.PAUSED;
        ObjectAnimator[] objectAnimatorArr = this.LJI;
        if (objectAnimatorArr != null) {
            for (ObjectAnimator objectAnimator : objectAnimatorArr) {
                objectAnimator.pause();
            }
        }
        if (!LJIIIIZZ(c1313370kHX)) {
            C1314630kJZ c1314630kJZ = this.LIZ;
            if (c1314630kJZ.LIZ == -1) {
                c1314630kJZ.LIZ = System.currentTimeMillis();
            }
        }
        this.LJIIIIZZ = c1313370kHX;
    }

    public C1313330kHT(View view, LynxUI lynxUI) {
        this.LIZIZ = new WeakReference<>(lynxUI);
        this.LIZJ = new WeakReference<>(view);
    }

    public static PropertyValuesHolder LIZJ(String str, ArrayList arrayList) {
        return PropertyValuesHolder.ofKeyframe(str, (Keyframe[]) arrayList.toArray(new Keyframe[arrayList.size()]));
    }

    public final void LJIIJJI(Object obj, String str) {
        if (!this.LIZLLL.containsKey(str)) {
            this.LIZLLL.put(str, obj);
        }
    }

    public static void LIZLLL(float f, EnumC1313800kIE enumC1313800kIE, C1313420kHc c1313420kHc) {
        if (f == 0.0f) {
            ((HashSet) c1313420kHc.LJIIJJI).add(enumC1313800kIE);
        }
        if (f == 1.0f) {
            ((HashSet) c1313420kHc.LJIIL).add(enumC1313800kIE);
        }
    }
}
