package X;

import X.C830490Whz;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.127G, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@InterfaceC1294060jmO
public final class C127G implements ViewModelProvider.Factory {
    public final ViewModelProvider.Factory LIZ;
    public final C830490Whz LIZIZ;

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
        Function0 function0 = (Function0) this.LIZIZ.get(cls);
        if (function0 != null) {
            return (T) function0.invoke();
        }
        for (Map.Entry entry : (C830490Whz.a) this.LIZIZ.entrySet()) {
            Class cls2 = (Class) entry.getKey();
            Function0 function02 = (Function0) entry.getValue();
            if (cls2.isAssignableFrom(cls)) {
                return (T) function02.invoke();
            }
        }
        ViewModelProvider.Factory companion = this.LIZ;
        if (companion == null) {
            companion = ViewModelProvider.NewInstanceFactory.Companion.getInstance();
        }
        return (T) companion.create(cls);
    }

    public C127G(Object[] objArr, ViewModelProvider.Factory factory) {
        this.LIZ = factory;
        C830490Whz c830490Whz = new C830490Whz();
        for (int i = 0; i < objArr.length; i += 2) {
            Object obj = objArr[i];
            Object obj2 = objArr[i + 1];
            C19719512Dh.LJ(0, obj2);
            c830490Whz.put(obj, obj2);
        }
        this.LIZIZ = c830490Whz;
    }
}
