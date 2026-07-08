package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06Ar, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1564706Ar extends C2217421BqW implements Function1<String, IMUser> {
    public C1564706Ar(C06FO c06fo) {
        super(1, c06fo, C06FO.class, "getUserFromCache", "getUserFromCache(Ljava/lang/String;)Lcom/ss/android/ugc/aweme/im/contacts/api/model/IMUser;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IMUser invoke(String str) {
        this.receiver.getClass();
        IMContactApi.LIZ.getClass();
        return C069P.LIZ().LJ().LJ(str, null);
    }
}
