package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0MM9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MM9 implements Serializable {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final UrlModel LLILZIL;

    public final String getAuthorSecId() {
        return this.LLILLL;
    }

    public final UrlModel getAvatarURL() {
        return this.LLILZIL;
    }

    public final String getNickName() {
        return this.LL;
    }

    public final String getRenderName() {
        return this.LLILZ;
    }

    public final String getUid() {
        return this.LLILLJJLI;
    }

    public C0MM9(String str, String str2, String str3, String str4, UrlModel urlModel) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = urlModel;
    }
}
