package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.model.UncertMusicOwnerInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import irm.AkS81S0100000_9;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS71S0500000_9;

/* JADX INFO: renamed from: X.0Oot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630930Oot extends LinearLayout {
    public LinearLayout LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public C427660Gpo LLILZ;
    public C1908730zln LLILZIL;
    public TuxIconView LLILZLL;
    public ImageView LLIZ;
    public Music LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public boolean LLJIJIL;

    public C630930Oot() {
        throw null;
    }

    public final String getMusicOwnerDisplayName() {
        CharSequence text;
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView == null || (text = tuxTextView.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    private final void setMusicOwnerDisplayName(String str) {
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            tuxTextView2.requestLayout();
        }
    }

    public final void setArtistLabel(int i) {
        this.LLJ = i;
    }

    public final void setBehindTheSongVideoType(int i) {
        this.LLJI = i;
    }

    public C630930Oot(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View viewSd = C786410Ut5.Sd(R.layout.dqx, C786410Ut5.ne(context), this);
        if ((viewSd instanceof LinearLayout) && viewSd != null) {
            this.LL = (LinearLayout) viewSd.findViewById(R.id.ouf);
            this.LLILLJJLI = (TuxTextView) viewSd.findViewById(R.id.ouh);
            this.LLILLL = (TuxTextView) viewSd.findViewById(R.id.oug);
            this.LLILZ = (C427660Gpo) viewSd.findViewById(R.id.ou8);
            this.LLILZIL = (C1908730zln) viewSd.findViewById(R.id.oud);
            this.LLILZLL = (TuxIconView) viewSd.findViewById(R.id.oue);
            this.LLIZ = (ImageView) viewSd.findViewById(R.id.ow1);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        measureChild(childAt, i, i2);
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.min(childAt.getMeasuredWidth(), C12ES.LJIIJ(getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(168))), Integer.MIN_VALUE), childAt.getMeasuredHeight());
        super.onMeasure(i, i2);
    }

    public final void LIZ(List<? extends MusicOwnerInfo> list, FragmentManager fragmentManager, Music music) {
        MusicOwnerInfo musicOwnerInfo;
        UncertMusicOwnerInfo uncertMusicOwnerInfo;
        Resources resources;
        String string;
        Resources resources2;
        String string2;
        ImageView imageView;
        C427660Gpo c427660Gpo;
        Integer followStatus;
        Integer followStatus2;
        int iIntValue;
        int iIntValue2;
        ImageView imageView2;
        C427660Gpo c427660Gpo2;
        this.LLIZLLLIL = music;
        if (list != null) {
            musicOwnerInfo = (MusicOwnerInfo) C13LP.LJJJLZIJ(0, list);
        } else {
            musicOwnerInfo = null;
        }
        boolean z = !(musicOwnerInfo instanceof UncertMusicOwnerInfo);
        if (musicOwnerInfo == null || fragmentManager == null || (!z && list.size() < 2)) {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            return;
        }
        AwS71S0500000_9 awS71S0500000_9 = new AwS71S0500000_9((List) list, (List<? extends MusicOwnerInfo>) musicOwnerInfo, (MusicOwnerInfo) music, (Music) this, (C630930Oot) fragmentManager, (FragmentManager) 1);
        LinearLayout linearLayout = this.LL;
        if (linearLayout != null) {
            C427690Gpr.LJI(linearLayout, null);
        }
        LinearLayout linearLayout2 = this.LL;
        if (linearLayout2 != null) {
            C786410Ut5.I7(new AkS81S0100000_9(awS71S0500000_9, 10), linearLayout2);
        }
        String str = "";
        if (list.size() == 1 && z) {
            UrlModel avatar = musicOwnerInfo.getAvatar();
            if (avatar != null && (c427660Gpo2 = this.LLILZ) != null) {
                C427660Gpo.LJIIJJI(c427660Gpo2, C438710HIf.LIZ(avatar), false, null, null, false, false, null, null, false, null, 1022);
            }
            String nickName = musicOwnerInfo.getNickName();
            if (nickName != null) {
                str = nickName;
            }
            setMusicOwnerDisplayName(str);
            TuxTextView tuxTextView = this.LLILLL;
            if (tuxTextView != null) {
                C630120Ona.LIZ(tuxTextView);
            }
            TuxIconView tuxIconView = this.LLILZLL;
            if (tuxIconView != null) {
                C630120Ona.LIZ(tuxIconView);
            }
            if (musicOwnerInfo.getVerified() && (imageView2 = this.LLIZ) != null) {
                C630120Ona.LIZIZ(imageView2);
            }
            if (!C630970Oox.LIZJ(musicOwnerInfo) || (((followStatus = musicOwnerInfo.getFollowStatus()) == null || followStatus.intValue() != 0) && (((followStatus2 = musicOwnerInfo.getFollowStatus()) == null || followStatus2.intValue() != 4) && !this.LLJIJIL))) {
                C1908730zln c1908730zln = this.LLILZIL;
                if (c1908730zln != null) {
                    C630120Ona.LIZ(c1908730zln);
                    return;
                }
                return;
            }
            this.LLJIJIL = true;
            C1908730zln c1908730zln2 = this.LLILZIL;
            if (c1908730zln2 != null) {
                C630120Ona.LIZIZ(c1908730zln2);
            }
            Integer followStatus3 = musicOwnerInfo.getFollowStatus();
            if (followStatus3 != null && followStatus3.intValue() == 1) {
                C1908730zln c1908730zln3 = this.LLILZIL;
                if (c1908730zln3 != null) {
                    c1908730zln3.setOnTouchListener(null);
                }
            } else {
                C1908730zln c1908730zln4 = this.LLILZIL;
                if (c1908730zln4 != null) {
                    C427690Gpr.LJI(c1908730zln4, null);
                }
            }
            C1908730zln c1908730zln5 = this.LLILZIL;
            if (c1908730zln5 != null) {
                c1908730zln5.setDataChangeListener(new AwS588S0100000_9(this, 500));
            }
            User user = new User();
            user.setUid(musicOwnerInfo.getUid());
            user.setSecUid(musicOwnerInfo.getSecUid());
            user.setNickname(musicOwnerInfo.getNickName());
            Integer followStatus4 = musicOwnerInfo.getFollowStatus();
            if (followStatus4 != null) {
                iIntValue = followStatus4.intValue();
            } else {
                iIntValue = 0;
            }
            user.setFollowStatus(iIntValue);
            Integer followerStatus = musicOwnerInfo.getFollowerStatus();
            if (followerStatus != null) {
                iIntValue2 = followerStatus.intValue();
            } else {
                iIntValue2 = 0;
            }
            user.setFollowerStatus(iIntValue2);
            user.setPrivateAccount(musicOwnerInfo.isPrivateAccount());
            C1908730zln c1908730zln6 = this.LLILZIL;
            if (c1908730zln6 != null) {
                C0SWE c0swe = new C0SWE(user);
                c0swe.LIZIZ = EnumC1357230lQH.NORMAL;
                c0swe.LJFF = C0SY5.LIZIZ(getContext());
                c0swe.LIZLLL = C2097608Jq.LJIIIIZZ(new Pair(Boolean.FALSE, 52), new Pair(Boolean.TRUE, 52));
                c1908730zln6.LLLLZIL(c0swe.LIZ());
            }
            C1908730zln c1908730zln7 = this.LLILZIL;
            if (c1908730zln7 == null) {
                return;
            }
            c1908730zln7.setTracker(new AwS553S0100000_9(this, 1692));
            return;
        }
        if (list.size() > 1 && z) {
            UrlModel avatar2 = musicOwnerInfo.getAvatar();
            if (avatar2 != null && (c427660Gpo = this.LLILZ) != null) {
                C427660Gpo.LJIIJJI(c427660Gpo, C438710HIf.LIZ(avatar2), false, null, null, false, false, null, null, false, null, 1022);
            }
            String nickName2 = musicOwnerInfo.getNickName();
            if (nickName2 == null) {
                nickName2 = "";
            }
            setMusicOwnerDisplayName(nickName2);
            if (musicOwnerInfo.getVerified() && (imageView = this.LLIZ) != null) {
                C630120Ona.LIZIZ(imageView);
            }
            TuxTextView tuxTextView2 = this.LLILLL;
            if (tuxTextView2 != null) {
                C630120Ona.LIZIZ(tuxTextView2);
            }
            TuxTextView tuxTextView3 = this.LLILLL;
            if (tuxTextView3 != null) {
                Context context = getContext();
                if (context != null && (resources2 = context.getResources()) != null && (string2 = resources2.getString(2131837773, Integer.valueOf(list.size() - 1))) != null) {
                    str = string2;
                }
                tuxTextView3.setText(str);
            }
            TuxIconView tuxIconView2 = this.LLILZLL;
            if (tuxIconView2 != null) {
                C630120Ona.LIZIZ(tuxIconView2);
            }
            C1908730zln c1908730zln8 = this.LLILZIL;
            if (c1908730zln8 == null) {
                return;
            }
            C630120Ona.LIZ(c1908730zln8);
            return;
        }
        if (list.size() <= 1 || z || !(musicOwnerInfo instanceof UncertMusicOwnerInfo) || (uncertMusicOwnerInfo = (UncertMusicOwnerInfo) musicOwnerInfo) == null) {
            return;
        }
        C427660Gpo c427660Gpo3 = this.LLILZ;
        if (c427660Gpo3 != null) {
            C630120Ona.LIZ(c427660Gpo3);
        }
        String name = uncertMusicOwnerInfo.getName();
        if (name == null) {
            name = "";
        }
        setMusicOwnerDisplayName(name);
        ImageView imageView3 = this.LLIZ;
        if (imageView3 != null) {
            C630120Ona.LIZ(imageView3);
        }
        TuxTextView tuxTextView4 = this.LLILLL;
        if (tuxTextView4 != null) {
            C630120Ona.LIZIZ(tuxTextView4);
        }
        TuxTextView tuxTextView5 = this.LLILLL;
        if (tuxTextView5 != null) {
            Context context2 = getContext();
            if (context2 != null && (resources = context2.getResources()) != null && (string = resources.getString(2131837773, Integer.valueOf(list.size() - 1))) != null) {
                str = string;
            }
            tuxTextView5.setText(str);
        }
        TuxIconView tuxIconView3 = this.LLILZLL;
        if (tuxIconView3 != null) {
            C630120Ona.LIZIZ(tuxIconView3);
        }
        C1908730zln c1908730zln9 = this.LLILZIL;
        if (c1908730zln9 == null) {
            return;
        }
        C630120Ona.LIZ(c1908730zln9);
    }
}
