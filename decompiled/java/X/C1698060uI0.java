package X;

import android.view.View;
import com.ss.android.ugc.gamora.recorder.control.h;

/* JADX INFO: renamed from: X.0uI0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698060uI0 extends C19IN {
    public final int $t;
    public Object l0;

    @Override // X.C19IN
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1698060uI0(Object obj, int i) {
        super(0, 3);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C1698060uI0 c1698060uI0, View view) {
        InterfaceC1642030spd interfaceC1642030spdWk2;
        InterfaceC577400Mkk interfaceC577400Mkk = (InterfaceC577400Mkk) C579830Mof.LIZ(((h) c1698060uI0.l0).LLJILLL, InterfaceC577400Mkk.class);
        if (interfaceC577400Mkk != null && (interfaceC1642030spdWk2 = interfaceC577400Mkk.wk2()) != null) {
            interfaceC1642030spdWk2.EP1();
        }
        ((h) c1698060uI0.l0).LLJJIJIIJIL.invoke(Boolean.valueOf(C525780Kjg.LIZ(((h) c1698060uI0.l0).LLLLIL())));
    }

    public static final void LIZ$1(C1698060uI0 c1698060uI0, View view) {
        ((C1641990spZ) c1698060uI0.l0).LLJJIJIL.invoke(Boolean.valueOf(C525780Kjg.LIZ(((C1641990spZ) c1698060uI0.l0).LLLLIIIILLL())));
    }
}
