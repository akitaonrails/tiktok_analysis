package X;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellCollectIconViewModelCompose;
import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellCompose;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0OpP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C631250OpP extends C2217421BqW implements Function0<Boolean> {
    public C631250OpP(MusicCellCompose musicCellCompose) {
        super(0, musicCellCompose, MusicCellCompose.class, "onCollectIconClick", "onCollectIconClick()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        ComposeView composeView;
        Context context;
        MusicCellCompose musicCellCompose = (MusicCellCompose) this.receiver;
        C632090Oql c632090Oql = musicCellCompose.LLJ;
        boolean z = false;
        if (c632090Oql != null && (composeView = musicCellCompose.LLIZ) != null && (context = composeView.getContext()) != null && ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIJJ(c632090Oql.getMusicModel(), context, true)) {
            AssemVMLazy assemVMLazy = musicCellCompose.LLILZIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicCellCompose.LLJILJIL;
            MusicCellCollectIconViewModelCompose musicCellCollectIconViewModelCompose = (MusicCellCollectIconViewModelCompose) assemVMLazy.getValue();
            musicCellCollectIconViewModelCompose.setState(new C631620Oq0(c632090Oql.getMusicModel(), musicCellCollectIconViewModelCompose, musicCellCompose.L5().getPreviousPage(), musicCellCompose.getLayoutPosition(), c632090Oql.getMusicItemModel().pinStatus == EnumC631610Opz.PINNED));
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
