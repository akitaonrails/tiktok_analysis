package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bpS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractViewOnClickListenerC988440bpS implements View.OnClickListener {
    public final LinearLayout LL;
    public final Context LLILLJJLI;
    public final Aweme LLILLL;
    public final InterfaceC988480bpW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    public abstract void LIZJ();

    public abstract void LIZLLL(View view);

    public final TextView LIZIZ() {
        return (TextView) this.LLILZIL.getValue();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        boolean zLL = C1017070cZd.LL(this.LLILLL);
        if (!AwemeExtKt.isAdTraffic(this.LLILLL) && zLL) {
            if (view != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(view);
                c1389890mGx.LJIIIZ(2131824738);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        if (view != null && (numValueOf = Integer.valueOf(view.getId())) != null) {
            if (numValueOf.intValue() == R.id.hs6) {
                this.LLILZ.LIZ(3);
                this.LLILZ.LIZIZ(false, true);
                return;
            }
            if (numValueOf.intValue() == R.id.hs8 || numValueOf.intValue() == R.id.hsb) {
                if (AwemeExtKt.isAdTraffic(this.LLILLL)) {
                    C988530bpb c988530bpb = C988530bpb.LIZ;
                    AwemeRawAd awemeRawAd = this.LLILLL.getAwemeRawAd();
                    c988530bpb.getClass();
                    C1001140c9w c1001140c9w = new C1001140c9w();
                    c1001140c9w.LIZ = awemeRawAd;
                    c1001140c9w.LIZIZ = "button";
                    JSONObject jSONObjectLIZ = c1001140c9w.LIZ();
                    if (awemeRawAd != null) {
                        C994130byd.LIZ("background_ad", "replay", jSONObjectLIZ, awemeRawAd);
                        InterfaceC988500bpY interfaceC988500bpYQ = ((ICommercializeAdService) ServiceManager.get().getService(ICommercializeAdService.class)).Q(4);
                        if (interfaceC988500bpYQ != null && (interfaceC988500bpYQ instanceof InterfaceC988510bpZ)) {
                            ((InterfaceC988510bpZ) interfaceC988500bpYQ).LIZJ(awemeRawAd);
                        }
                    }
                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("background_ad", "replay", awemeRawAd);
                    c1022820ciuLIZLLL.LIZJ("button", "refer");
                    c1022820ciuLIZLLL.LIZIZ(0, "is_lynx");
                    c1022820ciuLIZLLL.LJIIIIZZ();
                    this.LLILZ.LIZJ();
                }
                this.LLILZ.LIZIZ(true, false);
                return;
            }
        }
        LIZLLL(view);
    }

    public AbstractViewOnClickListenerC988440bpS(LinearLayout linearLayout, C987450bnr c987450bnr) {
        this.LL = linearLayout;
        Context context = c987450bnr.LIZ;
        this.LLILLJJLI = context == null ? null : context;
        Aweme aweme = c987450bnr.LIZIZ;
        this.LLILLL = aweme == null ? null : aweme;
        InterfaceC988480bpW interfaceC988480bpW = c987450bnr.LIZJ;
        this.LLILZ = interfaceC988480bpW != null ? interfaceC988480bpW : null;
        this.LLILZIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 777));
        this.LLILZLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 778));
    }

    public final View LIZ(int i, ViewGroup viewGroup) {
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.i7p);
        C786410Ut5.LJJJJIZL(frameLayout);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILLJJLI), i, frameLayout, false);
        frameLayout.addView(viewTd);
        C786410Ut5.R7(this.LL, this);
        return viewTd;
    }
}
