package X;

import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellCompose;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0OpQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C631260OpQ extends C2217421BqW implements Function0<Unit> {
    public C631260OpQ(MusicCellCompose musicCellCompose) {
        super(0, musicCellCompose, MusicCellCompose.class, "onShootButtonClick", "onShootButtonClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MusicCellCompose musicCellCompose = (MusicCellCompose) this.receiver;
        C632090Oql c632090Oql = musicCellCompose.LLJ;
        if (c632090Oql != null) {
            musicCellCompose.L5().vQ2(c632090Oql, musicCellCompose.getLayoutPosition(), null);
        }
        return Unit.LIZ;
    }
}
