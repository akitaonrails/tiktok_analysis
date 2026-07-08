package X;

import com.bytedance.touchpoint.api.ITouchPointService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;

/* JADX INFO: renamed from: X.0zNg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893780zNg implements ITouchPointService {
    public static final C1893780zNg LIZIZ = new C1893780zNg();
    public final /* synthetic */ ITouchPointService LIZ = (ITouchPointService) ServiceManager.get().getService(ITouchPointService.class);

    @Override // com.bytedance.touchpoint.api.ITouchPointService
    public final InterfaceC1904907d9 LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.bytedance.touchpoint.api.ITouchPointService
    public final List<InterfaceC1904907d9> LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.bytedance.touchpoint.api.ITouchPointService
    public final void LJI(Object obj) {
        this.LIZ.LJI(obj);
    }

    @Override // com.bytedance.touchpoint.api.ITouchPointService
    public final void LJII(C262100zr c262100zr) {
        this.LIZ.LJII(c262100zr);
    }

    @Override // com.bytedance.touchpoint.api.ITouchPointService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.bytedance.touchpoint.api.ITouchPointService
    public final boolean LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.bytedance.touchpoint.api.ITouchPointService
    public final C1893670zNV LJIIJ(String str) {
        return this.LIZ.LJIIJ(str);
    }

    @Override // com.bytedance.touchpoint.api.ITouchPointService
    public final long LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.bytedance.touchpoint.api.ITouchPointService
    public final boolean isLogin() {
        return this.LIZ.isLogin();
    }
}
