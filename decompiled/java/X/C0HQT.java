package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0HQT, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HQT {
    public static final C0HQT LIZ = new C0HQT();

    public static void LIZ(int i, long j, boolean z) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_animated", str);
        c2344009Gk.LIZLLL(j, "time_ms");
        c2344009Gk.LIZJ(i, "size_px");
        C20684815ws.LJIILLIIL("mix_studio_preload_time", c2344009Gk.LIZ);
    }
}
