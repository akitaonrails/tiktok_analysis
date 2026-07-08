package X;

import com.ss.android.ugc.aweme.relation.auth.IAuthService;
import com.ss.android.ugc.aweme.relation.auth.spi.AuthServiceImpl;
import java.util.List;

/* JADX INFO: renamed from: X.0dzU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1071540dzU implements IAuthService {
    public static final C1071540dzU LIZIZ = new C1071540dzU();
    public final /* synthetic */ IAuthService LIZ;

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC1071180dyu LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC1055970daN LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final AbstractC1074460e4C LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC1056200dak LIZLLL(EnumC1070410dxf enumC1070410dxf) {
        return this.LIZ.LIZLLL(enumC1070410dxf);
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC1070470dxl LJ(EnumC1070340dxY enumC1070340dxY) {
        return this.LIZ.LJ(enumC1070340dxY);
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final AbstractC1071680dzi LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final C01S9<C1071570dzX> LJI(EnumC1070340dxY enumC1070340dxY) {
        return this.LIZ.LJI(enumC1070340dxY);
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC1004520cFO LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final List<InterfaceC800130Va7> LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC1056100daa LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC1072620e1E LJIIJ() {
        return this.LIZ.LJIIJ();
    }

    public C1071540dzU() {
        IAuthService iAuthService;
        Object objLIZ = C04TD.LIZ(IAuthService.class, false);
        if (objLIZ != null) {
            iAuthService = (IAuthService) objLIZ;
        } else {
            if (C04TD.s3 == null) {
                synchronized (IAuthService.class) {
                    if (C04TD.s3 == null) {
                        C04TD.s3 = new AuthServiceImpl();
                    }
                }
            }
            iAuthService = C04TD.s3;
        }
        this.LIZ = iAuthService;
    }
}
