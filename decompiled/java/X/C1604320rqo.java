package X;

import X.C1604320rqo;
import X.C1C7U;
import X.InterfaceC1604310rqn;
import Y.ACListenerS158S0100000_24;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.ui.PluginDownloadStatusBar$Companion$pluginDownloadHandler$1;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0rqo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1604320rqo extends RelativeLayout {
    public static final ArrayList<InterfaceC1604310rqn> LLJI = new ArrayList<>();
    public static final PluginDownloadStatusBar$Companion$pluginDownloadHandler$1 LLJIJIL;
    public ViewGroup LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxIconView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxIconView LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.feed.ui.PluginDownloadStatusBar$Companion$pluginDownloadHandler$1] */
    static {
        final Looper mainLooper = Looper.getMainLooper();
        LLJIJIL = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.feed.ui.PluginDownloadStatusBar$Companion$pluginDownloadHandler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("PluginDownloadStatusBar$Companion@2a39.pluginDownloadHandler$1");
                Iterator<InterfaceC1604310rqn> it2 = C1604320rqo.LLJI.iterator();
                while (it2.hasNext()) {
                    it2.next().LLJJJJ();
                }
                C1C7U.LIZIZ("PluginDownloadStatusBar$Companion@2a39.pluginDownloadHandler$1");
            }
        };
    }

    public static boolean LIZLLL() {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null) {
            return false;
        }
        C844470XAv.LIZ.getClass();
        return i18nManagerServiceApiLIZ.LJJI(C844470XAv.LIZ(), "ar");
    }

    public static void LJ() {
        PluginDownloadStatusBar$Companion$pluginDownloadHandler$1 pluginDownloadStatusBar$Companion$pluginDownloadHandler$1 = LLJIJIL;
        if (pluginDownloadStatusBar$Companion$pluginDownloadHandler$1.hasMessages(1)) {
            pluginDownloadStatusBar$Companion$pluginDownloadHandler$1.removeMessages(1);
        }
        if (pluginDownloadStatusBar$Companion$pluginDownloadHandler$1.hasMessages(2)) {
            pluginDownloadStatusBar$Companion$pluginDownloadHandler$1.removeMessages(2);
        }
    }

    private final ContextThemeWrapper getDarkModeContextWrapper() {
        return (ContextThemeWrapper) this.LLJ.getValue();
    }

    private final ContextThemeWrapper getLightModeContextWrapper() {
        return (ContextThemeWrapper) this.LLIZLLLIL.getValue();
    }

    public final void LIZJ() {
        if (LIZLLL()) {
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView != null) {
                tuxTextView.setText("%0");
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText("0%");
        }
    }

    public final void LIZIZ(String str) {
        Integer numValueOf = Integer.valueOf(C960203pA.LIZ(R.attr.a0d, getContext()));
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            ViewGroup viewGroup = this.LL;
            if (viewGroup != null) {
                viewGroup.setBackgroundColor(iIntValue);
            }
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a00, getDarkModeContextWrapper());
        if (numLIZJ != null) {
            int iIntValue2 = numLIZJ.intValue();
            TuxIconView tuxIconView = this.LLILZ;
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_tick_circle_fill;
                c419910GdJ.LIZLLL = Integer.valueOf(iIntValue2);
                tuxIconView.setTuxIcon(c419910GdJ);
            }
            TuxIconView tuxIconView2 = this.LLIZ;
            if (tuxIconView2 != null) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_x_mark;
                c419910GdJ2.LJ = Integer.valueOf(iIntValue2);
                tuxIconView2.setTuxIcon(c419910GdJ2);
            }
        }
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
            tuxTextView.setContentDescription(str);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0p, tuxTextView.getContext());
            if (numLIZJ2 != null) {
                tuxTextView.setTextColor(numLIZJ2.intValue());
            }
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            LJI(8, tuxTextView2);
        }
        TuxTextView tuxTextView3 = this.LLILLL;
        if (tuxTextView3 != null) {
            LJI(8, tuxTextView3);
        }
        TuxIconView tuxIconView3 = this.LLILZ;
        if (tuxIconView3 != null) {
            LJI(0, tuxIconView3);
        }
        TuxTextView tuxTextView4 = this.LLILZIL;
        if (tuxTextView4 != null) {
            LJI(0, tuxTextView4);
        }
        TuxTextView tuxTextView5 = this.LLILZLL;
        if (tuxTextView5 != null) {
            LJI(8, tuxTextView5);
        }
        TuxIconView tuxIconView4 = this.LLIZ;
        if (tuxIconView4 != null) {
            LJI(0, tuxIconView4);
        }
        ViewGroup viewGroup2 = this.LL;
        if (viewGroup2 != null) {
            LJI(0, viewGroup2);
        }
        LIZJ();
        View rootView = getRootView();
        if (rootView != null) {
            rootView.requestLayout();
        }
        LJ();
        PluginDownloadStatusBar$Companion$pluginDownloadHandler$1 pluginDownloadStatusBar$Companion$pluginDownloadHandler$1 = LLJIJIL;
        if (!pluginDownloadStatusBar$Companion$pluginDownloadHandler$1.hasMessages(1)) {
            C786410Ut5.LJLJJI(1, Mp4ScreenVideoLoadTimeout.CONTROL, pluginDownloadStatusBar$Companion$pluginDownloadHandler$1);
        }
    }

    public C1604320rqo(Context context, AttributeSet attributeSet) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super(context, attributeSet);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1862));
        this.LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1861));
        C20742916Ex.LIZ(getContext(), R.layout.b95, this, true, -1);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.ts2);
        this.LL = viewGroup;
        if (viewGroup != null) {
            C786410Ut5.K7(viewGroup, new View.OnClickListener() { // from class: X.0rqt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
        }
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.qvb);
        this.LLILLL = (TuxTextView) findViewById(R.id.qvc);
        this.LLILZ = (TuxIconView) findViewById(R.id.qv9);
        this.LLILZIL = (TuxTextView) findViewById(R.id.qva);
        this.LLILZLL = (TuxTextView) findViewById(R.id.qv_);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.qv8);
        this.LLIZ = tuxIconView;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS158S0100000_24(this, 17));
        }
        LIZJ();
        if (C303940Bvk.LIZ()) {
            for (Object obj : C1697810uHb.LJIIJJI(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ)) {
                if (obj != null) {
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    ViewGroup.LayoutParams layoutParams = ((View) obj).getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, iLIZIZ, marginLayoutParams.rightMargin, iLIZIZ);
                    }
                }
            }
        }
        C2271391DvN.LIZ(this.LL, (C1A5L) C2271381DvM.LLLLZIL.getValue());
        C2271391DvN.LIZ(this.LLIZ, (C1A5L) C2271381DvM.LLLLZLL.getValue());
        C2271391DvN.LIZ(this.LLILZLL, (C1A5L) C2271381DvM.LLLLZLLIL.getValue());
        ViewGroup viewGroup2 = this.LL;
        if (viewGroup2 != null) {
            LJI(8, viewGroup2);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            LJI(8, tuxTextView);
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            LJI(8, tuxTextView2);
        }
        TuxIconView tuxIconView2 = this.LLILZ;
        if (tuxIconView2 != null) {
            LJI(8, tuxIconView2);
        }
        TuxTextView tuxTextView3 = this.LLILZIL;
        if (tuxTextView3 != null) {
            LJI(8, tuxTextView3);
        }
        TuxTextView tuxTextView4 = this.LLILZLL;
        if (tuxTextView4 != null) {
            LJI(8, tuxTextView4);
        }
        TuxIconView tuxIconView3 = this.LLIZ;
        if (tuxIconView3 != null) {
            LJI(8, tuxIconView3);
        }
    }

    public static void LJI(int i, View view) {
        if (view.getVisibility() != i) {
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public final void LJFF(int i, String str) {
        int i2;
        String strLIZIZ;
        if (C1865950yen.LIZ()) {
            i2 = R.attr.il;
        } else if (C1865950yen.LIZIZ()) {
            i2 = R.attr.im;
        } else {
            i2 = R.attr.e4;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i2, getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            ViewGroup viewGroup = this.LL;
            if (viewGroup != null) {
                viewGroup.setBackgroundColor(iIntValue);
            }
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            if (LIZLLL()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('%');
                sbLIZ.append(i);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(i);
                sbLIZ2.append('%');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            tuxTextView.setText(strLIZIZ);
            tuxTextView.setContentDescription(tuxTextView.getText());
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(str);
            tuxTextView2.setContentDescription(str);
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0p, getContext());
        if (numLIZJ2 != null) {
            int iIntValue2 = numLIZJ2.intValue();
            TuxTextView tuxTextView3 = this.LLILLJJLI;
            if (tuxTextView3 != null) {
                tuxTextView3.setTextColor(iIntValue2);
            }
            TuxTextView tuxTextView4 = this.LLILLL;
            if (tuxTextView4 != null) {
                tuxTextView4.setTextColor(iIntValue2);
            }
        }
        TuxTextView tuxTextView5 = this.LLILLJJLI;
        if (tuxTextView5 != null) {
            LJI(0, tuxTextView5);
        }
        TuxTextView tuxTextView6 = this.LLILLL;
        if (tuxTextView6 != null) {
            LJI(0, tuxTextView6);
        }
        TuxIconView tuxIconView = this.LLILZ;
        if (tuxIconView != null) {
            LJI(8, tuxIconView);
        }
        TuxTextView tuxTextView7 = this.LLILZIL;
        if (tuxTextView7 != null) {
            LJI(8, tuxTextView7);
        }
        TuxTextView tuxTextView8 = this.LLILZLL;
        if (tuxTextView8 != null) {
            LJI(8, tuxTextView8);
        }
        TuxIconView tuxIconView2 = this.LLIZ;
        if (tuxIconView2 != null) {
            LJI(8, tuxIconView2);
        }
        ViewGroup viewGroup2 = this.LL;
        if (viewGroup2 != null) {
            LJI(0, viewGroup2);
        }
    }

    public final void LIZ(String str, String str2, Function0<Unit> function0) {
        int i;
        if (C1865950yen.LIZ()) {
            i = R.attr.il;
        } else {
            C1865950yen.LIZIZ();
            i = R.attr.im;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            ViewGroup viewGroup = this.LL;
            if (viewGroup != null) {
                viewGroup.setBackgroundColor(iIntValue);
            }
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a00, getDarkModeContextWrapper());
        if (numLIZJ != null) {
            int iIntValue2 = numLIZJ.intValue();
            TuxIconView tuxIconView = this.LLILZ;
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_exclamation_mark_circle_fill;
                c419910GdJ.LIZLLL = Integer.valueOf(iIntValue2);
                tuxIconView.setTuxIcon(c419910GdJ);
            }
            TuxIconView tuxIconView2 = this.LLIZ;
            if (tuxIconView2 != null) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_x_mark;
                c419910GdJ2.LIZLLL = Integer.valueOf(iIntValue2);
                tuxIconView2.setTuxIcon(c419910GdJ2);
            }
        }
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
            tuxTextView.setContentDescription(str);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0p, tuxTextView.getContext());
            if (numLIZJ2 != null) {
                int iIntValue3 = numLIZJ2.intValue();
                TuxTextView tuxTextView2 = this.LLILZIL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTextColor(iIntValue3);
                }
            }
        }
        TuxTextView tuxTextView3 = this.LLILZLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(str2);
            tuxTextView3.setContentDescription(str2);
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1n, tuxTextView3.getContext());
            if (numLIZJ3 != null) {
                int iIntValue4 = numLIZJ3.intValue();
                TuxTextView tuxTextView4 = this.LLILZLL;
                if (tuxTextView4 != null) {
                    tuxTextView4.setTextColor(iIntValue4);
                }
            }
            C786410Ut5.h9(tuxTextView3, new ACListenerS158S0100000_24(function0, 16));
        }
        TuxTextView tuxTextView5 = this.LLILLJJLI;
        if (tuxTextView5 != null) {
            LJI(8, tuxTextView5);
        }
        TuxTextView tuxTextView6 = this.LLILLL;
        if (tuxTextView6 != null) {
            LJI(8, tuxTextView6);
        }
        TuxIconView tuxIconView3 = this.LLILZ;
        if (tuxIconView3 != null) {
            LJI(0, tuxIconView3);
        }
        TuxTextView tuxTextView7 = this.LLILZIL;
        if (tuxTextView7 != null) {
            LJI(0, tuxTextView7);
        }
        TuxTextView tuxTextView8 = this.LLILZLL;
        if (tuxTextView8 != null) {
            LJI(0, tuxTextView8);
        }
        TuxIconView tuxIconView4 = this.LLIZ;
        if (tuxIconView4 != null) {
            LJI(0, tuxIconView4);
        }
        ViewGroup viewGroup2 = this.LL;
        if (viewGroup2 != null) {
            LJI(0, viewGroup2);
        }
        LIZJ();
        View rootView = getRootView();
        if (rootView != null) {
            rootView.requestLayout();
        }
        LJ();
        PluginDownloadStatusBar$Companion$pluginDownloadHandler$1 pluginDownloadStatusBar$Companion$pluginDownloadHandler$1 = LLJIJIL;
        if (!pluginDownloadStatusBar$Companion$pluginDownloadHandler$1.hasMessages(2)) {
            C786410Ut5.LJLJJI(2, Mp4ScreenVideoLoadTimeout.CONTROL, pluginDownloadStatusBar$Companion$pluginDownloadHandler$1);
        }
    }
}
