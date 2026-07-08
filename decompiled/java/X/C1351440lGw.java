package X;

import Y.AAListenerS323S0100000_12;
import Y.AObserverS183S0200000_21;
import Y.AUListenerS270S0100000_21;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS160S0101000_21;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lGw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351440lGw extends FrameLayout {
    public static final int LLJJJJLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
    public static final int LLJJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
    public final ViewGroup LL;
    public C460000I2c LLILLJJLI;
    public EditText LLILLL;
    public int LLILZ;
    public InterfaceC460010I2d LLILZIL;
    public InterfaceC1347800lB4 LLILZLL;
    public final CopyOnWriteArrayList<C451030HmP> LLIZ;
    public List<CommentPersonalizedEmoji> LLIZLLLIL;
    public int LLJ;
    public View LLJI;
    public String LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public C449990Hkj LLJILLL;
    public C1351490lH1 LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public Aweme LLJJIJI;
    public int LLJJIJIIJIL;
    public InterfaceC1351520lH4 LLJJIJIL;
    public User LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public CommentContextSource LLJJJJJIL;

    public C1351440lGw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final Animator getHeightChangeAnimator() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.LLJ);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS270S0100000_21(this, 4));
        return valueAnimatorOfInt;
    }

    public final void LJIIIIZZ() {
        List<String> quickCommentEmojiString;
        List<CommentPersonalizedEmoji> listPP;
        CommentKeyboardModel keyboardModel;
        synchronized (this) {
            try {
                this.LLIZ.clear();
                ArrayList<String> arrayList = new ArrayList();
                ArrayList<String> arrayList2 = new ArrayList();
                CommentContextSource commentContextSource = this.LLJJJJJIL;
                if (commentContextSource == null || (keyboardModel = commentContextSource.getKeyboardModel()) == null || (quickCommentEmojiString = keyboardModel.getQuickCommentEmojiString()) == null) {
                    quickCommentEmojiString = C13BV.INSTANCE;
                }
                arrayList2.addAll(quickCommentEmojiString);
                InterfaceC1347800lB4 interfaceC1347800lB4 = this.LLILZLL;
                if (interfaceC1347800lB4 == null || (listPP = interfaceC1347800lB4.pP()) == null) {
                    listPP = C13BV.INSTANCE;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                for (String str : arrayList2) {
                    C451030HmP c451030HmP = new C451030HmP();
                    c451030HmP.LIZIZ = str;
                    str.toString();
                    c451030HmP.LJII = new CommentPersonalizedEmoji(str, 0, "", "exposed_emoji");
                    arrayList4.add(c451030HmP);
                }
                arrayList3.addAll(arrayList4);
                ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                for (String str2 : arrayList) {
                    C451030HmP c451030HmP2 = new C451030HmP();
                    c451030HmP2.LIZIZ = str2;
                    c451030HmP2.LJII = new CommentPersonalizedEmoji(str2, 0, "", "exposed_emoji");
                    arrayList5.add(c451030HmP2);
                }
                arrayList3.addAll(arrayList5);
                ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(listPP, 10));
                for (CommentPersonalizedEmoji commentPersonalizedEmoji : listPP) {
                    C451030HmP c451030HmP3 = new C451030HmP();
                    c451030HmP3.LIZIZ = commentPersonalizedEmoji.emoji;
                    c451030HmP3.LJII = commentPersonalizedEmoji.copy(commentPersonalizedEmoji.emoji, commentPersonalizedEmoji.score, commentPersonalizedEmoji.strategy, "exposed_emoji");
                    arrayList6.add(c451030HmP3);
                }
                arrayList3.addAll(arrayList6);
                List<CommentPersonalizedEmoji> list = this.LLIZLLLIL;
                ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (CommentPersonalizedEmoji commentPersonalizedEmoji2 : list) {
                    C451030HmP c451030HmP4 = new C451030HmP();
                    c451030HmP4.LIZIZ = commentPersonalizedEmoji2.emoji;
                    c451030HmP4.LJII = commentPersonalizedEmoji2.copy(commentPersonalizedEmoji2.emoji, commentPersonalizedEmoji2.score, commentPersonalizedEmoji2.strategy, "exposed_emoji");
                    arrayList7.add(c451030HmP4);
                }
                arrayList3.addAll(arrayList7);
                HashSet hashSet = new HashSet();
                ArrayList arrayList8 = new ArrayList();
                for (Object obj : arrayList3) {
                    if (hashSet.add(((C451030HmP) obj).LIZIZ)) {
                        arrayList8.add(obj);
                    }
                }
                ArrayList arrayList9 = new ArrayList();
                for (Object obj2 : arrayList8) {
                    C451030HmP c451030HmP5 = (C451030HmP) obj2;
                    if (C439870HMr.LIZ(c451030HmP5.LIZIZ)) {
                        arrayList9.add(obj2);
                    } else {
                        String str3 = c451030HmP5.LIZIZ;
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("emoji_id", str3);
                        C1350920lG6.LJJJ(c2344009Gk, "emoji_exception");
                    }
                }
                C1344030l4z.LIZJ("HorizontalEmoji", "personalized size: " + listPP.size() + "; default emoji size: " + this.LLIZLLLIL.size() + "; mini emoji data size: " + arrayList9.size());
                this.LLIZ.addAll(arrayList9);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZ() {
        if (this.LL == null) {
            return;
        }
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = new C460000I2c(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLJJJJJIL);
        }
        if ((((Number) C295480Bi6.LIZ.getValue()).intValue() & 1) == 1) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1351460lGy(this, null), 3);
            return;
        }
        C0I2X.LIZ.getClass();
        List<CommentPersonalizedEmoji> listLIZIZ = C0I2X.LIZIZ();
        this.LLIZLLLIL = listLIZIZ;
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(((ArrayList) listLIZIZ).isEmpty() ? 4 : 0, viewGroup);
        }
        LJIIIIZZ();
        LIZIZ(getMiniEmojiNum());
    }

    public final boolean LJ() {
        if (Intrinsics.LJFF(this.LLJIJIL, "homepage_hot") && C2279851ELn.LIZIZ() && this.LLJJJIL && this.LLJJJ != null) {
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            User user = this.LLJJJ;
            String uid = user != null ? user.getUid() : null;
            User user2 = this.LLJJJ;
            IMUser iMUserLJ = c1bgsLJ.LJ(uid, user2 != null ? user2.getSecUid() : null);
            if ((iMUserLJ == null || !iMUserLJ.isBlock()) && C0DK7.LIZ().LIZJ() && !C20612915lH.LIZIZ.LJIIIIZZ().LJFF(null)) {
                User user3 = this.LLJJJ;
                return user3 == null || !C1351410lGt.LIZ(user3);
            }
        }
        return false;
    }

    public final boolean LJIIIZ() {
        if (C1179704jT.LIZ(this.LLJJIJI, this.LLJJJJ)) {
            return (!this.LLJJJJ && ((Number) C0A8S.LIZ.getValue()).intValue() == 1) || ((Number) C0A8S.LIZ.getValue()).intValue() != 1;
        }
        return false;
    }

    public final int getMiniEmojiNum() {
        int i = this.LLJJI;
        if (i <= 0) {
            i = C1389340mG4.LIZJ(null, null).LIZIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("currentWidth:");
        ViewGroup viewGroup = this.LL;
        sbLIZ.append(viewGroup != null ? Integer.valueOf(viewGroup.getMeasuredWidth()) : null);
        sbLIZ.append(" specWidth:");
        sbLIZ.append(this.LLJJI);
        sbLIZ.append(" lastLayoutWidth=");
        sbLIZ.append(this.LLJJIII);
        sbLIZ.append("  screen:");
        sbLIZ.append(i);
        C1344030l4z.LIZJ("HorizontalEmoji", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIII = i;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getMiniEmojiNum width");
        sbLIZ2.append(i);
        sbLIZ2.append(' ');
        C2188811AlT.LIZIZ(sbLIZ2);
        int emojiRectWidth = getEmojiRectWidth();
        int emojiMinSpace = getEmojiMinSpace();
        int i2 = 2;
        int emojiPanelMarginEdge = ((i - (getEmojiPanelMarginEdge() * 2)) + emojiMinSpace) / (emojiRectWidth + emojiMinSpace);
        if (emojiPanelMarginEdge >= Integer.MAX_VALUE) {
            i2 = Integer.MAX_VALUE;
        } else if (emojiPanelMarginEdge > 1) {
            i2 = emojiPanelMarginEdge;
        }
        int size = this.LLIZ.size();
        int iMin = Math.min(i2, size);
        if (!C2279851ELn.LIZIZ()) {
            return iMin;
        }
        if (i2 < size) {
            this.LLJJIJIIJIL = iMin;
            return iMin + 1;
        }
        this.LLJJIJIIJIL = iMin - 1;
        return iMin;
    }

    private final int getEmojiMinSpace() {
        return (int) (LJIIIZ() ? C12ES.LIZJ(6.0f, getContext()) : C12ES.LIZJ(12.0f, getContext()));
    }

    private final int getEmojiPanelMarginEdge() {
        return (int) (LJIIIZ() ? C12ES.LIZJ(12.0f, getContext()) : C12ES.LIZJ(16.0f, getContext()));
    }

    private final int getEmojiRectWidth() {
        return (int) (LJIIIZ() ? C12ES.LIZJ(84.0f, getContext()) : C12ES.LIZJ(40.0f, getContext()));
    }

    public final String getMEnterFrom() {
        return this.LLJIJIL;
    }

    public final int getPublishScenario() {
        return this.LLJILJIL;
    }

    public final void LIZIZ(int i) {
        int i2;
        int i3;
        Context context;
        LinearLayoutManager linearLayoutManager;
        C423590GjF c423590GjF;
        if (this.LLIZ.isEmpty()) {
            return;
        }
        this.LLJJJ = C1351410lGt.LIZJ(this.LLJJIJI);
        if (!LJFF(this.LLJJIJI) && !LJ()) {
            i2 = i;
        } else {
            i2 = i + 1;
        }
        this.LLJJ = new C1351490lH1(i2, LJIIIZ(), new AwS160S0101000_21(this, i, 0));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23));
        CopyOnWriteArrayList<C451030HmP> copyOnWriteArrayList = this.LLIZ;
        if (LJIIIZ()) {
            i3 = 8;
        } else {
            i3 = i;
        }
        List listLL = C13LP.LL(copyOnWriteArrayList, i3);
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null && (context = viewGroup.getContext()) != null && C1388190mED.LIZ(context) != null) {
            C460000I2c c460000I2c = this.LLILLJJLI;
            ViewGroup viewGroup2 = this.LL;
            InterfaceC449960Hkg interfaceC449960HkgLJIIJJI = LJIIJJI(this.LLJJIJI, this.LLJJJ);
            View view = null;
            if (!C2279851ELn.LIZIZ()) {
                linearLayoutManager = null;
            } else {
                linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
            }
            if (!C2279851ELn.LIZIZ()) {
                c423590GjF = null;
            } else {
                c423590GjF = new C423590GjF();
            }
            C449990Hkj c449990Hkj = new C449990Hkj(c460000I2c, viewGroup2, interfaceC449960HkgLJIIJJI, linearLayoutManager, c423590GjF, listLL, this.LLJJ, i, iLIZIZ, 2, this.LLJJIJI, Boolean.valueOf(LJIIIZ()));
            c449990Hkj.LL.setId(R.id.hi4);
            this.LLJILLL = c449990Hkj;
            ViewGroup viewGroup3 = this.LL;
            if (viewGroup3 != null) {
                C786410Ut5.LJJJJI(viewGroup3);
            }
            ViewGroup viewGroup4 = this.LL;
            if (viewGroup4 != null) {
                C449990Hkj c449990Hkj2 = this.LLJILLL;
                if (c449990Hkj2 != null) {
                    view = c449990Hkj2.LL;
                }
                viewGroup4.addView(view);
            }
        }
    }

    public final int LIZLLL(int i) {
        int i2 = this.LLJJI;
        if (i2 <= 0) {
            i2 = C1389340mG4.LIZJ(null, null).LIZIZ;
        }
        int emojiRectWidth = getEmojiRectWidth();
        getEmojiMinSpace();
        int emojiPanelMarginEdge = getEmojiPanelMarginEdge();
        if (C2279851ELn.LIZIZ()) {
            return LJI(i2, emojiPanelMarginEdge, this.LLJJIJIIJIL, emojiRectWidth);
        }
        return LJI(i2, emojiPanelMarginEdge, i, emojiRectWidth);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(com.ss.android.ugc.aweme.feed.model.Aweme r12) {
        /*
            r11 = this;
            boolean r0 = r11.LLJJJIL
            r10 = 0
            if (r0 == 0) goto L48
            com.ss.android.ugc.aweme.profile.model.User r0 = r11.LLJJJ
            r1 = 1
            if (r0 == 0) goto L48
            boolean r0 = X.C1351410lGt.LIZ(r0)
            if (r0 != r1) goto L48
            com.ss.android.ugc.aweme.profile.model.User r0 = r11.LLJJJ
            r2 = 0
            if (r0 == 0) goto La5
            java.lang.String r3 = r0.getUid()
        L19:
            if (r12 == 0) goto La2
            java.lang.String r1 = r12.getAid()
        L1f:
            if (r3 == 0) goto L48
            int r0 = r3.length()
            if (r0 <= 0) goto L48
            if (r1 == 0) goto L49
            int r0 = r1.length()
            if (r0 <= 0) goto L49
            java.lang.String r0 = X.C1351420lGu.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L49
            java.lang.String r0 = X.C1351420lGu.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto L48
            java.lang.String r0 = X.C1351420lGu.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 == 0) goto L49
        L47:
            r10 = 1
        L48:
            return r10
        L49:
            X.01GW r0 = X.C0A8F.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L47
            X.0gFX r0 = X.C1158370gFX.LIZ
            r0.getClass()
            X.01GW r0 = X.C1158370gFX.LIZIZ
            java.lang.Object r7 = r0.getValue()
            com.ss.android.ugc.aweme.comment.quickmention.QuickMentionTakoThresholdConfig r7 = (com.ss.android.ugc.aweme.comment.quickmention.QuickMentionTakoThresholdConfig) r7
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "tako_guide_last_show_time_"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            long r5 = X.C0TSK.LIZLLL(r0)
            java.lang.String r0 = X.C1351420lGu.LIZ(r3)
            r1 = 6
            int r4 = X.C0TSK.LIZJ(r1, r0, r2)
            java.lang.String r0 = X.C1351420lGu.LIZJ(r3)
            int r3 = X.C0TSK.LIZJ(r1, r0, r2)
            long r8 = r8 - r5
            int r1 = r7.takoGuidePostShowSuppressHours
            r0 = 3600000(0x36ee80, float:5.044674E-39)
            int r1 = r1 * r0
            long r1 = (long) r1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L48
            int r0 = r7.closeTimes
            if (r4 >= r0) goto L48
            int r0 = r7.showWithoutClickTimes
            if (r3 >= r0) goto L48
            goto L47
        La2:
            r1 = r2
            goto L1f
        La5:
            r3 = r2
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1351440lGw.LJFF(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public final void LJII(boolean z) {
        if (!this.LLJILJILJ) {
            return;
        }
        this.LLJILJILJ = false;
        if (!z) {
            setViewHeight(0);
            if (C294400BgM.LIZ()) {
                C0H1U.LJII(0, this);
                return;
            }
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.LLJ, 0);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS270S0100000_21(this, 5));
        valueAnimatorOfInt.start();
    }

    public final void LJIIJ(boolean z) {
        if (this.LLJILJILJ) {
            return;
        }
        this.LLJILJILJ = true;
        if (!z) {
            setViewHeight(this.LLJ);
            C0H1U.LJII(LLJJL, this);
            return;
        }
        if (C294400BgM.LIZ()) {
            setViewHeight(this.LLJ);
            View view = this.LLJI;
            if (view == null) {
                view = this;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
            objectAnimatorOfFloat.setStartDelay(100L);
            objectAnimatorOfFloat.setDuration(100L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat);
            animatorSet.addListener(new AAListenerS323S0100000_12(view, 24));
            animatorSet.addListener(new AAListenerS323S0100000_12(view, 22));
            animatorSet.addListener(new AAListenerS323S0100000_12(view, 23));
            animatorSet.start();
            return;
        }
        getHeightChangeAnimator().start();
    }

    public final void LJIILJJIL(int i) {
        Integer numValueOf;
        Integer numValueOf2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("currentWidth:");
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            numValueOf = Integer.valueOf(viewGroup.getMeasuredWidth());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" width:");
        sbLIZ.append(i);
        sbLIZ.append(" lastLayoutWidth=");
        sbLIZ.append(this.LLJJIII);
        C1344030l4z.LIZJ("HorizontalEmoji", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJI = i;
        if (i == this.LLJJIII) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("currentWidth:");
        ViewGroup viewGroup2 = this.LL;
        if (viewGroup2 != null) {
            numValueOf2 = Integer.valueOf(viewGroup2.getMeasuredWidth());
        } else {
            numValueOf2 = null;
        }
        sbLIZ2.append(numValueOf2);
        sbLIZ2.append(" specWidth:");
        sbLIZ2.append(this.LLJJI);
        sbLIZ2.append(" lastLayoutWidth=");
        sbLIZ2.append(this.LLJJIII);
        C1344030l4z.LIZJ("HorizontalEmoji", C2188811AlT.LIZIZ(sbLIZ2));
        LJIIL(null, this.LLJJJJJIL, false);
    }

    public final void setMEnterFrom(String str) {
        this.LLJIJIL = str;
    }

    public void setOriginalHeight(int i) {
        this.LLJ = i;
    }

    public final void setPublishScenario(int i) {
        this.LLJILJIL = i;
    }

    public final void setViewHeight(int i) {
        View view = this.LLJI;
        if (view != null) {
            C1351950lHl.LJIJI(i, view);
        } else {
            C1351950lHl.LJIJI(i, this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0lGx] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0lGz] */
    public final InterfaceC449960Hkg LJIIJJI(Aweme aweme, final User user) {
        this.LLJJJ = user;
        if (user == null) {
            return null;
        }
        if (LJFF(aweme)) {
            final int iLJIIJJI = C14TF.LIZIZ.LJIIJJI();
            final ?? r0 = new InterfaceC449950Hkf() { // from class: X.0lGz
                @Override // X.InterfaceC449950Hkf
                public final void onShow() {
                    InterfaceC1351520lH4 interfaceC1351520lH4 = this.LIZ.LLJJIJIL;
                    if (interfaceC1351520lH4 != null) {
                        interfaceC1351520lH4.p9();
                    }
                    User userLIZLLL = C1351410lGt.LIZLLL(this.LIZ.LLJJIJI);
                    String uid = userLIZLLL != null ? userLIZLLL.getUid() : null;
                    Aweme aweme2 = this.LIZ.LLJJIJI;
                    C1351410lGt.LIZIZ(new C1351430lGv("show", "1", uid, aweme2 != null ? aweme2.getAid() : null));
                }

                @Override // X.InterfaceC449950Hkf
                public final void LIZIZ(Map<String, String> map) {
                    String uid;
                    String uid2;
                    String aid;
                    C1351490lH1 c1351490lH1 = this.LIZ.LLJJ;
                    String aid2 = null;
                    if (c1351490lH1 != null) {
                        c1351490lH1.LJ(null);
                    }
                    C449990Hkj c449990Hkj = this.LIZ.LLJILLL;
                    if (c449990Hkj != null) {
                        c449990Hkj.LIZJ();
                    }
                    if (Intrinsics.LJFF(map.get("action_type"), "close")) {
                        User user2 = this.LIZ.LLJJJ;
                        if (user2 != null) {
                            uid2 = user2.getUid();
                        } else {
                            uid2 = null;
                        }
                        Aweme aweme2 = this.LIZ.LLJJIJI;
                        if (aweme2 != null) {
                            aid = aweme2.getAid();
                        } else {
                            aid = null;
                        }
                        if (uid2 != null && uid2.length() > 0) {
                            C1351420lGu.LIZ = uid2;
                            if (aid == null || aid.length() <= 0) {
                                aid = null;
                            }
                            C1351420lGu.LIZJ = aid;
                            C0TSK.LJFF(C1351420lGu.LIZ(uid2), Integer.valueOf(C0TSK.LIZJ(6, C1351420lGu.LIZ(uid2), null) + 1));
                        }
                    }
                    InterfaceC1351520lH4 interfaceC1351520lH4 = this.LIZ.LLJJIJIL;
                    if (interfaceC1351520lH4 != null) {
                        interfaceC1351520lH4.gJ();
                    }
                    String str = map.get("action_type");
                    if (str == null) {
                        str = "";
                    }
                    User user3 = this.LIZ.LLJJJ;
                    if (user3 != null) {
                        uid = user3.getUid();
                    } else {
                        uid = null;
                    }
                    Aweme aweme3 = this.LIZ.LLJJIJI;
                    if (aweme3 != null) {
                        aid2 = aweme3.getAid();
                    }
                    C1351410lGt.LIZIZ(new C1351430lGv(str, "1", uid, aid2));
                }

                @Override // X.InterfaceC449950Hkf
                public final void LIZ(View view, AwS550S0100000_6 awS550S0100000_6) throws Throwable {
                    String aid;
                    C1351440lGw c1351440lGw = this.LIZ;
                    User user2 = c1351440lGw.LLJJJ;
                    if (user2 != null) {
                        String uid = user2.getUid();
                        Aweme aweme2 = c1351440lGw.LLJJIJI;
                        if (aweme2 != null) {
                            aid = aweme2.getAid();
                        } else {
                            aid = null;
                        }
                        C1351420lGu.LIZIZ(uid, aid);
                        awS550S0100000_6.invoke();
                        InterfaceC1351520lH4 interfaceC1351520lH4 = c1351440lGw.LLJJIJIL;
                        if (interfaceC1351520lH4 != null) {
                            interfaceC1351520lH4.tt();
                        }
                    }
                }
            };
            return new InterfaceC449960Hkg(iLJIIJJI, r0, user) { // from class: X.0lH3
                public final int LIZ;
                public final InterfaceC449950Hkf LIZIZ;
                public final User LIZJ;

                @Override // X.InterfaceC449910Hkb
                public final int getPosition() {
                    return 0;
                }

                @Override // X.InterfaceC449910Hkb
                public final int getType() {
                    return 2;
                }

                @Override // X.InterfaceC449960Hkg
                public final User LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC449910Hkb
                public final InterfaceC449950Hkf LJ() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC449910Hkb
                public final int getLayoutId() {
                    return this.LIZ;
                }

                {
                    this.LIZ = iLJIIJJI;
                    this.LIZIZ = r0;
                    this.LIZJ = user;
                }
            };
        }
        if (!LJ()) {
            return null;
        }
        final int iLJI = C20612915lH.LIZIZ.LJI();
        final ?? r02 = new InterfaceC449950Hkf() { // from class: X.0lGx
            @Override // X.InterfaceC449950Hkf
            public final void onShow() {
                InterfaceC1351520lH4 interfaceC1351520lH4 = this.LIZ.LLJJIJIL;
                if (interfaceC1351520lH4 != null) {
                    interfaceC1351520lH4.p9();
                }
            }

            @Override // X.InterfaceC449950Hkf
            public final void LIZIZ(Map<String, String> map) {
                C1351490lH1 c1351490lH1 = this.LIZ.LLJJ;
                if (c1351490lH1 != null) {
                    c1351490lH1.LJ(null);
                }
                C449990Hkj c449990Hkj = this.LIZ.LLJILLL;
                if (c449990Hkj != null) {
                    c449990Hkj.LIZJ();
                }
                InterfaceC1351520lH4 interfaceC1351520lH4 = this.LIZ.LLJJIJIL;
                if (interfaceC1351520lH4 != null) {
                    interfaceC1351520lH4.ma();
                }
                String str = map.get("action_type");
                if (str == null) {
                    str = "";
                }
                C1351410lGt.LIZIZ(new C1351430lGv(str, CardStruct.IStatusCode.DEFAULT, null, null));
            }

            @Override // X.InterfaceC449950Hkf
            public final void LIZ(View view, AwS550S0100000_6 awS550S0100000_6) throws Throwable {
                Fragment fragmentLIZ;
                LifecycleCoroutineScope lifecycleScope;
                C1351440lGw c1351440lGw = this.LIZ;
                final User user2 = c1351440lGw.LLJJJ;
                if (user2 != null) {
                    boolean zLIZJ = C20612915lH.LIZIZ.LJIIIIZZ().LIZJ(view, C948503nH.LIZ(c1351440lGw));
                    LifecycleOwner lifecycleOwnerLIZ = C948503nH.LIZ(c1351440lGw);
                    if (lifecycleOwnerLIZ != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZ)) != null) {
                        C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C0DK1(null), 2);
                    }
                    if (!zLIZJ) {
                        awS550S0100000_6.invoke();
                        InterfaceC1351520lH4 interfaceC1351520lH4 = c1351440lGw.LLJJIJIL;
                        if (interfaceC1351520lH4 != null) {
                            interfaceC1351520lH4.tk();
                        }
                        C460000I2c c460000I2c = c1351440lGw.LLILLJJLI;
                        if (c460000I2c != null) {
                            final Aweme aweme2 = c1351440lGw.LLJJIJI;
                            final String mEnterFrom = c1351440lGw.getMEnterFrom();
                            if (aweme2 != null) {
                                String nickname = user2.getNickname();
                                String uid = user2.getUid();
                                String secUid = user2.getSecUid();
                                if (!TextUtils.isEmpty(nickname) && !TextUtils.isEmpty(uid)) {
                                    int iMax = Math.max(0, c460000I2c.LIZIZ.getSelectionStart());
                                    if (C1351950lHl.LJIIJJI(c460000I2c.LIZIZ, nickname)) {
                                        Fragment fragmentLIZ2 = C946803n0.LIZ(c460000I2c.LIZIZ);
                                        if (fragmentLIZ2 != null) {
                                            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLIZ2);
                                            c1389890mGx.LJIIIZ(2131828516);
                                            c1389890mGx.LJIIJJI();
                                            return;
                                        }
                                        return;
                                    }
                                    EditText editText = c460000I2c.LIZIZ;
                                    if ((editText instanceof C1353500lKG) && ((C1353500lKG) editText).LJIIIIZZ(1, nickname, uid, secUid)) {
                                        EditText editText2 = c460000I2c.LIZIZ;
                                        editText2.setSelection(Math.min(editText2.length(), iMax + nickname.length() + 1));
                                        C0CNO.LIZ(C15O7.LJI, new Function0() { // from class: X.0lAI
                                            public final /* synthetic */ String LL = "";

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                String str = this.LL;
                                                Aweme aweme3 = aweme2;
                                                String str2 = mEnterFrom;
                                                User user3 = user2;
                                                C1347310lAH c1347310lAH = new C1347310lAH("", str);
                                                c1347310lAH.LJIIL = true;
                                                C1347300lAG.LIZIZ(-1, "", aweme3, str2, "", user3, c1347310lAH);
                                                return Unit.LIZ;
                                            }
                                        });
                                    } else {
                                        if (c460000I2c.LIZIZ.getContext() == null || (fragmentLIZ = C946803n0.LIZ(c460000I2c.LIZIZ)) == null) {
                                            return;
                                        }
                                        C1389890mGx c1389890mGx2 = new C1389890mGx(fragmentLIZ);
                                        c1389890mGx2.LJIIIZ(2131826445);
                                        c1389890mGx2.LJIIJJI();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        };
        return new InterfaceC449960Hkg(iLJI, r02, user) { // from class: X.0lH2
            public final int LIZ;
            public final InterfaceC449950Hkf LIZIZ;
            public final User LIZJ;

            @Override // X.InterfaceC449910Hkb
            public final int getPosition() {
                return 0;
            }

            @Override // X.InterfaceC449910Hkb
            public final int getType() {
                return 1;
            }

            @Override // X.InterfaceC449960Hkg
            public final User LIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC449910Hkb
            public final InterfaceC449950Hkf LJ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC449910Hkb
            public final int getLayoutId() {
                return this.LIZ;
            }

            {
                this.LIZ = iLJI;
                this.LIZIZ = r02;
                this.LIZJ = user;
            }
        };
    }

    public final void LJIILIIL(Aweme aweme, User user) {
        boolean z;
        if (user != null) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJJIL = z;
        this.LLJJJ = user;
        int miniEmojiNum = getMiniEmojiNum();
        C449990Hkj c449990Hkj = this.LLJILLL;
        if (c449990Hkj != null) {
            InterfaceC449960Hkg interfaceC449960HkgLJIIJJI = LJIIJJI(aweme, user);
            C449890HkZ c449890HkZ = c449990Hkj.LLILLL;
            if (c449890HkZ.LLILZIL != null ? interfaceC449960HkgLJIIJJI == null : interfaceC449960HkgLJIIJJI != null) {
                c449890HkZ.LLILZIL = interfaceC449960HkgLJIIJJI;
                c449890HkZ.notifyDataSetChanged();
            }
            c449990Hkj.LLILLJJLI.scrollToPosition(0);
        }
        C1351490lH1 c1351490lH1 = this.LLJJ;
        if (c1351490lH1 != null) {
            if (LJFF(aweme) || LJ()) {
                miniEmojiNum++;
            }
            c1351490lH1.LJ(Integer.valueOf(miniEmojiNum));
        }
        C449990Hkj c449990Hkj2 = this.LLJILLL;
        if (c449990Hkj2 != null) {
            c449990Hkj2.LIZJ();
        }
    }

    public C1351440lGw(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLIZ = new CopyOnWriteArrayList<>();
        this.LLIZLLLIL = C13BV.INSTANCE;
        new LinkedHashSet();
        this.LLJ = LLJJJJLIIL;
        this.LLJIJIL = "";
        this.LLJJJIL = true;
        C21146717pB.LIZ(context, R.layout.a2p, this);
        this.LL = (ViewGroup) findViewById(R.id.gzl);
    }

    public final void LJIIL(Aweme aweme, CommentContextSource commentContextSource, boolean z) {
        View viewFindViewById;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup viewGroup2;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        int i;
        if (!this.LLJILJILJ && !z) {
            return;
        }
        if (aweme != null) {
            this.LLJJIJI = aweme;
        }
        C1344030l4z.LIZJ("HorizontalEmoji", "update mini emoji panel");
        C1351490lH1 c1351490lH1 = this.LLJJ;
        if (c1351490lH1 != null) {
            c1351490lH1.LLILLL = LJIIIZ();
        }
        C1351490lH1 c1351490lH12 = this.LLJJ;
        if (c1351490lH12 != null) {
            c1351490lH12.LLILLJJLI = new AwS565S0100000_21(this, 210);
        }
        this.LLJJJJJIL = commentContextSource;
        ViewGroup viewGroup3 = this.LL;
        if (viewGroup3 != null) {
            viewFindViewById = viewGroup3.findViewById(R.id.hi4);
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById != null && this.LLJILLL != null) {
            LJIIIIZZ();
            int miniEmojiNum = getMiniEmojiNum();
            if (LJIIIZ()) {
                i = 8;
            } else {
                i = miniEmojiNum;
            }
            int size = this.LLIZ.size();
            if (i > size) {
                i = size;
            }
            C449990Hkj c449990Hkj = this.LLJILLL;
            if (c449990Hkj != null) {
                List<C451030HmP> listSubList = this.LLIZ.subList(0, i);
                boolean zLJIIIZ = LJIIIZ();
                C449890HkZ c449890HkZ = c449990Hkj.LLILLL;
                c449890HkZ.LLILZLL = zLJIIIZ;
                c449890HkZ.LLILLL.clear();
                if (listSubList != null) {
                    c449890HkZ.LLILLL.addAll(listSubList);
                }
                c449890HkZ.notifyDataSetChanged();
                RecyclerView.LayoutManager layoutManager = c449990Hkj.LLILZ;
                if (layoutManager != null && zLJIIIZ && (layoutManager instanceof GridLayoutManager)) {
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(c449990Hkj.LLILLJJLI.getContext(), 0, false);
                    c449990Hkj.LLILZ = linearLayoutManager;
                    c449990Hkj.LLILLJJLI.setLayoutManager(linearLayoutManager);
                    c449990Hkj.LLILLJJLI.removeItemDecoration(c449990Hkj.LLILZIL);
                    c449990Hkj.LLILLJJLI.addItemDecoration(c449990Hkj.LLILZIL);
                    int iLIZ = C341940Daq.LIZ(12.0d);
                    c449990Hkj.LLILLJJLI.setPadding(iLIZ, 0, iLIZ, 0);
                }
                RecyclerView.LayoutManager layoutManager2 = c449990Hkj.LLILZ;
                if (layoutManager2 != null && (layoutManager2 instanceof GridLayoutManager)) {
                    ((GridLayoutManager) layoutManager2).LJIJ(miniEmojiNum);
                } else {
                    c449990Hkj.LIZJ();
                }
            }
            C1351490lH1 c1351490lH13 = this.LLJJ;
            if (c1351490lH13 != null) {
                if (LJFF(aweme) || LJ()) {
                    miniEmojiNum++;
                }
                c1351490lH13.LJ(Integer.valueOf(miniEmojiNum));
            }
            C449990Hkj c449990Hkj2 = this.LLJILLL;
            if (c449990Hkj2 != null) {
                c449990Hkj2.LIZJ();
            }
        } else {
            LIZ();
        }
        if (LJIIIZ()) {
            ViewGroup viewGroup4 = this.LL;
            if (viewGroup4 != null && (layoutParams3 = viewGroup4.getLayoutParams()) != null) {
                layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            }
            if (this.LLJJJJ && C294400BgM.LIZ() && (viewGroup2 = this.LL) != null && (layoutParams2 = viewGroup2.getLayoutParams()) != null) {
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            }
            ViewGroup viewGroup5 = this.LL;
            if (viewGroup5 != null) {
                C1206770hVb.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), viewGroup5);
                return;
            }
            return;
        }
        ViewGroup viewGroup6 = this.LL;
        if (viewGroup6 != null && (layoutParams = viewGroup6.getLayoutParams()) != null) {
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        }
        ViewGroup viewGroup7 = this.LL;
        if (viewGroup7 != null) {
            C1206770hVb.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), viewGroup7);
        }
        if (!this.LLJJJJ || !C294400BgM.LIZ() || (viewGroup = this.LL) == null) {
            return;
        }
        C1206770hVb.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-4)), viewGroup);
    }

    public final int LJI(int i, int i2, int i3, int i4) {
        if (LJIIIZ()) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
        if (i3 <= 1) {
            return 0;
        }
        return ((i - (i2 * 2)) - (i4 * i3)) / (i3 - 1);
    }

    public final void LIZJ(View view, C1353500lKG c1353500lKG, int i, InterfaceC460010I2d interfaceC460010I2d, InterfaceC1347800lB4 interfaceC1347800lB4, LifecycleOwner lifecycleOwner, InterfaceC1351520lH4 interfaceC1351520lH4, Aweme aweme, boolean z, CommentContextSource commentContextSource) {
        this.LLJJIJI = aweme;
        this.LLJI = view;
        this.LLILLL = c1353500lKG;
        this.LLILZ = i;
        this.LLILZIL = interfaceC460010I2d;
        this.LLILZLL = interfaceC1347800lB4;
        this.LLJJIJIL = interfaceC1351520lH4;
        this.LLJJJJ = z;
        this.LLJJJJJIL = commentContextSource;
        if (view != null) {
            this.LLJ += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
        if (this.LLJILLL != null) {
            return;
        }
        this.LLJILJILJ = true;
        LIZ();
        if (lifecycleOwner != null) {
            ComplianceServiceProvider.LJI().LJJIII().observe(lifecycleOwner, new AObserverS183S0200000_21(this, commentContextSource, 8));
        }
    }
}
