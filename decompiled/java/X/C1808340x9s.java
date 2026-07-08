package X;

import Y.ARunnableS0S1201000_4;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0x9s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1808340x9s {
    public static final Regex LIZ = new Regex("</?tag\\d*(?:\\s[^>]*)?>", EnumC688760Qzy.IGNORE_CASE);

    public static int LJI(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    public static String LIZJ(String str) {
        String string;
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null && string.length() > 0) {
            return string;
        }
        return null;
    }

    public static void LIZ(View view, AbstractC1802140wzs abstractC1802140wzs) {
        C1331670kl3 c1331670kl3LJFF;
        String strLIZ;
        int iIntValue;
        int i;
        int iIntValue2;
        AbstractC1556490qbf abstractC1556490qbf = abstractC1802140wzs.LIZJ;
        View viewFindViewById = view.findViewById(R.id.og5);
        View viewFindViewById2 = view.findViewById(R.id.og0);
        View viewFindViewById3 = view.findViewById(R.id.og_);
        C1295960jpS c1295960jpS = (C1295960jpS) view.findViewById(R.id.og6);
        if (abstractC1556490qbf instanceof C1556500qbg) {
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById2);
            }
            if (viewFindViewById3 != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById3);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, viewFindViewById3.getContext());
                if (numLIZJ != null) {
                    iIntValue2 = numLIZJ.intValue();
                } else {
                    iIntValue2 = -1;
                }
                viewFindViewById3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{(C13LZ.LJ(0, 0, 255) << 24) | (iIntValue2 & 16777215), iIntValue2}));
            }
            C1556500qbg c1556500qbg = (C1556500qbg) abstractC1556490qbf;
            if (C960203pA.LIZIZ(view.getContext())) {
                i = c1556500qbg.LIZIZ;
            } else {
                i = c1556500qbg.LIZ;
            }
            if (c1295960jpS != null) {
                C786410Ut5.LLD(0, c1295960jpS);
                c1295960jpS.setRepeatCount(-1);
                if (!Intrinsics.LJFF(c1295960jpS.getTag(R.id.og6), Integer.valueOf(i))) {
                    c1295960jpS.cancelAnimation();
                    c1295960jpS.setAnimation(i);
                    c1295960jpS.setTag(R.id.og6, Integer.valueOf(i));
                }
                c1295960jpS.playAnimation();
            }
        } else if (abstractC1556490qbf instanceof C1556480qbe) {
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            if (c1295960jpS != null) {
                c1295960jpS.cancelAnimation();
                C786410Ut5.LLD(8, c1295960jpS);
            }
            if (viewFindViewById3 != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById3);
            }
            if (viewFindViewById2 != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            }
            String str = ((C1556480qbe) abstractC1556490qbf).LIZ;
            SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.ofv);
            if (smartImageView != null) {
                C786410Ut5.LLFF(0, smartImageView);
                String strLIZJ = LIZJ(str);
                if (strLIZJ != null) {
                    c1331670kl3LJFF = C1331660kl2.LJIIIZ(strLIZJ);
                    c1331670kl3LJFF.LJJIIZ(R.drawable.cn0);
                    c1331670kl3LJFF.LJIJJLI(R.drawable.cn0);
                } else {
                    c1331670kl3LJFF = C1331660kl2.LJFF(R.drawable.cn0);
                }
                c1331670kl3LJFF.LIZLLL("MinisRevisitAddToHomeGameIcon");
                c1331670kl3LJFF.LJJ(smartImageView);
                c1331670kl3LJFF.LJIIJ(new C1077110e8T(smartImageView, 1));
            }
        } else {
            throw new C1954807lC();
        }
        C1808350x9t c1808350x9t = abstractC1802140wzs.LJIIJ;
        View viewFindViewById4 = view.findViewById(R.id.og1);
        if (viewFindViewById4 != null) {
            LJFF(c1808350x9t.LIZ, viewFindViewById4);
        }
        View viewFindViewById5 = view.findViewById(R.id.og9);
        if (viewFindViewById5 != null) {
            LIZLLL(c1808350x9t.LIZIZ, viewFindViewById5);
        }
        View viewFindViewById6 = view.findViewById(R.id.og3);
        if (viewFindViewById6 != null) {
            LJFF(c1808350x9t.LJ, viewFindViewById6);
            viewFindViewById6.setPadding(viewFindViewById6.getPaddingLeft(), LJI(viewFindViewById6.getResources().getDisplayMetrics().density, c1808350x9t.LJFF), viewFindViewById6.getPaddingRight(), viewFindViewById6.getPaddingBottom());
        }
        View viewFindViewById7 = view.findViewById(R.id.ogc);
        if (viewFindViewById7 != null) {
            viewFindViewById7.setMinimumHeight(LJI(viewFindViewById7.getResources().getDisplayMetrics().density, c1808350x9t.LJII));
        }
        View viewFindViewById8 = view.findViewById(R.id.oge);
        if (viewFindViewById8 != null) {
            LJ(c1808350x9t.LJIIIZ, viewFindViewById8);
        }
        View viewFindViewById9 = view.findViewById(R.id.og8);
        if (viewFindViewById9 != null) {
            LIZLLL(c1808350x9t.LJIIJ, viewFindViewById9);
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ogd);
        if (tuxTextView != null) {
            TuxTextView.LJJJJ(tuxTextView, 28.0f, abstractC1802140wzs.LJIIJ.LIZLLL, tuxTextView.getTypeface(), 0.0f);
            tuxTextView.setMaxLines(abstractC1802140wzs.LJIIJ.LIZJ);
            int iLJI = LJI(tuxTextView.getResources().getDisplayMetrics().density, abstractC1802140wzs.LJIIJ.LJI);
            tuxTextView.setPadding(iLJI, tuxTextView.getPaddingTop(), iLJI, tuxTextView.getPaddingBottom());
            tuxTextView.setText(abstractC1802140wzs.LIZLLL.LIZ(view.getContext()));
        }
        C990170bsF c990170bsF = abstractC1802140wzs.LJ;
        int i2 = abstractC1802140wzs.LJIIJ.LJIIIIZZ;
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.og7);
        if (tuxTextView2 != null) {
            tuxTextView2.LJJJJI(13.0f);
            LJ(i2, tuxTextView2);
            if (c990170bsF == null || (strLIZ = c990170bsF.LIZ(view.getContext())) == null) {
                strLIZ = "";
            }
            if (strLIZ.length() == 0) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
                tuxTextView2.setText("");
            } else {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                for (MatchResult matchResult : Regex.findAll$default(LIZ, strLIZ, 0, 2, null)) {
                    int i4 = matchResult.LIZIZ().LL;
                    if (i4 > i3) {
                        spannableStringBuilder.append((CharSequence) strLIZ.substring(i3, i4));
                    }
                    if (u.LJJIIJZLJL(matchResult.getValue(), "</", false)) {
                        if ((!arrayList.isEmpty()) && spannableStringBuilder.length() > (iIntValue = ((Number) ListProtector.remove(arrayList, arrayList.size() - 1)).intValue())) {
                            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(62, true), iIntValue, spannableStringBuilder.length(), 33);
                        }
                    } else {
                        arrayList.add(Integer.valueOf(spannableStringBuilder.length()));
                    }
                    i3 = matchResult.LIZIZ().LLILLJJLI + 1;
                }
                if (i3 < strLIZ.length()) {
                    spannableStringBuilder.append((CharSequence) strLIZ.substring(i3));
                }
                tuxTextView2.setText(spannableStringBuilder);
            }
        }
        TextView textView = (TextView) view.findViewById(R.id.og4);
        if (textView != null) {
            textView.setText(abstractC1802140wzs.LJFF.LIZ(view.getContext()));
        }
        TextView textView2 = (TextView) view.findViewById(R.id.ogb);
        if (textView2 != null) {
            textView2.setMinHeight(0);
            textView2.setMinimumHeight(0);
            textView2.setGravity(81);
            C990170bsF c990170bsF2 = abstractC1802140wzs.LJI;
            if (c990170bsF2 == null) {
                C786410Ut5.LLIL(textView2, 8);
            } else {
                C786410Ut5.LLIL(textView2, 0);
                textView2.setText(c990170bsF2.LIZ(view.getContext()));
            }
        }
        C990190bsH c990190bsH = abstractC1802140wzs.LJIIIZ;
        if (c990190bsH != null) {
            View viewFindViewById10 = view.findViewById(R.id.oge);
            if (viewFindViewById10 != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById10);
            }
            LIZIZ(view, "MinisRevisitRewardFallback", null);
            TextView textView3 = (TextView) view.findViewById(R.id.ogi);
            if (textView3 != null) {
                textView3.setText(c990190bsH.LIZ.LIZ(view.getContext()));
                C786410Ut5.LLIL(textView3, 0);
            }
            TextView textView4 = (TextView) view.findViewById(R.id.ogh);
            if (textView4 != null) {
                textView4.setText(c990190bsH.LIZIZ.LIZ(view.getContext()));
                C786410Ut5.LLIL(textView4, 0);
                return;
            }
            return;
        }
        View viewFindViewById11 = view.findViewById(R.id.oge);
        if (viewFindViewById11 != null) {
            C786410Ut5.LJLLLLLL(4, viewFindViewById11);
        }
        SmartImageView smartImageView2 = (SmartImageView) view.findViewById(R.id.ogg);
        if (smartImageView2 != null) {
            smartImageView2.setTag(R.id.ogg, null);
            smartImageView2.setImageDrawable(null);
            C786410Ut5.LLFF(4, smartImageView2);
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.ogf);
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 4);
        }
        TextView textView5 = (TextView) view.findViewById(R.id.ogi);
        if (textView5 != null) {
            textView5.setText("");
        }
        TextView textView6 = (TextView) view.findViewById(R.id.ogh);
        if (textView6 == null) {
            return;
        }
        textView6.setText("");
    }

    public static void LIZLLL(int i, View view) {
        float f = view.getResources().getDisplayMetrics().density;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, LJI(f, i));
        }
        layoutParams.height = LJI(f, i);
        C786410Ut5.W5(view, layoutParams);
    }

    public static void LJ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = LJI(view.getResources().getDisplayMetrics().density, i);
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    public static void LJFF(int i, View view) {
        view.setMinimumHeight(LJI(view.getResources().getDisplayMetrics().density, i));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        layoutParams.height = -2;
        C786410Ut5.W5(view, layoutParams);
    }

    public static void LIZIZ(View view, String str, String str2) {
        final SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.ogg);
        if (smartImageView == null) {
            return;
        }
        final TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.ogf);
        final String strLIZJ = LIZJ(str2);
        smartImageView.setTag(R.id.ogg, strLIZJ);
        smartImageView.setImageDrawable(null);
        if (strLIZJ == null) {
            C786410Ut5.LLFF(4, smartImageView);
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                return;
            }
            return;
        }
        C786410Ut5.LLFF(0, smartImageView);
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(strLIZJ);
        c1331670kl3LJIIIZ.LIZLLL(str);
        c1331670kl3LJIIIZ.LJJ(smartImageView);
        c1331670kl3LJIIIZ.LJIIJ(new AbstractC1335900krs() { // from class: X.0DM0
            public final /* synthetic */ int LLILLJJLI = R.id.ogg;

            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view2, Throwable th) {
                SmartImageView smartImageView2 = smartImageView;
                HandlerHook.viewPost(smartImageView2, new ARunnableS0S1201000_4(smartImageView2, this.LLILLJJLI, strLIZJ, tuxIconView, 3));
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view2, C428600GrK c428600GrK, Animatable animatable) {
                SmartImageView smartImageView2 = smartImageView;
                HandlerHook.viewPost(smartImageView2, new ARunnableS0S1201000_4(smartImageView2, this.LLILLJJLI, strLIZJ, tuxIconView, 2));
            }
        });
    }
}
