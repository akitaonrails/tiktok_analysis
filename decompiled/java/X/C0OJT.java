package X;

import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinVoiceItem;

/* JADX INFO: renamed from: X.0OJT, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OJT {
    public final EnumC618810OOx LIZ;
    public final long LIZIZ;
    public final C0OOP LIZJ;
    public final BulletinPhotoItem LIZLLL;
    public final C0OOO LJ;
    public final C0OOV LJFF;
    public final BulletinVoiceItem LJI;

    public C0OJT(EnumC618810OOx enumC618810OOx, long j, C0OOP c0oop, BulletinPhotoItem bulletinPhotoItem, C0OOO c0ooo, C0OOV c0oov, BulletinVoiceItem bulletinVoiceItem, int i) {
        c0oop = (i & 4) != 0 ? null : c0oop;
        bulletinPhotoItem = (i & 8) != 0 ? null : bulletinPhotoItem;
        c0ooo = (i & 16) != 0 ? null : c0ooo;
        c0oov = (i & 32) != 0 ? null : c0oov;
        bulletinVoiceItem = (i & 64) != 0 ? null : bulletinVoiceItem;
        this.LIZ = enumC618810OOx;
        this.LIZIZ = j;
        this.LIZJ = c0oop;
        this.LIZLLL = bulletinPhotoItem;
        this.LJ = c0ooo;
        this.LJFF = c0oov;
        this.LJI = bulletinVoiceItem;
    }
}
