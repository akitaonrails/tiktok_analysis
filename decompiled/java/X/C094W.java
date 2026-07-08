package X;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.094W, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C094W extends CancellationException {
    public final transient C09AE coroutine;

    /* JADX INFO: renamed from: createCopy, reason: merged with bridge method [inline-methods] */
    public C094W m19createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        C094W c094w = new C094W(message, this.coroutine);
        c094w.initCause(this);
        return c094w;
    }

    public C094W(String str) {
        this(str, null);
    }

    public C094W(String str, C09AE c09ae) {
        super(str);
        this.coroutine = c09ae;
    }
}
