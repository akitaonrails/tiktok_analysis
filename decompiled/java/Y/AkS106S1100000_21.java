package Y;

import X.AbstractC1361510lXB;
import X.C012W;
import X.C163S;
import X.C207097162d;
import X.InterfaceC1487280oo2;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes22.dex */
public class AkS106S1100000_21 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS106S1100000_21 akS106S1100000_21, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        C163S[] c163sArrValues = C163S.values();
        int length = c163sArrValues.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                if (c163sArrValues[i].getStatusCode() == baseResponse.status_code) {
                    break;
                }
                i++;
            } else {
                C012W c012w = new C012W(true);
                C207097162d.LJ.getClass();
                ((AbstractC1361510lXB) C207097162d.LJI.getValue()).LJFF(c012w, (Aweme) akS106S1100000_21.l1, akS106S1100000_21.s0);
                z = true;
                break;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105 A[PHI: r2
      0x0105: PHI (r2v4 com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) = 
      (r2v3 com.ss.android.ugc.aweme.im.contacts.api.model.IMUser)
      (r2v5 com.ss.android.ugc.aweme.im.contacts.api.model.IMUser)
     binds: [B:48:0x0100, B:46:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013c A[PHI: r8 r9
      0x013c: PHI (r8v7 java.lang.String) = (r8v6 java.lang.String), (r8v8 java.lang.String), (r8v10 java.lang.String) binds: [B:89:0x01bc, B:84:0x01a8, B:66:0x013a] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r9v5 int) = (r9v4 int), (r9v6 int), (r9v7 int) binds: [B:89:0x01bc, B:84:0x01a8, B:66:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object apply$1(Y.AkS106S1100000_21 r19, java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AkS106S1100000_21.apply$1(Y.AkS106S1100000_21, java.lang.Object):java.lang.Object");
    }

    public AkS106S1100000_21(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
