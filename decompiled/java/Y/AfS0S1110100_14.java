package Y;

import X.C09JN;
import X.C0ZIU;
import X.C1C7U;
import android.app.Activity;
import com.ss.android.ugc.aweme.api.VideoInfoFromURLResponse;

/* JADX INFO: loaded from: classes15.dex */
public class AfS0S1110100_14 implements C09JN {
    public final int $t;
    public long j3;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S1110100_14 afS0S1110100_14, Object obj) {
        C1C7U.LIZ("MentionVideoInfoUtil@67b5.getVideoInfoByAid$2");
        C0ZIU c0ziu = C0ZIU.LIZ;
        Activity activity = (Activity) afS0S1110100_14.l1;
        long j = afS0S1110100_14.j3;
        String str = afS0S1110100_14.s0;
        boolean z = afS0S1110100_14.z2;
        c0ziu.getClass();
        C0ZIU.LIZLLL(activity, (VideoInfoFromURLResponse) obj, j, str, z);
        C1C7U.LIZIZ("MentionVideoInfoUtil@67b5.getVideoInfoByAid$2");
    }

    public static final void accept$1(AfS0S1110100_14 afS0S1110100_14, Object obj) {
        C1C7U.LIZ("MentionVideoInfoUtil@67b5.getVideoInfoByAid$3");
        C0ZIU c0ziu = C0ZIU.LIZ;
        Activity activity = (Activity) afS0S1110100_14.l1;
        VideoInfoFromURLResponse videoInfoFromURLResponse = new VideoInfoFromURLResponse(104, null, null);
        long j = afS0S1110100_14.j3;
        String str = afS0S1110100_14.s0;
        boolean z = afS0S1110100_14.z2;
        c0ziu.getClass();
        C0ZIU.LIZLLL(activity, videoInfoFromURLResponse, j, str, z);
        C1C7U.LIZIZ("MentionVideoInfoUtil@67b5.getVideoInfoByAid$3");
    }

    public AfS0S1110100_14(Activity activity, long j, String str, boolean z, int i) {
        this.$t = i;
        this.l1 = activity;
        this.j3 = j;
        this.s0 = str;
        this.z2 = z;
    }
}
