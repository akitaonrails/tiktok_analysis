package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0kk7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331090kk7 {
    public static final C1320390kSr LJIJ = InterfaceC1320380kSq.LJFF;
    public static final C1320340kSm LJIJI = InterfaceC1320380kSq.LJI;
    public static int LJIJJ = -1;
    public final Resources LIZ;
    public final Context LIZIZ;
    public int LIZJ;
    public float LIZLLL;
    public Drawable LJ;
    public InterfaceC1320380kSq LJFF;
    public Drawable LJI;
    public InterfaceC1320380kSq LJII;
    public Drawable LJIIIIZZ;
    public InterfaceC1320380kSq LJIIIZ;
    public Drawable LJIIJ;
    public InterfaceC1320380kSq LJIIJJI;
    public InterfaceC1320380kSq LJIIL;
    public PointF LJIILIIL;
    public Drawable LJIILJJIL;
    public List<Drawable> LJIILL;
    public Drawable LJIILLIIL;
    public C1331100kk8 LJIIZILJ;

    public final C1331070kk5 LIZ() {
        List<Drawable> list = this.LJIILL;
        if (list != null) {
            Iterator<Drawable> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
        return new C1331070kk5(this);
    }

    public final void LIZIZ() {
        int i = LJIJJ;
        if (i < 0) {
            i = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        }
        this.LIZJ = i;
        this.LIZLLL = 0.0f;
        this.LJ = null;
        C1320390kSr c1320390kSr = LJIJ;
        this.LJFF = c1320390kSr;
        this.LJI = null;
        this.LJII = c1320390kSr;
        this.LJIIIIZZ = null;
        this.LJIIIZ = c1320390kSr;
        this.LJIIJ = null;
        this.LJIIJJI = c1320390kSr;
        this.LJIIL = LJIJI;
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
        this.LJIILL = null;
        this.LJIILLIIL = null;
        this.LJIIZILJ = null;
    }

    public C1331090kk7(Resources resources) {
        this.LIZ = resources;
        LIZIZ();
    }

    public C1331090kk7(Context context, Resources resources) {
        this.LIZIZ = context;
        this.LIZ = resources;
        LIZIZ();
    }
}
