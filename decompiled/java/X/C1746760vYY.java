package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.associate.AddressAssociateFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.associate.AddressAssociateViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0vYY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746760vYY extends AbstractC21673619ry<C1747570vZr> {
    public final AddressAssociateViewModel LL;
    public final AddressAssociateFragment LLILLJJLI;
    public List<CandInputData> LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<CandInputData> list = this.LLILLL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public C1746760vYY(AddressAssociateViewModel addressAssociateViewModel, AddressAssociateFragment addressAssociateFragment) {
        this.LL = addressAssociateViewModel;
        this.LLILLJJLI = addressAssociateFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2 A[PHI: r7 r16
      0x00c2: PHI (r7v4 java.lang.Integer) = (r7v3 java.lang.Integer), (r7v5 java.lang.Integer) binds: [B:77:0x0149, B:41:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r16v3 boolean) = (r16v0 boolean), (r16v4 boolean) binds: [B:77:0x0149, B:41:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0142 A[PHI: r11
      0x0142: PHI (r11v3 java.util.HashMap<java.lang.String, java.lang.Object>) = 
      (r11v2 java.util.HashMap<java.lang.String, java.lang.Object>)
      (r11v5 java.util.HashMap<java.lang.String, java.lang.Object>)
      (r11v5 java.util.HashMap<java.lang.String, java.lang.Object>)
     binds: [B:71:0x013f, B:58:0x0104, B:60:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014b A[PHI: r16
      0x014b: PHI (r16v1 boolean) = (r16v0 boolean), (r16v3 boolean) binds: [B:77:0x0149, B:43:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0152  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r23, int r24) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1746760vYY.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ahw, viewGroup, false);
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(viewTd) { // from class: X.0vZr
        };
        try {
            View view = viewHolder.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1747570vZr.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1747570vZr.class.getName();
        return viewHolder;
    }
}
