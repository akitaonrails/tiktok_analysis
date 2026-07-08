package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateDynamicTask;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage;
import com.ss.android.ugc.aweme.web.share.model.WebShareInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lvK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376480lvK {
    public static boolean LIZ(String str, WebShareInfo.HybridContainerInfo hybridContainerInfo) {
        if (!Intrinsics.LJFF(str, "custom") || hybridContainerInfo == null || (!C123100dR.LIZ(hybridContainerInfo.url) && (!C123100dR.LIZ(hybridContainerInfo.urlContent) || hybridContainerInfo.urlContentType != 1))) {
            return false;
        }
        return true;
    }

    public static HybridImageSharePackage LIZIZ(Context context, WebShareInfo webShareInfo, String str, SendMessageTemplateTask sendMessageTemplateTask, SendMessageTemplateDynamicTask sendMessageTemplateDynamicTask) {
        C1370940lmO c1370940lmO = new C1370940lmO();
        c1370940lmO.LIZ = "web";
        c1370940lmO.LIZIZ = "web";
        c1370940lmO.LIZLLL = webShareInfo.getTitle();
        c1370940lmO.LJ = webShareInfo.getDesc();
        String strLJ = C1375500ltk.LJ(webShareInfo.getUrl());
        if (strLJ == null) {
            strLJ = "";
        }
        c1370940lmO.LJFF = strLJ;
        c1370940lmO.LJIIIIZZ = sendMessageTemplateTask;
        c1370940lmO.LJIIIZ = sendMessageTemplateDynamicTask;
        HybridImageSharePackage hybridImageSharePackage = new HybridImageSharePackage(c1370940lmO);
        hybridImageSharePackage.shareMode = webShareInfo.getShareMode();
        hybridImageSharePackage.hybridContainerInfo = webShareInfo.getHybridContainerInfo();
        Bundle bundle = hybridImageSharePackage.extras;
        C786410Ut5.LJJJI("app_name", context.getString(R.string.drg), bundle);
        C786410Ut5.LJJJI("url_for_im_share", str, bundle);
        C786410Ut5.LJJJI("thumb_url", webShareInfo.getImage(), bundle);
        bundle.putBoolean("enable_copylink_desc", webShareInfo.getEnableCopyLinkDesc().booleanValue());
        bundle.putBoolean("hide_custom_view_when_panel_height_rise", webShareInfo.getHybridContainerInfo().hideWhenPanelHeightRise);
        return hybridImageSharePackage;
    }
}
