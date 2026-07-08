package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment.SubSpaceBaseFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.SubSpaceDetailListAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jpk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504060Jpk extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ SubSpaceDetailListAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504060Jpk(SubSpaceDetailListAssem subSpaceDetailListAssem) {
        super(1);
        this.LL = subSpaceDetailListAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        Context contextN3;
        SubSpaceBaseFragment subSpaceBaseFragment;
        Throwable th2 = th;
        this.LL.LJIIL();
        Context context = this.LL.getContext();
        Boolean boolValueOf = null;
        if (context != null) {
            contextN3 = C786410Ut5.N3(context);
        } else {
            contextN3 = null;
        }
        C501540Jlg.LIZJ(contextN3, th2);
        C491870JQr c491870JQr = (C491870JQr) this.LL.LLJJIJIIJIL.getValue();
        C504880Jr4 c504880Jr4Ip = this.LL.ip();
        if (c504880Jr4Ip != null) {
            boolValueOf = Boolean.valueOf(c504880Jr4Ip.LLJILJIL);
        }
        c491870JQr.LIZJ(C500260Jjc.LJJIJIIJIL(boolValueOf));
        this.LL.kp().setState(new C505080JrO());
        if (th2 instanceof C501470JlZ) {
            C501520Jle c501520Jle = (C501520Jle) th2;
            if (c501520Jle.getErrorCode() == 4025044 || c501520Jle.getErrorCode() == 4025045) {
                Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
                if ((fragmentLJI instanceof SubSpaceBaseFragment) && (subSpaceBaseFragment = (SubSpaceBaseFragment) fragmentLJI) != null) {
                    subSpaceBaseFragment.PR();
                }
            }
        }
        return Unit.LIZ;
    }
}
