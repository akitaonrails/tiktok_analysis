package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0Hq7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C453330Hq7 extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public List<? extends InterfaceC453420HqG> LL;
    public final InterfaceC453160Hpq LLILLJJLI;
    public final InterfaceC453460HqK LLILLL;
    public final InterfaceC453410HqF LLILZ;
    public final Function0<Boolean> LLILZIL;
    public boolean LLILZLL;
    public final C453350Hq9 LLIZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (ListProtector.get(this.LL, i) instanceof C453360HqA) {
            return 1;
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLILZLL = true;
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.LLILZLL = false;
        super.onDetachedFromRecyclerView(recyclerView);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012c A[PHI: r9
      0x012c: PHI (r9v3 java.lang.Integer) = (r9v2 java.lang.Integer), (r9v19 java.lang.Integer) binds: [B:56:0x0129, B:46:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018b  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C453330Hq7.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c453340Hq8;
        if (i != 0) {
            if (i == 1) {
                int i2 = C453340Hq8.LLIZ;
                c453340Hq8 = new C453340Hq8(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cn6, viewGroup, false), this.LLILLL);
            } else {
                "viewType is unknown".toString();
                throw new IllegalStateException("viewType is unknown");
            }
        } else {
            final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cn5, viewGroup, false);
            c453340Hq8 = new RecyclerView.ViewHolder(viewTd) { // from class: X.0HqE
                public final FrameLayout LL;

                {
                    super(viewTd);
                    this.LL = (FrameLayout) viewTd.findViewById(R.id.olq);
                }
            };
        }
        try {
            View view = c453340Hq8.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c453340Hq8.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c453340Hq8.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c453340Hq8.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c453340Hq8.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c453340Hq8.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c453340Hq8.getClass().getName();
        return c453340Hq8;
    }

    public /* synthetic */ C453330Hq7(List list, InterfaceC453160Hpq interfaceC453160Hpq, InterfaceC453460HqK interfaceC453460HqK, InterfaceC453410HqF interfaceC453410HqF, int i) {
        this((List<? extends InterfaceC453420HqG>) list, (i & 2) != 0 ? null : interfaceC453160Hpq, interfaceC453460HqK, (i & 8) != 0 ? null : interfaceC453410HqF, (i & 16) != 0 ? AFwS192S0000000_6.get$arr$(592) : null);
    }

    public C453330Hq7(List<? extends InterfaceC453420HqG> list, InterfaceC453160Hpq interfaceC453160Hpq, InterfaceC453460HqK interfaceC453460HqK, InterfaceC453410HqF interfaceC453410HqF, Function0<Boolean> function0) {
        this.LL = list;
        this.LLILLJJLI = interfaceC453160Hpq;
        this.LLILLL = interfaceC453460HqK;
        this.LLILZ = interfaceC453410HqF;
        this.LLILZIL = function0;
        this.LLIZ = new C453350Hq9(this);
    }
}
