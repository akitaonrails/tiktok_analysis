package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0akI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946800akI extends AbstractC21673619ry<C946820akK> {
    public final C11NJ LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final EnumC946760akE LLILZ;
    public final EnumC946710ak9 LLILZIL;
    public final String LLILZLL;
    public final List<C946830akL> LLIZ;
    public final Set<Long> LLIZLLLIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLIZ).size();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d1  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r14, final int r15) {
        /*
            Method dump skipped, instruction units count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C946800akI.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C946820akK c946820akK = new C946820akK(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ggd, viewGroup, false));
        try {
            View view = c946820akK.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c946820akK.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c946820akK.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C946820akK.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c946820akK.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c946820akK.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C946820akK.class.getName();
        return c946820akK;
    }

    public C946800akI(C946790akH c946790akH, C11NJ c11nj, int i, int i2, EnumC946760akE enumC946760akE, EnumC946710ak9 enumC946710ak9, String str) {
        this.LL = c11nj;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = enumC946760akE;
        this.LLILZIL = enumC946710ak9;
        this.LLILZLL = str;
        List<C440101nT> list = c946790akH.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C440101nT c440101nT : list) {
            arrayList.add(new C946830akL(c440101nT.LIZ, c440101nT.LIZIZ, c440101nT.LIZJ, c440101nT.LIZLLL, c946790akH.LIZLLL, c946790akH.LJ));
        }
        this.LLIZ = arrayList;
        this.LLIZLLLIL = new LinkedHashSet();
    }
}
