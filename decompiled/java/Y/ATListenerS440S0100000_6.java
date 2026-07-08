package Y;

import X.C098200Yq;
import X.C0LAB;
import X.C0PXC;
import X.C0RF0;
import X.C0ZLS;
import X.C118300cf;
import X.C1295960jpS;
import X.C1378990lzN;
import X.C1558520qew;
import X.C1609930rzr;
import X.C1618440sDa;
import X.C1619980sG4;
import X.C189200o6;
import X.C19724012Fa;
import X.C20684815ws;
import X.C2189821An6;
import X.C418440Gaw;
import X.C439101nJ;
import X.C447600Hgs;
import X.C689780R3w;
import X.C724270Sb3;
import X.C735840Sti;
import X.C786410Ut5;
import X.DialogC446620HfI;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.top.FriendsV3MessageAssem;
import com.ss.android.ugc.aweme.im.ability.SuppressPanelAutoSwitchAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldAssem;
import com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility;
import com.ss.android.ugc.aweme.internalshare.impl.ui.iminput.IInternalShareDirectInputAbility;
import com.ss.android.ugc.aweme.internalshare.impl.ui.iminput.InternalShareEditTextAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.common.sub.abroll.StoryAbRollComponent;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryPhotoAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.abroll.StoryAbRollProgressButton;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public class ATListenerS440S0100000_6 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            case BdTuring.TYPE_ECAF /* 9 */:
                return onTouch$9(this, view, motionEvent);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return onTouch$10(this, view, motionEvent);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return onTouch$11(this, view, motionEvent);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return onTouch$12(this, view, motionEvent);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return onTouch$13(this, view, motionEvent);
            case 14:
                return onTouch$14(this, view, motionEvent);
            case 15:
                return onTouch$15(this, view, motionEvent);
            case 16:
                return onTouch$16(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS440S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int LIZ$0(int i, int i2, List list) {
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            C447600Hgs c447600Hgs = (C447600Hgs) it2.next();
            int i4 = c447600Hgs.LIZ;
            if (i <= c447600Hgs.LIZJ && i4 <= i) {
                int i5 = c447600Hgs.LIZIZ;
                if (i2 <= c447600Hgs.LIZLLL && i5 <= i2) {
                    return i3;
                }
            }
            i3++;
        }
        return -1;
    }

    public static final boolean onTouch$0(ATListenerS440S0100000_6 aTListenerS440S0100000_6, View view, MotionEvent motionEvent) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        if (motionEvent.getAction() == 1) {
            IMSelectTextAbility iMSelectTextAbility = (IMSelectTextAbility) C1558520qew.LIZ(C1558520qew.LJIIL((InputFieldAssem) aTListenerS440S0100000_6.l0), IMSelectTextAbility.class, null);
            if (iMSelectTextAbility != null) {
                iMSelectTextAbility.dl0(C0ZLS.INPUT_FOCUSED);
            }
            InputFieldAssem inputFieldAssem = (InputFieldAssem) aTListenerS440S0100000_6.l0;
            HandlerHook.viewPost(inputFieldAssem.getContentView(), new ARunnableS106S0100000_6(inputFieldAssem, 264));
            return false;
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS440S0100000_6 aTListenerS440S0100000_6, View view, MotionEvent motionEvent) {
        if (((PopupWindow) aTListenerS440S0100000_6.l0).isShowing()) {
            ((PopupWindow) aTListenerS440S0100000_6.l0).dismiss();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$10(ATListenerS440S0100000_6 aTListenerS440S0100000_6, View view, MotionEvent motionEvent) {
        Bitmap bitmap;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                float width = view.getWidth();
                float x = motionEvent.getX();
                if (0.0f <= x && x <= width) {
                    float height = view.getHeight();
                    float y = motionEvent.getY();
                    if (0.0f <= y && y <= height && ((FriendsV3MessageAssem) aTListenerS440S0100000_6.l0).kp()) {
                        FriendsV3MessageAssem friendsV3MessageAssem = (FriendsV3MessageAssem) aTListenerS440S0100000_6.l0;
                        if (!friendsV3MessageAssem.LLJLIL && (bitmap = friendsV3MessageAssem.LLJL) != null) {
                            ViewParent parent = null;
                            friendsV3MessageAssem.LLJL = null;
                            friendsV3MessageAssem.LLJLIL = true;
                            RelationButton relationButtonEp = friendsV3MessageAssem.ep();
                            AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6((FriendsV3MessageAssem) aTListenerS440S0100000_6.l0, 1437);
                            final int width2 = bitmap.getWidth();
                            final int height2 = bitmap.getHeight();
                            ViewParent parent2 = relationButtonEp.getParent();
                            if (parent2 instanceof ViewGroup) {
                                viewGroup = (ViewGroup) parent2;
                                if (viewGroup != null) {
                                    parent = viewGroup.getParent();
                                }
                            } else {
                                viewGroup = null;
                            }
                            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                                viewGroup = viewGroup2;
                            }
                            if (viewGroup != null && width2 > 0 && height2 > 0) {
                                relationButtonEp.animate().cancel();
                                int[] iArr = new int[2];
                                relationButtonEp.getLocationInWindow(iArr);
                                int[] iArr2 = new int[2];
                                viewGroup.getLocationInWindow(iArr2);
                                final int i = iArr[0] - iArr2[0];
                                final int i2 = iArr[1] - iArr2[1];
                                final BitmapDrawable bitmapDrawable = new BitmapDrawable(relationButtonEp.getResources(), bitmap);
                                bitmapDrawable.setBounds(i, i2, i + width2, i2 + height2);
                                viewGroup.getOverlay().add(bitmapDrawable);
                                C786410Ut5.LJLLLLLL(4, relationButtonEp);
                                C786410Ut5.T4(relationButtonEp, 0.0f);
                                C786410Ut5.Ob(relationButtonEp, 0.0f);
                                C786410Ut5.pc(relationButtonEp, 0.0f);
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                                valueAnimatorOfFloat.setStartDelay(0L);
                                valueAnimatorOfFloat.setDuration(300L);
                                final float f = 0.8f;
                                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.06Ll
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        bitmapDrawable.setAlpha(C13LZ.LJ((int) (255 * fFloatValue), 0, 255));
                                        float f2 = f;
                                        float f3 = f2 + ((1.0f - f2) * fFloatValue);
                                        int i3 = width2;
                                        int i4 = (int) (i3 * f3);
                                        int i5 = 1;
                                        if (i4 < 1) {
                                            i4 = 1;
                                        }
                                        int i6 = height2;
                                        int i7 = (int) (i6 * f3);
                                        if (i7 >= 1) {
                                            i5 = i7;
                                        }
                                        int i8 = (i3 - i4) / 2;
                                        int i9 = (i6 - i5) / 2;
                                        BitmapDrawable bitmapDrawable2 = bitmapDrawable;
                                        int i10 = i;
                                        int i11 = i2;
                                        bitmapDrawable2.setBounds(i10 + i8, i11 + i9, i10 + i8 + i4, i11 + i9 + i5);
                                    }
                                });
                                valueAnimatorOfFloat.addListener(new ALAdapterS0S0400000_6(viewGroup, bitmapDrawable, relationButtonEp, awS550S0100000_6, 6));
                                valueAnimatorOfFloat.start();
                            } else {
                                relationButtonEp.animate().cancel();
                                relationButtonEp.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setStartDelay(0L).setDuration(300L).withEndAction(new ARunnableS75S0200000_6((Object) relationButtonEp, (Object) awS550S0100000_6, 127)).start();
                                return false;
                            }
                        }
                    }
                }
            }
        } else if (((FriendsV3MessageAssem) aTListenerS440S0100000_6.l0).kp() && view.getWidth() > 0 && view.getHeight() > 0) {
            try {
                ((FriendsV3MessageAssem) aTListenerS440S0100000_6.l0).LLJL = C19724012Fa.LIZ(view, Bitmap.Config.ARGB_8888);
                C189200o6.m2constructorimpl(Unit.LIZ);
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return false;
            }
        }
        return false;
    }

    public static final boolean onTouch$11(ATListenerS440S0100000_6 aTListenerS440S0100000_6, View view, MotionEvent motionEvent) {
        return ((DialogC446620HfI) aTListenerS440S0100000_6.l0).LJJZZIII(motionEvent);
    }

    public static final boolean onTouch$12(ATListenerS440S0100000_6 aTListenerS440S0100000_6, View view, MotionEvent motionEvent) {
        return ((DialogC446620HfI) aTListenerS440S0100000_6.l0).LJJZZIII(motionEvent);
    }

    public static final boolean onTouch$13(ATListenerS440S0100000_6 aTListenerS440S0100000_6, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            ((C689780R3w) aTListenerS440S0100000_6.l0).onClick(view);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$14(ATListenerS440S0100000_6 aTListenerS440S0100000_6, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            ((C689780R3w) aTListenerS440S0100000_6.l0).onClick(view);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$15(ATListenerS440S0100000_6 aTListenerS440S0100000_6, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((ValueAnimator) aTListenerS440S0100000_6.l0).start();
            return true;
        }
        return true;
    }

    public static final boolean onTouch$16(ATListenerS440S0100000_6 aTListenerS440S0100000_6, View view, MotionEvent motionEvent) {
        List list;
        boolean z;
        Object tag = view.getTag(R.id.knu);
        if (tag instanceof List) {
            list = (List) tag;
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        TextView textView = (TextView) view;
        int x = (int) ((motionEvent.getX() - textView.getTotalPaddingLeft()) + textView.getScrollX());
        int y = (int) ((motionEvent.getY() - textView.getTotalPaddingTop()) + textView.getScrollY());
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 3) {
                    return false;
                }
                ((C118300cf) aTListenerS440S0100000_6.l0).element = -1;
                return false;
            }
            int iLIZ$0 = LIZ$0(x, y, list);
            C118300cf c118300cf = (C118300cf) aTListenerS440S0100000_6.l0;
            int i = c118300cf.element;
            if (i >= 0 && iLIZ$0 == i) {
                z = true;
            } else {
                z = false;
            }
            c118300cf.element = -1;
            if (!z) {
                return false;
            }
            ((C447600Hgs) ListProtector.get(list, iLIZ$0)).LJ.invoke();
            return true;
        }
        ((C118300cf) aTListenerS440S0100000_6.l0).element = LIZ$0(x, y, list);
        if (((C118300cf) aTListenerS440S0100000_6.l0).element < 0) {
            return false;
        }
        return true;
    }

    public static final boolean onTouch$2(ATListenerS440S0100000_6 aTListenerS440S0100000_6, View view, MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return false;
        }
        ((PopupWindow) aTListenerS440S0100000_6.l0).dismiss();
        return true;
    }

    public static final boolean onTouch$3(ATListenerS440S0100000_6 aTListenerS440S0100000_6, View view, MotionEvent motionEvent) {
        int scaledTouchSlop;
        InternalShareEditTextAssem internalShareEditTextAssem = (InternalShareEditTextAssem) aTListenerS440S0100000_6.l0;
        if (internalShareEditTextAssem.LLJJIJIL == null) {
            internalShareEditTextAssem.LLJJIJIL = ViewConfiguration.get(view.getContext());
        }
        int action = motionEvent.getAction();
        boolean z = true;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    float y = motionEvent.getY();
                    InternalShareEditTextAssem internalShareEditTextAssem2 = (InternalShareEditTextAssem) aTListenerS440S0100000_6.l0;
                    float f = y - internalShareEditTextAssem2.LLJJIJIIJIL;
                    if (!internalShareEditTextAssem2.LLJJJ) {
                        float fAbs = Math.abs(f);
                        ViewConfiguration viewConfiguration = ((InternalShareEditTextAssem) aTListenerS440S0100000_6.l0).LLJJIJIL;
                        if (viewConfiguration != null) {
                            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                        } else {
                            scaledTouchSlop = 0;
                        }
                        if (fAbs <= scaledTouchSlop) {
                            z = false;
                        }
                    }
                    internalShareEditTextAssem2.LLJJJ = z;
                    return false;
                }
            }
            InternalShareEditTextAssem internalShareEditTextAssem3 = (InternalShareEditTextAssem) aTListenerS440S0100000_6.l0;
            if (internalShareEditTextAssem3.LLJJJ) {
                internalShareEditTextAssem3.LLJJJ = false;
                return true;
            }
            IInternalShareDirectInputAbility iInternalShareDirectInputAbility = (IInternalShareDirectInputAbility) C1558520qew.LIZ(C1558520qew.LJIIL((InternalShareEditTextAssem) aTListenerS440S0100000_6.l0), IInternalShareDirectInputAbility.class, null);
            if (iInternalShareDirectInputAbility != null) {
                iInternalShareDirectInputAbility.zJ("input_box", "input_box_text");
            }
            ((InternalShareEditTextAssem) aTListenerS440S0100000_6.l0).LLJJJ = false;
            return false;
        }
        SuppressPanelAutoSwitchAbility suppressPanelAutoSwitchAbility = (SuppressPanelAutoSwitchAbility) C1558520qew.LIZ(C1558520qew.LJIIL((InternalShareEditTextAssem) aTListenerS440S0100000_6.l0), SuppressPanelAutoSwitchAbility.class, null);
        if (suppressPanelAutoSwitchAbility != null) {
            suppressPanelAutoSwitchAbility.rq0(false);
        }
        ((InternalShareEditTextAssem) aTListenerS440S0100000_6.l0).LLJJIJIIJIL = motionEvent.getY();
        if (!view.canScrollVertically(-1) && !view.canScrollVertically(1)) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
            return false;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    public static final boolean onTouch$4(ATListenerS440S0100000_6 aTListenerS440S0100000_6, View view, MotionEvent motionEvent) {
        TextView textView = (TextView) view;
        if (motionEvent.getAction() == 1) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            int scrollY = totalPaddingTop + textView.getScrollY();
            Layout layout = textView.getLayout();
            if (layout == null) {
                return false;
            }
            int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((SpannableString) aTListenerS440S0100000_6.l0).getSpans(iU3, iU3, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                clickableSpanArr[0].onClick(textView);
            }
        }
        return true;
    }

    public static final boolean onTouch$5(ATListenerS440S0100000_6 aTListenerS440S0100000_6, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            ((C0PXC) aTListenerS440S0100000_6.l0).onClick(view);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$6(ATListenerS440S0100000_6 aTListenerS440S0100000_6, View view, MotionEvent motionEvent) {
        Object obj;
        String eventType;
        String strLJIL;
        String authorUid;
        String aid;
        Integer numValueOf;
        User author;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        BaseFeedPageParams baseFeedPageParams2;
        C2189821An6 c2189821An62;
        if (!((StoryAbRollComponent) aTListenerS440S0100000_6.l0).LLLII) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                StoryAbRollComponent storyAbRollComponent = (StoryAbRollComponent) aTListenerS440S0100000_6.l0;
                if (storyAbRollComponent.LLLIIII && !storyAbRollComponent.LLLI) {
                    storyAbRollComponent.Fp(false);
                    StoryAbRollComponent storyAbRollComponent2 = (StoryAbRollComponent) aTListenerS440S0100000_6.l0;
                    storyAbRollComponent2.getClass();
                    C735840Sti c735840Sti = C735840Sti.LIZ;
                    C724270Sb3 c724270Sb3 = storyAbRollComponent2.LLJI;
                    Integer numValueOf2 = null;
                    if (c724270Sb3 != null) {
                        obj = c724270Sb3.LL;
                    } else {
                        obj = null;
                    }
                    Aweme aweme = ((VideoItemParams) obj).getAweme();
                    C0RF0 c0rf0 = storyAbRollComponent2.jm().LIZLLL;
                    if (c0rf0 != null && (baseFeedPageParams2 = c0rf0.LJ) != null && (c2189821An62 = baseFeedPageParams2.param) != null) {
                        eventType = c2189821An62.getEventType();
                    } else {
                        eventType = null;
                    }
                    C0RF0 c0rf02 = storyAbRollComponent2.jm().LIZLLL;
                    if (c0rf02 != null && (baseFeedPageParams = c0rf02.LJ) != null && (c2189821An6 = baseFeedPageParams.param) != null) {
                        strLJIL = C1609930rzr.LJIL(c2189821An6);
                    } else {
                        strLJIL = null;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() - storyAbRollComponent2.LLLIIIIL;
                    c735840Sti.getClass();
                    C0LAB c0lab = new C0LAB();
                    if (aweme != null) {
                        authorUid = AwemeExtKt.getAuthorUid(aweme);
                    } else {
                        authorUid = null;
                    }
                    c0lab.LJ("author_id", authorUid);
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    c0lab.LJ("group_id", aid);
                    if (aweme != null) {
                        numValueOf = Integer.valueOf(aweme.getAwemeType());
                    } else {
                        numValueOf = null;
                    }
                    c0lab.LIZLLL(numValueOf, "aweme_type");
                    if (aweme != null && (author = aweme.getAuthor()) != null) {
                        numValueOf2 = Integer.valueOf(author.getFollowStatus());
                    }
                    c0lab.LIZLLL(numValueOf2, "follow_status");
                    c0lab.LJ("story_type", "story");
                    c0lab.LJ("enter_from", eventType);
                    c0lab.LJ("enter_position", strLJIL);
                    c0lab.LIZIZ(jCurrentTimeMillis, "hold_duration");
                    C20684815ws.LJIILLIIL("story_hold_b", c0lab.LIZ);
                    return true;
                }
            }
            return true;
        }
        StoryAbRollComponent storyAbRollComponent3 = (StoryAbRollComponent) aTListenerS440S0100000_6.l0;
        if (storyAbRollComponent3.LLLI) {
            return true;
        }
        storyAbRollComponent3.LLLIIII = true;
        storyAbRollComponent3.LLLIIIIL = System.currentTimeMillis();
        return true;
    }

    public static final boolean onTouch$7(ATListenerS440S0100000_6 aTListenerS440S0100000_6, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                StoryAbRollComponent storyAbRollComponent = (StoryAbRollComponent) aTListenerS440S0100000_6.l0;
                if (!storyAbRollComponent.LLLFZ) {
                    return true;
                }
                storyAbRollComponent.LLLFZ = false;
                if (!storyAbRollComponent.LLLI && !storyAbRollComponent.LLLII) {
                    storyAbRollComponent.Ep();
                    return true;
                }
            }
        } else {
            StoryAbRollComponent storyAbRollComponent2 = (StoryAbRollComponent) aTListenerS440S0100000_6.l0;
            if (storyAbRollComponent2.LLLI) {
                return true;
            }
            storyAbRollComponent2.LLLFZ = true;
            C1618440sDa.LIZIZ.LJJLIIIIJ(C1558520qew.LJIIL((StoryAbRollComponent) aTListenerS440S0100000_6.l0), true);
            StoryAbRollComponent storyAbRollComponent3 = (StoryAbRollComponent) aTListenerS440S0100000_6.l0;
            StoryPhotoAbility storyPhotoAbility = (StoryPhotoAbility) storyAbRollComponent3.LLJLLIL.getValue();
            if (storyPhotoAbility != null) {
                storyPhotoAbility.pausePlay();
            }
            StoryAbRollProgressButton storyAbRollProgressButtonJp = storyAbRollComponent3.Jp();
            if (storyAbRollProgressButtonJp != null) {
                ALAdapterS3S0100000_6 aLAdapterS3S0100000_6 = new ALAdapterS3S0100000_6(storyAbRollComponent3, 21);
                storyAbRollProgressButtonJp.LLJJ = true;
                ObjectAnimator objectAnimator = storyAbRollProgressButtonJp.LLJILJILJ;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                ObjectAnimator objectAnimator2 = storyAbRollProgressButtonJp.LLJILLL;
                if (objectAnimator2 != null) {
                    objectAnimator2.cancel();
                }
                ObjectAnimator objectAnimator3 = storyAbRollProgressButtonJp.LLJIJIL;
                if (objectAnimator3 != null) {
                    objectAnimator3.cancel();
                }
                ObjectAnimator objectAnimator4 = storyAbRollProgressButtonJp.LLJILJIL;
                if (objectAnimator4 != null) {
                    objectAnimator4.cancel();
                }
                ValueAnimator valueAnimator = storyAbRollProgressButtonJp.LLIZ;
                if (valueAnimator != null) {
                    valueAnimator.pause();
                }
                storyAbRollProgressButtonJp.LIZJ(storyAbRollProgressButtonJp.getScaleX(), 0.85f);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(100.0f, 32.0f);
                valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
                valueAnimatorOfFloat.setDuration(300L);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(storyAbRollProgressButtonJp, 180));
                valueAnimatorOfFloat.addListener(new ALAdapterS3S0200000_6(aLAdapterS3S0100000_6, storyAbRollProgressButtonJp, 40));
                valueAnimatorOfFloat.start();
                storyAbRollProgressButtonJp.LLIZLLLIL = valueAnimatorOfFloat;
            }
            if (storyAbRollComponent3.Gp() != null) {
                C1378990lzN.LIZIZ(storyAbRollComponent3.Gp(), Float.valueOf(C418440Gaw.LIZIZ(14)), null, null, null, null, 30);
                storyAbRollComponent3.Tp(1.0f, 0.8f);
                return true;
            }
        }
        return true;
    }

    public static final boolean onTouch$8(ATListenerS440S0100000_6 aTListenerS440S0100000_6, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ((C1295960jpS) aTListenerS440S0100000_6.l0).cancelAnimation();
            C439101nJ.LJI((C1295960jpS) aTListenerS440S0100000_6.l0);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$9(ATListenerS440S0100000_6 aTListenerS440S0100000_6, View view, MotionEvent motionEvent) {
        boolean zCanScrollVertically = ((RecyclerView) aTListenerS440S0100000_6.l0).canScrollVertically(-1);
        boolean zCanScrollVertically2 = ((RecyclerView) aTListenerS440S0100000_6.l0).canScrollVertically(1);
        if (zCanScrollVertically || zCanScrollVertically2) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
        return false;
    }
}
