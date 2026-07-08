package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager;
import com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0ZLl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898190ZLl implements C0ZEG {
    public static final C898190ZLl LL = new C898190ZLl();
    public static final C01GW LLILLJJLI = C452501pT.LIZIZ(new C898210ZLn());
    public static final C01GW LLILLL = C452501pT.LIZIZ(new C898200ZLm());

    public static boolean LIZLLL() {
        return !(C271470AkT.LIZ() == 0);
    }

    @Override // X.C0ZEG
    public final boolean LJJLIIIIJ() {
        return C271470AkT.LIZ() == 1 || C271470AkT.LIZ() == 2;
    }

    @Override // X.C0ZEG
    public final boolean LJJLIIIJJIZ() {
        return C271470AkT.LIZ() == 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.C0ZEG
    public final String LJJLIIIJJI(String str) {
        if (!LIZLLL()) {
            return null;
        }
        switch (str.hashCode()) {
            case -1756333452:
                if (!str.equals("friend_tab")) {
                }
                if (LJJLIIIJJIZ()) {
                }
                break;
            case -1597964810:
                if (!str.equals("activity_aggregation_page_repost")) {
                }
                if (!LJJLIIIJJIZ()) {
                }
                break;
            case -1183377658:
                if (!str.equals("profile_viewer_page")) {
                }
                if (LJJLIIIJJIZ()) {
                }
                break;
            case -369140392:
                if (!str.equals("activity_aggregation_page_fav") || !LJJLIIIIJ()) {
                }
                break;
            case 470023988:
                if (!str.equals("video_view_list")) {
                }
                if (LJJLIIIJJIZ()) {
                }
                break;
            case 640708618:
                if (!str.equals("repost_list")) {
                }
                if (!LJJLIIIJJIZ()) {
                }
                break;
            case 647307290:
                if (!str.equals("activity_aggregation_page_like_comment") || !LJJLIIIIJ()) {
                }
                break;
            case 1441735930:
                if (!str.equals("activity_aggregation_page_like")) {
                }
                if (!LJJLIIIIJ()) {
                }
                break;
            case 1879429506:
                if (!str.equals("video_like_list")) {
                }
                if (!LJJLIIIIJ()) {
                }
                break;
        }
        return null;
    }

    public static boolean LIZJ(Context context, int i, String str) {
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.LJJJJI(10.0f);
        tuxTextView.setText(str);
        tuxTextView.measure(0, 0);
        if (tuxTextView.getMeasuredWidth() > i) {
            return false;
        }
        return true;
    }

    public static String LIZ(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(str3);
        sbLIZ.append('_');
        sbLIZ.append(str4);
        sbLIZ.append('_');
        sbLIZ.append(str5);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0ZEG
    public final boolean LJJJJLI(String str, String str2, String str3, String str4, String str5) {
        if (!LIZLLL()) {
            return false;
        }
        return ((Set) LLILLL.getValue()).contains(LIZ(str, str2, str3, str4, str5));
    }

    @Override // X.C0ZEG
    public final void LJJJJLL(String str, String str2, Context context, boolean z, String str3, Map<String, String> map, View view) {
        LightInteractionCommonResource lightInteractionCommonResourceLJJIIZI;
        if (!LIZLLL() || (lightInteractionCommonResourceLJJIIZI = LightInteractionManager.LLJILLL.LJJIIZI(str)) == null) {
            return;
        }
        IRemindUsersViewHelper iRemindUsersViewHelperLJIJJLI = C1336205Ku.LIZ(false).getImChatService().LJIJJLI();
        String str4 = map.get("enter_from");
        if (str4 == null) {
            str4 = "";
        }
        iRemindUsersViewHelperLJIJJLI.LIZ(context, str4, z, new C898120ZLe(lightInteractionCommonResourceLJJIIZI, str3, view, context, z, str2, map));
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01ac A[PHI: r5
      0x01ac: PHI (r5v2 java.lang.String) = (r5v1 java.lang.String), (r5v3 java.lang.String) binds: [B:65:0x01a8, B:60:0x017e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C0ZEG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIZ(java.lang.String r28, com.ss.android.ugc.aweme.relation.follow.ui.RelationButton r29, java.lang.String r30, java.util.Map r31, java.lang.String r32, com.ss.android.ugc.aweme.profile.model.User r33, java.lang.String r34, boolean r35, com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent r36, java.lang.Integer r37, java.io.Serializable r38, androidx.lifecycle.LifecycleOwner r39, kotlin.jvm.functions.Function0 r40) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C898190ZLl.LJJIZ(java.lang.String, com.ss.android.ugc.aweme.relation.follow.ui.RelationButton, java.lang.String, java.util.Map, java.lang.String, com.ss.android.ugc.aweme.profile.model.User, java.lang.String, boolean, com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent, java.lang.Integer, java.io.Serializable, androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function0):boolean");
    }
}
