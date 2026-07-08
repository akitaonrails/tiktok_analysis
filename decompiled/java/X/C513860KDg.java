package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0KDg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513860KDg extends AbstractC339560DSw<C514520KFu> {
    public final RecyclerView LL;
    public final TextView LLILLJJLI;
    public final C513850KDf LLILLL;
    public final int LLILZ;

    public C513860KDg(View view) {
        super(view);
        this.LL = (RecyclerView) view.findViewById(R.id.qlv);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.qlw);
        this.LLILLL = new C513850KDf();
        this.LLILZ = (int) C511520K4g.LIZ(12.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC339560DSw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(X.InterfaceC339570DSx r8) {
        /*
            r7 = this;
            X.0KFl r8 = (X.AbstractC514430KFl) r8
            X.0Q7z r2 = r8.LIZ
            r1 = 0
            if (r2 == 0) goto L5d
            java.lang.Class<com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model.ISubPackagePageAbility> r0 = com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model.ISubPackagePageAbility.class
            X.01wD r6 = X.C1558520qew.LIZ(r2, r0, r1)
            com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model.ISubPackagePageAbility r6 = (com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model.ISubPackagePageAbility) r6
            if (r6 == 0) goto L5e
            X.0KC4 r5 = r6.Ku()
            if (r5 == 0) goto L19
            X.0KBm r1 = r5.LLIZLLLIL
        L19:
            X.0KBm r0 = X.EnumC513400KBm.PACKAGE_PAGE
            if (r1 != r0) goto L24
            android.widget.TextView r0 = r7.LLILLJJLI
            if (r0 == 0) goto L24
            X.C0K0R.LIZ(r0)
        L24:
            androidx.recyclerview.widget.RecyclerView r4 = r7.LL
            if (r4 == 0) goto L4c
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.getContext()
            r1 = 1
            r0 = 0
            r3.<init>(r2, r1, r0)
            r4.setLayoutManager(r3)
            r4.setNestedScrollingEnabled(r0)
            X.0KDf r0 = r7.LLILLL
            r4.setAdapter(r0)
            X.0KEL r1 = new X.0KEL
            int r0 = r7.LLILZ
            r1.<init>(r0)
            r4.addItemDecoration(r1)
            r0 = 2
            r4.setOverScrollMode(r0)
        L4c:
            X.0KDf r0 = r7.LLILLL
            r0.LLILZIL = r6
            if (r6 == 0) goto L5c
            kotlin.jvm.internal.AwS373S0200000_7 r1 = new kotlin.jvm.internal.AwS373S0200000_7
            r0 = 77
            r1.<init>(r7, r5, r0)
            r6.cu(r1)
        L5c:
            return
        L5d:
            r6 = r1
        L5e:
            r5 = r1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C513860KDg.I5(X.0DSx):void");
    }
}
