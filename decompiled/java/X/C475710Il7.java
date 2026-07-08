package X;

import Y.ACListenerS111S0200000_7;
import Y.ACListenerS74S0300000_7;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.game.GameliveBottombarFlowSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Il7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475710Il7 extends RecyclerView.ViewHolder {
    public int LL;
    public final C01GW LLILLJJLI;
    public final C1324720kZq LLILLL;
    public final C16F5 LLILZ;
    public final C16F5 LLILZIL;
    public final C1324720kZq LLILZLL;
    public final C16F5 LLIZ;
    public final View LLIZLLLIL;
    public final TuxIconView LLJ;
    public final View LLJI;
    public final FrameLayout LLJIJIL;
    public final /* synthetic */ C475700Il6 LLJILJIL;

    public final InterfaceC475720Il8 L5() {
        return (InterfaceC475720Il8) this.LLILLJJLI.getValue();
    }

    public final void N5() {
        C475710Il7 c475710Il7;
        InterfaceC475720Il8 interfaceC475720Il8L5;
        InterfaceC475720Il8 interfaceC475720Il8L52;
        InterfaceC475720Il8 interfaceC475720Il8L53;
        InterfaceC475720Il8 interfaceC475720Il8L54;
        C475710Il7 c475710Il72;
        if (GameliveBottombarFlowSetting.enableGameLiveAutoPlay) {
            C475710Il7 c475710Il73 = this.LLJILJIL.LLIZLLLIL;
            if (c475710Il73 == null || (interfaceC475720Il8L54 = c475710Il73.L5()) == null || !interfaceC475720Il8L54.isPlaying() || (c475710Il72 = this.LLJILJIL.LLIZLLLIL) == null || c475710Il72.LL != this.LL) {
                C468240IXu c468240IXu = (C468240IXu) C13LP.LJJJLZIJ(this.LL, this.LLJILJIL.LL);
                if (c468240IXu == null) {
                    return;
                }
                Room room = c468240IXu.LIZ;
                if (this.LLJIJIL != null && (interfaceC475720Il8L53 = L5()) != null) {
                    getAbsoluteAdapterPosition();
                    interfaceC475720Il8L53.LJ(room);
                }
                FrameLayout frameLayout = this.LLJIJIL;
                if (frameLayout != null && (interfaceC475720Il8L52 = L5()) != null) {
                    interfaceC475720Il8L52.LIZLLL(frameLayout);
                }
                InterfaceC475720Il8 interfaceC475720Il8L55 = L5();
                if (interfaceC475720Il8L55 != null) {
                    interfaceC475720Il8L55.LIZ(InterfaceC1106030et7.C8.LIZIZ().booleanValue());
                }
                if (!Intrinsics.LJFF(this.LLJILJIL.LLIZLLLIL, this) && (c475710Il7 = this.LLJILJIL.LLIZLLLIL) != null && (interfaceC475720Il8L5 = c475710Il7.L5()) != null) {
                    interfaceC475720Il8L5.LIZIZ();
                }
                this.LLJILJIL.LLIZLLLIL = this;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C475710Il7(C475700Il6 c475700Il6, View view) {
        super(view);
        this.LLJILJIL = c475700Il6;
        this.LL = -1;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS551S0100000_7(c475700Il6, 756));
        this.LLILLL = (C1324720kZq) view.findViewById(R.id.ir4);
        this.LLILZ = (C16F5) view.findViewById(R.id.n9_);
        this.LLILZIL = (C16F5) view.findViewById(R.id.tv_video_description);
        this.LLILZLL = (C1324720kZq) view.findViewById(R.id.lz0);
        this.LLIZ = (C16F5) view.findViewById(R.id.tv_user_name);
        this.LLIZLLLIL = view.findViewById(R.id.ipr);
        this.LLJ = (TuxIconView) view.findViewById(R.id.n0q);
        this.LLJI = view.findViewById(R.id.ir6);
        this.LLJIJIL = (FrameLayout) view.findViewById(R.id.n3x);
    }

    public static final void P5(TuxIconView tuxIconView, boolean z) {
        int i;
        if (tuxIconView == null) {
            return;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (z) {
            i = R.raw.icon_speaker_x_mark_ltr;
        } else {
            i = R.raw.icon_speaker_2_ltr;
        }
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.exp);
        tuxIconView.setTuxIcon(c419910GdJ);
    }

    public final void I5(C475710Il7 c475710Il7, C468240IXu c468240IXu) {
        ImageModel cover;
        String str;
        List urls;
        String str2;
        TuxIconView tuxIconView;
        InterfaceC475720Il8 interfaceC475720Il8L5;
        String nickName;
        ImageModel avatarThumb;
        List urls2;
        String strLIZIZ;
        List urls3;
        Room room = c468240IXu.LIZ;
        if (room == null) {
            return;
        }
        ImageModel squareCoverImg = room.getSquareCoverImg();
        String str3 = "";
        TuxIconView tuxIconView2 = null;
        if ((squareCoverImg == null || (urls3 = squareCoverImg.getUrls()) == null || (str = (String) C13LP.LJJJLL(urls3)) == null) && ((cover = c468240IXu.LIZ.getCover()) == null || (urls = cover.getUrls()) == null || (str = (String) C13LP.LJJJLL(urls)) == null)) {
            str = "";
        }
        if (c475710Il7 != null) {
            C1324720kZq c1324720kZq = c475710Il7.LLILLL;
            if (c1324720kZq != null) {
                this.LLJILJIL.getClass();
                C1324610kZf url = C1819620xS4.LIZ().setUrl(str);
                url.LJIL = true;
                url.LJJI(c1324720kZq);
            }
            C16F5 c16f5 = c475710Il7.LLILZ;
            if (c16f5 != null) {
                C475700Il6 c475700Il6 = this.LLJILJIL;
                int userCount = c468240IXu.LIZ.getUserCount();
                c475700Il6.getClass();
                if (userCount < 1000) {
                    strLIZIZ = String.valueOf(userCount);
                } else if (userCount < 1000000) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(userCount / LSPassThroughRecordSizeConfig.DEFAULT);
                    sbLIZ.append('K');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(userCount / 1000000);
                    sbLIZ2.append('M');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                c16f5.setText(strLIZIZ);
            }
            C16F5 c16f52 = c475710Il7.LLILZIL;
            if (c16f52 != null) {
                c16f52.setText(c468240IXu.LIZ.getTitle());
            }
        }
        User owner = c468240IXu.LIZ.getOwner();
        if (owner == null || (avatarThumb = owner.getAvatarThumb()) == null || (urls2 = avatarThumb.getUrls()) == null || (str2 = (String) C13LP.LJJJLL(urls2)) == null) {
            str2 = "";
        }
        if (c475710Il7 != null) {
            C1324720kZq c1324720kZq2 = c475710Il7.LLILZLL;
            if (c1324720kZq2 != null) {
                this.LLJILJIL.getClass();
                C1324610kZf url2 = C1819620xS4.LIZ().setUrl(str2);
                url2.LJIL = true;
                url2.LJJI(c1324720kZq2);
            }
            C16F5 c16f53 = c475710Il7.LLIZ;
            if (c16f53 != null) {
                User owner2 = c468240IXu.LIZ.getOwner();
                if (owner2 != null && (nickName = owner2.getNickName()) != null) {
                    str3 = nickName;
                }
                c16f53.setText(str3);
            }
            C1324720kZq c1324720kZq3 = c475710Il7.LLILLL;
            if (c1324720kZq3 != null) {
                C786410Ut5.e8(c1324720kZq3, new ACListenerS74S0300000_7(this, c475710Il7, c468240IXu, 17));
            }
            tuxIconView = c475710Il7.LLJ;
        } else {
            tuxIconView = null;
        }
        C500260Jjc.LJIILIIL(tuxIconView);
        if (GameliveBottombarFlowSetting.enableGameLiveAutoPlay) {
            if (c475710Il7 != null) {
                TuxIconView tuxIconView3 = c475710Il7.LLJ;
                if (tuxIconView3 != null) {
                    C786410Ut5.a9(tuxIconView3, new ACListenerS111S0200000_7(c475710Il7, this, 62));
                }
                tuxIconView2 = c475710Il7.LLJ;
            }
            P5(tuxIconView2, InterfaceC1106030et7.C8.LIZIZ().booleanValue());
            if (c475710Il7 != null && (interfaceC475720Il8L5 = c475710Il7.L5()) != null) {
                interfaceC475720Il8L5.LIZJ(c475710Il7.LLJ, c475710Il7.LLJI);
            }
        }
    }
}
