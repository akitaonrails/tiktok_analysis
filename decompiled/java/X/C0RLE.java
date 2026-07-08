package X;

import android.view.View;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import com.ss.android.ugc.feed.platform.cell.interact.right.InteractRightAreaComponent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RLE, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RLE extends C09AY implements Function2<InteractRightAreaComponent, C291001Au<? extends Integer>, Unit> {
    public final /* synthetic */ View LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RLE(View view) {
        super(2);
        this.LL = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InteractRightAreaComponent interactRightAreaComponent, C291001Au<? extends Integer> c291001Au) {
        String from;
        Object obj;
        int i;
        C2189821An6 c2189821An6;
        InteractRightAreaComponent interactRightAreaComponent2 = interactRightAreaComponent;
        C291001Au<? extends Integer> c291001Au2 = c291001Au;
        interactRightAreaComponent2.getClass();
        InteractAreaComponent.LLLLLLLLL.getClass();
        List<String> value = InteractAreaComponent.LLLLLLLZIL.getValue();
        BaseFeedPageParams baseFeedPageParams = interactRightAreaComponent2.jm().LJ;
        Object obj2 = null;
        if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
            from = c2189821An6.getFrom();
        } else {
            from = null;
        }
        if (C13LP.LJJJJ(from, value)) {
            View view = this.LL;
            C724270Sb3 c724270Sb3 = interactRightAreaComponent2.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (C718510SGj.LJ(((VideoItemParams) obj).getAweme())) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        if (c291001Au2 != null && C631370Opb.LIZIZ(interactRightAreaComponent2) == ((Number) c291001Au2.LIZ).intValue() && ((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIIJJI() <= 0) {
            C0O9L c0o9l = C0O9L.LIZ;
            C724270Sb3 c724270Sb32 = interactRightAreaComponent2.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            }
            Aweme aweme = ((VideoItemParams) obj2).getAweme();
            c0o9l.getClass();
            C0O9L.LIZ(aweme);
        }
        return Unit.LIZ;
    }
}
