package X;

import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0y29, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class DialogC1841990y29 extends AbstractDialogC972150bPB {
    public final long LLJI;
    public final long LLJIJIL;
    public final Room LLJILJIL;
    public final DataChannel LLJILJILJ;
    public ImageView LLJILLL;
    public ImageView LLJJ;
    public C16F5 LLJJI;
    public C16F5 LLJJIII;
    public C16FS LLJJIJI;
    public View LLJJIJIIJIL;
    public Gift LLJJIJIL;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.g94;
    }

    public final void LJL() {
        Gift gift = this.LLJJIJIL;
        Long lValueOf = gift != null ? Long.valueOf(gift.id) : null;
        Room room = this.LLJILJIL;
        DataChannel dataChannel = this.LLJILJILJ;
        if (lValueOf == null || room == null || dataChannel == null) {
            return;
        }
        ((IGiftService) C915980Zwa.LIZLLL.getValue()).sendGiftForBecomeGuest(lValueOf.longValue(), room, dataChannel);
    }

    @Override // X.AbstractDialogC972150bPB, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        List<String> listLIZ;
        String string;
        String string2;
        ImageModel imageModel;
        User owner;
        ImageModel avatarThumb;
        super.onCreate(bundle);
        this.LLJILLL = (ImageView) findViewById(R.id.j1x);
        this.LLJJ = (ImageView) findViewById(R.id.j1v);
        this.LLJJI = (C16F5) findViewById(R.id.j1s);
        this.LLJJIII = (C16F5) findViewById(R.id.j1p);
        this.LLJJIJI = (C16FS) findViewById(R.id.j1y);
        this.LLJJIJIIJIL = findViewById(R.id.j1m);
        this.LLJJIJIL = ((IGiftService) C915980Zwa.LIZLLL.getValue()).findClosetGift((int) (this.LLJIJIL - this.LLJI));
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        Room room = this.LLJILJIL;
        List urls = null;
        if (room != null && (owner = room.getOwner()) != null && (avatarThumb = owner.getAvatarThumb()) != null) {
            listLIZ = C842240X2g.LIZ(avatarThumb);
        } else {
            listLIZ = null;
        }
        C1324610kZf c1324610kZfLIZJ = c0jbnLIZ.LIZJ(listLIZ);
        Boolean bool = Boolean.TRUE;
        c1324610kZfLIZJ.LJIILIIL = bool;
        c1324610kZfLIZJ.LJIIIZ = R.drawable.el_;
        c1324610kZfLIZJ.LJJI(this.LLJILLL);
        C0JBN c0jbnLIZ2 = C1819620xS4.LIZ();
        Gift gift = this.LLJJIJIL;
        if (gift != null && (imageModel = gift.image) != null) {
            urls = imageModel.getUrls();
        }
        C1324610kZf c1324610kZfLIZJ2 = c0jbnLIZ2.LIZJ(urls);
        c1324610kZfLIZJ2.LJIILIIL = bool;
        c1324610kZfLIZJ2.LJIIIZ = R.drawable.el_;
        c1324610kZfLIZJ2.LJJI(this.LLJJ);
        C16F5 c16f5 = this.LLJJIII;
        if (c16f5 != null) {
            Gift gift2 = this.LLJJIJIL;
            if (gift2 == null || (string2 = Integer.valueOf(gift2.diamondCount).toString()) == null) {
                string2 = "";
            }
            c16f5.setText(string2);
        }
        String strJ4 = C786410Ut5.j4(C497740JfY.LJIIJJI(2131755575, (int) (this.LLJIJIL - this.LLJI)), Arrays.copyOf(new Object[]{Long.valueOf(this.LLJIJIL)}, 1));
        C16F5 c16f52 = this.LLJJI;
        if (c16f52 != null) {
            c16f52.setText(C786410Ut5.j4(C497740JfY.LJIIJJI(2131755574, (int) this.LLJI), Arrays.copyOf(new Object[]{Long.valueOf(this.LLJI), strJ4}, 2)));
        }
        C16FS c16fs = this.LLJJIJI;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS161S0100000_27(this, 132));
        }
        View view = this.LLJJIJIIJIL;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS161S0100000_27(this, 133), view);
        }
        Gift gift3 = this.LLJJIJIL;
        if (gift3 == null || (string = Long.valueOf(gift3.id).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        C920470a3p.LIZ(string, String.valueOf(this.LLJIJIL - this.LLJI), "show", "first");
    }

    public DialogC1841990y29(Context context, long j, long j2, Room room, DataChannel dataChannel) {
        super(context);
        this.LLJI = j;
        this.LLJIJIL = j2;
        this.LLJILJIL = room;
        this.LLJILJILJ = dataChannel;
    }
}
