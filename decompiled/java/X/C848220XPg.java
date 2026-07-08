package X;

import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.CommonUserInfo;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XPg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848220XPg implements InterfaceC1051760dTa {
    public final IESJsBridge LL;

    public C848220XPg(IESJsBridge iESJsBridge) {
        this.LL = iESJsBridge;
    }

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
    @Override // X.InterfaceC1051760dTa
    public final void call(C1058910df7 c1058910df7, JSONObject jSONObject) throws JSONException {
        int iOptInt;
        String str;
        String str2;
        String str3;
        String str4;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = new JSONObject();
        if (c1058910df7 != null && (jSONObject2 = c1058910df7.LIZLLL) != null) {
            iOptInt = jSONObject2.optInt("limit");
        } else {
            iOptInt = 3;
        }
        List<BaseLoginMethod> listLIZJ = C0XUE.LIZ.LIZJ(C0XQ5.LIZIZ.LJIIJ().LJJI());
        JSONArray jSONArray = new JSONArray();
        for (BaseLoginMethod baseLoginMethod : listLIZJ) {
            JSONObject jSONObject4 = new JSONObject();
            CommonUserInfo commonUserInfo = baseLoginMethod.getCommonUserInfo();
            String str5 = "";
            if (commonUserInfo == null || (str2 = commonUserInfo.avatarUrl) == null) {
                str2 = "";
            }
            jSONObject4.put("avatar", str2);
            CommonUserInfo commonUserInfo2 = baseLoginMethod.getCommonUserInfo();
            if (commonUserInfo2 == null || (str3 = commonUserInfo2.userName) == null) {
                str3 = "";
            }
            jSONObject4.put("nickname", str3);
            CommonUserInfo commonUserInfo3 = baseLoginMethod.getCommonUserInfo();
            if (commonUserInfo3 != null && (str4 = commonUserInfo3.secUid) != null) {
                str5 = str4;
            }
            jSONObject4.put("sec_uid", str5);
            jSONObject4.put("uid", baseLoginMethod.getUid());
            jSONArray.put(jSONObject4);
            if (jSONArray.length() >= iOptInt) {
                break;
            }
        }
        jSONObject3.put("data", jSONArray);
        IESJsBridge iESJsBridge = this.LL;
        if (c1058910df7 != null) {
            str = c1058910df7.LIZIZ;
        } else {
            str = null;
        }
        iESJsBridge.LIZ(str, jSONObject3);
    }
}
