package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: X.09R9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09R9 implements C01GW<InterfaceC736910SvR<Object>> {
    public InterfaceC736910SvR<Object> LL;
    public final /* synthetic */ C13IQ<? extends InterfaceC736910SvR<Object>> LLILLJJLI;
    public final /* synthetic */ AssemViewModel<Object> LLILLL;

    @Override // X.C01GW
    public final boolean isInitialized() {
        return true;
    }

    @Override // X.C01GW
    public final InterfaceC736910SvR<Object> getValue() {
        InterfaceC736910SvR<Object> interfaceC736910SvR = this.LL;
        if (interfaceC736910SvR == null) {
            C13IQ<? extends InterfaceC736910SvR<Object>> c13iq = this.LLILLJJLI;
            if (!InterfaceC736910SvR.class.isAssignableFrom(C09R7.LIZ(c13iq))) {
                throw new IllegalArgumentException("Custom Model must be a subclass of AssemModel<ModelOperator>.");
            }
            try {
                interfaceC736910SvR = (InterfaceC736910SvR) C09R7.LIZ(c13iq).newInstance();
                AssemViewModel<Object> assemViewModel = this.LLILLL;
                this.LL = interfaceC736910SvR;
                assemViewModel.putCreatedRepository(interfaceC736910SvR);
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Cannot create an instance of ");
                sbLIZ.append(c13iq);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
            } catch (InstantiationException e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Cannot create an instance of ");
                sbLIZ2.append(c13iq);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2), e2);
            } catch (NoSuchMethodException e3) {
                TryCatchGuardChecker.doCheck(e3);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Cannot create an instance of ");
                sbLIZ3.append(c13iq);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3), e3);
            } catch (InvocationTargetException e4) {
                TryCatchGuardChecker.doCheck(e4);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Cannot create an instance of ");
                sbLIZ4.append(c13iq);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ4), e4);
            }
        }
        return interfaceC736910SvR;
    }

    public C09R9(AssemViewModel assemViewModel, C19719912Dl c19719912Dl) {
        this.LLILLJJLI = c19719912Dl;
        this.LLILLL = assemViewModel;
    }
}
