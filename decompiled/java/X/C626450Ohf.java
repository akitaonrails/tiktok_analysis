package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0Ohf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626450Ohf implements WeakHandler.IHandler {
    public static final C626450Ohf LL = new C626450Ohf();
    public static final WeakHandler LLILLJJLI = new WeakHandler(LL);
    public static C0N7R LLILLL;

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Bundle data;
        if (message == null || message.what != 1048577 || (data = message.getData()) == null) {
            return;
        }
        try {
            String string = data.getString("refer");
            AwemeRawAd awemeRawAd = (AwemeRawAd) data.getSerializable("aweme_raw_data");
            C844470XAv.LIZ.getClass();
            C1019030ccn.LJJIIJZLJL(C844470XAv.LIZ(), awemeRawAd, string);
            message.setData(null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LIZ(Context context, Aweme aweme, String str) {
        Integer numValueOf;
        if (context == null) {
            return;
        }
        int leftSlideClickDuration = 0;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && (numValueOf = Integer.valueOf(awemeRawAd.getLeftSlideClickType())) != null) {
                if (numValueOf.intValue() == 0) {
                    C1019030ccn.LJJIII(context, aweme, null, str);
                    return;
                }
                if (numValueOf.intValue() == 1) {
                    return;
                }
                if (numValueOf.intValue() == 2) {
                    AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                    if (awemeRawAd2 != null) {
                        leftSlideClickDuration = awemeRawAd2.getLeftSlideClickDuration();
                    }
                    WeakHandler weakHandler = LLILLJJLI;
                    weakHandler.removeMessages(1048577);
                    try {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 1048577;
                        Bundle bundle = new Bundle();
                        C786410Ut5.LJJJI("refer", str, bundle);
                        C786410Ut5.LJJIZ(bundle, "aweme_raw_data", aweme.getAwemeRawAd());
                        messageObtain.setData(bundle);
                        weakHandler.sendMessageDelayed(messageObtain, ((long) leftSlideClickDuration) * 1000);
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1019030ccn.LJJIII(context, aweme, null, str);
                        return;
                    }
                }
                if (numValueOf.intValue() == 3) {
                    LLILLL = new C0N7R(aweme, str);
                    return;
                }
            }
            C1019030ccn.LJJIII(context, aweme, null, str);
        }
    }
}
