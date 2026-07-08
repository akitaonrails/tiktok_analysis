package X;

import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RW1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RW1 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ VideoTagContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RW1(VideoTagContainer videoTagContainer) {
        super(0);
        this.LL = videoTagContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        if (!AwemeBizExtKt.getReplaceRecTagByRepost(((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme())) {
            if (this.LL.Fp()) {
                Iterator<Map.Entry<String, InterfaceC697230RWn>> it2 = this.LL.Bp().LIZIZ().entrySet().iterator();
                while (it2.hasNext()) {
                    it2.next().getValue().wa(false);
                }
                if (C0B8S.LIZ() || !this.LL.LLJLL.get()) {
                    this.LL.sp();
                } else {
                    this.LL.LLJLLIL = true;
                }
            } else {
                this.LL.sp();
            }
            Handler handlerLIZIZ = C799570VYd.LIZIZ();
            final VideoTagContainer videoTagContainer = this.LL;
            C786410Ut5.LJL(handlerLIZIZ, new Runnable() { // from class: X.0R7K
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("VideoTagContainer@f103.selectSubscribeViewModel$1$1");
                    try {
                        try {
                            C0RZW.LIZ(((VideoItemParams) C631370Opb.LIZ(videoTagContainer)).getAweme(), ((VideoItemParams) C631370Opb.LIZ(videoTagContainer)).mEventType);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1AF0.LJ(e);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("VideoTagContainer@f103.selectSubscribeViewModel$1$1");
                }
            });
        }
        return Unit.LIZ;
    }
}
