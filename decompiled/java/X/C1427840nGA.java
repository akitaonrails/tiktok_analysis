package X;

import Y.ACListenerS125S0200000_22;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.effectmanager.effect.model.CategoryInfo;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nGA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427840nGA extends AbstractC21673619ry<C1427850nGB> {
    public final C1427870nGD LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public List<CategoryInfo> LLILZ;
    public CategoryInfo LLILZIL;

    public final CategoryInfo LLLFZ() {
        CategoryInfo next;
        CategoryInfo categoryInfo = this.LLILZIL;
        if (categoryInfo != null) {
            return categoryInfo;
        }
        Iterator<CategoryInfo> it2 = this.LLILZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.is_default()) {
                break;
            }
        }
        return next;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        if (this.LLILZ.isEmpty()) {
            return 10;
        }
        return this.LLILZ.size();
    }

    public final void setData(List<CategoryInfo> list) {
        this.LLILZ = list;
        CategoryInfo categoryInfo = null;
        if (!list.isEmpty()) {
            Iterator<CategoryInfo> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                CategoryInfo next = it2.next();
                if (next.is_default()) {
                    categoryInfo = next;
                    break;
                }
            }
            categoryInfo = categoryInfo;
        }
        this.LLILZIL = categoryInfo;
        notifyDataSetChanged();
    }

    public C1427840nGA(Context context, C1427870nGD c1427870nGD) {
        int iIntValue;
        this.LL = c1427870nGD;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zl, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        this.LLILLJJLI = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zi, context);
        this.LLILLL = numLIZJ2 != null ? numLIZJ2.intValue() : -1;
        this.LLILZ = C13BV.INSTANCE;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String category_key;
        int i2;
        C1427850nGB c1427850nGB = (C1427850nGB) viewHolder;
        CategoryInfo categoryInfo = (CategoryInfo) C13LP.LJJJLZIJ(i, this.LLILZ);
        if (categoryInfo == null) {
            C20626615nU c20626615nU = c1427850nGB.LLILLJJLI;
            int visibility = c20626615nU.getVisibility();
            c20626615nU.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c20626615nU);
            c20626615nU.setLoading(true);
            C786410Ut5.LLLLZLL(c1427850nGB.LL, 8);
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0nGC
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            }, c1427850nGB.itemView);
            return;
        }
        C20626615nU c20626615nU2 = c1427850nGB.LLILLJJLI;
        c20626615nU2.setLoading(false);
        int visibility2 = c20626615nU2.getVisibility();
        c20626615nU2.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, c20626615nU2);
        TuxTextView tuxTextView = c1427850nGB.LL;
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        tuxTextView.setText(categoryInfo.getCategory_name());
        String category_key2 = categoryInfo.getCategory_key();
        CategoryInfo categoryInfoLLLFZ = LLLFZ();
        if (categoryInfoLLLFZ != null) {
            category_key = categoryInfoLLLFZ.getCategory_key();
        } else {
            category_key = null;
        }
        if (Intrinsics.LJFF(category_key2, category_key)) {
            i2 = this.LLILLL;
        } else {
            i2 = this.LLILLJJLI;
        }
        tuxTextView.setTextColor(i2);
        C786410Ut5.I7(new ACListenerS125S0200000_22(this, categoryInfo, 2), c1427850nGB.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eqj, viewGroup, false);
        TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.ke1);
        C20626615nU c20626615nU = (C20626615nU) viewTd.findViewById(R.id.ke0);
        Paint paint = new Paint();
        paint.setTextSize(C418440Gaw.LIZIZ(22));
        c20626615nU.setFontConfig(new C1428010nGR(C418440Gaw.LIZIZ(24), paint));
        C1427850nGB c1427850nGB = new C1427850nGB(viewTd, tuxTextView, c20626615nU);
        try {
            View view = c1427850nGB.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1427850nGB.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1427850nGB.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1427850nGB.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1427850nGB.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1427850nGB.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1427850nGB.class.getName();
        return c1427850nGB;
    }
}
