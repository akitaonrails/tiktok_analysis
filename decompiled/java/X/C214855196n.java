package X;

import Y.ARunnableS101S0200000_32;
import Y.ARunnableS27S0101000_16;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS276S0300000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS646S0100000_32;

/* JADX INFO: renamed from: X.196n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214855196n implements InterfaceC1710480uc2 {
    public final Function0<ExpandedTitleModule> LIZ;
    public final Function0<EditText> LIZIZ;
    public final Function0<EditText> LIZJ;
    public final Function0<List<View>> LIZLLL;
    public final Function0<List<View>> LJ;
    public final Function2<Boolean, Boolean, Unit> LJFF;
    public final Function0<View> LJI;
    public final Function1<Boolean, Unit> LJII;
    public final Function0<Unit> LJIIIIZZ;
    public final Map<View, Integer> LJIIIZ = new LinkedHashMap();
    public final Map<View, Float> LJIIJ = new LinkedHashMap();
    public View LJIIJJI;
    public Drawable LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public int LJIJI;

    @Override // X.InterfaceC1710480uc2
    public final void LJI() {
    }

    @Override // X.InterfaceC1710480uc2
    public final void LIZ() {
        C0ZI0 c0zi0;
        EditText editTextInvoke = this.LIZJ.invoke();
        if (!(editTextInvoke instanceof C0ZI0) || (c0zi0 = (C0ZI0) editTextInvoke) == null) {
            return;
        }
        c0zi0.LJJIFFI();
        c0zi0.setDescLimitToastSuppressed(true);
    }

    @Override // X.InterfaceC1710480uc2
    public final void LIZIZ() {
        C0ZI0 c0zi0;
        EditText editTextInvoke = this.LIZJ.invoke();
        if (!(editTextInvoke instanceof C0ZI0) || (c0zi0 = (C0ZI0) editTextInvoke) == null) {
            return;
        }
        c0zi0.LJIIJJI();
        c0zi0.setDescLimitToastSuppressed(false);
        if (this.LJIILJJIL) {
            return;
        }
        this.LJIILJJIL = true;
        HandlerHook.viewPost(c0zi0, new ARunnableS101S0200000_32(this, c0zi0, 37));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1 A[PHI: r2
      0x00f1: PHI (r2v6 java.lang.Integer) = (r2v3 java.lang.Integer), (r2v7 java.lang.Integer) binds: [B:67:0x0134, B:50:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0137 A[PHI: r2
      0x0137: PHI (r2v5 java.lang.Integer) = (r2v3 java.lang.Integer), (r2v6 java.lang.Integer) binds: [B:66:0x0132, B:53:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0145 A[PHI: r5
      0x0145: PHI (r5v1 boolean) = (r5v0 boolean), (r5v4 boolean) binds: [B:74:0x0141, B:16:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1710480uc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214855196n.LIZJ():void");
    }

    @Override // X.InterfaceC1710480uc2
    public final EditText LIZLLL() {
        return this.LIZIZ.invoke();
    }

    @Override // X.InterfaceC1710480uc2
    public final void LJFF() {
        ExpandedTitleModule expandedTitleModuleInvoke = this.LIZ.invoke();
        if (expandedTitleModuleInvoke != null) {
            C214857196p c214857196p = expandedTitleModuleInvoke.LLLZIL;
            C214856196o c214856196o = c214857196p.LIZLLL;
            Integer numValueOf = c214856196o != null ? Integer.valueOf(c214856196o.LIZLLL) : c214857196p.LJI;
            c214857196p.LJFF = false;
            c214857196p.LIZLLL = null;
            c214857196p.LJI = null;
            c214857196p.LIZ.LIZLLL(0);
            if (numValueOf != null) {
                expandedTitleModuleInvoke.LJIJJ(numValueOf.intValue(), true);
            }
        }
    }

    @Override // X.InterfaceC1710480uc2
    public final void LJIIIIZZ() {
        View viewInvoke;
        C0ZI0 c0zi0;
        this.LJIIIIZZ.invoke();
        this.LJIILLIIL = false;
        this.LJIIZILJ = false;
        this.LJIJ = false;
        this.LJIJI++;
        ExpandedTitleModule expandedTitleModuleInvoke = this.LIZ.invoke();
        EditText editTextInvoke = this.LIZJ.invoke();
        if ((editTextInvoke instanceof C0ZI0) && (c0zi0 = (C0ZI0) editTextInvoke) != null) {
            c0zi0.LJJJJLL();
        }
        if (expandedTitleModuleInvoke != null) {
            expandedTitleModuleInvoke.LJIJI();
        }
        ((LinkedHashMap) this.LJIIIZ).clear();
        for (View view : this.LIZLLL.invoke()) {
            this.LJIIIZ.put(view, Integer.valueOf(view.getVisibility()));
            C786410Ut5.LJLLLLLL(4, view);
        }
        ((LinkedHashMap) this.LJIIJ).clear();
        for (View view2 : this.LJ.invoke()) {
            this.LJIIJ.put(view2, Float.valueOf(view2.getAlpha()));
            C786410Ut5.T4(view2, 0.34f);
        }
        if (!this.LJIILIIL && (viewInvoke = this.LJI.invoke()) != null) {
            this.LJIIJJI = viewInvoke;
            this.LJIIL = viewInvoke.getBackground();
            this.LJIILIIL = true;
            viewInvoke.setBackground(null);
        }
        boolean z = !((expandedTitleModuleInvoke == null || expandedTitleModuleInvoke.LLLZIIL == 1) ? false : true);
        this.LJIILL = z;
        Function2<Boolean, Boolean, Unit> function2 = this.LJFF;
        Boolean bool = Boolean.TRUE;
        function2.invoke(bool, z ? bool : null);
        if (expandedTitleModuleInvoke != null) {
            C214857196p c214857196p = expandedTitleModuleInvoke.LLLZIL;
            c214857196p.LIZIZ = true;
            c214857196p.LJ = false;
            c214857196p.LJFF = false;
            c214857196p.LIZ.LJIILJJIL(true);
            int iLJIILLIIL = c214857196p.LIZ.LJIILLIIL();
            int i = iLJIILLIIL >= 0 ? iLJIILLIIL : 0;
            C214856196o c214856196o = c214857196p.LIZLLL;
            c214857196p.LIZJ = c214857196p.LIZ.LJIIIIZZ(c214856196o != null ? c214856196o.LIZIZ : c214857196p.LIZ.LIZIZ(), i);
            c214857196p.LIZ.LIZLLL(i);
            c214857196p.LIZ.LJ();
            c214857196p.LIZ.LJIILL();
            c214857196p.LIZ.LIZ();
        }
    }

    public final void LJIIIZ() {
        EditText editTextInvoke = this.LIZJ.invoke();
        if (editTextInvoke == null) {
            this.LJFF.invoke(Boolean.FALSE, null);
            return;
        }
        int i = this.LJIJI + 1;
        this.LJIJI = i;
        HandlerHook.viewPostDelay(editTextInvoke, new ARunnableS27S0101000_16(i, this, 12), 350L);
    }

    @Override // X.InterfaceC1710480uc2
    public final void LJ(boolean z) {
        boolean z2 = this.LJIILLIIL;
        this.LJIILLIIL = z;
        ExpandedTitleModule expandedTitleModuleInvoke = this.LIZ.invoke();
        if (expandedTitleModuleInvoke != null) {
            expandedTitleModuleInvoke.LLLZIL.LJ = z;
        }
        if (!z) {
            if ((z2 || this.LJIJ) && this.LJIIZILJ) {
                this.LJIIZILJ = false;
                this.LJIJ = false;
                this.LJFF.invoke(Boolean.TRUE, Boolean.FALSE);
                LJIIIZ();
            }
        }
    }

    @Override // X.InterfaceC1710480uc2
    public final void LJII(boolean z) {
        C0ZI0 c0zi0;
        this.LJII.invoke(Boolean.valueOf(z));
        EditText editTextInvoke = this.LIZJ.invoke();
        if ((editTextInvoke instanceof C0ZI0) && (c0zi0 = (C0ZI0) editTextInvoke) != null) {
            c0zi0.setDescLimitToastSuppressed(z);
        }
    }

    public C214855196n(AwS576S0100000_32 awS576S0100000_32, AwS576S0100000_32 awS576S0100000_322, AwS576S0100000_32 awS576S0100000_323, AwS276S0300000_32 awS276S0300000_32, AwS558S0100000_14 awS558S0100000_14, AwS646S0100000_32 awS646S0100000_32, AwS576S0100000_32 awS576S0100000_324, AwS611S0100000_32 awS611S0100000_32, AwS433S0200000_32 awS433S0200000_32) {
        this.LIZ = awS576S0100000_32;
        this.LIZIZ = awS576S0100000_322;
        this.LIZJ = awS576S0100000_323;
        this.LIZLLL = awS276S0300000_32;
        this.LJ = awS558S0100000_14;
        this.LJFF = awS646S0100000_32;
        this.LJI = awS576S0100000_324;
        this.LJII = awS611S0100000_32;
        this.LJIIIIZZ = awS433S0200000_32;
    }
}
