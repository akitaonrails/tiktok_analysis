package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.effect.EffectPanelViewModel;

/* JADX INFO: renamed from: X.12YS, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YS implements ViewModelProvider.Factory {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        switch (this.$t) {
        }
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        switch (this.$t) {
            case 0:
                return (T) create$0(this, cls);
            case 1:
                return (T) create$1(this, cls);
            case 2:
                return (T) create$2(this, cls);
            default:
                return null;
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        switch (this.$t) {
        }
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    public C12YS(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final ViewModel create$0(C12YS c12ys, Class cls) {
        return new EffectPanelViewModel(((C113T) c12ys.l0).LLJILLL);
    }

    public static final ViewModel create$1(C12YS c12ys, Class cls) {
        return new EffectPanelViewModel(((C113Z) c12ys.l0).getEditModel());
    }

    public static final ViewModel create$2(C12YS c12ys, Class cls) {
        return new EffectPanelViewModel(((C113E) c12ys.l0).LLJJIII);
    }
}
