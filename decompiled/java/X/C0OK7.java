package X;

import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;

/* JADX INFO: renamed from: X.0OK7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OK7<T> {
    public C0OK8<T> LIZ;
    public C0OK8<T> LIZIZ;

    public final void LIZ(BulletinBaseItem bulletinBaseItem) {
        if (this.LIZ == null) {
            C0OK8<T> c0ok8 = new C0OK8<>(bulletinBaseItem);
            this.LIZ = c0ok8;
            this.LIZIZ = c0ok8;
        } else {
            C0OK8<T> c0ok82 = new C0OK8<>(bulletinBaseItem);
            C0OK8<T> c0ok83 = this.LIZIZ;
            if (c0ok83 != null) {
                c0ok83.LIZIZ = c0ok82;
            }
            c0ok82.LIZJ = c0ok83;
            this.LIZIZ = c0ok82;
        }
    }
}
