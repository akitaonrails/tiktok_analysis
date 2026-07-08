package X;

import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0vB9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1732250vB9 implements InterfaceC596980NbE {
    public final String LL;
    public final WeakReference<C1732230vB7> LLILLJJLI;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
    
        if (r4 == null) goto L35;
     */
    @Override // X.InterfaceC596980NbE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C1525630pnt r18) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1732250vB9.LJ(X.0pnt):void");
    }

    public C1732250vB9(String str, WeakReference<C1732230vB7> weakReference) {
        this.LL = str;
        this.LLILLJJLI = weakReference;
    }

    public final void LIZ(String str, String str2, List list, boolean z) {
        int iIntValue;
        String str3;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ECBillboard eCBillboard = (ECBillboard) it2.next();
            Integer num = eCBillboard.billboardType;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            String str4 = this.LL;
            if (z) {
                str3 = "pc_msg";
            } else {
                str3 = "app_msg";
            }
            C1729270v6L.LIZ(str, str2, str3, "guide", CardStruct.IStatusCode.DEFAULT, str4, String.valueOf(eCBillboard.billboardId), iIntValue, 0, 0, 768);
        }
    }
}
