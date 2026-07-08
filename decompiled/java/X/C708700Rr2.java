package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0Rr2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708700Rr2 {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public final C557050Lt1 LJFF = new C557050Lt1(false);
    public boolean LJI;
    public String LJII;
    public boolean LJIIIIZZ;

    public final void LIZ(String str, String str2, String str3) {
        String str4;
        if (!this.LJFF.LIZ(true, true) && this.LJI) {
            this.LJFF.LIZJ(true);
            if (this.LIZJ == 0) {
                return;
            }
            C442540HWy c442540HWy = C442540HWy.LIZ;
            boolean z = this.LIZLLL;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZJ;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            long j = this.LIZIZ;
            long j2 = this.LIZJ;
            if (j <= j2) {
                j = j2;
            }
            long j3 = jCurrentTimeMillis2 - j;
            long j4 = this.LJ;
            boolean z2 = this.LJIIIIZZ;
            String str5 = this.LJII;
            c442540HWy.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            String str6 = "1";
            if (z) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("image_loaded", str4);
            c2344009Gk.LIZLLL(jCurrentTimeMillis, "stay_duration");
            c2344009Gk.LIZLLL(j3, "play_duration");
            c2344009Gk.LIZLLL(j4, "image_load_duration");
            if (!z2) {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("has_blur_hash", str6);
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("enter_method", str2);
            c2344009Gk.LJIIIIZZ("report_timing", str3);
            c2344009Gk.LJIIIIZZ("error_msg", str5);
            C20684815ws.LJIILLIIL("story_photo_play_end", c2344009Gk.LIZ);
            this.LJII = null;
        }
    }
}
