package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15bq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponent$onRenderFirstFrameEvent$1", f = "CellAdaptionComponent.kt", l = {184}, m = "invokeSuspend")
public final class C20554415bq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CellAdaptionComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20554415bq(CellAdaptionComponent cellAdaptionComponent, InterfaceC1364105Vn<? super C20554415bq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = cellAdaptionComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20554415bq(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        View videoView;
        C1C7U.LIZ("CellAdaptionComponent@341f.onRenderFirstFrameEvent$1");
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
            C20562915dD c20562915dD = C20562915dD.LIZ;
            CellAdaptionComponent cellAdaptionComponent = this.LLILLJJLI;
            FrameLayout frameLayout = cellAdaptionComponent.LLLIIIIL;
            IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) cellAdaptionComponent.LLLFZ.getValue();
            if (iVideoCellAbility != null) {
                videoView = iVideoCellAbility.getVideoView();
            } else {
                videoView = null;
            }
            Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(this.LLILLJJLI)).getAweme();
            CellAdaptionComponent cellAdaptionComponent2 = this.LLILLJJLI;
            int i2 = cellAdaptionComponent2.LLLIL;
            int i3 = cellAdaptionComponent2.LLLILZ;
            this.LL = 1;
            c20562915dD.getClass();
            if (C20562915dD.LIZ(frameLayout, videoView, aweme, i2, i3, true, true, null, null, -1, 0) == objLJFF) {
                C1C7U.LIZIZ("CellAdaptionComponent@341f.onRenderFirstFrameEvent$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CellAdaptionComponent@341f.onRenderFirstFrameEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
