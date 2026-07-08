package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$id;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: X.19MB, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19MB {
    public static final int[] LIZLLL = {0, 4, 8};
    public static final SparseIntArray LJ;
    public final HashMap<String, C21526019Mc> LIZ = new HashMap<>();
    public boolean LIZIZ = true;
    public final HashMap<Integer, C19MA> LIZJ = new HashMap<>();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        LJ = sparseIntArray;
        sparseIntArray.append(R$styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintRight_toRightOf, 30);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintTop_toTopOf, 36);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(R$styleable.Constraint_layout_editor_absoluteX, 6);
        sparseIntArray.append(R$styleable.Constraint_layout_editor_absoluteY, 7);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintGuide_begin, 17);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintGuide_end, 18);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintGuide_percent, 19);
        sparseIntArray.append(R$styleable.Constraint_android_orientation, 27);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintStart_toEndOf, 32);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintStart_toStartOf, 33);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(R$styleable.Constraint_layout_goneMarginLeft, 13);
        sparseIntArray.append(R$styleable.Constraint_layout_goneMarginTop, 16);
        sparseIntArray.append(R$styleable.Constraint_layout_goneMarginRight, 14);
        sparseIntArray.append(R$styleable.Constraint_layout_goneMarginBottom, 11);
        sparseIntArray.append(R$styleable.Constraint_layout_goneMarginStart, 15);
        sparseIntArray.append(R$styleable.Constraint_layout_goneMarginEnd, 12);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintVertical_weight, 40);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHorizontal_weight, 39);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintVertical_bias, 37);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintLeft_creator, 82);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintTop_creator, 82);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintRight_creator, 82);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintBottom_creator, 82);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintBaseline_creator, 82);
        sparseIntArray.append(R$styleable.Constraint_android_layout_marginLeft, 24);
        sparseIntArray.append(R$styleable.Constraint_android_layout_marginRight, 28);
        sparseIntArray.append(R$styleable.Constraint_android_layout_marginStart, 31);
        sparseIntArray.append(R$styleable.Constraint_android_layout_marginEnd, 8);
        sparseIntArray.append(R$styleable.Constraint_android_layout_marginTop, 34);
        sparseIntArray.append(R$styleable.Constraint_android_layout_marginBottom, 2);
        sparseIntArray.append(R$styleable.Constraint_android_layout_width, 23);
        sparseIntArray.append(R$styleable.Constraint_android_layout_height, 21);
        sparseIntArray.append(R$styleable.Constraint_android_visibility, 22);
        sparseIntArray.append(R$styleable.Constraint_android_alpha, 43);
        sparseIntArray.append(R$styleable.Constraint_android_elevation, 44);
        sparseIntArray.append(R$styleable.Constraint_android_rotationX, 45);
        sparseIntArray.append(R$styleable.Constraint_android_rotationY, 46);
        sparseIntArray.append(R$styleable.Constraint_android_rotation, 60);
        sparseIntArray.append(R$styleable.Constraint_android_scaleX, 47);
        sparseIntArray.append(R$styleable.Constraint_android_scaleY, 48);
        sparseIntArray.append(R$styleable.Constraint_android_transformPivotX, 49);
        sparseIntArray.append(R$styleable.Constraint_android_transformPivotY, 50);
        sparseIntArray.append(R$styleable.Constraint_android_translationX, 51);
        sparseIntArray.append(R$styleable.Constraint_android_translationY, 52);
        sparseIntArray.append(R$styleable.Constraint_android_translationZ, 53);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintWidth_default, 54);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHeight_default, 55);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintWidth_max, 56);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHeight_max, 57);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintWidth_min, 58);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHeight_min, 59);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintCircle, 61);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintCircleRadius, 62);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintCircleAngle, 63);
        sparseIntArray.append(R$styleable.Constraint_animate_relativeTo, 64);
        sparseIntArray.append(R$styleable.Constraint_transitionEasing, 65);
        sparseIntArray.append(R$styleable.Constraint_drawPath, 66);
        sparseIntArray.append(R$styleable.Constraint_transitionPathRotate, 67);
        sparseIntArray.append(R$styleable.Constraint_motionStagger, 79);
        sparseIntArray.append(R$styleable.Constraint_android_id, 38);
        sparseIntArray.append(R$styleable.Constraint_motionProgress, 68);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintWidth_percent, 69);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHeight_percent, 70);
        sparseIntArray.append(R$styleable.Constraint_chainUseRtl, 71);
        sparseIntArray.append(R$styleable.Constraint_barrierDirection, 72);
        sparseIntArray.append(R$styleable.Constraint_barrierMargin, 73);
        sparseIntArray.append(R$styleable.Constraint_constraint_referenced_ids, 74);
        sparseIntArray.append(R$styleable.Constraint_barrierAllowsGoneWidgets, 75);
        sparseIntArray.append(R$styleable.Constraint_pathMotionArc, 76);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintTag, 77);
        sparseIntArray.append(R$styleable.Constraint_visibilityMode, 78);
        sparseIntArray.append(R$styleable.Constraint_layout_constrainedWidth, 80);
        sparseIntArray.append(R$styleable.Constraint_layout_constrainedHeight, 81);
    }

    public static String LJJIJIIJI(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public final void LIZ(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (this.LIZJ.containsKey(Integer.valueOf(id))) {
                if (this.LIZIZ && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.LIZJ.containsKey(Integer.valueOf(id))) {
                    C21526019Mc.LJFF(childAt, this.LIZJ.get(Integer.valueOf(id)).LJFF);
                }
            }
        }
    }

    public final void LIZIZ(ConstraintLayout constraintLayout) {
        LIZJ(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void LIZJ(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.LIZJ.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (this.LIZJ.containsKey(Integer.valueOf(id))) {
                if (this.LIZIZ && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && this.LIZJ.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C19MA c19ma = this.LIZJ.get(Integer.valueOf(id));
                    if (childAt instanceof C19MW) {
                        c19ma.LIZLLL.LJJJLZIJ = 1;
                    }
                    int i2 = c19ma.LIZLLL.LJJJLZIJ;
                    if (i2 != -1 && i2 == 1) {
                        C19MW c19mw = (C19MW) childAt;
                        c19mw.setId(id);
                        c19mw.setType(c19ma.LIZLLL.LJJJLIIL);
                        c19mw.setMargin(c19ma.LIZLLL.LJJJLL);
                        c19mw.setAllowsGoneWidget(c19ma.LIZLLL.LJJLIIIJILLIZJL);
                        C19M2 c19m2 = c19ma.LIZLLL;
                        int[] iArr = c19m2.LJJJZ;
                        if (iArr != null) {
                            c19mw.setReferencedIds(iArr);
                        } else {
                            String str = c19m2.LJJL;
                            if (str != null) {
                                c19m2.LJJJZ = LJIILLIIL(c19mw, str);
                                c19mw.setReferencedIds(c19ma.LIZLLL.LJJJZ);
                            }
                        }
                    }
                    C19ME c19me = (C19ME) childAt.getLayoutParams();
                    c19me.validate();
                    c19ma.LIZ(c19me);
                    C21526019Mc.LJFF(childAt, c19ma.LJFF);
                    C786410Ut5.W5(childAt, c19me);
                    C19M9 c19m9 = c19ma.LIZIZ;
                    if (c19m9.LIZJ == 0) {
                        C786410Ut5.LJLLLLLL(c19m9.LIZIZ, childAt);
                    }
                    C786410Ut5.T4(childAt, c19ma.LIZIZ.LIZLLL);
                    C786410Ut5.Ab(childAt, c19ma.LJ.LIZIZ);
                    C786410Ut5.Hb(childAt, c19ma.LJ.LIZJ);
                    C786410Ut5.Ib(childAt, c19ma.LJ.LIZLLL);
                    C786410Ut5.Ob(childAt, c19ma.LJ.LJ);
                    C786410Ut5.pc(childAt, c19ma.LJ.LJFF);
                    if (!Float.isNaN(c19ma.LJ.LJI)) {
                        childAt.setPivotX(c19ma.LJ.LJI);
                    }
                    if (!Float.isNaN(c19ma.LJ.LJII)) {
                        childAt.setPivotY(c19ma.LJ.LJII);
                    }
                    C786410Ut5.Jc(childAt, c19ma.LJ.LJIIIIZZ);
                    C786410Ut5.ed(childAt, c19ma.LJ.LJIIIZ);
                    childAt.setTranslationZ(c19ma.LJ.LJIIJ);
                    C19M7 c19m7 = c19ma.LJ;
                    if (c19m7.LJIIJJI) {
                        childAt.setElevation(c19m7.LJIIL);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            C19MA c19ma2 = this.LIZJ.get(num);
            int i3 = c19ma2.LIZLLL.LJJJLZIJ;
            if (i3 != -1 && i3 == 1) {
                C19MW c19mw2 = new C19MW(constraintLayout.getContext());
                c19mw2.setId(num.intValue());
                C19M2 c19m22 = c19ma2.LIZLLL;
                int[] iArr2 = c19m22.LJJJZ;
                if (iArr2 != null) {
                    c19mw2.setReferencedIds(iArr2);
                } else {
                    String str2 = c19m22.LJJL;
                    if (str2 != null) {
                        c19m22.LJJJZ = LJIILLIIL(c19mw2, str2);
                        c19mw2.setReferencedIds(c19ma2.LIZLLL.LJJJZ);
                    }
                }
                c19mw2.setType(c19ma2.LIZLLL.LJJJLIIL);
                c19mw2.setMargin(c19ma2.LIZLLL.LJJJLL);
                C19ME c19meGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                c19mw2.validateParams();
                c19ma2.LIZ(c19meGenerateDefaultLayoutParams);
                constraintLayout.addView(c19mw2, c19meGenerateDefaultLayoutParams);
            }
            if (c19ma2.LIZLLL.LIZ) {
                View c20742216Eq = new C20742216Eq(constraintLayout.getContext());
                c20742216Eq.setId(num.intValue());
                C19ME c19meGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                c19ma2.LIZ(c19meGenerateDefaultLayoutParams2);
                constraintLayout.addView(c20742216Eq, c19meGenerateDefaultLayoutParams2);
            }
        }
    }

    public final void LJFF(int i) {
        this.LIZJ.remove(Integer.valueOf(i));
    }

    public final void LJII(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.LIZJ.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            C19ME c19me = (C19ME) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.LIZIZ && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.LIZJ.containsKey(Integer.valueOf(id))) {
                this.LIZJ.put(Integer.valueOf(id), new C19MA());
            }
            C19MA c19ma = this.LIZJ.get(Integer.valueOf(id));
            HashMap<String, C21526019Mc> map = this.LIZ;
            HashMap<String, C21526019Mc> map2 = new HashMap<>();
            Class<?> cls = childAt.getClass();
            for (String str : map.keySet()) {
                C21526019Mc c21526019Mc = map.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map2.put(str, new C21526019Mc(c21526019Mc, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("getMap");
                        sbLIZ.append(str);
                        try {
                            map2.put(str, new C21526019Mc(c21526019Mc, cls.getMethod(C2188811AlT.LIZIZ(sbLIZ), new Class[0]).invoke(childAt, new Object[0])));
                        } catch (IllegalAccessException e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                        } catch (NoSuchMethodException e2) {
                            e = e2;
                            TryCatchGuardChecker.doCheck(e);
                        } catch (InvocationTargetException e3) {
                            e = e3;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (IllegalAccessException e4) {
                    e = e4;
                } catch (NoSuchMethodException e5) {
                    e = e5;
                } catch (InvocationTargetException e6) {
                    e = e6;
                }
            }
            c19ma.LJFF = map2;
            c19ma.LIZIZ(id, c19me);
            c19ma.LIZIZ.LIZIZ = childAt.getVisibility();
            c19ma.LIZIZ.LIZLLL = childAt.getAlpha();
            c19ma.LJ.LIZIZ = childAt.getRotation();
            c19ma.LJ.LIZJ = childAt.getRotationX();
            c19ma.LJ.LIZLLL = childAt.getRotationY();
            c19ma.LJ.LJ = childAt.getScaleX();
            c19ma.LJ.LJFF = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                C19M7 c19m7 = c19ma.LJ;
                c19m7.LJI = pivotX;
                c19m7.LJII = pivotY;
            }
            c19ma.LJ.LJIIIIZZ = childAt.getTranslationX();
            c19ma.LJ.LJIIIZ = childAt.getTranslationY();
            c19ma.LJ.LJIIJ = childAt.getTranslationZ();
            C19M7 c19m72 = c19ma.LJ;
            if (c19m72.LJIIJJI) {
                c19m72.LJIIL = childAt.getElevation();
            }
            if (childAt instanceof C19MW) {
                C19MW c19mw = (C19MW) childAt;
                c19ma.LIZLLL.LJJLIIIJILLIZJL = c19mw.allowsGoneWidget();
                c19ma.LIZLLL.LJJJZ = c19mw.getReferencedIds();
                c19ma.LIZLLL.LJJJLIIL = c19mw.getType();
                c19ma.LIZLLL.LJJJLL = c19mw.getMargin();
            }
        }
    }

    public final void LJIIJ(int i) {
        LJIJI(i).LIZLLL.LJJJJIZL = 1;
    }

    public final C19MA LJIJI(int i) {
        if (!this.LIZJ.containsKey(Integer.valueOf(i))) {
            this.LIZJ.put(Integer.valueOf(i), new C19MA());
        }
        return this.LIZJ.get(Integer.valueOf(i));
    }

    public static int[] LJIILLIIL(C19MW c19mw, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = c19mw.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = R$id.class.getField(strTrim).getInt(null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = C786410Ut5.n3(context.getResources(), strTrim, FollowStatusChangeMethod.PARAM_UID, context.getPackageName());
            }
            if (iIntValue == 0 && c19mw.isInEditMode() && (c19mw.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) c19mw.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        if (i2 != strArrSplit.length) {
            return Arrays.copyOf(iArr, i2);
        }
        return iArr;
    }

    public static C19MA LJIJ(Context context, AttributeSet attributeSet) {
        C19MA c19ma = new C19MA();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Constraint);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index != R$styleable.Constraint_android_id && R$styleable.Constraint_android_layout_marginStart != index && R$styleable.Constraint_android_layout_marginEnd != index) {
                c19ma.LIZJ.LIZ = true;
                c19ma.LIZLLL.LIZIZ = true;
                c19ma.LIZIZ.LIZ = true;
                c19ma.LJ.LIZ = true;
            }
            switch (LJ.get(index)) {
                case 1:
                    C19M2 c19m2 = c19ma.LIZLLL;
                    c19m2.LJIILL = LJIL(typedArrayObtainStyledAttributes, index, c19m2.LJIILL);
                    break;
                case 2:
                    C19M2 c19m22 = c19ma.LIZLLL;
                    c19m22.LJJIJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c19m22.LJJIJ);
                    break;
                case 3:
                    C19M2 c19m23 = c19ma.LIZLLL;
                    c19m23.LJIILJJIL = LJIL(typedArrayObtainStyledAttributes, index, c19m23.LJIILJJIL);
                    break;
                case 4:
                    C19M2 c19m24 = c19ma.LIZLLL;
                    c19m24.LJIILIIL = LJIL(typedArrayObtainStyledAttributes, index, c19m24.LJIILIIL);
                    break;
                case 5:
                    c19ma.LIZLLL.LJIL = C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                    break;
                case 6:
                    C19M2 c19m25 = c19ma.LIZLLL;
                    c19m25.LJJII = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c19m25.LJJII);
                    break;
                case 7:
                    C19M2 c19m26 = c19ma.LIZLLL;
                    c19m26.LJJIII = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c19m26.LJJIII);
                    break;
                case 8:
                    C19M2 c19m27 = c19ma.LIZLLL;
                    c19m27.LJJIJIIJI = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c19m27.LJJIJIIJI);
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    C19M2 c19m28 = c19ma.LIZLLL;
                    c19m28.LJIJI = LJIL(typedArrayObtainStyledAttributes, index, c19m28.LJIJI);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    C19M2 c19m29 = c19ma.LIZLLL;
                    c19m29.LJIJ = LJIL(typedArrayObtainStyledAttributes, index, c19m29.LJIJ);
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    C19M2 c19m210 = c19ma.LIZLLL;
                    c19m210.LJJIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c19m210.LJJIL);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    C19M2 c19m211 = c19ma.LIZLLL;
                    c19m211.LJJIZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c19m211.LJJIZ);
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    C19M2 c19m212 = c19ma.LIZLLL;
                    c19m212.LJJIJIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c19m212.LJJIJIL);
                    break;
                case 14:
                    C19M2 c19m213 = c19ma.LIZLLL;
                    c19m213.LJJIJLIJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c19m213.LJJIJLIJ);
                    break;
                case 15:
                    C19M2 c19m214 = c19ma.LIZLLL;
                    c19m214.LJJJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c19m214.LJJJ);
                    break;
                case 16:
                    C19M2 c19m215 = c19ma.LIZLLL;
                    c19m215.LJJIJL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c19m215.LJJIJL);
                    break;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    C19M2 c19m216 = c19ma.LIZLLL;
                    c19m216.LJ = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c19m216.LJ);
                    break;
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    C19M2 c19m217 = c19ma.LIZLLL;
                    c19m217.LJFF = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c19m217.LJFF);
                    break;
                case 19:
                    C19M2 c19m218 = c19ma.LIZLLL;
                    c19m218.LJI = typedArrayObtainStyledAttributes.getFloat(index, c19m218.LJI);
                    break;
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                    C19M2 c19m219 = c19ma.LIZLLL;
                    c19m219.LJIJJ = typedArrayObtainStyledAttributes.getFloat(index, c19m219.LJIJJ);
                    break;
                case 21:
                    C19M2 c19m220 = c19ma.LIZLLL;
                    c19m220.LIZLLL = typedArrayObtainStyledAttributes.getLayoutDimension(index, c19m220.LIZLLL);
                    break;
                case 22:
                    C19M9 c19m9 = c19ma.LIZIZ;
                    c19m9.LIZIZ = typedArrayObtainStyledAttributes.getInt(index, c19m9.LIZIZ);
                    C19M9 c19m92 = c19ma.LIZIZ;
                    c19m92.LIZIZ = LIZLLL[c19m92.LIZIZ];
                    break;
                case 23:
                    C19M2 c19m221 = c19ma.LIZLLL;
                    c19m221.LIZJ = typedArrayObtainStyledAttributes.getLayoutDimension(index, c19m221.LIZJ);
                    break;
                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                    C19M2 c19m222 = c19ma.LIZLLL;
                    c19m222.LJJIIJZLJL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c19m222.LJJIIJZLJL);
                    break;
                case 25:
                    C19M2 c19m223 = c19ma.LIZLLL;
                    c19m223.LJII = LJIL(typedArrayObtainStyledAttributes, index, c19m223.LJII);
                    break;
                case 26:
                    C19M2 c19m224 = c19ma.LIZLLL;
                    c19m224.LJIIIIZZ = LJIL(typedArrayObtainStyledAttributes, index, c19m224.LJIIIIZZ);
                    break;
                case 27:
                    C19M2 c19m225 = c19ma.LIZLLL;
                    c19m225.LJJIIJ = typedArrayObtainStyledAttributes.getInt(index, c19m225.LJJIIJ);
                    break;
                case 28:
                    C19M2 c19m226 = c19ma.LIZLLL;
                    c19m226.LJJIIZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c19m226.LJJIIZ);
                    break;
                case 29:
                    C19M2 c19m227 = c19ma.LIZLLL;
                    c19m227.LJIIIZ = LJIL(typedArrayObtainStyledAttributes, index, c19m227.LJIIIZ);
                    break;
                case 30:
                    C19M2 c19m228 = c19ma.LIZLLL;
                    c19m228.LJIIJ = LJIL(typedArrayObtainStyledAttributes, index, c19m228.LJIIJ);
                    break;
                case 31:
                    C19M2 c19m229 = c19ma.LIZLLL;
                    c19m229.LJJIJIIJIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c19m229.LJJIJIIJIL);
                    break;
                case 32:
                    C19M2 c19m230 = c19ma.LIZLLL;
                    c19m230.LJIILLIIL = LJIL(typedArrayObtainStyledAttributes, index, c19m230.LJIILLIIL);
                    break;
                case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                    C19M2 c19m231 = c19ma.LIZLLL;
                    c19m231.LJIIZILJ = LJIL(typedArrayObtainStyledAttributes, index, c19m231.LJIIZILJ);
                    break;
                case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                    C19M2 c19m232 = c19ma.LIZLLL;
                    c19m232.LJJIIZI = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c19m232.LJJIIZI);
                    break;
                case 35:
                    C19M2 c19m233 = c19ma.LIZLLL;
                    c19m233.LJIIL = LJIL(typedArrayObtainStyledAttributes, index, c19m233.LJIIL);
                    break;
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                    C19M2 c19m234 = c19ma.LIZLLL;
                    c19m234.LJIIJJI = LJIL(typedArrayObtainStyledAttributes, index, c19m234.LJIIJJI);
                    break;
                case 37:
                    C19M2 c19m235 = c19ma.LIZLLL;
                    c19m235.LJIJJLI = typedArrayObtainStyledAttributes.getFloat(index, c19m235.LJIJJLI);
                    break;
                case 38:
                    c19ma.LIZ = typedArrayObtainStyledAttributes.getResourceId(index, c19ma.LIZ);
                    break;
                case 39:
                    C19M2 c19m236 = c19ma.LIZLLL;
                    c19m236.LJJJIL = typedArrayObtainStyledAttributes.getFloat(index, c19m236.LJJJIL);
                    break;
                case 40:
                    C19M2 c19m237 = c19ma.LIZLLL;
                    c19m237.LJJJI = typedArrayObtainStyledAttributes.getFloat(index, c19m237.LJJJI);
                    break;
                case 41:
                    C19M2 c19m238 = c19ma.LIZLLL;
                    c19m238.LJJJJ = typedArrayObtainStyledAttributes.getInt(index, c19m238.LJJJJ);
                    break;
                case 42:
                    C19M2 c19m239 = c19ma.LIZLLL;
                    c19m239.LJJJJI = typedArrayObtainStyledAttributes.getInt(index, c19m239.LJJJJI);
                    break;
                case 43:
                    C19M9 c19m93 = c19ma.LIZIZ;
                    c19m93.LIZLLL = typedArrayObtainStyledAttributes.getFloat(index, c19m93.LIZLLL);
                    break;
                case 44:
                    C19M7 c19m7 = c19ma.LJ;
                    c19m7.LJIIJJI = true;
                    c19m7.LJIIL = typedArrayObtainStyledAttributes.getDimension(index, c19m7.LJIIL);
                    break;
                case 45:
                    C19M7 c19m72 = c19ma.LJ;
                    c19m72.LIZJ = typedArrayObtainStyledAttributes.getFloat(index, c19m72.LIZJ);
                    break;
                case 46:
                    C19M7 c19m73 = c19ma.LJ;
                    c19m73.LIZLLL = typedArrayObtainStyledAttributes.getFloat(index, c19m73.LIZLLL);
                    break;
                case 47:
                    C19M7 c19m74 = c19ma.LJ;
                    c19m74.LJ = typedArrayObtainStyledAttributes.getFloat(index, c19m74.LJ);
                    break;
                case 48:
                    C19M7 c19m75 = c19ma.LJ;
                    c19m75.LJFF = typedArrayObtainStyledAttributes.getFloat(index, c19m75.LJFF);
                    break;
                case 49:
                    C19M7 c19m76 = c19ma.LJ;
                    c19m76.LJI = typedArrayObtainStyledAttributes.getDimension(index, c19m76.LJI);
                    break;
                case BaseNotice.RECOMMEND_LIVE /* 50 */:
                    C19M7 c19m77 = c19ma.LJ;
                    c19m77.LJII = typedArrayObtainStyledAttributes.getDimension(index, c19m77.LJII);
                    break;
                case 51:
                    C19M7 c19m78 = c19ma.LJ;
                    c19m78.LJIIIIZZ = typedArrayObtainStyledAttributes.getDimension(index, c19m78.LJIIIIZZ);
                    break;
                case 52:
                    C19M7 c19m79 = c19ma.LJ;
                    c19m79.LJIIIZ = typedArrayObtainStyledAttributes.getDimension(index, c19m79.LJIIIZ);
                    break;
                case 53:
                    C19M7 c19m710 = c19ma.LJ;
                    c19m710.LJIIJ = typedArrayObtainStyledAttributes.getDimension(index, c19m710.LJIIJ);
                    break;
                case 54:
                    C19M2 c19m240 = c19ma.LIZLLL;
                    c19m240.LJJJJIZL = typedArrayObtainStyledAttributes.getInt(index, c19m240.LJJJJIZL);
                    break;
                case 55:
                    C19M2 c19m241 = c19ma.LIZLLL;
                    c19m241.LJJJJJ = typedArrayObtainStyledAttributes.getInt(index, c19m241.LJJJJJ);
                    break;
                case 56:
                    C19M2 c19m242 = c19ma.LIZLLL;
                    c19m242.LJJJJJL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c19m242.LJJJJJL);
                    break;
                case 57:
                    C19M2 c19m243 = c19ma.LIZLLL;
                    c19m243.LJJJJL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c19m243.LJJJJL);
                    break;
                case 58:
                    C19M2 c19m244 = c19ma.LIZLLL;
                    c19m244.LJJJJLI = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c19m244.LJJJJLI);
                    break;
                case 59:
                    C19M2 c19m245 = c19ma.LIZLLL;
                    c19m245.LJJJJLL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c19m245.LJJJJLL);
                    break;
                case 60:
                    C19M7 c19m711 = c19ma.LJ;
                    c19m711.LIZIZ = typedArrayObtainStyledAttributes.getFloat(index, c19m711.LIZIZ);
                    break;
                case 61:
                    C19M2 c19m246 = c19ma.LIZLLL;
                    c19m246.LJJ = LJIL(typedArrayObtainStyledAttributes, index, c19m246.LJJ);
                    break;
                case BaseNotice.CREATOR /* 62 */:
                    C19M2 c19m247 = c19ma.LIZLLL;
                    c19m247.LJJI = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c19m247.LJJI);
                    break;
                case 63:
                    C19M2 c19m248 = c19ma.LIZLLL;
                    c19m248.LJJIFFI = typedArrayObtainStyledAttributes.getFloat(index, c19m248.LJJIFFI);
                    break;
                case 64:
                    C19MC c19mc = c19ma.LIZJ;
                    c19mc.LIZIZ = LJIL(typedArrayObtainStyledAttributes, index, c19mc.LIZIZ);
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        c19ma.LIZJ.LIZJ = C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                    } else {
                        c19ma.LIZJ.LIZJ = C19NB.LIZJ[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    c19ma.LIZJ.LJ = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 67:
                    C19MC c19mc2 = c19ma.LIZJ;
                    c19mc2.LJI = typedArrayObtainStyledAttributes.getFloat(index, c19mc2.LJI);
                    break;
                case 68:
                    C19M9 c19m94 = c19ma.LIZIZ;
                    c19m94.LJ = typedArrayObtainStyledAttributes.getFloat(index, c19m94.LJ);
                    break;
                case 69:
                    c19ma.LIZLLL.LJJJJZ = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    c19ma.LIZLLL.LJJJJZI = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                    C19M2 c19m249 = c19ma.LIZLLL;
                    c19m249.LJJJLIIL = typedArrayObtainStyledAttributes.getInt(index, c19m249.LJJJLIIL);
                    break;
                case 73:
                    C19M2 c19m250 = c19ma.LIZLLL;
                    c19m250.LJJJLL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c19m250.LJJJLL);
                    break;
                case 74:
                    c19ma.LIZLLL.LJJL = C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                    break;
                case 75:
                    C19M2 c19m251 = c19ma.LIZLLL;
                    c19m251.LJJLIIIJILLIZJL = typedArrayObtainStyledAttributes.getBoolean(index, c19m251.LJJLIIIJILLIZJL);
                    break;
                case 76:
                    C19MC c19mc3 = c19ma.LIZJ;
                    c19mc3.LIZLLL = typedArrayObtainStyledAttributes.getInt(index, c19mc3.LIZLLL);
                    break;
                case 77:
                    c19ma.LIZLLL.LJJLI = C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                    break;
                case 78:
                    C19M9 c19m95 = c19ma.LIZIZ;
                    c19m95.LIZJ = typedArrayObtainStyledAttributes.getInt(index, c19m95.LIZJ);
                    break;
                case 79:
                    C19MC c19mc4 = c19ma.LIZJ;
                    c19mc4.LJFF = typedArrayObtainStyledAttributes.getFloat(index, c19mc4.LJFF);
                    break;
                case 80:
                    C19M2 c19m252 = c19ma.LIZLLL;
                    c19m252.LJJLIIIIJ = typedArrayObtainStyledAttributes.getBoolean(index, c19m252.LJJLIIIIJ);
                    break;
                case 81:
                    C19M2 c19m253 = c19ma.LIZLLL;
                    c19m253.LJJLIIIJ = typedArrayObtainStyledAttributes.getBoolean(index, c19m253.LJJLIIIJ);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c19ma;
    }

    public final void LJ(int i, int i2) {
        if (i2 == 0) {
            LIZLLL(i, 0, 3, 0, 4);
        } else {
            LIZLLL(i, i2, 4, i2, 3);
        }
    }

    public final void LJI(int i, int i2) {
        if (this.LIZJ.containsKey(Integer.valueOf(i))) {
            C19MA c19ma = this.LIZJ.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    C19M2 c19m2 = c19ma.LIZLLL;
                    c19m2.LJIIIIZZ = -1;
                    c19m2.LJII = -1;
                    c19m2.LJJIIJZLJL = -1;
                    c19m2.LJJIJIL = -1;
                    return;
                case 2:
                    C19M2 c19m22 = c19ma.LIZLLL;
                    c19m22.LJIIJ = -1;
                    c19m22.LJIIIZ = -1;
                    c19m22.LJJIIZ = -1;
                    c19m22.LJJIJLIJ = -1;
                    return;
                case 3:
                    C19M2 c19m23 = c19ma.LIZLLL;
                    c19m23.LJIIL = -1;
                    c19m23.LJIIJJI = -1;
                    c19m23.LJJIIZI = -1;
                    c19m23.LJJIJL = -1;
                    return;
                case 4:
                    C19M2 c19m24 = c19ma.LIZLLL;
                    c19m24.LJIILIIL = -1;
                    c19m24.LJIILJJIL = -1;
                    c19m24.LJJIJ = -1;
                    c19m24.LJJIL = -1;
                    return;
                case 5:
                    c19ma.LIZLLL.LJIILL = -1;
                    return;
                case 6:
                    C19M2 c19m25 = c19ma.LIZLLL;
                    c19m25.LJIILLIIL = -1;
                    c19m25.LJIIZILJ = -1;
                    c19m25.LJJIJIIJIL = -1;
                    c19m25.LJJJ = -1;
                    return;
                case 7:
                    C19M2 c19m26 = c19ma.LIZLLL;
                    c19m26.LJIJ = -1;
                    c19m26.LJIJI = -1;
                    c19m26.LJJIJIIJI = -1;
                    c19m26.LJJIZ = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public final void LJIIJJI(int i, int i2) {
        LJIJI(i).LIZLLL.LIZLLL = i2;
    }

    public final void LJIIL(int i, int i2) {
        LJIJI(i).LIZLLL.LJJJJL = i2;
    }

    public final void LJIILIIL(int i, int i2) {
        LJIJI(i).LIZLLL.LJJJJJL = i2;
    }

    public final void LJIILJJIL(float f, int i) {
        LJIJI(i).LIZLLL.LJJJJZ = f;
    }

    public final void LJIILL(int i, int i2) {
        LJIJI(i).LIZLLL.LIZJ = i2;
    }

    public final void LJIJJ(int i, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        C19MA c19maLJIJ = LJIJ(context, Xml.asAttributeSet(xml));
                        if (name.equalsIgnoreCase("Guideline")) {
                            c19maLJIJ.LIZLLL.LIZ = true;
                        }
                        this.LIZJ.put(Integer.valueOf(c19maLJIJ.LIZ), c19maLJIJ);
                    } else {
                        continue;
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (XmlPullParserException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x00f6, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(android.content.Context r8, org.xmlpull.v1.XmlPullParser r9) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19MB.LJIJJLI(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final void LJJ(int i, String str) {
        LJIJI(i).LIZLLL.LJIL = str;
    }

    public final void LJJIFFI(float f, int i) {
        LJIJI(i).LIZLLL.LJI = f;
        LJIJI(i).LIZLLL.LJFF = -1;
        LJIJI(i).LIZLLL.LJ = -1;
    }

    public final void LJJII(float f, int i) {
        LJIJI(i).LIZLLL.LJIJJ = f;
    }

    public final void LJJIII(int i, int i2) {
        LJIJI(i).LIZLLL.LJJJJ = i2;
    }

    public final void LJJIIJ(float f, int i) {
        LJIJI(i).LIZLLL.LJJJIL = f;
    }

    public final void LJJIIZ(float f, int i) {
        LJIJI(i).LIZLLL.LJIJJLI = f;
    }

    public final void LJJIIZI(int i, int i2) {
        LJIJI(i).LIZLLL.LJJJJI = i2;
    }

    public final void LJJIJ(int i, int i2) {
        LJIJI(i).LIZIZ.LIZIZ = i2;
    }

    public static int LJIL(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    public final void LJIIZILJ(int i, int i2, int[] iArr) {
        int i3 = 4;
        if (iArr.length >= 2) {
            LJIJI(iArr[0]).LIZLLL.LJJJJI = 2;
            LJIIIZ(iArr[0], 3, i, 3, 0);
            for (int i4 = 1; i4 < iArr.length; i4++) {
                int i5 = i4 - 1;
                LJIIIZ(iArr[i4], 3, iArr[i5], i3, 0);
                i3 = i3;
                LJIIIZ(iArr[i5], i3, iArr[i4], 3, 0);
            }
            LJIIIZ(iArr[iArr.length - 1], i3, i2, i3, 0);
            return;
        }
        throw new IllegalArgumentException("must have 2 or more widgets in a chain");
    }

    public final void LJJI(int i, int i2, int i3) {
        C19MA c19maLJIJI = LJIJI(i);
        switch (i2) {
            case 1:
                c19maLJIJI.LIZLLL.LJJIJIL = i3;
                return;
            case 2:
                c19maLJIJI.LIZLLL.LJJIJLIJ = i3;
                return;
            case 3:
                c19maLJIJI.LIZLLL.LJJIJL = i3;
                return;
            case 4:
                c19maLJIJI.LIZLLL.LJJIL = i3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                c19maLJIJI.LIZLLL.LJJJ = i3;
                return;
            case 7:
                c19maLJIJI.LIZLLL.LJJIZ = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void LJJIIJZLJL(int i, int i2, int i3) {
        C19MA c19maLJIJI = LJIJI(i);
        switch (i2) {
            case 1:
                c19maLJIJI.LIZLLL.LJJIIJZLJL = i3;
                return;
            case 2:
                c19maLJIJI.LIZLLL.LJJIIZ = i3;
                return;
            case 3:
                c19maLJIJI.LIZLLL.LJJIIZI = i3;
                return;
            case 4:
                c19maLJIJI.LIZLLL.LJJIJ = i3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                c19maLJIJI.LIZLLL.LJJIJIIJIL = i3;
                return;
            case 7:
                c19maLJIJI.LIZLLL.LJJIJIIJI = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void LJIIIIZZ(int i, int i2, int i3, int i4) {
        if (!this.LIZJ.containsKey(Integer.valueOf(i))) {
            this.LIZJ.put(Integer.valueOf(i), new C19MA());
        }
        C19MA c19ma = this.LIZJ.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    C19M2 c19m2 = c19ma.LIZLLL;
                    c19m2.LJII = i3;
                    c19m2.LJIIIIZZ = -1;
                    return;
                } else if (i4 == 2) {
                    C19M2 c19m22 = c19ma.LIZLLL;
                    c19m22.LJIIIIZZ = i3;
                    c19m22.LJII = -1;
                    return;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("left to ");
                    sbLIZ.append(LJJIJIIJI(i4));
                    sbLIZ.append(" undefined");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            case 2:
                if (i4 == 1) {
                    C19M2 c19m23 = c19ma.LIZLLL;
                    c19m23.LJIIIZ = i3;
                    c19m23.LJIIJ = -1;
                    return;
                } else if (i4 == 2) {
                    C19M2 c19m24 = c19ma.LIZLLL;
                    c19m24.LJIIJ = i3;
                    c19m24.LJIIIZ = -1;
                    return;
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("right to ");
                    sbLIZ2.append(LJJIJIIJI(i4));
                    sbLIZ2.append(" undefined");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
            case 3:
                if (i4 == 3) {
                    C19M2 c19m25 = c19ma.LIZLLL;
                    c19m25.LJIIJJI = i3;
                    c19m25.LJIIL = -1;
                    c19m25.LJIILL = -1;
                    return;
                }
                if (i4 == 4) {
                    C19M2 c19m26 = c19ma.LIZLLL;
                    c19m26.LJIIL = i3;
                    c19m26.LJIIJJI = -1;
                    c19m26.LJIILL = -1;
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("right to ");
                sbLIZ3.append(LJJIJIIJI(i4));
                sbLIZ3.append(" undefined");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
            case 4:
                if (i4 == 4) {
                    C19M2 c19m27 = c19ma.LIZLLL;
                    c19m27.LJIILJJIL = i3;
                    c19m27.LJIILIIL = -1;
                    c19m27.LJIILL = -1;
                    return;
                }
                if (i4 == 3) {
                    C19M2 c19m28 = c19ma.LIZLLL;
                    c19m28.LJIILIIL = i3;
                    c19m28.LJIILJJIL = -1;
                    c19m28.LJIILL = -1;
                    return;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("right to ");
                sbLIZ4.append(LJJIJIIJI(i4));
                sbLIZ4.append(" undefined");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ4));
            case 5:
                if (i4 == 5) {
                    C19M2 c19m29 = c19ma.LIZLLL;
                    c19m29.LJIILL = i3;
                    c19m29.LJIILJJIL = -1;
                    c19m29.LJIILIIL = -1;
                    c19m29.LJIIJJI = -1;
                    c19m29.LJIIL = -1;
                    return;
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("right to ");
                sbLIZ5.append(LJJIJIIJI(i4));
                sbLIZ5.append(" undefined");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ5));
            case 6:
                if (i4 == 6) {
                    C19M2 c19m210 = c19ma.LIZLLL;
                    c19m210.LJIIZILJ = i3;
                    c19m210.LJIILLIIL = -1;
                    return;
                } else if (i4 == 7) {
                    C19M2 c19m211 = c19ma.LIZLLL;
                    c19m211.LJIILLIIL = i3;
                    c19m211.LJIIZILJ = -1;
                    return;
                } else {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("right to ");
                    sbLIZ6.append(LJJIJIIJI(i4));
                    sbLIZ6.append(" undefined");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ6));
                }
            case 7:
                if (i4 == 7) {
                    C19M2 c19m212 = c19ma.LIZLLL;
                    c19m212.LJIJI = i3;
                    c19m212.LJIJ = -1;
                    return;
                } else if (i4 == 6) {
                    C19M2 c19m213 = c19ma.LIZLLL;
                    c19m213.LJIJ = i3;
                    c19m213.LJIJI = -1;
                    return;
                } else {
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("right to ");
                    sbLIZ7.append(LJJIJIIJI(i4));
                    sbLIZ7.append(" undefined");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ7));
                }
            default:
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append(LJJIJIIJI(i2));
                sbLIZ8.append(" to ");
                sbLIZ8.append(LJJIJIIJI(i4));
                sbLIZ8.append(" unknown");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ8));
        }
    }

    public final void LIZLLL(int i, int i2, int i3, int i4, int i5) {
        if (i3 != 1 && i3 != 2) {
            if (i3 != 6 && i3 != 7) {
                LJIIIZ(i, 3, i2, i3, 0);
                LJIIIZ(i, 4, i4, i5, 0);
                this.LIZJ.get(Integer.valueOf(i)).LIZLLL.LJIJJLI = 0.5f;
                return;
            } else {
                LJIIIZ(i, 6, i2, i3, 0);
                LJIIIZ(i, 7, i4, i5, 0);
                this.LIZJ.get(Integer.valueOf(i)).LIZLLL.LJIJJ = 0.5f;
                return;
            }
        }
        LJIIIZ(i, 1, i2, i3, 0);
        LJIIIZ(i, 2, i4, i5, 0);
        this.LIZJ.get(Integer.valueOf(i)).LIZLLL.LJIJJ = 0.5f;
    }

    public final void LJIIIZ(int i, int i2, int i3, int i4, int i5) {
        if (!this.LIZJ.containsKey(Integer.valueOf(i))) {
            this.LIZJ.put(Integer.valueOf(i), new C19MA());
        }
        C19MA c19ma = this.LIZJ.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    C19M2 c19m2 = c19ma.LIZLLL;
                    c19m2.LJII = i3;
                    c19m2.LJIIIIZZ = -1;
                } else if (i4 == 2) {
                    C19M2 c19m22 = c19ma.LIZLLL;
                    c19m22.LJIIIIZZ = i3;
                    c19m22.LJII = -1;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Left to ");
                    sbLIZ.append(LJJIJIIJI(i4));
                    sbLIZ.append(" undefined");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                c19ma.LIZLLL.LJJIIJZLJL = i5;
                return;
            case 2:
                if (i4 == 1) {
                    C19M2 c19m23 = c19ma.LIZLLL;
                    c19m23.LJIIIZ = i3;
                    c19m23.LJIIJ = -1;
                } else if (i4 == 2) {
                    C19M2 c19m24 = c19ma.LIZLLL;
                    c19m24.LJIIJ = i3;
                    c19m24.LJIIIZ = -1;
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("right to ");
                    sbLIZ2.append(LJJIJIIJI(i4));
                    sbLIZ2.append(" undefined");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                c19ma.LIZLLL.LJJIIZ = i5;
                return;
            case 3:
                if (i4 == 3) {
                    C19M2 c19m25 = c19ma.LIZLLL;
                    c19m25.LJIIJJI = i3;
                    c19m25.LJIIL = -1;
                    c19m25.LJIILL = -1;
                } else if (i4 == 4) {
                    C19M2 c19m26 = c19ma.LIZLLL;
                    c19m26.LJIIL = i3;
                    c19m26.LJIIJJI = -1;
                    c19m26.LJIILL = -1;
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("right to ");
                    sbLIZ3.append(LJJIJIIJI(i4));
                    sbLIZ3.append(" undefined");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
                }
                c19ma.LIZLLL.LJJIIZI = i5;
                return;
            case 4:
                if (i4 == 4) {
                    C19M2 c19m27 = c19ma.LIZLLL;
                    c19m27.LJIILJJIL = i3;
                    c19m27.LJIILIIL = -1;
                    c19m27.LJIILL = -1;
                } else if (i4 == 3) {
                    C19M2 c19m28 = c19ma.LIZLLL;
                    c19m28.LJIILIIL = i3;
                    c19m28.LJIILJJIL = -1;
                    c19m28.LJIILL = -1;
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("right to ");
                    sbLIZ4.append(LJJIJIIJI(i4));
                    sbLIZ4.append(" undefined");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ4));
                }
                c19ma.LIZLLL.LJJIJ = i5;
                return;
            case 5:
                if (i4 == 5) {
                    C19M2 c19m29 = c19ma.LIZLLL;
                    c19m29.LJIILL = i3;
                    c19m29.LJIILJJIL = -1;
                    c19m29.LJIILIIL = -1;
                    c19m29.LJIIJJI = -1;
                    c19m29.LJIIL = -1;
                    return;
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("right to ");
                sbLIZ5.append(LJJIJIIJI(i4));
                sbLIZ5.append(" undefined");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ5));
            case 6:
                if (i4 == 6) {
                    C19M2 c19m210 = c19ma.LIZLLL;
                    c19m210.LJIIZILJ = i3;
                    c19m210.LJIILLIIL = -1;
                } else if (i4 == 7) {
                    C19M2 c19m211 = c19ma.LIZLLL;
                    c19m211.LJIILLIIL = i3;
                    c19m211.LJIIZILJ = -1;
                } else {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("right to ");
                    sbLIZ6.append(LJJIJIIJI(i4));
                    sbLIZ6.append(" undefined");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ6));
                }
                c19ma.LIZLLL.LJJIJIIJIL = i5;
                return;
            case 7:
                if (i4 == 7) {
                    C19M2 c19m212 = c19ma.LIZLLL;
                    c19m212.LJIJI = i3;
                    c19m212.LJIJ = -1;
                } else if (i4 == 6) {
                    C19M2 c19m213 = c19ma.LIZLLL;
                    c19m213.LJIJ = i3;
                    c19m213.LJIJI = -1;
                } else {
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("right to ");
                    sbLIZ7.append(LJJIJIIJI(i4));
                    sbLIZ7.append(" undefined");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ7));
                }
                c19ma.LIZLLL.LJJIJIIJI = i5;
                return;
            default:
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append(LJJIJIIJI(i2));
                sbLIZ8.append(" to ");
                sbLIZ8.append(LJJIJIIJI(i4));
                sbLIZ8.append(" unknown");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ8));
        }
    }
}
