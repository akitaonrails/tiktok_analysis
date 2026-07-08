package X;

import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.screenadaption.adaptionparams.ScreenAdaptionResult;
import com.ss.android.ugc.aweme.videoadaption.adaptionhandler.FeedScreenContext;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15c9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2$onRenderFirstFrame$1", f = "FeedCellAdaptionComponentV2.kt", l = {378}, m = "invokeSuspend")
public final class C20556315c9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FeedCellAdaptionComponentV2 LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20556315c9(FeedCellAdaptionComponentV2 feedCellAdaptionComponentV2, C118300cf c118300cf, InterfaceC1364105Vn<? super C20556315c9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = feedCellAdaptionComponentV2;
        this.LLILLL = c118300cf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20556315c9(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ScreenAdaptionResult screenAdaptionResult;
        View videoView;
        C1C7U.LIZ("FeedCellAdaptionComponentV2@c76.onRenderFirstFrame$1");
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
            AbstractC20560715cr abstractC20560715crMp = this.LLILLJJLI.mp();
            if (abstractC20560715crMp != null && (screenAdaptionResult = (ScreenAdaptionResult) abstractC20560715crMp.LLILZ) != null) {
                C20562915dD c20562915dD = C20562915dD.LIZ;
                FeedCellAdaptionComponentV2 feedCellAdaptionComponentV2 = this.LLILLJJLI;
                LinearLayout linearLayout = feedCellAdaptionComponentV2.LLJZ;
                IVideoCellAbility iVideoCellAbilitySp = feedCellAdaptionComponentV2.sp();
                if (iVideoCellAbilitySp != null) {
                    videoView = iVideoCellAbilitySp.getVideoView();
                } else {
                    videoView = null;
                }
                Aweme awemeKp = this.LLILLJJLI.kp();
                if (awemeKp == null) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FeedCellAdaptionComponentV2@c76.onRenderFirstFrame$1");
                    return unit;
                }
                int topSpaceHeight = screenAdaptionResult.getTopSpaceHeight();
                int bottomSpaceHeight = screenAdaptionResult.getBottomSpaceHeight();
                VideoAdaptionResult videoAdaptionResultWB2 = this.LLILLJJLI.wB2();
                FeedCellAdaptionComponentV2 feedCellAdaptionComponentV22 = this.LLILLJJLI;
                FeedScreenContext feedScreenContext = feedCellAdaptionComponentV22.LLLILZJ;
                int i2 = this.LLILLL.element;
                int i3 = feedCellAdaptionComponentV22.LLLIIII;
                this.LL = 1;
                c20562915dD.getClass();
                if (C20562915dD.LIZ(linearLayout, videoView, awemeKp, topSpaceHeight, bottomSpaceHeight, true, true, videoAdaptionResultWB2, feedScreenContext, i2, i3) == objLJFF) {
                    C1C7U.LIZIZ("FeedCellAdaptionComponentV2@c76.onRenderFirstFrame$1");
                    return objLJFF;
                }
            } else {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("FeedCellAdaptionComponentV2@c76.onRenderFirstFrame$1");
                return unit2;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("FeedCellAdaptionComponentV2@c76.onRenderFirstFrame$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
