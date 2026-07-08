package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yvx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C890110Yvx extends AbstractC890090Yvv<C890110Yvx> {
    public static final C890110Yvx LIZIZ = new C890110Yvx();
    public static final String LIZJ;
    public static boolean LIZLLL;

    @Override // X.AbstractC890090Yvv
    public final String LIZ() {
        return "business_inbox";
    }

    @Override // X.AbstractC890090Yvv
    public final String LIZIZ() {
        return "BusinessInboxExp";
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_ever_fetched_value_for_exp:");
        sbLIZ.append("business_inbox");
        LIZJ = C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int LJI() {
        int iIntValue;
        final String uid;
        C889930Yvf.LIZ.getClass();
        Object obj = C889930Yvf.LJIIIIZZ().LIZ().get("business_inbox");
        Integer numValueOf = null;
        if (obj == null) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BusinessInboxExp");
            sbLIZ.append(", getIntValueByLocalData, Use Memory Cache = ");
            sbLIZ.append(num);
            C1618770sE7.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            return num.intValue();
        }
        synchronized (this) {
            if (!LIZLLL) {
                int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "professional_business_inbox_strategy", false);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("BusinessInboxExp");
                sbLIZ2.append(", do init by ABManager value = ");
                sbLIZ2.append(iLJIJ);
                C1618770sE7.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
                C1952907kt.LIZ.getClass();
                C1952907kt.LIZ().storeInt("business_inbox", iLJIJ);
                LIZLLL = true;
                numValueOf = Integer.valueOf(iLJIJ);
            }
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            C1952907kt.LIZ.getClass();
            iIntValue = C1952907kt.LIZ().getInt("business_inbox", 0);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("BusinessInboxExp");
        sbLIZ3.append(" no memory cache yet, first local value = ");
        sbLIZ3.append(iIntValue);
        C1618770sE7.LJFF(C2188811AlT.LIZIZ(sbLIZ3));
        C889930Yvf.LJIIIIZZ().LIZ().put("business_inbox", Integer.valueOf(iIntValue));
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null || (uid = curUser.getUid()) == null) {
            uid = "";
        }
        LJFF(new InterfaceC304970BxP() { // from class: X.0Yvy
            @Override // X.InterfaceC304970BxP
            public final void LIZ() {
                String uid2;
                User curUser2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
                if (curUser2 == null || (uid2 = curUser2.getUid()) == null) {
                    uid2 = "";
                }
                if (Intrinsics.LJFF(uid2, uid)) {
                    C890110Yvx.LIZIZ.getClass();
                    int iLJIJ2 = C0C64.LJIILLIIL().LJIJ(31744, 0, "professional_business_inbox_strategy", false);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("BusinessInboxExp");
                    sbLIZ4.append(", callback, update keva = ");
                    sbLIZ4.append(iLJIJ2);
                    C1618770sE7.LJFF(C2188811AlT.LIZIZ(sbLIZ4));
                    C1952907kt.LIZ.getClass();
                    C1952907kt.LIZ().storeInt("business_inbox", iLJIJ2);
                    C1952907kt.LIZ().storeBoolean(C890110Yvx.LIZJ, true);
                }
            }
        });
        return iIntValue;
    }

    @Override // X.AbstractC890090Yvv
    public final boolean LIZLLL() {
        return LJI() > 0;
    }

    @Override // X.AbstractC890090Yvv
    public final void LJFF(InterfaceC304970BxP interfaceC304970BxP) {
        C0C5P.LIZJ().LJIIJJI("professional_business_inbox_strategy", interfaceC304970BxP);
    }
}
