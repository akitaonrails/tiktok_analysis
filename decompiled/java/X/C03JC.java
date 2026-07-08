package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import g1c.AjS10S0101000_1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.AwS130S0400000_1;
import kotlin.jvm.internal.AwS186S0101000_1;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03JC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03JC extends AbstractC2172971A2l<C03J5, C03JE> {
    public final C03JF LLILLJJLI;

    public C03JC(C03JF c03jf) {
        super(new C03JA());
        this.LLILLJJLI = c03jf;
    }

    public static final Map<String, Object> LLLIIIIL(C03J5 c03j5) {
        String str;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("rank", Integer.valueOf(c03j5.LJFF));
        pairArr[1] = new Pair("group_rank", Integer.valueOf(c03j5.LJI));
        if (c03j5.LJ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("is_default", str);
        pairArr[3] = new Pair("button_name", "info");
        return C2097608Jq.LJIIJ(pairArr);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        int i2;
        List<ECRichText> list;
        int iLIZIZ;
        C03JE c03je = (C03JE) viewHolder;
        if (i < getItemCount()) {
            C03J5 c03j5LLLFZ = LLLFZ(i);
            C03JC c03jc = c03je.LLILZLL;
            try {
                LinearLayout linearLayout = c03je.LLILZ;
                if (linearLayout != null) {
                    C786410Ut5.LJJJJJL(linearLayout);
                }
                C1748720vbi.LJFF(c03je.itemView, new AnonymousClass0482(), new AwS402S0200000_1(c03je, c03j5LLLFZ, 47), new AwS580S0100000_1(c03j5LLLFZ, 437));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                LogisticExpressionArea logisticExpressionArea = c03j5LLLFZ.LIZ;
                if (logisticExpressionArea != null && (list = logisticExpressionArea.logisticsDescriptions) != null) {
                    int i3 = 0;
                    for (ECRichText eCRichText : list) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            ECRichText eCRichText2 = eCRichText;
                            C118300cf c118300cf = new C118300cf();
                            LinearLayout linearLayout2 = c03je.LLILZ;
                            if (linearLayout2 != null) {
                                C03EF c03ef = new C03EF(c03je.itemView.getContext(), null, 6);
                                c03ef.setMaxLines(3);
                                if (i3 != 0) {
                                    iLIZIZ = C0H9H.LIZIZ(4);
                                } else {
                                    iLIZIZ = C0H9H.LIZIZ(0);
                                }
                                C426750GoL.LJIIL(c03ef, null, Integer.valueOf(iLIZIZ), null, null, 29);
                                eCRichText2.iconShowListener = new AwS130S0400000_1(c03ef, c118300cf, c03j5LLLFZ, c03jc, 10);
                                C03C8.LJ(c03ef, eCRichText2, "us_aggregate_logistics_panel", new AwS186S0101000_1(c03je, i, 0));
                                linearLayout2.addView(c03ef, layoutParams);
                            }
                            i3 = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                C1841350y17 c1841350y17 = c03je.LLILZIL;
                if (c1841350y17 != null) {
                    c1841350y17.setChecked(c03j5LLLFZ.LIZJ);
                }
                C1841350y17 c1841350y172 = c03je.LLILZIL;
                if (c1841350y172 != null) {
                    if (c03j5LLLFZ.LIZLLL) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    C786410Ut5.LJLLLLLL(i2, c1841350y172);
                }
                C1841350y17 c1841350y173 = c03je.LLILZIL;
                if (c1841350y173 != null) {
                    if (!c03j5LLLFZ.LJII) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1841350y173.setEnabled(z);
                }
                ConstraintLayout constraintLayout = c03je.LLILLL;
                if (constraintLayout != null) {
                    C786410Ut5.I7(new AjS10S0101000_1(c03je, i, 1), constraintLayout);
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C03JE c03je = new C03JE(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ape, viewGroup, false), this.LLILLJJLI);
        try {
            View view = c03je.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c03je.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c03je.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C03JE.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c03je.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c03je.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C03JE.class.getName();
        return c03je;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C03JE c03je = (C03JE) viewHolder;
        if (i < getItemCount()) {
            C03J5 c03j5LLLFZ = LLLFZ(i);
            if (list.isEmpty()) {
                super.onBindViewHolder(c03je, i, list);
                return;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), "select_diff")) {
                    boolean z = c03j5LLLFZ.LIZJ;
                    C1841350y17 c1841350y17 = c03je.LLILZIL;
                    if (c1841350y17 != null) {
                        c1841350y17.setChecked(z);
                    }
                }
            }
        }
    }
}
