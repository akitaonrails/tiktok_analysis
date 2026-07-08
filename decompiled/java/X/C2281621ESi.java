package X;

/* JADX INFO: renamed from: X.1ESi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2281621ESi {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static AbstractC1893140zMe LIZ(String str) {
        switch (str.hashCode()) {
            case -1922936957:
                if (str.equals("Others")) {
                    return new AbstractC1893140zMe() { // from class: X.1ESn
                        @Override // X.AbstractC1201400hMw
                        public final String LIZLLL() {
                            return "poi_third_party_retain_others";
                        }
                    };
                }
                break;
            case -1781830854:
                if (str.equals("Travel")) {
                    return new AbstractC1893140zMe() { // from class: X.1ESo
                        @Override // X.AbstractC1201400hMw
                        public final String LIZLLL() {
                            return "poi_third_party_retain_travel";
                        }
                    };
                }
                break;
            case -349382707:
                if (str.equals("Food and Drink")) {
                    return new AbstractC1893140zMe() { // from class: X.1ESk
                        @Override // X.AbstractC1201400hMw
                        public final String LIZLLL() {
                            return "poi_third_party_retain_food_and_drink";
                        }
                    };
                }
                break;
            case 69915028:
                if (str.equals("Hotel")) {
                    return new AbstractC1893140zMe() { // from class: X.1ESl
                        @Override // X.AbstractC1201400hMw
                        public final String LIZLLL() {
                            return "poi_third_party_retain_hotel";
                        }
                    };
                }
                break;
            case 1722859013:
                if (str.equals("Leisure")) {
                    return new AbstractC1893140zMe() { // from class: X.1ESm
                        @Override // X.AbstractC1201400hMw
                        public final String LIZLLL() {
                            return "poi_third_party_retain_leisure";
                        }
                    };
                }
                break;
            case 1985805468:
                if (str.equals("Beauty")) {
                    return new AbstractC1893140zMe() { // from class: X.1ESj
                        @Override // X.AbstractC1201400hMw
                        public final String LIZLLL() {
                            return "poi_third_party_retain_beauty";
                        }
                    };
                }
                break;
        }
        return new AbstractC1893140zMe() { // from class: X.1ESp
            @Override // X.AbstractC1201400hMw
            public final String LIZLLL() {
                return "poi_third_party_retain_unknown";
            }
        };
    }
}
