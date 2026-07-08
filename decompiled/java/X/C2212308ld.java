package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IMVoiceMessageUtil;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.IMVoiceMessageUtil$downloadAudio$downloadId$1$onSuccessed$1", f = "IMVoiceMessageUtil.kt", l = {348}, m = "invokeSuspend")
public final class C2212308ld extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ File LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2212308ld(Context context, File file, InterfaceC1364105Vn<? super C2212308ld> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = context;
        this.LLILZ = file;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2212308ld c2212308ld = new C2212308ld(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c2212308ld.LLILLJJLI = obj;
        return c2212308ld;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Unit unit;
        C1C7U.LIZ("IMVoiceMessageUtil@2fc5.downloadAudio$downloadId$1$onSuccessed$1");
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
            try {
                c098200Yq = C2286608xc.LJFF(this.LLILZ.length());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                c098200Yq = C2286608xc.LJFF(0L);
            }
            long jLongValue = ((Number) c098200Yq).longValue();
            IMVoiceMessageUtil iMVoiceMessageUtil = IMVoiceMessageUtil.LIZ;
            Context context = this.LLILLL;
            this.LL = 1;
            iMVoiceMessageUtil.getClass();
            C0VSJ c0vsjLJI = IMVoiceMessageUtil.LJI(context);
            synchronized (iMVoiceMessageUtil) {
                try {
                    if (IMVoiceMessageUtil.LJFF < 0) {
                        IMVoiceMessageUtil.LJFF = IMVoiceMessageUtil.LIZJ(c0vsjLJI);
                    }
                    IMVoiceMessageUtil.LJFF += jLongValue;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jIntValue = ((long) ((Number) C04V8.LIZ.getValue()).intValue()) * 1024 * 1024;
            if (jCurrentTimeMillis - IMVoiceMessageUtil.LJI < 15000 || IMVoiceMessageUtil.LJFF <= jIntValue) {
                unit = Unit.LIZ;
            } else {
                AtomicBoolean atomicBoolean = IMVoiceMessageUtil.LJII;
                if (!atomicBoolean.compareAndSet(false, true)) {
                    unit = Unit.LIZ;
                } else {
                    try {
                        iMVoiceMessageUtil.LJIILJJIL(context);
                        IMVoiceMessageUtil.LJI = System.currentTimeMillis();
                        atomicBoolean.set(false);
                        unit = Unit.LIZ;
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        IMVoiceMessageUtil.LJI = System.currentTimeMillis();
                        IMVoiceMessageUtil.LJII.set(false);
                        throw th3;
                    }
                }
            }
            if (unit == objLJFF) {
                C1C7U.LIZIZ("IMVoiceMessageUtil@2fc5.downloadAudio$downloadId$1$onSuccessed$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMVoiceMessageUtil@2fc5.downloadAudio$downloadId$1$onSuccessed$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
