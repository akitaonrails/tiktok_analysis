package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FXF, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FXF implements InterfaceC849390XTt {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void LIZIZ$1(C0FXF c0fxf) {
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
        }
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
        }
    }

    public static final void LIZ$0(C0FXF c0fxf) {
        ((Function1) c0fxf.l0).invoke(Boolean.FALSE);
    }

    public static final void LIZ$1(C0FXF c0fxf) {
        C0E48 c0e48LJIIJ;
        C360600EBu c360600EBu = (C360600EBu) c0fxf.l0;
        if (c360600EBu.LL != null && (c0e48LJIIJ = c360600EBu.LJIIJ()) != null) {
            C375820EoO.LIZ(c360600EBu.LL, c0e48LJIIJ, C373040Eju.class, null, 24);
        }
        C0E48 c0e48LJIIJ2 = ((C360600EBu) c0fxf.l0).LJIIJ();
        if (c0e48LJIIJ2 != null) {
            C350870DpF.LJI(c0e48LJIIJ2).setExtra("enter_sound_effect_time", String.valueOf(System.currentTimeMillis()));
        }
    }

    public static final void LIZIZ$0(C0FXF c0fxf) {
        ((Function1) c0fxf.l0).invoke(Boolean.TRUE);
    }

    public C0FXF(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
