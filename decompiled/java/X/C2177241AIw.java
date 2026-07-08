package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Shader;
import com.ss.android.ugc.aweme.relation.label.AvatarUnionServiceImpl;
import com.ss.android.ugc.aweme.relation.label.IAvatarUnionService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1AIw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2177241AIw implements InterfaceC2177261AIy {
    public static final IAvatarUnionService LIZIZ;
    public static final C2177251AIx LIZJ;
    public final /* synthetic */ InterfaceC2177261AIy LIZ;

    @Override // X.InterfaceC2177261AIy
    public final Bitmap LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.InterfaceC2177261AIy
    public final C11NZ<Bitmap> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // X.InterfaceC2177261AIy
    public final Bitmap LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // X.InterfaceC2177261AIy
    public final C11NZ<Bitmap> LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    static {
        IAvatarUnionService iAvatarUnionService;
        Object objLIZ = C04TD.LIZ(IAvatarUnionService.class, false);
        if (objLIZ != null) {
            iAvatarUnionService = (IAvatarUnionService) objLIZ;
        } else {
            if (C04TD.y3 == null) {
                synchronized (IAvatarUnionService.class) {
                    if (C04TD.y3 == null) {
                        C04TD.y3 = new AvatarUnionServiceImpl();
                    }
                }
            }
            iAvatarUnionService = C04TD.y3;
        }
        LIZIZ = iAvatarUnionService;
        LIZJ = new C2177251AIx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), null, 0, 3, 0.7f, 1.0f, R.attr.bw, R.attr.a1j, null, EnumC2177131AIl.NO_TAIL, false, true, false, null, 98360);
    }

    public C2177241AIw(Context context, C1246110iX3 c1246110iX3, C2177251AIx c2177251AIx) {
        boolean zLIZJ;
        C1246110iX3 c1246110iX32 = c1246110iX3;
        IAvatarUnionService iAvatarUnionService = LIZIZ;
        c1246110iX32 = c1246110iX32 == null ? new C1246110iX3(0) : c1246110iX32;
        int i = c2177251AIx.LIZ;
        int i2 = c2177251AIx.LIZIZ;
        Integer num = c2177251AIx.LIZJ;
        int i3 = c2177251AIx.LIZLLL;
        Integer num2 = c2177251AIx.LJ;
        Shader shader = c2177251AIx.LJFF;
        int i4 = c2177251AIx.LJI;
        float f = c2177251AIx.LJII;
        float f2 = c2177251AIx.LJIIIIZZ;
        int i5 = c2177251AIx.LJIIIZ;
        int i6 = c2177251AIx.LJIIJ;
        Boolean bool = c2177251AIx.LJIIJJI;
        if (bool != null) {
            zLIZJ = bool.booleanValue();
        } else {
            zLIZJ = C444960Hcc.LIZJ(context);
        }
        this.LIZ = iAvatarUnionService.LIZ(context, c1246110iX32, i, i2, num, i3, num2, shader, i4, f, f2, i5, i6, zLIZJ, c2177251AIx.LJIIL, c2177251AIx.LJIILIIL, c2177251AIx.LJIILJJIL, c2177251AIx.LJIILL, c2177251AIx.LJIILLIIL);
    }
}
