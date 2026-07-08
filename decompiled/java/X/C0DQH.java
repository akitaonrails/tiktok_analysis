package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aiuikit.api.components.imagepreview.ImagePreviewItem;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0DQH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DQH extends AbstractC21673619ry<C0DQI> {
    public List<ImagePreviewItem> LL = C13BV.INSTANCE;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r6, int r7) {
        /*
            r5 = this;
            X.0DQI r6 = (X.C0DQI) r6
            java.util.List<com.ss.android.ugc.aweme.aiuikit.api.components.imagepreview.ImagePreviewItem> r0 = r5.LL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            com.ss.android.ugc.aweme.aiuikit.api.components.imagepreview.ImagePreviewItem r0 = (com.ss.android.ugc.aweme.aiuikit.api.components.imagepreview.ImagePreviewItem) r0
            java.lang.String r4 = r0.pathOrUrl
            java.lang.String r2 = r0.fallbackUrl
            int r0 = r4.length()
            if (r0 == 0) goto L41
            android.net.Uri r3 = com.bytedance.mt.protector.impl.UriProtector.parse(r4)
            java.lang.String r1 = r3.getScheme()
            java.lang.String r0 = "file"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L5f
            java.lang.String r1 = r3.getPath()
            if (r1 == 0) goto L41
            int r0 = r1.length()
            if (r0 == 0) goto L41
            X.0VSJ r0 = new X.0VSJ
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L41
            java.lang.String r4 = r3.toString()
        L3f:
            if (r4 != 0) goto L84
        L41:
            if (r2 == 0) goto L5e
        L43:
            int r0 = r2.length()
            if (r0 == 0) goto L5e
            X.0kl3 r1 = X.C1331660kl2.LJIIIZ(r2)
            com.bytedance.lighten.loader.SmartImageView r0 = r6.LL
            android.content.Context r0 = r0.getContext()
            r1.LJJIJL(r0)
            com.bytedance.lighten.loader.SmartImageView r0 = r6.LL
            r1.LJJ(r0)
            X.C786410Ut5.h3(r1)
        L5e:
            return
        L5f:
            java.lang.String r0 = r3.getScheme()
            if (r0 == 0) goto L6b
            int r0 = r0.length()
            if (r0 != 0) goto L84
        L6b:
            X.0VSJ r0 = new X.0VSJ
            r0.<init>(r4)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L41
            X.0VSJ r0 = new X.0VSJ
            r0.<init>(r4)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            java.lang.String r4 = r0.toString()
            goto L3f
        L84:
            r2 = r4
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DQH.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        SmartImageView smartImageView = new SmartImageView(viewGroup.getContext());
        C786410Ut5.G6(smartImageView, new RecyclerView.LayoutParams(-1, -1));
        smartImageView.setActualImageScaleType(EnumC1338240kve.FIT_CENTER);
        C0DQI c0dqi = new C0DQI(smartImageView);
        try {
            View view = c0dqi.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0dqi.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0dqi.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0DQI.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0dqi.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0dqi.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0DQI.class.getName();
        return c0dqi;
    }
}
