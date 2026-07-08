package X;

/* JADX INFO: renamed from: X.100t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191773100t implements C101A {
    public static final C191773100t LIZ = new C191773100t();

    @Override // X.C101A
    public final String getScenario() {
        return "comment_header";
    }

    @Override // X.C101A
    public final String LIZ(int i) {
        if (i == EnumC191769100p.CARE_MODE_ON.ordinal()) {
            return "care_mode_on";
        }
        if (i == EnumC191769100p.CARE_MODE_RECOMMEND.ordinal()) {
            return "care_mode_suggest";
        }
        if (i == EnumC191769100p.FILTER_ALL.ordinal()) {
            return "filter_all_comments";
        }
        return "";
    }
}
