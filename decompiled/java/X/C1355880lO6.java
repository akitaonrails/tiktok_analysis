package X;

import android.text.TextUtils;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0lO6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355880lO6 extends C1157560gEE<C1355880lO6> {
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;

    public String getEnterFrom() {
        return TextUtils.isEmpty(this.LL) ? this.LLILLJJLI : this.LL;
    }

    public String getEnterMethod() {
        return TextUtils.equals(getEnterFrom(), "notification_page") ? "notification" : this.LLILLL;
    }

    public String getEventType() {
        return this.LLILLJJLI;
    }

    public C1355880lO6(final String str) {
        new Serializable(str) { // from class: X.0gEE
        };
    }

    public C1355880lO6 setEnterFrom(String str) {
        this.LL = str;
        return this;
    }

    public C1355880lO6 setEnterMethod(String str) {
        this.LLILLL = str;
        return this;
    }

    public C1355880lO6 setEventType(String str) {
        this.LLILLJJLI = str;
        return this;
    }
}
