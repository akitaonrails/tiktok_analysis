package Y;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1593010rYZ;
import X.C1599810rjX;
import X.C1609070ryT;
import X.C1612090s3L;
import X.C339190DRl;
import X.C386801es;
import X.C418440Gaw;
import X.C718010SEl;
import X.C814420VxA;
import X.EnumC1608710rxt;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.appdiff.ISeriesInnerFeedAppDiffProtocol;
import com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightListAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenteSubPageAssem;
import com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel;
import com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel;
import com.ss.android.ugc.aweme.stemfeed.ui.StemFeedToFYPAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell;
import com.ss.android.ugc.aweme.tako.ui.TakoContentAssem;
import com.ss.android.ugc.aweme.topicfeed.ui.TopicFeedToFYPAssem;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes25.dex */
public class ATListenerS456S0100000_24 implements View.OnTouchListener {
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
            default:
                return false;
        }
    }

    public ATListenerS456S0100000_24(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS456S0100000_24 aTListenerS456S0100000_24, View view, MotionEvent motionEvent) {
        ((FeedSkylightListAssem) aTListenerS456S0100000_24.l0).LLJZIJLIL = 1;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x015d, code lost:
    
        if (r0 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c9, code lost:
    
        if (r6.LLJI <= ((-((com.ss.android.ugc.aweme.story.experiment.StoryGestureThreshold) r1.getValue()).y) * r7)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01d1, code lost:
    
        if (r6.LLJ <= (-r6.LLIZLLLIL)) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$1(Y.ATListenerS456S0100000_24 r14, android.view.View r15, android.view.MotionEvent r16) {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS456S0100000_24.onTouch$1(Y.ATListenerS456S0100000_24, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$10(ATListenerS456S0100000_24 aTListenerS456S0100000_24, View view, MotionEvent motionEvent) {
        StoryInboxCell storyInboxCell;
        StoryInboxItem storyInboxItemB7;
        Aweme awemeL7;
        int iLIZIZ;
        StoryInboxCell storyInboxCell2 = (StoryInboxCell) aTListenerS456S0100000_24.l0;
        View viewA6 = storyInboxCell2.a6();
        if (viewA6 != null && viewA6.getVisibility() == 0) {
            int[] iArr = new int[2];
            viewA6.getLocationOnScreen(iArr);
            Integer numValueOf = Integer.valueOf(storyInboxCell2.X5().getAvatarSizePx());
            if (numValueOf.intValue() > 0) {
                iLIZIZ = numValueOf.intValue();
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
            }
            float width = (((iLIZIZ / 64.0f) * 34.0f) - viewA6.getWidth()) / 2.0f;
            if (width < 0.0f) {
                width = 0.0f;
            }
            float f = iArr[0] - width;
            float f2 = iArr[1] - width;
            float width2 = r1 + viewA6.getWidth() + width;
            float height = iArr[1] + viewA6.getHeight() + width;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (rawX >= f && rawX <= width2 && rawY >= f2 && rawY <= height) {
                return false;
            }
        }
        StoryInboxCell storyInboxCell3 = (StoryInboxCell) aTListenerS456S0100000_24.l0;
        View avatar = storyInboxCell3.X5().getAvatarDisplayView().get(EnumC1608710rxt.AVATAR);
        if (avatar != null || (avatar = storyInboxCell3.X5().getAvatar()) != null) {
            int[] iArr2 = new int[2];
            avatar.getLocationOnScreen(iArr2);
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (rawX2 >= iArr2[0] && rawX2 <= r1 + avatar.getWidth()) {
                if (rawY2 >= iArr2[1] && rawY2 <= r1 + avatar.getHeight()) {
                    if (motionEvent.getActionMasked() != 1 || (storyInboxItemB7 = (storyInboxCell = (StoryInboxCell) aTListenerS456S0100000_24.l0).b7()) == null || (awemeL7 = StoryInboxCell.l7(storyInboxItemB7)) == null) {
                        return true;
                    }
                    C718010SEl c718010SEl = C718010SEl.LIZ;
                    String aid = awemeL7.getAid();
                    c718010SEl.getClass();
                    if (aid == null || aid.length() <= 0) {
                        aid = null;
                    }
                    C718010SEl.LIZJ = aid;
                    storyInboxCell.LLJI = storyInboxCell.LLILZLL;
                    C339190DRl.LIZIZ(storyInboxCell.v6());
                    storyInboxCell.W5();
                    storyInboxCell.LLILZIL = "top_cell_viewlist_hint";
                    try {
                        storyInboxCell.a7();
                        storyInboxCell.LLILZIL = null;
                        storyInboxCell.LLJI = null;
                        storyInboxCell.LLILZLL = null;
                        return true;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        storyInboxCell.LLILZIL = null;
                        storyInboxCell.LLJI = null;
                        storyInboxCell.LLILZLL = null;
                        throw th;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$11(ATListenerS456S0100000_24 aTListenerS456S0100000_24, View view, MotionEvent motionEvent) {
        ((GestureDetector) ((C1609070ryT) aTListenerS456S0100000_24.l0).LIZIZ.getValue()).onTouchEvent(motionEvent);
        return true;
    }

    public static final boolean onTouch$2(ATListenerS456S0100000_24 aTListenerS456S0100000_24, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float fAbs = Math.abs(x - ((SeriesCenteSubPageAssem) aTListenerS456S0100000_24.l0).LLJ);
                    float fAbs2 = Math.abs(y - ((SeriesCenteSubPageAssem) aTListenerS456S0100000_24.l0).LLJI);
                    if (fAbs2 > fAbs && fAbs2 > ((SeriesCenteSubPageAssem) aTListenerS456S0100000_24.l0).LLJIJIL) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                        return false;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                    return false;
                }
            }
            view.getParent().requestDisallowInterceptTouchEvent(false);
            return false;
        }
        ((SeriesCenteSubPageAssem) aTListenerS456S0100000_24.l0).LLJ = motionEvent.getX();
        ((SeriesCenteSubPageAssem) aTListenerS456S0100000_24.l0).LLJI = motionEvent.getY();
        return false;
    }

    public static final boolean onTouch$3(ATListenerS456S0100000_24 aTListenerS456S0100000_24, View view, MotionEvent motionEvent) {
        SeriesInnerFeedViewModel seriesInnerFeedViewModel;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    ((PaidContentVideoPanel) aTListenerS456S0100000_24.l0).f405a3.addMovement(motionEvent);
                }
            } else {
                ((PaidContentVideoPanel) aTListenerS456S0100000_24.l0).f405a3.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
                if (((PaidContentVideoPanel) aTListenerS456S0100000_24.l0).f405a3.getYVelocity() < C386801es.DEFAULT) {
                    ISeriesInnerFeedAppDiffProtocol.LIZ.getClass();
                    C1612090s3L.LIZ().LJI();
                    if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                        PaidContentVideoPanel paidContentVideoPanel = (PaidContentVideoPanel) aTListenerS456S0100000_24.l0;
                        Object obj = paidContentVideoPanel.LLLLLLLLLL;
                        if ((obj instanceof SeriesInnerFeedViewModel) && (seriesInnerFeedViewModel = (SeriesInnerFeedViewModel) obj) != null && seriesInnerFeedViewModel.DB2(paidContentVideoPanel.LJIIIIZZ())) {
                            PaidContentVideoPanel paidContentVideoPanel2 = (PaidContentVideoPanel) aTListenerS456S0100000_24.l0;
                            PaidContentVideoPanel.b2(paidContentVideoPanel2, "series_episode_selection", null, new ARunnableS112S0100000_12((Object) paidContentVideoPanel2, 218), null, 10);
                            return false;
                        }
                    } else {
                        ((PaidContentVideoPanel) aTListenerS456S0100000_24.l0).W1(Boolean.TRUE);
                        return false;
                    }
                }
            }
            return false;
        }
        ((PaidContentVideoPanel) aTListenerS456S0100000_24.l0).f405a3.clear();
        return false;
    }

    public static final boolean onTouch$4(ATListenerS456S0100000_24 aTListenerS456S0100000_24, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            ((TakoContentAssem) aTListenerS456S0100000_24.l0).op().Sx2(false);
        }
        return false;
    }

    public static final boolean onTouch$5(ATListenerS456S0100000_24 aTListenerS456S0100000_24, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            ((TakoContentAssem) aTListenerS456S0100000_24.l0).op().Sx2(false);
        }
        return false;
    }

    public static final boolean onTouch$6(ATListenerS456S0100000_24 aTListenerS456S0100000_24, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 0) {
                ((C1593010rYZ) aTListenerS456S0100000_24.l0).LJJJJJL();
                ((C1593010rYZ) aTListenerS456S0100000_24.l0).LJJJJL(true);
            } else if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                ((C1593010rYZ) aTListenerS456S0100000_24.l0).LJJJJJ();
                ((C1593010rYZ) aTListenerS456S0100000_24.l0).LJJJJL(false);
                return false;
            }
        }
        return false;
    }

    public static final boolean onTouch$7(ATListenerS456S0100000_24 aTListenerS456S0100000_24, View view, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                StemFeedToFYPAssem stemFeedToFYPAssem = (StemFeedToFYPAssem) aTListenerS456S0100000_24.l0;
                float f = stemFeedToFYPAssem.LLJJJ;
                if (f - y < (-stemFeedToFYPAssem.LLJJJIL)) {
                    stemFeedToFYPAssem.hp("slide_down");
                    ((StemFeedToFYPAssem) aTListenerS456S0100000_24.l0).L3();
                } else {
                    float fAbs = Math.abs(f - y);
                    StemFeedToFYPAssem stemFeedToFYPAssem2 = (StemFeedToFYPAssem) aTListenerS456S0100000_24.l0;
                    if (fAbs < stemFeedToFYPAssem2.LLJJJIL) {
                        float fAbs2 = Math.abs(stemFeedToFYPAssem2.LLJJIJIL - x);
                        StemFeedToFYPAssem stemFeedToFYPAssem3 = (StemFeedToFYPAssem) aTListenerS456S0100000_24.l0;
                        if (fAbs2 < stemFeedToFYPAssem3.LLJJJIL) {
                            stemFeedToFYPAssem3.hp("click_shadow");
                            ((StemFeedToFYPAssem) aTListenerS456S0100000_24.l0).L3();
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        StemFeedToFYPAssem stemFeedToFYPAssem4 = (StemFeedToFYPAssem) aTListenerS456S0100000_24.l0;
        stemFeedToFYPAssem4.LLJJIJIL = x;
        stemFeedToFYPAssem4.LLJJJ = y;
        return true;
    }

    public static final boolean onTouch$8(ATListenerS456S0100000_24 aTListenerS456S0100000_24, View view, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                TopicFeedToFYPAssem topicFeedToFYPAssem = (TopicFeedToFYPAssem) aTListenerS456S0100000_24.l0;
                float f = topicFeedToFYPAssem.LLJJJ;
                if (f - y < (-topicFeedToFYPAssem.LLJJJIL)) {
                    topicFeedToFYPAssem.ip("slide_down");
                    ((TopicFeedToFYPAssem) aTListenerS456S0100000_24.l0).L3();
                } else {
                    float fAbs = Math.abs(f - y);
                    TopicFeedToFYPAssem topicFeedToFYPAssem2 = (TopicFeedToFYPAssem) aTListenerS456S0100000_24.l0;
                    if (fAbs < topicFeedToFYPAssem2.LLJJJIL) {
                        float fAbs2 = Math.abs(topicFeedToFYPAssem2.LLJJIJIL - x);
                        TopicFeedToFYPAssem topicFeedToFYPAssem3 = (TopicFeedToFYPAssem) aTListenerS456S0100000_24.l0;
                        if (fAbs2 < topicFeedToFYPAssem3.LLJJJIL) {
                            topicFeedToFYPAssem3.ip("click_shadow");
                            ((TopicFeedToFYPAssem) aTListenerS456S0100000_24.l0).L3();
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        TopicFeedToFYPAssem topicFeedToFYPAssem4 = (TopicFeedToFYPAssem) aTListenerS456S0100000_24.l0;
        topicFeedToFYPAssem4.LLJJIJIL = x;
        topicFeedToFYPAssem4.LLJJJ = y;
        return true;
    }

    public static final boolean onTouch$9(ATListenerS456S0100000_24 aTListenerS456S0100000_24, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            C1599810rjX c1599810rjX = (C1599810rjX) aTListenerS456S0100000_24.l0;
            if (!c1599810rjX.LJIIJJI) {
                c1599810rjX.LIZ();
                return true;
            }
            return true;
        }
        return true;
    }
}
