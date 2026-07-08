package X;

import android.content.Context;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.publicgroup.data.GroupCompositeType;
import com.ss.android.ugc.aweme.publicgroup.data.GroupPreviewDisplayMeta;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS651S0100000_2;

/* JADX INFO: renamed from: X.0i9N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1231430i9N {
    public static final C1231430i9N LIZ = new C1231430i9N();
    public static final Set<EnumC1346360l8k> LIZIZ = C13LQ.LJLIIL(new EnumC1346360l8k[]{EnumC1346360l8k.COMMENT_PANEL, EnumC1346360l8k.INBOX_QUICK_COMMENT});
    public static final Map<String, String> LIZJ = new LinkedHashMap();

    public static float LIZIZ() {
        return C1347570lAh.LIZIZ() ? C418440Gaw.LIZIZ(16) : C418440Gaw.LIZIZ(14);
    }

    public static boolean LIZ(CommentContextSource commentContextSource) {
        EnumC1346360l8k inputServiceType;
        Aweme aweme;
        CommentKeyboardModel keyboardModel;
        if (((Number) C270110AiH.LIZ.getValue()).intValue() != 1) {
            return false;
        }
        String authorUid = null;
        if (commentContextSource != null && (keyboardModel = commentContextSource.getKeyboardModel()) != null) {
            inputServiceType = keyboardModel.getInputServiceType();
        } else {
            inputServiceType = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("canShowEntrance. inputServiceType: ");
        sbLIZ.append(inputServiceType);
        C2188811AlT.LIZIZ(sbLIZ);
        if (inputServiceType != null && !LIZIZ.contains(inputServiceType)) {
            return false;
        }
        if (commentContextSource != null && (aweme = CommentContextSourceKt.aweme(commentContextSource)) != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        }
        if (C10EU.LJIIZILJ(authorUid) && C1228910i5J.LIZ(new GroupCompositeType(EnumC1228990i5R.PUBLIC_GROUP.getValue(), "", EnumC1219960hqs.UNKNOWN.getValue()))) {
            return true;
        }
        return false;
    }

    public static String LIZJ(EnumC1346360l8k enumC1346360l8k) {
        if (enumC1346360l8k != null) {
            int i = C1231440i9O.LIZ[enumC1346360l8k.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "quick_reply_comment_panel";
                }
                return "";
            }
            return "post_comment_panel";
        }
        return "";
    }

    public static C1228810i59 LJ(Context context, CommentContextSource commentContextSource, String str, InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1228860i5E interfaceC1228860i5E) {
        Object obj;
        EnumC1346360l8k inputServiceType;
        String aid;
        String str2;
        Aweme aweme;
        Aweme aweme2;
        CommentKeyboardModel keyboardModel;
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        String strLIZIZ = C461720I8s.LIZIZ();
        IMContactApi.LIZ.getClass();
        String authorUid = null;
        IMUser iMUserLJ = C069P.LIZ().LJ().LJ(strLIZIZ, null);
        if (iMUserLJ == null || (imUserBizInfo = iMUserLJ.getImUserBizInfo()) == null || (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) == null || (obj = userB2CAccountInfo.userTags) == null) {
            obj = ((LinkedHashMap) LIZJ).get(strLIZIZ);
        }
        Pair[] pairArr = new Pair[4];
        if (commentContextSource != null && (keyboardModel = commentContextSource.getKeyboardModel()) != null) {
            inputServiceType = keyboardModel.getInputServiceType();
        } else {
            inputServiceType = null;
        }
        pairArr[0] = new Pair("enter_position", LIZJ(inputServiceType));
        if (commentContextSource != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSource)) != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        if (aid == null) {
            aid = "";
        }
        pairArr[1] = new Pair("group_id", aid);
        if (commentContextSource != null && (aweme = CommentContextSourceKt.aweme(commentContextSource)) != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        }
        if (C10EU.LJIIZILJ(authorUid)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("is_video_author", str2);
        if (obj == null) {
            obj = "";
        }
        pairArr[3] = new Pair("group_owner_account_type", obj);
        return new C1228810i59(str, "comment_panel_group_icon", C461720I8s.LIZIZ(), false, false, null, 0L, null, EnumC1228830i5B.COMMENT_ADD_GROUP, C2097608Jq.LJIIIIZZ(pairArr), 2, null, null, null, null, new AwS651S0100000_2(interfaceC1631620sYq, (InterfaceC1631620sYq<? super C0Y8T, ? super Function0<Unit>, ? super GroupPreviewDisplayMeta, Unit>) 10), true, interfaceC1228860i5E, new C1229270i5t(0, true, Float.valueOf(0.95f), context.getString(2131831365), Integer.valueOf(R.raw.icon_create_group), context.getString(2131831435), R.attr.a1b, Float.valueOf(LIZIZ()), 1), 246512);
    }

    public static C1228650i4t LIZLLL(Context context, CommentContextSource commentContextSource, String str, String str2, final Function1 function1, boolean z, InterfaceC1228860i5E interfaceC1228860i5E) {
        EnumC1346360l8k inputServiceType;
        CommentKeyboardModel keyboardModel;
        if (commentContextSource != null && (keyboardModel = commentContextSource.getKeyboardModel()) != null) {
            inputServiceType = keyboardModel.getInputServiceType();
        } else {
            inputServiceType = null;
        }
        return new C1228650i4t(str, str2, EnumC1228990i5R.PUBLIC_GROUP.getValue(), null, 0, new C1228700i4y(EnumC1228720i50.NONE.getValue(), 0, null, new InterfaceC1228750i53() { // from class: X.0i9P
            @Override // X.InterfaceC1228750i53
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1228750i53
            public final void LIZ(C0Y8T c0y8t) {
                function1.invoke(c0y8t);
            }
        }, null, 22), z, interfaceC1228860i5E, C2097908Jt.LIZJ(new Pair("enter_position", LIZJ(inputServiceType))), false, Float.valueOf(0.95f), false, Float.valueOf(LIZIZ()), new AwS633S0100000_19(context, 312), context.getString(2131831369), "", R.attr.a1b, R.attr.a03, true, null, null, null, -386400104, 1);
    }
}
