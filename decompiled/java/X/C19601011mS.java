package X;

import Y.ATListenerS461S0100000_29;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.compose.ui.focus.FocusTargetNode;
import com.ss.android.ugc.aweme.emojislider.model.EmojiSliderStickerStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11mS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19601011mS implements InterfaceC19602011mc {
    public final Context LL;
    public final C705930RmZ LLILLJJLI;
    public final C19EG LLILLL;
    public final Aweme LLILZ;
    public final boolean LLILZIL;
    public final ViewGroup LLILZLL;
    public final Function1<Boolean, Unit> LLIZ;
    public final boolean LLIZLLLIL;

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(InteractStickerStruct interactStickerStruct) {
        return false;
    }

    public final boolean LIZ() {
        User author;
        Aweme aweme = this.LLILZ;
        return Intrinsics.LJFF(C0XQ7.LJFF().getCurUser().getUid(), (aweme == null || (author = aweme.getAuthor()) == null) ? null : author.getUid());
    }

    @Override // X.InterfaceC19602011mc
    public final void Qh(InteractStickerStruct interactStickerStruct, final InterfaceC19601611mY interfaceC19601611mY) {
        SeekBar seekBar;
        long jLongValue;
        String emojiContent;
        SeekBar seekBar2;
        ViewGroup viewGroup = this.LLILZLL;
        int iIntValue = 0;
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        Context context = this.LL;
        Aweme aweme = this.LLILZ;
        C705930RmZ c705930RmZ = this.LLILLJJLI;
        boolean z = this.LLIZLLLIL;
        final C19601411mW c19601411mW = new C19601411mW(interactStickerStruct, context, aweme, c705930RmZ, z, this.LLIZ);
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (interactStickerStruct.getEmojiSliderStickerStruct() != null) {
            c19601411mW.LJFF = interfaceC19601611mY.getSeekBar();
            c19601411mW.LJI = interfaceC19601611mY.getSeekBarMarker();
            c19601411mW.LJII = interfaceC19601611mY.getSeekBarPopUpEmoji();
            if (c19601411mW.LJFF != null) {
                if (C426750GoL.LIZLLL(context) && (seekBar2 = c19601411mW.LJFF) != null) {
                    seekBar2.setLayoutDirection(1);
                }
                if (c19601411mW.LIZ()) {
                    SeekBar seekBar3 = c19601411mW.LJFF;
                    if (seekBar3 != null) {
                        seekBar3.setEnabled(false);
                    }
                    Long voteAverage = interactStickerStruct.getEmojiSliderStickerStruct().getVoteAverage();
                    if (voteAverage != null) {
                        jLongValue = voteAverage.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    Long answerCount = interactStickerStruct.getEmojiSliderStickerStruct().getAnswerCount();
                    EmojiSliderStickerStruct emojiSliderStickerStruct = interactStickerStruct.getEmojiSliderStickerStruct();
                    if (emojiSliderStickerStruct == null || (emojiContent = emojiSliderStickerStruct.getEmojiContent()) == null) {
                        emojiContent = "😍";
                    }
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(C1BWL.LIZJ(), interfaceC19601611mY.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), emojiContent));
                    SeekBar seekBar4 = c19601411mW.LJFF;
                    if (seekBar4 != null) {
                        seekBar4.setThumb(bitmapDrawable);
                    }
                    if (C08A4.LIZIZ(answerCount)) {
                        SeekBar seekBar5 = c19601411mW.LJFF;
                        if (seekBar5 != null) {
                            seekBar5.setProgress((int) jLongValue);
                            return;
                        }
                        return;
                    }
                    SeekBar seekBar6 = c19601411mW.LJFF;
                    if (seekBar6 == null) {
                        return;
                    }
                    seekBar6.setProgress(0);
                    return;
                }
                if ((C19601911mb.LIZ(aweme) || z) && (seekBar = c19601411mW.LJFF) != null) {
                    seekBar.setOnTouchListener(new ATListenerS461S0100000_29(c19601411mW, 23));
                }
                if (interactStickerStruct.getEmojiSliderStickerStruct().getVoteVal() == null) {
                    SeekBar seekBar7 = c19601411mW.LJFF;
                    if (seekBar7 != null) {
                        seekBar7.setEnabled(true);
                    }
                    SeekBar seekBar8 = c19601411mW.LJFF;
                    if (seekBar8 != null) {
                        C786410Ut5.wb(seekBar8, new SeekBar.OnSeekBarChangeListener() { // from class: X.11mT
                            @Override // android.widget.SeekBar.OnSeekBarChangeListener
                            public final void onStartTrackingTouch(SeekBar seekBar9) {
                                String aid;
                                User author;
                                if (seekBar9 == null) {
                                    return;
                                }
                                C19601411mW c19601411mW2 = c19601411mW;
                                c19601411mW2.getClass();
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LIZJ(C19601911mb.LIZ(c19601411mW2.LIZJ) ? 1 : 0, "is_story");
                                Aweme aweme2 = c19601411mW2.LIZJ;
                                String uid = null;
                                if (aweme2 != null) {
                                    aid = aweme2.getAid();
                                } else {
                                    aid = null;
                                }
                                c2344009Gk.LJIIIIZZ("group_id", aid);
                                Aweme aweme3 = c19601411mW2.LIZJ;
                                if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
                                    uid = author.getUid();
                                }
                                c2344009Gk.LJIIIIZZ("author_id", uid);
                                c2344009Gk.LJIIIIZZ("sticker_type", C1894907bX.LIZ(c19601411mW2.LIZJ));
                                c2344009Gk.LJIIIIZZ("action_type", "slide");
                                C20684815ws.LJIILLIIL("interact_with_sticker", c2344009Gk.LIZ);
                                C19601411mW c19601411mW3 = c19601411mW;
                                c19601411mW3.getClass();
                                c19601411mW3.LIZIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser(), seekBar9);
                                C1440005kM.LIZ(new C453940Hr6(true, false, (AbstractC453920Hr4) C453930Hr5.LIZ));
                                Bitmap bitmapLIZ = interfaceC19601611mY.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(86)), c19601411mW.LIZ.getEmojiSliderStickerStruct().getEmojiContent());
                                ImageView imageView = c19601411mW.LJII;
                                if (imageView != null) {
                                    imageView.setImageBitmap(bitmapLIZ);
                                }
                                ((C0I94) c19601411mW.LJIIIZ.getValue()).LIZIZ();
                            }

                            @Override // android.widget.SeekBar.OnSeekBarChangeListener
                            public final void onStopTrackingTouch(SeekBar seekBar9) {
                                String aid;
                                if (seekBar9 == null) {
                                    return;
                                }
                                seekBar9.setEnabled(false);
                                C19601411mW c19601411mW2 = c19601411mW;
                                int progress = seekBar9.getProgress();
                                InterfaceC19599911mH interfaceC19599911mH = (InterfaceC19599911mH) c19601411mW2.LJIIJ.getValue();
                                Aweme aweme2 = c19601411mW2.LIZJ;
                                if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                                    aid = "";
                                }
                                interfaceC19599911mH.LJLJJLL(progress, aid, c19601411mW2.LIZ.getEmojiSliderStickerStruct().getEmojiContent());
                                c19601411mW.LIZ.getEmojiSliderStickerStruct().setVoteVal(Integer.valueOf(seekBar9.getProgress()));
                                Object value = c19601411mW.LJIIIIZZ.getValue();
                                Long answerCount2 = c19601411mW.LIZ.getEmojiSliderStickerStruct().getAnswerCount();
                                Long voteAverage2 = c19601411mW.LIZ.getEmojiSliderStickerStruct().getVoteAverage();
                                int progress2 = seekBar9.getProgress();
                                value.getClass();
                                ((C0I94) c19601411mW.LJIIIZ.getValue()).LIZJ(C423380Giu.LIZ(answerCount2, voteAverage2, progress2));
                            }

                            @Override // android.widget.SeekBar.OnSeekBarChangeListener
                            public final void onProgressChanged(SeekBar seekBar9, int i, boolean z2) {
                                if (seekBar9 != null && z2) {
                                    ((C0I94) c19601411mW.LJIIIZ.getValue()).LIZLLL(i);
                                }
                            }
                        });
                    }
                    ((C0I94) c19601411mW.LJIIIZ.getValue()).LIZ();
                    return;
                }
                SeekBar seekBar9 = c19601411mW.LJFF;
                if (seekBar9 != null) {
                    seekBar9.setEnabled(false);
                }
                SeekBar seekBar10 = c19601411mW.LJFF;
                if (seekBar10 != null) {
                    c19601411mW.LIZIZ(curUser, seekBar10);
                }
                SeekBar seekBar11 = c19601411mW.LJFF;
                if (seekBar11 == null) {
                    return;
                }
                Integer voteVal = interactStickerStruct.getEmojiSliderStickerStruct().getVoteVal();
                if (voteVal != null) {
                    iIntValue = voteVal.intValue();
                }
                seekBar11.setProgress(iIntValue);
            }
        }
    }

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(final InteractStickerStruct interactStickerStruct, PointF pointF) {
        String uid;
        long playCount;
        if (interactStickerStruct.getEmojiSliderStickerStruct() == null || !LIZ()) {
            return false;
        }
        final C259800zU c259800zU = new C259800zU();
        C19582611jU c19582611jU = C19582611jU.LIZ;
        C19EG c19eg = this.LLILLL;
        C19582711jV c19582711jV = new C19582711jV(interactStickerStruct.getType(), pointF, new InterfaceC19583711jf() { // from class: X.11m4
            @Override // X.InterfaceC19583711jf
            public final List<InterfaceC450850Hm7> actions() {
                return Collections.singletonList(C19583611je.LIZ(this.LIZ.LL.getString(2131833866), new AwS273S0300000_29(this.LIZ, interactStickerStruct, c259800zU, 22)));
            }
        }, new AwS608S0100000_29(c259800zU, (C259800zU<FocusTargetNode>) 730));
        AFwS273S0000000_29 aFwS273S0000000_29 = AFwS273S0000000_29.get$arr$(138);
        c19582611jU.getClass();
        C19582611jU.LJFF(c19eg, c19582711jV, aFwS273S0000000_29);
        Aweme aweme = this.LLILZ;
        if (aweme != null) {
            if (aweme.getIsTikTokStory() && this.LLILZIL) {
                return true;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(this.LLILZ.getIsTikTokStory() ? 1 : 0, "story_type");
            c2344009Gk.LJIIIIZZ("group_id", this.LLILZ.getAid());
            User author = this.LLILZ.getAuthor();
            if (author == null || (uid = author.getUid()) == null) {
                uid = "";
            }
            c2344009Gk.LJIIIIZZ("author_id", uid);
            c2344009Gk.LJIIIIZZ("sticker_type", C1894907bX.LIZ(this.LLILZ));
            AwemeStatistics statistics = this.LLILZ.getStatistics();
            if (statistics != null) {
                playCount = statistics.getPlayCount();
            } else {
                playCount = 0;
            }
            c2344009Gk.LIZLLL(playCount, "vv_cnt");
            C20684815ws.LJIILLIIL("enter_interactive_sticker_result_list", c2344009Gk.LIZ);
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19601011mS(Context context, C705930RmZ c705930RmZ, C19EG c19eg, Aweme aweme, boolean z, ViewGroup viewGroup, Function1<? super Boolean, Unit> function1, boolean z2) {
        this.LL = context;
        this.LLILLJJLI = c705930RmZ;
        this.LLILLL = c19eg;
        this.LLILZ = aweme;
        this.LLILZIL = z;
        this.LLILZLL = viewGroup;
        this.LLIZ = function1;
        this.LLIZLLLIL = z2;
    }
}
