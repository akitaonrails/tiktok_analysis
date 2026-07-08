package X;

import com.bytedance.android.live.rank.impl.sticker.dialog.TabRankStickerDialog;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.subcription.subspaceeditor.SubEmojiInputDialogFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0g4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151810g4x implements InterfaceC469360Ias {
    public final int $t;
    public Object l0;

    public static final void onPageScrollStateChanged$0(C1151810g4x c1151810g4x, int i) {
    }

    public static final void onPageScrollStateChanged$1(C1151810g4x c1151810g4x, int i) {
    }

    public static final void onPageScrollStateChanged$2(C1151810g4x c1151810g4x, int i) {
    }

    public static final void onPageScrolled$0(C1151810g4x c1151810g4x, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(C1151810g4x c1151810g4x, int i, float f, int i2) {
    }

    public static final void onPageScrolled$2(C1151810g4x c1151810g4x, int i, float f, int i2) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                break;
            case 1:
                onPageScrollStateChanged$1(this, i);
                break;
            case 2:
                onPageScrollStateChanged$2(this, i);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                break;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                break;
            case 2:
                onPageScrolled$2(this, i, f, i2);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
            case 2:
                onPageSelected$2(this, i);
                break;
        }
    }

    public C1151810g4x(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageSelected$0(C1151810g4x c1151810g4x, int i) {
        if (((ArrayList) ((LiveEmojiInputDialogFragment) c1151810g4x.l0).LLLLIILL).size() - 1 < ((LiveEmojiInputDialogFragment) c1151810g4x.l0).LLLFFI.getCurrentItem()) {
            return;
        }
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = (LiveEmojiInputDialogFragment) c1151810g4x.l0;
        liveEmojiInputDialogFragment.LLLFZ = (AbstractC1115080f7i) ListProtector.get(liveEmojiInputDialogFragment.LLLLIILL, i);
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment2 = (LiveEmojiInputDialogFragment) c1151810g4x.l0;
        AbstractC1115080f7i abstractC1115080f7i = liveEmojiInputDialogFragment2.LLLFZ;
        if (!(abstractC1115080f7i instanceof C1115060f7g) && !(abstractC1115080f7i instanceof C1114970f7X)) {
            if (abstractC1115080f7i == liveEmojiInputDialogFragment2.LLLIIII) {
                liveEmojiInputDialogFragment2.LLJL.setIconAttr(R.attr.cjo);
                ((LiveEmojiInputDialogFragment) c1151810g4x.l0).LLJJLIIIJLLLLLLLZ.setIconAttr(R.attr.cj2);
                LiveEmojiInputDialogFragment liveEmojiInputDialogFragment3 = (LiveEmojiInputDialogFragment) c1151810g4x.l0;
                if (liveEmojiInputDialogFragment3.LLLIL) {
                    C786410Ut5.LJZL(8, liveEmojiInputDialogFragment3.LLLIIIIL);
                    return;
                }
                return;
            }
            return;
        }
        liveEmojiInputDialogFragment2.LLJJLIIIJLLLLLLLZ.setIconAttr(R.attr.cjo);
        ((LiveEmojiInputDialogFragment) c1151810g4x.l0).wS();
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment4 = (LiveEmojiInputDialogFragment) c1151810g4x.l0;
        if (!liveEmojiInputDialogFragment4.LLLIL) {
            return;
        }
        C786410Ut5.LJZL(0, liveEmojiInputDialogFragment4.LLLIIIIL);
    }

    public static final void onPageSelected$1(C1151810g4x c1151810g4x, int i) {
        if (((SubEmojiInputDialogFragment) c1151810g4x.l0).LLL.getCurrentItem() == 0) {
            ((SubEmojiInputDialogFragment) c1151810g4x.l0).LLJJJJJIL.setIconAttr(R.attr.cjo);
            ((SubEmojiInputDialogFragment) c1151810g4x.l0).LLJJJJLIIL.setIcon(R.drawable.emf);
        } else {
            ((SubEmojiInputDialogFragment) c1151810g4x.l0).LLJJJJLIIL.setIconAttr(R.attr.cjo);
            ((SubEmojiInputDialogFragment) c1151810g4x.l0).LLJJJJJIL.setIconAttr(R.attr.cj2);
        }
    }

    public static final void onPageSelected$2(C1151810g4x c1151810g4x, int i) {
        TabRankStickerDialog tabRankStickerDialog = (TabRankStickerDialog) c1151810g4x.l0;
        int i2 = tabRankStickerDialog.LLJJ;
        if (i2 == i) {
            return;
        }
        C1119410fEh.LJII(tabRankStickerDialog.dataChannel, tabRankStickerDialog.PR(i2), ((TabRankStickerDialog) c1151810g4x.l0).PR(i), ((TabRankStickerDialog) c1151810g4x.l0).LLILLJJLI);
        if (((TabRankStickerDialog) c1151810g4x.l0).OR().getVisibility() == 0) {
            ((TabRankStickerDialog) c1151810g4x.l0).OR().setSelectedAt(i);
        }
    }
}
