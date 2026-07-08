package X;

import android.view.Choreographer;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RhR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.componentmanager.metric.slot.exposure.FcpNodeExposureDetector$startDeferCheckExposureJob$1$2", f = "FcpNodeExposureDetector.kt", l = {45}, m = "invokeSuspend")
public final class C702750RhR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C700470Rdl LLILLJJLI;
    public final /* synthetic */ LifecycleOwner LLILLL;
    public final /* synthetic */ C699090RbX<? extends ComponentPriorityProtocol> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C702750RhR(C700470Rdl c700470Rdl, LifecycleOwner lifecycleOwner, C699090RbX<? extends ComponentPriorityProtocol> c699090RbX, boolean z, String str, String str2, InterfaceC1364105Vn<? super C702750RhR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c700470Rdl;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = c699090RbX;
        this.LLILZIL = z;
        this.LLILZLL = str;
        this.LLIZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C702750RhR(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0OUz, android.view.Choreographer$FrameCallback] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FcpNodeExposureDetector@7512.startDeferCheckExposureJob$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C700470Rdl c700470Rdl = this.LLILLJJLI;
            this.LL = 1;
            c700470Rdl.getClass();
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            final C118300cf c118300cf = new C118300cf();
            ?? r1 = new Choreographer.FrameCallback() { // from class: X.0OUz
                public final /* synthetic */ int LLILLJJLI = 20;

                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    C118300cf c118300cf2 = c118300cf;
                    int i2 = c118300cf2.element + 1;
                    c118300cf2.element = i2;
                    if (i2 >= this.LLILLJJLI) {
                        C786410Ut5.v2().removeFrameCallback(this);
                        InterfaceC20236714Gf<Unit> interfaceC20236714Gf = c2252611DEt;
                        Unit unit = Unit.LIZ;
                        C189200o6.m2constructorimpl(unit);
                        interfaceC20236714Gf.resumeWith(unit);
                        return;
                    }
                    C786410Ut5.v2().postFrameCallback(this);
                }
            };
            C786410Ut5.v2().postFrameCallback(r1);
            c2252611DEt.LJJII(new C0OV0(r1));
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ != C099R.LJFF()) {
                objLJIJ = Unit.LIZ;
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("FcpNodeExposureDetector@7512.startDeferCheckExposureJob$1$2");
                return objLJFF;
            }
        }
        C700470Rdl c700470Rdl2 = this.LLILLJJLI;
        final LifecycleOwner lifecycleOwner = this.LLILLL;
        C699090RbX<? extends ComponentPriorityProtocol> c699090RbX = this.LLILZ;
        final T t = c699090RbX.LL;
        final C702700RhM c702700RhM = new C702700RhM(this.LLILZIL, this.LLILZLL, c699090RbX, this.LLIZ);
        c700470Rdl2.getClass();
        final View viewXb = t.xb();
        new Runnable() { // from class: X.0RhN
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                Function2<EnumC702720RhO, Boolean, Unit> function2;
                C1C7U.LIZ("FcpNodeExposureDetector@7512.isSlotPreciseExposure$visibilityConditionCheck$1");
                try {
                    if (!C699190Rbh.LIZ(lifecycleOwner, t) && (function2 = c702700RhM) != null) {
                        function2.invoke(EnumC702720RhO.VISIBLE, Boolean.FALSE);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FcpNodeExposureDetector@7512.isSlotPreciseExposure$visibilityConditionCheck$1");
            }
        }.run();
        new Runnable() { // from class: X.0RhQ
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                Function2<EnumC702720RhO, Boolean, Unit> function2;
                C1C7U.LIZ("FcpNodeExposureDetector@7512.isSlotPreciseExposure$alphaConditionCheck$1");
                try {
                    if (0.0f == viewXb.getAlpha() && (function2 = c702700RhM) != null) {
                        function2.invoke(EnumC702720RhO.ALPHA, Boolean.FALSE);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FcpNodeExposureDetector@7512.isSlotPreciseExposure$alphaConditionCheck$1");
            }
        }.run();
        new Runnable() { // from class: X.0RhP
            public final void LIZ() {
                int width = viewXb.getWidth();
                int height = viewXb.getHeight();
                if (width <= 0) {
                    Function2<EnumC702720RhO, Boolean, Unit> function2 = c702700RhM;
                    if (function2 != null) {
                        function2.invoke(EnumC702720RhO.MEASURE_WIDTH, Boolean.FALSE);
                        return;
                    }
                    return;
                }
                if (height <= 0) {
                    Function2<EnumC702720RhO, Boolean, Unit> function22 = c702700RhM;
                    if (function22 != null) {
                        function22.invoke(EnumC702720RhO.MEASURE_HEIGHT, Boolean.FALSE);
                        return;
                    }
                    return;
                }
                Function2<EnumC702720RhO, Boolean, Unit> function23 = c702700RhM;
                if (function23 != null) {
                    function23.invoke(EnumC702720RhO.AVAILABLE, Boolean.TRUE);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FcpNodeExposureDetector@7512.isSlotPreciseExposure$measureConditionCheck$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FcpNodeExposureDetector@7512.isSlotPreciseExposure$measureConditionCheck$1");
            }
        }.run();
        new C702770RhT(this.LLIZ, this.LLILZLL);
        C0T6L.LIZLLL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FcpNodeExposureDetector@7512.startDeferCheckExposureJob$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
