package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.render.AudienceDecorationRenderAssem;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.BoardItemPosition;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0fuJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145210fuJ extends C09AY implements Function2<UIAssem, C291001Au<? extends Board>, Unit> {
    public final /* synthetic */ AudienceDecorationRenderAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1145210fuJ(AudienceDecorationRenderAssem audienceDecorationRenderAssem) {
        super(2);
        this.LL = audienceDecorationRenderAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Board> c291001Au) {
        Board board;
        C291001Au<? extends Board> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (board = (Board) c291001Au2.LIZ) != null) {
            AudienceDecorationRenderAssem audienceDecorationRenderAssem = this.LL;
            for (BoardItem boardItem : board.boardItemList) {
                ViewGroup viewGroup = (ViewGroup) audienceDecorationRenderAssem.LLJI.getValue();
                viewGroup.getClass();
                try {
                    int childCount = viewGroup.getChildCount();
                    int i = 0;
                    while (true) {
                        if (i < childCount) {
                            View childAt = viewGroup.getChildAt(i);
                            if (childAt instanceof C1092220eWq) {
                                Long contentId = ((C1092220eWq) childAt).getContentId();
                                long j = boardItem.id;
                                if (contentId != null && contentId.longValue() == j) {
                                    BoardItemPosition boardItemPositionLIZJ = C488201vE.LIZJ(boardItem, C488601vI.LIZ());
                                    if (boardItemPositionLIZJ != null) {
                                        Pair pairLIZ = C488701vJ.LIZ(boardItemPositionLIZJ, ((C1092220eWq) childAt).getWidth(), ((C1092220eWq) childAt).getHeight());
                                        float fFloatValue = ((Number) pairLIZ.getFirst()).floatValue();
                                        float fFloatValue2 = ((Number) pairLIZ.getSecond()).floatValue();
                                        float width = (((C1092220eWq) childAt).getWidth() / 2.0f) * (((C1092220eWq) childAt).getScaleX() - 1.0f);
                                        float height = (((C1092220eWq) childAt).getHeight() / 2.0f) * (((C1092220eWq) childAt).getScaleY() - 1.0f);
                                        C1092220eWq c1092220eWq = (C1092220eWq) childAt;
                                        c1092220eWq.getClass();
                                        HandlerHook.viewPost(c1092220eWq, new RunnableC1092230eWr(fFloatValue + width, c1092220eWq, false, fFloatValue2 + height, null));
                                    }
                                }
                            }
                            i++;
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LIZIZ("stephen.choo DEBUGBOARD", e.toString());
                }
            }
        }
        return Unit.LIZ;
    }
}
