package X;

import X.C128Y;
import X.C2021107vt;
import X.C724710Sbl;
import X.InterfaceC723730SaB;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.Assembler;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08C1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08C1 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ C724710Sbl LLILLJJLI;
    public final /* synthetic */ Assembler LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08C1(Fragment fragment, C724710Sbl c724710Sbl, Assembler assembler) {
        super(0);
        this.LL = fragment;
        this.LLILLJJLI = c724710Sbl;
        this.LLILLL = assembler;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Lifecycle lifecycle = this.LL.getLifecycle();
        final Fragment fragment = this.LL;
        final C724710Sbl c724710Sbl = this.LLILLJJLI;
        final Assembler assembler = this.LLILLL;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.assem.arch.extensions.assemble.FragmentAssembleExtKt$fragmentAssembleInit$serviceStore$1$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (C2021107vt.LIZ[event.ordinal()] == 1) {
                    C128Y c128y = fragment;
                    if (c128y instanceof InterfaceC723730SaB) {
                        C724710Sbl c724710Sbl2 = c724710Sbl;
                        InterfaceC723730SaB interfaceC723730SaB = (InterfaceC723730SaB) c128y;
                        Class<?> superclass = interfaceC723730SaB.getClass();
                        Class<?>[] interfaces = superclass.getInterfaces();
                        if (interfaces != null && interfaces.length != 0) {
                            while (superclass != Object.class) {
                                Class<?>[] interfaces2 = superclass.getInterfaces();
                                ArrayList arrayList = new ArrayList();
                                for (Class<?> cls : interfaces2) {
                                    if (InterfaceC723730SaB.class.isAssignableFrom(cls)) {
                                        arrayList.add(cls);
                                    }
                                }
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    c724710Sbl2.LJ((Class) it2.next(), interfaceC723730SaB);
                                }
                                superclass = superclass.getSuperclass();
                                if (superclass == null) {
                                    break;
                                }
                            }
                        }
                    }
                    assembler.xQ2(fragment);
                }
            }
        });
        return Unit.LIZ;
    }
}
