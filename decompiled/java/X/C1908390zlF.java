package X;

import android.net.Uri;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.experiment.CommentPreloadExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0zlF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908390zlF implements InterfaceC1209290hZf {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(229));

    public static CopyOnWriteArraySet LIZIZ(InnerPushMessage innerPushMessage) {
        String str;
        String str2;
        String str3;
        String str4;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
        if (uiTemplate != null && (str4 = uiTemplate.avatarSchema) != null) {
            String strLIZJ = LIZJ(str4);
            if (C703302op.LIZ(strLIZJ)) {
                copyOnWriteArraySet.add(strLIZJ);
            }
        }
        InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
        if (uiTemplate2 != null && (str3 = uiTemplate2.middleSchemaUrl) != null) {
            String strLIZJ2 = LIZJ(str3);
            if (C703302op.LIZ(strLIZJ2)) {
                copyOnWriteArraySet.add(strLIZJ2);
            }
        }
        InnerPushUITemplate uiTemplate3 = innerPushMessage.getUiTemplate();
        if (uiTemplate3 != null && (str2 = uiTemplate3.rightSchemaUrl) != null) {
            String strLIZJ3 = LIZJ(str2);
            if (C703302op.LIZ(strLIZJ3)) {
                copyOnWriteArraySet.add(strLIZJ3);
            }
        }
        InnerPushUITemplate uiTemplate4 = innerPushMessage.getUiTemplate();
        if (uiTemplate4 != null && (str = uiTemplate4.globalSchemaUrl) != null) {
            String strLIZJ4 = LIZJ(str);
            if (C703302op.LIZ(strLIZJ4)) {
                copyOnWriteArraySet.add(strLIZJ4);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAidFromInnerPush aids size:");
        sbLIZ.append(copyOnWriteArraySet.size());
        sbLIZ.append(" aids:");
        sbLIZ.append(copyOnWriteArraySet);
        C19290510dT.LIZ("InnerPushPreloadManager", C2188811AlT.LIZIZ(sbLIZ));
        return copyOnWriteArraySet;
    }

    public static String LIZJ(String str) {
        if (C703302op.LIZ(str) && u.LJJIIJZLJL(str, "aweme://aweme/detail/", false)) {
            Matcher matcher = PatternProtector.compile("\\d+\\d").matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
            return null;
        }
        return null;
    }

    public static String LIZLLL(String str) {
        if (C703302op.LIZ(str) && u.LJJIIJZLJL(str, "aweme://aweme/detail/", false)) {
            Uri uri = UriProtector.parse(str);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "cid");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "upvote_id");
            }
            return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        }
        return null;
    }

    @Override // X.InterfaceC1209290hZf
    public final Aweme LIZ(String str) {
        return (Aweme) ((LruCache) this.LIZ.getValue()).get(str);
    }

    public final void LJ(InnerPushMessage innerPushMessage) {
        String str;
        String strLIZJ;
        String str2;
        String strLIZJ2;
        String str3;
        String strLIZJ3;
        String str4;
        String strLIZJ4;
        CommentPreloadExperiment.LIZ.getClass();
        if (!((CommentPreloadExperiment.Meta) CommentPreloadExperiment.LIZJ.getValue()).isEnable()) {
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
        if (uiTemplate != null && (str4 = uiTemplate.avatarSchema) != null && (strLIZJ4 = LIZJ(str4)) != null) {
            String strLIZLLL = LIZLLL(str4);
            Aweme awemeLIZ = LIZ(strLIZJ4);
            if (awemeLIZ != null) {
                copyOnWriteArraySet.add(new C1348700lCW(awemeLIZ, strLIZLLL));
            }
        }
        InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
        if (uiTemplate2 != null && (str3 = uiTemplate2.middleSchemaUrl) != null && (strLIZJ3 = LIZJ(str3)) != null) {
            String strLIZLLL2 = LIZLLL(str3);
            Aweme awemeLIZ2 = LIZ(strLIZJ3);
            if (awemeLIZ2 != null) {
                copyOnWriteArraySet.add(new C1348700lCW(awemeLIZ2, strLIZLLL2));
            }
        }
        InnerPushUITemplate uiTemplate3 = innerPushMessage.getUiTemplate();
        if (uiTemplate3 != null && (str2 = uiTemplate3.rightSchemaUrl) != null && (strLIZJ2 = LIZJ(str2)) != null) {
            String strLIZLLL3 = LIZLLL(str2);
            Aweme awemeLIZ3 = LIZ(strLIZJ2);
            if (awemeLIZ3 != null) {
                copyOnWriteArraySet.add(new C1348700lCW(awemeLIZ3, strLIZLLL3));
            }
        }
        InnerPushUITemplate uiTemplate4 = innerPushMessage.getUiTemplate();
        if (uiTemplate4 != null && (str = uiTemplate4.globalSchemaUrl) != null && (strLIZJ = LIZJ(str)) != null) {
            String strLIZLLL4 = LIZLLL(str);
            Aweme awemeLIZ4 = LIZ(strLIZJ);
            if (awemeLIZ4 != null) {
                copyOnWriteArraySet.add(new C1348700lCW(awemeLIZ4, strLIZLLL4));
            }
        }
        if (!copyOnWriteArraySet.isEmpty()) {
            CommentService.LIZ.getClass();
            C523420Kfs.LIZ().LJJII(2, "inner_push", C13LP.LLIIII(copyOnWriteArraySet));
        }
    }
}
