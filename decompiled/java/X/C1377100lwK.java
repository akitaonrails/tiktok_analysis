package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.share.improve.pkg.RemoteImageSharePackage;
import com.ss.android.ugc.aweme.web.share.model.WebShareInfo;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lwK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1377100lwK {
    public static RemoteImageSharePackage LIZ(Context context, WebShareInfo webShareInfo, String str, String str2, SendMessageTemplateTask sendMessageTemplateTask) {
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
        RemoteImageSharePackage remoteImageSharePackage = new RemoteImageSharePackage(c1370940lmO);
        remoteImageSharePackage.imageUrl = str;
        Bundle bundle = remoteImageSharePackage.extras;
        C786410Ut5.LJJJI("app_name", context.getString(R.string.drg), bundle);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("file://");
        sbLIZ.append(webShareInfo.getImagePath());
        C786410Ut5.LJJJI("thumb_url", C2188811AlT.LIZIZ(sbLIZ), bundle);
        C786410Ut5.LJJJI("thumb_path", webShareInfo.getImagePath(), bundle);
        C786410Ut5.LJJJI("url_for_im_share", str2, bundle);
        bundle.putBoolean("enable_copylink_desc", webShareInfo.getEnableCopyLinkDesc().booleanValue());
        return remoteImageSharePackage;
    }
}
