package X;

import Y.ACListenerS165S0100000_31;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15IP, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15IP extends C15IO {
    public String LLLILZJ;
    public final C1D92 LLLILZLLLI;
    public final View LLLIZZ;
    public final View LLLJ;
    public final C426090GnH LLLJIL;
    public Boolean LLLJL;
    public boolean LLLL;

    public final void U5() {
        if (this.LLJLILLLLZIIL.getCollectionType() != null) {
            this.LLJJLIIIJLLLLLLLZ = this.LLJLILLLLZIIL.isCollected();
        }
        R5();
    }

    public final boolean W5() {
        Music music;
        List<MusicTag> musicTags;
        MusicModel musicModel = this.LLJLILLLLZIIL;
        return (musicModel == null || (music = musicModel.getMusic()) == null || (musicTags = music.getMusicTags()) == null || musicTags.size() <= 0 || !C123100dR.LIZ(((MusicTag) ListProtector.get(this.LLJLILLLLZIIL.getMusicTags(), 0)).getTagTitle())) ? false : true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:116:0x02ee. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0506  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T5(X.C15IQ r12) {
        /*
            Method dump skipped, instruction units count: 1470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15IP.T5(X.15IQ):void");
    }

    public final void V5(boolean z) {
        C786410Ut5.LJLZ(8, this.LLJILJILJ);
        if (this.LLJZIJLIL) {
            C786410Ut5.LJLZ(8, this.LLJILJILJ);
            return;
        }
        if (this.LLJI.getVisibility() == 8) {
            return;
        }
        if (z) {
            this.LLJJI.setClickable(false);
            int i = -C15IO.LLLILZ;
            int iLIZJ = (int) C12ES.LIZJ(30.0f, this.LLJL);
            if (C444960Hcc.LIZJ(this.LLJL)) {
                iLIZJ = -iLIZJ;
            }
            P5(0L, 1, 0, 0, i, 0, iLIZJ, true);
            return;
        }
        C786410Ut5.LJLZ(8, this.LLJI);
    }

    public final void X5(boolean z) {
        if (z) {
            this.LLJILJILJ.setBackground(this.itemView.getContext().getDrawable(R.drawable.cox));
            this.LLJILLL.setCompoundDrawablesRelative(null, null, null, null);
            this.LLJILLL.setText(this.itemView.getContext().getString(2131857990));
        } else {
            this.LLJILJILJ.setBackground(this.itemView.getContext().getDrawable(R.drawable.cow));
            this.LLJILLL.setCompoundDrawablesRelative(this.itemView.getContext().getDrawable(R.drawable.cov), null, null, null);
            this.LLJILLL.setText(this.itemView.getContext().getString(R.string.tfl));
        }
    }

    public final void b6(boolean z) {
        if (Intrinsics.LJFF(this.LLLJL, Boolean.TRUE)) {
            if (this.LLLFF) {
                return;
            }
            C786410Ut5.LJLZ(0, this.LLJILJILJ);
            X5(true);
            return;
        }
        X5(false);
        if (!this.LLLFF) {
            if (this.LLJZIJLIL) {
                C786410Ut5.LJLZ(0, this.LLJILJILJ);
                return;
            }
            C786410Ut5.LJLZ(8, this.LLJILJILJ);
            if (this.LLJI.getVisibility() != 0) {
                if (z) {
                    this.LLJJI.setClickable(false);
                    int i = -C15IO.LLLILZ;
                    int iLIZJ = (int) C12ES.LIZJ(30.0f, this.LLJL);
                    if (C444960Hcc.LIZJ(this.LLJL)) {
                        iLIZJ = -iLIZJ;
                    }
                    C786410Ut5.LJLZ(0, this.LLJI);
                    if (C444960Hcc.LIZJ(this.LLJL)) {
                        ((ViewGroup.MarginLayoutParams) this.LLJJ.getLayoutParams()).leftMargin = -C15IO.LLLILZ;
                    } else {
                        ((ViewGroup.MarginLayoutParams) this.LLJJ.getLayoutParams()).rightMargin = -C15IO.LLLILZ;
                    }
                    P5(100L, 0, 1, i, 0, iLIZJ, 0, false);
                    return;
                }
                C786410Ut5.LJLZ(0, this.LLJI);
            }
        }
    }

    public C15IP(int i, View view, boolean z) {
        C1D92 c1d92;
        View viewFindViewById;
        View viewFindViewById2;
        super(view);
        this.LLLJL = Boolean.FALSE;
        this.LLLF = z;
        this.LLL = false;
        if (view != null) {
            c1d92 = (C1D92) view.findViewById(R.id.ldw);
        } else {
            c1d92 = null;
        }
        this.LLLILZLLLI = c1d92;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.vma);
        } else {
            viewFindViewById = null;
        }
        this.LLLIZZ = viewFindViewById;
        if (view != null) {
            viewFindViewById2 = view.findViewById(R.id.lv7);
        } else {
            viewFindViewById2 = null;
        }
        this.LLLJ = viewFindViewById2;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS165S0100000_31(this, 117), viewFindViewById);
        }
        this.LLLJIL = view != null ? (C426090GnH) view.findViewById(R.id.v_music_tag) : null;
    }

    public final void a6(boolean z, boolean z2, boolean z3) {
        if (z) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.fc);
            animationLoadAnimation.setInterpolator(new LinearInterpolator());
            this.LLILZ.setImageResource(R.drawable.c6u);
            this.LLILZ.startAnimation(animationLoadAnimation);
            return;
        }
        this.LLILZ.clearAnimation();
        I5(z2);
        if (z3) {
            if (!this.LLLFF && this.LLJZ) {
                C786410Ut5.LJZI(0, this.LLJILJIL);
            }
            b6(true);
        } else {
            C786410Ut5.LJZI(8, this.LLJILJIL);
            V5(true);
        }
        MusicModel musicModel = this.LLJLILLLLZIIL;
        if (musicModel == null) {
            return;
        }
        if (z3) {
            if (musicModel.hasExtendMusicList()) {
                View view = this.LLLIZZ;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                View view2 = this.LLLJ;
                if (view2 == null) {
                    return;
                }
                C786410Ut5.LJLLLLLL(0, view2);
                return;
            }
            List<MusicModel> smartExtendMusicList = this.LLJLILLLLZIIL.getSmartExtendMusicList();
            if (smartExtendMusicList != null && !smartExtendMusicList.isEmpty()) {
                View view3 = this.LLLIZZ;
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(0, view3);
                }
                View view4 = this.LLLJ;
                if (view4 == null) {
                    return;
                }
                C786410Ut5.LJLLLLLL(8, view4);
                return;
            }
            View view5 = this.LLLIZZ;
            if (view5 == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(8, view5);
            return;
        }
        View view6 = this.LLLIZZ;
        if (view6 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view6);
    }
}
