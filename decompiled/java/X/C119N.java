package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.119N, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.ve.handlers.DownloadEffectHandler$handleData$2$isSuccess$1", f = "DownloadEffectHandler.kt", l = {29}, m = "invokeSuspend")
public final class C119N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C119V>, Object> {
    public int LL;
    public final /* synthetic */ Effect LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119N(Effect effect, InterfaceC1364105Vn<? super C119N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C119N(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DownloadEffectHandler@c71f.handleData$2$isSuccess$1");
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
            C119W c119w = new Object() { // from class: X.119W
            };
            final Effect effect = this.LLILLJJLI;
            this.LL = 1;
            c119w.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            C2296208zA.LIZ().getClass();
            if (C2299808zk.LIZ(effect)) {
                C119V c119v = new C119V();
                c119v.LIZIZ = effect;
                c119v.LIZ = true;
                C189200o6.m2constructorimpl(c119v);
                c23260099m.resumeWith(c119v);
            } else {
                C2299808zk c2299808zkLIZ = C2296208zA.LIZ();
                C119U c119u = new C119U() { // from class: X.119Q
                    @Override // X.C119U
                    public final void LIZ(Effect effect2) {
                        String effectId;
                        if (effect2 != null) {
                            effectId = effect2.getEffectId();
                        } else {
                            effectId = null;
                        }
                        if (Intrinsics.LJFF(effectId, effect.getEffectId())) {
                            InterfaceC1364105Vn<C119V> interfaceC1364105Vn = c23260099m;
                            C119V c119v2 = new C119V();
                            c119v2.LIZIZ = effect2;
                            c119v2.LIZ = false;
                            C189200o6.m2constructorimpl(c119v2);
                            interfaceC1364105Vn.resumeWith(c119v2);
                        }
                    }

                    @Override // X.C119U
                    public final void onSuccess(Effect effect2) {
                        String effectId;
                        if (effect2 != null) {
                            effectId = effect2.getEffectId();
                        } else {
                            effectId = null;
                        }
                        if (Intrinsics.LJFF(effectId, effect.getEffectId())) {
                            InterfaceC1364105Vn<C119V> interfaceC1364105Vn = c23260099m;
                            C119V c119v2 = new C119V();
                            c119v2.LIZIZ = effect2;
                            c119v2.LIZ = true;
                            C189200o6.m2constructorimpl(c119v2);
                            interfaceC1364105Vn.resumeWith(c119v2);
                        }
                    }
                };
                c2299808zkLIZ.getClass();
                InterfaceC1635410sex interfaceC1635410sexLIZIZ = C2296208zA.LIZIZ();
                if (interfaceC1635410sexLIZIZ != null) {
                    interfaceC1635410sexLIZIZ.LIZJ(effect, new C1634530sdX(new C1634550sdZ("effect", new C19773712Yd(c119u, 1), false, null)));
                }
            }
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DownloadEffectHandler@c71f.handleData$2$isSuccess$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DownloadEffectHandler@c71f.handleData$2$isSuccess$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C119V> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
