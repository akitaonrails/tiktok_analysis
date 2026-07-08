package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS179S0101000_19;
import kotlin.jvm.internal.AwS639S0100000_25;
import njp.a;

/* JADX INFO: renamed from: X.0sTy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.view.RecordComposeButtonScene$onCreateView$2$1", f = "RecordComposeButtonScene.kt", l = {}, m = "invokeSuspend")
public final class C1628600sTy extends C09AX implements Function2<InterfaceC1157420gE0, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ FrameLayout LLILLJJLI;
    public final /* synthetic */ C1664860tQS LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1628600sTy(Context context, FrameLayout frameLayout, C1664860tQS c1664860tQS, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = frameLayout;
        this.LLILLL = c1664860tQS;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1628600sTy c1628600sTy = new C1628600sTy(this.LLILZ, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1628600sTy.LL = obj;
        return c1628600sTy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0iSN, android.view.View] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordComposeButtonScene@29a4.onCreateView$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        if ((obj2 instanceof C1157400gDy) || (obj2 instanceof C1157410gDz)) {
            C1630550sX7.LIZ(this.LLILLJJLI, this.LLILLL.LLJIJIL.findViewById(R.id.vvc));
            if (this.LLILLJJLI.getChildAt(0) == null) {
                C1664860tQS c1664860tQS = this.LLILLL;
                Context context = this.LLILZ;
                c1664860tQS.getClass();
                ?? r4 = new AbstractC20085213iM(context) { // from class: X.0iSN
                    public final C05P0<Function2<InterfaceC1680500tpg, Integer, Unit>> LLJ = C20028913Yh.LJI(null);

                    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
                    }

                    @Override // X.AbstractC20085213iM
                    public boolean getShouldCreateCompositionOnAttachedToWindow() {
                        return false;
                    }

                    @Override // android.view.ViewGroup, android.view.View
                    public CharSequence getAccessibilityClassName() {
                        return C1243210iSN.class.getName();
                    }

                    public final void setContent(Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2) {
                        ((C13FE) this.LLJ).setValue(function2);
                        if (isAttachedToWindow()) {
                            LIZJ();
                        }
                    }

                    @Override // X.AbstractC20085213iM
                    public final void LIZ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
                        int i2;
                        boolean zLJII;
                        int i3;
                        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1511077017);
                        if ((i & 6) == 0) {
                            if ((i & 8) == 0) {
                                zLJII = c13zcLJIIJ.LJJIIJ(this);
                            } else {
                                zLJII = c13zcLJIIJ.LJII(this);
                            }
                            if (zLJII) {
                                i3 = 4;
                            } else {
                                i3 = 2;
                            }
                            i2 = i3 | i;
                        } else {
                            i2 = i;
                        }
                        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
                            c13zcLJIIJ.LIZJ();
                        } else {
                            Function2 function2 = (Function2) ((C13FE) this.LLJ).getValue();
                            if (function2 != null) {
                                function2.invoke(c13zcLJIIJ, 0);
                            }
                        }
                        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
                        if (c20030013YsLJJJJZI != null) {
                            c20030013YsLJJJJZI.LIZLLL = new AwS179S0101000_19(this, i, 11);
                        }
                    }
                };
                r4.setContent(new C19719212De(-439329131, new AwS639S0100000_25(c1664860tQS, 85), true));
                this.LLILLJJLI.addView(r4);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordComposeButtonScene@29a4.onCreateView$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1157420gE0 interfaceC1157420gE0, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1157420gE0, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
