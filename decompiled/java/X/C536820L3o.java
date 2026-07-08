package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import g3a.a;
import kotlin.jvm.internal.AFwS239S0000000_8;
import lth.o;

/* JADX INFO: renamed from: X.0L3o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536820L3o extends a implements InterfaceC1408530ml1 {
    public final String LLIZLLLIL;
    public AVChallenge LLJ;

    public C536820L3o() {
        this(null);
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZIZ() {
        return false;
    }

    @Override // X.AbstractRunnableC21377818lM
    public final void LJII() {
        String str = this.LLIZLLLIL;
        if (str != null) {
            ((C194463116f) o.LIZLLL).LIZ(str, new C581100Mqi(this, 0), new C581100Mqi(this, 1));
        }
    }

    public final Bundle LJIIL() {
        if (this.LLJ == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "Key_mv_challenge", this.LLJ);
        return bundle;
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return EnumC194317110p.P1;
    }

    public C536820L3o(String str) {
        this.LLIZLLLIL = str;
        LJ(AFwS239S0000000_8.get$arr$(87));
    }

    public final void LJIIJJI(Bundle bundle) {
        String string = bundle.getString("Key_challenge_id");
        ((C194463116f) o.LIZLLL).LIZIZ(string, new C581100Mqi(this, 2));
    }
}
