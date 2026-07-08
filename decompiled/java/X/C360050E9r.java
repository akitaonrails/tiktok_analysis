package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;

/* JADX INFO: renamed from: X.0E9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C360050E9r {
    public final String LL;
    public final C0E48 LLILLJJLI;
    public long LLILLL;
    public final C0E60 LLILZ;
    public final C0EU6 LLILZIL;
    public NLEModel LLILZLL;
    public long LLIZ;

    public final void LIZLLL() {
        C0E55 player = this.LLILLJJLI.getPlayer();
        if (player.isPlaying()) {
            player.pause(false);
        }
    }

    public final void LJI() {
        C0E48 c0e48;
        C0E60 c0e60 = this.LLILZ;
        if (c0e60.LIZLLL.length() > 0 || (c0e48 = c0e60.LIZIZ) == null) {
            return;
        }
        c0e60.LIZLLL = c0e48.LLFII().LJI().store();
        c0e60.LJ = c0e48.getPlayer().Jh();
        c0e60.LJFF = c0e48.LLLLLLIL();
    }

    public void LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZ;
        C0EU6 c0eu6LIZJ = LIZJ();
        c0eu6LIZJ.LJFF = Long.valueOf(jCurrentTimeMillis);
        c0eu6LIZJ.LIZ();
    }

    public void LIZIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("attached in ");
        sbLIZ.append(jCurrentTimeMillis);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLL = System.currentTimeMillis();
        if (this.LLIZ == 0) {
            this.LLIZ = System.currentTimeMillis();
        }
        LIZJ().LJIIIZ = this.LLIZ;
    }

    public void LJ() {
        this.LLILLL = System.currentTimeMillis();
    }

    public final void LJFF() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rendered in ");
        sbLIZ.append(jCurrentTimeMillis);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLL = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LLIZ;
        C0EU6 c0eu6LIZJ = LIZJ();
        c0eu6LIZJ.LIZLLL = Long.valueOf(jCurrentTimeMillis2);
        c0eu6LIZJ.LIZ();
    }

    public C0EU6 LIZJ() {
        return this.LLILZIL;
    }

    public C360050E9r(C0E48 c0e48, String str) {
        this.LL = str;
        this.LLILLJJLI = c0e48;
        this.LLILZ = new C0E60(c0e48);
        C0EU6 c0eu6 = new C0EU6(str, true);
        c0eu6.LJII = c0e48;
        this.LLILZIL = c0eu6;
    }
}
