package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;

/* JADX INFO: renamed from: X.0ldY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365460ldY extends IMContact {
    public final UrlModel LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final List<IMUser> LLILZ;
    public final String LLILZIL;

    @Override // com.ss.android.ugc.aweme.im.common.model.BaseContact
    public void setNickName(String str) {
    }

    public final List<IMUser> getBatchContacts() {
        return this.LLILZ;
    }

    public final String getBatchGroupType() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.im.common.model.BaseContact
    public UrlModel getDisplayAvatar() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.im.common.model.BaseContact
    public String getDisplayName() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.common.model.BaseContact
    public String getNickName() {
        return this.LLILLJJLI;
    }

    public final String getPanelTitle() {
        return this.LLILLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1365460ldY(UrlModel urlModel, String str, String str2, List<? extends IMUser> list, String str3) {
        this.LL = urlModel;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = list;
        this.LLILZIL = str3;
        this.relationListItemType = 15;
    }
}
