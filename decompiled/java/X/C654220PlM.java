package X;

import android.content.Context;
import android.text.SpannableString;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0PlM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C654220PlM extends C09AY implements Function1<C291001Au<? extends SearchTopBarStruct>, Unit> {
    public final /* synthetic */ TuxTextView LL;
    public final /* synthetic */ C654210PlL LLILLJJLI;
    public final /* synthetic */ TuxTextView LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C654220PlM(TuxTextView tuxTextView, C654210PlL c654210PlL, TuxTextView tuxTextView2) {
        super(1);
        this.LL = tuxTextView;
        this.LLILLJJLI = c654210PlL;
        this.LLILLL = tuxTextView2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C291001Au<? extends SearchTopBarStruct> c291001Au) {
        EntityCardTitle entityCardTitle;
        C654120PlC c654120PlC;
        TuxTextView tuxTextView;
        ?? arrayList;
        SearchTopBarStruct searchTopBarStruct = (SearchTopBarStruct) c291001Au.LIZ;
        if (searchTopBarStruct != null && (entityCardTitle = searchTopBarStruct.topCardInfo) != null) {
            C786410Ut5.LLLLZLL(this.LL, 0);
            C654190PlJ subTitle = entityCardTitle.getSubTitle();
            List<C654130PlD> list = subTitle.LIZIZ;
            if (list != null && !list.isEmpty()) {
                C654210PlL c654210PlL = this.LLILLJJLI;
                TuxTextView tuxTextView2 = this.LL;
                Context context = c654210PlL.LLILLL;
                if (context != null) {
                    List<C654130PlD> list2 = subTitle.LIZIZ;
                    if (list2 != null) {
                        arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                        Iterator<C654130PlD> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().LIZ);
                        }
                    } else {
                        arrayList = C13BV.INSTANCE;
                    }
                    if (!arrayList.isEmpty() && subTitle.LIZ.length() != 0) {
                        if (!a0.LJJIIZI(subTitle.LIZ, "%s", false)) {
                            tuxTextView2.setText(subTitle.LIZ);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            List<C654130PlD> list3 = subTitle.LIZIZ;
                            if (list3 != null) {
                                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                                int i = 0;
                                for (C654130PlD c654130PlD : list3) {
                                    int i2 = i + 1;
                                    if (i >= 0) {
                                        if (c654130PlD.LIZIZ) {
                                            arrayList2.add(Integer.valueOf(i));
                                        }
                                        arrayList3.add(Unit.LIZ);
                                        i = i2;
                                    } else {
                                        C1697810uHb.LJIJI();
                                        throw null;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            int size = arrayList.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                sb.append((String) ListProtector.get(arrayList, i3));
                                if (arrayList2.contains(Integer.valueOf(i3))) {
                                    sb.append("￼");
                                }
                                if (i3 != arrayList.size() - 1) {
                                    sb.append(", ");
                                }
                            }
                            SpannableString spannableString = new SpannableString(sb.toString());
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            c419910GdJ.LIZ = R.raw.icon_color_verified_badge;
                            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                            Iterator it3 = arrayList2.iterator();
                            int i4 = 0;
                            while (it3.hasNext()) {
                                if (((Number) it3.next()).intValue() == 0) {
                                    i4 = 0;
                                }
                                int iLJJJ = a0.LJJJ(spannableString, "￼", i4, false, 4);
                                i4 = iLJJJ + 1;
                                C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context);
                                c419890GdHLIZIZ.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), true);
                                C786410Ut5.p2(spannableString, c419890GdHLIZIZ, iLJJJ, i4, 33);
                            }
                            String strJ4 = C786410Ut5.j4(subTitle.LIZ, Arrays.copyOf(new Object[]{spannableString}, 1));
                            SpannableString spannableString2 = new SpannableString(strJ4);
                            int iLJJJ2 = a0.LJJJ(strJ4, spannableString.toString(), 0, false, 6);
                            C089E c089e = new C089E(spannableString.getSpans(0, spannableString.length(), Object.class));
                            while (c089e.hasNext()) {
                                Object next = c089e.next();
                                C786410Ut5.p2(spannableString2, next, spannableString.getSpanStart(next) + iLJJJ2, spannableString.getSpanEnd(next) + iLJJJ2, spannableString.getSpanFlags(next));
                            }
                            tuxTextView2.setText(spannableString2);
                        }
                    }
                }
            } else if (subTitle.LIZJ != null && ((Number) C07BO.LIZ.getValue()).intValue() != 0) {
                if (((Number) C07IS.LIZ.getValue()).intValue() == 1 && (tuxTextView = this.LLILLL) != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                }
                C654210PlL c654210PlL2 = this.LLILLJJLI;
                TuxTextView tuxTextView3 = this.LL;
                TuxTextView tuxTextView4 = this.LLILLL;
                if (!c654210PlL2.LLJJI) {
                    if (tuxTextView3 != null) {
                        tuxTextView3.setText(subTitle.LIZ);
                    }
                } else {
                    Context context2 = c654210PlL2.LLILLL;
                    if (context2 != null && (c654120PlC = subTitle.LIZJ) != null) {
                        if (tuxTextView3 != null) {
                            tuxTextView3.setText(C654250PlP.LIZ(context2, c654120PlC));
                        }
                        if (tuxTextView4 != null) {
                            tuxTextView4.setText(subTitle.LIZ);
                        }
                    }
                }
            } else {
                this.LL.setText(subTitle.LIZ);
            }
        }
        return Unit.LIZ;
    }
}
