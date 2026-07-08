package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0UNg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C771260UNg implements IEffectPlatformBaseListener<List<? extends LiveEffect>> {
    public final /* synthetic */ C950690aqZ LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ Function2<List<C950750aqf>, Boolean, Unit> LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess(java.util.List<? extends com.bytedance.android.livesdkapi.depend.model.LiveEffect> r8) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C771260UNg.onSuccess(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C771260UNg(C950690aqZ c950690aqZ, long j, Function2<? super List<C950750aqf>, ? super Boolean, Unit> function2) {
        this.LIZ = c950690aqZ;
        this.LIZIZ = j;
        this.LIZJ = function2;
    }
}
