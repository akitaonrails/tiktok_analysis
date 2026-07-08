package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.StickerWrapper;

/* JADX INFO: renamed from: X.0tE3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1657170tE3 {
    public final /* synthetic */ C1657150tE1 LIZ;

    public C1657170tE3(C1657150tE1 c1657150tE1) {
        this.LIZ = c1657150tE1;
    }

    public final void LIZ(int i) {
        StickerWrapper stickerWrapper;
        C1657330tEJ c1657330tEJ;
        C425230Glt c425230Glt = this.LIZ.LLJJJJJIL;
        if (c425230Glt == null) {
            c425230Glt = null;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = c425230Glt.findViewHolderForAdapterPosition(i);
        if ((viewHolderFindViewHolderForAdapterPosition instanceof C1657330tEJ) && (c1657330tEJ = (C1657330tEJ) viewHolderFindViewHolderForAdapterPosition) != null) {
            c1657330tEJ.L5(true);
        }
        C1657180tE4 c1657180tE4 = this.LIZ.LLJZIJLIL;
        if (c1657180tE4 != null) {
            stickerWrapper = (StickerWrapper) C13LP.LJJJLZIJ(i, c1657180tE4.LLILZ);
        } else {
            stickerWrapper = null;
        }
        C1657150tE1 c1657150tE1 = this.LIZ;
        if (stickerWrapper != null) {
            TuxTextView tuxTextView = c1657150tE1.LLJLIL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            tuxTextView.setText(stickerWrapper.mEffect.getName());
        }
        TuxTextView tuxTextView2 = this.LIZ.LLJLIL;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 8);
        C1657150tE1 c1657150tE12 = this.LIZ;
        if (c1657150tE12.LLLFZ) {
            TuxTextView tuxTextView3 = c1657150tE12.LLJLIL;
            if (tuxTextView3 == null) {
                tuxTextView3 = null;
            }
            C786410Ut5.B5(tuxTextView3, 1.0f);
            C786410Ut5.LLLLZLL(tuxTextView3, 0);
            tuxTextView3.animate().setStartDelay(600L).alpha(0.0f).setDuration(c1657150tE12.LLLF).setListener(null);
        }
    }
}
