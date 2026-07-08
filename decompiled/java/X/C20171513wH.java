package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.13wH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20171513wH implements Serializable {
    public static final int $stable = 8;
    public String LL = "";
    public boolean LLILLJJLI;
    public int LLILLL;

    public final String getFlowId() {
        return this.LL;
    }

    public final int getSubType() {
        return this.LLILLL;
    }

    public final boolean isPreload() {
        return this.LLILLJJLI;
    }

    public final void setFlowId(String str) {
        this.LL = str;
    }

    public final void setPreload(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setSubType(int i) {
        this.LLILLL = i;
    }
}
