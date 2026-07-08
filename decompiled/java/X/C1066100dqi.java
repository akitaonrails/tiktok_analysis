package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;

/* JADX INFO: renamed from: X.0dqi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066100dqi {
    public long LIZIZ;
    public Integer LIZLLL;
    public List<String> LJ;
    public boolean LJFF;
    public C428600GrK LJI;
    public long LJII;
    public boolean LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public int LJIIJJI;
    public long LJIIL;
    public final long LIZ = SystemClock.uptimeMillis();
    public String LIZJ = "";

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF() {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1066100dqi.LJFF():void");
    }

    public final void LIZ(int i) {
        this.LIZLLL = Integer.valueOf(i);
    }

    public final void LIZIZ(Image image) {
        List<String> urls;
        if (image != null) {
            urls = image.getUrls();
        } else {
            urls = null;
        }
        this.LJ = urls;
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1058200ddy(this, null), 2);
    }

    public final void LIZJ(C03IT c03it) {
        List<String> list;
        if (c03it != null) {
            list = c03it.LIZ;
        } else {
            list = null;
        }
        this.LJ = list;
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1058200ddy(this, null), 2);
    }

    public final void LIZLLL(C428600GrK c428600GrK) {
        this.LIZIZ = SystemClock.uptimeMillis();
        this.LJI = c428600GrK;
        this.LJIIIIZZ = true;
        this.LJIIJJI++;
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1058160ddu(this, null), 2);
    }

    public final void LJ(Throwable th) {
        String message;
        this.LIZIZ = SystemClock.uptimeMillis();
        this.LJIIIIZZ = false;
        if (th != null && (message = th.getMessage()) != null) {
            this.LJIIJ = message.substring(0, Math.min(128, message.length()));
        }
        this.LJIIJJI += 2;
        LJFF();
    }
}
