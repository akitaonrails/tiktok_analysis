package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0Nvr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hometab.base.tabicon.iconfile.ImagePreloader$prefetchToDisk$2$1", f = "ImagePreloader.kt", l = {}, m = "invokeSuspend")
public final class C609770Nvr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ InterfaceC20236714Gf<Boolean> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C609770Nvr(String str, boolean z, InterfaceC20236714Gf<? super Boolean> interfaceC20236714Gf, InterfaceC1364105Vn<? super C609770Nvr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = interfaceC20236714Gf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C609770Nvr(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1325540kbA c1325540kbALJIIL;
        AbstractC1321260kUG abstractC1321260kUGLJIJ;
        C1C7U.LIZ("ImagePreloader@665f.prefetchToDisk$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C609790Nvt c609790Nvt = C609790Nvt.LIZ;
            String str = this.LL;
            EnumC1320950kTl enumC1320950kTl = EnumC1320950kTl.FULL_FETCH;
            c609790Nvt.getClass();
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
            c1325700kbQLIZLLL.LJIJI = "tab_icon_cache";
            c1325700kbQLIZLLL.LJI = EnumC1325560kbC.CUSTOM;
            c1325700kbQLIZLLL.LIZIZ = enumC1320950kTl;
            c1325700kbQLIZLLL.LJIIL = EnumC1331380kka.HIGH;
            C1325710kbR c1325710kbRLIZ = c1325700kbQLIZLLL.LIZ();
            boolean z = this.LLILLJJLI;
            final AwS588S0100000_9 awS588S0100000_9 = new AwS588S0100000_9((InterfaceC20236714Gf) this.LLILLL, (InterfaceC20236714Gf<? super Boolean>) 629);
            C1328130kfL c1328130kfLLIZ = C609790Nvt.LIZ();
            if (c1328130kfLLIZ != null) {
                c1325540kbALJIIL = c1328130kfLLIZ.LJIIL();
            } else {
                c1325540kbALJIIL = null;
            }
            final String string = c1325710kbRLIZ.LIZIZ.toString();
            if (C609790Nvt.LIZIZ(string) && !z) {
                awS588S0100000_9.invoke(Boolean.TRUE);
            } else if (c1325540kbALJIIL != null && (abstractC1321260kUGLJIJ = c1325540kbALJIIL.LJIJ(c1325710kbRLIZ, null)) != null) {
                abstractC1321260kUGLJIJ.LIZJ(new InterfaceC589510NAf<Void>() { // from class: X.0NAn
                    @Override // X.InterfaceC589510NAf
                    public final void LIZJ(AbstractC1321260kUG abstractC1321260kUG) {
                    }

                    @Override // X.InterfaceC589510NAf
                    public final void LIZ(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                        if (interfaceC1320200kSY.LIZ()) {
                            interfaceC1320200kSY.close();
                            awS588S0100000_9.invoke(Boolean.TRUE);
                        }
                    }

                    @Override // X.InterfaceC589510NAf
                    public final void LIZIZ(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                        String message;
                        Throwable thLIZLLL;
                        if (interfaceC1320200kSY != null) {
                            interfaceC1320200kSY.close();
                        }
                        awS588S0100000_9.invoke(Boolean.FALSE);
                        C609790Nvt c609790Nvt2 = C609790Nvt.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("prefetchToDisk, imageUrl: ");
                        sbLIZ.append(string);
                        sbLIZ.append(", prefetch failed, ");
                        if (interfaceC1320200kSY != null && (thLIZLLL = ((AbstractC1321260kUG) interfaceC1320200kSY).LIZLLL()) != null) {
                            message = thLIZLLL.getMessage();
                        } else {
                            message = null;
                        }
                        sbLIZ.append(message);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC589510NAf
                    public final void LIZLLL(AbstractC1321260kUG abstractC1321260kUG) {
                        awS588S0100000_9.invoke(Boolean.FALSE);
                        if (abstractC1321260kUG != null) {
                            abstractC1321260kUG.close();
                        }
                    }
                }, C822690WPb.LIZ());
            }
            C609790Nvt.LIZJ.remove(this.LL);
            C609790Nvt.LJFF.remove(this.LL);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ImagePreloader@665f.prefetchToDisk$2$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C609790Nvt.LIZJ.remove(this.LL);
            C609790Nvt.LJFF.remove(this.LL);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
