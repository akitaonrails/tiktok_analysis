package X;

import android.media.MediaMetadataRetriever;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS599S0100000_20;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13ru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20144413ru {
    public static String LIZ(MediaMetadataRetriever mediaMetadataRetriever) {
        return C2204961BRm.LJLJI(mediaMetadataRetriever, 20, new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe36LtVGH/KjmBqnU8Oh8UPnA3naxTYRzK3xGiG6X9+gTFYttt1eFA==", null));
    }

    public static String LIZIZ(MediaMetadataRetriever mediaMetadataRetriever) {
        return C2204961BRm.LJLJI(mediaMetadataRetriever, 25, new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe36LtVGH/KjmBqnU8Oh8UPnA3naxTYRzK3xGiG6X9+gTFYttt1eFA==", null));
    }

    public static String LIZJ(MediaMetadataRetriever mediaMetadataRetriever) {
        return C2204961BRm.LJLJI(mediaMetadataRetriever, 9, new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe36LtVGH/KjmBqnU8Oh8UPnA3naxTYRzK3xGiG6X9+gTFYttt1eFA==", null));
    }

    public static String LJ(MediaMetadataRetriever mediaMetadataRetriever) {
        return C2204961BRm.LJLJI(mediaMetadataRetriever, 12, new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe36LtVGH/KjmBqnU8Oh8UPnA3naxTYRzK3xGiG6X9+gTFYttt1eFA==", null));
    }

    public static String LJFF(MediaMetadataRetriever mediaMetadataRetriever) {
        return C2204961BRm.LJLJI(mediaMetadataRetriever, 19, new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe36LtVGH/KjmBqnU8Oh8UPnA3naxTYRzK3xGiG6X9+gTFYttt1eFA==", null));
    }

    public static String LJI(MediaMetadataRetriever mediaMetadataRetriever) {
        return C2204961BRm.LJLJI(mediaMetadataRetriever, 24, new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe36LtVGH/KjmBqnU8Oh8UPnA3naxTYRzK3xGiG6X9+gTFYttt1eFA==", null));
    }

    public static String LJII(MediaMetadataRetriever mediaMetadataRetriever) {
        return C2204961BRm.LJLJI(mediaMetadataRetriever, 18, new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe36LtVGH/KjmBqnU8Oh8UPnA3naxTYRzK3xGiG6X9+gTFYttt1eFA==", null));
    }

    public static String[] LIZLLL(MediaMetadataRetriever mediaMetadataRetriever, TokenCert tokenCert) throws C838130WuJ {
        boolean z;
        int i;
        Double dLJII;
        tokenCert.attachCustomInfo("dataflowID", 1476403202);
        C825940Wae c825940Wae = new C825940Wae(tokenCert, "MediaMetadataRetriever_extractMetadata", new String[]{"location"}, Integer.valueOf(EnumC746240TPa.BPEA_ENTRY.getType()), "Collect", 800);
        C837860Wts.LIZ(c825940Wae, "android/media/MediaMetadataRetriever", "extractMetadata(I)Ljava/lang/String;", C2097908Jt.LIZJ(new Pair("keyCode", 23)));
        String str = (String) C838080WuE.LIZ(c825940Wae, new AwS599S0100000_20(mediaMetadataRetriever, 27));
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        String strLJJZ = a0.LJJZ(str, "/", str);
        int length = strLJJZ.length();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < length) {
                char cCharAt = strLJJZ.charAt(i2);
                if (cCharAt == '+' || cCharAt == '-') {
                    i = -1;
                    if (i3 == 0) {
                        if (cCharAt == '-') {
                            i3 = -1;
                        } else {
                            i3 = 1;
                        }
                    } else if (cCharAt != '-') {
                        i = 1;
                    }
                }
                i2++;
            } else {
                i = 0;
                break;
            }
        }
        if (i3 != 0 && i != 0) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJJZ, new String[]{"+", "-"}, 0, 6);
            if (listLJJLIIIJILLIZJL.size() >= 3 && (dLJII = C2327809Ae.LJII(a0.LJLIIIL((String) ListProtector.get(listLJJLIIIJILLIZJL, 1)).toString())) != null) {
                double dDoubleValue = dLJII.doubleValue() * ((double) i3);
                Double dLJII2 = C2327809Ae.LJII(a0.LJLIIIL((String) ListProtector.get(listLJJLIIIJILLIZJL, 2)).toString());
                if (dLJII2 != null) {
                    double dDoubleValue2 = dLJII2.doubleValue() * ((double) i);
                    if (C19857512mj.LIZ(dDoubleValue, dDoubleValue2)) {
                        Pair pair = new Pair(Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue2));
                        C1199590hK1 c1199590hK1LIZIZ = C839940WxE.LIZIZ(((Number) pair.getFirst()).doubleValue(), ((Number) pair.getSecond()).doubleValue(), tokenCert);
                        return new String[]{c1199590hK1LIZIZ.LIZ, c1199590hK1LIZIZ.LIZIZ};
                    }
                }
            }
        }
        return null;
    }
}
