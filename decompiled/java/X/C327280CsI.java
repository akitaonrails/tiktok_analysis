package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager;
import java.util.List;

/* JADX INFO: renamed from: X.0CsI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1294060jmO
public final class C327280CsI implements IAwemeFetchManager {
    public static final C327280CsI LIZJ = new C327280CsI();
    public final /* synthetic */ IAwemeFetchManager LIZIZ;

    @Override // com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager
    public final Object LIZ(List<String> list, boolean z, AbstractC2252651DEx abstractC2252651DEx, InterfaceC1364105Vn<? super C327180Cs8> interfaceC1364105Vn) {
        return this.LIZIZ.LIZ(list, z, abstractC2252651DEx, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager
    public final boolean LIZIZ(String str) {
        return this.LIZIZ.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager
    public final C327170Cs7 LIZJ(String str) {
        return this.LIZIZ.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager
    public final C05YD<InterfaceC327200CsA> LIZLLL(String str) {
        return this.LIZIZ.LIZLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager
    public final UrlModel LJ(String str) {
        return this.LIZIZ.LJ(str);
    }

    public C327280CsI() {
        IAwemeFetchManager.LIZ.getClass();
        IAwemeFetchManager value = C327290CsJ.LIZIZ.getValue();
        if (value != null) {
            this.LIZIZ = value;
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
