package X;

import Y.ACListenerS140S0100000_5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ECf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC360710ECf extends FrameLayout {
    public LinearLayout LL;
    public C527320KmA LLILLJJLI;
    public LinearLayout LLILLL;
    public LinearLayout LLILZ;
    public C1295960jpS LLILZIL;
    public final C0EJZ LLILZLL;
    public final C01GW LLIZ;
    public C362490EJb LLIZLLLIL;
    public final ArrayList<C357590E0f> LLJ;
    public Function2<? super Boolean, ? super Boolean, Unit> LLJI;
    public Function0<Unit> LLJIJIL;
    public Function0<Unit> LLJILJIL;
    public Function1<? super List<C357590E0f>, ? extends List<C357590E0f>> LLJILJILJ;
    public boolean LLJILLL;
    public int LLJJ;

    public abstract void LJFF(List<C357590E0f> list);

    private final InterfaceC360730ECh getResourceProvider() {
        return (InterfaceC360730ECh) this.LLIZ.getValue();
    }

    public final void LIZLLL() {
        C362490EJb c362490EJb = this.LLIZLLLIL;
        if (c362490EJb == null || c362490EJb.LJJI) {
            return;
        }
        C786410Ut5.LJZL(8, getLoadingLayoutFromXml());
        C786410Ut5.LLD(8, getLottieLoadingViewFromXml());
        C786410Ut5.LJZL(8, getErrorOrEmptyLayoutFromXml());
        C786410Ut5.LJZL(0, getViewPagerLayoutFromXml());
        C0EJZ c0ejz = this.LLILZLL;
        if (c0ejz != null) {
            C786410Ut5.L1(c0ejz, 0);
        }
    }

    public final LinearLayout getErrorOrEmptyLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hax);
            this.LLILZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getLoadingLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nl4);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C1295960jpS getLottieLoadingViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nr6);
            this.LLILZIL = (C1295960jpS) callbackFindViewById;
        }
        return (C1295960jpS) callbackFindViewById;
    }

    public final C527320KmA getResourceViewPagerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tcu);
            this.LLILLJJLI = (C527320KmA) callbackFindViewById;
        }
        return (C527320KmA) callbackFindViewById;
    }

    public final LinearLayout getViewPagerLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.viewPagerLayout);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final ViewPager getViewPager() {
        return getResourceViewPagerFromXml();
    }

    public final ArrayList<C357590E0f> getCategoryList() {
        return this.LLJ;
    }

    public final C362490EJb getMultiPageConfig() {
        return this.LLIZLLLIL;
    }

    public final Function0<Unit> getOnFilterCategoryData() {
        return this.LLJILJIL;
    }

    public final Function2<Boolean, Boolean, Unit> getOnInitFinishListener() {
        return this.LLJI;
    }

    public final Function1<List<C357590E0f>, List<C357590E0f>> getOnPreprocessingCategoryData() {
        return this.LLJILJILJ;
    }

    public final Function0<Unit> getOnStartFetchCategory() {
        return this.LLJIJIL;
    }

    public final C0EJZ getResourceMultiTab() {
        return this.LLILZLL;
    }

    public final int getSelectIndex() {
        return this.LLJJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0ECg] */
    public final void LIZ(final boolean z) {
        InterfaceC360730ECh resourceProvider;
        final C362490EJb c362490EJb = this.LLIZLLLIL;
        if (c362490EJb != null && (resourceProvider = getResourceProvider()) != 0) {
            String str = c362490EJb.LIZ;
            if (!a0.LJJJIL(str)) {
                if (Intrinsics.LJFF(str, "text")) {
                    ArrayList arrayListLJFF = resourceProvider.LJFF();
                    LIZLLL();
                    LJFF(arrayListLJFF);
                } else {
                    if (this.LLJILLL) {
                        return;
                    }
                    resourceProvider.LIZIZ(new InterfaceC365520EUs<C357590E0f>() { // from class: X.0ECg
                        @Override // X.InterfaceC365520EUs
                        public final void onStart() {
                            AbstractC360710ECf abstractC360710ECf = this.LIZ;
                            C362490EJb c362490EJb2 = abstractC360710ECf.LLIZLLLIL;
                            if (c362490EJb2 != null && !c362490EJb2.LJJI) {
                                C786410Ut5.LJZL(0, abstractC360710ECf.getLoadingLayoutFromXml());
                                C786410Ut5.LJZL(8, abstractC360710ECf.getErrorOrEmptyLayoutFromXml());
                                C786410Ut5.LJZL(8, abstractC360710ECf.getViewPagerLayoutFromXml());
                                C0EJZ c0ejz = abstractC360710ECf.LLILZLL;
                                if (c0ejz != null) {
                                    C786410Ut5.L1(c0ejz, 8);
                                }
                                C786410Ut5.LLD(0, abstractC360710ECf.getLottieLoadingViewFromXml());
                                C1294250jmh.LIZIZ(abstractC360710ECf.getContext(), C0ED9.LJII).LIZIZ(new C0FXG(abstractC360710ECf, 1));
                            }
                            Function0<Unit> onStartFetchCategory = this.LIZ.getOnStartFetchCategory();
                            if (onStartFetchCategory != null) {
                                onStartFetchCategory.invoke();
                            }
                        }

                        @Override // X.InterfaceC365520EUs
                        public final void LIZ(C0EDV c0edv) {
                            AbstractC360710ECf abstractC360710ECf = this.LIZ;
                            abstractC360710ECf.LLJILLL = false;
                            abstractC360710ECf.LIZLLL();
                            AbstractC360710ECf abstractC360710ECf2 = this.LIZ;
                            C362490EJb c362490EJb2 = abstractC360710ECf2.LLIZLLLIL;
                            if (c362490EJb2 != null && !c362490EJb2.LJJI) {
                                C786410Ut5.LJZL(8, abstractC360710ECf2.getLoadingLayoutFromXml());
                                C786410Ut5.LJZL(0, abstractC360710ECf2.getErrorOrEmptyLayoutFromXml());
                                C786410Ut5.R7(abstractC360710ECf2.getErrorOrEmptyLayoutFromXml(), new ACListenerS140S0100000_5(abstractC360710ECf2, 127));
                                C786410Ut5.LJZL(8, abstractC360710ECf2.getViewPagerLayoutFromXml());
                                C0EJZ c0ejz = abstractC360710ECf2.LLILZLL;
                                if (c0ejz != null) {
                                    C786410Ut5.L1(c0ejz, 8);
                                }
                            }
                            Function2<Boolean, Boolean, Unit> onInitFinishListener = this.LIZ.getOnInitFinishListener();
                            if (onInitFinishListener != null) {
                                onInitFinishListener.invoke(Boolean.FALSE, Boolean.valueOf(z));
                            }
                        }

                        @Override // X.InterfaceC365520EUs
                        public final void LIZIZ(List<? extends C357590E0f> list, boolean z2) {
                            this.LIZ.LIZLLL();
                            this.LIZ.getCategoryList().clear();
                            if (c362490EJb.LJJ) {
                                ArrayList arrayListLJ = C1697810uHb.LJ(new C357590E0f(null, null, null, null, null, null, null, 127));
                                this.LIZ.getCategoryList().addAll(arrayListLJ);
                                Function2<Boolean, Boolean, Unit> onInitFinishListener = this.LIZ.getOnInitFinishListener();
                                if (onInitFinishListener != null) {
                                    onInitFinishListener.invoke(Boolean.TRUE, Boolean.valueOf(z));
                                }
                                this.LIZ.LJFF(arrayListLJ);
                            } else {
                                Function1<List<C357590E0f>, List<C357590E0f>> onPreprocessingCategoryData = this.LIZ.getOnPreprocessingCategoryData();
                                Collection<? extends C357590E0f> collection = list;
                                if (onPreprocessingCategoryData != null) {
                                    List<C357590E0f> listInvoke = onPreprocessingCategoryData.invoke(list);
                                    collection = list;
                                    if (listInvoke != null) {
                                        collection = listInvoke;
                                    }
                                }
                                this.LIZ.getCategoryList().addAll(collection);
                                C362490EJb multiPageConfig = this.LIZ.getMultiPageConfig();
                                if (multiPageConfig != null && multiPageConfig.LJJII) {
                                    ArrayList<C357590E0f> categoryList = this.LIZ.getCategoryList();
                                    this.LIZ.getClass();
                                    Integer numValueOf = Integer.valueOf(R.raw.icon_bookmark_fill);
                                    ListProtector.add(categoryList, 0, new C357590E0f(null, "Favorite", null, numValueOf, numValueOf, null, null, 101));
                                }
                                Function0<Unit> onFilterCategoryData = this.LIZ.getOnFilterCategoryData();
                                if (onFilterCategoryData != null) {
                                    onFilterCategoryData.invoke();
                                }
                                AbstractC360710ECf abstractC360710ECf = this.LIZ;
                                abstractC360710ECf.LJFF(abstractC360710ECf.getCategoryList());
                                Function2<Boolean, Boolean, Unit> onInitFinishListener2 = this.LIZ.getOnInitFinishListener();
                                if (onInitFinishListener2 != null) {
                                    onInitFinishListener2.invoke(Boolean.TRUE, Boolean.valueOf(z));
                                }
                            }
                            this.LIZ.LLJILLL = false;
                        }
                    });
                    this.LLJILLL = true;
                    resourceProvider.LJIIIIZZ(str);
                }
            }
        }
    }

    public final String LIZIZ(int i) {
        C357590E0f c357590E0f = (C357590E0f) C13LP.LJJJLZIJ(i, this.LLJ);
        if (c357590E0f != null) {
            return c357590E0f.LIZIZ;
        }
        return null;
    }

    public final int LIZJ(String str) {
        Iterator<C357590E0f> it2 = this.LLJ.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (!Intrinsics.LJFF(it2.next().LIZIZ, str)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public final void LJ(C362490EJb c362490EJb) {
        this.LLIZLLLIL = c362490EJb;
        if (c362490EJb.LJIILJJIL == C0EE1.UP) {
            getViewPagerLayoutFromXml().addView(this.LLILZLL, 0);
        } else {
            getViewPagerLayoutFromXml().addView(this.LLILZLL, 1);
        }
        LIZ(false);
    }

    public final void setErrorOrEmptyLayoutFromXml(LinearLayout linearLayout) {
        this.LLILZ = linearLayout;
    }

    public final void setLoadingLayoutFromXml(LinearLayout linearLayout) {
        this.LLILLL = linearLayout;
    }

    public final void setLottieLoadingViewFromXml(C1295960jpS c1295960jpS) {
        this.LLILZIL = c1295960jpS;
    }

    public final void setMultiPageConfig(C362490EJb c362490EJb) {
        this.LLIZLLLIL = c362490EJb;
    }

    public final void setOnFilterCategoryData(Function0<Unit> function0) {
        this.LLJILJIL = function0;
    }

    public final void setOnInitFinishListener(Function2<? super Boolean, ? super Boolean, Unit> function2) {
        this.LLJI = function2;
    }

    public final void setOnPreprocessingCategoryData(Function1<? super List<C357590E0f>, ? extends List<C357590E0f>> function1) {
        this.LLJILJILJ = function1;
    }

    public final void setOnStartFetchCategory(Function0<Unit> function0) {
        this.LLJIJIL = function0;
    }

    public final void setResourceViewPagerFromXml(C527320KmA c527320KmA) {
        this.LLILLJJLI = c527320KmA;
    }

    public final void setSelectIndex(int i) {
        this.LLJJ = i;
    }

    public final void setViewPagerLayoutFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public static void LJI(AbstractC360710ECf abstractC360710ECf, int i) {
        C527320KmA resourceViewPagerFromXml = abstractC360710ECf.getResourceViewPagerFromXml();
        if (resourceViewPagerFromXml != null) {
            resourceViewPagerFromXml.setCurrentItem(i, true);
        }
        abstractC360710ECf.LLJJ = i;
    }

    public AbstractC360710ECf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(326));
        this.LLJ = new ArrayList<>();
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.byt, this, true);
        this.LLILZLL = new C0EJZ(context, null, 6);
    }
}
