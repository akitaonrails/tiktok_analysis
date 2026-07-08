package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.SpecifiedDisplayText;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextFormat;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.00mg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C180400mg extends AbstractC1110800f0o<LikeMessage> implements InterfaceC1112720f3u {
    public final C180900ml LJJI;

    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
    public final int LIZLLL() {
        return R.drawable.evy;
    }

    @Override // X.InterfaceC1112720f3u
    public final InterfaceC1112720f3u LJIIIIZZ() {
        return null;
    }

    @Override // X.InterfaceC1112720f3u
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.AbstractC1110790f0n
    public final InterfaceC1110040eza LLD() {
        return null;
    }

    @Override // X.AbstractC1110790f0n
    public final CharSequence LLFF() {
        return null;
    }

    @Override // X.AbstractC1110790f0n
    public final int LLIFFJFJJ() {
        return 6;
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLILII() {
        return false;
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLILL() {
        return true;
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLJILLL() {
        return true;
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLJJ() {
        return true;
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n
    public final Text LLFZ() {
        List<SpecifiedDisplayText> list;
        Text text;
        LikeMessage likeMessage = (LikeMessage) this.LJIL;
        if (likeMessage != null && (list = likeMessage.specifiedDisplayText) != null && list.size() > 0) {
            for (SpecifiedDisplayText specifiedDisplayText : likeMessage.specifiedDisplayText) {
                if (specifiedDisplayText != null && specifiedDisplayText.uid == this.LJIILIIL.LJ() && (text = specifiedDisplayText.displayText) != null) {
                    return text;
                }
            }
        }
        return super.LLFZ();
    }

    @Override // X.AbstractC1110790f0n
    public final PublicAreaMessageCommon LLIIII() {
        return ((LikeMessage) this.LJIL).publicAreaMessageCommon;
    }

    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
    public final User getUser() {
        return ((LikeMessage) this.LJIL).user;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112680f3q
    public final boolean LJJLJ() {
        if (LLIILII()) {
            C1109770ez9 c1109770ez9 = this.LJIILIIL;
            InterfaceC1110780f0m<? extends AbstractC1136060ffY> interfaceC1110780f0mLJIILL = c1109770ez9.LJIIJJI.LJIILL(this.LJIL);
            if (interfaceC1110780f0mLJIILL instanceof C180500mh) {
                MESSAGE message = this.LJIL;
                interfaceC1110780f0mLJIILL.getClass();
                if (0 == message.getMessageId()) {
                    return false;
                }
            }
        }
        return super.LJJLJ();
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n
    public final boolean LLJJIJIL() {
        return super.LLJJIJIL();
    }

    @Override // X.InterfaceC1112720f3u
    public final C180900ml LJJIFFI() {
        return this.LJJI;
    }

    public C180400mg(LikeMessage likeMessage) {
        super(likeMessage);
        this.LJJI = new C180900ml();
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109650eyx
    public final void LJJJJZ(C1109770ez9 c1109770ez9) {
        CommonMessageData commonMessageData;
        MESSAGE message = this.LJIL;
        if (message.isLocalInsertMsg && (commonMessageData = message.baseMessage) != null && commonMessageData.displayText == null) {
            String strLJIJI = C497740JfY.LJIJI(2131843172);
            Text text = new Text();
            text.key = "pm_mt_msg_viewer";
            text.defaultPattern = strLJIJI;
            TextFormat textFormat = new TextFormat();
            textFormat.color = "#ffffff";
            text.defaultFormat = textFormat;
            TextPieceUser textPieceUser = new TextPieceUser();
            textPieceUser.user = ((LikeMessage) this.LJIL).user;
            TextPiece textPiece = new TextPiece();
            textPiece.userValue = textPieceUser;
            TextFormat textFormat2 = new TextFormat();
            textFormat2.color = C786410Ut5.j4("#%x", new Object[]{Integer.valueOf(LJIIL())});
            textPiece.format = textFormat2;
            textPiece.type = EnumC1133850fbz.USER.getPieceType();
            text.pieces = Collections.singletonList(textPiece);
            this.LJIL.baseMessage.displayText = text;
        }
        super.LJJJJZ(c1109770ez9);
    }

    @Override // X.AbstractC1110790f0n
    public final void LLJILJIL(User user) {
        C289001Aa.LIZIZ(user);
    }

    @Override // X.AbstractC1110790f0n
    public final void LLJIJIL(int i, User user) {
        C289001Aa.LIZ(i, user);
    }
}
