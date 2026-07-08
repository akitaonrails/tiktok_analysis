package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.08nT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editSticker.effectPlatform.EffectExtKt$isUnzipEffectResExistAsync$2", f = "EffectExt.kt", l = {}, m = "invokeSuspend")
public final class C2223708nT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ Effect LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2223708nT(Effect effect, InterfaceC1364105Vn<? super C2223708nT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2223708nT(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        File[] fileArrListFiles;
        String name;
        C1C7U.LIZ("EffectExtKt@d63.isUnzipEffectResExistAsync$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C0VSJ c0vsj = new C0VSJ(this.LL.getUnzipPath());
            if (c0vsj.exists() && c0vsj.isDirectory() && (fileArrListFiles = c0vsj.listFiles()) != null) {
                for (File file : fileArrListFiles) {
                    if (file != null) {
                        name = file.getName();
                    } else {
                        name = null;
                    }
                    if (Intrinsics.LJFF(name, "config.json")) {
                        C1C7U.LIZIZ("EffectExtKt@d63.isUnzipEffectResExistAsync$2");
                        return true;
                    }
                }
            }
            C1C7U.LIZIZ("EffectExtKt@d63.isUnzipEffectResExistAsync$2");
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C122D c122dLIZIZ = C123O.LIZIZ();
            if (c122dLIZIZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("EffectExt isUnzipEffectResExistAsync, effect id : ");
                sbLIZ.append(this.LL.getEffectId());
                sbLIZ.append(" , exception : ");
                sbLIZ.append(Log.getStackTraceString(e));
                c122dLIZIZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
            C1C7U.LIZIZ("EffectExtKt@d63.isUnzipEffectResExistAsync$2");
            return false;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
