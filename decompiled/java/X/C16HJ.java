package X;

import android.content.DialogInterface;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.search.detail.keyframe.ui.SearchDetailKeyframePanelFragment;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import com.ss.android.ugc.aweme.story.note.StoryThoughtCreationFragment;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicViewV2;

/* JADX INFO: renamed from: X.16HJ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HJ implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
            case 5:
                onDismiss$5(this, dialogInterface);
                break;
            case 6:
                onDismiss$6(this, dialogInterface);
                break;
            case 7:
                onDismiss$7(this, dialogInterface);
                break;
        }
    }

    public C16HJ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(C16HJ c16hj, DialogInterface dialogInterface) {
        ((SearchDetailKeyframePanelFragment) c16hj.l0).G2(4);
        SearchDetailKeyframePanelFragment searchDetailKeyframePanelFragment = (SearchDetailKeyframePanelFragment) c16hj.l0;
        searchDetailKeyframePanelFragment.getClass();
        String str = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        if (!(abstractC343940De4LJIIJJI instanceof C343950De5)) {
            if (abstractC343940De4LJIIJJI instanceof C343980De8) {
                searchDetailKeyframePanelFragment.MR().AQ2(EnumC1782610wUN.EXIT_BY_BUTTON, null, null);
            } else {
                searchDetailKeyframePanelFragment.MR().AQ2(EnumC1782610wUN.EXIT_BY_VIDEO, null, null);
            }
        }
    }

    public static final void onDismiss$1(C16HJ c16hj, DialogInterface dialogInterface) {
        ((C20502215Ki) c16hj.l0).LLLII().Ow0();
    }

    public static final void onDismiss$2(C16HJ c16hj, DialogInterface dialogInterface) {
        ((C20698515z5) c16hj.l0).LIZ(false);
    }

    public static final void onDismiss$3(C16HJ c16hj, DialogInterface dialogInterface) {
        VerticalMusicViewV2 verticalMusicViewV2 = (VerticalMusicViewV2) c16hj.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VerticalMusicViewV2.LLLLII;
        verticalMusicViewV2.LJJJZ(false);
    }

    public static final void onDismiss$4(C16HJ c16hj, DialogInterface dialogInterface) {
        InterfaceC20619215mI interfaceC20619215mI = (InterfaceC20619215mI) c16hj.l0;
        if (interfaceC20619215mI != null) {
            interfaceC20619215mI.LJ(true);
        }
    }

    public static final void onDismiss$5(C16HJ c16hj, DialogInterface dialogInterface) {
        ((C20661615t8) c16hj.l0).LLJ = false;
    }

    public static final void onDismiss$6(C16HJ c16hj, DialogInterface dialogInterface) {
        StoryThoughtCreationFragment storyThoughtCreationFragment = (StoryThoughtCreationFragment) c16hj.l0;
        storyThoughtCreationFragment.LLJIJIL = null;
        storyThoughtCreationFragment.LLJILJIL = null;
        storyThoughtCreationFragment.LLJILJILJ = null;
        storyThoughtCreationFragment.LLJI = null;
        storyThoughtCreationFragment.getClass();
    }

    public static final void onDismiss$7(C16HJ c16hj, DialogInterface dialogInterface) {
        StoryThoughtAvatarCreationFragment storyThoughtAvatarCreationFragment = (StoryThoughtAvatarCreationFragment) c16hj.l0;
        storyThoughtAvatarCreationFragment.LLJJIJI = null;
        storyThoughtAvatarCreationFragment.LLJJIJIIJIL = null;
        storyThoughtAvatarCreationFragment.LLJJIJIL = null;
        storyThoughtAvatarCreationFragment.LLJJIII = null;
        storyThoughtAvatarCreationFragment.getClass();
    }
}
