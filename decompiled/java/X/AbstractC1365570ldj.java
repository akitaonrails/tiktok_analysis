package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.AwS265S0300000_21;

/* JADX INFO: renamed from: X.0ldj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1365570ldj implements InterfaceC1368050lhj {
    public final Context LL;
    public final BaseSharePackage LLILLJJLI;

    public abstract void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, View view);

    public AbstractC1365570ldj(Context context, BaseSharePackage baseSharePackage) {
        this.LL = context;
        this.LLILLJJLI = baseSharePackage;
    }

    @Override // X.InterfaceC1368050lhj
    public final void LJIIIIZZ(InterfaceC1369790lkX interfaceC1369790lkX, View view) {
        BaseSharePackage baseSharePackage = this.LLILLJJLI;
        if (baseSharePackage != null) {
            baseSharePackage.LJIIIZ(this.LL, interfaceC1369790lkX, view, new AwS265S0300000_21(this, interfaceC1369790lkX, view, 18));
        } else {
            LIZ(interfaceC1369790lkX, view);
        }
    }
}
