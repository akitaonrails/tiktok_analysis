package X;

import com.ss.android.ugc.aweme.feed.model.live.GuessRankUserInfo;
import com.ss.android.ugc.aweme.feed.model.live.GuessWidget;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.00zF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C258300zF {
    public final InterfaceC260000zW LIZ;
    public boolean LIZJ;
    public C466310IQj LJ;
    public C466310IQj LJFF;
    public C466310IQj LJI;
    public GuessWidget LJII;
    public GuessWidget LJIIIIZZ;
    public GuessRankUserInfo LJIIIZ;
    public EnumC259000zM LIZIZ = EnumC259000zM.IDLE;
    public final Set<String> LIZLLL = new LinkedHashSet();

    public C258300zF(InterfaceC260000zW interfaceC260000zW) {
        this.LIZ = interfaceC260000zW;
    }

    public final void LIZ(EnumC259000zM enumC259000zM, GuessWidget guessWidget, GuessWidget guessWidget2, GuessRankUserInfo guessRankUserInfo) {
        this.LIZIZ = enumC259000zM;
        this.LJII = guessWidget;
        this.LJIIIIZZ = guessWidget2;
        this.LJIIIZ = guessRankUserInfo;
        InterfaceC260000zW interfaceC260000zW = this.LIZ;
        if (interfaceC260000zW != null) {
            interfaceC260000zW.LIZ(enumC259000zM, this.LIZJ, guessWidget, guessWidget2, guessRankUserInfo);
        }
    }
}
