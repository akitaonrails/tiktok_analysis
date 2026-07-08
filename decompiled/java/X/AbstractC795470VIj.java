package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0VIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC795470VIj {
    public final AbstractC796540VMm mDatabase;
    public final AtomicBoolean mLock = new AtomicBoolean(false);
    public volatile InterfaceC796340VLs mStmt;

    public abstract String createQuery();

    public void assertNotMainThread() {
        this.mDatabase.assertNotMainThread();
    }

    private InterfaceC796340VLs createNewStatement() {
        return this.mDatabase.compileStatement(createQuery());
    }

    public InterfaceC796340VLs acquire() {
        assertNotMainThread();
        return getStmt(this.mLock.compareAndSet(false, true));
    }

    public AbstractC795470VIj(AbstractC796540VMm abstractC796540VMm) {
        this.mDatabase = abstractC796540VMm;
    }

    private InterfaceC796340VLs getStmt(boolean z) {
        if (z) {
            if (this.mStmt == null) {
                this.mStmt = createNewStatement();
            }
            return this.mStmt;
        }
        return createNewStatement();
    }

    public void release(InterfaceC796340VLs interfaceC796340VLs) {
        if (interfaceC796340VLs == this.mStmt) {
            this.mLock.set(false);
        }
    }
}
