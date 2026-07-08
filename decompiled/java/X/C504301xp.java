package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01xp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController$resizeImages$1$1", f = "VideoImageMixedController.kt", l = {}, m = "invokeSuspend")
public final class C504301xp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoImageMixedController LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504301xp(VideoImageMixedController videoImageMixedController, InterfaceC1364105Vn<? super C504301xp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoImageMixedController;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C504301xp(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        Activity activityLIZ;
        C1C7U.LIZ("VideoImageMixedController@1fe.resizeImages$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C528030KnJ c528030KnJ = this.LL.LLJJJJJIL;
        if (c528030KnJ != null && (context = c528030KnJ.getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            VideoImageMixedController videoImageMixedController = this.LL;
            if (videoImageMixedController.LLLZIL) {
                SafeHandler safeHandler = videoImageMixedController.LLLLZLL;
                if (safeHandler != null) {
                    Boolean.valueOf(safeHandler.postDelayed(new RunnableC514501zT(videoImageMixedController, activityLIZ, 10), ((Number) C504401xq.LIZ.getValue()).longValue()));
                }
            } else {
                videoImageMixedController.LJLJJI(activityLIZ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoImageMixedController@1fe.resizeImages$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
