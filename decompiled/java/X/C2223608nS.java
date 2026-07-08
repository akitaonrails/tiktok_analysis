package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08nS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editSticker.effectPlatform.EffectExtKt$unzipEffectRes$2", f = "EffectExt.kt", l = {}, m = "invokeSuspend")
public final class C2223608nS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Effect LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2223608nS(Effect effect, InterfaceC1364105Vn<? super C2223608nS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2223608nS(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("EffectExtKt@d63.unzipEffectRes$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Unit unit2 = null;
        try {
            C0VSJ c0vsj = new C0VSJ(this.LL.getZipPath());
            try {
                try {
                    FileUtils fileUtils = FileUtils.INSTANCE;
                    fileUtils.removeDir(this.LL.getUnzipPath());
                    fileUtils.unZip(this.LL.getZipPath(), this.LL.getUnzipPath());
                    unit = Unit.LIZ;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C122D c122dLIZIZ = C123O.LIZIZ();
                    if (c122dLIZIZ != null) {
                        c122dLIZIZ.LIZ(Log.getStackTraceString(e));
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                }
                c0vsj.delete();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c0vsj.delete();
                throw th;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C122D c122dLIZIZ2 = C123O.LIZIZ();
            if (c122dLIZIZ2 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("EffectExt unzipEffectRes, effect id : ");
                sbLIZ.append(this.LL.getEffectId());
                sbLIZ.append(" , exception : ");
                sbLIZ.append(Log.getStackTraceString(e2));
                c122dLIZIZ2.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                unit2 = Unit.LIZ;
            }
            unit = unit2;
        }
        C1C7U.LIZIZ("EffectExtKt@d63.unzipEffectRes$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
