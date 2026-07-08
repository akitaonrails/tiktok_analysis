package X;

import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.Regex;
import kotlin.text.a0;
import webcast.api.sub.GetSubPrivilegeDetailResponse;
import webcast.api.sub.RelationSummary;

/* JADX INFO: renamed from: X.0JyH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509350JyH extends AbstractC508030Jw9<C509130Jxv> {
    public final ViewGroup LLILLJJLI;
    public final ViewGroup LLILLL;
    public final ViewGroup LLILZ;
    public final TextView LLILZIL;
    public final ViewGroup LLILZLL;
    public final TextView LLIZ;
    public final TextView LLIZLLLIL;
    public final TextView LLJ;
    public final TextView LLJI;
    public final TextView LLJIJIL;
    public final TextView LLJILJIL;

    public C509350JyH(View view) {
        super(view);
        this.LLILLJJLI = (ViewGroup) view.findViewById(R.id.igi);
        this.LLILLL = (ViewGroup) view.findViewById(R.id.viewing_block);
        this.LLILZ = (ViewGroup) view.findViewById(R.id.sqg);
        this.LLILZIL = (TextView) view.findViewById(R.id.t4n);
        this.LLILZLL = (ViewGroup) view.findViewById(R.id.o_t);
        this.LLIZ = (TextView) view.findViewById(R.id.igl);
        this.LLIZLLLIL = (TextView) view.findViewById(R.id.igv);
        this.LLJ = (TextView) view.findViewById(R.id.viewing_data);
        this.LLJI = (TextView) view.findViewById(R.id.viewing_text);
        this.LLJIJIL = (TextView) view.findViewById(R.id.sqm);
        this.LLJILJIL = (TextView) view.findViewById(R.id.sr7);
    }

    @Override // X.C0K07
    public final void I5(InterfaceC515600KJy interfaceC515600KJy) {
        RelationSummary relationSummary;
        int i;
        SpannableString spannableStringS5;
        C507580JvQ c507580JvQ = (C507580JvQ) interfaceC515600KJy;
        R5(c507580JvQ);
        GetSubPrivilegeDetailResponse.Data data = c507580JvQ.LLILZ;
        if (data != null && (relationSummary = data.relationSummary) != null) {
            TextView textView = this.LLILZIL;
            if (textView != null) {
                textView.setText(C497740JfY.LJIJJ(2131855388, C0KVU.LIZ(data.anchorDetail), 90));
            }
            ViewGroup viewGroup = this.LLILZLL;
            if (viewGroup != null) {
                viewGroup.setBackground(C507390Jv7.LIZ((int) C497740JfY.LIZIZ(12.0f), 0, C20736316Cj.LIZIZ(R.attr.ey8, this.itemView.getContext()), (int) C497740JfY.LIZIZ(0.5f)));
            }
            long j = relationSummary.totalViewTimeSec;
            if (j > 0) {
                long j2 = j / ((long) 60);
                long j3 = j / ((long) 3600);
                TextView textView2 = this.LLJ;
                if (textView2 != null) {
                    if (j2 < 999) {
                        spannableStringS5 = S5(String.valueOf(j2), C497740JfY.LJIJJ(2131855386, Integer.valueOf((int) j2)));
                    } else {
                        spannableStringS5 = S5(String.valueOf(j3), C497740JfY.LJIJJ(2131855385, Integer.valueOf((int) j3)));
                    }
                    textView2.setText(spannableStringS5);
                }
                TextView textView3 = this.LLJI;
                if (textView3 != null) {
                    textView3.setText(C497740JfY.LJIJI(2131855390));
                }
                i = 1;
            } else {
                C500260Jjc.LJIILIIL(this.LLILLL);
                i = 0;
            }
            long j4 = relationSummary.viewDurationHostRank;
            if (j4 > 0) {
                String strLJIJJ = C497740JfY.LJIJJ(2131855387, Long.valueOf(j4));
                TextView textView4 = this.LLJIJIL;
                if (textView4 != null) {
                    textView4.setText(S5(String.valueOf(relationSummary.viewDurationHostRank), strLJIJJ));
                }
                TextView textView5 = this.LLJILJIL;
                if (textView5 != null) {
                    textView5.setText(C497740JfY.LJIJI(2131855389));
                }
                i++;
            } else {
                C500260Jjc.LJIILIIL(this.LLILZ);
            }
            long j5 = relationSummary.followDays;
            if (j5 > 0) {
                TextView textView6 = this.LLIZ;
                if (textView6 != null) {
                    textView6.setText(S5(String.valueOf(j5), C497740JfY.LJIJJ(2131855383, Integer.valueOf((int) relationSummary.followDays))));
                }
                TextView textView7 = this.LLIZLLLIL;
                if (textView7 != null) {
                    textView7.setText(C497740JfY.LJIJI(2131855384));
                }
                i++;
            } else {
                C500260Jjc.LJIILIIL(this.LLILLJJLI);
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        final ViewGroup viewGroup2 = this.LLILLL;
                        C786410Ut5.x3(viewGroup2.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0JyI
                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public final void onGlobalLayout() {
                                C509350JyH c509350JyH = this;
                                List listLJIIJJI = C1697810uHb.LJIIJJI(c509350JyH.LLILLJJLI, c509350JyH.LLILLL, c509350JyH.LLILZ);
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : listLJIIJJI) {
                                    if (((View) obj).getWidth() > 0) {
                                        arrayList.add(obj);
                                    }
                                }
                                if (arrayList.size() == 3) {
                                    C509350JyH.T5(c509350JyH, ((C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(64.0f))) - ((c509350JyH.LLILLJJLI.getMeasuredWidth() + c509350JyH.LLILLL.getMeasuredWidth()) + c509350JyH.LLILZ.getMeasuredWidth())) / 2);
                                }
                                C786410Ut5.C3(viewGroup2.getViewTreeObserver(), this);
                            }
                        });
                        final ViewGroup viewGroup3 = this.LLILLJJLI;
                        C786410Ut5.x3(viewGroup3.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0JyI
                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public final void onGlobalLayout() {
                                C509350JyH c509350JyH = this;
                                List listLJIIJJI = C1697810uHb.LJIIJJI(c509350JyH.LLILLJJLI, c509350JyH.LLILLL, c509350JyH.LLILZ);
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : listLJIIJJI) {
                                    if (((View) obj).getWidth() > 0) {
                                        arrayList.add(obj);
                                    }
                                }
                                if (arrayList.size() == 3) {
                                    C509350JyH.T5(c509350JyH, ((C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(64.0f))) - ((c509350JyH.LLILLJJLI.getMeasuredWidth() + c509350JyH.LLILLL.getMeasuredWidth()) + c509350JyH.LLILZ.getMeasuredWidth())) / 2);
                                }
                                C786410Ut5.C3(viewGroup3.getViewTreeObserver(), this);
                            }
                        });
                        final ViewGroup viewGroup4 = this.LLILZ;
                        C786410Ut5.x3(viewGroup4.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0JyI
                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public final void onGlobalLayout() {
                                C509350JyH c509350JyH = this;
                                List listLJIIJJI = C1697810uHb.LJIIJJI(c509350JyH.LLILLJJLI, c509350JyH.LLILLL, c509350JyH.LLILZ);
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : listLJIIJJI) {
                                    if (((View) obj).getWidth() > 0) {
                                        arrayList.add(obj);
                                    }
                                }
                                if (arrayList.size() == 3) {
                                    C509350JyH.T5(c509350JyH, ((C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(64.0f))) - ((c509350JyH.LLILLJJLI.getMeasuredWidth() + c509350JyH.LLILLL.getMeasuredWidth()) + c509350JyH.LLILZ.getMeasuredWidth())) / 2);
                                }
                                C786410Ut5.C3(viewGroup4.getViewTreeObserver(), this);
                            }
                        });
                        return;
                    }
                    return;
                }
                T5(this, (int) C497740JfY.LIZIZ(32.0f));
                return;
            }
            T5(this, 0);
        }
    }

    @Override // X.AbstractC508030Jw9
    public final Map P5(C507580JvQ c507580JvQ) {
        ArrayList arrayList = new ArrayList();
        RelationSummary relationSummary = c507580JvQ.LLILZ.relationSummary;
        if (relationSummary != null) {
            if (relationSummary.followDays > 0) {
                arrayList.add("follow_time");
            }
            if (relationSummary.totalViewTimeSec > 0) {
                arrayList.add("view_duration");
            }
            if (relationSummary.viewDurationHostRank > 0) {
                arrayList.add("anchor_rank");
            }
        }
        return C2097908Jt.LIZJ(new Pair("relation_value", C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, null, 63)));
    }

    public static SpannableString S5(String str, String str2) {
        String strReplace = new Regex("٠").replace(new Regex("٩").replace(new Regex("٨").replace(new Regex("٧").replace(new Regex("٦").replace(new Regex("٥").replace(new Regex("٤").replace(new Regex("٣").replace(new Regex("٢").replace(new Regex("١").replace(str2, "1"), "2"), "3"), "4"), "5"), "6"), "7"), "8"), "9"), CardStruct.IStatusCode.DEFAULT);
        SpannableString spannableString = new SpannableString(strReplace);
        str.toString();
        int iLJJJ = a0.LJJJ(strReplace, str, 0, false, 6);
        if (iLJJJ >= 0) {
            C1119920fFW.LJIIIIZZ(spannableString, iLJJJ, str.length() + iLJJJ, 33, OppoPermissionPopupMaskDelayExp.DEFAULT);
            C786410Ut5.p2(spannableString, new RelativeSizeSpan(1.25f), iLJJJ, str.length() + iLJJJ, 33);
        }
        return spannableString;
    }

    public static final void T5(C509350JyH c509350JyH, int i) {
        int iLIZIZ;
        int i2 = 0;
        List listLJIIJJI = C1697810uHb.LJIIJJI(c509350JyH.LLILLJJLI, c509350JyH.LLILLL, c509350JyH.LLILZ);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIIJJI) {
            if (C500260Jjc.LJJJJIZL((View) obj)) {
                arrayList.add(obj);
            }
        }
        for (Object obj2 : arrayList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                View view = (View) obj2;
                if (i2 != 0) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (i < 0) {
                            iLIZIZ = (int) C497740JfY.LIZIZ(8.0f);
                        } else {
                            iLIZIZ = i;
                        }
                        marginLayoutParams.setMarginStart(iLIZIZ);
                        C786410Ut5.W5(view, marginLayoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
