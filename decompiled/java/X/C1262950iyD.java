package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0iyD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262950iyD implements Serializable {
    public static final int $stable = 0;
    public final String buttonText;
    public final int socialRecType;
    public final String subTitle;
    public final String title;
    public final String toast;

    public C1262950iyD() {
        this(0, "", "", "", "");
    }

    public C1262950iyD(int i, String str, String str2, String str3, String str4) {
        this.socialRecType = i;
        this.title = str;
        this.subTitle = str2;
        this.buttonText = str3;
        this.toast = str4;
    }
}
