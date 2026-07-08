package Y;

import X.C09JN;
import X.C0ZIH;
import X.C0ZIO;
import X.C1C7U;
import com.ss.android.ugc.aweme.api.ValidInfo;
import com.ss.android.ugc.aweme.api.VideoInfoFromURLResponse;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class AfS4S1102000_14 implements C09JN {
    public final int $t;
    public int i2;
    public int i3;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) throws Throwable {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS4S1102000_14 afS4S1102000_14, Object obj) throws Throwable {
        ValidInfo validInfo;
        C0ZIH c0zih;
        String str;
        Boolean boolValueOf;
        C1C7U.LIZ("AddVideoUtil@cfe5.getVideoInfoAndReplace$2");
        VideoInfoFromURLResponse videoInfoFromURLResponse = (VideoInfoFromURLResponse) obj;
        C0ZIO c0zio = C0ZIO.LIZ;
        int i = afS4S1102000_14.i2;
        int i2 = afS4S1102000_14.i3;
        C0ZIH c0zih2 = (C0ZIH) afS4S1102000_14.l1;
        c0zio.getClass();
        C0ZIO.LIZ(i, i2, c0zih2);
        int i3 = videoInfoFromURLResponse.statusCode;
        if (i3 == 408) {
            C0ZIH c0zih3 = (C0ZIH) afS4S1102000_14.l1;
            if (c0zih3 != null) {
                c0zih3.LJIILJJIL("timeout", false, afS4S1102000_14.i2, null, afS4S1102000_14.s0);
            }
        } else {
            String str2 = null;
            if (i3 == 0 && (validInfo = videoInfoFromURLResponse.validInfo) != null && videoInfoFromURLResponse.videoInfo != null) {
                Boolean boolValueOf2 = Boolean.valueOf(validInfo.attachable);
                if (boolValueOf2 != null) {
                    if (boolValueOf2.booleanValue() && (c0zih = (C0ZIH) afS4S1102000_14.l1) != null) {
                        List<String> mentionVideoIdList = c0zih.getMentionVideoIdList();
                        if (mentionVideoIdList.size() > 3) {
                            C0ZIH c0zih4 = (C0ZIH) afS4S1102000_14.l1;
                            c0zih4.LJIILJJIL(c0zih4.getContext().getString(2131830014), false, afS4S1102000_14.i2, null, afS4S1102000_14.s0);
                        } else if (mentionVideoIdList.size() == 3) {
                            C0ZIH c0zih5 = (C0ZIH) afS4S1102000_14.l1;
                            c0zih5.LJIILJJIL(c0zih5.getContext().getString(2131830013), false, afS4S1102000_14.i2, null, afS4S1102000_14.s0);
                        } else if (mentionVideoIdList.contains(String.valueOf(videoInfoFromURLResponse.videoInfo.awemeId))) {
                            C0ZIH c0zih6 = (C0ZIH) afS4S1102000_14.l1;
                            c0zih6.LJIILJJIL(c0zih6.getContext().getString(2131830012), false, afS4S1102000_14.i2, null, afS4S1102000_14.s0);
                        } else {
                            C0ZIH c0zih7 = (C0ZIH) afS4S1102000_14.l1;
                            ValidInfo validInfo2 = videoInfoFromURLResponse.validInfo;
                            if (validInfo2 != null && (str = validInfo2.toastContent) != null) {
                                if (validInfo2 != null && (boolValueOf = Boolean.valueOf(validInfo2.isLongUrl())) != null) {
                                    c0zih7.LJIILJJIL(str, boolValueOf.booleanValue(), afS4S1102000_14.i2, videoInfoFromURLResponse.videoInfo, afS4S1102000_14.s0);
                                } else {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                    } else {
                        C0ZIH c0zih8 = (C0ZIH) afS4S1102000_14.l1;
                        if (c0zih8 != null) {
                            ValidInfo validInfo3 = videoInfoFromURLResponse.validInfo;
                            if (validInfo3 != null) {
                                str2 = validInfo3.toastContent;
                            }
                            c0zih8.LJIILJJIL(str2, false, afS4S1102000_14.i2, null, afS4S1102000_14.s0);
                        }
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                C0ZIH c0zih9 = (C0ZIH) afS4S1102000_14.l1;
                if (c0zih9 != null) {
                    ValidInfo validInfo4 = videoInfoFromURLResponse.validInfo;
                    if (validInfo4 != null) {
                        str2 = validInfo4.toastContent;
                    }
                    c0zih9.LJIILJJIL(str2, false, afS4S1102000_14.i2, null, afS4S1102000_14.s0);
                }
            }
        }
        C1C7U.LIZIZ("AddVideoUtil@cfe5.getVideoInfoAndReplace$2");
    }

    public static final void accept$1(AfS4S1102000_14 afS4S1102000_14, Object obj) throws Throwable {
        C1C7U.LIZ("AddVideoUtil@cfe5.getVideoInfoAndReplace$3");
        C0ZIO c0zio = C0ZIO.LIZ;
        int i = afS4S1102000_14.i2;
        int i2 = afS4S1102000_14.i3;
        C0ZIH c0zih = (C0ZIH) afS4S1102000_14.l1;
        c0zio.getClass();
        C0ZIO.LIZ(i, i2, c0zih);
        C0ZIH c0zih2 = (C0ZIH) afS4S1102000_14.l1;
        if (c0zih2 != null) {
            c0zih2.LJIILJJIL("timeout", false, afS4S1102000_14.i2, null, afS4S1102000_14.s0);
        }
        C1C7U.LIZIZ("AddVideoUtil@cfe5.getVideoInfoAndReplace$3");
    }

    public AfS4S1102000_14(int i, int i2, C0ZIH c0zih, String str, int i3) {
        this.$t = i3;
        this.i2 = i;
        this.i3 = i2;
        this.l1 = c0zih;
        this.s0 = str;
    }
}
