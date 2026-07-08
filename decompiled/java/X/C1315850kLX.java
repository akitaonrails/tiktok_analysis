package X;

import Y.ARunnableS120S0100000_20;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.lynx.tasm.LynxEnv;

/* JADX INFO: renamed from: X.0kLX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315850kLX extends C1320770kTT<C1331070kk5> {
    public static final Drawable LLJIJIL = new ColorDrawable();
    public final C1323050kX9<AbstractC1327750kej> LLIZ;
    public final Drawable LLIZLLLIL;
    public final BPEAHandler LLJ;
    public final C1331050kk3 LLJI;

    @Override // X.C1320770kTT
    public final void LJFF() {
    }

    @Override // X.C1320770kTT
    public final void LJI() {
        this.LLJI.LJIILIIL(LLJIJIL);
        C786410Ut5.LJJZZIII(this.LLJ, new ARunnableS120S0100000_20(this, 71));
    }

    @Override // X.C1320770kTT
    public final Drawable LIZLLL() {
        return this.LLJI;
    }

    public C1315850kLX(C1323050kX9<AbstractC1327750kej> c1323050kX9) {
        super(null);
        this.LLJ = new BPEAHandler(Looper.getMainLooper());
        this.LLIZ = c1323050kX9;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(LynxEnv.inst().getAppContext().getResources(), ((AbstractC1325130kaV) c1323050kX9.get()).getUnderlyingBitmap());
        this.LLIZLLLIL = bitmapDrawable;
        this.LLJI = new C1331050kk3(bitmapDrawable);
    }
}
