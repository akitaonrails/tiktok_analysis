package X;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.m5;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.11So, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19504411So {
    public static final /* synthetic */ C19504411So LIZ = new C19504411So();
    public static final C19504311Sn LIZIZ = new InterfaceC19504611Sq() { // from class: X.11Sn
        @Override // X.InterfaceC19504611Sq
        public final C13Y1 LIZ(View view) {
            Lifecycle lifecycle;
            Context context;
            Integer numLIZ;
            CoroutineContext coroutineContext = C23271099x.INSTANCE;
            if (C1389600mGU.LIZIZ(view.getContext())) {
                C1838690xwp c1838690xwp = new InterfaceC1677690tl9() { // from class: X.0xwp
                    @Override // X.InterfaceC1677690tl9
                    public final float LJLJI() {
                        return 0.0f;
                    }

                    @Override // kotlin.coroutines.CoroutineContext.Element
                    public final InterfaceC23272099y getKey() {
                        return InterfaceC1677690tl9.LJLJJI;
                    }

                    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
                    public final <E extends CoroutineContext.Element> E get(InterfaceC23272099y<E> interfaceC23272099y) {
                        return (E) C09A1.LIZIZ(this, interfaceC23272099y);
                    }

                    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
                    public final CoroutineContext minusKey(InterfaceC23272099y<?> interfaceC23272099y) {
                        return C09A1.LIZJ(this, interfaceC23272099y);
                    }

                    @Override // kotlin.coroutines.CoroutineContext
                    public final CoroutineContext plus(CoroutineContext coroutineContext2) {
                        return C09A1.LIZLLL(this, coroutineContext2);
                    }

                    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
                    public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
                        return (R) C09A1.LIZ(this, r, function2);
                    }
                };
                coroutineContext.plus(c1838690xwp);
                coroutineContext = c1838690xwp;
            }
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
            if (lifecycleOwner != null && lifecycleOwner.getLifecycle() != null) {
                lifecycle = lifecycleOwner.getLifecycle();
                if (lifecycle != null && (lifecycle instanceof AbstractC1563340qmi)) {
                    AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) lifecycle;
                    EnumC682280QpW enumC682280QpW = EnumC682280QpW.ADD_OBSERVER;
                    if (abstractC1563340qmi.LJI(enumC682280QpW)) {
                        Object obj = abstractC1563340qmi.LL;
                        if ((obj instanceof C199Y) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), (context = (Context) obj))) != null) {
                            C13Y1 c13y1LIZIZ = m5.LIZIZ(view, coroutineContext, lifecycle);
                            C1565730qqZ.LIZIZ(numLIZ.intValue(), context);
                            return c13y1LIZIZ;
                        }
                    }
                }
            } else {
                lifecycle = null;
            }
            return m5.LIZIZ(view, coroutineContext, lifecycle);
        }
    };
}
