package X;

import android.content.Context;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ceq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.effect.AiSelfShootingEffectsCenter$1", f = "AiSelfShootingEffectsCenter.kt", l = {138}, m = "invokeSuspend")
public final class C318940Ceq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C318940Ceq(InterfaceC1364105Vn<? super C318940Ceq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318940Ceq(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiSelfShootingEffectsCenter@764d.<init>$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252321DDq c2252321DDq = C1797450wsJ.LIZIZ;
            Object obj2 = new InterfaceC346701Wf() { // from class: X.0wsH
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj3, InterfaceC1364105Vn interfaceC1364105Vn) {
                    DialogC1390150mHN dialogC1390150mHN;
                    InterfaceC1776940wLE interfaceC1776940wLE = (InterfaceC1776940wLE) obj3;
                    if (interfaceC1776940wLE instanceof C1776930wLD) {
                        C1797450wsJ c1797450wsJ = C1797450wsJ.LIZ;
                        Effect effect = ((C1776930wLD) interfaceC1776940wLE).LIZ;
                        c1797450wsJ.getClass();
                        DialogC1390150mHN dialogC1390150mHN2 = C1797450wsJ.LIZJ;
                        if (dialogC1390150mHN2 != null && C1797450wsJ.LIZIZ(dialogC1390150mHN2.getContext(), dialogC1390150mHN2)) {
                            dialogC1390150mHN2.LJJLL(100.0f, false);
                            if (dialogC1390150mHN2.isShowing()) {
                                dialogC1390150mHN2.dismiss();
                                C785410UrT.LIZ(dialogC1390150mHN2);
                            }
                        }
                        C1797450wsJ.LIZJ = null;
                        Function1<? super Effect, Unit> function1 = C1797450wsJ.LJFF;
                        if (function1 != null) {
                            function1.invoke(effect);
                        }
                        C1797450wsJ.LJFF = null;
                        C1797450wsJ.LJ = null;
                    } else if (Intrinsics.LJFF(interfaceC1776940wLE, C1776950wLF.LIZ)) {
                        Function0<Unit> function0 = C1797450wsJ.LJ;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        C1797450wsJ.LJ = null;
                        C1797450wsJ.LJFF = null;
                        DialogC1390150mHN dialogC1390150mHN3 = C1797450wsJ.LIZJ;
                        if (dialogC1390150mHN3 != null) {
                            C1797450wsJ c1797450wsJ2 = C1797450wsJ.LIZ;
                            Context context = dialogC1390150mHN3.getContext();
                            c1797450wsJ2.getClass();
                            if (C1797450wsJ.LIZIZ(context, dialogC1390150mHN3)) {
                                dialogC1390150mHN3.dismiss();
                                C785410UrT.LIZ(dialogC1390150mHN3);
                            }
                        }
                        C1797450wsJ.LIZJ = null;
                    } else if (interfaceC1776940wLE instanceof C1776470wKT) {
                        DialogC1390150mHN dialogC1390150mHN4 = C1797450wsJ.LIZJ;
                        if (dialogC1390150mHN4 != null) {
                            C1797450wsJ c1797450wsJ3 = C1797450wsJ.LIZ;
                            Context context2 = dialogC1390150mHN4.getContext();
                            c1797450wsJ3.getClass();
                            if (C1797450wsJ.LIZIZ(context2, dialogC1390150mHN4) && (dialogC1390150mHN = C1797450wsJ.LIZJ) != null) {
                                dialogC1390150mHN.LJJLL(((C1776470wKT) interfaceC1776940wLE).LIZ, false);
                            }
                        }
                    } else if (interfaceC1776940wLE != null) {
                        throw new C1954807lC();
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c2252321DDq.collect(obj2, this) == objLJFF) {
                C1C7U.LIZIZ("AiSelfShootingEffectsCenter@764d.<init>$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C318940Ceq(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
