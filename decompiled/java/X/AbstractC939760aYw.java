package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSupportNewLayoutInFeedSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLayoutMaskReuseOptimize;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aYw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC939760aYw {
    public static final /* synthetic */ int LL = 0;

    public void D2(long j, String str) {
    }

    public void LIZ() {
    }

    public void LIZJ() {
    }

    public abstract Pair<String, Map<EnumC939920aZC, List<EnumC939900aZA>>> LIZLLL(C957020b0m c957020b0m);

    public abstract C938220aWS LJI();

    public abstract DataChannel LJII();

    public abstract String LJIIIIZZ();

    public abstract FrameLayout LJIIIZ();

    public void LJIIJJI() {
    }

    public void LJIIL(C957020b0m c957020b0m) {
    }

    public void LJIILIIL() {
    }

    public void LJIILJJIL() {
    }

    public boolean LJIILL() {
        return true;
    }

    public void LJIILLIIL(EnumC934000aPe enumC934000aPe) {
    }

    public C939730aYt LJIIZILJ(C939730aYt c939730aYt, C957020b0m c957020b0m) {
        return c939730aYt;
    }

    public final void LJIIJ(C957020b0m c957020b0m) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (LJIILL() && c957020b0m.getPosIdentity() != null) {
            LJIIL(c957020b0m);
            Iterator<View> it2 = new C09RD(c957020b0m).iterator();
            FrameLayout frameLayoutLJIIIZ = LJIIIZ();
            if (frameLayoutLJIIIZ == null) {
                return;
            }
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (!c09re.hasNext()) {
                    break;
                }
                View view = (View) c09re.next();
                if (view instanceof C939730aYt) {
                    C939730aYt c939730aYtLJIIZILJ = LJIIZILJ((C939730aYt) view, c957020b0m);
                    if (c939730aYtLJIIZILJ != null && MultiGuestLayoutMaskReuseOptimize.INSTANCE.enable()) {
                        String strLJIIIIZZ = LJIIIIZZ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("addMaskIfNeeded update mask window.identity=");
                        sbLIZ.append(c957020b0m.getIdentity());
                        C937310aUz.LJII(strLJIIIIZZ, C2188811AlT.LIZIZ(sbLIZ));
                        Pair<String, Map<EnumC939920aZC, List<EnumC939900aZA>>> pairLIZLLL = LIZLLL(c957020b0m);
                        if (pairLIZLLL != null) {
                            c939730aYtLJIIZILJ.B0(c957020b0m, pairLIZLLL);
                            ViewParent parent = c939730aYtLJIIZILJ.getParent();
                            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                                C786410Ut5.LJJJLZIJ(c939730aYtLJIIZILJ, viewGroup2);
                            }
                            c957020b0m.addView(c939730aYtLJIIZILJ);
                            return;
                        }
                        ViewParent parent2 = c939730aYtLJIIZILJ.getParent();
                        if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
                            C786410Ut5.LJJJLZIJ(c939730aYtLJIIZILJ, viewGroup);
                        }
                        c957020b0m.addView(c939730aYtLJIIZILJ);
                        return;
                    }
                }
            }
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c957020b0m, null);
            c957020b0m.removeAllViews();
            String strLJIIIIZZ2 = LJIIIIZZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("addMaskIfNeeded new mask window.identity=");
            sbLIZ2.append(c957020b0m.getIdentity());
            C937310aUz.LJII(strLJIIIIZZ2, C2188811AlT.LIZIZ(sbLIZ2));
            Pair<String, Map<EnumC939920aZC, List<EnumC939900aZA>>> pairLIZLLL2 = LIZLLL(c957020b0m);
            if (pairLIZLLL2 == null) {
                return;
            }
            c957020b0m.addView(LIZIZ(c957020b0m, frameLayoutLJIIIZ, pairLIZLLL2));
        }
    }

    public final void LJIJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGuestShowdownBoardElement source:");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiGuestLayoutRender", C2188811AlT.LIZIZ(sbLIZ));
        List<C957020b0m> listLJIIIZ = C940770aaZ.LIZ().getDataSource().LJIIIZ();
        ArrayList arrayList = new ArrayList();
        for (C957020b0m c957020b0m : listLJIIIZ) {
            PosIdentity posIdentity = c957020b0m.getPosIdentity();
            if (posIdentity != null && posIdentity.type == 2) {
                arrayList.add(c957020b0m);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LJIIJ((C957020b0m) it2.next());
        }
    }

    public C939730aYt LIZIZ(C957020b0m c957020b0m, FrameLayout frameLayout, Pair<String, ? extends Map<EnumC939920aZC, ? extends List<? extends EnumC939900aZA>>> pair) {
        Context context;
        FrameLayout frameLayoutLJIIIZ = LJIIIZ();
        if (frameLayoutLJIIIZ != null && (context = frameLayoutLJIIIZ.getContext()) != null) {
            if (LinkMicSupportNewLayoutInFeedSetting.INSTANCE.getValue() || (this instanceof C940020aZM)) {
                context = C1834150xpV.LJIIJJI(context);
            }
            DataChannel dataChannelLJII = LJII();
            if (dataChannelLJII == null) {
                return null;
            }
            return new C939730aYt(context, dataChannelLJII, new WeakReference(LJI()), c957020b0m, frameLayout, pair, C940770aaZ.LIZ().getDataSource(), null, false);
        }
        C766270U4b.LJIIJJI("createLayoutBizView return as context is null");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0020, code lost:
    
        if (r1 != 3) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LJ(X.AbstractC939760aYw r5, X.C957020b0m r6, java.lang.Boolean r7, java.lang.Integer r8, int r9) {
        /*
            r0 = r9 & 2
            r4 = 0
            if (r0 == 0) goto L6
            r7 = r4
        L6:
            r0 = r9 & 4
            if (r0 == 0) goto Lb
            r8 = r4
        Lb:
            r5.getClass()
            tikcast.linkmic.common.PosIdentity r3 = r6.getPosIdentity()
            if (r3 == 0) goto L22
            int r1 = r3.type
            r2 = 0
            if (r1 == 0) goto L4a
            r0 = 1
            if (r1 == r0) goto L36
            r0 = 2
            if (r1 == r0) goto L23
            r0 = 3
            if (r1 == r0) goto L36
        L22:
            return r4
        L23:
            X.0IMi r0 = X.C939890aZ9.LIZ
            java.lang.String r2 = r6.getIdentity()
            X.0aZD r1 = X.EnumC939930aZD.CONTENT
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            kotlin.Pair r4 = X.C939890aZ9.LIZLLL(r2, r1, r3, r0, r8)
            return r4
        L36:
            boolean r0 = r6.LLJIJIL
            if (r0 == 0) goto L47
            X.0aZD r1 = X.EnumC939930aZD.ANCHOR
        L3c:
            X.0IMi r0 = X.C939890aZ9.LIZ
            java.lang.String r0 = r6.getIdentity()
            kotlin.Pair r4 = X.C939890aZ9.LIZLLL(r0, r1, r3, r2, r8)
            return r4
        L47:
            X.0aZD r1 = X.EnumC939930aZD.GUEST
            goto L3c
        L4a:
            X.0IMi r0 = X.C939890aZ9.LIZ
            java.lang.String r1 = r6.getIdentity()
            X.0aZD r0 = X.EnumC939930aZD.NO_GUEST
            kotlin.Pair r4 = X.C939890aZ9.LIZLLL(r1, r0, r3, r2, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC939760aYw.LJ(X.0aYw, X.0b0m, java.lang.Boolean, java.lang.Integer, int):kotlin.Pair");
    }
}
