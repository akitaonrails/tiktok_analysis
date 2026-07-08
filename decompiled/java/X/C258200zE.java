package X;

import com.bytedance.android.livesdk.game.model.GuessRankUserInfo;
import com.bytedance.android.livesdk.game.model.GuessWidget;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.00zE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C258200zE {
    public final boolean LIZ;
    public final InterfaceC259900zV LIZIZ;
    public boolean LIZLLL;
    public C466310IQj LJFF;
    public C466310IQj LJI;
    public C466310IQj LJII;
    public GuessWidget LJIIIIZZ;
    public GuessWidget LJIIIZ;
    public GuessRankUserInfo LJIIJ;
    public EnumC258900zL LIZJ = EnumC258900zL.IDLE;
    public final Set<String> LJ = new LinkedHashSet();

    public C258200zE(boolean z, InterfaceC259900zV interfaceC259900zV) {
        this.LIZ = z;
        this.LIZIZ = interfaceC259900zV;
    }

    public final void LIZ(EnumC258900zL enumC258900zL, GuessWidget guessWidget, GuessWidget guessWidget2, GuessRankUserInfo guessRankUserInfo) {
        this.LIZJ = enumC258900zL;
        this.LJIIIIZZ = guessWidget;
        this.LJIIIZ = guessWidget2;
        this.LJIIJ = guessRankUserInfo;
        InterfaceC259900zV interfaceC259900zV = this.LIZIZ;
        if (interfaceC259900zV != null) {
            interfaceC259900zV.LIZ(enumC258900zL, this.LIZLLL, guessWidget, guessWidget2, guessRankUserInfo);
        }
    }
}
