package X;

import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellCompose;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Opn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C631490Opn extends C2217421BqW implements Function0<Unit> {
    public C631490Opn(MusicCellCompose musicCellCompose) {
        super(0, musicCellCompose, MusicCellCompose.class, "onDetailIconClick", "onDetailIconClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MusicCellCompose musicCellCompose = (MusicCellCompose) this.receiver;
        C632090Oql c632090Oql = musicCellCompose.LLJ;
        if (c632090Oql != null) {
            musicCellCompose.L5().xQ2(c632090Oql, musicCellCompose.getLayoutPosition(), false, null);
        }
        return Unit.LIZ;
    }
}
