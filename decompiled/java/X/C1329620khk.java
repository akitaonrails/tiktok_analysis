package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0khk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329620khk implements InterfaceC1331310kkT {
    public static final Class<?> LJ = C1329620khk.class;
    public final InterfaceC1329690khr LIZ;
    public InterfaceC1329780ki0 LIZIZ;
    public C1329790ki1 LIZJ;
    public final C1329700khs LIZLLL;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0khs, X.0kiA] */
    public C1329620khk(InterfaceC1329690khr interfaceC1329690khr, InterfaceC1329780ki0 interfaceC1329780ki0) {
        ?? r1 = new InterfaceC1329880kiA() { // from class: X.0khs
            @Override // X.InterfaceC1329880kiA
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1329880kiA
            public final C1323050kX9<Bitmap> LIZ(int i, C1330000kiM c1330000kiM, boolean z) {
                return this.LIZ.LIZ.LIZLLL(i, c1330000kiM, z);
            }
        };
        this.LIZLLL = r1;
        this.LIZ = interfaceC1329690khr;
        this.LIZIZ = interfaceC1329780ki0;
        this.LIZJ = new C1329790ki1(interfaceC1329780ki0, r1);
    }

    public final boolean LIZ(int i, Bitmap bitmap) {
        try {
            this.LIZJ.LIZLLL(i, bitmap);
            return true;
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            Class<?> cls = LJ;
            Object[] objArr = {Integer.valueOf(i)};
            if (C1328570kg3.LIZ.LIZIZ(6)) {
                C1328570kg3.LIZ.e(cls.getSimpleName(), C786410Ut5.k4(null, "Rendering of frame unsuccessful. Frame number: %d", objArr), e);
            }
            return false;
        }
    }
}
