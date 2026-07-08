package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS120S0100000_20;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0kl3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1331670kl3 {
    public static final C1331670kl3 LJJLIL;
    public static final boolean LJJLJ;
    public static final boolean LJJLJLI;
    public Uri LIZ;
    public final Object LIZIZ;
    public Context LIZJ;
    public boolean LIZLLL;
    public boolean LJI;
    public boolean LJII;
    public Drawable LJIILL;
    public EnumC1338240kve LJIILLIIL;
    public Drawable LJIJ;
    public EnumC1338240kve LJIJI;
    public Drawable LJIJJ;
    public Drawable LJIJJLI;
    public Bitmap.Config LJIL;
    public EnumC1338240kve LJJ;
    public C1331730kl9 LJJI;
    public C1332060klg LJJIFFI;
    public C1331990klZ LJJII;
    public String LJJIIJ;
    public Executor LJJIIJZLJL;
    public InterfaceC1334290kpH LJJIIZI;
    public ImageView LJJIJ;
    public InterfaceC427850Gq7 LJJIJIIJI;
    public InterfaceC605070NoH LJJIJIIJIL;
    public InterfaceC1331910klR LJJIJIL;
    public boolean LJJIJL;
    public boolean LJJIJLIJ;
    public boolean LJJIL;
    public C03IT LJJIZ;
    public InterfaceC1331190kkH LJJJI;
    public InterfaceC658750Psf LJJJIL;
    public String LJJJJJ;
    public boolean LJJJJJL;
    public String LJJJJL;
    public boolean LJJJJLI;
    public boolean LJJJJLL;
    public boolean LJJJJZ;
    public String LJJLIIIIJ;
    public int LJJLIIIJ;
    public int LJJLIIIJILLIZJL;
    public boolean LJJLIIIJJIZ;
    public boolean LJJLIIIJL;
    public boolean LJ = true;
    public int LJFF = -1;
    public int LJIIIIZZ = -1;
    public int LJIIIZ = -1;
    public int LJIIJ = -1;
    public int LJIIJJI = -1;
    public int LJIIL = -1;
    public int LJIILIIL = -1;
    public int LJIILJJIL = -1;
    public int LJIIZILJ = -1;
    public EnumC1334360kpO LJJIII = EnumC1334360kpO.MEDIUM;
    public EnumC714850S2h LJJIIZ = EnumC714850S2h.DEFAULT;
    public int LJJJ = -1;
    public String LJJJJ = null;
    public String LJJJJI = null;
    public String LJJJJIZL = null;
    public String LJJJJZI = null;
    public int LJJJLIIL = -1;
    public int LJJJLL = -1;
    public int LJJJLZIJ = 0;
    public int LJJJZ = 0;
    public final float LJJL = 1.0f;
    public final boolean LJJLI = true;
    public boolean LJJLIIIJJI = false;
    public int LJJLIIIJLJLI = -1;
    public int LJJLIIIJLLLLLLLZ = -1;
    public boolean LJJLIIJ = false;

    public final void LJIJJ() {
        this.LJIILJJIL = 0;
    }

    static {
        C1331670kl3 c1331670kl3 = new C1331670kl3(new C03IT(Collections.emptyList()));
        c1331670kl3.LIZ = UriProtector.parse("");
        LJJLIL = c1331670kl3;
        C1332160klq c1332160klqLJIIIZ = C1332160klq.LJIIIZ();
        LJJLJ = c1332160klqLJIIIZ.LIZIZ.LJJIL.LIZ() != null && ((Boolean) c1332160klqLJIIIZ.LIZIZ.LJJIL.LIZ()).booleanValue();
        C1332160klq c1332160klqLJIIIZ2 = C1332160klq.LJIIIZ();
        LJJLJLI = c1332160klqLJIIIZ2.LIZIZ.LJJIZ.LIZ() != null && ((Boolean) c1332160klqLJIIIZ2.LIZIZ.LJJIZ.LIZ()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1331510kkn LIZJ() {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1331670kl3.LIZJ():X.0kkn");
    }

    public final void LJFF() {
        if (this.LJJIIZI == null && this.LJJIJ == null && !C1334400kpS.LIZ()) {
            throw new IllegalArgumentException("LightenImageRequestBuilderneeds SmartImageView to display, use with(view)");
        }
        C1331510kkn c1331510kknLIZJ = LIZJ();
        InterfaceC1331720kl8 interfaceC1331720kl8 = C1331660kl2.LIZ;
        try {
            C657900PrI.LIZ.LIZJ(c1331510kknLIZJ);
            C1331660kl2.LIZ(c1331510kknLIZJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1331660kl2.LIZ(c1331510kknLIZJ);
        }
    }

    public final void LJII() {
        if (this.LJJIIZI == null && this.LJJIJ == null && !C1334400kpS.LIZ()) {
            throw new IllegalArgumentException("LightenImageRequestBuilderneeds SmartImageView to display, use with(view)");
        }
        ARunnableS113S0100000_13 aRunnableS113S0100000_13 = new ARunnableS113S0100000_13(this, 269);
        if (LJJLJ) {
            aRunnableS113S0100000_13.run();
        } else {
            C1260120ite.LIZ(aRunnableS113S0100000_13);
        }
    }

    public void LJIIIZ() {
        try {
            C657900PrI.LIZ.getClass();
            C657900PrI.LIZIZ(this);
            LJFF();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJFF();
        }
    }

    public void LJIIJJI() {
        try {
            C657900PrI.LIZ.getClass();
            C657900PrI.LIZIZ(this);
            LJII();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJII();
        }
    }

    public final void LJJIII() {
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 398);
        if (LJJLJ) {
            aRunnableS120S0100000_20.run();
        } else {
            C1260120ite.LIZ(aRunnableS120S0100000_20);
        }
    }

    public static final C1331670kl3 LJIJI() {
        C1332160klq c1332160klqLJIIIZ = C1332160klq.LJIIIZ();
        if (c1332160klqLJIIIZ.LIZIZ.LJJJJJL.LIZ() == null || !((Boolean) c1332160klqLJIIIZ.LIZIZ.LJJJJJL.LIZ()).booleanValue()) {
            return LJJLIL;
        }
        C1331670kl3 c1331670kl3 = new C1331670kl3(new C03IT(Collections.emptyList()));
        c1331670kl3.LIZ = UriProtector.parse("");
        return c1331670kl3;
    }

    public final void LJIILIIL() {
        boolean zLJI = MethodIDManager.LJI(137337);
        C1331660kl2.LIZIZ(LIZJ());
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJIILL() {
        boolean zLJI = MethodIDManager.LJI(137813);
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 396);
        if (LJJLJ) {
            aRunnableS120S0100000_20.run();
        } else {
            C1260120ite.LIZ(aRunnableS120S0100000_20);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final InterfaceC469401sC LJIIZILJ() {
        boolean zLJI = MethodIDManager.LJI(137887);
        if (LJJLJLI) {
            LJIILL();
            C1331970klX c1331970klX = new C1331970klX();
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return c1331970klX;
        }
        this.LJJJJJL = true;
        C1331510kkn c1331510kknLIZJ = LIZJ();
        C823050WQl.LIZLLL().submit(new ARunnableS120S0100000_20(c1331510kknLIZJ, 400));
        ExecutorService executorService = C1331710kl7.LIZ;
        C1331790klF c1331790klF = new C1331790klF(c1331510kknLIZJ);
        if (c1331510kknLIZJ != null) {
            C1331710kl7.LIZ.execute(new RunnableC1331680kl4(c1331510kknLIZJ, c1331790klF));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c1331790klF;
    }

    public final void LJJIFFI() {
        C1331660kl2.LJIIJJI(LIZJ());
    }

    public C1331670kl3(String str) {
        this.LIZ = UriProtector.parse(str);
    }

    public final void LIZ(EnumC1338240kve enumC1338240kve) {
        this.LJJ = enumC1338240kve;
    }

    public final void LIZIZ(String str) {
        this.LJJLIIIIJ = str;
        this.LJJLIIIJ = 1;
        this.LJJLIIIJILLIZJL = 1;
    }

    public final void LIZLLL(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LJJIIJ = str;
        }
    }

    public final void LJ(C1331730kl9 c1331730kl9) {
        this.LJJI = c1331730kl9;
    }

    public final void LJI(InterfaceC427850Gq7 interfaceC427850Gq7) {
        if (this.LJJIIZI == null && this.LJJIJ == null && !C1334400kpS.LIZ()) {
            throw new IllegalArgumentException("LightenImageRequestBuilderneeds SmartImageView to display, use with(view)");
        }
        this.LJJIJIIJI = interfaceC427850Gq7;
        C1331510kkn c1331510kknLIZJ = LIZJ();
        InterfaceC1331720kl8 interfaceC1331720kl8 = C1331660kl2.LIZ;
        try {
            C657900PrI.LIZ.LIZJ(c1331510kknLIZJ);
            C1331660kl2.LIZ(c1331510kknLIZJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1331660kl2.LIZ(c1331510kknLIZJ);
        }
    }

    public final void LJIIIIZZ(InterfaceC427850Gq7 interfaceC427850Gq7) {
        if (this.LJJIIZI == null && this.LJJIJ == null && !C1334400kpS.LIZ()) {
            throw new IllegalArgumentException("LightenImageRequestBuilderneeds SmartImageView to display, use with(view)");
        }
        ARunnableS113S0100000_13 aRunnableS113S0100000_13 = new ARunnableS113S0100000_13(this, 268);
        this.LJJIJIIJI = interfaceC427850Gq7;
        if (LJJLJ) {
            aRunnableS113S0100000_13.run();
        } else {
            C1260120ite.LIZ(aRunnableS113S0100000_13);
        }
    }

    public void LJIIJ(InterfaceC427850Gq7 interfaceC427850Gq7) {
        try {
            C657900PrI.LIZ.getClass();
            C657900PrI.LIZIZ(this);
            LJI(interfaceC427850Gq7);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJI(interfaceC427850Gq7);
        }
    }

    public void LJIIL(InterfaceC427850Gq7 interfaceC427850Gq7) {
        try {
            C657900PrI.LIZ.getClass();
            C657900PrI.LIZIZ(this);
            LJIIIIZZ(interfaceC427850Gq7);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIIIIZZ(interfaceC427850Gq7);
        }
    }

    public final void LJIILJJIL(InterfaceC605070NoH interfaceC605070NoH) {
        boolean zLJI = MethodIDManager.LJI(137337);
        this.LJJIJIIJIL = interfaceC605070NoH;
        C1331660kl2.LIZIZ(LIZJ());
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJIILLIIL(InterfaceC605070NoH interfaceC605070NoH) {
        boolean zLJI = MethodIDManager.LJI(137813);
        this.LJJIJIIJIL = interfaceC605070NoH;
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 399);
        if (LJJLJ) {
            aRunnableS120S0100000_20.run();
        } else {
            C1260120ite.LIZ(aRunnableS120S0100000_20);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final InterfaceC469401sC LJIJ(InterfaceC605070NoH interfaceC605070NoH) {
        boolean zLJI = MethodIDManager.LJI(137887);
        this.LJJIJIIJIL = interfaceC605070NoH;
        InterfaceC469401sC interfaceC469401sCLJIIZILJ = LJIIZILJ();
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return interfaceC469401sCLJIIZILJ;
    }

    public C1331670kl3 LJIJJLI(int i) {
        this.LJIIZILJ = i;
        return this;
    }

    public C1331670kl3 LJIL(Drawable drawable) {
        this.LJIJ = drawable;
        return this;
    }

    public C1331670kl3 LJJ(InterfaceC1334290kpH interfaceC1334290kpH) {
        this.LJJIIZI = interfaceC1334290kpH;
        return this;
    }

    public C1331670kl3 LJJI(ImageView imageView) {
        this.LJJIJ = imageView;
        return this;
    }

    public final void LJJII(InterfaceC1331910klR interfaceC1331910klR) {
        this.LJJIJIL = interfaceC1331910klR;
        C1331660kl2.LJIIJJI(LIZJ());
    }

    public final void LJJIIJ(InterfaceC1331910klR interfaceC1331910klR) {
        this.LJJIJIL = interfaceC1331910klR;
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 395);
        if (LJJLJ) {
            aRunnableS120S0100000_20.run();
        } else {
            C1260120ite.LIZ(aRunnableS120S0100000_20);
        }
    }

    public final InterfaceC469401sC LJJIIJZLJL(InterfaceC1331910klR interfaceC1331910klR) {
        this.LJJIJIL = interfaceC1331910klR;
        if (LJJLJLI) {
            LJJIII();
            return new C1331970klX();
        }
        this.LJJJJJL = true;
        C1331510kkn c1331510kknLIZJ = LIZJ();
        C823050WQl.LIZLLL().submit(new ARunnableS120S0100000_20(c1331510kknLIZJ, 397));
        ExecutorService executorService = C1331710kl7.LIZ;
        C1331790klF c1331790klF = new C1331790klF(c1331510kknLIZJ);
        if (c1331510kknLIZJ == null) {
            return c1331790klF;
        }
        C1331710kl7.LIZ.execute(new RunnableC1331680kl4(c1331510kknLIZJ, c1331790klF));
        return c1331790klF;
    }

    public C1331670kl3 LJJIIZ(int i) {
        this.LJIILIIL = i;
        return this;
    }

    public C1331670kl3 LJJIIZI(Drawable drawable) {
        this.LJIILL = drawable;
        return this;
    }

    public final void LJJIJ(int[] iArr) {
        if (iArr.length == 2) {
            this.LJIIJJI = iArr[0];
            this.LJIIL = iArr[1];
        } else {
            int i = C2187451AjH.LIZ;
            C1330590kjJ.LJFF("LightenImageRequestBuilder", "resize", "the array size must be 2, first is width, second is height");
            throw new IllegalArgumentException("LightenImageRequestBuilderthe array size must be 2, first is width, second is height");
        }
    }

    public final void LJJIJIIJIL(int[] iArr) {
        if (iArr.length == 2) {
            this.LJIIIIZZ = iArr[0];
            this.LJIIIZ = iArr[1];
        } else {
            int i = C2187451AjH.LIZ;
            C1330590kjJ.LJFF("LightenImageRequestBuilder", "resize", "the array size must be 2, first is width, second is height");
            throw new IllegalArgumentException("LightenImageRequestBuilderthe array size must be 2, first is width, second is height");
        }
    }

    public final void LJJIJIL(InterfaceC1331800klG interfaceC1331800klG) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(interfaceC1331800klG);
        this.LJJII = new C1331990klZ(arrayList);
    }

    public C1331670kl3 LJJIJL(Context context) {
        this.LIZJ = context;
        return this;
    }

    public C1331670kl3 LJJIJLIJ(Fragment fragment) {
        this.LIZJ = fragment.getActivity();
        return this;
    }

    public C1331670kl3 LJJIL(C19EG c19eg) {
        this.LIZJ = c19eg;
        return this;
    }

    public C1331670kl3(C03IT c03it) {
        this.LJJIZ = c03it;
    }

    public C1331670kl3(Uri uri) {
        this.LIZ = uri;
    }

    public C1331670kl3(Object obj) {
        this.LIZIZ = obj;
    }

    public final void LJJIJIIJI(int i, int i2, int i3) {
        this.LJIIIIZZ = i;
        this.LJIIIZ = i2;
        this.LJIIJ = i3;
    }
}
