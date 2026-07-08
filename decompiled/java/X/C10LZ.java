package X;

import Y.ARunnableS128S0100000_28;
import Y.ARunnableS97S0200000_28;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeGalleryLayoutManager;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS123S0400000_28;
import kotlin.jvm.internal.AwS159S1200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.10LZ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10LZ extends RelativeLayout implements InterfaceC487330J9f {
    public String LL;
    public RecyclerView LLILLJJLI;
    public List<UserWithAweme> LLILLL;
    public boolean LLILZ;
    public final boolean LLILZIL;
    public C19230610Lg LLILZLL;
    public GalleryLayoutManager LLIZ;
    public C10LM LLIZLLLIL;
    public RecSwipeGalleryLayoutManager LLJ;
    public C2440609hM LLJI;
    public RelationButton LLJIJIL;
    public RelationButton LLJILJIL;
    public C1287400jbe LLJILJILJ;
    public View LLJILLL;
    public final C01GW LLJJ;
    public FrameLayout LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public ViewOnLongClickListenerC19332710kH LLJJJ;

    public final void LJ() {
        if (this.LLILZIL) {
            C1440005kM.LIZ(new C487960JBq(false));
            return;
        }
        GalleryLayoutManager galleryLayoutManager = this.LLIZ;
        if (galleryLayoutManager != null) {
            int i = galleryLayoutManager.LLILZ;
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = getList().findViewHolderForAdapterPosition(i);
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                ((ViewOnClickListenerC19230910Lj) viewHolderFindViewHolderForAdapterPosition).b6();
            }
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = getList().findViewHolderForAdapterPosition(i + 1);
            if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                C786410Ut5.l(((ViewOnClickListenerC19230910Lj) viewHolderFindViewHolderForAdapterPosition2).R5(), 0);
            }
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition3 = getList().findViewHolderForAdapterPosition(i - 1);
            if (viewHolderFindViewHolderForAdapterPosition3 != null) {
                C786410Ut5.l(((ViewOnClickListenerC19230910Lj) viewHolderFindViewHolderForAdapterPosition3).R5(), 0);
            }
        }
        C1440005kM.LIZ(new C487960JBq(false));
    }

    public final void LJFF() {
        GalleryLayoutManager galleryLayoutManager;
        if (this.LLILZIL || (galleryLayoutManager = this.LLIZ) == null) {
            return;
        }
        Iterator<InterfaceC19230410Le> it2 = galleryLayoutManager.LLJILLL.iterator();
        while (it2.hasNext()) {
            it2.next().M1();
        }
    }

    public final RecyclerView getList() {
        RecyclerView recyclerView = this.LLILLJJLI;
        if (recyclerView != null) {
            return recyclerView;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLILZIL) {
            RelationButton relationButton = this.LLJIJIL;
            if (relationButton != null) {
                relationButton.LIZ();
            }
            RelationButton relationButton2 = this.LLJILJIL;
            if (relationButton2 != null) {
                relationButton2.LIZ();
            }
            C2440609hM c2440609hM = this.LLJI;
            if (c2440609hM != null) {
                c2440609hM.LIZ.dispose();
            }
        }
    }

    public final C19230610Lg getAdapter() {
        return this.LLILZLL;
    }

    public final C10LM getAdapterV2() {
        return this.LLIZLLLIL;
    }

    public final C2440609hM getColorManager() {
        return this.LLJI;
    }

    public final GalleryLayoutManager getLayoutManager() {
        return this.LLIZ;
    }

    public final RecSwipeGalleryLayoutManager getLayoutManagerV2() {
        return this.LLJ;
    }

    public final List<UserWithAweme> getMCardItems() {
        return this.LLILLL;
    }

    public final boolean getPendingFirstLayout() {
        return this.LLJJIJIL;
    }

    public final String getRequestId() {
        return this.LL;
    }

    public final boolean getShouldScroll() {
        return this.LLILZ;
    }

    public static int LIZJ(Context context) {
        return ((int) (((C1389340mG4.LIZJ(context, null).LIZIZ * 0.712f) * 1.34f) / 0.93f)) - C341940Daq.LIZ(58.0d);
    }

    public final void LIZIZ(User user) {
        RelationButton relationButton;
        RelationButton relationButton2 = this.LLJIJIL;
        if (relationButton2 == null || (relationButton = this.LLJILJIL) == null) {
            return;
        }
        LifecycleOwner lifecycleOwnerFindSAFExpLifecycleOwner = IMainSAFLifecycleKt.findSAFExpLifecycleOwner(this, (C19EG) null);
        C1387050mCN c1387050mCN = new C1387050mCN(user);
        EnumC2274741E1w enumC2274741E1w = EnumC2274741E1w.FEED_BIG_CARD;
        c1387050mCN.LJFF = enumC2274741E1w;
        c1387050mCN.LIZIZ = false;
        c1387050mCN.LJIIJ = true;
        EnumC1387060mCO enumC1387060mCO = EnumC1387060mCO.FRIENDS;
        c1387050mCN.LJ = enumC1387060mCO;
        c1387050mCN.LJIIJJI = lifecycleOwnerFindSAFExpLifecycleOwner;
        relationButton2.LLLLZIL(c1387050mCN.LIZ());
        relationButton2.setTracker(AFwS217S0000000_28.get$arr$(186));
        relationButton2.setDataChangeListener(new AwS123S0400000_28(relationButton2, relationButton, user, this, 1));
        C1387050mCN c1387050mCN2 = new C1387050mCN(user);
        c1387050mCN2.LJFF = enumC2274741E1w;
        c1387050mCN2.LIZIZ = false;
        c1387050mCN2.LJIIJ = true;
        c1387050mCN2.LJ = enumC1387060mCO;
        c1387050mCN2.LJIIJJI = lifecycleOwnerFindSAFExpLifecycleOwner;
        relationButton.LLLLZIL(c1387050mCN2.LIZ());
        relationButton.setTracker(AFwS217S0000000_28.get$arr$(187));
        if (user.getFollowStatus() == 0) {
            C786410Ut5.t0(relationButton2, 0);
            C786410Ut5.t0(relationButton, 4);
        } else {
            C786410Ut5.t0(relationButton2, 4);
            C786410Ut5.t0(relationButton, 0);
        }
    }

    public final UserWithAweme LIZLLL(int i) {
        if (i >= 0 && i < this.LLILLL.size()) {
            return (UserWithAweme) ListProtector.get(this.LLILLL, i);
        }
        return null;
    }

    public final void LJI(User user) {
        C2440609hM c2440609hM;
        C1287400jbe c1287400jbe;
        int iIntValue;
        List<String> urlList;
        Object objLJJJLL;
        int[] iArr;
        Integer numLJJI;
        C0CF8.LIZ.getClass();
        if (C0CF8.LIZLLL() || (c2440609hM = this.LLJI) == null || (c1287400jbe = this.LLJILJILJ) == null) {
            return;
        }
        UrlModel avatarMedium = user.getAvatarMedium();
        if (avatarMedium != null && (urlList = avatarMedium.getUrlList()) != null && (objLJJJLL = C13LP.LJJJLL(urlList)) != null && (iArr = c2440609hM.LIZIZ.get(objLJJJLL)) != null && (numLJJI = C13LQ.LJJI(iArr)) != null) {
            iIntValue = numLJJI.intValue();
        } else {
            iIntValue = -7829368;
        }
        C1287390jbd c1287390jbd = new C1287390jbd(0.0f, 0.0f, 0.0f, (List<Float>) C1697810uHb.LJIIJJI(Float.valueOf(-0.09f), Float.valueOf(-0.2f)), (List<Float>) C1697810uHb.LJIIJJI(Float.valueOf(1.0f), Float.valueOf(1.0f)), Color.rgb(0, 0, 0), iIntValue, iIntValue, iIntValue, Color.rgb(0, 0, 0), 1.0f, 0.0f);
        setBackground(null);
        C786410Ut5.LLLZIIL(c1287400jbe, 0);
        c1287400jbe.setUniforms(c1287390jbd);
        c1287400jbe.requestRender();
        View view = this.LLJILLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int bottom;
        ViewParent parent = getParent();
        if (parent == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        boolean z = true;
        if (!this.LLILZIL) {
            parent.requestDisallowInterceptTouchEvent(!(parent instanceof RecyclerView));
            return super.dispatchTouchEvent(motionEvent);
        }
        if (parent instanceof RecyclerView) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2 && this.LLJJIJIIJIL) {
                float fAbs = Math.abs(motionEvent.getX() - this.LLJJIII);
                float fAbs2 = Math.abs(motionEvent.getY() - this.LLJJIJI);
                if (fAbs2 > ViewConfiguration.get(getContext()).getScaledTouchSlop() && fAbs2 > fAbs) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }
        } else {
            this.LLJJIII = motionEvent.getX();
            this.LLJJIJI = motionEvent.getY();
            float y = motionEvent.getY();
            int top = getList().getTop();
            FrameLayout frameLayout = this.LLJJI;
            if (frameLayout != null) {
                bottom = frameLayout.getBottom();
            } else {
                bottom = getList().getBottom();
            }
            if (y < top || y > bottom) {
                z = false;
            }
            this.LLJJIJIIJIL = z;
            parent.requestDisallowInterceptTouchEvent(z);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setAdapter(C19230610Lg c19230610Lg) {
        this.LLILZLL = c19230610Lg;
    }

    public final void setAdapterV2(C10LM c10lm) {
        this.LLIZLLLIL = c10lm;
    }

    public final void setColorManager(C2440609hM c2440609hM) {
        this.LLJI = c2440609hM;
    }

    public final void setContainer(WeakReference<Activity> weakReference) {
        int iHashCode;
        GalleryLayoutManager galleryLayoutManager;
        if (!this.LLILZIL && (galleryLayoutManager = this.LLIZ) != null) {
            galleryLayoutManager.LLJILJIL = weakReference;
        }
        Activity activity = weakReference.get();
        if (activity != null) {
            iHashCode = activity.hashCode();
        } else {
            iHashCode = 0;
        }
        C487280J9a.LIZ(iHashCode, this);
    }

    public final void setData(List<UserWithAweme> list) {
        int i;
        User user;
        List<String> urlList;
        try {
            this.LLILLL = list;
            if (this.LLILZIL) {
                C10LM c10lm = this.LLIZLLLIL;
                if (c10lm == null) {
                    return;
                }
                c10lm.mmItems = new ArrayList(list);
                if (!getList().isComputingLayout() && !getList().isAnimating()) {
                    c10lm.notifyDataSetChanged();
                } else {
                    HandlerHook.viewPost(getList(), new ARunnableS97S0200000_28(this, list, 17));
                }
                if (!this.LLILLL.isEmpty()) {
                    RecSwipeGalleryLayoutManager recSwipeGalleryLayoutManager = this.LLJ;
                    if (recSwipeGalleryLayoutManager == null || (i = recSwipeGalleryLayoutManager.LLILZIL) < 0) {
                        i = 0;
                    }
                    UserWithAweme userWithAwemeLIZLLL = LIZLLL(i);
                    String str = null;
                    if (userWithAwemeLIZLLL != null) {
                        user = userWithAwemeLIZLLL.getUser();
                        if (user != null) {
                            UrlModel avatarMedium = user.getAvatarMedium();
                            if (avatarMedium != null && (urlList = avatarMedium.getUrlList()) != null) {
                                str = (String) C13LP.LJJJLL(urlList);
                            }
                            LIZIZ(user);
                        }
                    } else {
                        user = null;
                    }
                    C2440609hM c2440609hM = this.LLJI;
                    if (c2440609hM != null) {
                        List<UserWithAweme> list2 = this.LLILLL;
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                        Iterator<UserWithAweme> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().getUser());
                        }
                        c2440609hM.LIZ(arrayList, new AwS159S1200000_28(this, str, user, 0));
                    }
                    if (user != null) {
                        LJI(user);
                        return;
                    }
                    return;
                }
                return;
            }
            C19230610Lg c19230610Lg = this.LLILZLL;
            if (c19230610Lg == null) {
                return;
            }
            c19230610Lg.mmItems = new ArrayList(list);
            GalleryLayoutManager galleryLayoutManager = this.LLIZ;
            if (galleryLayoutManager != null) {
                galleryLayoutManager.canScrollVertically();
            }
            if (!getList().isComputingLayout() && !getList().isAnimating()) {
                c19230610Lg.notifyDataSetChanged();
            } else {
                HandlerHook.viewPost(getList(), new ARunnableS97S0200000_28(this, list, 18));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("RecSuperUser", "setData error", th);
        }
    }

    public final void setLayoutManager(GalleryLayoutManager galleryLayoutManager) {
        this.LLIZ = galleryLayoutManager;
    }

    public final void setLayoutManagerV2(RecSwipeGalleryLayoutManager recSwipeGalleryLayoutManager) {
        this.LLJ = recSwipeGalleryLayoutManager;
    }

    public final void setList(RecyclerView recyclerView) {
        this.LLILLJJLI = recyclerView;
    }

    public final void setMCardItems(List<UserWithAweme> list) {
        this.LLILLL = list;
    }

    public final void setOnItemOperationListener(C10LS c10ls) {
        if (this.LLILZIL) {
            C10LM c10lm = this.LLIZLLLIL;
            if (c10lm != null) {
                c10lm.LLILZIL = c10ls;
                return;
            }
            return;
        }
        C19230610Lg c19230610Lg = this.LLILZLL;
        if (c19230610Lg == null) {
            return;
        }
        c19230610Lg.LLILZ = c10ls;
    }

    public final void setOnViewFirstShowListener(InterfaceC1565540qqG<ViewOnClickListenerC19230910Lj> interfaceC1565540qqG) {
        C19230610Lg c19230610Lg;
        if (!this.LLILZIL && (c19230610Lg = this.LLILZLL) != null) {
            c19230610Lg.LLILLL = interfaceC1565540qqG;
        }
    }

    public final void setRequestId(String str) {
        this.LL = str;
    }

    public final void setShouldScroll(boolean z) {
        this.LLILZ = z;
    }

    public C10LZ(Context context, AttributeSet attributeSet) {
        int iLIZIZ;
        RelativeLayout.LayoutParams layoutParams;
        super(context, attributeSet);
        this.LL = "";
        this.LLILLL = new ArrayList();
        boolean zLIZIZ = C296570Bjr.LIZIZ();
        this.LLILZIL = zLIZIZ;
        this.LLJJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1531));
        if (zLIZIZ) {
            this.LLJI = new C2440609hM(new C11NJ());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            C1287400jbe c1287400jbe = new C1287400jbe(getContext(), null);
            c1287400jbe.setTranslationZ(-2.0f);
            C786410Ut5.LLLZIIL(c1287400jbe, 8);
            this.LLJILJILJ = c1287400jbe;
            addView(c1287400jbe, layoutParams2);
            View view = new View(getContext());
            view.setBackgroundResource(R.drawable.auu);
            view.setTranslationZ(-1.0f);
            C786410Ut5.LJLLLLLL(8, view);
            this.LLJILLL = view;
            addView(view, new RelativeLayout.LayoutParams(layoutParams2));
            C0CF8.LIZ.getClass();
            if (!C0CF8.LIZLLL()) {
                C1287400jbe c1287400jbe2 = this.LLJILJILJ;
                if (c1287400jbe2 != null) {
                    c1287400jbe2.LIZ(EnumC1287420jbg.SpinDiffuse, null);
                    c1287400jbe2.LIZJ();
                    c1287400jbe2.setRenderMode(0);
                    C786410Ut5.LLLZIIL(c1287400jbe2, 0);
                }
                setBackground(null);
                View view2 = this.LLJILLL;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(0, view2);
                }
            }
            int iGenerateViewId = View.generateViewId();
            RecyclerView recyclerView = new RecyclerView(getContext());
            recyclerView.setId(iGenerateViewId);
            setList(recyclerView);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams3.addRule(14);
            addView(getList(), layoutParams3);
            int iLIZIZ2 = C19228210Ki.LIZIZ(getContext());
            ViewGroup.LayoutParams layoutParams4 = getList().getLayoutParams();
            if ((layoutParams4 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams4) != null) {
                layoutParams.height = iLIZIZ2;
                C786410Ut5.p6(getList(), layoutParams);
            }
            Context context2 = getContext();
            int iLIZIZ3 = C19228210Ki.LIZIZ(context2);
            int i = C19227810Ke.LIZ[C19228210Ki.LIZ(context2).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(450));
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(393));
                }
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(370.5f)));
            }
            int i2 = (iLIZIZ3 - iLIZIZ) / 2;
            getList().setPadding(0, i2, 0, i2);
            getList().setClipToPadding(false);
            final RecSwipeGalleryLayoutManager recSwipeGalleryLayoutManager = new RecSwipeGalleryLayoutManager();
            this.LLJ = recSwipeGalleryLayoutManager;
            recSwipeGalleryLayoutManager.LJIIL(getList());
            recSwipeGalleryLayoutManager.LLJILLL = new C744300THo();
            C10LM c10lm = new C10LM(recSwipeGalleryLayoutManager, new AwS572S0100000_28(this, 1034));
            c10lm.setShowFooter(false);
            c10lm.LLILZ = new AwS607S0100000_28(this, 367);
            this.LLIZLLLIL = c10lm;
            if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLLFZ()) {
                c10lm.registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.10Ld
                    @Override // X.AbstractC471570IeR
                    public final void LIZ() {
                        if (this.LIZ.getShouldScroll()) {
                            this.LIZ.getList().scrollToPosition(recSwipeGalleryLayoutManager.LLILZIL);
                        }
                        this.LIZ.setShouldScroll(false);
                    }
                });
            }
            getList().setAdapter(c10lm);
            getList().setItemAnimator(new C421800GgM(getList()));
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.LLJJI = frameLayout;
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams5.addRule(3, iGenerateViewId);
            layoutParams5.topMargin = (int) C12ES.LIZJ(24.0f, getContext());
            layoutParams5.setMarginStart((int) C12ES.LIZJ(40.0f, getContext()));
            layoutParams5.setMarginEnd((int) C12ES.LIZJ(40.0f, getContext()));
            addView(frameLayout, layoutParams5);
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams6.gravity = 1;
            RelationButton relationButton = new RelationButton(getContext(), (AttributeSet) null, 0, 14);
            relationButton.setButtonSize(3);
            relationButton.setButtonVariant(0);
            this.LLJIJIL = relationButton;
            frameLayout.addView(relationButton, layoutParams6);
            RelationButton relationButton2 = new RelationButton(getContext(), (AttributeSet) null, 0, 14);
            C786410Ut5.t0(relationButton2, 4);
            relationButton2.setButtonSize(3);
            relationButton2.setButtonVariant(0);
            this.LLJILJIL = relationButton2;
            frameLayout.addView(relationButton2, new FrameLayout.LayoutParams(layoutParams6));
            recSwipeGalleryLayoutManager.LLJJ = new C0HG1() { // from class: X.10La
                @Override // X.C0HG1
                public final void LJLJJI(int i3) {
                    User user;
                    C2440609hM colorManager;
                    UserWithAweme userWithAwemeLIZLLL = this.LIZ.LIZLLL(i3);
                    if (userWithAwemeLIZLLL == null) {
                        return;
                    }
                    User user2 = userWithAwemeLIZLLL.getUser();
                    this.LIZ.LIZIZ(user2);
                    this.LIZ.LJI(user2);
                    C19218810Gs.LIZIZ(i3, user2, "impression");
                    UserWithAweme userWithAwemeLIZLLL2 = this.LIZ.LIZLLL(i3 + 1);
                    if (userWithAwemeLIZLLL2 != null && (user = userWithAwemeLIZLLL2.getUser()) != null && (colorManager = this.LIZ.getColorManager()) != null) {
                        colorManager.LIZ(Collections.singletonList(user), null);
                    }
                }
            };
            if (!this.LLILLL.isEmpty()) {
                setData(this.LLILLL);
            }
            this.LLJJIJIL = true;
            HandlerHook.viewPost(this, new ARunnableS128S0100000_28(this, 123));
            C2271391DvN.LIZ(getList(), (C1A5L) C2271381DvM.LLJ.getValue());
            C2271391DvN.LIZ(this.LLJIJIL, (C1A5L) C2271381DvM.LLJILJIL.getValue());
            C2271391DvN.LIZ(this.LLJILJIL, (C1A5L) C2271381DvM.LLJILJILJ.getValue());
            return;
        }
        setList(new RecyclerView(getContext()));
        addView(getList(), new ViewGroup.LayoutParams(-1, -1));
        final GalleryLayoutManager galleryLayoutManager = new GalleryLayoutManager();
        this.LLIZ = galleryLayoutManager;
        RecyclerView list = getList();
        if (list != null) {
            galleryLayoutManager.LLJJ = list;
            galleryLayoutManager.LLILLL = Math.max(0, 0);
            list.setLayoutManager(galleryLayoutManager);
            galleryLayoutManager.LLIZ.LIZIZ(list);
            list.addOnScrollListener(galleryLayoutManager.LLIZLLLIL);
            galleryLayoutManager.LLJILJILJ = new C1213620hge(getContext());
            galleryLayoutManager.LLJILLL.add(new InterfaceC19230410Le() { // from class: X.10Lb
                @Override // X.InterfaceC19230410Le
                public final void M1() {
                }

                @Override // X.InterfaceC19230410Le
                public final void H2(int i3, View view3, RecyclerView recyclerView2) {
                    User user;
                    UserWithAweme userWithAwemeLIZLLL = this.LL.LIZLLL(i3);
                    if (userWithAwemeLIZLLL != null && (user = userWithAwemeLIZLLL.getUser()) != null) {
                        C19218810Gs.LIZIZ(i3, user, "impression");
                    }
                }
            });
            C19230610Lg c19230610Lg = new C19230610Lg(galleryLayoutManager, new AwS572S0100000_28(this, 1035));
            c19230610Lg.setShowFooter(false);
            this.LLILZLL = c19230610Lg;
            if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLLFZ()) {
                c19230610Lg.registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.10Lc
                    @Override // X.AbstractC471570IeR
                    public final void LIZ() {
                        if (this.LIZ.getShouldScroll()) {
                            this.LIZ.getList().scrollToPosition(galleryLayoutManager.LLILZ);
                        }
                        this.LIZ.setShouldScroll(false);
                    }
                });
            }
            getList().setAdapter(c19230610Lg);
            getList().setItemAnimator(new C421800GgM(getList()));
            if (!(!this.LLILLL.isEmpty())) {
                return;
            }
            setData(this.LLILLL);
            return;
        }
        throw new IllegalArgumentException("The attach RecycleView must not null!!");
    }

    public final void LIZ(int i, int i2) {
        RelativeLayout.LayoutParams layoutParams;
        FrameLayout frameLayout = this.LLJJI;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.topMargin = i;
                C786410Ut5.a6(frameLayout, layoutParams);
            }
        }
        RelationButton relationButton = this.LLJIJIL;
        if (relationButton != null) {
            ViewGroup.LayoutParams layoutParams3 = relationButton.getLayoutParams();
            layoutParams3.height = i2;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(relationButton);
            relationButton.setLayoutParams(layoutParams3);
        }
        RelationButton relationButton2 = this.LLJILJIL;
        if (relationButton2 != null) {
            ViewGroup.LayoutParams layoutParams4 = relationButton2.getLayoutParams();
            layoutParams4.height = i2;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(relationButton2);
            relationButton2.setLayoutParams(layoutParams4);
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIIJ().isPad() != 1) {
            if (activity != null) {
                if (this.LLILZIL) {
                    C10LM c10lm = this.LLIZLLLIL;
                    if (c10lm != null) {
                        c10lm.LLLFZ();
                    }
                    C10LM c10lm2 = this.LLIZLLLIL;
                    if (c10lm2 != null) {
                        c10lm2.notifyDataSetChanged();
                    }
                    HandlerHook.viewPost(this, new ARunnableS128S0100000_28(this, 123));
                    return;
                }
                if (LIZJ(activity) == getLayoutParams().height) {
                    return;
                }
                getLayoutParams().height = LIZJ(getContext());
                requestLayout();
                C19230610Lg c19230610Lg = this.LLILZLL;
                if (c19230610Lg != null) {
                    c19230610Lg.LLLFZ(activity);
                }
                C19230610Lg c19230610Lg2 = this.LLILZLL;
                if (c19230610Lg2 == null) {
                    return;
                }
                c19230610Lg2.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (!c19252910Tv.LIZLLL().LJIJI().LLLFZ()) {
            return;
        }
        if (this.LLILZIL) {
            C10LM c10lm3 = this.LLIZLLLIL;
            if (c10lm3 != null) {
                c10lm3.LLLFZ();
            }
            C10LM c10lm4 = this.LLIZLLLIL;
            if (c10lm4 != null) {
                c10lm4.notifyDataSetChanged();
            }
            HandlerHook.viewPost(this, new ARunnableS128S0100000_28(this, 123));
        } else {
            C19230610Lg c19230610Lg3 = this.LLILZLL;
            if (c19230610Lg3 != null) {
                c19230610Lg3.notifyDataSetChanged();
            }
        }
        this.LLILZ = true;
    }
}
