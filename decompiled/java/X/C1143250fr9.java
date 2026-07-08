package X;

import Y.AObjectS109S0000000_3;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0fr9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1143250fr9 implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        try {
            T tNewInstance = cls.newInstance();
            if (tNewInstance instanceof JediViewModel) {
                JediViewModel jediViewModel = (JediViewModel) tNewInstance;
                InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(cls);
                if (interfaceC1766500w4OCreate != null) {
                    interfaceC1766500w4OCreate.LIZ();
                }
                jediViewModel.JQ2(new AObjectS109S0000000_3(11));
            }
            return tNewInstance;
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot create an instance of ");
            sbLIZ.append(cls);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
        } catch (InstantiationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Cannot create an instance of ");
            sbLIZ2.append(cls);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2), e2);
        }
    }
}
