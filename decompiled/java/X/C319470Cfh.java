package X;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Cfh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.casting.api.CastingService$tryInstallPlugin$1", f = "CastingService.kt", l = {}, m = "invokeSuspend")
public final class C319470Cfh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C319470Cfh(InterfaceC1364105Vn<? super C319470Cfh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C319470Cfh(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CastingService@1602.tryInstallPlugin$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2110408Oo.LIZ.getClass();
        if (((Boolean) C2110408Oo.LJFF.getValue()).booleanValue()) {
            final Function1 function1 = null;
            if (C2110408Oo.LIZIZ()) {
                C23250099c.LIZLLL((InterfaceC497601wk) C2110408Oo.LJ.getValue(), null, null, new C13077059v(null, null), 3);
            } else {
                InterfaceC842850X4p interfaceC842850X4p = new InterfaceC842850X4p() { // from class: X.059x
                    @Override // X.InterfaceC842850X4p
                    public final void LIZJ(String str, boolean z) {
                        C2110408Oo.LIZ.getClass();
                        if (C2110408Oo.LIZJ()) {
                            C23250099c.LIZLLL((InterfaceC497601wk) C2110408Oo.LJ.getValue(), null, null, new C13077059v(function1, null), 3);
                        }
                    }

                    @Override // X.InterfaceC842850X4p
                    public final void LIZ(int i, String str, boolean z) {
                        Function1<Boolean, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(Boolean.FALSE);
                        }
                    }
                };
                C844020X9c c844020X9c = new C844020X9c();
                c844020X9c.LIZ = "com.ss.android.ugc.aweme.cast";
                c844020X9c.LIZIZ = true;
                AnonymousClass1403 anonymousClass1403 = new AnonymousClass1403();
                anonymousClass1403.LIZ = false;
                anonymousClass1403.LJII = EnumC202055144f.KEEP;
                c844020X9c.LJ = new AnonymousClass1405(anonymousClass1403);
                c844020X9c.LIZLLL = interfaceC842850X4p;
                C202068144s c202068144s = new C202068144s(c844020X9c);
                IPluginService iPluginServiceLIZ = C2110408Oo.LIZ();
                if (iPluginServiceLIZ != null) {
                    iPluginServiceLIZ.LJJI(c202068144s);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CastingService@1602.tryInstallPlugin$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C319470Cfh(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
