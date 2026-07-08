package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.service.IECommercePhotoService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RGf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C692990RGf {
    public final View LIZ;
    public Aweme LIZIZ;
    public final Function0<InterfaceC19578611iq> LIZJ;
    public C692980RGe LIZLLL;
    public C705930RmZ LJ;
    public final InterfaceC694960RNu LJFF;

    public final boolean LIZ(Aweme aweme) {
        if (aweme == null) {
            aweme = this.LIZIZ;
        }
        return this.LJFF.LIZ(aweme);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C692990RGf(View view, Aweme aweme, Function0<? extends InterfaceC19578611iq> function0) {
        InterfaceC694960RNu interfaceC694960RNuLIZ;
        this.LIZ = view;
        this.LIZIZ = aweme;
        this.LIZJ = function0;
        IECommercePhotoService iECommercePhotoService = (IECommercePhotoService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IECommercePhotoService.class));
        this.LJFF = (iECommercePhotoService == null || (interfaceC694960RNuLIZ = iECommercePhotoService.LIZ()) == null) ? C694950RNt.LIZ : interfaceC694960RNuLIZ;
    }
}
