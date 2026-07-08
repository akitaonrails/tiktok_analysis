package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799100VWi extends C09AY implements Function0<C0W91> {
    public C799100VWi() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0W91] */
    @Override // kotlin.jvm.functions.Function0
    public final C0W91 invoke() {
        return new InterfaceC799110VWj() { // from class: X.0W91
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.InterfaceC799110VWj
            public final String LIZ(String str) {
                switch (str.hashCode()) {
                    case -2050191939:
                        if (str.equals("detail_page")) {
                            return "latency_feed_detail";
                        }
                        break;
                    case -1849961962:
                        if (str.equals("my_profile")) {
                            return "latency_personal_profile";
                        }
                        break;
                    case -1731750228:
                        if (str.equals("single_song")) {
                            return "latency_music_detail";
                        }
                        break;
                    case -1271119582:
                        if (str.equals("homepage_follow")) {
                            return "latency_follow";
                        }
                        break;
                    case 950398559:
                        if (str.equals("comment")) {
                            return "latency_comment";
                        }
                        break;
                    case 1216225589:
                        if (str.equals("user_profile")) {
                            return "latency_other_profile";
                        }
                        break;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("latency_others_");
                sbLIZ.append(str);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        };
    }
}
