package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.photomode.GenItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DTz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339850DTz extends AbstractC21673619ry<C1428290nGt> {
    public List<GenItem> LL = new ArrayList(3);
    public C0DU1 LLILLJJLI;

    public final void LLLFZ() {
        List listLJIILJJIL = C1697810uHb.LJIILJJIL("", "", "");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIILJJIL, 10));
        int i = 0;
        for (Object obj : listLJIILJJIL) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            List listLJJLIIIJ = a0.LJJLIIIJ((String) obj, new char[]{':'}, false, 2, 2);
            String str = (String) C13LP.LJJJLZIJ(0, listLJJLIIIJ);
            if (str == null) {
                str = "";
            }
            String str2 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJ);
            if (str2 == null) {
                str2 = "";
            }
            arrayList.add(new GenItem(str, str2, i));
            i = i2;
        }
        this.LL = new ArrayList(arrayList);
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        C1428290nGt c1428290nGt = (C1428290nGt) viewHolder;
        String str = ((GenItem) ListProtector.get(this.LL, i)).text;
        c1428290nGt.getClass();
        if (str.length() == 0) {
            c1428290nGt.I5(true);
        } else {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"\n"}, 0, 6);
            c1428290nGt.LLILZ.setText((CharSequence) C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL));
            c1428290nGt.LLILZ.setTextColorRes(R.attr.a1h);
            c1428290nGt.I5(false);
            int size = ((ArrayList) c1428290nGt.LLILZLL).size();
            int i2 = 0;
            while (i2 < size) {
                TextView textView = (TextView) ListProtector.get(c1428290nGt.LLILZIL, i2);
                i2++;
                textView.setText((CharSequence) C13LP.LJJJLZIJ(i2, listLJJLIIIJILLIZJL));
            }
            int size2 = ((ArrayList) c1428290nGt.LLILZLL).size();
            int size3 = listLJJLIIIJILLIZJL.size() - 1;
            while (size2 < size3) {
                TuxTextView tuxTextView = new TuxTextView(c1428290nGt.LLILLJJLI, null, 6, 0);
                C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-1, -2));
                tuxTextView.setTuxFont(41);
                tuxTextView.setTextColorRes(R.attr.a1h);
                C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, false, 16);
                size2++;
                tuxTextView.setText((CharSequence) C13LP.LJJJLZIJ(size2, listLJJLIIIJILLIZJL));
                c1428290nGt.LLILLL.addView(tuxTextView);
                ((ArrayList) c1428290nGt.LLILZIL).add(tuxTextView);
            }
        }
        C786410Ut5.I7(new C19IN() { // from class: X.0DU0
            @Override // X.C19IN
            public final void LIZ(View view) {
                C339850DTz c339850DTz;
                C0DU1 c0du1;
                if (((GenItem) ListProtector.get(this.LLILZLL.LL, i)).text.length() > 0 && (c0du1 = (c339850DTz = this.LLILZLL).LLILLJJLI) != null) {
                    c0du1.LIZIZ((GenItem) ListProtector.get(c339850DTz.LL, i));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(600, true);
            }
        }, c1428290nGt.LLILLL);
        C0DU1 c0du1 = this.LLILLJJLI;
        if (c0du1 != null) {
            c0du1.LIZ((GenItem) ListProtector.get(this.LL, i));
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1428290nGt c1428290nGt = new C1428290nGt(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cyh, viewGroup, false));
        try {
            View view = c1428290nGt.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1428290nGt.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1428290nGt.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1428290nGt.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1428290nGt.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1428290nGt.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1428290nGt.class.getName();
        return c1428290nGt;
    }
}
