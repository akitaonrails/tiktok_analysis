package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.LiveCommentEmojiPanelSendSetting;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0f7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1115080f7i {
    public final Context LIZ;
    public final EnumC584890Mwp LIZIZ;
    public DataChannel LIZJ;
    public View LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public LiveIconView LJI;
    public View LJII;
    public C16FS LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final boolean LJIIJJI;

    public void LIZ() {
    }

    public abstract View LIZIZ();

    public abstract void LIZJ();

    public void LIZLLL(String str, boolean z) {
    }

    public void LJ() {
    }

    public final void LJFF(boolean z) {
        if (z) {
            View view = this.LJII;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
                return;
            }
            return;
        }
        View view2 = this.LJII;
        if (view2 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view2);
    }

    public AbstractC1115080f7i(Context context, EnumC584890Mwp enumC584890Mwp) {
        boolean z;
        this.LIZ = context;
        this.LIZIZ = enumC584890Mwp;
        if (LiveCommentEmojiPanelSendSetting.INSTANCE.getValue() && enumC584890Mwp == EnumC584890Mwp.COMMENT) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIJJI = z;
    }
}
