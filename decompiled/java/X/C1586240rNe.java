package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0rNe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1586240rNe extends AbstractC1586250rNf {
    public final int LLILZIL;
    public final boolean LLILZLL;
    public final C01GW LLIZ;
    public View LLIZLLLIL;
    public TextView LLJ;
    public float LLJI;
    public final C01GW LLJIJIL;
    public Pair<? extends Aweme, String> LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public volatile boolean LLJJ;
    public AnonymousClass0956 LLJJI;

    @Override // X.AbstractC1586250rNf, X.InterfaceC1570900qyu
    public final void LIZ() {
        TuxIconView tuxIconView;
        View view = this.LLIZLLLIL;
        if (!(view instanceof TuxIconView) || (tuxIconView = (TuxIconView) view) == null) {
            return;
        }
        tuxIconView.LIZJ(false);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, tuxIconView.getContext());
        if (numLIZJ != null) {
            tuxIconView.setTintColor(numLIZJ.intValue());
        }
    }

    public final String LJI() {
        return (String) this.LLJIJIL.getValue();
    }

    @Override // X.AbstractC1586250rNf, X.InterfaceC1570900qyu
    public final void T1() {
        TuxIconView tuxIconView;
        View view = this.LLIZLLLIL;
        if (!(view instanceof TuxIconView) || (tuxIconView = (TuxIconView) view) == null) {
            return;
        }
        tuxIconView.LIZJ(true);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, tuxIconView.getContext());
        if (numLIZJ != null) {
            tuxIconView.setTintColor(numLIZJ.intValue());
        }
    }

    @Override // X.InterfaceC1570900qyu
    public final void Z1() {
        LJ();
        AnonymousClass0956 anonymousClass0956 = this.LLJJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    @Override // X.InterfaceC1570900qyu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U1(android.view.View r12) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1586240rNe.U1(android.view.View):void");
    }

    @Override // X.InterfaceC1570900qyu
    public final void X1(int i) {
        View view;
        Aweme aweme;
        if (!((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O4(false).LIZLLL() && (view = this.LLIZLLLIL) != null) {
            C19EG activity = LIZJ().getActivity();
            if (activity != null) {
                aweme = C680080Qly.LIZIZ(activity).LLJILJILJ;
            } else {
                aweme = null;
            }
            C1030680cva.LJIILJJIL(aweme, i, view);
            if (i == 4) {
                C786410Ut5.T4(view, 1.0f);
            }
        }
    }

    @Override // X.C0T2Y
    public final void Y3(Aweme aweme) {
        AnonymousClass0956 anonymousClass0956 = this.LLJJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        TextView textView = this.LLJ;
        if (textView == null) {
            return;
        }
        if (aweme == null) {
            textView.setText(LJI());
            this.LLJILJIL = null;
            this.LLJJ = false;
            return;
        }
        this.LLJJI = C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C436730HAp(textView, this, aweme, null), 3);
    }

    @Override // X.InterfaceC1570900qyu
    public final View f2(Context context) {
        C19EG activity = LIZJ().getActivity();
        if (activity == null) {
            return null;
        }
        if (((Boolean) this.LLIZ.getValue()).booleanValue()) {
            this.LLIZLLLIL = ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getInflatedSearchIcon(activity);
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O4(false).LJIIIIZZ(null);
        } else {
            C995220c0O c995220c0O = C995220c0O.LIZ;
            int i = this.LLILZIL;
            c995220c0O.getClass();
            C443120HZe c443120HZeLJFF = C995220c0O.LIZLLL.get(Integer.valueOf(i));
            if (c443120HZeLJFF == null) {
                HomepageIconServiceApi homepageIconServiceApi = (HomepageIconServiceApi) C995220c0O.LJ.getValue();
                if (homepageIconServiceApi != null) {
                    c443120HZeLJFF = homepageIconServiceApi.LJFF(i, activity);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            this.LLIZLLLIL = c443120HZeLJFF.getFirst();
            this.LLJ = c443120HZeLJFF.getSecond();
            this.LLJI = c443120HZeLJFF.getThird().intValue();
            if (this.LLILZLL) {
                TextView textView = this.LLJ;
                if (textView != null) {
                    textView.setText(LJI());
                }
            } else {
                LIZLLL();
            }
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O4(false).LJIIIIZZ(this.LLIZLLLIL);
        }
        return this.LLIZLLLIL;
    }

    public C1586240rNe(int i, boolean z, InterfaceC1617760sCU interfaceC1617760sCU) {
        this.LL = interfaceC1617760sCU;
        this.LLILZIL = i;
        this.LLILZLL = z;
        this.LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1653));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(interfaceC1617760sCU, 1652));
        this.LLJILJILJ = "";
        this.LLJILLL = "";
    }
}
