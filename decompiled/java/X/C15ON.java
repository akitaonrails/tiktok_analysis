package X;

import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import v7.o;

/* JADX INFO: renamed from: X.15ON, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15ON extends SimpleServiceLoadCallback {
    public final /* synthetic */ o LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ C15OG LIZJ;

    @Override // com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
        if (this.LIZJ.LJIL != null) {
            new C11BY().LJIIL(System.currentTimeMillis() - this.LIZIZ, false);
        }
        this.LIZJ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        Video video = this.LIZJ.LJIILL.getVideo();
        if (video == null) {
            this.LIZ.LJ(null);
            if (this.LIZJ.LJIL != null) {
                new C11BY().LJIIL(System.currentTimeMillis() - this.LIZIZ, false);
                return;
            }
            return;
        }
        IRecordService iRecordServiceRecordService = asyncAVService.uiService().recordService();
        int width = video.getWidth();
        int height = video.getHeight();
        final o oVar = this.LIZ;
        final long j2 = this.LIZIZ;
        iRecordServiceRecordService.preloadDuetLayout(width, height, new Function1() { // from class: X.15OP
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C15ON c15on = this.LL;
                o oVar2 = oVar;
                long j3 = j2;
                c15on.LIZJ.LJI = (Effect) obj;
                oVar2.LJ(null);
                if (c15on.LIZJ.LJIL != null) {
                    new C11BY().LJIIL(System.currentTimeMillis() - j3, true);
                }
                return Unit.LIZ;
            }
        });
    }

    public C15ON(C15OG c15og, o oVar, long j) {
        this.LIZJ = c15og;
        this.LIZ = oVar;
        this.LIZIZ = j;
    }
}
