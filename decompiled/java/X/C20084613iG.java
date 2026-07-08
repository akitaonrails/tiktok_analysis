package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13iG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20084613iG<T extends View> extends C20084713iH {
    public final T LLJJLIIIJLLLLLLLZ;
    public final C20085913iT LLJL;
    public final InterfaceC20041513bJ LLJLIL;
    public InterfaceC20041313bH LLJLILLLLZIIL;
    public Function1<? super T, Unit> LLJLL;
    public Function1<? super T, Unit> LLJLLIL;
    public Function1<? super T, Unit> LLJLLL;

    public C20084613iG() {
        throw null;
    }

    public /* bridge */ /* synthetic */ AbstractC20085213iM getSubCompositionView() {
        return null;
    }

    public View getViewRoot() {
        return this;
    }

    public final C20085913iT getDispatcher() {
        return this.LLJL;
    }

    public final Function1<T, Unit> getReleaseBlock() {
        return this.LLJLLL;
    }

    public final Function1<T, Unit> getResetBlock() {
        return this.LLJLLIL;
    }

    public final Function1<T, Unit> getUpdateBlock() {
        return this.LLJLL;
    }

    public static final void LJ(C20084613iG c20084613iG) {
        c20084613iG.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(InterfaceC20041313bH interfaceC20041313bH) {
        InterfaceC20041313bH interfaceC20041313bH2 = this.LLJLILLLLZIIL;
        if (interfaceC20041313bH2 != null) {
            interfaceC20041313bH2.LJI();
        }
        this.LLJLILLLLZIIL = interfaceC20041313bH;
    }

    public final void setReleaseBlock(Function1<? super T, Unit> function1) {
        this.LLJLLL = function1;
        setRelease(new AwS574S0100000_30((C20084613iG) this, 361));
    }

    public final void setResetBlock(Function1<? super T, Unit> function1) {
        this.LLJLLIL = function1;
        setReset(new AwS574S0100000_30((C20084613iG) this, 362));
    }

    public final void setUpdateBlock(Function1<? super T, Unit> function1) {
        this.LLJLL = function1;
        setUpdate(new AwS574S0100000_30((C20084613iG) this, 363));
    }

    public C20084613iG(Context context, Function1<? super Context, ? extends T> function1, C13Z1 c13z1, InterfaceC20041513bJ interfaceC20041513bJ, int i, InterfaceC20055013dU interfaceC20055013dU) {
        SparseArray<Parcelable> sparseArray;
        T tInvoke = function1.invoke(context);
        C20085913iT c20085913iT = new C20085913iT();
        super(context, c13z1, i, c20085913iT, tInvoke, interfaceC20055013dU);
        this.LLJJLIIIJLLLLLLLZ = tInvoke;
        this.LLJL = c20085913iT;
        this.LLJLIL = interfaceC20041513bJ;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objLIZJ = interfaceC20041513bJ != null ? interfaceC20041513bJ.LIZJ(strValueOf) : null;
        if ((objLIZJ instanceof SparseArray) && (sparseArray = (SparseArray) objLIZJ) != null) {
            tInvoke.restoreHierarchyState(sparseArray);
        }
        if (interfaceC20041513bJ != null) {
            setSavableRegistryEntry(interfaceC20041513bJ.LIZIZ(strValueOf, new AwS574S0100000_30((C20084613iG) this, 360)));
        }
        AFwS274S0000000_30 aFwS274S0000000_30 = C20084413iE.LIZ;
        this.LLJLL = aFwS274S0000000_30;
        this.LLJLLIL = aFwS274S0000000_30;
        this.LLJLLL = aFwS274S0000000_30;
    }
}
