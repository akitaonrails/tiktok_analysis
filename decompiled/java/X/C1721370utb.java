package X;

import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.pipo.stellar.base.model.IconTextCardDO;
import com.bytedance.pipo.stellar.base.model.ImageDO;
import com.bytedance.pipo.stellar.base.model.MarginDO;
import com.bytedance.pipo.stellar.base.model.TextDO;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0utb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721370utb extends AbstractC1720840usk<IconTextCardDO> {
    @Override // X.AbstractC1720840usk
    public final int LJ() {
        return R.layout.adn;
    }

    public static void LJI(int i, C19MB c19mb) {
        c19mb.LJI(i, 6);
        c19mb.LJI(i, 7);
        c19mb.LJI(i, 3);
        c19mb.LJI(i, 4);
    }

    @Override // X.AbstractC1720840usk
    public final void LJFF(View view, IconTextCardDO iconTextCardDO, EnumC1720670usT enumC1720670usT) {
        ConstraintLayout constraintLayout;
        EnumC1757780vqK next;
        int iIntValue;
        Integer numLJIIJJI;
        Integer numValueOf;
        Integer numLJIIJJI2;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        Integer numValueOf5;
        Integer numLJIIJJI3;
        Integer numLJIIJJI4;
        Integer numLJIIJJI5;
        Integer numLJIIJJI6;
        IconTextCardDO iconTextCardDO2 = iconTextCardDO;
        super.LJFF(view, iconTextCardDO2, enumC1720670usT);
        boolean z = view instanceof ConstraintLayout;
        AttributeSet attributeSet = null;
        if (z) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
            if (constraintLayout2 != null) {
                C786410Ut5.LJJJJL(constraintLayout2);
                MarginDO padding = iconTextCardDO2.getPadding();
                if (padding != null) {
                    String str = padding.start;
                    if (str != null && (numLJIIJJI6 = C2095008Iq.LJIIJJI(str)) != null) {
                        numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI6)));
                    } else {
                        numValueOf2 = null;
                    }
                    String str2 = padding.top;
                    if (str2 != null && (numLJIIJJI5 = C2095008Iq.LJIIJJI(str2)) != null) {
                        numValueOf3 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI5)));
                    } else {
                        numValueOf3 = null;
                    }
                    String str3 = padding.end;
                    if (str3 != null && (numLJIIJJI4 = C2095008Iq.LJIIJJI(str3)) != null) {
                        numValueOf4 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI4)));
                    } else {
                        numValueOf4 = null;
                    }
                    String str4 = padding.bottom;
                    if (str4 != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(str4)) != null) {
                        numValueOf5 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI3)));
                    } else {
                        numValueOf5 = null;
                    }
                    C426750GoL.LJIIL(constraintLayout2, numValueOf2, numValueOf3, numValueOf4, numValueOf5, 16);
                }
            }
            if (z && (constraintLayout = (ConstraintLayout) view) != null) {
                LinearLayout linearLayout = new LinearLayout(constraintLayout.getContext());
                linearLayout.setId(View.generateViewId());
                linearLayout.setOrientation(1);
                C786410Ut5.d6(linearLayout, new C19ME(-2, -2));
                int id = linearLayout.getId();
                TextDO title = iconTextCardDO2.getTitle();
                int i = 0;
                int i2 = 6;
                if (title != null) {
                    TuxTextView tuxTextView = new TuxTextView(constraintLayout.getContext(), attributeSet, i2, i);
                    C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
                    C1721300utU.LIZ.getClass();
                    C1721300utU.LJIL(null, title, tuxTextView);
                    linearLayout.addView(tuxTextView);
                }
                TextDO subTitle = iconTextCardDO2.getSubTitle();
                if (subTitle != null) {
                    TuxTextView tuxTextView2 = new TuxTextView(constraintLayout.getContext(), attributeSet, i2, i);
                    C786410Ut5.R6(tuxTextView2, new LinearLayout.LayoutParams(-2, -2));
                    C1721300utU.LIZ.getClass();
                    C1721300utU.LJIL(null, subTitle, tuxTextView2);
                    String titleSpace = iconTextCardDO2.getTitleSpace();
                    if (titleSpace != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(titleSpace)) != null) {
                        numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI2)));
                    } else {
                        numValueOf = null;
                    }
                    C426750GoL.LJIIIZ(tuxTextView2, null, numValueOf, null, null, false, 29);
                    linearLayout.addView(tuxTextView2);
                }
                constraintLayout.addView(linearLayout);
                if (iconTextCardDO2.getIcon() == null) {
                    C19MB c19mb = new C19MB();
                    c19mb.LJII(constraintLayout);
                    LJI(id, c19mb);
                    c19mb.LJIIIIZZ(id, 6, 0, 6);
                    c19mb.LJIIIIZZ(id, 7, 0, 7);
                    c19mb.LJIIIIZZ(id, 3, 0, 3);
                    c19mb.LJIIIIZZ(id, 4, 0, 4);
                    c19mb.LJIILL(id, 0);
                    c19mb.LJIIJ(id);
                    c19mb.LJJII(0.0f, id);
                    c19mb.LIZIZ(constraintLayout);
                    return;
                }
                TuxIconView tuxIconView = new TuxIconView(constraintLayout.getContext(), null, 0, 6, null);
                tuxIconView.setId(View.generateViewId());
                int id2 = tuxIconView.getId();
                C1721300utU c1721300utU = C1721300utU.LIZ;
                ImageDO icon = iconTextCardDO2.getIcon();
                c1721300utU.getClass();
                C1721300utU.LJIJI(tuxIconView, icon, null);
                constraintLayout.addView(tuxIconView);
                C1721400ute c1721400ute = EnumC1757780vqK.Companion;
                String iconPosition = iconTextCardDO2.getIconPosition();
                c1721400ute.getClass();
                Iterator<EnumC1757780vqK> it2 = EnumC1757780vqK.getEntries().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.getValue(), iconPosition)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                EnumC1757780vqK enumC1757780vqK = next;
                if (enumC1757780vqK == null) {
                    enumC1757780vqK = EnumC1757780vqK.TOP_CENTER;
                }
                C19MB c19mb2 = new C19MB();
                c19mb2.LJII(constraintLayout);
                LJI(id2, c19mb2);
                LJI(id, c19mb2);
                String iconSpace = iconTextCardDO2.getIconSpace();
                if (iconSpace != null && (numLJIIJJI = C2095008Iq.LJIIJJI(iconSpace)) != null) {
                    iIntValue = numLJIIJJI.intValue();
                } else {
                    iIntValue = 0;
                }
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
                int[] iArr = C1757790vqL.LIZ;
                switch (iArr[enumC1757780vqK.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        c19mb2.LJIIIIZZ(id2, 6, 0, 6);
                        c19mb2.LJIIIZ(id, 6, id2, 7, iLIZIZ);
                        c19mb2.LJIIIIZZ(id, 7, 0, 7);
                        c19mb2.LJIILL(id, 0);
                        c19mb2.LJIIJ(id);
                        c19mb2.LJJII(0.0f, id);
                        c19mb2.LJIIIIZZ(id, 3, 0, 3);
                        c19mb2.LJIIIIZZ(id, 4, 0, 4);
                        c19mb2.LJJIIZ(0.5f, id);
                        int i3 = iArr[enumC1757780vqK.ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    c19mb2.LJIIIIZZ(id2, 4, id, 4);
                                }
                            } else {
                                c19mb2.LJIIIIZZ(id2, 3, id, 3);
                                c19mb2.LJIIIIZZ(id2, 4, id, 4);
                            }
                        } else {
                            c19mb2.LJIIIIZZ(id2, 3, id, 3);
                        }
                        break;
                    case 4:
                    case 5:
                    case 6:
                        c19mb2.LJIIIIZZ(id, 6, 0, 6);
                        c19mb2.LJIIIZ(id, 7, id2, 6, iLIZIZ);
                        c19mb2.LJIIIIZZ(id2, 7, 0, 7);
                        c19mb2.LJIILL(id, 0);
                        c19mb2.LJIIJ(id);
                        c19mb2.LJJII(0.0f, id);
                        c19mb2.LJIIIIZZ(id, 3, 0, 3);
                        c19mb2.LJIIIIZZ(id, 4, 0, 4);
                        int i4 = iArr[enumC1757780vqK.ordinal()];
                        if (i4 != 4) {
                            if (i4 != 5) {
                                if (i4 == 6) {
                                    c19mb2.LJIIIIZZ(id2, 4, id, 4);
                                }
                            } else {
                                c19mb2.LJIIIIZZ(id2, 3, id, 3);
                                c19mb2.LJIIIIZZ(id2, 4, id, 4);
                            }
                        } else {
                            c19mb2.LJIIIIZZ(id2, 3, id, 3);
                        }
                        break;
                    case 7:
                    case 8:
                    case BdTuring.TYPE_ECAF /* 9 */:
                        c19mb2.LJIIIIZZ(id2, 3, 0, 3);
                        c19mb2.LJIIIZ(id, 3, id2, 4, iLIZIZ);
                        c19mb2.LJIIIIZZ(id, 7, 0, 7);
                        c19mb2.LJIILL(id, 0);
                        c19mb2.LJIIJ(id);
                        int i5 = iArr[enumC1757780vqK.ordinal()];
                        if (i5 != 7) {
                            if (i5 != 8) {
                                if (i5 == 9) {
                                    c19mb2.LJIIIIZZ(id2, 7, id, 7);
                                    c19mb2.LJIIIIZZ(id, 6, 0, 6);
                                    c19mb2.LJJII(1.0f, id);
                                }
                            } else {
                                c19mb2.LJIIIIZZ(id2, 6, id, 6);
                                c19mb2.LJIIIIZZ(id2, 7, id, 7);
                                c19mb2.LJIIIIZZ(id, 6, 0, 6);
                                c19mb2.LJJII(0.5f, id);
                            }
                        } else {
                            c19mb2.LJIIIIZZ(id2, 6, id, 6);
                            c19mb2.LJIIIIZZ(id, 6, 0, 6);
                            c19mb2.LJJII(0.0f, id);
                        }
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    case BdTuring.TYPE_EMAIL /* 11 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        c19mb2.LJIIIIZZ(id, 3, 0, 3);
                        c19mb2.LJIIIZ(id2, 3, id, 4, iLIZIZ);
                        c19mb2.LJIIIIZZ(id2, 4, 0, 4);
                        c19mb2.LJIIIIZZ(id, 7, 0, 7);
                        c19mb2.LJIILL(id, 0);
                        c19mb2.LJIIJ(id);
                        switch (iArr[enumC1757780vqK.ordinal()]) {
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                c19mb2.LJIIIIZZ(id2, 6, id, 6);
                                c19mb2.LJIIIIZZ(id, 6, 0, 6);
                                c19mb2.LJJII(0.0f, id);
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                c19mb2.LJIIIIZZ(id2, 6, id, 6);
                                c19mb2.LJIIIIZZ(id2, 7, id, 7);
                                c19mb2.LJIIIIZZ(id, 6, 0, 6);
                                c19mb2.LJJII(0.5f, id);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                c19mb2.LJIIIIZZ(id2, 7, id, 7);
                                c19mb2.LJIIIIZZ(id, 6, 0, 6);
                                c19mb2.LJJII(1.0f, id);
                                break;
                        }
                        break;
                    default:
                        throw new C1954807lC();
                }
                c19mb2.LIZIZ(constraintLayout);
            }
        }
    }
}
