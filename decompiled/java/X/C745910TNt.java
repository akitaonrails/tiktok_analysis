package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.OfferInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0TNt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745910TNt extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final InterfaceC745940TNw LL;
    public List<OfferInfo> LLILLJJLI = C13BV.INSTANCE;
    public boolean LLILLL;
    public boolean LLILZ;
    public int LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C745910TNt(C745950TNx c745950TNx) {
        this.LL = c745950TNx;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (!(viewHolder instanceof C745920TNu)) {
            return;
        }
        LLLFZ((C745920TNu) viewHolder, i, false);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C745920TNu c745920TNu = new C745920TNu(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bfi, viewGroup, false));
        try {
            View view = c745920TNu.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c745920TNu.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c745920TNu.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C745920TNu.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c745920TNu.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c745920TNu.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C745920TNu.class.getName();
        return c745920TNu;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLFZ(X.C745920TNu r25, final int r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 1303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C745910TNt.LLLFZ(X.0TNu, int, boolean):void");
    }
}
