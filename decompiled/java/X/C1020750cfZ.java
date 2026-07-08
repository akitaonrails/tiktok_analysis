package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cfZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020750cfZ implements C0RHF {
    public final ViewGroup LIZ;
    public Aweme LIZIZ;
    public long LIZJ;
    public int LJ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJFF;
    public long LIZLLL = 1;
    public final List<InterfaceC1020760cfa> LJI = new ArrayList();

    public final String LIZLLL() {
        String aid;
        Aweme aweme = this.LIZIZ;
        return (aweme == null || (aid = aweme.getAid()) == null) ? "" : aid;
    }

    @Override // X.C0RHF
    public final void LJII() {
        LJFF(this, "play");
        this.LJ = 1;
    }

    @Override // X.C0RHF
    public final void LLLLLLLLLL() {
        LJFF(this, "pause");
        this.LJ = 2;
    }

    @Override // X.C0RHF
    public final void hs() {
        LJFF(this, "stop");
        this.LJ = 3;
        this.LIZJ = 0L;
    }

    @Override // X.C0RHF
    public final boolean isPlaying() {
        return this.LJ == 1;
    }

    @Override // X.C0RHF
    public final void show() {
        AwemeRawAd awemeRawAd;
        C0X7F.LIZ(this.LJFF, "show");
        Aweme aweme = this.LIZIZ;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.isReshowAd()) {
            return;
        }
        Aweme aweme2 = this.LIZIZ;
        C2184171Adz.LIZLLL("draw_ad", "dc_show_success", aweme2 != null ? aweme2.getAwemeRawAd() : null).LJII();
    }

    @Override // X.C0RHF
    public final long getCurrentPosition() {
        return this.LIZJ;
    }

    @Override // X.C0RHF
    public final long getDuration() {
        return this.LIZLLL;
    }

    public C1020750cfZ(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }

    @Override // X.C0RHF
    public final void LIZ(Aweme aweme) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        ViewGroup viewGroup;
        if (aweme == null) {
            return;
        }
        this.LIZIZ = aweme;
        if (this.LIZ.getChildAt(0) instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
            C786410Ut5.LJJLIL(0, this.LIZ);
            this.LJFF = null;
        }
        C1000380c8i c1000380c8i = C1000380c8i.LIZ;
        C1000400c8k c1000400c8kLJ = C1000380c8i.LJ(LIZLLL());
        if (c1000400c8kLJ != null && c1000400c8kLJ.LIZJ == 1 && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1000400c8kLJ.LIZLLL) != null) {
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getParent() != null) {
                ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, viewGroup);
                }
            }
            if (c1000400c8kLJ.LJ) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c1000400c8kLJ.LIZLLL;
                this.LJFF = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2;
                C0X7F.LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, "attach");
            }
            long j = c1000400c8kLJ.LJFF;
            if (j <= 0) {
                j = 1;
            }
            this.LIZLLL = j;
            ViewGroup viewGroup2 = this.LIZ;
            if (viewGroup2 instanceof FrameLayout) {
                viewGroup2.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, 0, new FrameLayout.LayoutParams(-1, -1, 17));
            } else {
                if (viewGroup2 instanceof RelativeLayout) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(13, -1);
                    this.LIZ.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, 0, layoutParams);
                    return;
                }
                viewGroup2.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, 0, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    @Override // X.C0RHF
    public final void LIZIZ(C583170Mu3 c583170Mu3) {
        ((ArrayList) this.LJI).add(c583170Mu3);
    }

    @Override // X.C0RHF
    public final void LIZJ(C583170Mu3 c583170Mu3) {
        ((ArrayList) this.LJI).remove(c583170Mu3);
    }

    public final void LJ(Function1<? super InterfaceC1020760cfa, Unit> function1) {
        Iterator it2 = ((ArrayList) this.LJI).iterator();
        while (it2.hasNext()) {
            function1.invoke(it2.next());
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDynamicAdStatusEvent(C1020450cf5 c1020450cf5) {
        int iHashCode;
        JSONObject jSONObject;
        InterfaceC1541990qEH kitView;
        int i = c1020450cf5.LIZ;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJFF;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            iHashCode = kitView.hashCode();
        } else {
            iHashCode = 0;
        }
        if (i != iHashCode) {
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDynamicAdStatusEvent, type: ");
        sbLIZ.append(c1020450cf5.LIZIZ);
        sbLIZ.append(", params: ");
        sbLIZ.append(c1020450cf5.LIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        Intrinsics.LJFF(c1020450cf5.LIZIZ, "updateTime");
        String str = c1020450cf5.LIZIZ;
        switch (str.hashCode()) {
            case -934426579:
                if (str.equals("resume")) {
                    LJ(new AwS595S0100000_16(this, 285));
                }
                break;
            case -599445191:
                if (str.equals("complete")) {
                    LJ(new AwS595S0100000_16(this, 287));
                }
                break;
            case -295931082:
                if (str.equals("updateTime") && (jSONObject = c1020450cf5.LIZJ) != null) {
                    this.LIZJ = (long) jSONObject.optDouble("time");
                    LJ(new AwS595S0100000_16(this, 288));
                    break;
                }
                break;
            case 106440182:
                if (str.equals("pause")) {
                    LJ(new AwS595S0100000_16(this, 286));
                }
                break;
            case 108386723:
                if (str.equals("ready")) {
                    LJ(new AwS595S0100000_16(this, 284));
                    C0X7F.LIZ(this.LJFF, "ready");
                }
                break;
        }
    }

    public static void LJFF(C1020750cfZ c1020750cfZ, String str) {
        InterfaceC1541990qEH kitView;
        c1020750cfZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendEventToFe: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1020750cfZ.LJFF;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView.LIZ(str, new JSONObject() { // from class: X.0cfb
            });
        }
    }
}
