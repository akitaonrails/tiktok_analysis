package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DH8, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DH8 extends AbstractC2172971A2l<C0D4T, C0DIT> {
    public final Set<String> LLILLJJLI;

    public C0DH8() {
        super(new AbstractC339510DSr<C0D4T>() { // from class: X.0DGh
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(C0D4T c0d4t, C0D4T c0d4t2) {
                return Intrinsics.LJFF(c0d4t, c0d4t2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(C0D4T c0d4t, C0D4T c0d4t2) {
                return Intrinsics.LJFF(c0d4t.id, c0d4t2.id);
            }
        });
        this.LLILLJJLI = new LinkedHashSet();
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        AbstractC21674919sB abstractC21674919sB;
        super.onAttachedToRecyclerView(recyclerView);
        AbstractC21673719rz itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator instanceof AbstractC21674919sB) {
            abstractC21674919sB = (AbstractC21674919sB) itemAnimator;
        } else {
            abstractC21674919sB = null;
        }
        if (abstractC21674919sB != null) {
            abstractC21674919sB.LLIZ = false;
        }
        while (recyclerView.getItemDecorationCount() > 0) {
            recyclerView.removeItemDecorationAt(0);
        }
        recyclerView.addItemDecoration(new C346270Dhp(7));
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C0DIT c0dit = (C0DIT) viewHolder;
        super.onViewRecycled(c0dit);
        ValueAnimator valueAnimator = c0dit.LLJILJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c0dit.LLJILJIL = null;
        c0dit.N5();
        c0dit.R5();
        C786410Ut5.T7(c0dit.LLJ, null);
        c0dit.LLJ.setMaxLines(4);
        c0dit.LLJIJIL = null;
        c0dit.LLJILJILJ = null;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        String strLIZIZ;
        C0DIT c0dit = (C0DIT) viewHolder;
        C0D4T c0d4tLLLFZ = LLLFZ(i);
        ValueAnimator valueAnimator = c0dit.LLJILJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c0dit.LLJILJIL = null;
        c0dit.N5();
        c0dit.R5();
        C786410Ut5.T7(c0dit.LLJ, null);
        c0dit.LLJ.setMaxLines(4);
        c0dit.LLJIJIL = null;
        c0dit.LLJILJILJ = null;
        String str = c0d4tLLLFZ.id;
        c0dit.LLJIJIL = str;
        c0dit.LLJILJILJ = c0d4tLLLFZ;
        boolean zBooleanValue = c0dit.LL.invoke(str).booleanValue();
        String str2 = c0d4tLLLFZ.userName;
        if (str2 != null && !a0.LJJJIL(str2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C786410Ut5.LLIL(c0dit.LLILZIL, 8);
        } else {
            if (str2.length() == 1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2.charAt(0));
                sbLIZ.append("**");
                sbLIZ.append(str2.charAt(0));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C13LN.LJLLI(str2));
                sbLIZ2.append("**");
                sbLIZ2.append(C13LN.LJLLL(str2));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            C786410Ut5.LLIL(c0dit.LLILZIL, 0);
            c0dit.LLILZIL.setText(strLIZIZ);
        }
        Float f = c0d4tLLLFZ.rating;
        if (f != null) {
            C786410Ut5.LJLLLLLL(0, c0dit.LLILZLL);
            c0dit.LLIZ.setValue(f.floatValue());
        } else {
            C786410Ut5.LJLLLLLL(8, c0dit.LLILZLL);
        }
        String str3 = c0d4tLLLFZ.date;
        if (str3 != null && !a0.LJJJIL(str3)) {
            C786410Ut5.LLIL(c0dit.LLIZLLLIL, 0);
            c0dit.LLIZLLLIL.setText(str3);
        } else {
            C786410Ut5.LLIL(c0dit.LLIZLLLIL, 8);
        }
        String str4 = (String) C13LP.LJJJLL(c0d4tLLLFZ.imageUrls);
        if (str4 == null) {
            str4 = c0d4tLLLFZ.avatarUrl;
        }
        if (str4.length() > 0) {
            C786410Ut5.LJLLLLLL(0, c0dit.LLILZ);
            C0D8X.LIZ().LIZ(str4, c0dit.LLILLL, 0.0f, null);
        } else {
            C786410Ut5.LJLLLLLL(8, c0dit.LLILZ);
        }
        c0dit.T5(c0d4tLLLFZ, zBooleanValue, false);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0DIT c0dit = new C0DIT(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i4g, viewGroup, false), new C331510Cz7(this), new C331500Cz6(this));
        try {
            View view = c0dit.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0dit.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0dit.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0DIT.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0dit.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0dit.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0DIT.class.getName();
        return c0dit;
    }
}
