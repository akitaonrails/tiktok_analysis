package X;

/* JADX INFO: renamed from: X.0guY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183800guY {
    public static final String LIZ(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "unavailable" : "from_you_landmark" : "from_landmark" : "landmark" : "from_you" : "city_center";
    }

    public static final String LIZIZ(int i) {
        if (i == EnumC1183790guX.SAME_AREA.getValue()) {
            return "same_area";
        }
        if (i == EnumC1183790guX.ON_TRIP.getValue()) {
            return "on_trip";
        }
        if (i == EnumC1183790guX.DIFF_AREA.getValue()) {
            return "diff_area";
        }
        return "unavailable";
    }
}
