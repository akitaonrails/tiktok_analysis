package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xYM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823520xYM extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final List<? extends InterfaceC1782170wTf> LL;
    public final boolean LLILLJJLI;
    public int LLILLL;
    public final InterfaceC1823190xXp LLILZ;
    public final C2172981A2m<InterfaceC1782170wTf> LLILZIL = new C2172981A2m<>(this, new AbstractC339510DSr<InterfaceC1782170wTf>() { // from class: X.0wTg
        @Override // X.AbstractC339510DSr
        public final boolean LIZ(InterfaceC1782170wTf interfaceC1782170wTf, InterfaceC1782170wTf interfaceC1782170wTf2) {
            return Intrinsics.LJFF(interfaceC1782170wTf, interfaceC1782170wTf2);
        }

        @Override // X.AbstractC339510DSr
        public final boolean LIZIZ(InterfaceC1782170wTf interfaceC1782170wTf, InterfaceC1782170wTf interfaceC1782170wTf2) {
            String str;
            String str2;
            Long lValueOf;
            C1782140wTc c1782140wTc;
            C1782140wTc c1782140wTc2;
            C1782160wTe c1782160wTe;
            C1782160wTe c1782160wTe2;
            InterfaceC1782170wTf interfaceC1782170wTf3 = interfaceC1782170wTf;
            InterfaceC1782170wTf interfaceC1782170wTf4 = interfaceC1782170wTf2;
            Long lValueOf2 = null;
            if ((interfaceC1782170wTf3 instanceof C1782160wTe) && (c1782160wTe2 = (C1782160wTe) interfaceC1782170wTf3) != null) {
                str = c1782160wTe2.LIZJ;
            } else {
                str = null;
            }
            if ((interfaceC1782170wTf4 instanceof C1782160wTe) && (c1782160wTe = (C1782160wTe) interfaceC1782170wTf4) != null) {
                str2 = c1782160wTe.LIZJ;
            } else {
                str2 = null;
            }
            if (!Intrinsics.LJFF(str, str2)) {
                if ((interfaceC1782170wTf3 instanceof C1782140wTc) && (c1782140wTc2 = (C1782140wTc) interfaceC1782170wTf3) != null) {
                    lValueOf = Long.valueOf(c1782140wTc2.LIZLLL);
                } else {
                    lValueOf = null;
                }
                if ((interfaceC1782170wTf4 instanceof C1782140wTc) && (c1782140wTc = (C1782140wTc) interfaceC1782170wTf4) != null) {
                    lValueOf2 = Long.valueOf(c1782140wTc.LIZLLL);
                }
                if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
                    return false;
                }
                return true;
            }
            return true;
        }
    });

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZIL.LJFF.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return !(ListProtector.get(this.LLILZIL.LJFF, i) instanceof C1782160wTe) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0180  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r13, int r14) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1823520xYM.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1823550xYP;
        if (i == 0) {
            c1823550xYP = new C1823560xYQ(C500260Jjc.LJIILL(R.layout.gtw, viewGroup, false));
        } else {
            c1823550xYP = new C1823550xYP(C500260Jjc.LJIILL(R.layout.fyd, viewGroup, false));
        }
        try {
            View view = c1823550xYP.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1823550xYP.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1823550xYP.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1823550xYP.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1823550xYP.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1823550xYP.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1823550xYP.getClass().getName();
        return c1823550xYP;
    }

    public C1823520xYM(List<? extends InterfaceC1782170wTf> list, boolean z, int i, InterfaceC1823190xXp interfaceC1823190xXp) {
        this.LL = list;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = interfaceC1823190xXp;
    }
}
