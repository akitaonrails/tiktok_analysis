package X;

import com.ss.android.ugc.aweme.inbox.cache.PreloadManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uKt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1699850uKt extends C09AY implements Function0<Unit> {
    public C1699850uKt() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BootFinishCallBack - delay ");
        long j = PreloadManager.LJI;
        sbLIZ.append(j);
        sbLIZ.append(" ms");
        C1720106oR.LJI("PreloadManager", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJLIIL(j, PreloadManager.LJ, new Runnable() { // from class: X.0uKs
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PreloadManager@c224.onApplicationCreate$1$1");
                try {
                    PreloadManager.LJFF.set(true);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PreloadManager@c224.onApplicationCreate$1$1");
            }
        });
        return Unit.LIZ;
    }
}
