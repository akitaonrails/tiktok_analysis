package X;

import Y.ARunnableS129S0100000_29;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.11Ej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19467511Ej implements InterfaceC1526205yG {
    public final Effect LL;
    public final String LLILLJJLI;
    public final /* synthetic */ C19574811iE LLILLL;

    @Override // X.InterfaceC1526205yG
    public final void onSuccess() {
        C810560Vqw.LIZJ(new ARunnableS129S0100000_29(this, 141));
    }

    @Override // X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        Context context = this.LLILLL.LJIIJ;
        if ((context instanceof Activity) && !C1388190mED.LIZ(context).isFinishing()) {
            C1627480sSA.LIZ(C1388190mED.LIZ(this.LLILLL.LJIIJ));
        }
    }

    public C19467511Ej(C19574811iE c19574811iE, Effect effect, String str) {
        this.LLILLL = c19574811iE;
        this.LL = effect;
        this.LLILLJJLI = str;
    }
}
