package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wYg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1785280wYg {
    public static final EnumC1785280wYg CALENDLY;
    public static final EnumC1785280wYg COURSE;
    public static final EnumC1785280wYg DM;
    public static final EnumC1785280wYg FORM;
    public static final /* synthetic */ EnumC1785280wYg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1785280wYg THIRD_PARTY_SERVICE;

    public static InterfaceC2044707zh<EnumC1785280wYg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1785280wYg enumC1785280wYg = new EnumC1785280wYg("DM", 0);
        DM = enumC1785280wYg;
        EnumC1785280wYg enumC1785280wYg2 = new EnumC1785280wYg("FORM", 1);
        FORM = enumC1785280wYg2;
        EnumC1785280wYg enumC1785280wYg3 = new EnumC1785280wYg("COURSE", 2);
        COURSE = enumC1785280wYg3;
        EnumC1785280wYg enumC1785280wYg4 = new EnumC1785280wYg("CALENDLY", 3);
        CALENDLY = enumC1785280wYg4;
        EnumC1785280wYg enumC1785280wYg5 = new EnumC1785280wYg("THIRD_PARTY_SERVICE", 4);
        THIRD_PARTY_SERVICE = enumC1785280wYg5;
        EnumC1785280wYg[] enumC1785280wYgArr = {enumC1785280wYg, enumC1785280wYg2, enumC1785280wYg3, enumC1785280wYg4, enumC1785280wYg5};
        LL = enumC1785280wYgArr;
        LLILLJJLI = new C2254308sP(enumC1785280wYgArr);
    }

    public static EnumC1785280wYg[] values() {
        return (EnumC1785280wYg[]) LL.clone();
    }

    public final String getEtPreviousPageValue() {
        int i = C1782080wTW.LIZ[ordinal()];
        if (i == 1) {
            return "dm_landing_page";
        }
        if (i == 2) {
            return "form_landing_page";
        }
        if (i == 3) {
            return "course_landing_page";
        }
        if (i == 4) {
            return "calendar_landing_page";
        }
        if (i == 5) {
            return "third_party_service_landing_page";
        }
        throw new C1954807lC();
    }

    public final int getPerfTrackerPageLinkId() {
        int i = C1782080wTW.LIZ[ordinal()];
        if (i == 1) {
            return 1011;
        }
        if (i == 2) {
            return 1012;
        }
        if (i == 3) {
            return 1019;
        }
        if (i == 4) {
            return 1016;
        }
        if (i == 5) {
            return 1017;
        }
        throw new C1954807lC();
    }

    public final String getPerfTrackerPageName() {
        int i = C1782080wTW.LIZ[ordinal()];
        if (i == 1) {
            return "PCSDMPage";
        }
        if (i == 2) {
            return "PCSForm2Page";
        }
        if (i == 3) {
            return "PCSCourseDetailPage";
        }
        if (i == 4) {
            return "CalendlyBooking";
        }
        if (i == 5) {
            return "PCSThirdParty";
        }
        throw new C1954807lC();
    }

    public final String getSkuFeatureName() {
        int i = C1782080wTW.LIZ[ordinal()];
        if (i == 1) {
            return "dm";
        }
        if (i == 2) {
            return "form";
        }
        if (i == 3) {
            return "course";
        }
        if (i == 4) {
            return "calendar";
        }
        if (i == 5) {
            return "third_party_service";
        }
        throw new C1954807lC();
    }

    public final String getEtServiceTypeValue() {
        return getSkuFeatureName();
    }

    public static EnumC1785280wYg valueOf(String str) {
        return (EnumC1785280wYg) C08FF.LIZ(EnumC1785280wYg.class, str);
    }

    public final String getSingleSkuTitle(String str) {
        int i = C1782080wTW.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return C497740JfY.LJIJJ(2131855885, str);
                        }
                        throw new C1954807lC();
                    }
                    return C497740JfY.LJIJI(2131855875);
                }
                return C497740JfY.LJIJI(2131855866);
            }
            return C497740JfY.LJIJI(2131855873);
        }
        return C497740JfY.LJIJI(2131855871);
    }

    public EnumC1785280wYg(String str, int i) {
    }

    public final String getServiceSkuTitle(String str, C1166404hK c1166404hK) {
        int i = C1782080wTW.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return C497740JfY.LJIJJ(2131856144, str, c1166404hK.LIZ);
                        }
                        throw new C1954807lC();
                    }
                    return C497740JfY.LJIJJ(2131855863, str);
                }
                return C497740JfY.LJIJJ(2131855867, str);
            }
            return C497740JfY.LJIJJ(2131855874, str);
        }
        return str;
    }

    public static /* synthetic */ String getSingleSkuTitle$default(EnumC1785280wYg enumC1785280wYg, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = "";
            }
            return enumC1785280wYg.getSingleSkuTitle(str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSingleSkuTitle");
    }
}
