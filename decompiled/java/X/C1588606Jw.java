package X;

import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06Jw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1588606Jw extends C09AY implements Function0<Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ InterfaceC497601wk LLILLJJLI;
    public final /* synthetic */ C05P0<Boolean> LLILLL;
    public final /* synthetic */ List<C1675800ti6> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILZLL;
    public final /* synthetic */ List<C1677480tko<Float, C1677280tkU>> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1588606Jw(View view, InterfaceC497601wk interfaceC497601wk, C05P0<Boolean> c05p0, List<C1675800ti6> list, Function0<Unit> function0, C1677480tko<Float, C1677280tkU> c1677480tko, List<C1677480tko<Float, C1677280tkU>> list2) {
        super(0);
        this.LL = view;
        this.LLILLJJLI = interfaceC497601wk;
        this.LLILLL = c05p0;
        this.LLILZ = list;
        this.LLILZIL = function0;
        this.LLILZLL = c1677480tko;
        this.LLIZ = list2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[PHI: r2
      0x004b: PHI (r2v3 android.view.ViewGroup) = (r2v1 android.view.ViewGroup), (r2v6 android.view.ViewGroup) binds: [B:11:0x0033, B:7:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke() {
        /*
            r8 = this;
            X.05P0<java.lang.Boolean> r0 = r8.LLILLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L48
            X.05P0<java.lang.Boolean> r1 = r8.LLILLL
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setValue(r0)
            android.view.View r4 = r8.LL
            android.view.View r1 = r4.getRootView()
            r7 = 0
            if (r1 == 0) goto L29
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r1.findViewById(r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L4b
        L29:
            android.view.View r2 = r4.getRootView()
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L35
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L4b
        L35:
            X.01wk r1 = r8.LLILLJJLI
            X.05Sj r2 = new X.05Sj
            java.util.List<X.0ti6> r3 = r8.LLILZ
            kotlin.jvm.functions.Function0<kotlin.Unit> r4 = r8.LLILZIL
            X.0tko<java.lang.Float, X.0tkU> r5 = r8.LLILZLL
            java.util.List<X.0tko<java.lang.Float, X.0tkU>> r6 = r8.LLIZ
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 3
            X.C23250099c.LIZLLL(r1, r7, r7, r2, r0)
        L48:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4b:
            java.lang.String r1 = "thought_entrance_touch_gate"
            android.view.View r0 = r2.findViewWithTag(r1)
            if (r0 != 0) goto L35
            android.view.View r3 = new android.view.View
            android.content.Context r0 = r4.getContext()
            r3.<init>(r0)
            r3.setTag(r1)
            r0 = 1
            r3.setClickable(r0)
            X.06Jx r0 = new android.view.View.OnTouchListener() { // from class: X.06Jx
                static {
                    /*
                        X.06Jx r0 = new X.06Jx
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.06Jx) X.06Jx.LL X.06Jx
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC1588706Jx.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC1588706Jx.<init>():void");
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View r2, android.view.MotionEvent r3) {
                    /*
                        r1 = this;
                        r0 = 1
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC1588706Jx.onTouch(android.view.View, android.view.MotionEvent):boolean");
                }
            }
            r3.setOnTouchListener(r0)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r0 = -1
            r1.<init>(r0, r0)
            X.C786410Ut5.W5(r3, r1)
            r2.addView(r3)
            Y.ARunnableS101S0100000_1 r2 = new Y.ARunnableS101S0100000_1
            r0 = 58
            r2.<init>(r3, r0)
            r0 = 600(0x258, double:2.964E-321)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPostDelay(r3, r2, r0)
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1588606Jw.invoke():java.lang.Object");
    }
}
