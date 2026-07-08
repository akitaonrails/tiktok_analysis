package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import g3a.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Kg9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523590Kg9 extends a {
    public final String LLIZLLLIL;
    public final LifecycleCoroutineScope LLJ;
    public final Function1<AVMusic, Unit> LLJI;
    public final Function0<Unit> LLJIJIL;

    @Override // X.AbstractRunnableC21377818lM
    public final void LJII() {
        if (C298040BmE.LIZ()) {
            C23250099c.LIZLLL(this.LLJ, null, null, new C526260KkS(this, null), 3);
        } else {
            C1403010mc7.LIZ.getMusicService().requestMusic(this.LLIZLLLIL, new InterfaceC1416890myV() { // from class: X.0KgA
                @Override // X.InterfaceC1416890myV
                public final void LIZIZ(Exception exc) {
                    this.LIZ.LLJIJIL.invoke();
                    this.LIZ.LJIIJ();
                }

                @Override // X.InterfaceC1416890myV
                public final void LIZLLL(AVMusic aVMusic) {
                    if (aVMusic != null) {
                        this.LIZ.LLJI.invoke(aVMusic);
                        this.LIZ.LJIIJ();
                    } else {
                        this.LIZ.LLJIJIL.invoke();
                        this.LIZ.LJIIJ();
                    }
                }
            });
        }
    }

    public C523590Kg9(String str, LifecycleCoroutineScope lifecycleCoroutineScope, AwS374S0200000_8 awS374S0200000_8, AwS552S0100000_8 awS552S0100000_8) {
        this.LLIZLLLIL = str;
        this.LLJ = lifecycleCoroutineScope;
        this.LLJI = awS374S0200000_8;
        this.LLJIJIL = awS552S0100000_8;
        LJ(AFwS239S0000000_8.get$arr$(11));
    }
}
