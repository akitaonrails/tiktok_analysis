package X;

import Y.ARunnableS95S0200000_26;
import Y.ATListenerS461S0100000_29;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.emojislider.model.EmojiSliderStickerStruct;
import com.ss.android.ugc.aweme.feed.collection.friends.ability.IFriendsDetailPageAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.sticker.editcomponent.emojislider.EmojiSliderStickerFactoryService;
import com.ss.android.ugc.aweme.sticker.EmojiSliderStickerViewApi;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS157S0400000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11mV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19601311mV extends AbstractC19586911kB {
    public final InteractStickerStruct LJIIIZ;
    public final Aweme LJIIJ;
    public final InterfaceC665370Q7z LJIIJJI;
    public final InterfaceC19601711mZ LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public View LJIILL;
    public InterfaceC19601611mY LJIILLIIL;
    public final C01GW LJIIZILJ;
    public final C1713440ugo LJIJ;
    public SeekBar LJIJI;
    public ImageView LJIJJ;
    public ImageView LJIJJLI;
    public final C01GW LJIL;
    public final C01GW LJJ;

    @Override // X.AbstractC19586911kB
    public final void LJIJ() {
    }

    @Override // X.InterfaceC19594611lQ
    public final int getStickerType() {
        return 101;
    }

    @Override // X.InterfaceC19594811lS
    public final void LIZIZ() {
        if (this.LJIIL.LIZJ()) {
            this.LJIIL.LIZLLL(this.LJIJ);
        }
    }

    @Override // X.AbstractC19586911kB
    public final View LJIILL() {
        return new View(this.LIZ);
    }

    public final C19600411mM LJJI() {
        return (C19600411mM) this.LJIIZILJ.getValue();
    }

    @Override // X.InterfaceC19594811lS
    public final void LJJIII() {
        if (this.LJIIL.LIZJ()) {
            this.LJIIL.LIZIZ(this.LJIJ);
        }
    }

    @Override // X.InterfaceC19594811lS
    public final View getView() {
        SeekBar seekBar;
        SeekBar seekBar2;
        SeekBar seekBar3;
        InterfaceC665370Q7z interfaceC665370Q7z;
        IFriendsDetailPageAbility iFriendsDetailPageAbility;
        String emojiContent;
        SeekBar seekBar4;
        EmojiSliderStickerViewApi emojiSliderStickerViewApi;
        String emojiContent2;
        String questionText;
        if (this.LJIILL == null) {
            FrameLayout frameLayout = new FrameLayout(this.LIZ);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            C786410Ut5.a6(frameLayout, layoutParams);
            Object objLIZ = C04TD.LIZ(EmojiSliderStickerViewApi.class, false);
            if (objLIZ != null) {
                emojiSliderStickerViewApi = (EmojiSliderStickerViewApi) objLIZ;
            } else {
                if (C04TD.r5 == null) {
                    synchronized (EmojiSliderStickerViewApi.class) {
                        if (C04TD.r5 == null) {
                            C04TD.r5 = new EmojiSliderStickerFactoryService();
                        }
                    }
                }
                emojiSliderStickerViewApi = C04TD.r5;
            }
            Context context = this.LIZ;
            EmojiSliderStickerStruct emojiSliderStickerStruct = this.LJIIIZ.getEmojiSliderStickerStruct();
            if (emojiSliderStickerStruct == null || (emojiContent2 = emojiSliderStickerStruct.getEmojiContent()) == null) {
                emojiContent2 = "😍";
            }
            EmojiSliderStickerStruct emojiSliderStickerStruct2 = this.LJIIIZ.getEmojiSliderStickerStruct();
            if (emojiSliderStickerStruct2 == null || (questionText = emojiSliderStickerStruct2.getQuestionText()) == null) {
                questionText = "";
            }
            C19602511mh c19602511mhLIZ = emojiSliderStickerViewApi.LIZ(context, emojiContent2, questionText);
            c19602511mhLIZ.getView();
            C786410Ut5.LJLLLLLL(4, c19602511mhLIZ);
            c19602511mhLIZ.getView();
            frameLayout.addView(c19602511mhLIZ);
            c19602511mhLIZ.getView();
            HandlerHook.viewPost(c19602511mhLIZ, new ARunnableS95S0200000_26(this, c19602511mhLIZ, 39));
            this.LJIILLIIL = c19602511mhLIZ;
            this.LJIILL = frameLayout;
        }
        LJJI().getClass();
        final User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        boolean zLJIILIIL = LJJI().LJIILIIL();
        if (this.LJIIIZ.getEmojiSliderStickerStruct() != null) {
            InterfaceC19601611mY interfaceC19601611mY = this.LJIILLIIL;
            Bitmap bitmapCreateScaledBitmap = null;
            this.LJIJI = interfaceC19601611mY != null ? interfaceC19601611mY.getSeekBar() : null;
            InterfaceC19601611mY interfaceC19601611mY2 = this.LJIILLIIL;
            this.LJIJJ = interfaceC19601611mY2 != null ? interfaceC19601611mY2.getSeekBarMarker() : null;
            InterfaceC19601611mY interfaceC19601611mY3 = this.LJIILLIIL;
            this.LJIJJLI = interfaceC19601611mY3 != null ? interfaceC19601611mY3.getSeekBarPopUpEmoji() : null;
            if (this.LJIJI != null) {
                if (C426750GoL.LIZLLL(this.LIZ) && (seekBar4 = this.LJIJI) != null) {
                    seekBar4.setLayoutDirection(1);
                }
                if (zLJIILIIL) {
                    SeekBar seekBar5 = this.LJIJI;
                    if (seekBar5 != null) {
                        seekBar5.setEnabled(false);
                    }
                    Long voteAverage = this.LJIIIZ.getEmojiSliderStickerStruct().getVoteAverage();
                    long jLongValue = voteAverage != null ? voteAverage.longValue() : 0L;
                    Long answerCount = this.LJIIIZ.getEmojiSliderStickerStruct().getAnswerCount();
                    EmojiSliderStickerStruct emojiSliderStickerStruct3 = this.LJIIIZ.getEmojiSliderStickerStruct();
                    if (emojiSliderStickerStruct3 == null || (emojiContent = emojiSliderStickerStruct3.getEmojiContent()) == null) {
                        emojiContent = "😍";
                    }
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    Paint paint = new Paint(1);
                    paint.setTextSize(iLIZIZ);
                    paint.setColor(-16777216);
                    paint.setTextAlign(Paint.Align.LEFT);
                    float f = -paint.ascent();
                    int iMeasureText = (int) (paint.measureText(emojiContent) + 0.5f);
                    int iDescent = (int) (paint.descent() + f + 0.5f);
                    if (iMeasureText > 0 && iDescent > 0) {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMeasureText, iDescent, Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap.eraseColor(0);
                        new Canvas(bitmapCreateBitmap).drawText(emojiContent, 0.0f, f, paint);
                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, iLIZIZ, iLIZIZ, true);
                    }
                    if (bitmapCreateScaledBitmap != null) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(C1BWL.LIZJ(), bitmapCreateScaledBitmap);
                        SeekBar seekBar6 = this.LJIJI;
                        if (seekBar6 != null) {
                            seekBar6.setThumb(bitmapDrawable);
                        }
                        if (C08A4.LIZIZ(answerCount)) {
                            SeekBar seekBar7 = this.LJIJI;
                            if (seekBar7 != null) {
                                seekBar7.setProgress((int) jLongValue);
                            }
                        } else {
                            SeekBar seekBar8 = this.LJIJI;
                            if (seekBar8 != null) {
                                seekBar8.setProgress(0);
                            }
                        }
                    }
                } else {
                    if ((C729510SjV.LJJIJIL(this.LJIIJ) || this.LJIILIIL) && !C19595311lX.LIZ(this.LJIIIZ, this.LJIIJ, "pan") && (seekBar = this.LJIJI) != null) {
                        seekBar.setOnTouchListener(new ATListenerS461S0100000_29(this, 22));
                    }
                    if (this.LJIILJJIL && !C19595311lX.LIZ(this.LJIIIZ, this.LJIIJ, "pan") && (seekBar3 = this.LJIJI) != null && (interfaceC665370Q7z = this.LJIIJJI) != null && (iFriendsDetailPageAbility = (IFriendsDetailPageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IFriendsDetailPageAbility.class, null)) != null) {
                        iFriendsDetailPageAbility.Fy1(seekBar3, AFwS229S0000000_2.get$arr$(674));
                    }
                    if (this.LJIIIZ.getEmojiSliderStickerStruct().getVoteVal() == null) {
                        SeekBar seekBar9 = this.LJIJI;
                        if (seekBar9 != null) {
                            seekBar9.setEnabled(true);
                        }
                        if (!C19595311lX.LIZ(this.LJIIIZ, this.LJIIJ, "pan") && (seekBar2 = this.LJIJI) != null) {
                            C786410Ut5.wb(seekBar2, new SeekBar.OnSeekBarChangeListener() { // from class: X.11mU
                                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                                public final void onStartTrackingTouch(SeekBar seekBar10) {
                                    String aid;
                                    String uid;
                                    User author;
                                    if (seekBar10 == null) {
                                        return;
                                    }
                                    C19600411mM c19600411mMLJJI = this.LL.LJJI();
                                    c19600411mMLJJI.getClass();
                                    C2344009Gk c2344009Gk = new C2344009Gk();
                                    c2344009Gk.LIZJ(C729510SjV.LJJIJIL(c19600411mMLJJI.LJ) ? 1 : 0, "is_story");
                                    Aweme aweme = c19600411mMLJJI.LJ;
                                    Bitmap bitmapLIZ = null;
                                    if (aweme != null) {
                                        aid = aweme.getAid();
                                    } else {
                                        aid = null;
                                    }
                                    c2344009Gk.LJIIIIZZ("group_id", aid);
                                    Aweme aweme2 = c19600411mMLJJI.LJ;
                                    if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
                                        uid = author.getUid();
                                    } else {
                                        uid = null;
                                    }
                                    c2344009Gk.LJIIIIZZ("author_id", uid);
                                    c2344009Gk.LJIIIIZZ("sticker_type", C1894907bX.LIZ(c19600411mMLJJI.LJ));
                                    c2344009Gk.LJIIIIZZ("action_type", "slide");
                                    C20684815ws.LJIILLIIL("interact_with_sticker", c2344009Gk.LIZ);
                                    this.LL.LJJIFFI(curUser);
                                    C1440005kM.LIZ(new C453940Hr6(true, false, (AbstractC453920Hr4) C453930Hr5.LIZ));
                                    C19601311mV c19601311mV = this.LL;
                                    InterfaceC19601611mY interfaceC19601611mY4 = c19601311mV.LJIILLIIL;
                                    if (interfaceC19601611mY4 != null) {
                                        bitmapLIZ = interfaceC19601611mY4.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(86)), c19601311mV.LJIIIZ.getEmojiSliderStickerStruct().getEmojiContent());
                                    }
                                    ImageView imageView = this.LL.LJIJJLI;
                                    if (imageView != null) {
                                        imageView.setImageBitmap(bitmapLIZ);
                                    }
                                    ((C0I94) this.LL.LJJ.getValue()).LIZIZ();
                                }

                                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                                public final void onStopTrackingTouch(SeekBar seekBar10) {
                                    String aid;
                                    if (seekBar10 == null) {
                                        return;
                                    }
                                    seekBar10.setEnabled(false);
                                    C19600411mM c19600411mMLJJI = this.LL.LJJI();
                                    int progress = seekBar10.getProgress();
                                    InterfaceC19599911mH interfaceC19599911mH = (InterfaceC19599911mH) c19600411mMLJJI.LJFF.getValue();
                                    Aweme aweme = c19600411mMLJJI.LJ;
                                    if (aweme == null || (aid = aweme.getAid()) == null) {
                                        aid = "";
                                    }
                                    interfaceC19599911mH.LJLJJLL(progress, aid, c19600411mMLJJI.LIZJ.getEmojiSliderStickerStruct().getEmojiContent());
                                    this.LL.LJIIIZ.getEmojiSliderStickerStruct().setVoteVal(Integer.valueOf(seekBar10.getProgress()));
                                    Object value = this.LL.LJIL.getValue();
                                    Long answerCount2 = this.LL.LJIIIZ.getEmojiSliderStickerStruct().getAnswerCount();
                                    Long voteAverage2 = this.LL.LJIIIZ.getEmojiSliderStickerStruct().getVoteAverage();
                                    int progress2 = seekBar10.getProgress();
                                    value.getClass();
                                    ((C0I94) this.LL.LJJ.getValue()).LIZJ(C423380Giu.LIZ(answerCount2, voteAverage2, progress2));
                                }

                                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                                public final void onProgressChanged(SeekBar seekBar10, int i, boolean z) {
                                    if (seekBar10 != null && z) {
                                        ((C0I94) this.LL.LJJ.getValue()).LIZLLL(i);
                                    }
                                }
                            });
                        }
                        ((C0I94) this.LJJ.getValue()).LIZ();
                    } else {
                        SeekBar seekBar10 = this.LJIJI;
                        if (seekBar10 != null) {
                            seekBar10.setEnabled(false);
                        }
                        LJJIFFI(curUser);
                        SeekBar seekBar11 = this.LJIJI;
                        if (seekBar11 != null) {
                            Integer voteVal = this.LJIIIZ.getEmojiSliderStickerStruct().getVoteVal();
                            seekBar11.setProgress(voteVal != null ? voteVal.intValue() : 0);
                        }
                    }
                }
            }
        }
        return this.LJIILL;
    }

    @Override // X.AbstractC19586911kB, X.InterfaceC19594811lS
    public final void onResume() {
        if (this.LJIIL.LIZJ()) {
            return;
        }
        this.LJIIL.LIZLLL(this.LJIJ);
    }

    @Override // X.AbstractC19586911kB
    public final void LJIJI() {
        ((InterfaceC19599911mH) LJJI().LJFF.getValue()).LJLJJL(C13BV.INSTANCE);
    }

    public final void LJJIFFI(User user) {
        if (this.LJIJI == null) {
            return;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(user.getAvatarThumb()));
        c1331670kl3LJIIIIZZ.LJJIJL(this.LIZ);
        c1331670kl3LJIIIIZZ.LIZLLL("EmojiSliderInteractView");
        c1331670kl3LJIIIIZZ.LJJII(new C19772512Xr(this, 6));
    }

    @Override // X.InterfaceC19594911lT
    public final boolean LJI(float f, float f2, int i, long j) {
        return LJJI().LJI(f, f2, i, j);
    }

    @Override // X.InterfaceC19594911lT
    public final boolean LJIIIZ(long j, int i, float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
        return LJJI().LJIIIZ(j, i, f, f2, interfaceC19579211iw);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.01em, X.0ugo] */
    public C19601311mV(int i, Context context, C194349111v c194349111v, InteractStickerStruct interactStickerStruct, C705930RmZ c705930RmZ, Aweme aweme, InterfaceC665370Q7z interfaceC665370Q7z, InterfaceC19601711mZ interfaceC19601711mZ, boolean z, boolean z2) {
        super(context, c194349111v, interactStickerStruct, c705930RmZ);
        this.LJIIIZ = interactStickerStruct;
        this.LJIIJ = aweme;
        this.LJIIJJI = interfaceC665370Q7z;
        this.LJIIL = interfaceC19601711mZ;
        this.LJIILIIL = z;
        this.LJIILJJIL = z2;
        this.LJIIZILJ = C452501pT.LIZIZ(new AwS157S0400000_29(context, this, c705930RmZ, c194349111v, 16));
        ?? r2 = new InterfaceC386201em() { // from class: X.0ugo
            @Override // X.InterfaceC386201em
            public final void LIZ(Long l) {
                View view;
                C19601311mV c19601311mV = this.LIZ;
                c19601311mV.getClass();
                if (l != null) {
                    l.longValue();
                    InteractStickerStruct interactStickerStruct2 = c19601311mV.LJII;
                    if (interactStickerStruct2 != null) {
                        List<NormalTrackTimeStamp> listLIZJ = C19580611jA.LIZJ(l.longValue(), interactStickerStruct2);
                        if (listLIZJ != null && !listLIZJ.isEmpty()) {
                            View view2 = c19601311mV.LJIILL;
                            if ((view2 == null || view2.getVisibility() != 0) && (view = c19601311mV.LJIILL) != null) {
                                C786410Ut5.LJLLLLLL(0, view);
                            }
                        } else {
                            View view3 = c19601311mV.LJIILL;
                            if (view3 != null) {
                                C786410Ut5.LJLLLLLL(8, view3);
                            }
                        }
                        InterfaceC19601611mY interfaceC19601611mY = c19601311mV.LJIILLIIL;
                        if (interfaceC19601611mY != null && interfaceC19601611mY.getView() != null) {
                            C19600411mM c19600411mMLJJI = c19601311mV.LJJI();
                            InterfaceC19601611mY interfaceC19601611mY2 = c19601311mV.LJIILLIIL;
                            if (interfaceC19601611mY2 != null) {
                                View view4 = interfaceC19601611mY2.getView();
                                c19600411mMLJJI.getClass();
                                if (view4.getWidth() != 0 && view4.getHeight() != 0) {
                                    c19600411mMLJJI.LJIILJJIL(view4);
                                    return;
                                } else {
                                    HandlerHook.viewPost(view4, new ARunnableS95S0200000_26(view4, c19600411mMLJJI, 40));
                                    return;
                                }
                            }
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                }
            }
        };
        this.LJIJ = r2;
        this.LJIL = C452501pT.LIZIZ(new AwS573S0100000_29(context, 1002));
        this.LJJ = C452501pT.LIZIZ(new AwS430S0200000_29(this, context, 116));
        if (!interfaceC19601711mZ.LIZJ()) {
            interfaceC19601711mZ.LIZLLL(r2);
        }
    }
}
