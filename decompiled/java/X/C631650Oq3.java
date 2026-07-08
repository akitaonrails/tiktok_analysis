package X;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellCompose;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Oq3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C631650Oq3 extends C2217421BqW implements Function0<Unit> {
    public C631650Oq3(MusicCellCompose musicCellCompose) {
        super(0, musicCellCompose, MusicCellCompose.class, "onPinIconClick", "onPinIconClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context;
        Activity activityLIZIZ;
        MusicCellCompose musicCellCompose = (MusicCellCompose) this.receiver;
        C632090Oql c632090Oql = musicCellCompose.LLJ;
        if (c632090Oql != null) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handlePinnedMusic pinStatus: ");
            sbLIZ.append(c632090Oql.getMusicItemModel().pinStatus);
            sbLIZ.append(", isHighlighted: ");
            sbLIZ.append(c632090Oql.getMusicItemModel().isHighlighted());
            C1720106oR.LJI("music_biz", C2188811AlT.LIZIZ(sbLIZ));
            if (c632090Oql.getMusicItemModel().pinStatus != EnumC631610Opz.PINNED) {
                musicCellCompose.I5().DQ2(c632090Oql, musicCellCompose.getLayoutPosition());
            } else if (c632090Oql.getMusicItemModel().isHighlighted() || c632090Oql.getMusicItemModel().isSpotlighted()) {
                ComposeView composeView = musicCellCompose.LLIZ;
                if (composeView != null && (context = composeView.getContext()) != null && (activityLIZIZ = C737910Sx3.LIZIZ(context)) != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZIZ);
                    c1389890mGx.LJIIIZ(2131837742);
                    c1389890mGx.LJIIJJI();
                }
            } else {
                musicCellCompose.I5().IQ2(c632090Oql);
            }
        }
        return Unit.LIZ;
    }
}
