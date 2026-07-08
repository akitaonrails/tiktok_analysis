package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import g3a.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS93S1200000_8;

/* JADX INFO: renamed from: X.0Kg2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523520Kg2 extends a {
    public final String LLIZLLLIL;
    public final Function1<AVMusic, Unit> LLJ;
    public final Function0<Unit> LLJI;

    @Override // X.AbstractRunnableC21377818lM
    public final void LJII() {
        C1403010mc7.LIZ.getMusicService().requestMusic(this.LLIZLLLIL, new InterfaceC1416890myV() { // from class: X.0Kg4
            @Override // X.InterfaceC1416890myV
            public final void LIZIZ(Exception exc) {
                this.LIZ.LLJI.invoke();
                this.LIZ.LJIIJ();
            }

            @Override // X.InterfaceC1416890myV
            public final void LIZLLL(AVMusic aVMusic) {
                this.LIZ.LLJ.invoke(aVMusic);
                this.LIZ.LJIIJ();
            }
        });
    }

    public C523520Kg2(String str, AwS546S0100000_2 awS546S0100000_2, AwS93S1200000_8 awS93S1200000_8) {
        this.LLIZLLLIL = str;
        this.LLJ = awS93S1200000_8;
        this.LLJI = awS546S0100000_2;
        LJ(AFwS239S0000000_8.get$arr$(12));
    }
}
