package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Zip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C907450Zip extends C2217421BqW implements Function1<IMUser, List<? extends C907840ZjS>> {
    public C907450Zip(C907810ZjP c907810ZjP) {
        super(1, c907810ZjP, C907810ZjP.class, "convertIMUserIntoSearchContent", "convertIMUserIntoSearchContent(Lcom/ss/android/ugc/aweme/im/contacts/api/model/IMUser;)Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends C907840ZjS> invoke(IMUser iMUser) {
        IMUser iMUser2 = iMUser;
        this.receiver.getClass();
        ArrayList arrayList = new ArrayList();
        String uid = iMUser2.getUid();
        String str = "";
        if (uid == null) {
            uid = "";
        }
        String nickName = iMUser2.getNickName();
        if (nickName == null) {
            nickName = "";
        }
        arrayList.add(new C907840ZjS(0, uid, 0, C907810ZjP.LIZJ(nickName), 0L, null, null, 480));
        String uid2 = iMUser2.getUid();
        if (uid2 == null) {
            uid2 = "";
        }
        String uniqueId = iMUser2.getUniqueId();
        if (uniqueId == null) {
            uniqueId = "";
        }
        arrayList.add(new C907840ZjS(0, uid2, 1, C907810ZjP.LIZJ(uniqueId), 0L, null, null, 480));
        if (C343230Dcv.LIZ() && C1247000iYU.LIZ(iMUser2) != null) {
            String uid3 = iMUser2.getUid();
            if (uid3 == null) {
                uid3 = "";
            }
            String strLIZ = C1247000iYU.LIZ(iMUser2);
            if (strLIZ != null) {
                str = strLIZ;
            }
            arrayList.add(new C907840ZjS(0, uid3, 5, C907810ZjP.LIZJ(str), 0L, null, null, 480));
        }
        return arrayList;
    }
}
