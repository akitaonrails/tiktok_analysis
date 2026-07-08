package X;

import com.ss.android.ugc.gamora.recorder.control.h;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09rH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2502109rH implements InterfaceC1292040jj8 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1292040jj8
    public final void onResult(Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, obj);
                break;
            case 1:
                onResult$1(this, obj);
                break;
            case 2:
                onResult$2(this, obj);
                break;
            case 3:
                onResult$3(this, obj);
                break;
            case 4:
                onResult$4(this, obj);
                break;
        }
    }

    public C2502109rH(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onResult$0(C2502109rH c2502109rH, Object obj) {
        h hVar = (h) c2502109rH.l0;
        if (hVar.mView != null) {
            hVar.LLLLLLIL(true);
        }
    }

    public static final void onResult$1(C2502109rH c2502109rH, Object obj) {
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        if (c1294720jnS != null) {
            ((C1295960jpS) c2502109rH.l0).setComposition(c1294720jnS);
            ((C1295960jpS) c2502109rH.l0).playAnimation();
        }
    }

    public static final void onResult$2(C2502109rH c2502109rH, Object obj) {
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        if (c1294720jnS != null) {
            ((C1295960jpS) c2502109rH.l0).setComposition(c1294720jnS);
            ((C1295960jpS) c2502109rH.l0).playAnimation();
        }
    }

    public static final void onResult$3(C2502109rH c2502109rH, Object obj) {
        ((C1295960jpS) c2502109rH.l0).setComposition((C1294720jnS) obj);
        ((C1295960jpS) c2502109rH.l0).playAnimation();
    }

    public static final void onResult$4(C2502109rH c2502109rH, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("play lottie zip fail: ");
        sbLIZ.append(obj);
        C20441214yg.LJ("MultiGuestMicSeatEmojiPlayer", C2188811AlT.LIZIZ(sbLIZ));
        ((Function0) c2502109rH.l0).invoke();
    }
}
