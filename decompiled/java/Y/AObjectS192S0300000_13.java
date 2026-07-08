package Y;

import X.C0XO2;
import X.C0XPY;
import X.C0XQ5;
import X.C0XUE;
import X.C0XUT;
import X.C0XVC;
import X.C0XVI;
import X.C1238280iKQ;
import X.C15O7;
import X.C2204931BRj;
import X.C852170Xbr;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.lobby.auth.AuthResult;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPUserInfo;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IAccountHelperService;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public class AObjectS192S0300000_13 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$0(AObjectS192S0300000_13 aObjectS192S0300000_13, Object obj) {
        ?? r7;
        BaseLoginMethod tPLoginMethod;
        boolean z;
        AuthorizeActivity authorizeActivity = (AuthorizeActivity) aObjectS192S0300000_13.l0;
        C0XO2 c0xo2 = (C0XO2) aObjectS192S0300000_13.l1;
        Intent intent = (Intent) aObjectS192S0300000_13.l2;
        String str = AuthorizeActivity._pnsPageId;
        authorizeActivity.getClass();
        C0XVC.LIZIZ("CustomizedHook", null, (C0XVI) obj);
        User userLIZJ = C0XQ5.LIZJ();
        String uid = userLIZJ.getUid();
        if (!TextUtils.isEmpty(uid)) {
            C0XUE c0xue = C0XUE.LIZ;
            if ("passkey".equals(authorizeActivity.LLIZ)) {
                tPLoginMethod = new C0XUT(uid, LoginMethodName.PASSKEY, CommonUserInfo.defaultCommonUserInfo(), Long.valueOf(System.currentTimeMillis()), -1L, c0xo2.LJJIFFI, c0xo2.LJIIIZ, c0xo2.LJIIJ);
                z = true;
            } else {
                z = true;
                tPLoginMethod = new TPLoginMethod(uid, authorizeActivity.LLIZ, TPUserInfo.from(userLIZJ), false, CommonUserInfo.defaultCommonUserInfo(), Long.valueOf(System.currentTimeMillis()), -1L, c0xo2.LJJIFFI, c0xo2.LJIIIZ, c0xo2.LJIIJ);
            }
            c0xue.LJI(tPLoginMethod, z);
            r7 = z;
        } else {
            r7 = 1;
        }
        if (C0XQ5.LJFF()) {
            C0XQ5.LJIIJJI(19, r7, "");
        }
        if (authorizeActivity.LLILZIL != null) {
            IAccountHelperService iAccountHelperService = (IAccountHelperService) C0XPY.LIZIZ(IAccountHelperService.class);
            String str2 = authorizeActivity.LLIZ;
            AuthResult authResult = authorizeActivity.LLILZIL;
            iAccountHelperService.friendUploadToken(str2, authResult.mToken, authResult.mTokenSecret);
        }
        authorizeActivity.LLLLZLL(-1, intent);
        HashMap map = new HashMap();
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        boolean z2 = c0xo2.LJII;
        String str3 = authorizeActivity.LLIZ;
        c852170Xbr.getClass();
        C852170Xbr.LJIIL(z2, str3, authorizeActivity, c0xo2, map);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS192S0300000_13 aObjectS192S0300000_13, Object obj) {
        BaseLoginMethod tPLoginMethod;
        C15O7 c15o7 = (C15O7) obj;
        C0XVC.LIZ(null, "CustomizedHook", "login");
        User userLIZJ = C0XQ5.LIZJ();
        String uid = userLIZJ.getUid();
        if (!TextUtils.isEmpty(uid)) {
            C0XUE c0xue = C0XUE.LIZ;
            if ("passkey".equals(((AuthorizeActivity) aObjectS192S0300000_13.l2).LLIZ)) {
                LoginMethodName loginMethodName = LoginMethodName.PASSKEY;
                CommonUserInfo commonUserInfoDefaultCommonUserInfo = CommonUserInfo.defaultCommonUserInfo();
                Long lValueOf = Long.valueOf(System.currentTimeMillis());
                C0XO2 c0xo2 = (C0XO2) aObjectS192S0300000_13.l0;
                tPLoginMethod = new C0XUT(uid, loginMethodName, commonUserInfoDefaultCommonUserInfo, lValueOf, -1L, c0xo2.LJJIFFI, c0xo2.LJIIIZ, c0xo2.LJIIJ);
            } else {
                String str = ((AuthorizeActivity) aObjectS192S0300000_13.l2).LLIZ;
                TPUserInfo tPUserInfoFrom = TPUserInfo.from(userLIZJ);
                CommonUserInfo commonUserInfoDefaultCommonUserInfo2 = CommonUserInfo.defaultCommonUserInfo();
                Long lValueOf2 = Long.valueOf(System.currentTimeMillis());
                C0XO2 c0xo22 = (C0XO2) aObjectS192S0300000_13.l0;
                tPLoginMethod = new TPLoginMethod(uid, str, tPUserInfoFrom, false, commonUserInfoDefaultCommonUserInfo2, lValueOf2, -1L, c0xo22.LJJIFFI, c0xo22.LJIIIZ, c0xo22.LJIIJ);
            }
            c0xue.LJI(tPLoginMethod, true);
        }
        if (C0XQ5.LJFF()) {
            C0XQ5.LJIIJJI(19, 1, "");
            C0XQ5.LJIIJJI(1, 1, "");
            C0XQ5.LJII(C0XQ5.LIZJ());
        }
        if (((AuthorizeActivity) aObjectS192S0300000_13.l2).LLILZIL != null) {
            IAccountHelperService iAccountHelperService = (IAccountHelperService) C0XPY.LIZIZ(IAccountHelperService.class);
            AuthorizeActivity authorizeActivity = (AuthorizeActivity) aObjectS192S0300000_13.l2;
            String str2 = authorizeActivity.LLIZ;
            AuthResult authResult = authorizeActivity.LLILZIL;
            iAccountHelperService.friendUploadToken(str2, authResult.mToken, authResult.mTokenSecret);
        }
        if (c15o7.LJIILL()) {
            ((AuthorizeActivity) aObjectS192S0300000_13.l2).LLLLZLL(0, (Intent) aObjectS192S0300000_13.l1);
            return null;
        }
        C1238280iKQ.LIZIZ(11);
        ((AuthorizeActivity) aObjectS192S0300000_13.l2).LLLLZLL(-1, (Intent) aObjectS192S0300000_13.l1);
        HashMap map = new HashMap();
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        C0XO2 c0xo23 = (C0XO2) aObjectS192S0300000_13.l0;
        boolean z = c0xo23.LJII;
        AuthorizeActivity authorizeActivity2 = (AuthorizeActivity) aObjectS192S0300000_13.l2;
        String str3 = authorizeActivity2.LLIZ;
        c852170Xbr.getClass();
        C852170Xbr.LJIIL(z, str3, authorizeActivity2, c0xo23, map);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$2(AObjectS192S0300000_13 aObjectS192S0300000_13, Object obj) {
        ?? r7;
        BaseLoginMethod tPLoginMethod;
        boolean z;
        C2204931BRj c2204931BRj = (C2204931BRj) aObjectS192S0300000_13.l0;
        C0XO2 c0xo2 = (C0XO2) aObjectS192S0300000_13.l1;
        Intent intent = (Intent) aObjectS192S0300000_13.l2;
        c2204931BRj.getClass();
        C0XVC.LIZIZ("CustomizedHook", null, (C0XVI) obj);
        User userLIZJ = C0XQ5.LIZJ();
        String uid = userLIZJ.getUid();
        if (!TextUtils.isEmpty(uid)) {
            C0XUE c0xue = C0XUE.LIZ;
            if ("passkey".equals(c2204931BRj.LLIZ)) {
                tPLoginMethod = new C0XUT(uid, LoginMethodName.PASSKEY, CommonUserInfo.defaultCommonUserInfo(), Long.valueOf(System.currentTimeMillis()), -1L, c0xo2.LJJIFFI, c0xo2.LJIIIZ, c0xo2.LJIIJ);
                z = true;
            } else {
                z = true;
                tPLoginMethod = new TPLoginMethod(uid, c2204931BRj.LLIZ, TPUserInfo.from(userLIZJ), false, CommonUserInfo.defaultCommonUserInfo(), Long.valueOf(System.currentTimeMillis()), -1L, c0xo2.LJJIFFI, c0xo2.LJIIIZ, c0xo2.LJIIJ);
            }
            c0xue.LJI(tPLoginMethod, z);
            r7 = z;
        } else {
            r7 = 1;
        }
        if (C0XQ5.LJFF()) {
            C0XQ5.LJIIJJI(19, r7, "");
        }
        if (c2204931BRj.LLILZIL != null) {
            IAccountHelperService iAccountHelperService = (IAccountHelperService) C0XPY.LIZIZ(IAccountHelperService.class);
            String str = c2204931BRj.LLIZ;
            AuthResult authResult = c2204931BRj.LLILZIL;
            iAccountHelperService.friendUploadToken(str, authResult.mToken, authResult.mTokenSecret);
        }
        c2204931BRj.LJIIIIZZ(-1, intent);
        HashMap map = new HashMap();
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        boolean z2 = c0xo2.LJII;
        String str2 = c2204931BRj.LLIZ;
        c852170Xbr.getClass();
        C852170Xbr.LJIIL(z2, str2, c2204931BRj, c0xo2, map);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$3(AObjectS192S0300000_13 aObjectS192S0300000_13, Object obj) {
        ?? r0;
        boolean z;
        BaseLoginMethod tPLoginMethod;
        C2204931BRj c2204931BRj = (C2204931BRj) aObjectS192S0300000_13.l0;
        C0XO2 c0xo2 = (C0XO2) aObjectS192S0300000_13.l1;
        Intent intent = (Intent) aObjectS192S0300000_13.l2;
        C15O7 c15o7 = (C15O7) obj;
        c2204931BRj.getClass();
        C0XVC.LIZ(null, "CustomizedHook", "login");
        User userLIZJ = C0XQ5.LIZJ();
        String uid = userLIZJ.getUid();
        if (!TextUtils.isEmpty(uid)) {
            C0XUE c0xue = C0XUE.LIZ;
            if ("passkey".equals(c2204931BRj.LLIZ)) {
                z = true;
                tPLoginMethod = new C0XUT(uid, LoginMethodName.PASSKEY, CommonUserInfo.defaultCommonUserInfo(), Long.valueOf(System.currentTimeMillis()), -1L, c0xo2.LJJIFFI, c0xo2.LJIIIZ, c0xo2.LJIIJ);
            } else {
                z = true;
                tPLoginMethod = new TPLoginMethod(uid, c2204931BRj.LLIZ, TPUserInfo.from(userLIZJ), false, CommonUserInfo.defaultCommonUserInfo(), Long.valueOf(System.currentTimeMillis()), -1L, c0xo2.LJJIFFI, c0xo2.LJIIIZ, c0xo2.LJIIJ);
            }
            c0xue.LJI(tPLoginMethod, z);
            r0 = z;
        } else {
            r0 = 1;
        }
        if (C0XQ5.LJFF()) {
            C0XQ5.LJIIJJI(19, r0, "");
            C0XQ5.LJIIJJI(r0, r0, "");
            C0XQ5.LJII(C0XQ5.LIZJ());
        }
        if (c2204931BRj.LLILZIL != null) {
            IAccountHelperService iAccountHelperService = (IAccountHelperService) C0XPY.LIZIZ(IAccountHelperService.class);
            String str = c2204931BRj.LLIZ;
            AuthResult authResult = c2204931BRj.LLILZIL;
            iAccountHelperService.friendUploadToken(str, authResult.mToken, authResult.mTokenSecret);
        }
        if (c15o7.LJIILL()) {
            c2204931BRj.LJIIIIZZ(0, intent);
            return null;
        }
        C1238280iKQ.LIZIZ(11);
        c2204931BRj.LJIIIIZZ(-1, intent);
        HashMap map = new HashMap();
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        boolean z2 = c0xo2.LJII;
        String str2 = c2204931BRj.LLIZ;
        c852170Xbr.getClass();
        C852170Xbr.LJIIL(z2, str2, c2204931BRj, c0xo2, map);
        return null;
    }

    public AObjectS192S0300000_13(AuthorizeActivity authorizeActivity, C0XO2 c0xo2, Intent intent, int i) {
        this.$t = i;
        if (i != 0) {
            this.l2 = authorizeActivity;
            this.l0 = c0xo2;
            this.l1 = intent;
        } else {
            this.l0 = authorizeActivity;
            this.l1 = c0xo2;
            this.l2 = intent;
        }
    }

    public AObjectS192S0300000_13(C2204931BRj c2204931BRj, C0XO2 c0xo2, Intent intent, int i) {
        this.$t = i;
        this.l0 = c2204931BRj;
        this.l1 = c0xo2;
        this.l2 = intent;
    }
}
