package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0SA8, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SA8 implements Runnable {
    public final String LL;
    public final String LLILLJJLI;
    public final Aweme LLILLL;
    public final int LLILZ;
    public final String LLILZIL;
    public final boolean LLILZLL;
    public final int LLIZ;
    public final Map<String, String> LLIZLLLIL;
    public final HashMap<String, String> LLJ;
    public final boolean LLJI;
    public final String LLJIJIL;
    public final Long LLJILJIL;
    public final int LLJILJILJ;
    public final Long LLJILLL;
    public final String LLJJ;
    public final String LLJJI;
    public final String LLJJIII;
    public final Long LLJJIJI;
    public final String LLJJIJIIJIL;

    public final void LIZ() {
        C0SQK c0sqk = C0SQK.LIZ;
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        Aweme aweme = this.LLILLL;
        int i = this.LLILZ;
        String str3 = this.LLILZIL;
        boolean z = this.LLILZLL;
        int i2 = this.LLIZ;
        Map<String, String> map = this.LLIZLLLIL;
        HashMap<String, String> map2 = this.LLJ;
        boolean z2 = this.LLJI;
        String str4 = this.LLJIJIL;
        Long l = this.LLJILJIL;
        int iAbs = Math.abs(this.LLJILJILJ);
        Long l2 = this.LLJILLL;
        String str5 = this.LLJJ;
        String str6 = this.LLJJI;
        String str7 = this.LLJJIII;
        Long l3 = this.LLJJIJI;
        String str8 = this.LLJJIJIIJIL;
        c0sqk.getClass();
        C0SQK.LIZIZ(str, str2, aweme, i, str3, null, z, i2, map, map2, z2, str4, l, iAbs, l2, str5, str6, str7, l3, str8);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PhotoSlidesEventTracker$LogPhotoSlideRunnable@e490.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotoSlidesEventTracker$LogPhotoSlideRunnable@e490.run");
    }

    public C0SA8(String str, String str2, Aweme aweme, int i, String str3, boolean z, int i2, Map map, HashMap map2, boolean z2, String str4, Long l, int i3, Long l2, String str5, String str6, String str7, Long l3, String str8) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = aweme;
        this.LLILZ = i;
        this.LLILZIL = str3;
        this.LLILZLL = z;
        this.LLIZ = i2;
        this.LLIZLLLIL = map;
        this.LLJ = map2;
        this.LLJI = z2;
        this.LLJIJIL = str4;
        this.LLJILJIL = l;
        this.LLJILJILJ = i3;
        this.LLJILLL = l2;
        this.LLJJ = str5;
        this.LLJJI = str6;
        this.LLJJIII = str7;
        this.LLJJIJI = l3;
        this.LLJJIJIIJIL = str8;
    }
}
