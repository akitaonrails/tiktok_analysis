package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DGC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DGC extends AbstractC2172971A2l<AbstractC331870Czh, RecyclerView.ViewHolder> {
    public final Function1<UcpRecommendationItem, Unit> LLILLJJLI;

    public C0DGC(AwS583S0100000_4 awS583S0100000_4) {
        super(new AbstractC339510DSr<AbstractC331870Czh>() { // from class: X.0DGZ
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(AbstractC331870Czh abstractC331870Czh, AbstractC331870Czh abstractC331870Czh2) {
                if (abstractC331870Czh.getContentHash() == abstractC331870Czh2.getContentHash()) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(AbstractC331870Czh abstractC331870Czh, AbstractC331870Czh abstractC331870Czh2) {
                AbstractC331870Czh abstractC331870Czh3 = abstractC331870Czh;
                AbstractC331870Czh abstractC331870Czh4 = abstractC331870Czh2;
                if (Intrinsics.LJFF(abstractC331870Czh3.getSlotKey(), abstractC331870Czh4.getSlotKey()) && abstractC331870Czh3.getClass() == abstractC331870Czh4.getClass()) {
                    return true;
                }
                return false;
            }
        });
        this.LLILLJJLI = awS583S0100000_4;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        AbstractC331870Czh abstractC331870CzhLLLFZ = LLLFZ(i);
        if (abstractC331870CzhLLLFZ instanceof C0D0F) {
            return 0;
        }
        if (!(abstractC331870CzhLLLFZ instanceof C08LL) && !(abstractC331870CzhLLLFZ instanceof C08LM)) {
            throw new C1954807lC();
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r18, int r19) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DGC.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c336340DGm;
        if (i == 1) {
            c336340DGm = new C0DGT(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i4f, viewGroup, false));
        } else {
            c336340DGm = new C336340DGm(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i4e, viewGroup, false));
        }
        try {
            View view = c336340DGm.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c336340DGm.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c336340DGm.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c336340DGm.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c336340DGm.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c336340DGm.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c336340DGm.getClass().getName();
        return c336340DGm;
    }
}
