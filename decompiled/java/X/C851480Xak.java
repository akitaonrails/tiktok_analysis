package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0Xak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C851480Xak extends Exception {
    public final int LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public boolean LLILZIL;
    public final String LLILZLL;

    @Override // java.lang.Throwable
    public String getMessage() {
        return getCause() != null ? super.getMessage() : this.LLILLJJLI;
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (getCause() != null) {
            return super.toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LobbyException{");
        sbLIZ.append("code: ");
        sbLIZ.append(getErrorCode());
        sbLIZ.append(", ");
        sbLIZ.append("providerCode: ");
        sbLIZ.append(getProviderErrorCode());
        sbLIZ.append(", ");
        sbLIZ.append("message: ");
        sbLIZ.append(getMessage());
        sbLIZ.append(", ");
        sbLIZ.append("cancelled: ");
        sbLIZ.append(isCancelled());
        sbLIZ.append(", ");
        sbLIZ.append("fromLobby: ");
        sbLIZ.append(isFromLobby());
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getErrorCode() {
        return this.LL;
    }

    public String getErrorStage() {
        return this.LLILZLL;
    }

    public int getProviderErrorCode() {
        return this.LLILLL;
    }

    public boolean isCancelled() {
        return this.LLILZIL;
    }

    public boolean isFromLobby() {
        return this.LLILZ;
    }

    public C851480Xak(Exception exc) {
        super(exc);
        this.LL = -999;
    }

    public C851480Xak setCancelled(boolean z) {
        this.LLILZIL = z;
        return this;
    }

    public C851480Xak(int i, Exception exc) {
        super(exc);
        this.LL = -999;
        this.LL = i;
    }

    public C851480Xak(int i, String str) {
        this(i, 0, str, "");
    }

    public C851480Xak(int i, int i2, String str) {
        this(i, i2, str, "");
    }

    public C851480Xak(int i, String str, String str2) {
        this(i, 0, str, str2);
    }

    public C851480Xak(int i, int i2, String str, String str2) {
        this.LL = -999;
        this.LL = i;
        this.LLILLL = i2;
        this.LLILLJJLI = TextUtils.isEmpty(str) ? "" : str;
        this.LLILZ = true;
        this.LLILZLL = str2;
        if (i == 4) {
            setCancelled(true);
        }
    }
}
