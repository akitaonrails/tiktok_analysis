package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.IAnoleService;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS81S0100100_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cN7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1009310cN7 implements InterfaceC1010530cP5 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final InterfaceC1009320cN8 LL;
    public final C997320c3m LLILLJJLI = new C997320c3m(AFwS252S0000000_16.get$arr$(427));
    public final C997320c3m LLILLL = new C997320c3m(AFwS252S0000000_16.get$arr$(426));
    public IAnoleManager LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1009310cN7.class, "context", "getContext()Landroid/content/Context;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1009310cN7.class, "aweme", "getAweme()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final Aweme LIZ() {
        C997320c3m c997320c3m = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        return (Aweme) c997320c3m.LIZ(this);
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
        String aid = LIZ().getAid();
        AwemeRawAd awemeRawAd = LIZ().getAwemeRawAd();
        if (aid == null || awemeRawAd == null) {
            return;
        }
        IAnoleService iAnoleService = (IAnoleService) ServiceManager.get().getService(IAnoleService.class);
        C997320c3m c997320c3m = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        this.LLILZ = iAnoleService.LJI((Context) c997320c3m.LIZ(this), null, new C1009340cNA(aid, LIZ().getGroupId(), LIZ(), awemeRawAd, null, null, null, 112), new InterfaceC1007910cKr() { // from class: X.0cN4
            @Override // X.InterfaceC1007910cKr
            public final void LJJLIIJ() {
            }

            @Override // X.InterfaceC1007910cKr
            public final long LJJLIL() {
                return 0L;
            }

            @Override // X.InterfaceC1007910cKr
            public final int LLJILLL() {
                return 0;
            }

            @Override // X.InterfaceC1007910cKr
            public final void LLJJIII(String str, View.OnLayoutChangeListener onLayoutChangeListener) {
            }

            @Override // X.InterfaceC1007910cKr
            public final C1014410cVL LLJJIJI(String str) {
                return null;
            }

            @Override // X.InterfaceC1007910cKr
            public final C1014390cVJ LLJJIJIIJIL() {
                return null;
            }

            @Override // X.InterfaceC1007910cKr
            public final void P() {
            }

            @Override // X.InterfaceC1007910cKr
            public final void U2() {
            }

            @Override // X.InterfaceC1007910cKr
            public final JSONObject V2() {
                return null;
            }

            @Override // X.InterfaceC1007910cKr
            public final void X2(String str, ViewOnLayoutChangeListenerC1014330cVD viewOnLayoutChangeListenerC1014330cVD) {
            }

            @Override // X.InterfaceC1007910cKr
            public final HashMap<String, Object> Z2() {
                return null;
            }

            @Override // X.InterfaceC1007910cKr
            public final boolean a3(String str, Runnable runnable, int i) {
                return true;
            }

            @Override // X.InterfaceC1007910cKr
            public final ViewGroup b3() {
                return null;
            }

            @Override // X.InterfaceC1007910cKr
            public final boolean d3() {
                return true;
            }

            @Override // X.InterfaceC1007910cKr
            public final boolean e3() {
                return false;
            }

            @Override // X.InterfaceC1007910cKr
            public final void f3(long j, String str, String str2, AwS81S0100100_16 awS81S0100100_16) {
            }

            @Override // X.InterfaceC1007910cKr
            public final void g3(int i) {
            }

            @Override // X.InterfaceC1007910cKr
            public final boolean h3(String str, InterfaceC1007930cKt interfaceC1007930cKt, AnoleComponentAppearModel anoleComponentAppearModel) {
                return true;
            }

            @Override // X.InterfaceC1007910cKr
            public final Integer i3() {
                return null;
            }

            @Override // X.InterfaceC1007910cKr
            public final void o0() {
            }

            @Override // X.InterfaceC1007910cKr
            public final void pauseVideo() {
            }

            @Override // X.InterfaceC1007910cKr
            public final long r1() {
                return 0L;
            }

            @Override // X.InterfaceC1007910cKr
            public final C1014390cVJ Y2() {
                float f = (float) (0.0d / ((double) 2));
                return new C1014390cVJ(new C1009390cNF(0.0d, 0.0d), new PointF(f, f));
            }

            @Override // X.InterfaceC1007910cKr
            public final C1008080cL8 c3() {
                IFeedAdService iFeedAdService = (IFeedAdService) ServiceManager.get().getService(IFeedAdService.class);
                C1009310cN7 c1009310cN7 = this.LIZ;
                C997320c3m c997320c3m2 = c1009310cN7.LLILLJJLI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C1009310cN7.LLILZIL;
                return iFeedAdService.LJJIIZI((Context) c997320c3m2.LIZ(c1009310cN7), this.LIZ.LIZ(), null);
            }

            @Override // X.InterfaceC1007910cKr
            public final C1009390cNF W2(String str) {
                return C1008220cLM.LIZ();
            }

            @Override // X.InterfaceC1007910cKr
            public final void LIZIZ(AbstractC991850bux abstractC991850bux, InterfaceC1007930cKt interfaceC1007930cKt) {
                Activity activity;
                if (abstractC991850bux instanceof C1005320cGg) {
                    C1029590ctp.LIZIZ();
                    if (interfaceC1007930cKt != null) {
                        activity = interfaceC1007930cKt.getActivity();
                    } else {
                        activity = null;
                    }
                    C0SQ9.LIZ(activity, this.LIZ.LIZ(), ((C1005320cGg) abstractC991850bux).LIZLLL, new InterfaceC1021920chS() { // from class: X.0cN5
                        @Override // X.InterfaceC1021920chS
                        public final void LIZ() {
                        }
                    });
                }
            }
        }, null);
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LL;
    }

    public C1009310cN7(C1009330cN9 c1009330cN9) {
        this.LL = c1009330cN9;
    }
}
