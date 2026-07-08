package X;

import Y.ALAdapterS4S0000000_29;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.focus.FocusTargetNode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11mO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19600611mO implements InterfaceC19602411mg {
    public final Context LL;
    public final C705930RmZ LLILLJJLI;
    public final C19EG LLILLL;
    public final Aweme LLILZ;
    public final boolean LLILZIL;
    public final Function1<String, Unit> LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1141));
    public boolean LLIZLLLIL;
    public Float LLJ;
    public Float LLJI;
    public Float LLJIJIL;
    public Float LLJILJIL;

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(InteractStickerStruct interactStickerStruct) {
        return false;
    }

    public final boolean LIZIZ() {
        User author;
        Aweme aweme = this.LLILZ;
        return Intrinsics.LJFF(C0XQ7.LJFF().getCurUser().getUid(), (aweme == null || (author = aweme.getAuthor()) == null) ? null : author.getUid());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(View view, boolean z) {
        Float f;
        Pair pair;
        Float f2;
        Float f3;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        if (this.LLJ == null) {
            Float fValueOf4 = null;
            if (view != null) {
                fValueOf = Float.valueOf(view.getScaleX());
            } else {
                fValueOf = null;
            }
            this.LLJ = fValueOf;
            if (view != null) {
                fValueOf2 = Float.valueOf(view.getScaleY());
            } else {
                fValueOf2 = null;
            }
            this.LLJI = fValueOf2;
            Float f4 = this.LLJ;
            if (f4 != null) {
                fValueOf3 = Float.valueOf(f4.floatValue() * 0.85f);
            } else {
                fValueOf3 = null;
            }
            this.LLJIJIL = fValueOf3;
            Float f5 = this.LLJI;
            if (f5 != null) {
                fValueOf4 = Float.valueOf(f5.floatValue() * 0.85f);
            }
            this.LLJILJIL = fValueOf4;
        }
        Float f6 = this.LLJ;
        if (f6 != null && this.LLJI != null && (f = this.LLJIJIL) != null && this.LLJILJIL != null && view != null) {
            if (z) {
                float[] fArr = new float[2];
                fArr[0] = f6.floatValue();
                Float f7 = this.LLJIJIL;
                if (f7 != null) {
                    fArr[1] = f7.floatValue();
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", fArr);
                    float[] fArr2 = new float[2];
                    Float f8 = this.LLJI;
                    if (f8 != null) {
                        fArr2[0] = f8.floatValue();
                        Float f9 = this.LLJILJIL;
                        if (f9 != null) {
                            fArr2[1] = f9.floatValue();
                            pair = new Pair(objectAnimatorOfFloat, ObjectAnimator.ofFloat(view, "scaleY", fArr2));
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                float[] fArr3 = new float[2];
                fArr3[0] = f.floatValue();
                Float f10 = this.LLJ;
                if (f10 != null) {
                    fArr3[1] = f10.floatValue();
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleX", fArr3);
                    float[] fArr4 = new float[2];
                    Float f11 = this.LLJILJIL;
                    if (f11 != null) {
                        fArr4[0] = f11.floatValue();
                        Float f12 = this.LLJI;
                        if (f12 != null) {
                            fArr4[1] = f12.floatValue();
                            pair = new Pair(objectAnimatorOfFloat2, ObjectAnimator.ofFloat(view, "scaleY", fArr4));
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            Object first = pair.getFirst();
            Object second = pair.getSecond();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("orign scale: ");
            if (z) {
                f2 = this.LLJ;
            } else {
                f2 = this.LLJIJIL;
            }
            sbLIZ.append(f2);
            sbLIZ.append(", final scale: ");
            if (z) {
                f3 = this.LLJIJIL;
            } else {
                f3 = this.LLJ;
            }
            sbLIZ.append(f3);
            C2188811AlT.LIZIZ(sbLIZ);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(C1619980sG4.LJI());
            animatorSet.setDuration(150L);
            animatorSet.playTogether(first, second);
            C1440005kM.LIZ(new C453940Hr6(true, false, (AbstractC453920Hr4) C453930Hr5.LIZ));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.addListener(new ALAdapterS4S0000000_29(2));
            animatorSet2.play(animatorSet);
            animatorSet2.start();
        }
    }

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(InteractStickerStruct interactStickerStruct, PointF pointF) {
        long playCount;
        int i = 0;
        if (interactStickerStruct.getInteractiveEmojiStickerStruct() == null || !LIZIZ()) {
            return false;
        }
        final C259800zU c259800zU = new C259800zU();
        C19582611jU c19582611jU = C19582611jU.LIZ;
        C19EG c19eg = this.LLILLL;
        C19582711jV c19582711jV = new C19582711jV(interactStickerStruct.getType(), pointF, new InterfaceC19583711jf() { // from class: X.11m5
            @Override // X.InterfaceC19583711jf
            public final List<InterfaceC450850Hm7> actions() {
                return Collections.singletonList(C19583611je.LIZ(this.LIZ.LL.getString(2131833866), new AwS430S0200000_29(this.LIZ, c259800zU, 137)));
            }
        }, new AwS608S0100000_29(c259800zU, (C259800zU<FocusTargetNode>) 895));
        AFwS273S0000000_29 aFwS273S0000000_29 = AFwS273S0000000_29.get$arr$(138);
        c19582611jU.getClass();
        C19582611jU.LJFF(c19eg, c19582711jV, aFwS273S0000000_29);
        Aweme aweme = this.LLILZ;
        if (aweme != null) {
            if (aweme.getIsTikTokStory()) {
                if (this.LLILZIL) {
                    i = 2;
                } else {
                    i = 1;
                }
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(i, "story_type");
            c2344009Gk.LJIIIIZZ("group_id", this.LLILZ.getAid());
            c2344009Gk.LJIIIIZZ("author_id", C1017070cZd.LJIJ(this.LLILZ));
            c2344009Gk.LJIIIIZZ("sticker_type", C1894907bX.LIZ(this.LLILZ));
            AwemeStatistics statistics = this.LLILZ.getStatistics();
            if (statistics != null) {
                playCount = statistics.getPlayCount();
            } else {
                playCount = 0;
            }
            c2344009Gk.LIZLLL(playCount, "vv_cnt");
            C20684815ws.LJIILLIIL("enter_interactive_sticker_result_list", c2344009Gk.LIZ);
        }
        return true;
    }

    @Override // X.InterfaceC19602411mg
    public final void sg(final View view, final InteractStickerStruct interactStickerStruct) {
        C19600111mJ c19600111mJ;
        if (LIZIZ()) {
            ((InterfaceC19599811mG) this.LLIZ.getValue()).LJLJJI(this.LLILZ);
            C705930RmZ c705930RmZ = this.LLILLJJLI;
            if (c705930RmZ != null && (c19600111mJ = c705930RmZ.LJIJJ) != null && c19600111mJ.LIZ == 1) {
                ((InterfaceC19599811mG) this.LLIZ.getValue()).LJLJJL(C19600011mI.LIZ(c19600111mJ));
            }
        }
        if (!LIZIZ()) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: X.11mR
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    String aid;
                    User author;
                    String aid2;
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 1) {
                            if (action == 3) {
                                this.LL.LIZ(view, false);
                            }
                            return true;
                        }
                        view.performClick();
                        this.LL.LIZ(view, false);
                        C19600611mO c19600611mO = this.LL;
                        if (!c19600611mO.LLIZLLLIL) {
                            InterfaceC19599811mG interfaceC19599811mG = (InterfaceC19599811mG) c19600611mO.LLIZ.getValue();
                            Aweme aweme = this.LL.LLILZ;
                            if (aweme == null || (aid2 = aweme.getAid()) == null) {
                                aid2 = "";
                            }
                            interfaceC19599811mG.LIZ(aid2, interactStickerStruct.getInteractiveEmojiStickerStruct().getEmojiContent());
                            this.LL.LLIZLLLIL = true;
                        }
                        if (C1388190mED.LIZ(this.LL.LL) != null) {
                            this.LL.LLILZLL.invoke(interactStickerStruct.getInteractiveEmojiStickerStruct().getEmojiContent());
                        }
                        C19600611mO c19600611mO2 = this.LL;
                        c19600611mO2.getClass();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LIZJ(C19601911mb.LIZ(c19600611mO2.LLILZ) ? 1 : 0, "is_story");
                        Aweme aweme2 = c19600611mO2.LLILZ;
                        String uid = null;
                        if (aweme2 != null) {
                            aid = aweme2.getAid();
                        } else {
                            aid = null;
                        }
                        c2344009Gk.LJIIIIZZ("group_id", aid);
                        Aweme aweme3 = c19600611mO2.LLILZ;
                        if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
                            uid = author.getUid();
                        }
                        c2344009Gk.LJIIIIZZ("author_id", uid);
                        c2344009Gk.LJIIIIZZ("sticker_type", C1894907bX.LIZ(c19600611mO2.LLILZ));
                        c2344009Gk.LJIIIIZZ("action_type", "click");
                        C20684815ws.LJIILLIIL("interact_with_sticker", c2344009Gk.LIZ);
                        return true;
                    }
                    this.LL.LIZ(view, true);
                    return true;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19600611mO(Context context, C705930RmZ c705930RmZ, C19EG c19eg, Aweme aweme, boolean z, Function1<? super String, Unit> function1) {
        this.LL = context;
        this.LLILLJJLI = c705930RmZ;
        this.LLILLL = c19eg;
        this.LLILZ = aweme;
        this.LLILZIL = z;
        this.LLILZLL = function1;
    }
}
