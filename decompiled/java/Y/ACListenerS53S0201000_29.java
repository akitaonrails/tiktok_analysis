package Y;

import X.C0E48;
import X.C0FGT;
import X.C0LAB;
import X.C117V;
import X.C117X;
import X.C19394610uG;
import X.C19402110vT;
import X.C19408810wY;
import X.C19409110wb;
import X.C19409310wd;
import X.C19409510wf;
import X.C19410210wm;
import X.C194479116v;
import X.C19553011ei;
import X.C19564311gX;
import X.C19578111il;
import X.C19U0;
import X.C19Y5;
import X.C20684815ws;
import X.C21594319fB;
import X.C350890DpH;
import X.C361680EFy;
import X.C783760Uoo;
import X.InterfaceC19402510vX;
import X.InterfaceC19409010wa;
import X.InterfaceC19578011ik;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.discover.ui.DiscoverAndSearchFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoActivity;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.effect.logic.SoundEffectTabModel;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;

/* JADX INFO: loaded from: classes30.dex */
public class ACListenerS53S0201000_29 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onClick$12(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS53S0201000_29 aCListenerS53S0201000_29, View view) {
        C21594319fB c21594319fB = ((MentionVideoActivity) aCListenerS53S0201000_29.l0).LLILZ;
        if (c21594319fB == null) {
            c21594319fB = null;
        }
        c21594319fB.setCurrentItem(aCListenerS53S0201000_29.i2);
        ((C19Y5) aCListenerS53S0201000_29.l1).LIZ();
    }

    public static final void onClick$1(ACListenerS53S0201000_29 aCListenerS53S0201000_29, View view) {
        boolean z;
        String str;
        String extra;
        ViewPager viewPager = ((C19553011ei) aCListenerS53S0201000_29.l0).LLJLILLLLZIIL;
        if (viewPager != null) {
            viewPager.setCurrentItem(aCListenerS53S0201000_29.i2, true);
        }
        if (aCListenerS53S0201000_29.i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = ((SoundEffectTabModel) aCListenerS53S0201000_29.l1).name;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) ((C19553011ei) aCListenerS53S0201000_29.l0).LLJJJJ.getValue();
        C0E48 c0e48LIZIZ = ((C19553011ei) aCListenerS53S0201000_29.l0).LLLLIL().LIZIZ();
        if (videoPublishEditModel != null && c0e48LIZIZ != null) {
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48LIZIZ, new Pair(-1, -1));
            c0labLJFF.LJ("tab_name", str2);
            if (z) {
                str = "favorite";
            } else {
                str = "other";
            }
            c0labLJFF.LJ("sound_effect_source", str);
            NLETrack nLETrackLIZLLL = C350890DpH.LIZLLL(c0e48LIZIZ);
            if (nLETrackLIZLLL != null && (extra = nLETrackLIZLLL.getExtra("ep_audio_music_id")) != null) {
                str3 = extra;
            }
            c0labLJFF.LJ("music_id", str3);
            c0labLJFF.LIZ(1, "is_editor_pro");
            C20684815ws.LJIILLIIL("click_sound_effect_tab", c0labLJFF.LIZ);
        }
    }

    public static final void onClick$10(ACListenerS53S0201000_29 aCListenerS53S0201000_29, View view) {
        InterfaceC19409010wa interfaceC19409010wa = ((C19410210wm) aCListenerS53S0201000_29.l0).LLILZ;
        if (interfaceC19409010wa != null) {
            interfaceC19409010wa.LIZ(aCListenerS53S0201000_29.i2, ((RecyclerView.ViewHolder) aCListenerS53S0201000_29.l1).itemView);
        }
    }

    public static final void onClick$11(ACListenerS53S0201000_29 aCListenerS53S0201000_29, View view) {
        C19564311gX c19564311gX = (C19564311gX) aCListenerS53S0201000_29.l0;
        c19564311gX.LJI.invoke(Integer.valueOf(c19564311gX.LIZIZ), Integer.valueOf(aCListenerS53S0201000_29.i2), (C0FGT) aCListenerS53S0201000_29.l1);
    }

    public static final void onClick$12(ACListenerS53S0201000_29 aCListenerS53S0201000_29, View view) {
        C194479116v c194479116v = ((DiscoverAndSearchFragment) aCListenerS53S0201000_29.l0).LLIZ;
        if (c194479116v != null) {
            c194479116v.LLJILJILJ = aCListenerS53S0201000_29.i2;
        }
        ((C19U0) aCListenerS53S0201000_29.l1).LIZIZ();
    }

    public static final void onClick$2(ACListenerS53S0201000_29 aCListenerS53S0201000_29, View view) {
        if (((C19578111il) aCListenerS53S0201000_29.l0).getAweme() != null) {
            InterfaceC19578011ik interfaceC19578011ik = (InterfaceC19578011ik) aCListenerS53S0201000_29.l1;
            int i = aCListenerS53S0201000_29.i2;
            if (interfaceC19578011ik != null) {
                interfaceC19578011ik.LJI(Integer.valueOf(i));
            }
            C783760Uoo.LIZ.getClass();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("action_type", "view_original_story");
            C20684815ws.LJIILLIIL("secret_reply_sticker", c0lab.LIZ);
        }
    }

    public static final void onClick$3(ACListenerS53S0201000_29 aCListenerS53S0201000_29, View view) {
        ((C117X) aCListenerS53S0201000_29.l1).LLLFZ((C117V) aCListenerS53S0201000_29.l0, aCListenerS53S0201000_29.i2, false, "");
    }

    public static final void onClick$4(ACListenerS53S0201000_29 aCListenerS53S0201000_29, View view) {
        if (((C19394610uG) aCListenerS53S0201000_29.l0).getAdapterPosition() != -1) {
            C19394610uG c19394610uG = (C19394610uG) aCListenerS53S0201000_29.l0;
            c19394610uG.LL.invoke(Integer.valueOf(c19394610uG.getAdapterPosition()), Integer.valueOf(aCListenerS53S0201000_29.i2), (RecommendHashtag) aCListenerS53S0201000_29.l1);
        }
    }

    public static final void onClick$5(ACListenerS53S0201000_29 aCListenerS53S0201000_29, View view) {
        C19402110vT c19402110vT = (C19402110vT) aCListenerS53S0201000_29.l0;
        c19402110vT.notifyItemChanged(c19402110vT.LLIZ.invoke((InterfaceC19402510vX) aCListenerS53S0201000_29.l1).intValue());
        ((C19402110vT) aCListenerS53S0201000_29.l0).LLILZIL.u((InterfaceC19402510vX) aCListenerS53S0201000_29.l1);
        ((C19402110vT) aCListenerS53S0201000_29.l0).notifyItemChanged(aCListenerS53S0201000_29.i2);
    }

    public static final void onClick$6(ACListenerS53S0201000_29 aCListenerS53S0201000_29, View view) {
        InterfaceC19409010wa interfaceC19409010wa = ((C19408810wY) aCListenerS53S0201000_29.l0).LLILZ;
        if (interfaceC19409010wa != null) {
            interfaceC19409010wa.LIZ(aCListenerS53S0201000_29.i2, ((RecyclerView.ViewHolder) aCListenerS53S0201000_29.l1).itemView);
        }
    }

    public static final void onClick$7(ACListenerS53S0201000_29 aCListenerS53S0201000_29, View view) {
        InterfaceC19409010wa interfaceC19409010wa = ((C19409110wb) aCListenerS53S0201000_29.l0).LLILZ;
        if (interfaceC19409010wa != null) {
            interfaceC19409010wa.LIZ(aCListenerS53S0201000_29.i2, ((RecyclerView.ViewHolder) aCListenerS53S0201000_29.l1).itemView);
        }
    }

    public static final void onClick$8(ACListenerS53S0201000_29 aCListenerS53S0201000_29, View view) {
        InterfaceC19409010wa interfaceC19409010wa = ((C19409310wd) aCListenerS53S0201000_29.l0).LLILZ;
        if (interfaceC19409010wa != null) {
            interfaceC19409010wa.LIZ(aCListenerS53S0201000_29.i2, ((RecyclerView.ViewHolder) aCListenerS53S0201000_29.l1).itemView);
        }
    }

    public static final void onClick$9(ACListenerS53S0201000_29 aCListenerS53S0201000_29, View view) {
        InterfaceC19409010wa interfaceC19409010wa = ((C19409510wf) aCListenerS53S0201000_29.l0).LLILZ;
        if (interfaceC19409010wa != null) {
            interfaceC19409010wa.LIZ(aCListenerS53S0201000_29.i2, ((RecyclerView.ViewHolder) aCListenerS53S0201000_29.l1).itemView);
        }
    }

    public ACListenerS53S0201000_29(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
