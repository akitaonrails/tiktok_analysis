package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS372S0200000_6;
import njp.a;

/* JADX INFO: renamed from: X.0SdC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.popup.PopupWeaver$assembleTasks$1", f = "PopupWeaver.kt", l = {153, 155}, m = "invokeSuspend")
public final class C725600SdC extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C725580SdA LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C725600SdC(C725580SdA c725580SdA, InterfaceC1364105Vn<? super C725600SdC> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c725580SdA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C725600SdC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PopupWeaver@4083.assembleTasks$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PopupWeaver@4083.assembleTasks$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("PopupWeaver@4083.assembleTasks$1");
                return objLJFF;
            }
        }
        if (!C725580SdA.LJIIJ.getValue().getBoolean("private_like_tip_shown", false)) {
            C725580SdA c725580SdA = this.LLILLJJLI;
            final View viewFindViewById = c725580SdA.LIZJ.findViewById(R.id.ftz);
            AbstractC725620SdE abstractC725620SdE = new AbstractC725620SdE(viewFindViewById) { // from class: X.0SdF
                public C0P0T LLILZIL;
                public final WeakReference<View> LLILZLL;

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return 7001;
                }

                @Override // X.AbstractC725620SdE
                public final void LJIIL() {
                    C0P0T c0p0t = this.LLILZIL;
                    this.LLILZIL = null;
                    if (c0p0t != null) {
                        c0p0t.dismiss();
                    }
                }

                {
                    super("private_like");
                    this.LLILZLL = new WeakReference<>(viewFindViewById);
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
                    if (c19egLIZIZ == null) {
                        c20656615sK.LIZIZ();
                        return;
                    }
                    C0P0T c0p0t = (C0P0T) C2101808Lg.LIZ(this.LLILZLL, new AwS372S0200000_6(c19egLIZIZ, c20656615sK, 52));
                    if (c0p0t == null) {
                        c20656615sK.LIZIZ();
                    } else {
                        this.LLILZIL = c0p0t;
                    }
                }
            };
            C725700SdM c725700SdM = new C725700SdM("private_like_tip_shown");
            this.LL = 2;
            if (C725580SdA.LJFF(c725580SdA, abstractC725620SdE, c725700SdM, this) == objLJFF) {
                C1C7U.LIZIZ("PopupWeaver@4083.assembleTasks$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PopupWeaver@4083.assembleTasks$1");
        return unit2;
    }
}
