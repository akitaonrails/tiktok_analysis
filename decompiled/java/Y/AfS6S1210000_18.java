package Y;

import X.C09JN;
import X.C1170730gZT;
import X.C1171330gaR;
import X.C1172580gcS;
import X.C1367960lha;
import X.C1440005kM;
import X.C1C7U;
import X.C742510TAr;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes19.dex */
public class AfS6S1210000_18 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS6S1210000_18 r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS6S1210000_18.accept$0(Y.AfS6S1210000_18, java.lang.Object):void");
    }

    public static final void accept$1(AfS6S1210000_18 afS6S1210000_18, Object obj) {
        String string;
        Integer num;
        String string2;
        Integer num2;
        Integer num3;
        Integer num4;
        C1C7U.LIZ("QuickFavoriteManager@2914.collectionDetailClick$2$ignore$1");
        CollectionManageResponse collectionManageResponse = (CollectionManageResponse) obj;
        C1367960lha.LIZ.getClass();
        C1367960lha.LIZ().onVideoAddToCollection(Boolean.valueOf(afS6S1210000_18.z3), collectionManageResponse.collectionId, ((CollectionDetail) afS6S1210000_18.l1).name, "1", ((Aweme) afS6S1210000_18.l2).getAid());
        C1171330gaR c1171330gaR = new C1171330gaR();
        c1171330gaR.LIZLLL = afS6S1210000_18.s0;
        int iIntValue = 0;
        c1171330gaR.LJIIZILJ(0);
        CollectionDetail.Status status = ((CollectionDetail) afS6S1210000_18.l1).status;
        if (status != null && (num4 = status.state) != null) {
            iIntValue = num4.intValue();
        }
        c1171330gaR.LJIJ(iIntValue);
        c1171330gaR.LJIL = "click_bubble";
        c1171330gaR.LJJI = ((Aweme) afS6S1210000_18.l2).getAid();
        c1171330gaR.LJIJI = collectionManageResponse.collectionId;
        CollectionDetail collectionDetail = (CollectionDetail) afS6S1210000_18.l1;
        c1171330gaR.LJJIFFI = collectionDetail.name;
        Integer num5 = collectionDetail.type;
        if (num5 != null) {
            string = num5.toString();
        } else {
            string = null;
        }
        c1171330gaR.LJJII = string;
        CollectionDetail.Status status2 = ((CollectionDetail) afS6S1210000_18.l1).status;
        if (status2 != null) {
            num = status2.state;
        } else {
            num = null;
        }
        c1171330gaR.LJIILLIIL(num);
        c1171330gaR.LJIILJJIL();
        C1170730gZT c1170730gZT = new C1170730gZT();
        c1170730gZT.LIZLLL = afS6S1210000_18.s0;
        c1170730gZT.LJIIZILJ = "click_bubble";
        c1170730gZT.LJIL = ((Aweme) afS6S1210000_18.l2).getAid();
        c1170730gZT.LJJ = 1;
        c1170730gZT.LJIJI = collectionManageResponse.collectionId;
        CollectionDetail collectionDetail2 = (CollectionDetail) afS6S1210000_18.l1;
        c1170730gZT.LJIJJ = collectionDetail2.name;
        Integer num6 = collectionDetail2.type;
        if (num6 != null) {
            string2 = num6.toString();
        } else {
            string2 = null;
        }
        c1170730gZT.LJJIFFI = string2;
        CollectionDetail.Status status3 = ((CollectionDetail) afS6S1210000_18.l1).status;
        if (status3 != null) {
            num2 = status3.state;
        } else {
            num2 = null;
        }
        c1170730gZT.LJIILLIIL(num2);
        CollectionDetail.Status status4 = ((CollectionDetail) afS6S1210000_18.l1).status;
        if (status4 != null) {
            num3 = status4.state;
        } else {
            num3 = null;
        }
        c1170730gZT.LJIJJLI = C1172580gcS.LIZ(num3);
        c1170730gZT.LJIILJJIL();
        C1440005kM.LIZ(new C742510TAr(new CollectionManageRequest(1, null, null, null, null, null, null, null, null, null, null, null), null));
        C1C7U.LIZIZ("QuickFavoriteManager@2914.collectionDetailClick$2$ignore$1");
    }

    public AfS6S1210000_18(boolean z, Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.z3 = z;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
