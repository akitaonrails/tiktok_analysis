package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wF9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773170wF9 extends AbstractC21673619ry<C1773130wF5> {
    public final InterfaceC1773310wFN LL;
    public C1773710wG1 LLILLJJLI;
    public final C1773380wFU<C1772690wEN> LLILLL = new C1773380wFU<>(0);

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<C1772690wEN> list;
        C1773710wG1 c1773710wG1 = this.LLILLJJLI;
        if (c1773710wG1 == null || (list = c1773710wG1.LJJIII) == null) {
            return 0;
        }
        return list.size();
    }

    public C1773170wF9(InterfaceC1773310wFN interfaceC1773310wFN) {
        this.LL = interfaceC1773310wFN;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        List<C1772690wEN> list;
        C1772690wEN c1772690wEN;
        String str;
        C1773710wG1 c1773710wG1 = this.LLILLJJLI;
        if (c1773710wG1 != null && (list = c1773710wG1.LJJIII) != null && (c1772690wEN = (C1772690wEN) ListProtector.get(list, i)) != null && (str = c1772690wEN.LIZLLL) != null) {
            return str.hashCode();
        }
        return i;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1773130wF5 c1773130wF5 = (C1773130wF5) viewHolder;
        C1773710wG1 c1773710wG1 = this.LLILLJJLI;
        if (c1773710wG1 != null) {
            c1773130wF5.getClass();
            c1773130wF5.LLILZIL = (C1772690wEN) ListProtector.get(c1773710wG1.LJJIII, i);
            C18Z6 bodyList = c1773130wF5.LLILLJJLI.LIZLLL().LJ.getBodyList();
            C1772690wEN c1772690wEN = c1773130wF5.LLILZIL;
            if (c1772690wEN == null) {
                c1772690wEN = null;
            }
            String str = c1772690wEN.LIZLLL;
            C1773650wFv c1773650wFv = c1773130wF5.LL;
            bodyList.getClass();
            if (!Intrinsics.LJFF(c1773650wFv, bodyList)) {
                bodyList.LLIZLLLIL.put(str, new WeakReference<>(c1773650wFv));
            }
            int i2 = c1773710wG1.LJJI;
            if (i2 == -1) {
                i2 = c1773710wG1.LJJ;
            }
            c1773130wF5.LLILZ = 0;
            if (i2 == i) {
                c1773130wF5.T5();
                int i3 = c1773710wG1.LJJI;
                if (i3 != -1 && i3 != c1773710wG1.LJJ) {
                    c1773130wF5.S5();
                } else {
                    c1773130wF5.I5();
                }
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1773650wFv c1773650wFv = new C1773650wFv(viewGroup.getContext(), null, 0);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1773650wFv);
        c1773650wFv.setLayoutParams(layoutParams);
        C1773130wF5 c1773130wF5 = new C1773130wF5(c1773650wFv, this.LL, this.LLILLJJLI);
        try {
            View view = c1773130wF5.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1773130wF5.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1773130wF5.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1773130wF5.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1773130wF5.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1773130wF5.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1773130wF5.class.getName();
        return c1773130wF5;
    }
}
