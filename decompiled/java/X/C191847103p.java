package X;

import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.103p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191847103p extends AbstractC191840103i implements InterfaceC191837103f, InterfaceC191854103w {
    public final CharSequence LIZJ;
    public final Function1<View, Unit> LIZLLL;
    public final boolean LJ = true;
    public final int LJFF = 3;
    public final int LJI = 1;
    public final int LJII = 20;
    public final int LJIIIIZZ = 4;
    public boolean LJIIIZ = false;
    public boolean LJIIJ = false;

    @Override // X.InterfaceC191837103f
    public final void LIZIZ(AbstractC191840103i abstractC191840103i, C191838103g c191838103g) {
    }

    @Override // X.InterfaceC191837103f
    public final void LJ(AbstractC191840103i abstractC191840103i, C191838103g c191838103g, int i) {
    }

    @Override // X.InterfaceC191854103w
    public final boolean x0() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC191854103w
    public final void LIZJ(boolean z) {
        this.LJIIJ = z;
    }

    @Override // X.InterfaceC191854103w
    public final void LIZLLL(boolean z) {
        this.LJIIIZ = z;
    }

    public C191847103p(CharSequence charSequence, C105C c105c) {
        this.LIZJ = charSequence;
        this.LIZLLL = c105c;
    }

    @Override // X.InterfaceC191837103f
    public final C191838103g LIZ(Context context, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -2));
        C197039127h c197039127h = new C197039127h(context, null, 6, 0);
        C786410Ut5.J6(c197039127h, new ViewGroup.LayoutParams(-1, -2));
        c197039127h.setText(this.LIZJ);
        c197039127h.setButtonSize(this.LJFF);
        c197039127h.setButtonVariant(this.LJI);
        C786410Ut5.U8(c197039127h, new ACListenerS162S0100000_28(this.LIZLLL, 151));
        c197039127h.setEnabled(this.LJ);
        frameLayout.addView(c197039127h);
        C426750GoL.LJIIIZ(c197039127h, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LJII)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LJIIIIZZ)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LJII)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LJIIIIZZ)))), false, 16);
        IPrivacySettingAPIService iPrivacySettingAPIService = (IPrivacySettingAPIService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingAPIService.class, false, false, false, 14, null);
        if (iPrivacySettingAPIService != null) {
            iPrivacySettingAPIService.LJFF(frameLayout, this.LJIIIZ, this.LJIIJ);
        }
        return new C191838103g(frameLayout);
    }
}
