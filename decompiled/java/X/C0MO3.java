package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasGestureConfig;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MO3, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.composer.InstantCloneParser$prepareCanvasVideoData$1", f = "InstantCloneParser.kt", l = {}, m = "invokeSuspend")
public final class C0MO3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ CreativeInfo LLILLJJLI;
    public final /* synthetic */ InterfaceC1364105Vn<Pair<CanvasVideoData, String>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0MO3(Context context, CreativeInfo creativeInfo, InterfaceC1364105Vn<? super Pair<CanvasVideoData, String>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C0MO3> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LL = context;
        this.LLILLJJLI = creativeInfo;
        this.LLILLL = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MO3(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InstantCloneParser@3cac.prepareCanvasVideoData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C197010126e c197010126e = C197010126e.LIZ;
        Context context = this.LL;
        CreativeInfo creativeInfo = this.LLILLJJLI;
        c197010126e.getClass();
        String strLJFF = C197010126e.LJFF(context, creativeInfo);
        String strLJ = C197010126e.LJ(this.LL, this.LLILLJJLI);
        CanvasBackground.Companion.getClass();
        CanvasBackground canvasBackground = new CanvasBackground(3);
        canvasBackground.setFilePath(strLJ);
        CanvasVideoData canvasVideoData = new CanvasVideoData(C1697810uHb.LJIILJJIL(strLJFF), C1697810uHb.LJIILJJIL(strLJFF), canvasBackground, null, null, 0, null, 0, null, null, null, null, 4088, null);
        InterfaceC1364105Vn<Pair<CanvasVideoData, String>> interfaceC1364105Vn = this.LLILLL;
        canvasVideoData.setExtra(new CanvasExtra(0, 0, 0, 0, LivePreCreateNextRoomPlayer.ENABLE, 0.15f, 20.0f, false, new CanvasGestureConfig(true, true, true, true, false, 2, false, false, false), new ForwardCanvasExtra(7, 0, null, -1, false, null, null, null, -12.0f, null, null, 8, false, 1), 1.0f, 0L, 0));
        Pair pair = new Pair(canvasVideoData, strLJFF);
        C189200o6.m2constructorimpl(pair);
        interfaceC1364105Vn.resumeWith(pair);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InstantCloneParser@3cac.prepareCanvasVideoData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
