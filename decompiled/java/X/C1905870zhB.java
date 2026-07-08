package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0zhB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1905870zhB {
    public static final Map<String, AbstractC1887130zCx> LIZ = C2097608Jq.LJIIJ(new Pair("profile_page", new AbstractC1887130zCx() { // from class: X.0zhA
        @Override // X.AbstractC1887130zCx
        public final boolean LIZLLL() {
            return AbstractC1887130zCx.LIZIZ("profile_page");
        }

        @Override // X.AbstractC1887130zCx
        public final String LIZJ() {
            return C1BWL.LIZJ().getString(2131821585);
        }
    }), new Pair("manage_account_page", new AbstractC1887130zCx() { // from class: X.0zh9
        @Override // X.AbstractC1887130zCx
        public final boolean LIZLLL() {
            return AbstractC1887130zCx.LIZIZ("manage_account_page");
        }

        @Override // X.AbstractC1887130zCx
        public final String LIZJ() {
            return C1BWL.LIZJ().getString(2131821579);
        }
    }), new Pair("sign_up", new C1905920zhG()), new Pair("email_verify", new C1905920zhG() { // from class: X.0zhE
        @Override // X.C1905920zhG, X.AbstractC1887130zCx
        public final String LIZJ() {
            return C1BWL.LIZJ().getString(2131821585);
        }
    }), new Pair("coin_incentive_page", new AbstractC1887130zCx() { // from class: X.0zhC
        @Override // X.AbstractC1887130zCx
        public final boolean LIZLLL() {
            return true;
        }

        @Override // X.AbstractC1887130zCx
        public final String LIZJ() {
            return C1BWL.LIZJ().getString(2131821579);
        }
    }), new Pair("unified_auth_popup", new AbstractC1887130zCx() { // from class: X.0zhD
        @Override // X.AbstractC1887130zCx
        public final boolean LIZLLL() {
            return true;
        }

        @Override // X.AbstractC1887130zCx
        public final String LIZJ() {
            return C1BWL.LIZJ().getString(2131821579);
        }
    }));

    public static AbstractC1887130zCx LIZ(String str) {
        AbstractC1887130zCx abstractC1887130zCx = (AbstractC1887130zCx) ((LinkedHashMap) LIZ).get(str);
        if (abstractC1887130zCx == null) {
            return new AbstractC1887130zCx() { // from class: X.0zhF
                @Override // X.AbstractC1887130zCx
                public final String LIZJ() {
                    return "";
                }

                @Override // X.AbstractC1887130zCx
                public final boolean LIZLLL() {
                    return false;
                }
            };
        }
        return abstractC1887130zCx;
    }
}
