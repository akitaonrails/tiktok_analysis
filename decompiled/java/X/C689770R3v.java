package X;

import android.view.View;
import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.ecommerce.arch.SearchBffItem;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixFloatingLayerAssem;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0R3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C689770R3v extends LynxViewClient {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILJJIL() {
        switch (this.$t) {
            case 1:
                LJIILJJIL$0(this);
                break;
            case 2:
                LJIILJJIL$1(this);
                break;
            default:
                super.LJIILJJIL();
                break;
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJ() {
        if (this.$t != 0) {
            super.LJIJ();
        } else {
            LJIJ$0(this);
        }
    }

    public static final void LJIILJJIL$0(C689770R3v c689770R3v) {
        InterfaceC649280PdO interfaceC649280PdO = (InterfaceC649280PdO) c689770R3v.l0;
        if (interfaceC649280PdO != null) {
            interfaceC649280PdO.LIZ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) c689770R3v.l1);
        }
    }

    public static final void LJIILJJIL$1(C689770R3v c689770R3v) {
        InterfaceC649280PdO interfaceC649280PdO = (InterfaceC649280PdO) c689770R3v.l0;
        if (interfaceC649280PdO != null) {
            View view = (View) ((InterfaceC1541990qEH) c689770R3v.l1);
            view.getClass();
            interfaceC649280PdO.LIZ(view);
        }
    }

    public static final void LJIJ$0(C689770R3v c689770R3v) {
        if (((SearchBffItem) c689770R3v.l0).type == 17 && C0BYZ.LIZ()) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            AFwS196S0000000_10 aFwS196S0000000_10 = AFwS196S0000000_10.get$arr$(92);
            c2341109Fh.getClass();
            C2341109Fh.LIZIZ(aFwS196S0000000_10);
            MixFloatingLayerAssem mixFloatingLayerAssem = (MixFloatingLayerAssem) c689770R3v.l1;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = mixFloatingLayerAssem.LLIZLLLIL;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                mixFloatingLayerAssem.Go(viewOnAttachStateChangeListenerC20604515jv, true);
            }
        }
    }

    public C689770R3v(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
