package X;

import X.C1351080lGM;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0lGM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1351080lGM<T extends C1351080lGM> implements Serializable {
    public static final long serialVersionUID = 9148864135191458444L;
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;

    public String getAid() {
        return this.LLILLJJLI;
    }

    public String getAuthorUid() {
        return this.LLILLL;
    }

    public String getCid() {
        return this.LL;
    }

    public C1351080lGM(String str) {
        this.LLILLJJLI = str;
    }

    public C1351080lGM setAid(String str) {
        this.LLILLJJLI = str;
        return this;
    }

    public T setAuthorUid(String str) {
        this.LLILLL = str;
        return this;
    }

    public C1351080lGM setCid(String str) {
        this.LL = str;
        return this;
    }
}
