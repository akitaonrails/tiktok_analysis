package X;

import Y.ACListenerS132S0200000_30;
import Y.ACListenerS164S0100000_30;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.14Zl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20286714Zl extends AbstractC20284914Yt {
    public static final C20286714Zl LLJI = new C20286714Zl();
    public static boolean LLJIJIL;
    public static Option LLJILJIL;

    @Override // X.AbstractC20284914Yt, X.InterfaceC690490R6p
    public final void LIZ() {
        LLJIJIL = false;
    }

    @Override // X.InterfaceC690490R6p
    public final void LIZJ() {
    }

    @Override // X.InterfaceC690490R6p
    public final void LJI() {
    }

    @Override // X.InterfaceC690490R6p
    public final void LJIIJ(ViewStub viewStub, Context context, Aweme aweme, View view, View view2, View view3, View view4, boolean z, AbstractC19368810q6 abstractC19368810q6) {
    }

    @Override // X.InterfaceC690490R6p
    public final void LJIIIIZZ() {
        if (LLJIJIL) {
            C786410Ut5.LJJZZIII(new BPEAHandler(), new Runnable() { // from class: X.14a0
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DialogSurveyViewHelper@c86d.tryPauseSurveyPlay$1");
                    try {
                        C20286714Zl c20286714Zl = C20286714Zl.LLJI;
                        C20286714Zl.LJIJJ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DialogSurveyViewHelper@c86d.tryPauseSurveyPlay$1");
                }
            });
        }
    }

    public static final void LJIJJ() {
        if (C1483410ohn.LJLJJI().isPlaying()) {
            C1483410ohn.LJLJJI().LIZ();
        }
    }

    @Override // X.InterfaceC690490R6p
    public final boolean isShowing() {
        return LLJIJIL;
    }

    public final void LJIJI(Context context) {
        boolean z;
        final C20288914a7 c20288914a7;
        final Option[] optionArr;
        int i;
        FeedSurvey feedSurvey;
        Question question;
        final Option[] optionArr2;
        boolean z2;
        FragmentManager supportFragmentManager;
        if (this.LLILZIL == 6) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (z && (feedSurvey = this.LLILLJJLI) != null && (question = this.LLILZLL) != null && (optionArr2 = question.options) != null) {
            View viewLJLLJ = C786410Ut5.LJLLJ(new C1361400lX0(context, R.style.y0), R.layout.bal, null);
            if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            TuxTextView tuxTextView = (TuxTextView) viewLJLLJ.findViewById(R.id.y3j);
            if (tuxTextView != null) {
                tuxTextView.setText(question.title);
            }
            final ListView listView = (ListView) viewLJLLJ.findViewById(R.id.fer);
            ArrayList arrayList = new ArrayList(optionArr2.length);
            for (Option option : optionArr2) {
                arrayList.add(option.name);
            }
            if (listView != null) {
                listView.setAdapter((ListAdapter) new ArrayAdapter(viewLJLLJ.getContext(), R.layout.b7w, arrayList));
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
            DialogInterfaceOnDismissListenerC20289114a9 dialogInterfaceOnDismissListenerC20289114a9 = new DialogInterface.OnDismissListener() { // from class: X.14a9
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C20286714Zl.LLJI.getClass();
                    C20286714Zl.LLJIJIL = false;
                }
            };
            TuxSheet tuxSheet3 = c1390920mIc.LIZ;
            tuxSheet3.LLILLJJLI = dialogInterfaceOnDismissListenerC20289114a9;
            TuxIconView tuxIconView = (TuxIconView) viewLJLLJ.findViewById(R.id.e1v);
            if (tuxIconView != null) {
                C786410Ut5.a9(tuxIconView, new ACListenerS164S0100000_30(tuxSheet3, 38));
            }
            final C1835410xrX c1835410xrX = (C1835410xrX) viewLJLLJ.findViewById(R.id.whg);
            c1835410xrX.setButtonVariant(EnumC1779710wPh.FIVE_LEVEL.getValue());
            C786410Ut5.X9(c1835410xrX, new ACListenerS132S0200000_30(context, tuxSheet3, 4));
            C786410Ut5.vb(listView, new AdapterView.OnItemClickListener() { // from class: X.14YZ
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                    C1835410xrX c1835410xrX2 = c1835410xrX;
                    if (c1835410xrX2 != null) {
                        C339190DRl.LIZLLL(c1835410xrX2);
                    }
                    C20286714Zl.LLJILJIL = optionArr2[listView.getCheckedItemPosition()];
                }
            });
            if (C123100dR.LIZ(feedSurvey.submitText)) {
                c1835410xrX.setText(feedSurvey.submitText);
            }
            if (z2) {
                ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(480));
                C786410Ut5.R6(tuxTextView, layoutParams);
            }
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                c1390920mIc.LIZ.show(supportFragmentManager, "feed_survey_tux_pop");
            }
            LJIJJ();
            LJIILIIL();
            LLJIJIL = true;
            return;
        }
        Question question2 = this.LLILZLL;
        if (question2 != null && (optionArr = question2.options) != null) {
            c20288914a7 = new C20288914a7(context);
            c20288914a7.setChoiceMode(1);
            int visibility = c20288914a7.getVisibility();
            c20288914a7.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c20288914a7);
            c20288914a7.setDivider(null);
            c20288914a7.setSelector(new ColorDrawable(0));
            c20288914a7.setPadding(0, (int) C12ES.LIZJ(12.0f, context), 0, 0);
            ArrayList arrayList2 = new ArrayList(optionArr.length);
            for (Option option2 : optionArr) {
                arrayList2.add(option2.name);
            }
            if (this.LLILZIL == 5) {
                c20288914a7.setDividerHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                c20288914a7.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, 0);
                i = R.layout.b7x;
            } else {
                i = R.layout.b7u;
            }
            c20288914a7.setAdapter((ListAdapter) new ArrayAdapter(context, i, arrayList2));
            AdapterView.OnItemClickListener c1847850yBb = new AdapterView.OnItemClickListener() { // from class: X.14Zy
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                    InterfaceC20293914av optionClickListener = c20288914a7.getOptionClickListener();
                    if (optionClickListener != null) {
                        optionClickListener.LJLIIL();
                    }
                    C20286714Zl.LLJILJIL = optionArr[c20288914a7.getCheckedItemPosition()];
                }
            };
            if (C1848410yCV.LIZ) {
                c1847850yBb = new C1847850yBb(c1847850yBb);
            }
            c20288914a7.setOnItemClickListener(c1847850yBb);
        } else {
            c20288914a7 = null;
        }
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        tuxTextView2.setTuxFont(33);
        tuxTextView2.setTextColor(C960203pA.LIZ(R.attr.a1h, context));
        C20286714Zl c20286714Zl = LLJI;
        Question question3 = c20286714Zl.LLILZLL;
        if (question3 != null) {
            str = question3.title;
        }
        tuxTextView2.setText(str);
        tuxTextView2.setGravity(17);
        tuxTextView2.setHighlightColor(0);
        if (c20286714Zl.LLILZIL == 5) {
            tuxTextView2.setTuxFont(103);
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJIIJ = new C1617406Uy(tuxTextView2);
        c1397580mTM.LJII = false;
        c1397580mTM.LJI = new InterfaceC1196790hFV() { // from class: X.14aD
            @Override // X.InterfaceC1196790hFV
            public final void onWindowFocusChanged(boolean z3) {
                if (z3) {
                    C20286714Zl c20286714Zl2 = C20286714Zl.LLJI;
                    C20286714Zl.LJIJJ();
                }
            }
        };
        c1397580mTM.LIZLLL(AFwS274S0000000_30.get$arr$(280));
        if (c20288914a7 != null) {
            C384000F3u.LIZ(c1397580mTM, c20288914a7);
        }
        C1238130iKB.LIZ(c1397580mTM, new AwS609S0100000_30(context, 231));
        final C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
        if (c20288914a7 != null) {
            c20288914a7.setOptionListener(new InterfaceC20293914av() { // from class: X.0mTc
                @Override // X.InterfaceC20293914av
                public final void LJLIIL() {
                    C1397630mTR c1397630mTR;
                    List<C1397650mTT> list;
                    C1397650mTT c1397650mTT;
                    AbstractC1391450mJT abstractC1391450mJTLJII = c1397510mTF.LJII();
                    if (!(abstractC1391450mJTLJII instanceof C1397630mTR) || (c1397630mTR = (C1397630mTR) abstractC1391450mJTLJII) == null || (list = c1397630mTR.LJ) == null || (c1397650mTT = (C1397650mTT) ListProtector.get(list, 0)) == null) {
                        return;
                    }
                    c1397650mTT.LIZIZ(true);
                }
            });
        }
        c1397510mTF.LIZLLL();
        LJIILIIL();
        LLJIJIL = true;
    }
}
