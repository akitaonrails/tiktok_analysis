package X;

import Y.ACListenerS118S0200000_15;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAnchorThresholdConfigSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aRO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ViewOnClickListenerC935080aRO implements View.OnClickListener {
    public final Context LL;
    public final MultiGuestDataHolder LLILLJJLI;
    public final Function0<MultiLiveAnchorPanelSettings> LLILLL;
    public final Function1<Integer, Unit> LLILZ;
    public final String LLILZIL;
    public ViewGroup LLILZLL;
    public ViewGroup LLIZ;
    public C21411718qp LLIZLLLIL;
    public ViewGroup LLJ;
    public C16FS LLJI;
    public C16FS LLJIJIL;
    public C16FS LLJILJIL;
    public C16FS LLJILJILJ;
    public C16FS LLJILLL;
    public C16FS LLJJ;
    public ImageView LLJJI;
    public ImageView LLJJIII;
    public ImageView LLJJIJI;
    public ImageView LLJJIJIIJIL;
    public ImageView LLJJIJIL;
    public ImageView LLJJJ;
    public int LLJJJJJIL;
    public DialogC1840040xz0 LLJLLIL;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(283));
    public int LLJJJJ = -1;
    public int LLJJJJLIIL = 1;
    public int LLJJL = 5;
    public int LLJJLIIIJLLLLLLLZ = 10;
    public int LLJL = 30;
    public int LLJLIL = 50;
    public final int LLJLILLLLZIIL = 1;
    public int LLJLL = 39999;
    public final C01GW LLJLLL = C292401Bi.LIZ(new AwS559S0100000_15(this, 770));

    public final HashMap<Integer, Pair<C16FS, ImageView>> LIZJ() {
        return (HashMap) this.LLJJJIL.getValue();
    }

    public final void LJI() {
        C21411718qp c21411718qp = this.LLIZLLLIL;
        if (c21411718qp != null && c21411718qp.isChecked()) {
            ViewGroup viewGroup = this.LLJ;
            if (viewGroup != null) {
                C12ES.LJIILL(0, viewGroup);
                return;
            }
            return;
        }
        if (C937280aUw.LIZ(this.LLILZIL)) {
            ViewGroup viewGroup2 = this.LLJ;
            if (viewGroup2 != null) {
                C12ES.LJIILL(4, viewGroup2);
                return;
            }
            return;
        }
        ViewGroup viewGroup3 = this.LLJ;
        if (viewGroup3 != null) {
            C439101nJ.LJI(viewGroup3);
        }
    }

    public static String LIZLLL(int i) {
        return C786410Ut5.j4(C497740JfY.LJIIJJI(2131755572, i), Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
    }

    public final void LIZ(int i) {
        ImageView second;
        C16FS first;
        Integer numLIZJ;
        ImageView second2;
        C16FS first2;
        int iIntValue;
        Integer numLIZJ2;
        if (i == this.LLJJJJ) {
            return;
        }
        Pair<C16FS, ImageView> pair = LIZJ().get(Integer.valueOf(i));
        int iIntValue2 = 0;
        if (pair != null && (first2 = pair.getFirst()) != null) {
            Context context = this.LL;
            if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context)) != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = 0;
            }
            first2.setTextColor(iIntValue);
        }
        Pair<C16FS, ImageView> pair2 = LIZJ().get(Integer.valueOf(i));
        if (pair2 != null && (second2 = pair2.getSecond()) != null) {
            C12ES.LJIILL(0, second2);
        }
        Pair<C16FS, ImageView> pair3 = LIZJ().get(Integer.valueOf(this.LLJJJJ));
        if (pair3 != null && (first = pair3.getFirst()) != null) {
            Context context2 = this.LL;
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, context2)) != null) {
                iIntValue2 = numLIZJ.intValue();
            }
            first.setTextColor(iIntValue2);
        }
        Pair<C16FS, ImageView> pair4 = LIZJ().get(Integer.valueOf(this.LLJJJJ));
        if (pair4 != null && (second = pair4.getSecond()) != null) {
            C12ES.LJIILL(4, second);
        }
        this.LLJJJJ = i;
    }

    public final void LIZIZ(long j) {
        int i = (int) j;
        if (i != this.LLJJJJLIIL && i != this.LLJJL && i != this.LLJJLIIIJLLLLLLLZ && i != this.LLJL && i != this.LLJLIL) {
            LIZ(0);
            C16FS c16fs = this.LLJJ;
            if (c16fs != null) {
                c16fs.setText(LIZLLL(i));
            }
            this.LLJJJJJIL = i;
            return;
        }
        LIZ(i);
    }

    public final void LJFF(int i) {
        ViewGroup viewGroup;
        if (i != 0) {
            if (i == 8 && (viewGroup = this.LLILZLL) != null) {
                C439101nJ.LJI(viewGroup);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.LLILZLL;
        if (viewGroup2 == null) {
            return;
        }
        C12ES.LJIILL(0, viewGroup2);
    }

    public final void LJII(long j) {
        Function1<Integer, Unit> function1;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke;
        Function0<MultiLiveAnchorPanelSettings> function0 = this.LLILLL;
        if (function0 != null && (multiLiveAnchorPanelSettingsInvoke = function0.invoke()) != null) {
            multiLiveAnchorPanelSettingsInvoke.applierSortGiftScoreThreshold = j;
        }
        if (!C937280aUw.LIZ(this.LLILZIL) && (function1 = this.LLILZ) != null) {
            function1.invoke(5);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean zIsChecked;
        Long lValueOf;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        Long lValueOf2;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
        C21411718qp c21411718qp = this.LLIZLLLIL;
        if (c21411718qp != null) {
            zIsChecked = c21411718qp.isChecked();
        } else {
            zIsChecked = false;
        }
        if (!zIsChecked) {
            MultiGuestDataHolder multiGuestDataHolder = this.LLILLJJLI;
            if (multiGuestDataHolder != null && (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolder.LIZIZ()) != null && (lValueOf2 = Long.valueOf(multiLiveAnchorPanelSettingsLIZIZ2.applierSortGiftScoreThreshold)) != null && lValueOf2.longValue() != 0) {
                if (lValueOf2.longValue() < 0) {
                    lValueOf2 = Long.valueOf(-lValueOf2.longValue());
                }
            } else {
                lValueOf2 = Long.valueOf(this.LLJJJJLIIL);
            }
            LJII(lValueOf2.longValue());
            LIZIZ(lValueOf2.longValue());
            C935060aRM.LIZ("open");
            C935060aRM.LIZJ((int) lValueOf2.longValue(), "manual_set");
            RedDotExtensionKt.LIZ(C0UX6.MULTI_GUEST_GIFT_PRIORITY_TOP_HOST_RED_DOT);
            RedDotExtensionKt.LIZ(C0UX6.MULTI_GUEST_GIFT_PRIORITY_TOP_HOST_DIRECT);
        } else {
            MultiGuestDataHolder multiGuestDataHolder2 = this.LLILLJJLI;
            if (multiGuestDataHolder2 != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder2.LIZIZ()) != null && (lValueOf = Long.valueOf(multiLiveAnchorPanelSettingsLIZIZ.applierSortGiftScoreThreshold)) != null) {
                if (lValueOf.longValue() > 0) {
                    lValueOf = Long.valueOf(-lValueOf.longValue());
                }
            } else {
                lValueOf = 0L;
            }
            LJII(lValueOf.longValue());
            C935060aRM.LIZ("close");
        }
        C21411718qp c21411718qp2 = this.LLIZLLLIL;
        if (c21411718qp2 != null) {
            c21411718qp2.setChecked(!zIsChecked);
        }
        LJI();
    }

    public final void LJ(View view, MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        MultiGuestDataHolder multiGuestDataHolder;
        C16FS first;
        if (!C922770a7X.LIZ()) {
            return;
        }
        try {
            MultiGuestAnchorThresholdConfigSetting multiGuestAnchorThresholdConfigSetting = MultiGuestAnchorThresholdConfigSetting.INSTANCE;
            this.LLJJJJLIIL = multiGuestAnchorThresholdConfigSetting.getOptions().get(0).intValue();
            this.LLJJL = multiGuestAnchorThresholdConfigSetting.getOptions().get(1).intValue();
            this.LLJJLIIIJLLLLLLLZ = multiGuestAnchorThresholdConfigSetting.getOptions().get(2).intValue();
            this.LLJL = multiGuestAnchorThresholdConfigSetting.getOptions().get(3).intValue();
            this.LLJLIL = multiGuestAnchorThresholdConfigSetting.getOptions().get(4).intValue();
            this.LLJLL = multiGuestAnchorThresholdConfigSetting.getMaxCoins();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLILZLL = (ViewGroup) view.findViewById(R.id.j1i);
        this.LLIZ = (ViewGroup) view.findViewById(R.id.j1l);
        this.LLIZLLLIL = (C21411718qp) view.findViewById(R.id.j1k);
        this.LLJ = (ViewGroup) view.findViewById(R.id.j1e);
        this.LLJI = (C16FS) view.findViewById(R.id.uw6);
        this.LLJIJIL = (C16FS) view.findViewById(R.id.uwb);
        this.LLJILJIL = (C16FS) view.findViewById(R.id.uw7);
        this.LLJILJILJ = (C16FS) view.findViewById(R.id.uw_);
        this.LLJILLL = (C16FS) view.findViewById(R.id.uwc);
        this.LLJJ = (C16FS) view.findViewById(R.id.uwf);
        this.LLJJI = (ImageView) view.findViewById(R.id.uw9);
        this.LLJJIII = (ImageView) view.findViewById(R.id.uwe);
        this.LLJJIJI = (ImageView) view.findViewById(R.id.uw8);
        this.LLJJIJIIJIL = (ImageView) view.findViewById(R.id.uwa);
        this.LLJJIJIL = (ImageView) view.findViewById(R.id.uwd);
        this.LLJJJ = (ImageView) view.findViewById(R.id.uwg);
        HashMap<Integer, Pair<C16FS, ImageView>> mapLIZJ = LIZJ();
        mapLIZJ.put(Integer.valueOf(this.LLJJJJLIIL), new Pair<>(this.LLJI, this.LLJJI));
        mapLIZJ.put(Integer.valueOf(this.LLJJL), new Pair<>(this.LLJIJIL, this.LLJJIII));
        mapLIZJ.put(Integer.valueOf(this.LLJJLIIIJLLLLLLLZ), new Pair<>(this.LLJILJIL, this.LLJJIJI));
        mapLIZJ.put(Integer.valueOf(this.LLJL), new Pair<>(this.LLJILJILJ, this.LLJJIJIIJIL));
        mapLIZJ.put(Integer.valueOf(this.LLJLIL), new Pair<>(this.LLJILLL, this.LLJJIJIL));
        mapLIZJ.put(0, new Pair<>(this.LLJJ, this.LLJJJ));
        for (Map.Entry<Integer, Pair<C16FS, ImageView>> entry : LIZJ().entrySet()) {
            Context context = this.LL;
            if (context != null && (first = entry.getValue().getFirst()) != null) {
                first.setBackground(C424030Gjx.LIZ(context));
            }
        }
        C16FS c16fs = this.LLJI;
        if (c16fs != null) {
            c16fs.setText(LIZLLL(this.LLJJJJLIIL));
        }
        C16FS c16fs2 = this.LLJIJIL;
        if (c16fs2 != null) {
            c16fs2.setText(LIZLLL(this.LLJJL));
        }
        C16FS c16fs3 = this.LLJILJIL;
        if (c16fs3 != null) {
            c16fs3.setText(LIZLLL(this.LLJJLIIIJLLLLLLLZ));
        }
        C16FS c16fs4 = this.LLJILJILJ;
        if (c16fs4 != null) {
            c16fs4.setText(LIZLLL(this.LLJL));
        }
        C16FS c16fs5 = this.LLJILLL;
        if (c16fs5 != null) {
            c16fs5.setText(LIZLLL(this.LLJLIL));
        }
        ViewGroup viewGroup = this.LLILZLL;
        if (viewGroup != null) {
            C12ES.LJIILL(0, viewGroup);
        }
        ViewGroup viewGroup2 = this.LLIZ;
        if (viewGroup2 != null) {
            C786410Ut5.K7(viewGroup2, this);
        }
        if (multiLiveAnchorPanelSettings != null || ((multiGuestDataHolder = this.LLILLJJLI) != null && (multiLiveAnchorPanelSettings = multiGuestDataHolder.LIZIZ()) != null)) {
            if (multiLiveAnchorPanelSettings.applierSortGiftScoreThreshold <= 0) {
                C21411718qp c21411718qp = this.LLIZLLLIL;
                if (c21411718qp != null) {
                    c21411718qp.setChecked(false);
                }
            } else {
                RedDotExtensionKt.LIZ(C0UX6.MULTI_GUEST_GIFT_PRIORITY_TOP_HOST_RED_DOT);
                RedDotExtensionKt.LIZ(C0UX6.MULTI_GUEST_GIFT_PRIORITY_TOP_HOST_DIRECT);
                C21411718qp c21411718qp2 = this.LLIZLLLIL;
                if (c21411718qp2 != null) {
                    c21411718qp2.setChecked(true);
                }
                LIZIZ(multiLiveAnchorPanelSettings.applierSortGiftScoreThreshold);
            }
        }
        LJI();
        for (Map.Entry<Integer, Pair<C16FS, ImageView>> entry2 : LIZJ().entrySet()) {
            C16FS first2 = entry2.getValue().getFirst();
            if (first2 != null) {
                C786410Ut5.h8(first2, new ACListenerS118S0200000_15(entry2, this, 40));
            }
        }
    }

    public ViewOnClickListenerC935080aRO(Context context, MultiGuestDataHolder multiGuestDataHolder, Function0 function0, Function1 function1, String str) {
        this.LL = context;
        this.LLILLJJLI = multiGuestDataHolder;
        this.LLILLL = function0;
        this.LLILZ = function1;
        this.LLILZIL = str;
    }
}
