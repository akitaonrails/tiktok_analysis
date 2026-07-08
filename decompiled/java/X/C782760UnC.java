package X;

import android.view.View;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0UnC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782760UnC implements InterfaceC1102120emo {
    public final C0UX6 LIZ;
    public final long LIZIZ;
    public final String LIZJ = UUID.randomUUID().toString();
    public boolean LIZLLL;
    public AwS556S0100000_12 LJ;
    public AwS556S0100000_12 LJFF;

    @Override // X.InterfaceC1102120emo
    public final String LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC1102120emo
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC1102120emo
    public final boolean LJ() {
        return true;
    }

    @Override // X.InterfaceC1102120emo
    public final boolean LJFF() {
        return true;
    }

    @Override // X.InterfaceC1102120emo
    public final void LJI() {
    }

    @Override // X.InterfaceC1102120emo
    public final boolean LJIIIIZZ() {
        return true;
    }

    @Override // X.InterfaceC1102120emo
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // X.InterfaceC1102120emo
    public final Boolean LJIIL() {
        return null;
    }

    @Override // X.InterfaceC1102120emo
    public final boolean LJIILIIL() {
        return true;
    }

    @Override // X.InterfaceC1102120emo
    public final /* bridge */ /* synthetic */ String LJJJ() {
        return null;
    }

    @Override // X.InterfaceC1102120emo
    public final Map<String, String> getExtras() {
        return null;
    }

    @Override // X.InterfaceC1102120emo
    public final C1099880ejC LJIIIZ() {
        AwS556S0100000_12 awS556S0100000_12 = this.LJFF;
        if (awS556S0100000_12 != null) {
            return (C1099880ejC) awS556S0100000_12.invoke();
        }
        return null;
    }

    @Override // X.InterfaceC1102120emo
    public final View LJIILJJIL() {
        AwS556S0100000_12 awS556S0100000_12 = this.LJ;
        if (awS556S0100000_12 != null) {
            return (View) awS556S0100000_12.invoke();
        }
        return null;
    }

    @Override // X.InterfaceC1102120emo
    public final String getBusinessName() {
        return this.LIZ.getCurrentId();
    }

    @Override // X.InterfaceC1102120emo
    public final EnumC245600xC LIZLLL() {
        return C245700xD.LIZ(this);
    }

    @Override // X.InterfaceC1102120emo
    public final int getComponentType() {
        LJII();
        return 2;
    }

    @Override // X.InterfaceC1102120emo
    public final InterfaceC1102150emr LJII() {
        return C1113770f5b.LL;
    }

    @Override // X.InterfaceC1102120emo
    public final long LJIIJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1102120emo
    public final String getId() {
        return this.LIZJ;
    }

    public C782760UnC(C0UX6 c0ux6, long j) {
        this.LIZ = c0ux6;
        this.LIZIZ = j;
    }
}
