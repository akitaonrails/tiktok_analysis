package X;

import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;

/* JADX INFO: renamed from: X.07nT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1968907nT implements InterfaceC1969007nU {
    public final InterfaceC1037490d6Z LIZ;
    public final BusinessService LIZIZ = new BusinessService(this);

    public C1968907nT(InterfaceC1037490d6Z interfaceC1037490d6Z) {
        this.LIZ = interfaceC1037490d6Z;
    }

    public final <T extends BusinessService.Business> T LIZ(Class<T> cls) {
        return (T) this.LIZIZ.LIZ(cls);
    }
}
