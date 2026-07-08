package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0OdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623660OdA implements InterfaceC619800OSs {
    public final View LIZ;
    public final SmartImageView LIZIZ;
    public C0OV6 LIZJ;
    public final C0P46 LIZLLL;

    @Override // X.C0OT0
    public final View LJIJI() {
        return this.LIZ;
    }

    public C623660OdA(ViewStub viewStub) {
        viewStub.setLayoutResource(R.layout.a6t);
        View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        this.LIZ = viewLJLLLL;
        this.LIZIZ = (SmartImageView) viewLJLLLL.findViewById(R.id.d5o);
        this.LIZLLL = new C0P46(this, 0);
    }

    @Override // X.InterfaceC619800OSs
    public final void LIZ(C0OV6 c0ov6) {
        if (c0ov6 == null) {
            this.LIZ.setClipToOutline(false);
            return;
        }
        this.LIZ.setClipToOutline(true);
        this.LIZJ = c0ov6;
        this.LIZ.setOutlineProvider(this.LIZLLL);
    }

    @Override // X.InterfaceC619800OSs
    public final void LJII(C0OOO c0ooo) {
        UrlModel cover;
        User author;
        UrlModel avatarThumb;
        String str;
        String nickname;
        C12ES.LJIILL(0, this.LIZIZ);
        Video video = c0ooo.LLJI.getVideo();
        if (video != null && (cover = video.getCover()) != null && (author = c0ooo.LLJI.getAuthor()) != null && (avatarThumb = author.getAvatarThumb()) != null) {
            List<String> urlList = cover.getUrlList();
            String str2 = "";
            if (urlList == null || (str = (String) C13LP.LJJJLL(urlList)) == null) {
                str = "";
            }
            C1334040kos c1334040kos = C1334040kos.LIZ;
            c1334040kos.getClass();
            String strLIZLLL = C1334040kos.LIZLLL(str);
            EnumC623730OdH enumC623730OdH = EnumC623730OdH.BIND;
            c1334040kos.getClass();
            C1334040kos.LJFF("bulletin_list_video_cover", strLIZLLL, enumC623730OdH, "video cover bind", 0L);
            if (C290780BaW.LIZ()) {
                ExecutorService executorService = C623720OdG.LIZ;
                C623670OdB c623670OdB = new C623670OdB();
                c623670OdB.LIZ = cover;
                c623670OdB.LIZIZ = this.LIZIZ;
                c623670OdB.LIZJ = "bulletin_list_video_cover";
                c623670OdB.LIZLLL = EnumC1334360kpO.HIGH;
                c623670OdB.LJII = true;
                c623670OdB.LIZ();
                C623720OdG.LIZ((InterfaceC1334290kpH) this.LIZ.findViewById(R.id.d0y), avatarThumb, "bulletin_list_video_avatar", EnumC1334360kpO.LOW);
            } else {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
                c1331670kl3LJIIIIZZ.LJJ(this.LIZIZ);
                C623740OdI.LIZ(c1331670kl3LJIIIIZZ);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
                c1331670kl3LJIIIIZZ2.LJJ((InterfaceC1334290kpH) this.LIZ.findViewById(R.id.d0y));
                C623740OdI.LIZ(c1331670kl3LJIIIIZZ2);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ2);
            }
            this.LIZ.findViewById(R.id.d0y).clearFocus();
            TextView textView = (TextView) this.LIZ.findViewById(R.id.d0z);
            User author2 = c0ooo.LLJI.getAuthor();
            if (author2 != null && (nickname = author2.getNickname()) != null) {
                str2 = nickname;
            }
            textView.setText(str2);
        }
    }

    @Override // X.InterfaceC619800OSs
    public final void LJIIJJI(C0OOO c0ooo) {
        LJII(c0ooo);
    }
}
