package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;

/* JADX INFO: renamed from: X.19M2, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19M2 {
    public static final SparseIntArray LJJLIIIJJI;
    public boolean LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public String LJIL;
    public int LJJI;
    public float LJJIFFI;
    public int LJJJJ;
    public int LJJJJI;
    public int LJJJJIZL;
    public int LJJJJJ;
    public int LJJJLL;
    public int[] LJJJZ;
    public String LJJL;
    public String LJJLI;
    public boolean LJJLIIIIJ;
    public boolean LJJLIIIJ;
    public int LJ = -1;
    public int LJFF = -1;
    public float LJI = -1.0f;
    public int LJII = -1;
    public int LJIIIIZZ = -1;
    public int LJIIIZ = -1;
    public int LJIIJ = -1;
    public int LJIIJJI = -1;
    public int LJIIL = -1;
    public int LJIILIIL = -1;
    public int LJIILJJIL = -1;
    public int LJIILL = -1;
    public int LJIILLIIL = -1;
    public int LJIIZILJ = -1;
    public int LJIJ = -1;
    public int LJIJI = -1;
    public float LJIJJ = 0.5f;
    public float LJIJJLI = 0.5f;
    public int LJJ = -1;
    public int LJJII = -1;
    public int LJJIII = -1;
    public int LJJIIJ = -1;
    public int LJJIIJZLJL = -1;
    public int LJJIIZ = -1;
    public int LJJIIZI = -1;
    public int LJJIJ = -1;
    public int LJJIJIIJI = -1;
    public int LJJIJIIJIL = -1;
    public int LJJIJIL = -1;
    public int LJJIJL = -1;
    public int LJJIJLIJ = -1;
    public int LJJIL = -1;
    public int LJJIZ = -1;
    public int LJJJ = -1;
    public float LJJJI = -1.0f;
    public float LJJJIL = -1.0f;
    public int LJJJJJL = -1;
    public int LJJJJL = -1;
    public int LJJJJLI = -1;
    public int LJJJJLL = -1;
    public float LJJJJZ = 1.0f;
    public float LJJJJZI = 1.0f;
    public int LJJJLIIL = -1;
    public int LJJJLZIJ = -1;
    public boolean LJJLIIIJILLIZJL = true;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        LJJLIIIJJI = sparseIntArray;
        sparseIntArray.append(R$styleable.Layout_layout_constraintLeft_toLeftOf, 24);
        sparseIntArray.append(R$styleable.Layout_layout_constraintLeft_toRightOf, 25);
        sparseIntArray.append(R$styleable.Layout_layout_constraintRight_toLeftOf, 28);
        sparseIntArray.append(R$styleable.Layout_layout_constraintRight_toRightOf, 29);
        sparseIntArray.append(R$styleable.Layout_layout_constraintTop_toTopOf, 35);
        sparseIntArray.append(R$styleable.Layout_layout_constraintTop_toBottomOf, 34);
        sparseIntArray.append(R$styleable.Layout_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(R$styleable.Layout_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(R$styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(R$styleable.Layout_layout_editor_absoluteX, 6);
        sparseIntArray.append(R$styleable.Layout_layout_editor_absoluteY, 7);
        sparseIntArray.append(R$styleable.Layout_layout_constraintGuide_begin, 17);
        sparseIntArray.append(R$styleable.Layout_layout_constraintGuide_end, 18);
        sparseIntArray.append(R$styleable.Layout_layout_constraintGuide_percent, 19);
        sparseIntArray.append(R$styleable.Layout_android_orientation, 26);
        sparseIntArray.append(R$styleable.Layout_layout_constraintStart_toEndOf, 31);
        sparseIntArray.append(R$styleable.Layout_layout_constraintStart_toStartOf, 32);
        sparseIntArray.append(R$styleable.Layout_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(R$styleable.Layout_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(R$styleable.Layout_layout_goneMarginLeft, 13);
        sparseIntArray.append(R$styleable.Layout_layout_goneMarginTop, 16);
        sparseIntArray.append(R$styleable.Layout_layout_goneMarginRight, 14);
        sparseIntArray.append(R$styleable.Layout_layout_goneMarginBottom, 11);
        sparseIntArray.append(R$styleable.Layout_layout_goneMarginStart, 15);
        sparseIntArray.append(R$styleable.Layout_layout_goneMarginEnd, 12);
        sparseIntArray.append(R$styleable.Layout_layout_constraintVertical_weight, 38);
        sparseIntArray.append(R$styleable.Layout_layout_constraintHorizontal_weight, 37);
        sparseIntArray.append(R$styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
        sparseIntArray.append(R$styleable.Layout_layout_constraintVertical_chainStyle, 40);
        sparseIntArray.append(R$styleable.Layout_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(R$styleable.Layout_layout_constraintVertical_bias, 36);
        sparseIntArray.append(R$styleable.Layout_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(R$styleable.Layout_layout_constraintLeft_creator, 76);
        sparseIntArray.append(R$styleable.Layout_layout_constraintTop_creator, 76);
        sparseIntArray.append(R$styleable.Layout_layout_constraintRight_creator, 76);
        sparseIntArray.append(R$styleable.Layout_layout_constraintBottom_creator, 76);
        sparseIntArray.append(R$styleable.Layout_layout_constraintBaseline_creator, 76);
        sparseIntArray.append(R$styleable.Layout_android_layout_marginLeft, 23);
        sparseIntArray.append(R$styleable.Layout_android_layout_marginRight, 27);
        sparseIntArray.append(R$styleable.Layout_android_layout_marginStart, 30);
        sparseIntArray.append(R$styleable.Layout_android_layout_marginEnd, 8);
        sparseIntArray.append(R$styleable.Layout_android_layout_marginTop, 33);
        sparseIntArray.append(R$styleable.Layout_android_layout_marginBottom, 2);
        sparseIntArray.append(R$styleable.Layout_android_layout_width, 22);
        sparseIntArray.append(R$styleable.Layout_android_layout_height, 21);
        sparseIntArray.append(R$styleable.Layout_layout_constraintCircle, 61);
        sparseIntArray.append(R$styleable.Layout_layout_constraintCircleRadius, 62);
        sparseIntArray.append(R$styleable.Layout_layout_constraintCircleAngle, 63);
        sparseIntArray.append(R$styleable.Layout_layout_constraintWidth_percent, 69);
        sparseIntArray.append(R$styleable.Layout_layout_constraintHeight_percent, 70);
        sparseIntArray.append(R$styleable.Layout_chainUseRtl, 71);
        sparseIntArray.append(R$styleable.Layout_barrierDirection, 72);
        sparseIntArray.append(R$styleable.Layout_barrierMargin, 73);
        sparseIntArray.append(R$styleable.Layout_constraint_referenced_ids, 74);
        sparseIntArray.append(R$styleable.Layout_barrierAllowsGoneWidgets, 75);
    }

    public final void LIZ(C19M2 c19m2) {
        this.LIZ = c19m2.LIZ;
        this.LIZJ = c19m2.LIZJ;
        this.LIZIZ = c19m2.LIZIZ;
        this.LIZLLL = c19m2.LIZLLL;
        this.LJ = c19m2.LJ;
        this.LJFF = c19m2.LJFF;
        this.LJI = c19m2.LJI;
        this.LJII = c19m2.LJII;
        this.LJIIIIZZ = c19m2.LJIIIIZZ;
        this.LJIIIZ = c19m2.LJIIIZ;
        this.LJIIJ = c19m2.LJIIJ;
        this.LJIIJJI = c19m2.LJIIJJI;
        this.LJIIL = c19m2.LJIIL;
        this.LJIILIIL = c19m2.LJIILIIL;
        this.LJIILJJIL = c19m2.LJIILJJIL;
        this.LJIILL = c19m2.LJIILL;
        this.LJIILLIIL = c19m2.LJIILLIIL;
        this.LJIIZILJ = c19m2.LJIIZILJ;
        this.LJIJ = c19m2.LJIJ;
        this.LJIJI = c19m2.LJIJI;
        this.LJIJJ = c19m2.LJIJJ;
        this.LJIJJLI = c19m2.LJIJJLI;
        this.LJIL = c19m2.LJIL;
        this.LJJ = c19m2.LJJ;
        this.LJJI = c19m2.LJJI;
        this.LJJIFFI = c19m2.LJJIFFI;
        this.LJJII = c19m2.LJJII;
        this.LJJIII = c19m2.LJJIII;
        this.LJJIIJ = c19m2.LJJIIJ;
        this.LJJIIJZLJL = c19m2.LJJIIJZLJL;
        this.LJJIIZ = c19m2.LJJIIZ;
        this.LJJIIZI = c19m2.LJJIIZI;
        this.LJJIJ = c19m2.LJJIJ;
        this.LJJIJIIJI = c19m2.LJJIJIIJI;
        this.LJJIJIIJIL = c19m2.LJJIJIIJIL;
        this.LJJIJIL = c19m2.LJJIJIL;
        this.LJJIJL = c19m2.LJJIJL;
        this.LJJIJLIJ = c19m2.LJJIJLIJ;
        this.LJJIL = c19m2.LJJIL;
        this.LJJIZ = c19m2.LJJIZ;
        this.LJJJ = c19m2.LJJJ;
        this.LJJJI = c19m2.LJJJI;
        this.LJJJIL = c19m2.LJJJIL;
        this.LJJJJ = c19m2.LJJJJ;
        this.LJJJJI = c19m2.LJJJJI;
        this.LJJJJIZL = c19m2.LJJJJIZL;
        this.LJJJJJ = c19m2.LJJJJJ;
        this.LJJJJJL = c19m2.LJJJJJL;
        this.LJJJJL = c19m2.LJJJJL;
        this.LJJJJLI = c19m2.LJJJJLI;
        this.LJJJJLL = c19m2.LJJJJLL;
        this.LJJJJZ = c19m2.LJJJJZ;
        this.LJJJJZI = c19m2.LJJJJZI;
        this.LJJJLIIL = c19m2.LJJJLIIL;
        this.LJJJLL = c19m2.LJJJLL;
        this.LJJJLZIJ = c19m2.LJJJLZIJ;
        this.LJJLI = c19m2.LJJLI;
        int[] iArr = c19m2.LJJJZ;
        if (iArr != null) {
            this.LJJJZ = Arrays.copyOf(iArr, iArr.length);
        } else {
            this.LJJJZ = null;
        }
        this.LJJL = c19m2.LJJL;
        this.LJJLIIIIJ = c19m2.LJJLIIIIJ;
        this.LJJLIIIJ = c19m2.LJJLIIIJ;
        this.LJJLIIIJILLIZJL = c19m2.LJJLIIIJILLIZJL;
    }

    public final void LIZIZ(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Layout);
        this.LIZIZ = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = LJJLIIIJJI.get(index);
            if (i2 != 69) {
                if (i2 != 70) {
                    if (i2 != 77) {
                        if (i2 != 80) {
                            if (i2 != 81) {
                                switch (i2) {
                                    case 1:
                                        this.LJIILL = C19MB.LJIL(typedArrayObtainStyledAttributes, index, this.LJIILL);
                                        break;
                                    case 2:
                                        this.LJJIJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LJJIJ);
                                        break;
                                    case 3:
                                        this.LJIILJJIL = C19MB.LJIL(typedArrayObtainStyledAttributes, index, this.LJIILJJIL);
                                        break;
                                    case 4:
                                        this.LJIILIIL = C19MB.LJIL(typedArrayObtainStyledAttributes, index, this.LJIILIIL);
                                        break;
                                    case 5:
                                        this.LJIL = C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                                        break;
                                    case 6:
                                        this.LJJII = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.LJJII);
                                        break;
                                    case 7:
                                        this.LJJIII = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.LJJIII);
                                        break;
                                    case 8:
                                        this.LJJIJIIJI = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LJJIJIIJI);
                                        break;
                                    case BdTuring.TYPE_ECAF /* 9 */:
                                        this.LJIJI = C19MB.LJIL(typedArrayObtainStyledAttributes, index, this.LJIJI);
                                        break;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                        this.LJIJ = C19MB.LJIL(typedArrayObtainStyledAttributes, index, this.LJIJ);
                                        break;
                                    case BdTuring.TYPE_EMAIL /* 11 */:
                                        this.LJJIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LJJIL);
                                        break;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                        this.LJJIZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LJJIZ);
                                        break;
                                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                        this.LJJIJIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LJJIJIL);
                                        break;
                                    case 14:
                                        this.LJJIJLIJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LJJIJLIJ);
                                        break;
                                    case 15:
                                        this.LJJJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LJJJ);
                                        break;
                                    case 16:
                                        this.LJJIJL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LJJIJL);
                                        break;
                                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                        this.LJ = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.LJ);
                                        break;
                                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                        this.LJFF = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.LJFF);
                                        break;
                                    case 19:
                                        this.LJI = typedArrayObtainStyledAttributes.getFloat(index, this.LJI);
                                        break;
                                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                        this.LJIJJ = typedArrayObtainStyledAttributes.getFloat(index, this.LJIJJ);
                                        break;
                                    case 21:
                                        this.LIZLLL = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.LIZLLL);
                                        break;
                                    case 22:
                                        this.LIZJ = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.LIZJ);
                                        break;
                                    case 23:
                                        this.LJJIIJZLJL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LJJIIJZLJL);
                                        break;
                                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                        this.LJII = C19MB.LJIL(typedArrayObtainStyledAttributes, index, this.LJII);
                                        break;
                                    case 25:
                                        this.LJIIIIZZ = C19MB.LJIL(typedArrayObtainStyledAttributes, index, this.LJIIIIZZ);
                                        break;
                                    case 26:
                                        this.LJJIIJ = typedArrayObtainStyledAttributes.getInt(index, this.LJJIIJ);
                                        break;
                                    case 27:
                                        this.LJJIIZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LJJIIZ);
                                        break;
                                    case 28:
                                        this.LJIIIZ = C19MB.LJIL(typedArrayObtainStyledAttributes, index, this.LJIIIZ);
                                        break;
                                    case 29:
                                        this.LJIIJ = C19MB.LJIL(typedArrayObtainStyledAttributes, index, this.LJIIJ);
                                        break;
                                    case 30:
                                        this.LJJIJIIJIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LJJIJIIJIL);
                                        break;
                                    case 31:
                                        this.LJIILLIIL = C19MB.LJIL(typedArrayObtainStyledAttributes, index, this.LJIILLIIL);
                                        break;
                                    case 32:
                                        this.LJIIZILJ = C19MB.LJIL(typedArrayObtainStyledAttributes, index, this.LJIIZILJ);
                                        break;
                                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                        this.LJJIIZI = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LJJIIZI);
                                        break;
                                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                        this.LJIIL = C19MB.LJIL(typedArrayObtainStyledAttributes, index, this.LJIIL);
                                        break;
                                    case 35:
                                        this.LJIIJJI = C19MB.LJIL(typedArrayObtainStyledAttributes, index, this.LJIIJJI);
                                        break;
                                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                        this.LJIJJLI = typedArrayObtainStyledAttributes.getFloat(index, this.LJIJJLI);
                                        break;
                                    case 37:
                                        this.LJJJIL = typedArrayObtainStyledAttributes.getFloat(index, this.LJJJIL);
                                        break;
                                    case 38:
                                        this.LJJJI = typedArrayObtainStyledAttributes.getFloat(index, this.LJJJI);
                                        break;
                                    case 39:
                                        this.LJJJJ = typedArrayObtainStyledAttributes.getInt(index, this.LJJJJ);
                                        break;
                                    case 40:
                                        this.LJJJJI = typedArrayObtainStyledAttributes.getInt(index, this.LJJJJI);
                                        break;
                                    default:
                                        switch (i2) {
                                            case 54:
                                                this.LJJJJIZL = typedArrayObtainStyledAttributes.getInt(index, this.LJJJJIZL);
                                                break;
                                            case 55:
                                                this.LJJJJJ = typedArrayObtainStyledAttributes.getInt(index, this.LJJJJJ);
                                                break;
                                            case 56:
                                                this.LJJJJJL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LJJJJJL);
                                                break;
                                            case 57:
                                                this.LJJJJL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LJJJJL);
                                                break;
                                            case 58:
                                                this.LJJJJLI = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LJJJJLI);
                                                break;
                                            case 59:
                                                this.LJJJJLL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LJJJJLL);
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 61:
                                                        this.LJJ = C19MB.LJIL(typedArrayObtainStyledAttributes, index, this.LJJ);
                                                        break;
                                                    case BaseNotice.CREATOR /* 62 */:
                                                        this.LJJI = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LJJI);
                                                        break;
                                                    case 63:
                                                        this.LJJIFFI = typedArrayObtainStyledAttributes.getFloat(index, this.LJJIFFI);
                                                        break;
                                                    default:
                                                        switch (i2) {
                                                            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                                                                this.LJJJLIIL = typedArrayObtainStyledAttributes.getInt(index, this.LJJJLIIL);
                                                                break;
                                                            case 73:
                                                                this.LJJJLL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.LJJJLL);
                                                                break;
                                                            case 74:
                                                                this.LJJL = C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                                                                break;
                                                            case 75:
                                                                this.LJJLIIIJILLIZJL = typedArrayObtainStyledAttributes.getBoolean(index, this.LJJLIIIJILLIZJL);
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                this.LJJLIIIJ = typedArrayObtainStyledAttributes.getBoolean(index, this.LJJLIIIJ);
                            }
                        } else {
                            this.LJJLIIIIJ = typedArrayObtainStyledAttributes.getBoolean(index, this.LJJLIIIIJ);
                        }
                    } else {
                        this.LJJLI = C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                    }
                } else {
                    this.LJJJJZI = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                }
            } else {
                this.LJJJJZ = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
