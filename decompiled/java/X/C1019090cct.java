package X;

import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.commercialize.track.RawURLGetter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS251S0000000_16;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.0cct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019090cct {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        OmVast omVast;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (omVast = awemeRawAd.getOmVast()) != null && omVast.providerType == 3) {
            return true;
        }
        return false;
    }

    public static final void LIZIZ(final AwemeRawAd awemeRawAd) {
        Sequence sequenceLIZJ;
        String str;
        C1045270dJ7 c1045270dJ7;
        List<C1045260dJ6> list;
        if (awemeRawAd == null) {
            return;
        }
        OmVast omVast = awemeRawAd.getOmVast();
        if (omVast != null && (c1045270dJ7 = omVast.vast) != null && (list = c1045270dJ7.creativeList) != null) {
            sequenceLIZJ = C09RB.LJIILIIL(new C1939607ik(list), new AwS251S0000000_16(7));
        } else {
            sequenceLIZJ = C09R4.LIZJ();
        }
        C1045060dIm c1045060dIm = (C1045060dIm) C09RB.LJIIL(sequenceLIZJ);
        if (c1045060dIm != null) {
            Set<String> set = c1045060dIm.clickTracking;
            if (set != null && !set.isEmpty()) {
                C08QT c08qt = new C08QT(C09RB.LJIIIZ(new C1939607ik(c1045060dIm.clickTracking), AFwS252S0000000_16.get$arr$(680)));
                while (c08qt.hasNext()) {
                    final String str2 = (String) c08qt.next();
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    RawURLGetter.LIZ(str2, new C0XI1() { // from class: X.0ckz
                        @Override // X.C0XI1
                        public final void LIZ(int i, boolean z, Exception exc) {
                            String message;
                            if (!z) {
                                C1024100cky c1024100ckyLIZ = C1024150cl3.LIZ();
                                c1024100ckyLIZ.LJFF(awemeRawAd);
                                c1024100ckyLIZ.LIZ = "draw_ad";
                                c1024100ckyLIZ.LIZIZ = "load_failed";
                                Pair[] pairArr = new Pair[3];
                                pairArr[0] = new Pair("error_message", "vast_click_tracker_bad_response");
                                pairArr[1] = new Pair("error_code", Integer.valueOf(i));
                                String message2 = null;
                                if (exc != null) {
                                    message = exc.getMessage();
                                } else {
                                    message = null;
                                }
                                pairArr[2] = new Pair("error_detail", message);
                                c1024100ckyLIZ.LIZ(C2097608Jq.LJIIIIZZ(pairArr));
                                c1024100ckyLIZ.LJIIIZ();
                                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "load_failed", awemeRawAd);
                                c1022820ciuLIZLLL.LIZJ("debug", "ad_event_type");
                                c1022820ciuLIZLLL.LIZIZ("vast_click_tracker_bad_response", "error_message");
                                c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "error_code");
                                if (exc != null) {
                                    message2 = exc.getMessage();
                                }
                                c1022820ciuLIZLLL.LIZIZ(message2, "error_detail");
                                c1022820ciuLIZLLL.LJIIIIZZ();
                            }
                            String str3 = str2;
                            String strValueOf = String.valueOf(i);
                            long j = jCurrentTimeMillis;
                            AwemeRawAd awemeRawAd2 = awemeRawAd;
                            C1024100cky c1024100ckyLIZIZ = C1024150cl3.LIZIZ(j, str3, strValueOf);
                            c1024100ckyLIZIZ.LJFF = "track_url";
                            c1024100ckyLIZIZ.LIZ = "track_ad";
                            c1024100ckyLIZIZ.LJ.LIZ("track_label", "click");
                            c1024100ckyLIZIZ.LJFF(awemeRawAd2);
                            c1024100ckyLIZIZ.LJIIJ();
                        }
                    });
                }
                return;
            }
            OmVast omVast2 = awemeRawAd.getOmVast();
            if (omVast2 != null && omVast2.providerType == 2 && (str = c1045060dIm.clickThrough) != null && str.length() != 0) {
                RawURLGetter.LIZ(c1045060dIm.clickThrough, new C0XI1() { // from class: X.0cl0
                    @Override // X.C0XI1
                    public final void LIZ(int i, boolean z, Exception exc) {
                        String message;
                        if (!z) {
                            C1024100cky c1024100ckyLIZ = C1024150cl3.LIZ();
                            c1024100ckyLIZ.LJFF(awemeRawAd);
                            c1024100ckyLIZ.LIZ = "draw_ad";
                            c1024100ckyLIZ.LIZIZ = "load_failed";
                            Pair[] pairArr = new Pair[3];
                            pairArr[0] = new Pair("error_message", "vast_clickthru_bad_response");
                            pairArr[1] = new Pair("error_code", Integer.valueOf(i));
                            String message2 = null;
                            if (exc != null) {
                                message = exc.getMessage();
                            } else {
                                message = null;
                            }
                            pairArr[2] = new Pair("error_detail", message);
                            c1024100ckyLIZ.LIZ(C2097608Jq.LJIIIIZZ(pairArr));
                            c1024100ckyLIZ.LJIIIZ();
                            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "load_failed", awemeRawAd);
                            c1022820ciuLIZLLL.LIZJ("debug", "ad_event_type");
                            c1022820ciuLIZLLL.LIZIZ("vast_clickthru_bad_response", "error_message");
                            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "error_code");
                            if (exc != null) {
                                message2 = exc.getMessage();
                            }
                            c1022820ciuLIZLLL.LIZIZ(message2, "error_detail");
                            c1022820ciuLIZLLL.LJIIIIZZ();
                        }
                    }
                });
            }
        }
    }
}
