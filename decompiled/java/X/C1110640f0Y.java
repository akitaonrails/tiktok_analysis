package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveBeingAtConfigSetting;
import com.bytedance.android.livesdk.model.message.CommentReplyMessage;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.userservice.UserService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0f0Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110640f0Y extends AbstractC1110800f0o<CommentReplyMessage> implements InterfaceC1112320f3G {
    public final C1110330f03 LJJI;
    public final User LJJIFFI;
    public long LJJII;
    public final RunnableC514801zW LJJIII;
    public final C1110650f0Z LJJIIJ;

    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
    public final int LIZLLL() {
        return R.raw.icon_headphone_sparkle_fill;
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1112680f3q
    public final boolean LJJJJ() {
        return false;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
    public final boolean LJJZZI() {
        return false;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final boolean LJLZ() {
        return true;
    }

    @Override // X.AbstractC1110790f0n
    public final int LLIFFJFJJ() {
        return 8;
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n
    public final boolean LLJJIJIL() {
        return true;
    }

    @Override // X.InterfaceC1112320f3G
    public final long getCreateTime() {
        return 0L;
    }

    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
    public final User getUser() {
        return null;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
    public final boolean LJIIZILJ() {
        PublicAreaMessageCommon.MessageDisplayInfo messageDisplayInfo;
        PublicAreaMessageCommon publicAreaMessageCommon = ((CommentReplyMessage) this.LJIL).publicAreaMessageCommon;
        return (publicAreaMessageCommon == null || (messageDisplayInfo = publicAreaMessageCommon.displayInfo) == null || messageDisplayInfo.durationType != 2) ? false : true;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
    public final long LJJII() {
        return ((CommentReplyMessage) this.LJIL).stayDurationMs;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
    public final ImageModel LJLLLLLL() {
        return ((CommentReplyMessage) this.LJIL).icon;
    }

    @Override // X.AbstractC1110790f0n
    public final PublicAreaMessageCommon LLIIII() {
        return ((CommentReplyMessage) this.LJIL).publicAreaMessageCommon;
    }

    public final void LLJLIL() {
        if (this.LJJIFFI == null || this.LJJI.LIZ || LLIIIILZ() == null || LLIIIILZ().LJIIJJI == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        LLIIIILZ().LJIIJJI.LJIILJJIL(this);
        LLIIIILZ().LJIIJJI.LJ(arrayList);
    }

    @Override // X.InterfaceC1112320f3G
    public final ImageModel LJJI() {
        return LJLLLLLL();
    }

    @Override // X.InterfaceC1112320f3G
    public final Drawable LJJLIIIJLLLLLLLZ() {
        Context context;
        C1109770ez9 c1109770ez9LLIIIILZ = LLIIIILZ();
        if (c1109770ez9LLIIIILZ == null || (context = c1109770ez9LLIIIILZ.LIZ) == null) {
            return null;
        }
        C1834150xpV.LJII(context);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZ = R.raw.icon_headphone_sparkle_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.exj);
        return c419910GdJ.LIZ(context);
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109570eyp
    public final void onAttach() {
        super.onAttach();
        if (this.LJJIFFI == null || this.LJJI.LIZ || LLIIIILZ() == null || LLIIIILZ().LJIIJJI == null || LLIIIILZ().LJIIJJI.LJIL().contains(this)) {
            return;
        }
        LLIIIILZ().LJIIJJI.LJIL().add(this);
    }

    @Override // X.InterfaceC1112320f3G
    public final User LJIL() {
        return this.LJJIIJ;
    }

    @Override // X.InterfaceC1112320f3G
    public final User LJJIJL() {
        return this.LJJIFFI;
    }

    @Override // X.InterfaceC1112320f3G
    public final C1110330f03 LJJJIL() {
        return this.LJJI;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0f0Z] */
    public C1110640f0Y(CommentReplyMessage commentReplyMessage) {
        super(commentReplyMessage);
        this.LJJI = new C1110330f03();
        this.LJJIFFI = (User) UserService.getInstance().user().getCurrentUser();
        this.LJJIII = new RunnableC514801zW(this, 14);
        this.LJJIIJ = new C2261991DgD() { // from class: X.0f0Z
            @Override // X.C2261991DgD, com.bytedance.android.live.base.model.user.User, X.InterfaceC2262081DgM
            public final ImageModel getAvatarThumb() {
                return null;
            }
        };
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109570eyp
    public final void LJJJJL(boolean z) {
        super.LJJJJL(z);
        if (this.LJJIFFI != null && !this.LJIL.isHistoryMessage && this.LJJII != 0) {
            C473410IhP.LIZ().removeCallbacks(this.LJJIII);
            if (SystemClock.elapsedRealtime() - this.LJJII < LiveBeingAtConfigSetting.getValue().flagReadThreshold && !this.LJJI.LIZ) {
                if (LLIIIILZ() != null && LLIIIILZ().LJIIJJI != null) {
                    LLIIIILZ().LJIIJJI.LJIILLIIL(this, true);
                }
            } else {
                LLJLIL();
            }
            if (LLIIIILZ() != null && LLIIIILZ().LJIIJJI != null) {
                LLIIIILZ().LJIIJJI.LJIL().remove(this);
            }
            this.LJJII = 0L;
        }
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
    public final CharSequence LJLIL(User user) {
        return super.LJLIL(user);
    }
}
