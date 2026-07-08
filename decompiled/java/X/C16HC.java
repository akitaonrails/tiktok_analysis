package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import com.ss.android.ugc.aweme.music.v2.panel.MusicListPanelFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: renamed from: X.16HC, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HC implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                break;
            case 1:
                onCancel$1(this, dialogInterface);
                break;
        }
    }

    public static final void onCancel$0(C16HC c16hc, DialogInterface dialogInterface) {
        ((MusicShootAssem) c16hc.l0).tq(C0MVY.CLICK_CLOSE);
        C15L9 c15l9 = ((MusicShootAssem) c16hc.l0).LLLII;
        if (c15l9 != null) {
            c15l9.LIZ(((MusicModel) c16hc.l1).getMusicId());
        }
    }

    public static final void onCancel$1(C16HC c16hc, DialogInterface dialogInterface) {
        ((MusicListPanelFragment) c16hc.l0).ZR((MusicModel) c16hc.l1).LIZ(((MusicModel) c16hc.l1).getMusicId());
    }

    public C16HC(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
