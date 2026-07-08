package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerManagerComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0R99, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R99 extends C09AY implements Function2<CellStickerManagerComponent, C291001Au<? extends Unit>, Unit> {
    public C0R99() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(CellStickerManagerComponent cellStickerManagerComponent, C291001Au<? extends Unit> c291001Au) {
        Object obj;
        CellStickerManagerComponent cellStickerManagerComponent2 = cellStickerManagerComponent;
        if (c291001Au != null) {
            BaseFeedPageParams baseFeedPageParams = cellStickerManagerComponent2.jm().LJ;
            if (baseFeedPageParams != null && !baseFeedPageParams.isPlayListCleanMode()) {
                C705920RmY c705920RmYLp = cellStickerManagerComponent2.lp();
                C724270Sb3 c724270Sb3 = cellStickerManagerComponent2.LLJI;
                Fragment fragment = null;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                c705920RmYLp.LJIIJ(((VideoItemParams) obj).getAweme());
                C705920RmY c705920RmYLp2 = cellStickerManagerComponent2.lp();
                Context context = cellStickerManagerComponent2.getContext();
                C0RF0 c0rf0 = cellStickerManagerComponent2.jm().LIZLLL;
                if (c0rf0 != null) {
                    fragment = c0rf0.LIZJ;
                }
                c705920RmYLp2.LJIIIZ(context, fragment);
            }
            cellStickerManagerComponent2.ep();
        }
        return Unit.LIZ;
    }
}
