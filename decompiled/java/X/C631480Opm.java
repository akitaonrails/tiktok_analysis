package X;

import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellCompose;
import com.ss.android.ugc.aweme.music.vm.MusicHighlightBackgroundViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Opm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C631480Opm extends C2217421BqW implements Function0<Unit> {
    public C631480Opm(MusicCellCompose musicCellCompose) {
        super(0, musicCellCompose, MusicCellCompose.class, "onLoadHighlightBackground", "onLoadHighlightBackground()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MusicCellCompose musicCellCompose = (MusicCellCompose) this.receiver;
        C632090Oql c632090Oql = musicCellCompose.LLJ;
        if (c632090Oql != null) {
            MusicModel musicModel = c632090Oql.getMusicModel();
            if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
                AssemVMLazy assemVMLazy = musicCellCompose.LLILLL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicCellCompose.LLJILJIL;
                ((MusicHighlightBackgroundViewModel) assemVMLazy.getValue()).vQ2(musicModel.getPicPremium());
            } else if (!TextUtils.isEmpty(musicModel.getPicBig())) {
                AssemVMLazy assemVMLazy2 = musicCellCompose.LLILLL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = MusicCellCompose.LLJILJIL;
                ((MusicHighlightBackgroundViewModel) assemVMLazy2.getValue()).vQ2(musicModel.getPicBig());
            }
        }
        return Unit.LIZ;
    }
}
