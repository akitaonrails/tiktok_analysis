package X;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellCompose;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0OqS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C631900OqS extends C2217421BqW implements Function0<Unit> {
    public C631900OqS(MusicCellCompose musicCellCompose) {
        super(0, musicCellCompose, MusicCellCompose.class, "onFeatureVideoClick", "onFeatureVideoClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C631640Oq2 c631640Oq2;
        Context context;
        Activity activityLIZIZ;
        MusicCellCompose musicCellCompose = (MusicCellCompose) this.receiver;
        C632090Oql c632090Oql = musicCellCompose.LLJ;
        if (c632090Oql != null && (c631640Oq2 = musicCellCompose.LLJI) != null) {
            boolean z = C1576570r83.LIZ(c632090Oql.getMusicModel().getPinnedVideoStatus()) == EnumC1563010qmB.HAS_PINNED;
            C632210Oqx.LIZ.getClass();
            User userLIZJ = C632210Oqx.LIZJ();
            if (userLIZJ == null || !userLIZJ.isAccuratePrivateAccount()) {
                if (z) {
                    musicCellCompose.L5().xQ2(c632090Oql, musicCellCompose.getLayoutPosition(), true, null);
                } else {
                    musicCellCompose.L5();
                    MusicPlayViewModel.wQ2(c632090Oql.getMusicModel());
                }
                MusicCellCompose.P5(c631640Oq2, c632090Oql, "plus");
            } else {
                ComposeView composeView = musicCellCompose.LLIZ;
                if (composeView != null && (context = composeView.getContext()) != null && (activityLIZIZ = C737910Sx3.LIZIZ(context)) != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZIZ);
                    c1389890mGx.LJIIIZ(2131834511);
                    c1389890mGx.LJIIJJI();
                }
            }
        }
        return Unit.LIZ;
    }
}
