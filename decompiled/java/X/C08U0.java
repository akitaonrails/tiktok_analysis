package X;

/* JADX INFO: renamed from: X.08U0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C08U0 {
    public boolean callbackOnMainThreadWaitOnly() {
        return true;
    }

    public abstract void onGCEnd(int i, int i2, int i3, long j, boolean z, long j2, long j3, long j4, long j5, long j6);

    public abstract void onGCStart(int i, int i2, int i3);

    public abstract void onWaitGc(int i, int i2, int i3);
}
