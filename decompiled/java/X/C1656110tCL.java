package X;

import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: renamed from: X.0tCL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656110tCL {
    public InterfaceC1654780tAC LIZ;
    public C1656190tCT LIZIZ;
    public final boolean LIZJ;
    public InterfaceC1656370tCl LIZLLL;
    public Function1<? super CameraComponentModel, Integer> LJ;
    public InterfaceC1656170tCR LJFF;
    public InterfaceC1656360tCk LJI;
    public InterfaceC1656350tCj LJII;
    public Function1<? super CameraComponentModel, Boolean> LJIIIIZZ;
    public final Function1<? super CameraComponentModel, Boolean> LJIIIZ;
    public final Function0<Boolean> LJIIJ;
    public final boolean LJIIJJI;
    public final Function0<Boolean> LJIIL;

    public C1656110tCL() {
        this(null);
    }

    public C1656110tCL(Object obj) {
        final int i = 0;
        InterfaceC1654780tAC interfaceC1654780tAC = new InterfaceC1654780tAC(i) { // from class: X.0tAB
            public final Function1<Boolean, Long> LIZ = AnonymousClass0207.get$arr$(43);

            @Override // X.InterfaceC1654780tAC
            public final long LIZ(CameraComponentModel cameraComponentModel) {
                return this.LIZ.invoke(Boolean.valueOf(cameraComponentModel.mCurrentDurationMode)).longValue() - cameraComponentModel.mTotalRecordingTime;
            }
        };
        C1656190tCT c1656190tCT = new C1656190tCT(2.25f, 1, 1);
        AFwS266S0000000_25 aFwS266S0000000_25 = AFwS266S0000000_25.get$arr$(151);
        C1656180tCS c1656180tCS = InterfaceC1656170tCR.LIZ;
        AFwS266S0000000_25 aFwS266S0000000_252 = AFwS266S0000000_25.get$arr$(152);
        AFwS266S0000000_25 aFwS266S0000000_253 = AFwS266S0000000_25.get$arr$(153);
        AFwS214S0000000_25 aFwS214S0000000_25 = AFwS214S0000000_25.get$arr$(155);
        AFwS214S0000000_25 aFwS214S0000000_252 = AFwS214S0000000_25.get$arr$(156);
        this.LIZ = interfaceC1654780tAC;
        this.LIZIZ = c1656190tCT;
        this.LIZJ = true;
        this.LIZLLL = null;
        this.LJ = aFwS266S0000000_25;
        this.LJFF = c1656180tCS;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = aFwS266S0000000_252;
        this.LJIIIZ = aFwS266S0000000_253;
        this.LJIIJ = aFwS214S0000000_25;
        this.LJIIJJI = false;
        this.LJIIL = aFwS214S0000000_252;
    }
}
