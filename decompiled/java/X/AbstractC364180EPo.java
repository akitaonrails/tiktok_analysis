package X;

import com.ss.android.vesdk.runtime.VEEditorResManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0EPo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC364180EPo implements InterfaceC364120EPi {
    public final InterfaceC1452170ntP LIZ;
    public boolean LIZIZ;
    public VEEditorResManager LIZJ;
    public Function1<? super Double, Unit> LIZLLL;

    public final void LIZIZ() {
        this.LIZIZ = false;
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(LJ());
        if (c348100DkmLIZIZ != null) {
            c348100DkmLIZIZ.LIZLLL().LJIILLIIL();
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public abstract InterfaceC1452170ntP LJ();

    @Override // X.InterfaceC364120EPi
    public boolean LIZ() {
        return LIZLLL() != null;
    }

    public final String[] LIZJ() {
        String str;
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(LJ());
        if (c348100DkmLIZIZ == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C347500Djo c347500DjoLJJIFFI = c348100DkmLIZIZ.LIZLLL().LJJIFFI(EnumC356030DxZ.AUDIO);
        if (c347500DjoLJJIFFI == null || (str = c347500DjoLJJIFFI.LIZIZ) == null) {
            return null;
        }
        return new String[]{str};
    }

    public final String[] LIZLLL() {
        String str;
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(LJ());
        if (c348100DkmLIZIZ == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C347500Djo c347500DjoLJJIFFI = c348100DkmLIZIZ.LIZLLL().LJJIFFI(EnumC356030DxZ.VIDEO);
        if (c347500DjoLJJIFFI == null || (str = c347500DjoLJJIFFI.LIZIZ) == null) {
            return null;
        }
        return new String[]{str};
    }

    public final String[] LJFF() {
        VEEditorResManager vEEditorResManagerLJI = LJI();
        if (vEEditorResManagerLJI != null) {
            return vEEditorResManagerLJI.mVideoPaths;
        }
        return null;
    }

    public VEEditorResManager LJI() {
        return this.LIZJ;
    }

    public AbstractC364180EPo(InterfaceC1452170ntP interfaceC1452170ntP) {
        this.LIZ = interfaceC1452170ntP;
    }
}
