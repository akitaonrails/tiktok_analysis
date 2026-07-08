package X;

import android.text.Spannable;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.android.livesdk.model.message.common.TextFormat;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.live.Text;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.List;

/* JADX INFO: renamed from: X.0JEx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C488810JEx {
    public static final C488810JEx LIZ = new C488810JEx();

    public static String LIZ(Text text) {
        String strLJJLI;
        String string;
        if (text == null) {
            return "";
        }
        com.bytedance.android.livesdk.model.message.common.Text text2 = new com.bytedance.android.livesdk.model.message.common.Text();
        text2.key = text.key;
        String str = text.defaultPattern;
        text2.defaultPattern = str;
        String str2 = text.defaultFormat;
        String str3 = text.pieces;
        if (!TextUtils.isEmpty(str2)) {
            try {
                text2.defaultFormat = (TextFormat) C09C2.LIZ().LJII(str2, TextFormat.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            try {
                text2.pieces = (List) C09C2.LIZ().LJIIIIZZ(str3, new TypeToken<List<? extends TextPiece>>() { // from class: X.0JEz
                }.getType());
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        if (!TextUtils.isEmpty(text2.key)) {
            strLJJLI = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJLI(text2.key);
        } else {
            strLJJLI = null;
        }
        InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
        if (!TextUtils.isEmpty(strLJJLI)) {
            str = strLJJLI;
        }
        Spannable spannableLJJI = interfaceC20673515v3K4.LJJI(text2, str);
        if (spannableLJJI == null || (string = spannableLJJI.toString()) == null) {
            return "";
        }
        return string;
    }

    public static void LIZIZ(TextView textView, Text text) {
        String strLJJLI;
        if (textView != null && text != null) {
            com.bytedance.android.livesdk.model.message.common.Text text2 = new com.bytedance.android.livesdk.model.message.common.Text();
            text2.key = text.key;
            String str = text.defaultPattern;
            text2.defaultPattern = str;
            String str2 = text.pieces;
            if (!TextUtils.isEmpty(str)) {
                try {
                    text2.defaultFormat = (TextFormat) C09C2.LIZ().LJII(str, TextFormat.class);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    text2.pieces = (List) C09C2.LIZ().LJIIIIZZ(str2, new TypeToken<List<? extends TextPiece>>() { // from class: X.0JEy
                    }.getType());
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            if (!TextUtils.isEmpty(text2.key)) {
                strLJJLI = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJLI(text2.key);
            } else {
                strLJJLI = null;
            }
            InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
            if (!TextUtils.isEmpty(strLJJLI)) {
                str = strLJJLI;
            }
            textView.setText(interfaceC20673515v3K4.LJJI(text2, str));
        }
    }
}
