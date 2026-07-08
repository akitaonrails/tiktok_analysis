package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Mw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.screenshot.ScreenShotEventDispatcher$handleScreenShot$1", f = "ScreenShotEventDispatcher.kt", l = {}, m = "invokeSuspend")
public final class C2360809Mw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2360809Mw(String str, InterfaceC1364105Vn<? super C2360809Mw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2360809Mw(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        AbstractC2361009My abstractC2361009My;
        C1C7U.LIZ("ScreenShotEventDispatcher@c22a.handleScreenShot$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C013C c013c = new C013C();
        C2360909Mx c2360909Mx = C2360909Mx.LIZ;
        String str = this.LL;
        c2360909Mx.getClass();
        C20343314it c20343314it = C20343314it.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("callback path: ");
        C20577084h c20577084h = C2360909Mx.LIZLLL;
        sbLIZ.append(c20577084h.size());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c20343314it.getClass();
        C20343314it.LIZ(strLIZIZ);
        if (!c20577084h.containsKey(str)) {
            c20577084h.put(str, Long.valueOf(System.currentTimeMillis()));
            Reference<AbstractC2361009My> reference = C2360909Mx.LJ;
            if (reference != null && (abstractC2361009My = reference.get()) != null) {
                c013c.element = abstractC2361009My.onShot(this.LL);
            }
            C2360909Mx.LIZIZ(true);
            Set<WeakReference<AbstractC2361009My>> set = C2360909Mx.LJFF;
            String str2 = this.LL;
            Iterator<WeakReference<AbstractC2361009My>> it2 = set.iterator();
            while (it2.hasNext()) {
                AbstractC2361009My abstractC2361009My2 = it2.next().get();
                if (abstractC2361009My2 != null) {
                    C20343314it c20343314it2 = C20343314it.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("image is screen shot, screenShotListenerRefs element = ");
                    sbLIZ2.append(abstractC2361009My2);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c20343314it2.getClass();
                    C20343314it.LIZ(strLIZIZ2);
                    if (abstractC2361009My2.getNeedDispatchIfHandledAlready() || !c013c.element) {
                        if (!abstractC2361009My2.onShot(str2) && !c013c.element) {
                            z = false;
                        } else {
                            z = true;
                        }
                        c013c.element = z;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScreenShotEventDispatcher@c22a.handleScreenShot$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
