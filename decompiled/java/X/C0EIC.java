package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.gamora.editorpro.guide.logic.BaseFuncItemGuideController;
import java.util.List;
import kotlin.jvm.internal.AwS122S1200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EIC, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public abstract class C0EIC implements C0EIO {
    public final C19EG LL;
    public final Lifecycle LLILLJJLI;
    public final C0EGY LLILLL;
    public final InterfaceC362350EIn LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1621));

    public void LIZ() {
    }

    public abstract String LIZIZ();

    public abstract String LIZJ();

    @Override // X.C0EIO
    public final boolean LLJJ() {
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLLIILIL() {
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLLLLLL() {
        C0E12 c0e12 = C363750ENx.LIZ;
        return C363750ENx.LIZIZ(LIZIZ());
    }

    public final boolean LIZLLL(String str) {
        boolean z;
        C361980EHc c361980EHcLJ;
        InterfaceC359850E8x interfaceC359850E8xB20 = this.LLILLL.B20();
        ((BaseFuncItemGuideController) this.LLILZIL.getValue()).LIZ();
        if (interfaceC359850E8xB20 != null && (c361980EHcLJ = interfaceC359850E8xB20.LJ(str)) != null) {
            C361970EHb c361970EHbLIZ = C361990EHd.LIZ(c361980EHcLJ);
            c361970EHbLIZ.LIZIZ(((BaseFuncItemGuideController) this.LLILZIL.getValue()).LIZLLL(), "key_lottie_anim");
            c361970EHbLIZ.LIZIZ(((BaseFuncItemGuideController) this.LLILZIL.getValue()).LIZJ(), "key_view_anim");
            C361980EHc c361980EHcLIZ = c361970EHbLIZ.LIZ();
            C0E12 c0e12 = C363750ENx.LIZ;
            C363750ENx.LJ(LIZIZ());
            z = true;
            interfaceC359850E8xB20.LIZJ(str, c361980EHcLIZ, true);
            ((BaseFuncItemGuideController) this.LLILZIL.getValue()).LLJI = new AwS122S1200000_5(interfaceC359850E8xB20, str, c361980EHcLJ, 6);
        } else {
            z = false;
        }
        LIZ();
        return z;
    }

    public final boolean LJ(List<String> list) {
        if (list.contains(LIZJ()) && !LLLLLLL()) {
            return LIZLLL(LIZJ());
        }
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLLZZIL(List<String> list) {
        return LJ(list);
    }

    @Override // X.C0EIO
    public final boolean LLILLIZIL(List<String> list, C0ELJ c0elj) {
        return LJ(list);
    }

    @Override // X.C0EIO
    public boolean LLJLILLLLZIIL(C0E5A c0e5a, List<String> list) {
        return LJ(list);
    }

    public C0EIC(C19EG c19eg, Lifecycle lifecycle, C0EGY c0egy, InterfaceC362350EIn interfaceC362350EIn) {
        this.LL = c19eg;
        this.LLILLJJLI = lifecycle;
        this.LLILLL = c0egy;
        this.LLILZ = interfaceC362350EIn;
    }
}
