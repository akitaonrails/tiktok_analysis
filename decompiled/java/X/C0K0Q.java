package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS13S2000000_7;
import kotlin.text.Regex;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;
import webcast.api.pgc_sub.PGCRelationSummary;

/* JADX INFO: renamed from: X.0K0Q, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K0Q extends C0K1I<C0K0H> {
    public final ViewGroup LLILLJJLI;
    public final ViewGroup LLILLL;
    public final ViewGroup LLILZ;
    public final TuxTextView LLILZIL;
    public final ViewGroup LLILZLL;
    public final TuxTextView LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final TuxTextView LLJ;
    public final TuxTextView LLJI;
    public final TuxTextView LLJIJIL;
    public final TuxTextView LLJILJIL;

    public C0K0Q(View view) {
        super(view);
        this.LLILLJJLI = (ViewGroup) view.findViewById(R.id.igi);
        this.LLILLL = (ViewGroup) view.findViewById(R.id.viewing_block);
        this.LLILZ = (ViewGroup) view.findViewById(R.id.sqg);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.t4n);
        this.LLILZLL = (ViewGroup) view.findViewById(R.id.o_t);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.igl);
        this.LLIZLLLIL = (TuxTextView) view.findViewById(R.id.igv);
        this.LLJ = (TuxTextView) view.findViewById(R.id.viewing_data);
        this.LLJI = (TuxTextView) view.findViewById(R.id.viewing_text);
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.sqm);
        this.LLJILJIL = (TuxTextView) view.findViewById(R.id.sr7);
    }

    @Override // X.AbstractC339560DSw
    public final void I5(InterfaceC339570DSx interfaceC339570DSx) {
        PGCRelationSummary pGCRelationSummary;
        int i;
        CharSequence charSequenceR5;
        C510480K0g c510480K0g = (C510480K0g) interfaceC339570DSx;
        P5(c510480K0g);
        PGCGetSubPrivilegeDetailResponse.Data data = c510480K0g.LIZLLL;
        if (data != null && (pGCRelationSummary = data.relationSummary) != null) {
            TuxTextView tuxTextView = this.LLILZIL;
            String str = "";
            if (tuxTextView != null) {
                String strLJIIIIZZ = C511520K4g.LJIIIIZZ(2131839402, C0K7S.LIZ(data.anchorDetail), 90);
                if (strLJIIIIZZ == null) {
                    strLJIIIIZZ = "";
                }
                tuxTextView.setText(strLJIIIIZZ);
            }
            ViewGroup viewGroup = this.LLILZLL;
            if (viewGroup != null) {
                viewGroup.setBackground(C510570K0p.LIZ((int) C511520K4g.LIZ(12.0f), 0, C426930God.LIZ(R.attr.f_u, this.itemView.getContext()), (int) C511520K4g.LIZ(0.5f)));
            }
            long j = pGCRelationSummary.totalViewTimeSec;
            if (j > 0) {
                long j2 = j / ((long) 60);
                long j3 = j / ((long) 3600);
                TuxTextView tuxTextView2 = this.LLJ;
                if (tuxTextView2 != null) {
                    if (j2 < 999) {
                        String strValueOf = String.valueOf(j2);
                        String strLJIIIIZZ2 = C511520K4g.LJIIIIZZ(2131839400, Integer.valueOf((int) j2));
                        if (strLJIIIIZZ2 == null) {
                            strLJIIIIZZ2 = "";
                        }
                        charSequenceR5 = R5(strValueOf, strLJIIIIZZ2);
                    } else {
                        String strValueOf2 = String.valueOf(j3);
                        String strLJIIIIZZ3 = C511520K4g.LJIIIIZZ(2131839399, Integer.valueOf((int) j3));
                        if (strLJIIIIZZ3 == null) {
                            strLJIIIIZZ3 = "";
                        }
                        charSequenceR5 = R5(strValueOf2, strLJIIIIZZ3);
                    }
                    tuxTextView2.setText(charSequenceR5);
                }
                TuxTextView tuxTextView3 = this.LLJI;
                if (tuxTextView3 != null) {
                    String strLJII = C511520K4g.LJII(2131839404);
                    if (strLJII == null) {
                        strLJII = "";
                    }
                    tuxTextView3.setText(strLJII);
                }
                i = 1;
            } else {
                C0K0R.LIZ(this.LLILLL);
                i = 0;
            }
            long j4 = pGCRelationSummary.viewDurationHostRank;
            if (j4 > 0) {
                String strLJIIIIZZ4 = C511520K4g.LJIIIIZZ(2131839401, Long.valueOf(j4));
                if (strLJIIIIZZ4 == null) {
                    strLJIIIIZZ4 = "";
                }
                TuxTextView tuxTextView4 = this.LLJIJIL;
                if (tuxTextView4 != null) {
                    tuxTextView4.setText(R5(String.valueOf(pGCRelationSummary.viewDurationHostRank), strLJIIIIZZ4));
                }
                TuxTextView tuxTextView5 = this.LLJILJIL;
                if (tuxTextView5 != null) {
                    String strLJII2 = C511520K4g.LJII(2131839403);
                    if (strLJII2 == null) {
                        strLJII2 = "";
                    }
                    tuxTextView5.setText(strLJII2);
                }
                i++;
            } else {
                C0K0R.LIZ(this.LLILZ);
            }
            long j5 = pGCRelationSummary.followDays;
            if (j5 > 0) {
                TuxTextView tuxTextView6 = this.LLIZ;
                if (tuxTextView6 != null) {
                    String strValueOf3 = String.valueOf(j5);
                    String strLJIIIIZZ5 = C511520K4g.LJIIIIZZ(2131839397, Integer.valueOf((int) pGCRelationSummary.followDays));
                    if (strLJIIIIZZ5 == null) {
                        strLJIIIIZZ5 = "";
                    }
                    tuxTextView6.setText(R5(strValueOf3, strLJIIIIZZ5));
                }
                TuxTextView tuxTextView7 = this.LLIZLLLIL;
                if (tuxTextView7 != null) {
                    String strLJII3 = C511520K4g.LJII(2131839398);
                    if (strLJII3 != null) {
                        str = strLJII3;
                    }
                    tuxTextView7.setText(str);
                }
                i++;
            } else {
                C0K0R.LIZ(this.LLILLJJLI);
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        ViewGroup viewGroup2 = this.LLILLL;
                        C786410Ut5.x3(viewGroup2.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC521810KdH(viewGroup2, this, 0));
                        ViewGroup viewGroup3 = this.LLILLJJLI;
                        C786410Ut5.x3(viewGroup3.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC521810KdH(viewGroup3, this, 0));
                        ViewGroup viewGroup4 = this.LLILZ;
                        C786410Ut5.x3(viewGroup4.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC521810KdH(viewGroup4, this, 0));
                        return;
                    }
                    return;
                }
                S5(this, (int) C511520K4g.LIZ(32.0f));
                return;
            }
            S5(this, 0);
        }
    }

    @Override // X.C0K1I
    public final Map N5(C510480K0g c510480K0g) {
        ArrayList arrayList = new ArrayList();
        PGCRelationSummary pGCRelationSummary = c510480K0g.LIZLLL.relationSummary;
        if (pGCRelationSummary != null) {
            if (pGCRelationSummary.followDays > 0) {
                arrayList.add("follow_time");
            }
            if (pGCRelationSummary.totalViewTimeSec > 0) {
                arrayList.add("view_duration");
            }
            if (pGCRelationSummary.viewDurationHostRank > 0) {
                arrayList.add("anchor_rank");
            }
        }
        return C2097908Jt.LIZJ(new Pair("relation_value", C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, null, 63)));
    }

    public static CharSequence R5(String str, String str2) {
        String strReplace = new Regex("٠").replace(new Regex("٩").replace(new Regex("٨").replace(new Regex("٧").replace(new Regex("٦").replace(new Regex("٥").replace(new Regex("٤").replace(new Regex("٣").replace(new Regex("٢").replace(new Regex("١").replace(str2, "1"), "2"), "3"), "4"), "5"), "6"), "7"), "8"), "9"), CardStruct.IStatusCode.DEFAULT);
        return C510740K1g.LIZ(strReplace, 102, new AwS13S2000000_7(strReplace, str, 0));
    }

    public static final void S5(C0K0Q c0k0q, int i) {
        int iLIZ;
        int i2 = 0;
        List listLJIIJJI = C1697810uHb.LJIIJJI(c0k0q.LLILLJJLI, c0k0q.LLILLL, c0k0q.LLILZ);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIIJJI) {
            View view = (View) obj;
            C01GW c01gw = C0K51.LIZ;
            if (view != null && view.getVisibility() == 0) {
                arrayList.add(obj);
            }
        }
        for (Object obj2 : arrayList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                View view2 = (View) obj2;
                if (i2 != 0) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (i < 0) {
                            iLIZ = (int) C511520K4g.LIZ(8.0f);
                        } else {
                            iLIZ = i;
                        }
                        marginLayoutParams.setMarginStart(iLIZ);
                        C786410Ut5.W5(view2, marginLayoutParams);
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
