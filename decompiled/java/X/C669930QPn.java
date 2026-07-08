package X;

import android.view.View;
import android.view.Window;
import com.ss.android.ugc.aweme.search.middle.assem.BaseKeyboardMonitorAssem;
import com.ss.android.ugc.aweme.search.middle.assem.KeyboardMonitorForFEAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.middle.assem.KeyboardMonitorForFEAssem$initChecker$1", f = "KeyboardMonitorForFEAssem.kt", l = {63}, m = "invokeSuspend")
public final class C669930QPn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ KeyboardMonitorForFEAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C669930QPn(KeyboardMonitorForFEAssem keyboardMonitorForFEAssem, InterfaceC1364105Vn<? super C669930QPn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = keyboardMonitorForFEAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C669930QPn(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Window window;
        View decorView;
        C1C7U.LIZ("KeyboardMonitorForFEAssem@2608.initChecker$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("KeyboardMonitorForFEAssem@2608.initChecker$1");
                return objLJFF;
            }
        }
        KeyboardMonitorForFEAssem keyboardMonitorForFEAssem = this.LLILLJJLI;
        if (keyboardMonitorForFEAssem.LLILZLL == null) {
            keyboardMonitorForFEAssem.LLILZLL = false;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BaseKeyboardMonitorAssem.LLILZ;
            C19EG c19egLIZ = C724240Sb0.LIZ(this.LLILLJJLI);
            if (c19egLIZ != null && (window = c19egLIZ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                KeyboardMonitorForFEAssem keyboardMonitorForFEAssem2 = this.LLILLJJLI;
                if (C18008073m.LIZ() == 3) {
                    keyboardMonitorForFEAssem2.getClass();
                    C20246014Ju c20246014JuLIZ = C14K4.LIZ(decorView);
                    if (c20246014JuLIZ != null) {
                        boolean zLJIIIIZZ = c20246014JuLIZ.LJIIIIZZ(8);
                        int i2 = c20246014JuLIZ.LIZ(8).LIZLLL;
                        if (zLJIIIIZZ) {
                            C948503nH.LJ(keyboardMonitorForFEAssem2, C0PEM.LIZ, new C669940QPo(keyboardMonitorForFEAssem2, true, Integer.valueOf(i2), null));
                        } else {
                            C948503nH.LJ(keyboardMonitorForFEAssem2, C0PEM.LIZ, new C669940QPo(keyboardMonitorForFEAssem2, false, null, null));
                        }
                    }
                    BaseKeyboardMonitorAssem.m309do(EnumC669960QPq.INIT_NOT_SENT);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KeyboardMonitorForFEAssem@2608.initChecker$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
