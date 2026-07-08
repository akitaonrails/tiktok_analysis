package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0Pnb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655610Pnb implements IGlobalSearchAdModule {
    public static final C655610Pnb LIZIZ = new C655610Pnb();
    public final /* synthetic */ IGlobalSearchAdModule LIZ = (IGlobalSearchAdModule) ServiceManager.get().getService(IGlobalSearchAdModule.class);

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule
    public final void LIZ(Context context) {
        this.LIZ.LIZ(context);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule
    public final InterfaceC988260bpA LIZIZ(Aweme aweme) {
        return this.LIZ.LIZIZ(aweme);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule
    public final void LIZJ(View view, Fragment fragment, C0P6L c0p6l) {
        this.LIZ.LIZJ(view, fragment, c0p6l);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule
    public final InterfaceC657510Pqf LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule
    public final InterfaceC660150Puv LJ(Aweme aweme) {
        return this.LIZ.LJ(aweme);
    }
}
