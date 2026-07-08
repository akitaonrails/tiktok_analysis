package X;

import android.content.Context;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11mW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19601411mW {
    public final InteractStickerStruct LIZ;
    public final Context LIZIZ;
    public final Aweme LIZJ;
    public final C705930RmZ LIZLLL;
    public final Function1<Boolean, Unit> LJ;
    public SeekBar LJFF;
    public ImageView LJI;
    public ImageView LJII;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1004));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1003));
    public final C01GW LJIIJ;

    public final boolean LIZ() {
        User author;
        Aweme aweme = this.LIZJ;
        return Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid(), (aweme == null || (author = aweme.getAuthor()) == null) ? null : author.getUid());
    }

    public final void LIZIZ(User user, SeekBar seekBar) {
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(user.getAvatarThumb()));
        c1331670kl3LJIIIIZZ.LJJIJL(this.LIZIZ);
        c1331670kl3LJIIIIZZ.LIZLLL("EmojiSliderInteractView");
        c1331670kl3LJIIIIZZ.LJJII(new C19772412Xq(seekBar, this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19601411mW(InteractStickerStruct interactStickerStruct, Context context, Aweme aweme, C705930RmZ c705930RmZ, boolean z, Function1<? super Boolean, Unit> function1) {
        C19600111mJ c19600111mJ;
        this.LIZ = interactStickerStruct;
        this.LIZIZ = context;
        this.LIZJ = aweme;
        this.LIZLLL = c705930RmZ;
        this.LJ = function1;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1005));
        this.LJIIJ = c01gwLIZIZ;
        if (LIZ()) {
            ((InterfaceC19599911mH) c01gwLIZIZ.getValue()).LJLJJI(aweme);
            if (c705930RmZ != null && (c19600111mJ = c705930RmZ.LJIJJ) != null && c19600111mJ.LIZ == 2) {
                ((InterfaceC19599911mH) c01gwLIZIZ.getValue()).LJLJJL(C19600011mI.LIZ(c19600111mJ));
            }
        }
    }
}
