package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0KXW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KXW extends AbstractC21673619ry<C0KXX> {
    public final List<String> LL = new ArrayList();
    public int LLILLJJLI = -1;
    public C1290330jgN LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r8, int r9) {
        /*
            r7 = this;
            X.0KXX r8 = (X.C0KXX) r8
            X.19R6 r0 = r8.LL
            android.content.Context r3 = r0.getContext()
            r0 = 2130972566(0x7f040f96, float:1.7553902E38)
            android.graphics.drawable.Drawable r1 = X.C14MI.LIZ(r3, r0)
            X.0jgN r0 = r7.LLILLL
            if (r0 == 0) goto L69
            android.graphics.Bitmap r6 = r0.LIZ(r9)
        L17:
            java.util.List<java.lang.String> r0 = r7.LL
            java.lang.Object r5 = X.C13LP.LJJJLZIJ(r9, r0)
            java.lang.String r5 = (java.lang.String) r5
            r4 = 1
            r2 = 0
            if (r5 == 0) goto L45
            int r0 = r5.length()
            if (r0 != 0) goto L45
            if (r6 != 0) goto L5c
            X.19R6 r0 = r8.LL
            r0.setImageDrawable(r1)
        L30:
            r0 = 1086324736(0x40c00000, float:6.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r1 = (int) r0
            if (r9 != 0) goto L71
            boolean r0 = X.C1835950xsP.LIZIZ(r3)
            if (r0 == 0) goto L6b
            X.19R6 r0 = r8.LL
            r0.LIZJ(r1, r1, r2, r2)
            return
        L45:
            if (r6 != 0) goto L5c
            X.0JBN r0 = X.C1819620xS4.LIZ()
            X.0kZf r1 = r0.LJIIL(r1)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r1.LJIJJ = r0
            r1.setUrl(r5)
            X.19R6 r0 = r8.LL
            r1.LJJI(r0)
            goto L30
        L5c:
            X.19R6 r1 = r8.LL
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r1.setScaleType(r0)
            X.19R6 r0 = r8.LL
            r0.setImageBitmap(r6)
            goto L30
        L69:
            r6 = 0
            goto L17
        L6b:
            X.19R6 r0 = r8.LL
            r0.LIZJ(r2, r2, r1, r1)
            return
        L71:
            int r0 = r7.getItemCount()
            int r0 = r0 - r4
            if (r9 != r0) goto L8a
            boolean r0 = X.C1835950xsP.LIZIZ(r3)
            if (r0 == 0) goto L84
            X.19R6 r0 = r8.LL
            r0.LIZJ(r2, r2, r1, r1)
            return
        L84:
            X.19R6 r0 = r8.LL
            r0.LIZJ(r1, r1, r2, r2)
            return
        L8a:
            X.19R6 r0 = r8.LL
            r0.LIZJ(r2, r2, r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KXW.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19R6 c19r6 = new C19R6(viewGroup.getContext(), null, 6, 0);
        int iLIZIZ = this.LLILLJJLI;
        if (iLIZIZ <= 0) {
            iLIZIZ = (int) C497740JfY.LIZIZ(30.0f);
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(iLIZIZ, (int) C497740JfY.LIZIZ(52.0f));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19r6);
        c19r6.setLayoutParams(layoutParams);
        C0KXX c0kxx = new C0KXX(c19r6);
        try {
            View view = c0kxx.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0kxx.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0kxx.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0KXX.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0kxx.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0kxx.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0KXX.class.getName();
        return c0kxx;
    }
}
