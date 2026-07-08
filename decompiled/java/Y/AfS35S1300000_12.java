package Y;

import X.AbstractC21673619ry;
import X.C09JN;
import X.C1389890mGx;
import X.C1440005kM;
import X.C19EG;
import X.C1C7U;
import X.C438720HIg;
import X.C742510TAr;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public class AfS35S1300000_12 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS35S1300000_12 r7, java.lang.Object r8) {
        /*
            java.lang.String r6 = "DonationTokenManager@7b54.realGetFinalUrl$3"
            X.C1C7U.LIZ(r6)
            com.ss.android.ugc.aweme.donation.token.DonationTokenResponse r8 = (com.ss.android.ugc.aweme.donation.token.DonationTokenResponse) r8
            java.lang.Object r0 = r7.l1
            X.00zU r0 = (X.C259800zU) r0
            T r0 = r0.element
            android.app.Dialog r0 = (android.app.Dialog) r0
            if (r0 == 0) goto L14
            X.C0FNV.LIZ(r0)
        L14:
            int r0 = r8.status_code
            if (r0 != 0) goto L88
            com.ss.android.ugc.aweme.donation.token.DonationTokenBean r0 = r8.getData()
            r5 = 0
            if (r0 == 0) goto L86
            java.lang.String r0 = r0.token
        L21:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L88
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "callback invoke: "
            r1.append(r0)
            com.ss.android.ugc.aweme.donation.token.DonationTokenBean r0 = r8.getData()
            if (r0 == 0) goto L84
            java.lang.String r0 = r0.token
        L38:
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            java.lang.Object r4 = r7.l2
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            X.0TGf r1 = X.C743950TGf.LIZ
            java.lang.String r3 = r7.s0
            com.ss.android.ugc.aweme.donation.token.DonationTokenBean r0 = r8.getData()
            if (r0 == 0) goto L4e
            java.lang.String r5 = r0.token
        L4e:
            r1.getClass()
            if (r3 == 0) goto L77
            boolean r0 = X.C2431009fo.LIZJ(r3)
            if (r0 == 0) goto L77
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L77
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r0 = 0
            java.lang.String r1 = "?"
            boolean r0 = kotlin.text.a0.LJJIIZI(r3, r1, r0)
            if (r0 != 0) goto L7e
            r2.append(r1)
        L70:
            r2.append(r5)
            java.lang.String r3 = r2.toString()
        L77:
            r4.invoke(r3)
        L7a:
            X.C1C7U.LIZIZ(r6)
            return
        L7e:
            java.lang.String r0 = "&"
            r2.append(r0)
            goto L70
        L84:
            r0 = r5
            goto L38
        L86:
            r0 = r5
            goto L21
        L88:
            java.lang.Object r2 = r7.l3
            android.content.Context r2 = (android.content.Context) r2
            if (r2 == 0) goto L7a
            X.0iBy r1 = new X.0iBy
            r1.<init>(r2)
            r0 = 2131845468(0x7f11615c, float:1.9324358E38)
            java.lang.String r0 = r2.getString(r0)
            r1.LIZJ(r0)
            r1.LIZLLL()
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS35S1300000_12.accept$0(Y.AfS35S1300000_12, java.lang.Object):void");
    }

    public static final void accept$1(AfS35S1300000_12 afS35S1300000_12, Object obj) {
        TextView textView;
        RecyclerView recyclerView;
        AbstractC21673619ry adapter;
        C1C7U.LIZ("CollectionContentFragment@3f31.renameCollection$2$onInputConfirm$1");
        CollectionDetail collectionDetailQS = ((CollectionContentFragment) afS35S1300000_12.l1).qS();
        if (collectionDetailQS != null) {
            collectionDetailQS.name = afS35S1300000_12.s0;
        }
        C1440005kM.LIZ(new C438720HIg(((CollectionContentFragment) afS35S1300000_12.l1).qS()));
        C1440005kM.LIZ(new C742510TAr((CollectionManageRequest) afS35S1300000_12.l2, null));
        C1389890mGx c1389890mGx = new C1389890mGx((C19EG) afS35S1300000_12.l3);
        c1389890mGx.LJIIIZ(2131834465);
        c1389890mGx.LJIIJJI();
        View view = ((CollectionContentFragment) afS35S1300000_12.l1).getView();
        if (view != null && (recyclerView = (RecyclerView) view.findViewById(R.id.e6g)) != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyItemChanged(0);
        }
        View view2 = ((CollectionContentFragment) afS35S1300000_12.l1).getView();
        if (view2 != null && (textView = (TextView) view2.findViewById(R.id.p09)) != null) {
            textView.setText(afS35S1300000_12.s0);
        }
        C1C7U.LIZIZ("CollectionContentFragment@3f31.renameCollection$2$onInputConfirm$1");
    }

    public AfS35S1300000_12(Object obj, String str, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.l3 = obj3;
    }
}
