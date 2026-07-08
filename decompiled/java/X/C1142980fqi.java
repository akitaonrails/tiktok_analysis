package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: X.0fqi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142980fqi implements ViewModelProvider.Factory {
    public static final C986410bmB LIZ = new ViewModelProvider.Factory() { // from class: X.0bmB
        public final /* synthetic */ C1142980fqi LIZ = new C1142980fqi();

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends ViewModel> T create(C13IQ<T> c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
            C1142980fqi c1142980fqi = this.LIZ;
            c1142980fqi.getClass();
            return (T) C19566311gr.LIZ(c1142980fqi, c13iq, abstractC903280Zc6);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends ViewModel> T create(Class<T> cls) {
            return (T) this.LIZ.create(cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends ViewModel> T create(Class<T> cls, AbstractC903280Zc6 abstractC903280Zc6) {
            C1142980fqi c1142980fqi = this.LIZ;
            c1142980fqi.getClass();
            return (T) C19566311gr.LIZJ(c1142980fqi, cls, abstractC903280Zc6);
        }
    };

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
        if (AssemViewModel.class.isAssignableFrom(cls)) {
            try {
                return cls.newInstance();
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
            } catch (NoSuchMethodException e3) {
                TryCatchGuardChecker.doCheck(e3);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Cannot create an instance of ");
                sbLIZ3.append(cls);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3), e3);
            } catch (InvocationTargetException e4) {
                TryCatchGuardChecker.doCheck(e4);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Cannot create an instance of ");
                sbLIZ4.append(cls);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ4), e4);
            }
        }
        throw new IllegalArgumentException("Custom ViewModel must be a subclass of LifeAwareViewModel.");
    }
}
