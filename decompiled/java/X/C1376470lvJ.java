package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.share.improve.pkg.Base64ImageSharePackage;
import com.ss.android.ugc.aweme.web.share.model.WebShareInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lvJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376470lvJ {
    public static Base64ImageSharePackage LIZ(Context context, WebShareInfo webShareInfo, SendMessageTemplateTask sendMessageTemplateTask) {
        C1370940lmO c1370940lmO = new C1370940lmO();
        c1370940lmO.LIZ = "pic";
        c1370940lmO.LIZIZ = "web";
        c1370940lmO.LIZLLL = webShareInfo.getTitle();
        c1370940lmO.LJ = webShareInfo.getDesc();
        String strLJ = C1375500ltk.LJ(webShareInfo.getUrl());
        if (strLJ == null) {
            strLJ = "";
        }
        c1370940lmO.LJFF = strLJ;
        c1370940lmO.LJIIIIZZ = sendMessageTemplateTask;
        Base64ImageSharePackage base64ImageSharePackage = new Base64ImageSharePackage(c1370940lmO);
        base64ImageSharePackage.shareMode = webShareInfo.getShareMode();
        base64ImageSharePackage.imageData = webShareInfo.getImageData();
        base64ImageSharePackage.type = webShareInfo.getType();
        C786410Ut5.LJJJI("app_name", context.getString(R.string.drg), base64ImageSharePackage.extras);
        return base64ImageSharePackage;
    }

    public static boolean LIZIZ(int i, String str, String str2) {
        if (i != 2 || !Intrinsics.LJFF(str, "data") || str2.length() == 0) {
            return false;
        }
        return true;
    }
}
