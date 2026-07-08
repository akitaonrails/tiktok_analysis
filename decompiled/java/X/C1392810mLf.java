package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.multi.ui.AnchorPanelExtraInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0mLf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392810mLf {
    public static UrlModel LIZIZ(AnchorCommonStruct anchorCommonStruct) {
        AnchorPanelAction next;
        UrlModel icon;
        List<AnchorPanelAction> actions = anchorCommonStruct.getActions();
        if (actions != null) {
            Iterator<AnchorPanelAction> it2 = actions.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getActionType() == 1) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnchorPanelAction anchorPanelAction = next;
            if (anchorPanelAction != null && (icon = anchorPanelAction.getIcon()) != null) {
                return icon;
            }
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setUri("https://p16-sg.tiktokcdn.com/tiktok-obj/28px_primary_create_onDark3x.png~tplv-tiktokx-origin.image");
        ArrayList arrayList = new ArrayList();
        arrayList.add("https://p16-sg.tiktokcdn.com/tiktok-obj/28px_primary_create_onDark3x.png~tplv-tiktokx-origin.image");
        urlModel.setUrlList(arrayList);
        return urlModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r3, kotlin.jvm.functions.Function1 r4) {
        /*
            if (r3 == 0) goto L3e
            java.util.List r0 = r3.getActions()
            if (r0 == 0) goto L3e
            java.util.Iterator r3 = r0.iterator()
        Lc:
            boolean r0 = r3.hasNext()
            r2 = 0
            if (r0 == 0) goto L21
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.feed.model.AnchorPanelAction r0 = (com.ss.android.ugc.aweme.feed.model.AnchorPanelAction) r0
            int r1 = r0.getActionType()
            r0 = 1
            if (r1 != r0) goto Lc
        L21:
            com.ss.android.ugc.aweme.feed.model.AnchorPanelAction r2 = (com.ss.android.ugc.aweme.feed.model.AnchorPanelAction) r2
            if (r2 == 0) goto L3e
            java.lang.String r1 = r2.getSchema()
            if (r1 == 0) goto L3e
            boolean r0 = X.C123100dR.LIZ(r1)
            if (r0 == 0) goto L3e
        L31:
            X.0Qvl r0 = new X.0Qvl
            r0.<init>(r1)
            r4.invoke(r0)
            java.lang.String r0 = r0.LIZJ()
            return r0
        L3e:
            java.lang.String r1 = "aweme://openShoot"
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1392810mLf.LIZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct, kotlin.jvm.functions.Function1):java.lang.String");
    }

    public static void LIZLLL(Context context, String str, String str2) {
        String str3;
        String str4;
        if (str.length() == 0) {
            return;
        }
        String strLIZ = C0DMI.LIZ();
        C0XI4 c0xi4 = new C0XI4(str);
        c0xi4.LJ("creation_id", strLIZ);
        SmartRouter.buildRoute(context, c0xi4.LJFF()).open();
        Uri uri = UriProtector.parse(str);
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (C1392820mLg.LIZ()) {
            String str5 = "1";
            if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("is_login", str3);
            if (C838410Wul.LIZ(context, "android.permission.CAMERA") == 0) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("has_camera_permission", str4);
            if (C838410Wul.LIZ(context, "android.permission.RECORD_AUDIO") != 0) {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("has_microphone_permission", str5);
        }
        String strLIZ2 = C416901jj.LIZ(uri, "shoot_way");
        String str6 = "";
        if (strLIZ2 == null) {
            strLIZ2 = "";
        }
        String strLIZ3 = C416901jj.LIZ(uri, "enter_from");
        if (strLIZ3 != null) {
            str6 = strLIZ3;
        }
        IRecordMobService iRecordMobService = (IRecordMobService) PluggableExtentionKt.pluggableSpi$default(IRecordMobService.class, false, false, false, 14, null);
        if (iRecordMobService != null) {
            iRecordMobService.LIZLLL(new C1449410nox(strLIZ, strLIZ2, str6, str2, null, null, null, null, 240), c2344009Gk.LIZ);
        }
    }

    public static void LIZJ(Context context, AnchorCommonStruct anchorCommonStruct, Aweme aweme, AnchorPanelExtraInfo anchorPanelExtraInfo, String str) {
        String schema;
        if (anchorCommonStruct == null || (schema = anchorCommonStruct.getSchema()) == null || !C123100dR.LIZ(schema)) {
            schema = "aweme://openAnchorActionPanel";
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, schema);
        smartRouteBuildRoute.withParam("anchor_struct", anchorCommonStruct);
        smartRouteBuildRoute.withParam("anchor_extra_action_info", anchorPanelExtraInfo);
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        smartRouteBuildRoute.withParam("group_id", aid);
        smartRouteBuildRoute.withParam("action_url", str);
        smartRouteBuildRoute.open();
    }
}
