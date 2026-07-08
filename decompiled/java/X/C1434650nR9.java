package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0nR9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1434650nR9 extends RuntimeException {
    public boolean LL;
    public final boolean LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public String LLIZLLLIL;
    public String LLJ;

    public boolean isCauseByNoSpaceLeft() {
        for (Throwable cause = getCause(); cause != null; cause = cause.getCause()) {
            if (cause instanceof C1433670nPZ) {
                return ((C1433670nPZ) cause).getCode() == 100101;
            }
        }
        return false;
    }

    public Pair<Boolean, C0XIR> retrieveServerError() {
        for (Throwable cause = getCause(); cause != null; cause = cause.getCause()) {
            if (cause instanceof C0XIR) {
                return new Pair<>(Boolean.TRUE, cause);
            }
        }
        return new Pair<>(Boolean.FALSE, null);
    }

    public Pair<Boolean, String> retrieveServerErrorInfo() {
        for (Throwable cause = getCause(); cause != null; cause = cause.getCause()) {
            if (cause instanceof C0XIR) {
                return new Pair<>(Boolean.TRUE, ((C0XIR) cause).getErrorMsg());
            }
        }
        return new Pair<>(Boolean.FALSE, null);
    }

    public int getErrorCode() {
        return this.LLILZLL;
    }

    public Object getFailedTaskTag() {
        return this.LLILZIL;
    }

    public int getOriginErrorCode() {
        return this.LLIZ;
    }

    public int getPublishDuration() {
        return this.LLILZ;
    }

    public String getServerLogId() {
        return this.LLJ;
    }

    public String getStage() {
        return this.LLIZLLLIL;
    }

    public boolean isDiscard() {
        return this.LLILLL;
    }

    public boolean isRecover() {
        return this.LL;
    }

    public boolean isUserNetworkBad() {
        return this.LLILLJJLI;
    }

    public C1434650nR9(Throwable th) {
        super(th);
    }

    public void setDiscard(boolean z) {
        this.LLILLL = z;
    }

    public void setErrorCode(int i) {
        this.LLILZLL = i;
    }

    public void setFailedTaskTag(Object obj) {
        this.LLILZIL = obj;
    }

    public void setOriginErrorCode(int i) {
        this.LLIZ = i;
    }

    public void setPublishDuration(int i) {
        this.LLILZ = i;
    }

    public void setRecover(boolean z) {
        this.LL = z;
    }

    public void setServerLogId(String str) {
        this.LLJ = str;
    }

    public void setStage(String str) {
        this.LLIZLLLIL = str;
    }

    public C1434650nR9(Throwable th, boolean z, int i, String str) {
        super(th);
        this.LLILLJJLI = z;
        this.LLIZ = i;
        this.LLIZLLLIL = str;
    }
}
