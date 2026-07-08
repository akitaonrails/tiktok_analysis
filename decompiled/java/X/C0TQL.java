package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import defpackage.AdvertiserModel;

/* JADX INFO: renamed from: X.0TQL, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0TQL extends C0TQI<C0TQP, AdvertiserModel> {
    @Override // X.C0TQI
    public int LLLIILIL(int i) {
        return R.layout.ft2;
    }

    @Override // X.C0TQI
    public final RecyclerView.ViewHolder LLLFZ(View view) {
        return new C0TQP(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLIL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(X.C0TQP r8, int r9) {
        /*
            r7 = this;
            r5 = r9
            r2 = r7
            java.lang.Object r4 = r2.LLLII(r5)
            AdvertiserModel r4 = (defpackage.AdvertiserModel) r4
            if (r4 != 0) goto Lb
            return
        Lb:
            X.127K r1 = r8.LL
            if (r1 == 0) goto L16
            java.lang.String r0 = r4.getAdvName()
            r1.setTitle(r0)
        L16:
            X.127K r0 = r8.LL
            r3 = 0
            if (r0 == 0) goto L1f
            X.127M r3 = r0.getAccessory()
        L1f:
            boolean r0 = r3 instanceof X.C127A
            if (r0 == 0) goto L40
            X.127A r3 = (X.C127A) r3
            if (r3 == 0) goto L40
            java.lang.Integer r0 = r4.getAdvStatus()
            if (r0 == 0) goto L41
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L41
        L34:
            r3.LJIILJJIL(r1)
            kotlin.jvm.internal.AwS71S0301000_12 r1 = new kotlin.jvm.internal.AwS71S0301000_12
            r6 = 4
            r1.<init>(r2, r3, r4, r5, r6)
            r3.LJIILL(r1)
        L40:
            return
        L41:
            r1 = 0
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0TQL.onBindViewHolder(X.0TQP, int):void");
    }
}
