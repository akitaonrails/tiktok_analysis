package X;

import X.InterfaceC860660XpY;
import Y.AObjectS250S0100000_33;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.model.LivePhotoModel;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.VERecordMode;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ATn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC2180011ATn<T extends InterfaceC860660XpY> extends AbstractC2255721DQs<T> implements InterfaceC860660XpY, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final C1AU4 LLILLL;
    public final InterfaceC497601wk LLILZ;
    public final InterfaceC1731706qJ LLILZIL;
    public final VERecorder LLILZLL;
    public final C2180021ATo LLIZ;
    public List<Function0<Unit>> LLIZLLLIL;
    public int LLJ;
    public String LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public final List<EnumC2180071ATt> LLJILLL;
    public final List<EnumC2180071ATt> LLJJ;
    public final VEVideoEncodeSettings LLJJI;
    public long LLJJIII;
    public final InterfaceC1441305kZ<C1AU3> LLJJIJI;
    public final InterfaceC1441305kZ<EnumC2180071ATt> LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC2180011ATn.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public static /* synthetic */ void Z1() {
    }

    @Override // X.InterfaceC860660XpY
    public Object WJ2(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return T2(this, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC860660XpY
    public Object h40(float f, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return e4(this, f, interfaceC1364105Vn);
    }

    public void m3(int i) {
    }

    public abstract LivePhotoModel o2();

    public Object v3(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return B3(this, interfaceC1364105Vn);
    }

    public abstract Object z4(String str, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    @Override // X.InterfaceC860660XpY
    public boolean DE0() {
        return !this.LLJILLL.contains(this.LLIZ.LIZJ.LIZJ());
    }

    public void E3() {
        this.LLILZLL.LIZIZ(VERecordMode.DEFAULT);
        VERecorder vERecorder = this.LLILZLL;
        VEVideoEncodeSettings vEVideoEncodeSettings = vERecorder.LIZIZ.LJIIIIZZ;
        if (vEVideoEncodeSettings != null) {
            C1780100wQK c1780100wQK = new C1780100wQK(vEVideoEncodeSettings);
            VEVideoEncodeSettings vEVideoEncodeSettings2 = c1780100wQK.LIZIZ;
            vEVideoEncodeSettings2.maxCacheDuration = -1;
            vEVideoEncodeSettings2.keyFrameDuration = -1;
            vERecorder.LIZLLL(c1780100wQK.LIZ());
        } else {
            C1780100wQK c1780100wQK2 = new C1780100wQK(1);
            VEVideoEncodeSettings vEVideoEncodeSettings3 = c1780100wQK2.LIZIZ;
            vEVideoEncodeSettings3.maxCacheDuration = -1;
            vEVideoEncodeSettings3.keyFrameDuration = -1;
            vERecorder.LIZLLL(c1780100wQK2.LIZ());
        }
        try {
            C2219091BtD.LIZLLL().i("livephoto clear all frags");
            this.LLILZLL.LIZIZ.LJJJ.LIZIZ();
        } catch (VEException e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("livephoto ");
            sbLIZ.append(e.getMessage());
            interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC860660XpY
    public boolean GD0() {
        return this.LLJJ.contains(this.LLIZ.LIZJ.LIZJ());
    }

    public final boolean W2() {
        return this.LLIZ.LIZJ.LIZJ() == EnumC2180071ATt.LIVE_PHOTO_RECORDING;
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILZIL.getValue(this, LLJJIJIL[0]);
    }

    public final void i3() {
        this.LLIZ.LJ.LJIIIIZZ(this.LLJJIJI);
        this.LLIZ.LIZJ.LIZLLL(this.LLJJIJIIJIL);
    }

    @Override // X.InterfaceC860660XpY
    public boolean nA0() {
        return (this.LLIZ.LIZJ.LIZJ() == EnumC2180071ATt.START || this.LLIZ.LIZJ.LIZJ() == EnumC2180071ATt.END) && fx0() && aY();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC860660XpY
    public void lt() {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("livephoto on first frame, shouldStart: ");
        sbLIZ.append(fx0());
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        final boolean z = false;
        this.LLJILJIL = false;
        C2180021ATo c2180021ATo = this.LLIZ;
        final EnumC2180071ATt enumC2180071ATt = (EnumC2180071ATt) c2180021ATo.LIZJ.LIZJ();
        if (fx0() && aY()) {
            z = true;
        }
        c2180021ATo.LIZ(new C1AU3(enumC2180071ATt, z) { // from class: X.1ATp
            public final boolean LIZIZ;

            @Override // X.C1AU3
            public final EnumC2180071ATt LIZ() {
                EnumC2180071ATt enumC2180071ATt2 = this.LIZ;
                EnumC2180071ATt enumC2180071ATt3 = EnumC2180071ATt.START;
                return ((enumC2180071ATt2 == enumC2180071ATt3 || enumC2180071ATt2 == EnumC2180071ATt.END) && this.LIZIZ) ? EnumC2180071ATt.LIVE_PHOTO_INIT : ((enumC2180071ATt2 == enumC2180071ATt3 || enumC2180071ATt2 == EnumC2180071ATt.END) && !this.LIZIZ) ? EnumC2180071ATt.NORMAL_SHOOT : enumC2180071ATt2;
            }

            {
                this.LIZIZ = z;
            }
        });
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        getCameraApiComponent().fT0().LIZ(this, new AObjectS250S0100000_33(this, 2));
        getCameraApiComponent().p92().LIZ(this, new AObjectS250S0100000_33(this, 3));
        getCameraApiComponent().DS1().LIZ(this, new AObjectS250S0100000_33(this, 4));
        i3();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C2296808zG.LIZJ(this.LLILZ, null);
        this.LLIZ.LJ.LIZIZ(this.LLJJIJI);
        this.LLIZ.LIZJ.LIZIZ(this.LLJJIJIIJIL);
        this.LLIZLLLIL.clear();
    }

    public final InterfaceC497601wk G2() {
        return this.LLILZ;
    }

    public final C2180021ATo H2() {
        return this.LLIZ;
    }

    public final boolean W1() {
        return this.LLJILJIL;
    }

    public final int X1() {
        return this.LLJILJILJ;
    }

    public boolean c3() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
    }

    public final VERecorder w2() {
        return this.LLILZLL;
    }

    public final void H3(boolean z) {
        this.LLJILJIL = z;
    }

    @Override // X.InterfaceC860660XpY
    public void MK2(long j) {
        C23250099c.LIZLLL(this.LLILZ, null, null, new C860640XpW(j, this, null), 3);
    }

    public final void O3(int i) {
        this.LLJILJILJ = i;
    }

    public void Q3(boolean z) {
        this.LLJIJIL = z;
    }

    public void q3(final Function0<Unit> function0) {
        C2219091BtD.LIZLLL().d("livephoto stop pre record");
        this.LLILZLL.LJJJJIZL(new InterfaceC2183551Acz(this) { // from class: X.144B
            public final /* synthetic */ AbstractC2180011ATn<T> LIZ;

            @Override // X.InterfaceC2183551Acz
            public final void onDone(int i) {
                InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("livephoto try resume ret = ");
                sbLIZ.append(i);
                sbLIZ.append(" object = ");
                sbLIZ.append(this);
                interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.E3();
                function0.invoke();
            }

            {
                this.LIZ = this;
            }
        });
    }

    @Override // X.InterfaceC860660XpY
    public void qE1(Function0<Unit> function0) {
        C2219091BtD.LIZLLL().i("livephoto stop prerecord");
        if (this.LLIZ.LIZJ.LIZJ() == EnumC2180071ATt.LIVE_PHOTO_RECORDING) {
            E02(false, false, true, true);
        }
        this.LLIZLLLIL.add(function0);
    }

    public static <T extends InterfaceC860660XpY> Object B3(AbstractC2180011ATn<T> abstractC2180011ATn, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107708Nn.LIZ, new C144A(abstractC2180011ATn, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ <T extends InterfaceC860660XpY> Object T2(AbstractC2180011ATn<T> abstractC2180011ATn, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C2180021ATo c2180021ATo = abstractC2180011ATn.LLIZ;
        final EnumC2180071ATt enumC2180071ATt = (EnumC2180071ATt) c2180021ATo.LIZJ.LIZJ();
        c2180021ATo.LIZ(new C1AU3(enumC2180071ATt) { // from class: X.1ATr
            @Override // X.C1AU3
            public final EnumC2180071ATt LIZ() {
                return C2180061ATs.LIZ[this.LIZ.ordinal()] == 1 ? EnumC2180071ATt.END : this.LIZ;
            }
        });
        return Unit.LIZ;
    }

    public final void F4(String str, boolean z) {
        C23250099c.LIZLLL(this.LLILZ, null, null, new C860650XpX(this, str, z, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void o4(String str, boolean z) {
        this.LLJI = str;
        C2180021ATo c2180021ATo = this.LLIZ;
        final EnumC2180071ATt enumC2180071ATt = (EnumC2180071ATt) c2180021ATo.LIZJ.LIZJ();
        c2180021ATo.LIZ(new C1AU3(enumC2180071ATt) { // from class: X.1ATw
            @Override // X.C1AU3
            public final EnumC2180071ATt LIZ() {
                int i = C2180091ATv.LIZ[this.LIZ.ordinal()];
                return i != 1 ? i != 2 ? this.LIZ : EnumC2180071ATt.END : EnumC2180071ATt.LIVE_PHOTO_TAKING;
            }
        });
    }

    public AbstractC2180011ATn(C1DRG c1drg, C19A3 c19a3, C1AU4 c1au4) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        C054G c054gLIZIZ = C2296808zG.LIZIZ();
        this.LLILZ = c054gLIZIZ;
        this.LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
        this.LLILZLL = getCameraApiComponent().u92().LIZIZ();
        this.LLIZ = new C2180021ATo(c054gLIZIZ);
        this.LLIZLLLIL = new ArrayList();
        throw null;
    }

    public static <T extends InterfaceC860660XpY> Object e4(AbstractC2180011ATn<T> abstractC2180011ATn, float f, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107708Nn.LIZ, new C2180001ATm(abstractC2180011ATn, f, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC860660XpY
    public void E02(final boolean z, boolean z2, boolean z3, boolean z4) {
        C2180021ATo c2180021ATo = this.LLIZ;
        final EnumC2180071ATt enumC2180071ATt = (EnumC2180071ATt) c2180021ATo.LIZJ.LIZJ();
        c2180021ATo.LIZ(new C1AU3(enumC2180071ATt, z) { // from class: X.1AU1
            public final boolean LIZIZ;

            @Override // X.C1AU3
            public final EnumC2180071ATt LIZ() {
                EnumC2180071ATt enumC2180071ATt2 = this.LIZ;
                return (enumC2180071ATt2 == EnumC2180071ATt.NORMAL_SHOOT && this.LIZIZ) ? EnumC2180071ATt.LIVE_PHOTO_INIT : ((enumC2180071ATt2 == EnumC2180071ATt.LIVE_PHOTO_RECORDING || enumC2180071ATt2 == EnumC2180071ATt.LIVE_PHOTO_INIT) && !this.LIZIZ) ? EnumC2180071ATt.LIVE_PHOTO_SWITCHING : enumC2180071ATt2;
            }

            {
                this.LIZIZ = z;
            }
        });
    }
}
