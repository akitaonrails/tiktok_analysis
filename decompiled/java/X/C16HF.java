package X;

import android.content.DialogInterface;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMultiMusicPanel;
import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMusicPanel;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import com.ss.android.ugc.aweme.story.note.StoryThoughtCreationFragment;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicViewV2;

/* JADX INFO: renamed from: X.16HF, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HF implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                break;
            case 1:
                onCancel$1(this, dialogInterface);
                break;
            case 2:
                onCancel$2(this, dialogInterface);
                break;
            case 3:
                onCancel$3(this, dialogInterface);
                break;
            case 4:
                onCancel$4(this, dialogInterface);
                break;
            case 5:
                onCancel$5(this, dialogInterface);
                break;
            case 6:
                onCancel$6(this, dialogInterface);
                break;
            case 7:
                onCancel$7(this, dialogInterface);
                break;
        }
    }

    public C16HF(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(C16HF c16hf, DialogInterface dialogInterface) {
        C15QK c15qk = (C15QK) c16hf.l0;
        if (!c15qk.LLJJJJ && c15qk.LLLLIILLL) {
            C1441830ncj c1441830ncj = c15qk.LLJJIJIIJIL;
            if (c1441830ncj == null) {
                c1441830ncj = null;
            }
            c1441830ncj.LJ();
            c15qk.LLJJJJ = true;
            c15qk.LLLLIILLL = false;
        }
    }

    public static final void onCancel$1(C16HF c16hf, DialogInterface dialogInterface) {
        String str;
        VerticalMusicViewV2 verticalMusicViewV2 = (VerticalMusicViewV2) c16hf.l0;
        verticalMusicViewV2.getClass();
        C1453500nvY c1453500nvY = C1453500nvY.LIZ;
        C155H c155h = verticalMusicViewV2.LLIZ;
        C155H c155h2 = null;
        if (c155h == null) {
            c155h = null;
        }
        if (c155h.LJIILJJIL == C00IV.RECORDPAGE) {
            str = "video_shoot_page";
        } else {
            str = "video_edit_page";
        }
        String creationId = verticalMusicViewV2.LJJJJZI().getCreationId();
        String strLIZJ = C1429680nJ8.LIZJ(verticalMusicViewV2.LLILZIL.zt().LIZIZ());
        c1453500nvY.getClass();
        C1453500nvY.LIZ(str, creationId, strLIZJ, "click_blank");
        C155H c155h3 = ((VerticalMusicViewV2) c16hf.l0).LLIZ;
        if (c155h3 != null) {
            c155h2 = c155h3;
        }
        c155h2.LJIIL.LJ(false);
    }

    public static final void onCancel$2(C16HF c16hf, DialogInterface dialogInterface) {
        CutMultiMusicPanel cutMultiMusicPanel = (CutMultiMusicPanel) c16hf.l0;
        cutMultiMusicPanel.LLJJIJI = false;
        TuxSheet tuxSheet = cutMultiMusicPanel.LLILZ;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
        InterfaceC20503815Ky interfaceC20503815Ky = cutMultiMusicPanel.LLJJI;
        if (interfaceC20503815Ky != null) {
            interfaceC20503815Ky.LIZLLL();
        }
    }

    public static final void onCancel$3(C16HF c16hf, DialogInterface dialogInterface) {
        ((CutMusicPanel) c16hf.l0).MR();
    }

    public static final void onCancel$4(C16HF c16hf, DialogInterface dialogInterface) {
        ((C20661615t8) c16hf.l0).LJIILIIL("go_back");
    }

    public static final void onCancel$5(C16HF c16hf, DialogInterface dialogInterface) {
        ((StoryThoughtCreationFragment) c16hf.l0).getClass();
    }

    public static final void onCancel$6(C16HF c16hf, DialogInterface dialogInterface) {
        ((StoryThoughtAvatarCreationFragment) c16hf.l0).getClass();
    }

    public static final void onCancel$7(C16HF c16hf, DialogInterface dialogInterface) {
        ((C20529215Us) c16hf.l0).LLIZ = false;
    }
}
