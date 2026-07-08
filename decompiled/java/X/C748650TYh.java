package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.effect.music.LiveBGMDialog;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C748650TYh extends C2217421BqW implements Function1<EnumC748580TYa, Unit> {
    public C748650TYh(Object obj) {
        super(1, obj, LiveBGMDialog.class, "switchPage", "switchPage(Lcom/bytedance/android/livesdk/dataChannel/BroadcastDialogPage;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC748580TYa enumC748580TYa) {
        EnumC748580TYa enumC748580TYa2 = enumC748580TYa;
        LiveBGMDialog liveBGMDialog = (LiveBGMDialog) this.receiver;
        C19EH c19ehLJIIJ = liveBGMDialog.getChildFragmentManager().LJIIJ();
        if (enumC748580TYa2.getGoNextPage()) {
            c19ehLJIIJ.LJIJJ(R.anim.hf, R.anim.hc);
        } else {
            c19ehLJIIJ.LJIJJ(R.anim.hb, R.anim.hg);
        }
        if (enumC748580TYa2 == EnumC748580TYa.BGM_PLAYLIST) {
            if (!((Fragment) liveBGMDialog.LLILLJJLI.getValue()).isAdded()) {
                c19ehLJIIJ.LIZIZ(R.id.iiv, (Fragment) liveBGMDialog.LLILLJJLI.getValue());
            }
        } else {
            c19ehLJIIJ.LJIIZILJ((Fragment) liveBGMDialog.LLILLJJLI.getValue());
            ((Fragment) liveBGMDialog.LL.getValue()).onResume();
        }
        c19ehLJIIJ.LJIIIZ();
        return Unit.LIZ;
    }
}
