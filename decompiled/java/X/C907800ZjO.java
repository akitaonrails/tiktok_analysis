package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZjO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C907800ZjO extends C2217421BqW implements Function1<IMUserBaseInfo, String> {
    public C907800ZjO(C907520Ziw c907520Ziw) {
        super(1, c907520Ziw, C907520Ziw.class, "getUserBaseInfoLogString", "getUserBaseInfoLogString$im_search_impl_release(Lcom/ss/android/ugc/aweme/im/contacts/api/model/IMUserBaseInfo;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(IMUserBaseInfo iMUserBaseInfo) {
        IMUserBaseInfo iMUserBaseInfo2 = iMUserBaseInfo;
        this.receiver.getClass();
        if (iMUserBaseInfo2 == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(iMUserBaseInfo2.getMafStatus());
        sbLIZ.append('#');
        sbLIZ.append(iMUserBaseInfo2.getFollowStatus());
        sbLIZ.append('#');
        sbLIZ.append(iMUserBaseInfo2.getUserId());
        sbLIZ.append('#');
        sbLIZ.append(iMUserBaseInfo2.getNickName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
