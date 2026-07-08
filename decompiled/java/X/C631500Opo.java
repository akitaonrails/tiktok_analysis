package X;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellCompose;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS218S0300000_9;
import kotlin.jvm.internal.AwS375S0200000_9;

/* JADX INFO: renamed from: X.0Opo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C631500Opo extends C2217421BqW implements Function0<Unit> {
    public C631500Opo(MusicCellCompose musicCellCompose) {
        super(0, musicCellCompose, MusicCellCompose.class, "onHighlightEditTextClick", "onHighlightEditTextClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C631640Oq2 c631640Oq2;
        ComposeView composeView;
        Context context;
        FragmentManager supportFragmentManager;
        MusicCellCompose musicCellCompose = (MusicCellCompose) this.receiver;
        C632090Oql c632090Oql = musicCellCompose.LLJ;
        if (c632090Oql != null && (c631640Oq2 = musicCellCompose.LLJI) != null && (composeView = musicCellCompose.LLIZ) != null && (context = composeView.getContext()) != null) {
            C1390850mIV c1390850mIV = new C1390850mIV();
            C1247510iZJ c1247510iZJ = new C1247510iZJ();
            c1247510iZJ.LIZIZ(2131837731);
            c1247510iZJ.LIZ(new AwS218S0300000_9(context, c631640Oq2, c632090Oql, 17));
            C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
            c1247510iZJ2.LIZIZ(2131837732);
            c1247510iZJ2.LIZ(new AwS375S0200000_9(musicCellCompose, c632090Oql, 137));
            c1390850mIV.LIZIZ(c1247510iZJ, c1247510iZJ2);
            c1390850mIV.LIZLLL(2131837737);
            TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                tuxActionSheetLIZJ.show(supportFragmentManager, "edit_highlight");
            }
            MusicReleaseInfo musicReleaseInfo = c632090Oql.getMusicModel().getMusicReleaseInfo();
            if (musicReleaseInfo != null && musicReleaseInfo.isNewReleaseSong()) {
                MusicCellCompose.P5(c631640Oq2, c632090Oql, "edit");
            }
        }
        return Unit.LIZ;
    }
}
