package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0SYU, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SYU {
    public static final C0SYU LIZ = new C0SYU();

    public static final boolean LIZ(C19EG c19eg, Aweme aweme, boolean z) {
        Boolean bool;
        AwemeStatus statusSafety;
        String string;
        AwemeStatus statusSafety2;
        AwemeStatus statusSafety3;
        if (aweme == null) {
            return true;
        }
        if (aweme.isCmtSwt()) {
            string = c19eg.getString(2131824697);
            bool = Boolean.TRUE;
        } else {
            if (AwemeExtKt.isScheduleVideo(aweme)) {
                bool = Boolean.TRUE;
            } else if (aweme.getVideoControl() != null && aweme.getVideoControl().timerStatus == 0) {
                bool = Boolean.TRUE;
            } else if (C0OAD.LIZIZ(aweme)) {
                string = C0OAD.LIZ(2131858174, aweme);
                bool = Boolean.FALSE;
            } else if (!aweme.isCanPlay()) {
                if (AwemeExtKt.isImage(aweme)) {
                    string = c19eg.getString(2131835839);
                } else {
                    string = c19eg.getString(2131858174);
                }
                bool = Boolean.FALSE;
            } else if (AwemeExtKt.getStatusSafety(aweme) != null && (statusSafety3 = AwemeExtKt.getStatusSafety(aweme)) != null && statusSafety3.isDelete()) {
                string = c19eg.getString(2131858124);
                bool = Boolean.FALSE;
            } else if (AwemeExtKt.getStatusSafety(aweme) == null || ((statusSafety2 = AwemeExtKt.getStatusSafety(aweme)) != null && statusSafety2.isAllowComment())) {
                C735280Sso.LIZ.getClass();
                if (C735280Sso.LIZJ(aweme) && !C735280Sso.LIZLLL(aweme) && (aweme.getAuthor() == null || !TextUtils.equals(aweme.getAuthor().getUid(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid()))) {
                    string = c19eg.getString(2131834929);
                    bool = Boolean.FALSE;
                } else {
                    LIZ.getClass();
                    if (AwemeExtKt.getStatusSafety(aweme) != null && (statusSafety = AwemeExtKt.getStatusSafety(aweme)) != null && statusSafety.getPrivateStatus() == 1 && aweme.getAuthor() != null && TextUtils.equals(aweme.getAuthor().getUid(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid())) {
                        if (!C729510SjV.LJJI(aweme) && !z) {
                            C723150SYf c723150SYf = new C723150SYf(c19eg);
                            c723150SYf.LJIIJ(new C19211310Dv());
                            c723150SYf.LJIILL(aweme);
                            C21566919al c21566919al = new C21566919al(c19eg);
                            c21566919al.LIZ(2131845230);
                            c21566919al.LJII(R.string.f1_, new DialogInterfaceOnClickListenerC738760SyQ(aweme, 3), false);
                            c21566919al.LJIIJ(2131836386, new DialogInterfaceOnClickListenerC738730SyN(c723150SYf, aweme, 1), false);
                            new C21566519ah(c21566919al).LIZLLL();
                        }
                        bool = Boolean.TRUE;
                    } else {
                        bool = null;
                    }
                }
            } else {
                string = c19eg.getString(2131828317);
                bool = Boolean.FALSE;
            }
            string = "";
        }
        if (C123100dR.LIZ(string) && !z) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        CommentService.LIZ.getClass();
        if (C523420Kfs.LIZ().LJIILLIIL(aweme) || !C523420Kfs.LIZ().LJJIJIIJIL(aweme)) {
            return true;
        }
        C735280Sso.LIZ.getClass();
        if (C735280Sso.LJFF(aweme) || C10EU.LJIIIIZZ()) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(C19EG c19eg, Aweme aweme, String str, String str2, CommentContextSource commentContextSource) {
        String aid;
        int iHashCode;
        String strEnterFrom;
        String strEnterMethod;
        String strEventType;
        String aid2;
        String authorUid;
        String aid3;
        if (c19eg == null) {
            return true;
        }
        C1340510kzJ.LIZ.getClass();
        if (!C1340510kzJ.LIZIZ(commentContextSource)) {
            boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryBlockUserClickAction aweme ==>");
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            sbLIZ.append(" actionLabel:");
            sbLIZ.append(str2);
            sbLIZ.append(" hasSource:");
            if (commentContextSource != null) {
                iHashCode = commentContextSource.hashCode();
            } else {
                iHashCode = 0;
            }
            sbLIZ.append(iHashCode);
            sbLIZ.append(" enterFrom:");
            if (commentContextSource != null) {
                strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSource);
            } else {
                strEnterFrom = null;
            }
            sbLIZ.append(strEnterFrom);
            sbLIZ.append(" enterMethod:");
            if (commentContextSource != null) {
                strEnterMethod = CommentContextSourceKt.enterMethod(commentContextSource);
            } else {
                strEnterMethod = null;
            }
            sbLIZ.append(strEnterMethod);
            sbLIZ.append(" eventType:");
            if (commentContextSource != null) {
                strEventType = CommentContextSourceKt.eventType(commentContextSource);
            } else {
                strEventType = null;
            }
            sbLIZ.append(strEventType);
            C1344030l4z.LIZJ("AwemeStatusHelper", C2188811AlT.LIZIZ(sbLIZ));
            if (!zIsLogin) {
                if (str == null) {
                    str = "";
                }
                if (str2 == null) {
                    str2 = "";
                }
                C627150Oin c627150Oin = new C627150Oin();
                if (aweme != null) {
                    aid2 = aweme.getAid();
                } else {
                    aid2 = null;
                }
                C786410Ut5.LJJJI("group_id", aid2, c627150Oin.LIZ);
                if (aweme != null) {
                    authorUid = AwemeExtKt.getAuthorUid(aweme);
                } else {
                    authorUid = null;
                }
                C786410Ut5.LJJJI("author_id", authorUid, c627150Oin.LIZ);
                if (aweme != null) {
                    aid3 = aweme.getAid();
                } else {
                    aid3 = null;
                }
                C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(aid3), c627150Oin.LIZ);
                C0XPD.LIZIZ(c19eg, str, str2, c627150Oin.LIZ, null);
                return true;
            }
            return LIZ(c19eg, aweme, false);
        }
        C1389880mGw c1389880mGw = new C1389880mGw(c19eg);
        c1389880mGw.LJIIIIZZ(2131838507);
        c1389880mGw.LJIIJ();
        return true;
    }
}
