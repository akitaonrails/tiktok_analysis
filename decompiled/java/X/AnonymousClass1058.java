package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesManager;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.1058, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class AnonymousClass1058 extends C104X implements InterfaceC191831102z {
    public final C191848103q LLILZIL;

    @Override // X.C104X
    public final boolean LJIILLIIL() {
        return false;
    }

    @Override // X.C104X
    public final boolean LJIIZILJ(boolean z) {
        C1208440hYI.LIZ.getClass();
        if (C1208440hYI.LIZIZ.LJIIJ() && z) {
            return true;
        }
        return false;
    }

    public AnonymousClass1058(C191848103q c191848103q, C107P c107p) {
        super(C104Y.LIZ(c107p.LIZ, new AwS607S0100000_28(c107p, 291)), c191848103q);
        this.LLILZIL = c191848103q;
    }

    @Override // X.InterfaceC191831102z
    public final CharSequence LIZJ(Context context, CharSequence charSequence) {
        LocationServicesManager locationServicesManager = LocationServicesManager.LIZ;
        LifecycleOwner lifecycleOwner = this.LLILZIL.LIZJ;
        locationServicesManager.getClass();
        return LocationServicesManager.LIZ(context, lifecycleOwner, context.getString(2131839193), context.getString(2131844778), LocationServicesManager.LIZLLL);
    }

    @Override // X.C104X
    public final void LJIJI(int i, View view) {
        LocationServicesManager locationServicesManager = LocationServicesManager.LIZ;
        C191848103q c191848103q = this.LLILZIL;
        Context context = c191848103q.LIZ;
        LifecycleOwner lifecycleOwner = c191848103q.LIZJ;
        locationServicesManager.getClass();
        LocationServicesManager.LJFF(context, lifecycleOwner);
    }
}
