package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.PictureInfoOpt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: renamed from: X.08yw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2294808yw {
    public final C23154095k LIZ;
    public final C1DEU LIZJ;
    public final C099F LIZIZ = C090F.LIZIZ();
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public final LruCache<String, PictureInfoOpt> LJ = new LruCache<>(40);

    public final void LIZJ() {
        if (this.LIZIZ.isCompleted()) {
            return;
        }
        this.LIZIZ.LJJLIIIJILLIZJL(Unit.LIZ);
    }

    public final void LIZLLL() {
        if (!this.LIZIZ.isCompleted() && this.LIZLLL.compareAndSet(false, true)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2295808z6(this, null), 3);
        }
    }

    public C2294808yw(C23154095k c23154095k) {
        this.LIZ = c23154095k;
        this.LIZJ = C2252461DEe.LIZ(Math.max(1, c23154095k.LIZJ));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.UploadInfoOpt r20, java.lang.String r21, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.PictureInfoOpt> r22) {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2294808yw.LIZ(com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.UploadInfoOpt, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7 A[Catch: all -> 0x00d0, TRY_LEAVE, TryCatch #0 {all -> 0x00d0, blocks: (B:35:0x00be, B:36:0x00c1, B:38:0x00c7, B:32:0x00ac), top: B:45:0x001d }] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.05Lk] */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.05Lk] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.UploadInfoOpt r9, java.lang.String r10, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.PictureInfoOpt> r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2294808yw.LIZIZ(com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.UploadInfoOpt, java.lang.String, X.05Vn):java.lang.Object");
    }
}
