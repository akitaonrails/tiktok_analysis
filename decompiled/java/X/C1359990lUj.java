package X;

import Y.AAListenerS332S0100000_21;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.upvote.CarrierType;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lUj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359990lUj extends FrameLayout {
    public Function0<Unit> LL;
    public C1360130lUx LLILLJJLI;
    public C1360130lUx LLILLL;
    public Aweme LLILZ;
    public String LLILZIL;
    public final ObjectAnimator LLILZLL;
    public final ObjectAnimator LLIZ;
    public boolean LLIZLLLIL;
    public AnimatorSet LLJ;
    public C21616519il LLJI;
    public C21616519il LLJIJIL;
    public Animator LLJILJIL;
    public List<C1360050lUp> LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public boolean LLJJI;
    public final C054G LLJJIII;
    public boolean LLJJIJI;
    public UpvoteList LLJJIJIIJIL;
    public String LLJJIJIL;
    public boolean LLJJJ;
    public Function1<? super C428890Grn, Unit> LLJJJIL;
    public final RunnableC1360040lUo LLJJJJ;

    public C1359990lUj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LJIIIIZZ() {
        if (this.LLJJIJI) {
            return;
        }
        UpvoteList upvoteList = this.LLJJIJIIJIL;
        if (upvoteList == null) {
            this.LLJJIJI = true;
            return;
        }
        List<C1360050lUp> list = this.LLJILJILJ;
        if (list == null) {
            this.LLJJIJI = true;
            return;
        }
        list.addAll(LJI(upvoteList, this.LLILZIL, LJII(upvoteList)));
        C1360050lUp c1360050lUp = (C1360050lUp) C13LP.LJJJLZIJ(0, list);
        if (upvoteList.total == 1 && list.size() == 2 && c1360050lUp != null) {
            c1360050lUp.LJ = false;
            ((C1360050lUp) ListProtector.get(list, 1)).LIZLLL = c1360050lUp.LIZLLL;
        }
        LJIIJ(c1360050lUp != null ? c1360050lUp.LIZLLL : 0, upvoteList.total, list);
        this.LLJJIJI = true;
    }

    public final void LJIJ() {
        HandlerHook.viewRemoveCallbacks(this, this.LLJJJJ);
        this.LLJILJILJ = null;
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        LJIJI(true);
    }

    public final void LJIJJ() {
        C1360050lUp c1360050lUp;
        HandlerHook.viewRemoveCallbacks(this, this.LLJJJJ);
        this.LLJJI = false;
        LJIIIIZZ();
        List<C1360050lUp> list = this.LLJILJILJ;
        if (list == null) {
            return;
        }
        int i = this.LLJILLL;
        if (i < 0 || i >= list.size()) {
            LJJIFFI(true);
            return;
        }
        if (C1358180lRo.LIZLLL() && (c1360050lUp = (C1360050lUp) C13LP.LJJJLZIJ(this.LLJILLL, list)) != null) {
            LJIILL(c1360050lUp);
            LJIILJJIL(c1360050lUp);
        }
        int i2 = this.LLJILLL;
        this.LLJJ = i2 + 1;
        C1360050lUp c1360050lUp2 = (C1360050lUp) C13LP.LJJJLZIJ(i2, list);
        HandlerHook.viewPostDelay(this, this.LLJJJJ, (c1360050lUp2 == null || !c1360050lUp2.LJFF) ? 3000L : 2000L);
    }

    public final void LJIL() {
        List<C1360050lUp> list = this.LLJILJILJ;
        if (list == null) {
            return;
        }
        Iterator<C1360050lUp> it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().LJ) {
                if (i >= 0) {
                    int i2 = this.LLJILLL;
                    if (i2 >= 0) {
                        C1360050lUp c1360050lUp = (C1360050lUp) C13LP.LJJJLZIJ(i2, list);
                        if (c1360050lUp == null) {
                            return;
                        }
                        C1360050lUp c1360050lUp2 = (C1360050lUp) C13LP.LJJJLZIJ(i, list);
                        if (c1360050lUp2 != null) {
                            List<User> list2 = c1360050lUp.LIZ;
                            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                            Iterator<User> it3 = list2.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(it3.next().getUid());
                            }
                            List<User> list3 = c1360050lUp2.LIZ;
                            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                            Iterator<User> it4 = list3.iterator();
                            while (it4.hasNext()) {
                                arrayList2.add(it4.next().getUid());
                            }
                            boolean zLJFF = Intrinsics.LJFF(arrayList, arrayList2);
                            boolean zLJFF2 = Intrinsics.LJFF(c1360050lUp.LIZJ, c1360050lUp2.LIZJ);
                            if (zLJFF && zLJFF2) {
                                return;
                            }
                        }
                    }
                    LJJI(i, true);
                    return;
                }
                return;
            }
            i++;
        }
    }

    public final void LJJ() {
        HandlerHook.viewRemoveCallbacks(this, this.LLJJJJ);
        AnimatorSet animatorSet = this.LLJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        HandlerHook.viewPostDelay(this, this.LLJJJJ, 0L);
    }

    public final AbstractC420810Gel getCurView() {
        C1360130lUx c1360130lUx = this.LLILLJJLI;
        Context context = getContext();
        C428890Grn c428890Grn = c1360130lUx.LIZ;
        if (c428890Grn != null) {
            return c428890Grn;
        }
        C428890Grn c428890Grn2 = new C428890Grn(context, null, 6, 0);
        c428890Grn2.setWhiteBarStyle(3);
        c1360130lUx.LIZ = c428890Grn2;
        return c428890Grn2;
    }

    public final AbstractC420810Gel getNextView() {
        C1360130lUx c1360130lUx = this.LLILLL;
        Context context = getContext();
        C428890Grn c428890Grn = c1360130lUx.LIZ;
        if (c428890Grn != null) {
            return c428890Grn;
        }
        C428890Grn c428890Grn2 = new C428890Grn(context, null, 6, 0);
        c428890Grn2.setWhiteBarStyle(3);
        c1360130lUx.LIZ = c428890Grn2;
        return c428890Grn2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (C07NU.LIZ()) {
            ViewParent parent = getParent();
            for (int i = 0; (parent instanceof ViewGroup) && i < 12; i++) {
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
                if (viewGroup.getId() == 16908290) {
                    return;
                }
                parent = viewGroup.getParent();
            }
        }
    }

    public final int getCurDataIndex() {
        return this.LLJILLL;
    }

    public final int getNextDataIndex() {
        return this.LLJJ;
    }

    public final Function0<Unit> getOnFollowRepostShow() {
        return this.LL;
    }

    public final Function1<C428890Grn, Unit> getOnSecondViewLazyCreated() {
        return this.LLJJJIL;
    }

    public final InterfaceC497601wk getScope() {
        return this.LLJJIII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1360050lUp LJFF(String str) {
        return new C1360050lUp(C1697810uHb.LJIILJJIL(C10EU.LIZ()), 1L, str, 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 2032);
    }

    public static Map LJII(UpvoteList upvoteList) {
        String uid;
        if (C298730BnL.LIZIZ()) {
            List<UpvoteStruct> commentUpvotes = upvoteList.getCommentUpvotes();
            ArrayList arrayList = new ArrayList();
            for (UpvoteStruct upvoteStruct : commentUpvotes) {
                if (C1359720lUI.LJ(upvoteStruct)) {
                    arrayList.add(upvoteStruct);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : arrayList) {
                User user = ((UpvoteStruct) obj).user;
                if (user == null || (uid = user.getUid()) == null) {
                    uid = "";
                }
                Object arrayList2 = linkedHashMap.get(uid);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(uid, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            return linkedHashMap;
        }
        return C2097608Jq.LJ();
    }

    public static void LJIIJJI(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                C1360050lUp c1360050lUp = (C1360050lUp) obj;
                if (C1359820lUS.LIZ(c1360050lUp.LIZ) && C703302op.LIZ(c1360050lUp.LIZJ)) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C1360050lUp) it2.next()).LJ = false;
            }
        }
    }

    public static void LJIIL(List list) {
        Object next;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((C1360050lUp) next).LJIIJ) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1360050lUp c1360050lUp = (C1360050lUp) next;
            if (c1360050lUp != null) {
                c1360050lUp.LJ = false;
            }
        }
    }

    public final void LIZIZ(AbstractC420810Gel abstractC420810Gel) {
        C428890Grn c428890Grn;
        if ((abstractC420810Gel instanceof C428890Grn) && (c428890Grn = (C428890Grn) abstractC420810Gel) != null) {
            c428890Grn.setOnNoteGuideClick(new AwS600S0100000_21(this, 187));
        }
    }

    public final void LIZJ(int i) {
        C1360050lUp c1360050lUp;
        List<C1360050lUp> list = this.LLJILJILJ;
        if (list == null || (c1360050lUp = (C1360050lUp) C13LP.LJJJLZIJ(i, list)) == null) {
            return;
        }
        this.LLJILLL = i;
        C1360130lUx c1360130lUx = this.LLILLJJLI;
        Aweme aweme = this.LLILZ;
        C428890Grn c428890Grn = c1360130lUx.LIZ;
        if (c428890Grn != null) {
            int i2 = C428890Grn.LLLIIIIL;
            c428890Grn.M0(c1360050lUp, aweme, false);
        }
        C786410Ut5.R1(getCurView(), 0);
        C786410Ut5.R5(getCurView(), 1.0f);
    }

    public final boolean LJIILIIL(List<C1360050lUp> list) {
        C1360050lUp c1360050lUp;
        String str;
        if (list != null && (c1360050lUp = (C1360050lUp) C13LP.LJJJLZIJ(this.LLJILLL, list)) != null && (str = c1360050lUp.LIZJ) != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    public final void LJIILJJIL(C1360050lUp c1360050lUp) {
        if (c1360050lUp == null) {
            return;
        }
        int i = c1360050lUp.LIZLLL;
        if (i != 2 && i != 3) {
            if (i == 1 && c1360050lUp.LJIIIIZZ) {
                c1360050lUp.LJIIIIZZ = false;
                C054G c054g = this.LLJJIII;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c054g, C2107308Nj.LIZ, null, new C1360030lUn(this, null), 2);
                return;
            }
            return;
        }
        if (!c1360050lUp.LJII) {
            return;
        }
        c1360050lUp.LJII = false;
        C23250099c.LIZLLL(this.LLJJIII, null, null, new C1360020lUm(this, c1360050lUp, null), 3);
    }

    public final void LJIILL(C1360050lUp c1360050lUp) {
        if (c1360050lUp.LJI) {
            c1360050lUp.LJI = false;
            C23250099c.LIZLLL(this.LLJJIII, null, null, new C1360010lUl(this, c1360050lUp, null), 3);
        }
    }

    public final void LJIILLIIL(String str) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onText. data=");
        List<C1360050lUp> list = this.LLJILJILJ;
        C1360050lUp c1360050lUp = null;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", cur=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(", nex=");
        sbLIZ.append(this.LLJJ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1360050lUp c1360050lUpLJFF = LJFF(str);
        LJIIJJI(this.LLJILJILJ);
        LJIIL(this.LLJILJILJ);
        List<C1360050lUp> list2 = this.LLJILJILJ;
        if (list2 != null) {
            ListProtector.add(list2, this.LLJJ, c1360050lUpLJFF);
        }
        List<C1360050lUp> list3 = this.LLJILJILJ;
        if (list3 != null) {
            c1360050lUp = (C1360050lUp) C13LP.LJJJLZIJ(0, list3);
        }
        if (c1360050lUp != null) {
            c1360050lUp.LIZLLL = 0;
            if (c1360050lUp.LIZ.size() == 1 && C10EU.LJIILLIIL((User) C13LP.LJJJLZIJ(0, c1360050lUp.LIZ))) {
                c1360050lUp.LJ = false;
            }
        }
        this.LLIZLLLIL = true;
        LJJ();
    }

    public final void LJIJI(boolean z) {
        this.LLJILLL = -1;
        this.LLJJ = 0;
        this.LLJJI = false;
        if (z) {
            C786410Ut5.R1(getCurView(), 8);
            if (this.LLJJJ) {
                C786410Ut5.R1(getNextView(), 8);
            }
        }
    }

    public final void LJJIFFI(boolean z) {
        Aweme aweme;
        HandlerHook.viewRemoveCallbacks(this, this.LLJJJJ);
        LJIIIIZZ();
        boolean z2 = false;
        if (!z && ((aweme = this.LLILZ) == null || !AwemeExtKt.isPhotoMode(aweme) || !C0SKM.LJIIIIZZ().repostJumpFix)) {
            z2 = true;
        }
        LJIJI(z2);
        HandlerHook.viewPostDelay(this, this.LLJJJJ, 0L);
    }

    public final void setCurDataIndex(int i) {
        this.LLJILLL = i;
    }

    public final void setNextDataIndex(int i) {
        this.LLJJ = i;
    }

    public final void setOnFollowRepostShow(Function0<Unit> function0) {
        this.LL = function0;
    }

    public final void setOnSecondViewLazyCreated(Function1<? super C428890Grn, Unit> function1) {
        this.LLJJJIL = function1;
    }

    public static void LIZ(C1360050lUp c1360050lUp, int i) {
        if (!c1360050lUp.LJFF) {
            return;
        }
        ListProtector.add(c1360050lUp.LIZ, 0, C10EU.LIZ());
        c1360050lUp.LIZIZ++;
        c1360050lUp.LIZLLL = i;
        c1360050lUp.LJ = true;
        c1360050lUp.LJI = true;
    }

    public static int LJIIIZ(Aweme aweme, String str) {
        String first;
        int i;
        String str2 = str;
        if (aweme != null) {
            Pair<String, String> pair = C1360080lUs.LIZIZ;
            String second = null;
            if (pair != null) {
                first = pair.getFirst();
            } else {
                first = null;
            }
            if (Intrinsics.LJFF(first, aweme.getAid())) {
                Pair<String, String> pair2 = C1360080lUs.LIZIZ;
                if (pair2 != null) {
                    second = pair2.getSecond();
                }
                if (Intrinsics.LJFF(second, str2)) {
                    return 3;
                }
            }
            if (C298430Bmr.LIZ()) {
                if (((ArrayList) C1360080lUs.LIZ).contains(aweme.getAid())) {
                    int iIntValue = ((Number) C263770AVj.LIZ.getValue()).intValue();
                    C1358720lSg.LIZ.getClass();
                    long j = C1358720lSg.LIZIZ().getLong("key_click_repost_add_text_time", -1L);
                    int i2 = Integer.MAX_VALUE;
                    if (j > 0) {
                        SimpleDateFormat simpleDateFormat = C1360170lV1.LIZ;
                        long jCurrentTimeMillis = (System.currentTimeMillis() - j) / 86400000;
                        if (jCurrentTimeMillis > 2147483647L) {
                            i = Integer.MAX_VALUE;
                        } else {
                            i = (int) jCurrentTimeMillis;
                        }
                        if (i < iIntValue) {
                            return 2;
                        }
                    }
                    long j2 = C1358720lSg.LIZIZ().getLong("key_repost_add_text_version_time", -1L);
                    if (j < 0) {
                        SimpleDateFormat simpleDateFormat2 = C1360170lV1.LIZ;
                        long jCurrentTimeMillis2 = (System.currentTimeMillis() - j2) / 86400000;
                        if (jCurrentTimeMillis2 <= 2147483647L) {
                            i2 = (int) jCurrentTimeMillis2;
                        }
                        if (i2 < iIntValue) {
                            return 2;
                        }
                    }
                    long j3 = C1358720lSg.LIZIZ().getLong("key_show_repost_add_text_guide_time", -1L);
                    if (j3 > 0) {
                        SimpleDateFormat simpleDateFormat3 = C1360170lV1.LIZ;
                        try {
                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                            if (jCurrentTimeMillis3 >= 0) {
                                SimpleDateFormat simpleDateFormat4 = C1360170lV1.LIZ;
                                if (Intrinsics.LJFF(simpleDateFormat4.format(Long.valueOf(j3)), simpleDateFormat4.format(Long.valueOf(jCurrentTimeMillis3)))) {
                                    return 2;
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    int iIntValue2 = ((Number) C263750AVh.LIZ.getValue()).intValue();
                    C1358720lSg.LIZ.getClass();
                    if (C1358720lSg.LIZIZ().getInt("key_show_repost_add_text_guide_count", 0) >= iIntValue2) {
                        return 2;
                    }
                    String aid = aweme.getAid();
                    if (aid == null) {
                        aid = "";
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    C1360080lUs.LIZIZ = new Pair<>(aid, str2);
                    return 3;
                }
                return 2;
            }
            return 2;
        }
        return 2;
    }

    public final void LJJI(int i, boolean z) {
        C428890Grn c428890Grn;
        List<C1360050lUp> list = this.LLJILJILJ;
        if (list != null && i >= 0 && i < list.size()) {
            if (!this.LLJJJ) {
                this.LLJJJ = true;
                AbstractC420810Gel nextView = getNextView();
                addView(nextView);
                C786410Ut5.R1(nextView, 8);
                if ((nextView instanceof C428890Grn) && (c428890Grn = (C428890Grn) nextView) != null) {
                    c428890Grn.P0();
                    Function1<? super C428890Grn, Unit> function1 = this.LLJJJIL;
                    if (function1 != null) {
                        function1.invoke(c428890Grn);
                    }
                    LIZIZ(c428890Grn);
                }
            }
            this.LLJILLL = i;
            C1360130lUx c1360130lUx = this.LLILLL;
            C1360050lUp c1360050lUp = (C1360050lUp) ListProtector.get(list, i);
            Aweme aweme = this.LLILZ;
            if (c1360050lUp == null) {
                c1360130lUx.getClass();
            } else {
                C428890Grn c428890Grn2 = c1360130lUx.LIZ;
                if (c428890Grn2 != null) {
                    int i2 = C428890Grn.LLLIIIIL;
                    c428890Grn2.M0(c1360050lUp, aweme, false);
                }
            }
            if (this.LLIZLLLIL) {
                this.LLIZLLLIL = false;
                if (C0H4W.LIZ()) {
                    getNextView().setPivotX(getNextView().getWidth());
                    getNextView().setPivotY(getNextView().getHeight());
                } else {
                    getNextView().setPivotX(0.0f);
                    getNextView().setPivotY(getNextView().getHeight());
                }
                C21616519il c21616519ilLJIILL = C1619980sG4.LJIILL(getNextView(), AbstractC21616419ik.LJIILL, 1.0f);
                c21616519ilLJIILL.LJI(0.8f);
                c21616519ilLJIILL.LIZIZ(new InterfaceC1427630nFp() { // from class: X.0lUr
                    @Override // X.InterfaceC1427630nFp
                    public final void LIZ(AbstractC21616419ik abstractC21616419ik, boolean z2, float f, float f2) {
                        C1359990lUj c1359990lUj = this.LIZ;
                        C1360130lUx c1360130lUx2 = c1359990lUj.LLILLJJLI;
                        c1359990lUj.LLILLJJLI = c1359990lUj.LLILLL;
                        c1359990lUj.LLILLL = c1360130lUx2;
                    }
                });
                this.LLJI = c21616519ilLJIILL;
                C21616519il c21616519ilLJIILL2 = C1619980sG4.LJIILL(getNextView(), AbstractC21616419ik.LJIILLIIL, 1.0f);
                c21616519ilLJIILL2.LJI(0.8f);
                this.LLJIJIL = c21616519ilLJIILL2;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getNextView(), (Property<AbstractC420810Gel, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(250L);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat.addListener(new AAListenerS332S0100000_21(this, 16));
                this.LLJILJIL = objectAnimatorOfFloat;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(getCurView(), (Property<AbstractC420810Gel, Float>) View.ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat2.setDuration(150L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.addListener(new AAListenerS332S0100000_21(this, 17));
                objectAnimatorOfFloat2.start();
            } else if (z) {
                this.LLIZ.setTarget(getCurView());
                this.LLIZ.addListener(new AAListenerS332S0100000_21(this, 14));
                this.LLILZLL.setTarget(getNextView());
                this.LLILZLL.addListener(new AAListenerS332S0100000_21(this, 15));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(this.LLIZ, this.LLILZLL);
                animatorSet.addListener(new AAListenerS332S0100000_21(this, 18));
                animatorSet.start();
                this.LLJ = animatorSet;
            } else {
                C786410Ut5.R1(getNextView(), 0);
                C786410Ut5.R5(getNextView(), 1.0f);
                C786410Ut5.R1(getCurView(), 8);
                C786410Ut5.R5(getCurView(), 0.0f);
                C1360130lUx c1360130lUx2 = this.LLILLJJLI;
                this.LLILLJJLI = this.LLILLL;
                this.LLILLL = c1360130lUx2;
            }
            C1360050lUp c1360050lUp2 = (C1360050lUp) ListProtector.get(list, i);
            LJIILL(c1360050lUp2);
            LJIILJJIL(c1360050lUp2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0lUo] */
    public C1359990lUj(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = new C1360100lUu();
        this.LLILLJJLI = new C1360130lUx();
        this.LLILLL = new C1360130lUx();
        this.LLILZIL = "";
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.LLILZLL = objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(250L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        this.LLIZ = objectAnimatorOfFloat2;
        this.LLJILLL = -1;
        this.LLJJIII = C2296808zG.LIZ(C0PEM.LIZJ);
        this.LLJJIJI = true;
        this.LLJJJ = true;
        setClipChildren(false);
        setClipToPadding(false);
        this.LLJJJJ = new Runnable() { // from class: X.0lUo
            public final void LIZ() {
                List<C1360050lUp> list = this.LL.LLJILJILJ;
                if (list == null) {
                    return;
                }
                while (this.LL.getNextDataIndex() < list.size() && !((C1360050lUp) ListProtector.get(list, this.LL.getNextDataIndex())).LJ) {
                    C1359990lUj c1359990lUj = this.LL;
                    c1359990lUj.setNextDataIndex(c1359990lUj.getNextDataIndex() + 1);
                }
                if (this.LL.getNextDataIndex() >= list.size()) {
                    C1359990lUj c1359990lUj2 = this.LL;
                    c1359990lUj2.LLJJI = true;
                    c1359990lUj2.LJIL();
                    return;
                }
                C1360050lUp c1360050lUp = (C1360050lUp) C13LP.LJJJLZIJ(this.LL.getNextDataIndex(), list);
                boolean z = c1360050lUp != null && c1360050lUp.LJFF;
                long j = (!C07NU.LIZ() ? z : z) ? 3000L : 2000L;
                C1359990lUj c1359990lUj3 = this.LL;
                c1359990lUj3.LJJI(c1359990lUj3.LLJJ, c1359990lUj3.getCurDataIndex() != -1);
                c1359990lUj3.LLJJ++;
                HandlerHook.viewPostDelay(this.LL, this, j);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("RepostViewFlipper@a2ac.flipRunnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("RepostViewFlipper@a2ac.flipRunnable$1");
            }
        };
        addView(getCurView());
        C786410Ut5.R1(getCurView(), 8);
        if (C1358180lRo.LIZLLL()) {
            this.LLJJJ = false;
        } else {
            addView(getNextView());
            C786410Ut5.R1(getNextView(), 8);
        }
    }

    public static String LIZLLL(UpvoteList upvoteList, Aweme aweme, String str) {
        String aid;
        String uid;
        String uid2;
        int length;
        StringBuilder sb = new StringBuilder();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sb.append(aid);
        sb.append('|');
        sb.append(upvoteList.total);
        sb.append('|');
        if (str == null) {
            str = "";
        }
        sb.append(str);
        for (UpvoteStruct upvoteStruct : upvoteList.upvotes) {
            sb.append('#');
            User user = upvoteStruct.user;
            if (user != null) {
                uid2 = user.getUid();
            } else {
                uid2 = null;
            }
            sb.append(uid2);
            sb.append(':');
            String str2 = upvoteStruct.text;
            if (str2 != null) {
                length = str2.length();
            } else {
                length = 0;
            }
            sb.append(length);
            sb.append(':');
            sb.append(upvoteStruct.createTime);
            sb.append(':');
            sb.append(upvoteStruct.repostItemSource);
            sb.append(':');
            sb.append(upvoteStruct.bubbleHidden);
        }
        sb.append("|c");
        for (UpvoteStruct upvoteStruct2 : upvoteList.getCommentUpvotes()) {
            sb.append('#');
            User user2 = upvoteStruct2.user;
            if (user2 != null) {
                uid = user2.getUid();
            } else {
                uid = null;
            }
            sb.append(uid);
            sb.append(':');
            sb.append(upvoteStruct2.createTime);
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List LJI(UpvoteList upvoteList, String str, Map map) {
        char c;
        long size;
        String uid;
        Collection collectionSingletonList;
        Object next;
        String str2;
        List<UpvoteStruct> list = upvoteList.upvotes;
        ArrayList<UpvoteStruct> arrayList = new ArrayList();
        Iterator<UpvoteStruct> it2 = list.iterator();
        while (true) {
            c = 0;
            if (!it2.hasNext()) {
                break;
            }
            UpvoteStruct next2 = it2.next();
            UpvoteStruct upvoteStruct = next2;
            if (C10EU.LJIILLIIL(upvoteStruct.user) || (C1359720lUI.LJII(upvoteStruct.user) && !upvoteStruct.bubbleHidden)) {
                arrayList.add(next2);
            }
        }
        if (Intrinsics.LJFF(str, "repost_feed")) {
            size = arrayList.size();
        } else {
            size = upvoteList.total;
        }
        ArrayList arrayList2 = new ArrayList();
        for (UpvoteStruct upvoteStruct2 : arrayList) {
            User user = upvoteStruct2.user;
            if (user != null && (uid = user.getUid()) != null) {
                if (C1359720lUI.LJ(upvoteStruct2)) {
                    collectionSingletonList = Collections.singletonList(upvoteStruct2);
                } else {
                    collectionSingletonList = C13BV.INSTANCE;
                }
                Iterable iterable = (Iterable) map.get(uid);
                if (iterable == null) {
                    iterable = C13BV.INSTANCE;
                }
                Iterator it3 = ((ArrayList) C13LP.LJLIL(iterable, collectionSingletonList)).iterator();
                if (!it3.hasNext()) {
                    next = null;
                } else {
                    next = it3.next();
                    if (it3.hasNext()) {
                        long j = ((UpvoteStruct) next).createTime;
                        do {
                            Object next3 = it3.next();
                            long j2 = ((UpvoteStruct) next3).createTime;
                            if (j < j2) {
                                next = next3;
                                j = j2;
                            }
                        } while (it3.hasNext());
                    }
                }
                UpvoteStruct upvoteStruct3 = (UpvoteStruct) next;
                if (upvoteStruct3 != null) {
                    if (upvoteStruct3.carrierType == CarrierType.COMMENT.getValue()) {
                        str2 = "comment";
                    } else {
                        str2 = "video";
                    }
                    User[] userArr = new User[1];
                    userArr[c] = user;
                    arrayList2.add(new C1360050lUp(C1697810uHb.LJIILJJIL(userArr), size, C1359720lUI.LIZLLL(upvoteStruct3), 0, 0 == true ? 1 : 0, str2, 0 == true ? 1 : 0, 1520));
                }
            }
            c = 0;
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        r1 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(int r12, long r13, java.util.List r15) {
        /*
            r3 = r15
            java.util.Iterator r1 = r3.iterator()
        L5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r5 = r1.next()
            r0 = r5
            X.0lUp r0 = (X.C1360050lUp) r0
            boolean r0 = r0.LJIIJ
            if (r0 == 0) goto L5
        L16:
            X.0lUp r5 = (X.C1360050lUp) r5
            boolean r0 = X.C07NU.LIZ()
            r11 = 0
            r4 = 1
            if (r0 == 0) goto L40
            X.01GW r0 = X.C07NU.LIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.upvote.experiment.RepostBubbleOptConfig r0 = (com.ss.android.ugc.aweme.upvote.experiment.RepostBubbleOptConfig) r0
            if (r0 == 0) goto L40
            boolean r0 = r0.enableNoteGuide
            if (r0 == 0) goto L40
            r1 = 1
            r7 = r13
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L40
            r0 = 2
            if (r12 == r0) goto L3b
            r0 = 3
            if (r12 != r0) goto L40
        L3b:
            if (r5 == 0) goto L47
            r5.LJ = r4
        L3f:
            return
        L40:
            if (r5 == 0) goto L3f
            r5.LJ = r11
            return
        L45:
            r5 = 0
            goto L16
        L47:
            java.util.Iterator r2 = r3.iterator()
            r1 = 0
        L4c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r2.next()
            X.0lUp r0 = (X.C1360050lUp) r0
            boolean r0 = r0.LJFF
            if (r0 == 0) goto L7d
            if (r1 >= 0) goto L5f
        L5e:
            r1 = 0
        L5f:
            int r2 = r1 + 1
            X.0lUp r5 = new X.0lUp
            com.ss.android.ugc.aweme.profile.model.User[] r1 = new com.ss.android.ugc.aweme.profile.model.User[r4]
            com.ss.android.ugc.aweme.profile.model.User r0 = X.C10EU.LIZ()
            r1[r11] = r0
            java.util.List r6 = X.C1697810uHb.LJIILJJIL(r1)
            java.lang.String r9 = ""
            r10 = 2
            r12 = 0
            r13 = 1
            r14 = 1008(0x3f0, float:1.413E-42)
            r5.<init>(r6, r7, r9, r10, r11, r12, r13, r14)
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r3, r2, r5)
            return
        L7d:
            int r1 = r1 + 1
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1359990lUj.LJIIJ(int, long, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList r25, com.ss.android.ugc.aweme.feed.model.Aweme r26, java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1359990lUj.LJ(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    public final void LJIJJLI(UpvoteList upvoteList, Aweme aweme, String str) {
        if (C1358180lRo.LIZLLL()) {
            String strLIZLLL = LIZLLL(upvoteList, aweme, str);
            if (Intrinsics.LJFF(strLIZLLL, this.LLJJIJIL) && this.LLJILJILJ != null && this.LLJJIJI) {
                this.LLILZ = aweme;
                if (str == null) {
                    str = "";
                }
                this.LLILZIL = str;
                return;
            }
            if (Intrinsics.LJFF(strLIZLLL, this.LLJJIJIL) && this.LLJILJILJ != null && !this.LLJJIJI) {
                this.LLILZ = aweme;
                if (str == null) {
                    str = "";
                }
                this.LLILZIL = str;
                LJIIIIZZ();
                return;
            }
            this.LLJJIJIL = strLIZLLL;
        }
        LJ(upvoteList, aweme, str);
    }

    public final void LJIIZILJ(C1360050lUp c1360050lUp, UpvoteList upvoteList, int i, int i2) {
        String str;
        C428890Grn c428890Grn;
        AbstractC429340GsW abstractC429340GsW;
        C428890Grn c428890Grn2;
        boolean z = false;
        String aid = null;
        if (C07NU.LIZ()) {
            AbstractC420810Gel curView = getCurView();
            if ((curView instanceof C428890Grn) && (c428890Grn2 = (C428890Grn) curView) != null) {
                Aweme aweme = this.LLILZ;
                if (i == 1) {
                    z = true;
                }
                c428890Grn2.M0(c1360050lUp, aweme, z);
                return;
            }
            return;
        }
        if (!C0RSD.LIZ() || (((Number) C0BNV.LIZ.getValue()).intValue() > 0 && C1788506zT.LIZ(6.8f))) {
            if (i == 1) {
                str = "publish";
            } else {
                str = "remove";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("binding aid: ");
            Aweme aweme2 = this.LLILZ;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            }
            sbLIZ.append(aid);
            sbLIZ.append(", white bar rebind by ");
            sbLIZ.append(str);
            C429430Gsf.LIZ("RepostPublishMonitor", C2188811AlT.LIZIZ(sbLIZ));
            AbstractC420810Gel curView2 = getCurView();
            if ((curView2 instanceof C428890Grn) && (c428890Grn = (C428890Grn) curView2) != null) {
                Aweme aweme3 = this.LLILZ;
                int i3 = C428890Grn.LLLIIIIL;
                c428890Grn.M0(c1360050lUp, aweme3, false);
                return;
            }
            return;
        }
        AbstractC420810Gel curView3 = getCurView();
        if (!(curView3 instanceof AbstractC429340GsW) || (abstractC429340GsW = (AbstractC429340GsW) curView3) == null) {
            return;
        }
        abstractC429340GsW.E0(i, upvoteList.total, upvoteList.upvotes);
        abstractC429340GsW.j0(i2, this.LLILZ);
    }
}
