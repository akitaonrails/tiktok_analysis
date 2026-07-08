package X;

import Y.AAListenerS133S0300000_6;
import Y.AAListenerS261S0200000_6;
import Y.AAListenerS317S0100000_6;
import Y.AComparatorS25S0000000_6;
import Y.AUListenerS253S0100000_2;
import Y.AUListenerS256S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GsW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC429340GsW extends AbstractC420810Gel {
    public static final int LLJILJILJ;
    public static final int LLJILLL;
    public static final int LLJJ;
    public int LLIZLLLIL;
    public AnimatorSet LLJ;
    public final C429370GsZ LLJI;
    public String LLJIJIL;
    public final Drawable LLJILJIL;

    public abstract FrameLayout getAvatarLL();

    public abstract int getUpvoteTVMaxWidth();

    public void j0(int i, Aweme aweme) {
    }

    static {
        int iIntValue = ((Number) C0B0P.LIZ.getValue()).intValue() + 4;
        LLJILJILJ = iIntValue;
        LLJILLL = iIntValue + 4;
        LLJJ = ((iIntValue * 3) + 2) - 20;
    }

    @Override // X.AbstractC420810Gel
    public int getWhiteBarStyle() {
        return this.LLIZLLLIL;
    }

    private final void setText(String str) {
        F0(0, str, null);
    }

    public static String z0(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (C13LQ.LJJIJIIJI(Character.valueOf(str.charAt(i)), new Character[]{'\n', '\r'}) >= 0) {
                if (i > 0) {
                    return str.substring(0, i);
                }
                return str;
            }
        }
        return str;
    }

    public final C427870Gq9 n0(Context context) {
        C427870Gq9 c427870Gq9;
        C429370GsZ c429370GsZ = this.LLJI;
        C1331100kk8 c1331100kk8 = null;
        if (c429370GsZ.LIZIZ.isEmpty()) {
            C418910Gbh c418910Gbh = new C418910Gbh(context, null, 0);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            C426750GoL.LJIIL(c418910Gbh, Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), 16);
            if (((Number) C0BWS.LIZ.getValue()).intValue() == 2) {
                int i = LLJILJILJ;
                float fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf((i / 2) - 10));
                float fLIZIZ2 = C418440Gaw.LIZIZ(Integer.valueOf(i)) / 2;
                c418910Gbh.LLJJIII = true;
                c418910Gbh.LLJJIJI = fLIZIZ;
                c418910Gbh.LLJJIJIIJIL = fLIZIZ2;
                c418910Gbh.invalidate();
            } else {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
                c384050F3z.LIZLLL = Integer.valueOf(iLIZIZ);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
                c418910Gbh.setBackground(c384050F3z.LIZ(c418910Gbh.getContext()));
            }
            C1331100kk8 c1331100kk82 = c418910Gbh.getHierarchy().LIZJ;
            if (c1331100kk82 != null) {
                c1331100kk82.LJFF(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
                c1331100kk82.LJFF = C960203pA.LIZ(R.attr.ng, c418910Gbh.getContext());
                c1331100kk82.LJII = true;
                c1331100kk8 = c1331100kk82;
            }
            c418910Gbh.getHierarchy().LJJIII(c1331100kk8);
            c427870Gq9 = c418910Gbh;
        } else {
            C427870Gq9 c427870Gq92 = (C427870Gq9) ((View) c429370GsZ.LIZIZ.remove(0));
            ViewParent parent = c427870Gq92.getParent();
            c427870Gq9 = c427870Gq92;
            if (parent != null) {
                ViewParent parent2 = c427870Gq92.getParent();
                c427870Gq9 = c427870Gq92;
                if (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    c427870Gq9 = c427870Gq92;
                    if (viewGroup != null) {
                        C786410Ut5.LJJJLZIJ(c427870Gq92, viewGroup);
                        return c427870Gq92;
                    }
                }
            }
        }
        return c427870Gq9;
    }

    public final boolean p0(List<UpvoteStruct> list) {
        List<UpvoteStruct> list2;
        List listLJLLLL;
        String uid;
        String uid2;
        User user;
        Object tag = getTag();
        if (tag instanceof List) {
            list2 = (List) tag;
        } else {
            list2 = null;
        }
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (UpvoteStruct upvoteStruct : list2) {
                if (upvoteStruct != null && (user = upvoteStruct.user) != null) {
                    uid2 = user.getUid();
                } else {
                    uid2 = null;
                }
                arrayList.add(uid2);
            }
            listLJLLLL = C13LP.LJLLLL(new AComparatorS25S0000000_6(1), arrayList);
        } else {
            listLJLLLL = null;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<UpvoteStruct> it2 = list.iterator();
        while (it2.hasNext()) {
            User user2 = it2.next().user;
            if (user2 != null) {
                uid = user2.getUid();
            } else {
                uid = null;
            }
            arrayList2.add(uid);
        }
        List listLJLLLL2 = C13LP.LJLLLL(new AComparatorS25S0000000_6(2), arrayList2);
        if (listLJLLLL == null || !listLJLLLL.equals(listLJLLLL2)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC420810Gel
    public void setWhiteBarStyle(int i) {
        this.LLIZLLLIL = i;
    }

    public AbstractC429340GsW(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void B0(String str, List list) {
        UrlModel avatarThumb;
        C418910Gbh c418910Gbh;
        int iMin = Math.min(list.size(), 3);
        if (C1358180lRo.LIZLLL()) {
            String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LL(list, 3), ",", null, null, 0, null, AFwS236S0000000_6.get$arr$(414), 30);
            if (Intrinsics.LJFF(strLJJLIIIJ, this.LLJIJIL) && getAvatarLL().getChildCount() == iMin) {
                return;
            } else {
                this.LLJIJIL = strLJJLIIIJ;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("binding aid: ");
        sbLIZ.append(str);
        sbLIZ.append(", bind white bar avatar, size: ");
        sbLIZ.append(list.size());
        C429430Gsf.LIZ("RepostPublishMonitor", C2188811AlT.LIZIZ(sbLIZ));
        int childCount = iMin - getAvatarLL().getChildCount();
        if (childCount > 0) {
            int i = 0;
            do {
                C427870Gq9 c427870Gq9N0 = n0(getContext());
                int i2 = LLJILJILJ;
                getAvatarLL().addView(c427870Gq9N0, 0, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)))));
                i++;
            } while (i < childCount);
        } else if (childCount < 0) {
            int iAbs = Math.abs(childCount);
            for (int i3 = 0; i3 < iAbs; i3++) {
                View childAt = getAvatarLL().getChildAt(getAvatarLL().getChildCount() - 1);
                C429370GsZ c429370GsZ = this.LLJI;
                if ((childAt instanceof C427870Gq9) && childAt != null) {
                    if (c429370GsZ.LIZIZ.size() < c429370GsZ.LIZ) {
                        c429370GsZ.LIZIZ.add((T) childAt);
                    }
                } else {
                    c429370GsZ.getClass();
                }
                FrameLayout avatarLL = getAvatarLL();
                int childCount2 = getAvatarLL().getChildCount() - 1;
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(avatarLL, null);
                avatarLL.removeViewAt(childCount2);
            }
        }
        for (int childCount3 = getAvatarLL().getChildCount() - 1; -1 < childCount3; childCount3--) {
            View childAt2 = getAvatarLL().getChildAt(childCount3);
            int childCount4 = (getAvatarLL().getChildCount() - 1) - childCount3;
            ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(C429310GsT.LIZ(childCount4));
                C786410Ut5.W5(childAt2, marginLayoutParams);
                if (childCount4 == 0 && (childAt2 instanceof C418910Gbh) && (c418910Gbh = (C418910Gbh) childAt2) != null) {
                    int i4 = C418910Gbh.LLJJIJIL;
                    c418910Gbh.LLJJIII = false;
                    c418910Gbh.LLJJIJI = 0.0f;
                    c418910Gbh.LLJJIJIIJIL = 0.0f;
                    c418910Gbh.invalidate();
                }
                User user = (User) C13LP.LJJJLZIJ(childCount4, list);
                if (user != null) {
                    avatarThumb = user.getAvatarThumb();
                } else {
                    avatarThumb = null;
                }
                getContext();
                h0(childAt2, avatarThumb);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }

    public final void h0(View view, UrlModel urlModel) {
        SmartImageView smartImageView;
        if ((view instanceof C427870Gq9) && (smartImageView = (SmartImageView) view) != null) {
            smartImageView.setImageDrawable(this.LLJILJIL);
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
            c1331670kl3LJIIIIZZ.LJJ(smartImageView);
            c1331670kl3LJIIIIZZ.LJIIJJI();
            C786410Ut5.LLLLJI((C427870Gq9) view, 0);
        }
    }

    public final void i0(long j, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            User user = ((UpvoteStruct) it2.next()).user;
            if (user != null) {
                arrayList.add(user);
            }
        }
        l0(j, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(long r10, java.util.List r12) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC429340GsW.l0(long, java.util.List):void");
    }

    public final String s0(int i, String str) {
        if (i >= 0 && i < e0(str)) {
            return str.substring(0, StaticLayout.Builder.obtain(str, 0, str.length(), getUpvoteTV().getPaint(), i).build().getLineEnd(0));
        }
        return str;
    }

    public final String u0(int i, String str) {
        if (i >= 0) {
            float f = i;
            if (f < e0(str)) {
                int iCeil = (int) (f - ((float) Math.ceil(e0("..."))));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(s0(iCeil, str));
                sbLIZ.append("...");
                return C444960Hcc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0GsZ] */
    public AbstractC429340GsW(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLIZLLLIL = 3;
        this.LLJI = new AbstractC429350GsX<C427870Gq9>() { // from class: X.0GsZ
        };
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bv);
        this.LLJILJIL = c384050F3z.LIZ(context);
    }

    public void C0(Aweme aweme, List list, long j) {
        String aid;
        if (p0(list)) {
            return;
        }
        setTag(list);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            User user = ((UpvoteStruct) it2.next()).user;
            if (user != null) {
                arrayList.add(user);
            }
        }
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        B0(aid, arrayList);
        i0(j, list);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void E0(int i, long j, List list) {
        int iLIZ;
        int marginStart;
        float f;
        int iLIZ2;
        AnimatorSet animatorSet;
        List<UpvoteStruct> list2;
        String uid;
        User user;
        String uid2;
        if (p0(list)) {
            return;
        }
        UrlModel avatarThumb = null;
        if (i == 1) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                User user2 = ((UpvoteStruct) it2.next()).user;
                if (user2 != null) {
                    uid2 = user2.getUid();
                } else {
                    uid2 = null;
                }
                arrayList.add(uid2);
            }
            Object objLJJJLL = C13LP.LJJJLL(arrayList);
            Object tag = getTag();
            if ((tag instanceof List) && (list2 = (List) tag) != null) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                for (UpvoteStruct upvoteStruct : list2) {
                    if (upvoteStruct != null && (user = upvoteStruct.user) != null) {
                        uid = user.getUid();
                    } else {
                        uid = null;
                    }
                    arrayList2.add(uid);
                }
                if (arrayList2.contains(objLJJJLL)) {
                    return;
                }
            }
        }
        setTag(list);
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            User user3 = ((UpvoteStruct) it3.next()).user;
            if (user3 != null) {
                arrayList3.add(user3);
            }
        }
        AnimatorSet animatorSet2 = this.LLJ;
        if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.LLJ) != null) {
            animatorSet.cancel();
        }
        int size = arrayList3.size();
        int i2 = 3;
        if (i != 1) {
            if (i == 2 && getAvatarLL().getChildCount() >= 3 && size >= 3) {
                C427870Gq9 c427870Gq9N0 = n0(getContext());
                int i3 = LLJILJILJ;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3))));
                layoutParams.setMarginStart(C429310GsT.LIZ(2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3))));
                getAvatarLL().addView(c427870Gq9N0, 0, layoutParams);
                User user4 = (User) C13LP.LJJJLZIJ(2, arrayList3);
                if (user4 != null) {
                    avatarThumb = user4.getAvatarThumb();
                }
                getContext();
                h0(c427870Gq9N0, avatarThumb);
            }
        } else {
            if (size <= 1) {
                Iterator it4 = new C462910IDh(getAvatarLL(), 2).iterator();
                while (true) {
                    C462890IDf c462890IDf = (C462890IDf) it4;
                    if (!c462890IDf.hasNext()) {
                        break;
                    }
                    View view = (View) c462890IDf.next();
                    C429370GsZ c429370GsZ = this.LLJI;
                    if ((view instanceof C427870Gq9) && view != null) {
                        if (c429370GsZ.LIZIZ.size() < c429370GsZ.LIZ) {
                            c429370GsZ.LIZIZ.add((T) view);
                        }
                    } else {
                        c429370GsZ.getClass();
                    }
                }
                C786410Ut5.LJJJLL(getAvatarLL());
            }
            C427870Gq9 c427870Gq9N02 = n0(getContext());
            int i4 = LLJILJILJ;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i4))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i4))));
            if (size > 1) {
                iLIZ = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i4)));
            } else {
                iLIZ = C429310GsT.LIZ(0);
            }
            layoutParams2.setMarginStart(iLIZ);
            getAvatarLL().addView(c427870Gq9N02, getAvatarLL().getChildCount(), layoutParams2);
            User user5 = (User) C13LP.LJJJLZIJ(0, arrayList3);
            if (user5 != null) {
                avatarThumb = user5.getAvatarThumb();
            }
            getContext();
            h0(c427870Gq9N02, avatarThumb);
        }
        if (getAvatarLL().getChildCount() > 1) {
            this.LLJ = new AnimatorSet();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int childCount = getAvatarLL().getChildCount();
            int i5 = 0;
            while (i5 < childCount) {
                View childAt = getAvatarLL().getChildAt(i5);
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    marginStart = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart();
                } else {
                    marginStart = 0;
                }
                C118300cf c118300cf = new C118300cf();
                c118300cf.element = C429310GsT.LIZ((getAvatarLL().getChildCount() - 1) - i5);
                if (i5 == 0 && getAvatarLL().getChildCount() > i2 && size > i2) {
                    c118300cf.element += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLJILJILJ)));
                }
                if (i == 2) {
                    if (i5 == getAvatarLL().getChildCount() - 1) {
                        iLIZ2 = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLJILJILJ)));
                    } else {
                        iLIZ2 = C429310GsT.LIZ((getAvatarLL().getChildCount() - 1) - (i5 + 1));
                    }
                    c118300cf.element = iLIZ2;
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(marginStart, c118300cf.element);
                C429360GsY c429360GsY = new C429360GsY(i, this, i5, childAt);
                valueAnimatorOfInt.addListener(new AAListenerS317S0100000_6(c429360GsY, 34));
                valueAnimatorOfInt.addListener(new AAListenerS133S0300000_6(c429360GsY, childAt, c118300cf, 7));
                valueAnimatorOfInt.addUpdateListener(new AUListenerS253S0100000_2(childAt, 18));
                linkedHashSet.add(valueAnimatorOfInt);
                float f2 = 0.0f;
                if (getAvatarLL().getChildCount() > i2 && i5 == 0) {
                    C817403Hg c817403Hg = new C817403Hg();
                    if (i == 2) {
                        c817403Hg.element = 1.0f;
                        f = 0.0f;
                    } else {
                        f = 1.0f;
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, c817403Hg.element);
                    valueAnimatorOfFloat.addListener(new AAListenerS261S0200000_6(childAt, c817403Hg, 9));
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(childAt, 62));
                    linkedHashSet.add(valueAnimatorOfFloat);
                }
                if (i5 == getAvatarLL().getChildCount() - 1) {
                    C817403Hg c817403Hg2 = new C817403Hg();
                    c817403Hg2.element = 1.0f;
                    if (i == 2) {
                        c817403Hg2.element = 0.0f;
                        f2 = 1.0f;
                    }
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f2, c817403Hg2.element);
                    valueAnimatorOfFloat2.addListener(new AAListenerS261S0200000_6(childAt, c817403Hg2, 10));
                    valueAnimatorOfFloat2.addUpdateListener(new AUListenerS256S0100000_6(childAt, 63));
                    linkedHashSet.add(valueAnimatorOfFloat2);
                }
                i5++;
                i2 = 3;
            }
            AnimatorSet animatorSet3 = this.LLJ;
            if (animatorSet3 != null) {
                animatorSet3.playTogether(linkedHashSet);
            }
            AnimatorSet animatorSet4 = this.LLJ;
            if (animatorSet4 != null) {
                animatorSet4.setInterpolator(C1619980sG4.LJIILIIL());
            }
            AnimatorSet animatorSet5 = this.LLJ;
            if (animatorSet5 != null) {
                animatorSet5.setDuration(200L);
            }
            AnimatorSet animatorSet6 = this.LLJ;
            if (animatorSet6 != null) {
                animatorSet6.start();
            }
        }
        i0(j, list);
    }

    public final void F0(int i, String str, String str2) {
        String strJ4;
        String strZ0;
        TuxTextView upvoteTV = getUpvoteTV();
        int upvoteTVMaxWidth = getUpvoteTVMaxWidth();
        if (str2 == null) {
            if (str != null && (strZ0 = z0(str)) != null) {
                strJ4 = u0(upvoteTVMaxWidth, strZ0);
                if (strJ4 == null) {
                }
            }
            strJ4 = "";
        } else {
            if (str != null) {
                String strZ02 = z0(str2);
                if (i > 0 && e0(strZ02) > i) {
                    strZ02 = u0(i, strZ02);
                } else {
                    int length = str2.length();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        if (C13LQ.LJJIJIIJI(Character.valueOf(str2.charAt(i2)), new Character[]{'\n', '\r'}) >= 0) {
                            if (i2 > 0) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(strZ02);
                                sbLIZ.append("...");
                                strZ02 = C2188811AlT.LIZIZ(sbLIZ);
                            }
                        } else {
                            i2++;
                        }
                    }
                }
                strJ4 = C786410Ut5.j4(str, Arrays.copyOf(new Object[]{strZ02}, 1));
                float f = upvoteTVMaxWidth;
                if (e0(strJ4) > f) {
                    int iCeil = (int) ((f - ((float) Math.ceil(e0(C786410Ut5.j4(str, Arrays.copyOf(new Object[]{"..."}, 1)))))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(s0(iCeil, str2));
                    sbLIZ2.append("...");
                    strJ4 = C786410Ut5.j4(str, Arrays.copyOf(new Object[]{C444960Hcc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2))}, 1));
                }
                if (strJ4 == null) {
                }
            }
            strJ4 = "";
        }
        upvoteTV.setText(strJ4);
        setWhiteBarStyle(3);
    }
}
