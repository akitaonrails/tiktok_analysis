package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Od9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623650Od9 implements InterfaceC619800OSs {
    public final View LIZ;
    public final SmartImageView LIZIZ;
    public final C427660Gpo LIZJ;
    public final TuxTextView LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public C0OV6 LJII;
    public final C0P46 LJIIIIZZ;

    @Override // X.C0OT0
    public final View LJIJI() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public C623650Od9(ViewStub viewStub) {
        ?? r6;
        ?? LJLLLL;
        ViewParent parent = viewStub.getParent();
        if (parent instanceof ViewGroup) {
            r6 = (ViewGroup) parent;
        } else {
            r6 = 0;
        }
        if (r6 == 0) {
            viewStub.setLayoutResource(R.layout.a6t);
            LJLLLL = C786410Ut5.LJLLLL(viewStub);
        } else {
            int iIndexOfChild = r6.indexOfChild(viewStub);
            ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            C786410Ut5.LJJLJLI(viewStub, r6);
            Context context = viewStub.getContext();
            ?? frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.d0c);
            C786410Ut5.a6(frameLayout, layoutParams);
            SmartImageView smartImageView = new SmartImageView(context);
            smartImageView.setId(R.id.d5o);
            C786410Ut5.G6(smartImageView, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(180)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320))));
            smartImageView.setActualImageScaleType(EnumC1338240kve.CENTER_CROP);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
            smartImageView.setPlaceholderImage(c384050F3z.LIZ(context));
            frameLayout.addView(smartImageView);
            C12P4 c12p4 = new C12P4(context, null, 6, 0);
            c12p4.setId(R.id.d5p);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(180)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68)));
            layoutParams2.gravity = 80;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c12p4);
            c12p4.setLayoutParams(layoutParams2);
            c12p4.setShadeColorRes(R.attr.e1);
            c12p4.setBeginShadeOpacity(0.0f);
            c12p4.setEndShadeOpacity(0.5f);
            c12p4.setShader(EnumC197015126j.EASE_IN);
            c12p4.setStyle(C12KQ.VERTICAL);
            frameLayout.addView(c12p4);
            ?? linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 8388691;
            layoutParams3.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            layoutParams3.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            layoutParams3.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            C786410Ut5.d6(linearLayout, layoutParams3);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            C786410Ut5.d6(linearLayout2, new LinearLayout.LayoutParams(-2, -2));
            C427660Gpo c427660Gpo = new C427660Gpo(context, null, 6, 0);
            c427660Gpo.setId(R.id.d0y);
            c427660Gpo.setSize(16);
            C786410Ut5.H6(c427660Gpo, new LinearLayout.LayoutParams(-2, -2));
            linearLayout2.addView(c427660Gpo);
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setId(R.id.d0z);
            tuxTextView.setMaxLines(1);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(134)));
            tuxTextView.setImportantForAccessibility(2);
            tuxTextView.setTextColorRes(R.attr.zi);
            tuxTextView.setTuxFont(62);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 16;
            layoutParams4.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            C786410Ut5.R6(tuxTextView, layoutParams4);
            linearLayout2.addView(tuxTextView);
            linearLayout.addView(linearLayout2);
            frameLayout.addView(linearLayout);
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
            layoutParams5.gravity = 17;
            C786410Ut5.M6(tuxIconView, layoutParams5);
            tuxIconView.setImportantForAccessibility(2);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_play_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ef);
            c419910GdJ.LJFF = true;
            tuxIconView.setTuxIcon(c419910GdJ);
            frameLayout.addView(tuxIconView);
            r6.addView(frameLayout, iIndexOfChild);
            LJLLLL = frameLayout;
        }
        this.LIZ = LJLLLL;
        this.LIZIZ = (SmartImageView) LJLLLL.findViewById(R.id.d5o);
        this.LIZJ = (C427660Gpo) LJLLLL.findViewById(R.id.d0y);
        this.LIZLLL = (TuxTextView) LJLLLL.findViewById(R.id.d0z);
        this.LJIIIIZZ = new C0P46(this, 1);
    }

    @Override // X.InterfaceC619800OSs
    public final void LIZ(C0OV6 c0ov6) {
        if (c0ov6 == null) {
            this.LIZ.setClipToOutline(false);
            return;
        }
        this.LIZ.setClipToOutline(true);
        this.LJII = c0ov6;
        this.LIZ.setOutlineProvider(this.LJIIIIZZ);
    }

    @Override // X.InterfaceC619800OSs
    public final void LJII(C0OOO c0ooo) {
        UrlModel cover;
        User author;
        UrlModel avatarThumb;
        String nickname;
        String str;
        C12ES.LJIILL(0, this.LIZIZ);
        Video video = c0ooo.LLJI.getVideo();
        if (video != null && (cover = video.getCover()) != null && (author = c0ooo.LLJI.getAuthor()) != null && (avatarThumb = author.getAvatarThumb()) != null) {
            User author2 = c0ooo.LLJI.getAuthor();
            String str2 = "";
            if (author2 == null || (nickname = author2.getNickname()) == null) {
                nickname = "";
            }
            List<String> urlList = cover.getUrlList();
            String str3 = null;
            if (urlList != null) {
                str = (String) C13LP.LJJJLL(urlList);
            } else {
                str = null;
            }
            if (!Intrinsics.LJFF(str, this.LJ)) {
                this.LJ = str;
                C1334040kos c1334040kos = C1334040kos.LIZ;
                if (str != null) {
                    str2 = str;
                }
                c1334040kos.getClass();
                String strLIZLLL = C1334040kos.LIZLLL(str2);
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
                } else {
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
                    c1331670kl3LJIIIIZZ.LJJ(this.LIZIZ);
                    c1331670kl3LJIIIIZZ.LJIIJJI();
                }
            }
            List<String> urlList2 = avatarThumb.getUrlList();
            if (urlList2 != null) {
                str3 = (String) C13LP.LJJJLL(urlList2);
            }
            if (!Intrinsics.LJFF(str3, this.LJFF)) {
                this.LJFF = str3;
                if (C290780BaW.LIZ()) {
                    C623720OdG.LIZ(this.LIZJ, avatarThumb, "bulletin_list_video_avatar", EnumC1334360kpO.LOW);
                } else {
                    C427660Gpo.LJIIJJI(this.LIZJ, C438710HIf.LIZ(avatarThumb), false, null, null, false, false, null, null, true, null, 766);
                }
            }
            if (!Intrinsics.LJFF(nickname, this.LJI)) {
                this.LJI = nickname;
                this.LIZLLL.setText(nickname);
            }
        }
    }

    @Override // X.InterfaceC619800OSs
    public final void LJIIJJI(C0OOO c0ooo) {
        LJII(c0ooo);
    }
}
