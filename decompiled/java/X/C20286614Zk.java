package X;

import Y.ACListenerS0S0403000_30;
import Y.ACListenerS1S0303000_30;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: renamed from: X.14Zk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public final class C20286614Zk {
    public static Option[] LIZIZ;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJII;
    public static final C20286614Zk LIZ = new C20286614Zk();
    public static String LIZJ = "";
    public static int LIZLLL = -1;
    public static final BPEAHandler LJI = new BPEAHandler();

    public static final void LJII() {
        if (!C1483410ohn.LJLJJI().isPlaying()) {
            C786410Ut5.LJLIIL(1000L, LJI, new Runnable() { // from class: X.0T2B
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FeedSurveyHelper@6267.tryPausePlayer$1");
                    try {
                        if (C20286614Zk.LJ) {
                            if (C1483410ohn.LJLJJI().isPlaying()) {
                                C1483410ohn.LJLJJI().LIZ();
                                C20286614Zk.LJFF = true;
                            } else {
                                C20286614Zk.LJII();
                            }
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FeedSurveyHelper@6267.tryPausePlayer$1");
                }
            });
        } else {
            C1483410ohn.LJLJJI().LIZ();
            LJFF = true;
        }
    }

    public static C20287814Zw LIZJ(Context context, final List list) {
        final C20287814Zw c20287814Zw = new C20287814Zw(context);
        c20287814Zw.setGravity(17);
        c20287814Zw.setClickable(true);
        c20287814Zw.setStarEmptyDrawable(context.getResources().getDrawable(R.drawable.c37));
        c20287814Zw.setStarFillDrawable(context.getResources().getDrawable(R.drawable.c38));
        c20287814Zw.setStarStep(0.0f);
        c20287814Zw.setStepSize(1);
        c20287814Zw.setStarCount(list.size());
        c20287814Zw.setStarImageSize(C12ES.LIZJ(40.0f, context));
        c20287814Zw.setStarPadding(C12ES.LIZJ(10.0f, context));
        c20287814Zw.setOnRatingChangeListener(new InterfaceC20289614aE() { // from class: X.14Zv
            @Override // X.InterfaceC20289614aE
            public final void LIZ(float f) {
                int i;
                InterfaceC20293914av optionClickListener = c20287814Zw.getOptionClickListener();
                if (optionClickListener != null) {
                    optionClickListener.LJLIIL();
                }
                int i2 = (int) f;
                if (i2 > 0) {
                    i = i2 - 1;
                } else {
                    i = 0;
                }
                c20287814Zw.setOption(((Option) ListProtector.get(list, i)).name);
                Option option = (Option) ListProtector.get(list, i);
                C20286614Zk.LIZIZ = new Option[]{option};
                C20286614Zk.LIZJ = String.valueOf(option.id);
            }
        });
        c20287814Zw.LIZ();
        c20287814Zw.setPadding(0, (int) C12ES.LIZJ(12.0f, context), 0, 0);
        return c20287814Zw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bd, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, X.C20291414aW.LJI) != false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r5, boolean r6) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20286614Zk.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):boolean");
    }

    public static void LJFF(int i, Aweme aweme) {
        if (i != EnumC20283814Yi.SUBMIT.getType() && i != EnumC20283814Yi.SECONDARY_SUBMIT.getType()) {
            LIZIZ = null;
            C20287114Zp.LIZ.getClass();
            C20287114Zp.LIZ(i, aweme);
        } else {
            C20287114Zp c20287114Zp = C20287114Zp.LIZ;
            Option[] optionArr = LIZIZ;
            c20287114Zp.getClass();
            C20287114Zp.LIZJ(i, aweme, optionArr);
        }
    }

    public static void LJ(Aweme aweme, String str, String str2) {
        String str3;
        C14ZW.LIZ.getClass();
        FeedSurvey feedSurveyLJ = C14ZW.LJ(aweme);
        C14ZT c14zt = C14ZT.LIZ;
        C14Z0 c14z0LIZ = C14Z4.LIZ(aweme);
        if (feedSurveyLJ != null) {
            str3 = feedSurveyLJ.id;
        } else {
            str3 = null;
        }
        C14ZT.LJIIIIZZ(c14zt, aweme, c14z0LIZ, str, str3, str2, null, null, 224);
    }

    public static void LJI(int i, Aweme aweme, Option[] optionArr) {
        LIZIZ = optionArr;
        if (i != EnumC20283814Yi.SUBMIT.getType() && i != EnumC20283814Yi.SECONDARY_SUBMIT.getType()) {
            C20287114Zp.LIZ.getClass();
            C20287114Zp.LIZ(i, aweme);
        } else {
            C20287114Zp.LIZ.getClass();
            C20287114Zp.LIZJ(i, aweme, optionArr);
        }
    }

    public static C20288914a7 LIZIZ(int i, Context context, final List list, boolean z) {
        final boolean z2;
        int i2;
        final C20288914a7 c20288914a7 = new C20288914a7(context);
        int i3 = 1;
        if (i == C14ZA.SINGLE_CHOICE.getType()) {
            z2 = true;
        } else {
            z2 = false;
            i3 = 2;
        }
        c20288914a7.setChoiceMode(i3);
        int visibility = c20288914a7.getVisibility();
        c20288914a7.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c20288914a7);
        c20288914a7.setDivider(null);
        c20288914a7.setSelector(new ColorDrawable(0));
        c20288914a7.setPadding(0, (int) C12ES.LIZJ(12.0f, context), 0, 0);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Option) it2.next()).name);
        }
        if (z2) {
            if (z) {
                c20288914a7.setDividerHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                c20288914a7.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, 0);
                i2 = R.layout.b7x;
            } else {
                i2 = R.layout.b7u;
            }
        } else {
            i2 = R.layout.b7t;
        }
        c20288914a7.setAdapter((ListAdapter) new ArrayAdapter(context, i2, arrayList));
        AdapterView.OnItemClickListener c1847850yBb = new AdapterView.OnItemClickListener() { // from class: X.14Zs
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i4, long j) {
                InterfaceC20293914av optionClickListener = c20288914a7.getOptionClickListener();
                if (optionClickListener != null) {
                    optionClickListener.LJLIIL();
                }
                if (z2) {
                    Option option = (Option) ListProtector.get(list, c20288914a7.getCheckedItemPosition());
                    C20286614Zk.LIZIZ = new Option[]{option};
                    C20286614Zk.LIZJ = String.valueOf(option.id);
                    return;
                }
                SparseBooleanArray checkedItemPositions = c20288914a7.getCheckedItemPositions();
                C20286614Zk.LIZJ = "";
                ArrayList arrayList2 = new ArrayList();
                int size = checkedItemPositions.size();
                for (int i5 = 0; i5 < size; i5++) {
                    if (checkedItemPositions.valueAt(i5)) {
                        Option option2 = (Option) ListProtector.get(list, checkedItemPositions.keyAt(i5));
                        arrayList2.add(option2);
                        C20286614Zk c20286614Zk = C20286614Zk.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(C20286614Zk.LIZJ);
                        sbLIZ.append(option2.id);
                        C20286614Zk.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
                C20286614Zk c20286614Zk2 = C20286614Zk.LIZ;
                C20286614Zk.LIZIZ = (Option[]) arrayList2.toArray(new Option[0]);
            }
        };
        if (C1848410yCV.LIZ) {
            c1847850yBb = new C1847850yBb(c1847850yBb);
        }
        c20288914a7.setOnItemClickListener(c1847850yBb);
        return c20288914a7;
    }

    public static void LIZ(Aweme aweme, EnumC20283814Yi enumC20283814Yi, VerticalViewPager verticalViewPager, int i, int i2, int i3) {
        LJFF(enumC20283814Yi.getType(), aweme);
        verticalViewPager.LJJIJIL(i, i2, i3);
        LJ(aweme, enumC20283814Yi.name().toLowerCase(Locale.ENGLISH), LIZJ);
        LJII = false;
        LJ = false;
        LIZIZ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, X.0mTF] */
    public static final boolean LJIIIIZZ(Aweme aweme, Fragment fragment, Context context, VerticalViewPager verticalViewPager, int i, int i2, int i3, long j) {
        Question[] questionArr;
        final List arrayList;
        boolean z;
        boolean z2;
        View viewLIZIZ;
        T t;
        C1627306Yt c1627306Yt;
        boolean z3;
        FragmentManager parentFragmentManager;
        C14ZW.LIZ.getClass();
        FeedSurvey feedSurveyLJ = C14ZW.LJ(aweme);
        if (verticalViewPager != null && feedSurveyLJ != null && (questionArr = feedSurveyLJ.questions) != null && questionArr.length > 0) {
            Question question = questionArr[0];
            Option[] optionArr = question.options;
            if (optionArr == null || (arrayList = C13LQ.LJJLL(optionArr)) == null) {
                arrayList = new ArrayList();
            }
            if (arrayList.size() > 0) {
                LIZLLL = question.type;
                C20286614Zk c20286614Zk = LIZ;
                c20286614Zk.getClass();
                if (C14ZW.LIZIZ(aweme) == 6) {
                    z = true;
                } else {
                    z = false;
                }
                final C19EG activity = null;
                if (z && C14ZA.SINGLE_CHOICE.getType() == LIZLLL) {
                    if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    View viewLJLLJ = C786410Ut5.LJLLJ(new C1361400lX0(context, R.style.y0), R.layout.bal, null);
                    TuxTextView tuxTextView = (TuxTextView) viewLJLLJ.findViewById(R.id.y3j);
                    if (tuxTextView != null) {
                        tuxTextView.setText(question.title);
                    }
                    final ListView listView = (ListView) viewLJLLJ.findViewById(R.id.fer);
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Option) it2.next()).name);
                    }
                    if (listView != null) {
                        listView.setAdapter((ListAdapter) new ArrayAdapter(viewLJLLJ.getContext(), R.layout.b7w, arrayList2));
                    }
                    viewLJLLJ.getViewTreeObserver().addOnWindowFocusChangeListener(ViewTreeObserverOnWindowFocusChangeListenerC20289714aF.LL);
                    if (listView != null) {
                        listView.setDividerHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                    }
                    C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                    TuxSheet tuxSheet = c1390920mIc.LIZ;
                    tuxSheet.LLJLILLLLZIIL = false;
                    tuxSheet.LLILLL = false;
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, viewLJLLJ.getContext());
                    TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                    tuxSheet2.LLJI = numLIZJ;
                    tuxSheet2.LLJJIII = viewLJLLJ;
                    tuxSheet2.LLJLLL = false;
                    tuxSheet2.LLJLLIL = false;
                    c1390920mIc.LJIIIIZZ(1);
                    DialogInterfaceOnDismissListenerC20307514d7 dialogInterfaceOnDismissListenerC20307514d7 = new DialogInterfaceOnDismissListenerC20307514d7(viewLJLLJ, 0);
                    final TuxSheet tuxSheet3 = c1390920mIc.LIZ;
                    tuxSheet3.LLILLJJLI = dialogInterfaceOnDismissListenerC20307514d7;
                    TuxIconView tuxIconView = (TuxIconView) viewLJLLJ.findViewById(R.id.e1v);
                    if (tuxIconView != null) {
                        C786410Ut5.a9(tuxIconView, new ACListenerS1S0303000_30(tuxSheet3, aweme, verticalViewPager, i, i2, i3, 1));
                    }
                    final C1835410xrX c1835410xrX = (C1835410xrX) viewLJLLJ.findViewById(R.id.whg);
                    c1835410xrX.setButtonVariant(EnumC1779710wPh.FIVE_LEVEL.getValue());
                    C786410Ut5.X9(c1835410xrX, new ACListenerS0S0403000_30(tuxSheet3, aweme, verticalViewPager, i, i2, i3, context, 2));
                    if (listView != null) {
                        C786410Ut5.vb(listView, new AdapterView.OnItemClickListener() { // from class: X.14Xj
                            @Override // android.widget.AdapterView.OnItemClickListener
                            public final void onItemClick(AdapterView<?> adapterView, View view, int i4, long j2) {
                                C1835410xrX c1835410xrX2 = c1835410xrX;
                                if (c1835410xrX2 != null) {
                                    C339190DRl.LIZLLL(c1835410xrX2);
                                }
                                Option option = (Option) ListProtector.get(arrayList, listView.getCheckedItemPosition());
                                C20286614Zk.LIZIZ = new Option[]{option};
                                C20286614Zk.LIZJ = String.valueOf(option.id);
                            }
                        });
                    }
                    if (C123100dR.LIZ(feedSurveyLJ.submitText)) {
                        c1835410xrX.setText(feedSurveyLJ.submitText);
                    }
                    if (z3) {
                        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
                        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(480));
                        C786410Ut5.R6(tuxTextView, layoutParams);
                    }
                    if (fragment instanceof InterfaceC20660615sy) {
                        final InterfaceC20660615sy interfaceC20660615sy = (InterfaceC20660615sy) fragment;
                        PopupManager.LJIJI(new AbstractC20660115st<DialogFragment>(interfaceC20660615sy, tuxSheet3) { // from class: X.0TS0
                            public final InterfaceC20660615sy LL;
                            public final TuxSheet LLILLJJLI;

                            @Override // X.InterfaceC20660515sx
                            public final int getPriority() {
                                return 240;
                            }

                            @Override // com.bytedance.poplayer.IPopupTask
                            public final Object showPopup(C688120Qyw c688120Qyw) {
                                Fragment fragment2;
                                if (!this.LLILLJJLI.isAdded()) {
                                    Object obj = this.LL;
                                    if ((obj instanceof Fragment) && (fragment2 = (Fragment) obj) != null) {
                                        this.LLILLJJLI.show(fragment2.getParentFragmentManager(), "feed_survey_tux_pop");
                                    }
                                }
                                return this.LLILLJJLI;
                            }

                            {
                                super(interfaceC20660615sy);
                                this.LL = interfaceC20660615sy;
                                this.LLILLJJLI = tuxSheet3;
                            }
                        }, true);
                    } else if (fragment != 0 && (parentFragmentManager = fragment.getParentFragmentManager()) != null) {
                        c1390920mIc.LIZ.show(parentFragmentManager, "feed_survey_tux_pop");
                    }
                    LJII = true;
                    String str = feedSurveyLJ.id;
                    String lowerCase = C14ZA.values()[LIZLLL].name().toLowerCase(Locale.ENGLISH);
                    LIZ.getClass();
                    LJ = true;
                    C20291314aV.LIZ.getClass();
                    C20291314aV.LJIILJJIL(aweme);
                    C14ZT.LIZ.getClass();
                    C14ZT.LJIIL(aweme, str, lowerCase);
                    return true;
                }
                if (C14ZW.LIZIZ(aweme) == 5) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i4 = LIZLLL;
                C14ZA c14za = C14ZA.BINARY;
                if (i4 == c14za.getType()) {
                    viewLIZIZ = new C1627306Yt(context);
                } else if (i4 == C14ZA.FIVE_LEVEL.getType()) {
                    viewLIZIZ = LIZJ(context, arrayList);
                } else {
                    C14ZA c14za2 = C14ZA.SINGLE_CHOICE;
                    if (i4 == c14za2.getType()) {
                        viewLIZIZ = LIZIZ(c14za2.getType(), context, arrayList, z2);
                    } else {
                        C14ZA c14za3 = C14ZA.MULTIPLE_CHOICE;
                        if (i4 != c14za3.getType()) {
                            return false;
                        }
                        viewLIZIZ = LIZIZ(c14za3.getType(), context, arrayList, z2);
                    }
                }
                final C259800zU c259800zU = new C259800zU();
                TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
                tuxTextView2.setTuxFont(33);
                tuxTextView2.setTextColor(C960203pA.LIZ(R.attr.a1h, context));
                tuxTextView2.setText(question.title);
                tuxTextView2.setGravity(17);
                tuxTextView2.setHighlightColor(0);
                if (z2 && LIZLLL == C14ZA.SINGLE_CHOICE.getType()) {
                    tuxTextView2.setTuxFont(103);
                }
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LJIIJ = new C1617406Uy(tuxTextView2);
                c1397580mTM.LJII = false;
                c1397580mTM.LJI = new InterfaceC1196790hFV() { // from class: X.14a6
                    @Override // X.InterfaceC1196790hFV
                    public final void onWindowFocusChanged(boolean z4) {
                        if (z4) {
                            C20286614Zk.LJII();
                        }
                    }
                };
                c1397580mTM.LIZLLL(AFwS245S0000000_12.get$arr$(76));
                C384000F3u.LIZ(c1397580mTM, viewLIZIZ);
                if (LIZLLL == c14za.getType()) {
                    if (arrayList.size() < 2 || !(viewLIZIZ instanceof C1627306Yt) || (c1627306Yt = (C1627306Yt) viewLIZIZ) == null) {
                        return false;
                    }
                    c1627306Yt.getButton1().setText(((Option) ListProtector.get(arrayList, 0)).name);
                    C786410Ut5.U8(c1627306Yt.getButton1(), new ACListenerS0S0403000_30(arrayList, aweme, verticalViewPager, i, i2, i3, c259800zU, 0));
                    c1627306Yt.getButton2().setText(((Option) ListProtector.get(arrayList, 1)).name);
                    C786410Ut5.U8(c1627306Yt.getButton2(), new ACListenerS0S0403000_30(arrayList, aweme, verticalViewPager, i, i2, i3, c259800zU, 1));
                    String str2 = feedSurveyLJ.cancelText;
                    if (str2 != null && str2.length() != 0) {
                        c1627306Yt.getButton3().setText(feedSurveyLJ.cancelText);
                        C786410Ut5.h9(c1627306Yt.getButton3(), new ACListenerS1S0303000_30(aweme, verticalViewPager, c259800zU, i, i2, i3, 0));
                    } else {
                        C786410Ut5.LLLLZLL(c1627306Yt.getButton3(), 8);
                    }
                } else {
                    C1238130iKB.LIZ(c1397580mTM, new C20288114Zz(feedSurveyLJ, aweme, verticalViewPager, i, i2, i3, context));
                }
                c259800zU.element = new C1397510mTF(c1397580mTM);
                if (LIZLLL != c14za.getType()) {
                    ((InterfaceC20290614aO) viewLIZIZ).setOptionListener(new InterfaceC20293914av() { // from class: X.0mTd
                        @Override // X.InterfaceC20293914av
                        public final void LJLIIL() {
                            C1397630mTR c1397630mTR;
                            List<C1397650mTT> list;
                            C1397650mTT c1397650mTT;
                            C1397510mTF c1397510mTF = c259800zU.element;
                            AbstractC1391450mJT abstractC1391450mJTLJII = c1397510mTF != null ? c1397510mTF.LJII() : null;
                            if (!(abstractC1391450mJTLJII instanceof C1397630mTR) || (c1397630mTR = (C1397630mTR) abstractC1391450mJTLJII) == null || (list = c1397630mTR.LJ) == null || (c1397650mTT = (C1397650mTT) ListProtector.get(list, 0)) == null) {
                                return;
                            }
                            c1397650mTT.LIZIZ(true);
                        }
                    });
                }
                if (C849850XVn.LIZIZ.LIZJ().LJJ("fyp_popup_survey_dialog")) {
                    if (fragment != 0) {
                        activity = fragment.getActivity();
                    }
                    final C1397510mTF c1397510mTF = (C1397510mTF) c259800zU.element;
                    PopupManager.LJIIZILJ(new AbstractC20659615so<C1397510mTF>(activity, c1397510mTF) { // from class: X.0DcI
                        public final C19EG LL;
                        public final C1397510mTF LLILLJJLI;

                        @Override // X.InterfaceC20660515sx
                        public final int getPriority() {
                            return 240;
                        }

                        @Override // X.InterfaceC20660415sw
                        public final C688120Qyw i2() {
                            C19EG c19eg = this.LL;
                            if (c19eg != null) {
                                return new C688120Qyw(c19eg, c19eg, null);
                            }
                            return null;
                        }

                        @Override // com.bytedance.poplayer.IStandardPopupTask
                        public final Object LJII(C688120Qyw c688120Qyw) {
                            return this.LLILLJJLI;
                        }

                        {
                            this.LL = activity;
                            this.LLILLJJLI = c1397510mTF;
                        }

                        @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
                        public final View showRootView(Object obj, C688120Qyw c688120Qyw) {
                            Window window = this.LLILLJJLI.LJ().getWindow();
                            if (window != null) {
                                return window.getDecorView();
                            }
                            return null;
                        }
                    }, new C1668306g5("fyp_popup_survey_dialog_trigger1"));
                } else if ((fragment instanceof InterfaceC20660615sy) && (t = c259800zU.element) != 0) {
                    final InterfaceC20660615sy interfaceC20660615sy2 = (InterfaceC20660615sy) fragment;
                    final C1397510mTF c1397510mTF2 = (C1397510mTF) t;
                    PopupManager.LJIJI(new AbstractC20660115st<Dialog>(interfaceC20660615sy2, c1397510mTF2) { // from class: X.0TRz
                        public final InterfaceC20660615sy LL;
                        public final C1397510mTF LLILLJJLI;

                        @Override // X.InterfaceC20660515sx
                        public final int getPriority() {
                            return 240;
                        }

                        @Override // com.bytedance.poplayer.IPopupTask
                        public final Object showPopup(C688120Qyw c688120Qyw) {
                            C1391850mK7.LIZIZ(this.LLILLJJLI, "fyp_popup_survey_dialog");
                            return this.LLILLJJLI.LJ();
                        }

                        {
                            super(interfaceC20660615sy2);
                            this.LL = interfaceC20660615sy2;
                            this.LLILLJJLI = c1397510mTF2;
                        }
                    }, true);
                } else {
                    C1391850mK7.LIZIZ(c259800zU.element, "fyp_popup_survey_dialog");
                    AbstractDialogInterfaceC1397690mTX abstractDialogInterfaceC1397690mTX = (AbstractDialogInterfaceC1397690mTX) c259800zU.element;
                    if (abstractDialogInterfaceC1397690mTX != null) {
                        abstractDialogInterfaceC1397690mTX.LIZLLL();
                    }
                }
                LJII = true;
                String str3 = feedSurveyLJ.id;
                String lowerCase2 = C14ZA.values()[LIZLLL].name().toLowerCase(Locale.ENGLISH);
                c20286614Zk.getClass();
                LJ = true;
                C20291314aV.LIZ.getClass();
                C20291314aV.LJIILJJIL(aweme);
                C14ZT.LIZ.getClass();
                C14ZT.LJIIL(aweme, str3, lowerCase2);
                return true;
            }
        }
        return false;
    }
}
