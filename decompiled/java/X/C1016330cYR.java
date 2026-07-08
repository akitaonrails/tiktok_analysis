package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS81S0100100_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cYR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1016330cYR implements InterfaceC1007910cKr {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public ViewGroup LIZJ;
    public SparkContext LIZLLL;
    public C1035880d3y LJ;
    public C1016360cYU LJFF;
    public boolean LJI;
    public long LJII;
    public long LJIIIIZZ;
    public boolean LJIIIZ;
    public final C01GW LJIIJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(527));
    public IAnoleManager LJIIJJI;

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
        if (this.LIZJ != null) {
            return new C1014390cVJ(new C1009390cNF(r6.getWidth(), r6.getHeight()), new PointF(r6.getWidth() / 2, r6.getHeight() / 2));
        }
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final C1008080cL8 c3() {
        Aweme aweme;
        Context context = this.LIZ;
        if (context == null || (aweme = this.LIZIZ) == null) {
            return null;
        }
        return ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJIIZI(context, aweme, C1014230cV3.LIZ("iab_loading_format"));
    }

    @Override // X.InterfaceC1007910cKr
    public final C1009390cNF W2(String str) {
        return C1008220cLM.LIZ();
    }

    public C1016330cYR(Context context, Aweme aweme) {
        this.LIZ = context;
        this.LIZIZ = aweme;
    }

    public final void LIZ(SparkContext sparkContext, String str) {
        long jCurrentTimeMillis;
        long jValueOf;
        View viewLIZ;
        ViewGroup viewGroup;
        if (sparkContext != null) {
            C1043000dFS c1043000dFS = (C1043000dFS) sparkContext.LJFF(C1043000dFS.class);
            if (c1043000dFS != null) {
                c1043000dFS.LIZJ(true);
            }
            C21395718oF c21395718oF = (C21395718oF) sparkContext.LJFF(C21395718oF.class);
            if (c21395718oF != null) {
                c21395718oF.LJJIJL(true);
            }
        }
        if (sparkContext != null) {
            InterfaceC1016420cYa interfaceC1016420cYa = (InterfaceC1016420cYa) sparkContext.LJFF(InterfaceC1016420cYa.class);
            if (interfaceC1016420cYa != null) {
                viewLIZ = interfaceC1016420cYa.LIZ();
            } else {
                viewLIZ = null;
            }
            if ((viewLIZ instanceof ViewGroup) && viewLIZ != null) {
                viewGroup = (ViewGroup) viewLIZ.findViewById(R.id.i7a);
            } else {
                viewGroup = null;
            }
            this.LIZJ = viewGroup;
        }
        ViewGroup viewGroup2 = this.LIZJ;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(8, viewGroup2);
        }
        this.LJIIIZ = false;
        C1016360cYU c1016360cYU = this.LJFF;
        if (c1016360cYU != null) {
            c1016360cYU.setDestructionTiming(str);
        }
        C1016360cYU c1016360cYU2 = this.LJFF;
        if (c1016360cYU2 != null) {
            if (this.LJIIIIZZ == 0) {
                jValueOf = 0L;
            } else {
                jValueOf = Long.valueOf(System.currentTimeMillis() - this.LJIIIIZZ);
            }
            c1016360cYU2.setLoadingFormatDestructionDuration(jValueOf);
        }
        C1016360cYU c1016360cYU3 = this.LJFF;
        if (c1016360cYU3 != null) {
            if (c1016360cYU3.loadingFormatStuckStartTime > 0) {
                jCurrentTimeMillis = System.currentTimeMillis() - c1016360cYU3.loadingFormatStuckStartTime;
            } else {
                jCurrentTimeMillis = 0;
            }
            c1016360cYU3.setLoadingFormatStuckDuration(jCurrentTimeMillis);
            c1016360cYU3.setLoadingFormatStuckStartTime(0L);
        }
        this.LJII = 0L;
        this.LJIIIIZZ = 0L;
        IAnoleManager iAnoleManager = this.LJIIJJI;
        if (iAnoleManager == null) {
            return;
        }
        iAnoleManager.LIZ();
        IAnoleManager iAnoleManager2 = this.LJIIJJI;
        if (iAnoleManager2 != null) {
            iAnoleManager2.LJIIJJI("tt_iab_loading_format");
        }
        IAnoleManager iAnoleManager3 = this.LJIIJJI;
        if (iAnoleManager3 != null) {
            iAnoleManager3.LJIIJJI(EnumC696280RSw.TT_PLAYABLE_LOADING_FORMAT.getSlotName());
        }
        this.LJIIJJI = null;
    }

    @Override // X.InterfaceC1007910cKr
    public final void LIZIZ(AbstractC991850bux abstractC991850bux, InterfaceC1007930cKt interfaceC1007930cKt) {
        if (this.LJIIIIZZ == 0 && this.LJIIIZ) {
            if (abstractC991850bux instanceof C991870buz) {
                LIZJ(null, true);
            } else {
                if (!(abstractC991850bux instanceof C991310bu5)) {
                    return;
                }
                LIZJ(((C991310bu5) abstractC991850bux).LIZ, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            X.0cYU r4 = r6.LJFF
            r3 = 0
            if (r4 == 0) goto L3e
            if (r8 == 0) goto Lad
            boolean r0 = r6.LJI
            java.lang.String r7 = "0"
            if (r0 != 0) goto L3b
            X.0d3y r0 = r6.LJ
            if (r0 == 0) goto Laa
            X.0cYU r0 = r0.getAdWebLoadingFormatModel()
            if (r0 == 0) goto Laa
            java.lang.Integer r2 = r0.landingFormatType
            if (r2 == 0) goto Laa
            int r1 = r2.intValue()
            r0 = 6
            if (r1 == r0) goto L3b
            int r1 = r2.intValue()
            r0 = 5
            if (r1 != r0) goto Laa
            X.0d3y r0 = r6.LJ
            if (r0 == 0) goto La8
            X.0cYU r0 = r0.getAdWebLoadingFormatModel()
            if (r0 == 0) goto La8
            java.lang.String r0 = r0.loadingFormatStatus
        L35:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r7)
            if (r0 == 0) goto Laa
        L3b:
            r4.setLoadingFormatStatus(r7)
        L3e:
            long r0 = java.lang.System.currentTimeMillis()
            r6.LJIIIIZZ = r0
            long r4 = r6.LJII
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L50
            long r4 = java.lang.System.currentTimeMillis()
        L50:
            r6.LJII = r4
            X.0cYU r2 = r6.LJFF
            if (r2 == 0) goto L60
            long r0 = r6.LJIIIIZZ
            long r0 = r0 - r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.setRenderingDuration(r0)
        L60:
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isShowSuccess "
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = " failReason "
            r2.append(r0)
            X.0cYU r0 = r6.LJFF
            if (r0 == 0) goto La6
            java.lang.String r0 = r0.loadingFormatStatus
        L77:
            r2.append(r0)
            java.lang.String r0 = " showTime "
            r2.append(r0)
            long r0 = r6.LJIIIIZZ
            r2.append(r0)
            java.lang.String r0 = " createTime "
            r2.append(r0)
            long r0 = r6.LJII
            r2.append(r0)
            java.lang.String r0 = " renderingDuration "
            r2.append(r0)
            long r4 = r6.LJIIIIZZ
            long r0 = r6.LJII
            long r4 = r4 - r0
            r2.append(r4)
            X.C2188811AlT.LIZIZ(r2)
            if (r8 != 0) goto La5
            java.lang.String r0 = "viewLoadFail"
            r6.LIZ(r3, r0)
        La5:
            return
        La6:
            r0 = r3
            goto L77
        La8:
            r0 = r3
            goto L35
        Laa:
            java.lang.String r7 = "1"
            goto L3b
        Lad:
            if (r7 != 0) goto L3b
            java.lang.String r7 = "unknown"
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1016330cYR.LIZJ(java.lang.String, boolean):void");
    }
}
