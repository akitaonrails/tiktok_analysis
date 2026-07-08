package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;

/* JADX INFO: renamed from: X.05nu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1462005nu extends IMContact {
    public C0YAE LL;

    @Override // com.ss.android.ugc.aweme.im.common.model.BaseContact
    public void setNickName(String str) {
    }

    @Override // com.ss.android.ugc.aweme.im.common.model.BaseContact
    public UrlModel getDisplayAvatar() {
        IMUser iMUserLIZ = C05QS.LIZ(this);
        if (iMUserLIZ != null) {
            return iMUserLIZ.getDisplayAvatar();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.common.model.BaseContact
    public String getDisplayName() {
        IMUser iMUserLIZ = C05QS.LIZ(this);
        if (iMUserLIZ != null) {
            return iMUserLIZ.getDisplayName();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.common.model.BaseContact
    public String getNickName() {
        IMUser iMUserLIZ = C05QS.LIZ(this);
        if (iMUserLIZ != null) {
            return iMUserLIZ.getNickName();
        }
        return null;
    }

    public final C0YAE getMember() {
        return this.LL;
    }

    public final void setMember(C0YAE c0yae) {
        this.LL = c0yae;
    }

    public C1462005nu(String str, String str2) {
        setUid(str);
        setSecUid(str2);
    }
}
