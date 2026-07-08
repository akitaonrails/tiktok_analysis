package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0cov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1026550cov implements InterfaceC1026740cpE {
    public final boolean LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(381));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(380));

    @Override // X.InterfaceC1026740cpE
    public final void LIZIZ(C1025880cnq c1025880cnq, C1025520cnG c1025520cnG) {
    }

    @Override // X.InterfaceC1026740cpE
    public final void LIZJ(C1026830cpN c1026830cpN, C1026670cp7 c1026670cp7) {
    }

    public final ICRouterAdapterDelegate LJ() {
        return (ICRouterAdapterDelegate) this.LIZJ.getValue();
    }

    public C1026550cov(boolean z) {
        this.LIZ = z;
    }

    @Override // X.InterfaceC1026740cpE
    public final void LIZLLL(C1026830cpN c1026830cpN) {
        C1026800cpK c1026800cpK;
        C1026780cpI c1026780cpI;
        String str;
        String creativeIdStr;
        String logExtra;
        String str2;
        String creativeIdStr2;
        C1025520cnG c1025520cnGLIZ;
        C1025520cnG c1025520cnGLIZ2;
        String str3 = c1026830cpN.LIZ;
        String logExtra2 = null;
        if (Intrinsics.LJFF(str3, "boc")) {
            AbstractC1026880cpS abstractC1026880cpS = c1026830cpN.LIZIZ;
            if ((abstractC1026880cpS instanceof C1026780cpI) && (c1026780cpI = (C1026780cpI) abstractC1026880cpS) != null) {
                C1025880cnq c1025880cnq = c1026780cpI.LIZ;
                String str4 = "";
                if (abstractC1026880cpS == null || (c1025520cnGLIZ2 = abstractC1026880cpS.LIZ()) == null || (str = c1025520cnGLIZ2.LJI) == null) {
                    str = "";
                }
                ICRouterAdapterDelegate iCRouterAdapterDelegateLJ = LJ();
                GMTBaseModel gMTBaseModel = c1025880cnq.LJ;
                if (gMTBaseModel == null || (creativeIdStr = gMTBaseModel.getCreativeIdStr()) == null) {
                    creativeIdStr = "";
                }
                GMTBaseModel gMTBaseModel2 = c1025880cnq.LJ;
                if (gMTBaseModel2 != null) {
                    logExtra = gMTBaseModel2.getLogExtra();
                } else {
                    logExtra = null;
                }
                AbstractC1026880cpS abstractC1026880cpS2 = c1026830cpN.LIZIZ;
                if (abstractC1026880cpS2 == null || (c1025520cnGLIZ = abstractC1026880cpS2.LIZ()) == null || (str2 = c1025520cnGLIZ.LIZLLL) == null) {
                    str2 = "";
                }
                iCRouterAdapterDelegateLJ.LJFF(creativeIdStr, logExtra, str2, c1026780cpI.LIZJ);
                ICRouterAdapterDelegate iCRouterAdapterDelegateLJ2 = LJ();
                GMTBaseModel gMTBaseModel3 = c1025880cnq.LJ;
                if (gMTBaseModel3 != null && (creativeIdStr2 = gMTBaseModel3.getCreativeIdStr()) != null) {
                    str4 = creativeIdStr2;
                }
                GMTBaseModel gMTBaseModel4 = c1025880cnq.LJ;
                if (gMTBaseModel4 != null) {
                    logExtra2 = gMTBaseModel4.getLogExtra();
                }
                iCRouterAdapterDelegateLJ2.LIZJ(str4, logExtra2, str, c1026780cpI.LIZJ);
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str3, "schema_link")) {
            return;
        }
        AbstractC1026880cpS abstractC1026880cpS3 = c1026830cpN.LIZIZ;
        if (!(abstractC1026880cpS3 instanceof C1026800cpK) || (c1026800cpK = (C1026800cpK) abstractC1026880cpS3) == null || !a0.LJJIIZI(c1026800cpK.LIZLLL, "__back_url__", false)) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ.plus(C23118094a.LIZ())), null, null, new C1026480coo(this, c1026800cpK, null), 3);
    }

    @Override // X.InterfaceC1026740cpE
    public final void LIZ(C1026830cpN c1026830cpN, C1026670cp7 c1026670cp7) {
        String str;
        Integer numValueOf;
        C1025520cnG c1025520cnGLIZ;
        C1025520cnG c1025520cnGLIZ2;
        C1025880cnq c1025880cnqLIZIZ;
        Context context;
        int i;
        C1025520cnG c1025520cnGLIZ3;
        String str2 = c1026830cpN.LIZ;
        int iHashCode = str2.hashCode();
        if (iHashCode != 97718) {
            if (iHashCode != 104010) {
                if (iHashCode != 3337239 || !str2.equals("lynx")) {
                    return;
                }
            } else if (!str2.equals("iab")) {
                return;
            }
            if (LJ().LJIIJJI(c1026830cpN.LIZIZ) || !c1026830cpN.LIZJ || !this.LIZ) {
                return;
            }
            AbstractC1026880cpS abstractC1026880cpS = c1026830cpN.LIZIZ;
            if (abstractC1026880cpS != null && (c1025880cnqLIZIZ = abstractC1026880cpS.LIZIZ()) != null && (context = c1025880cnqLIZIZ.LIZ) != null) {
                LJ().LJJIII();
                ICRouterMainDelegate iCRouterMainDelegate = (ICRouterMainDelegate) this.LIZIZ.getValue();
                ICRouterMainDelegate iCRouterMainDelegate2 = (ICRouterMainDelegate) this.LIZIZ.getValue();
                AbstractC1026880cpS abstractC1026880cpS2 = c1026830cpN.LIZIZ;
                if (abstractC1026880cpS2 != null && (c1025520cnGLIZ3 = abstractC1026880cpS2.LIZ()) != null) {
                    i = c1025520cnGLIZ3.LJFF;
                } else {
                    i = -1;
                }
                iCRouterMainDelegate.LJIIJJI(context, iCRouterMainDelegate2.LJ(i));
                return;
            }
            ICRouterAdapterDelegate iCRouterAdapterDelegateLJ = LJ();
            Pair[] pairArr = new Pair[4];
            AbstractC1026880cpS abstractC1026880cpS3 = c1026830cpN.LIZIZ;
            if (abstractC1026880cpS3 != null && (c1025520cnGLIZ2 = abstractC1026880cpS3.LIZ()) != null) {
                str = c1025520cnGLIZ2.LIZIZ;
            } else {
                str = null;
            }
            pairArr[0] = new Pair("router_scene", str);
            pairArr[1] = new Pair("router_type", c1026830cpN.LIZ);
            AbstractC1026880cpS abstractC1026880cpS4 = c1026830cpN.LIZIZ;
            if (abstractC1026880cpS4 != null && (c1025520cnGLIZ = abstractC1026880cpS4.LIZ()) != null) {
                numValueOf = Integer.valueOf(c1025520cnGLIZ.LJFF);
            } else {
                numValueOf = null;
            }
            pairArr[2] = new Pair("click_from", numValueOf);
            pairArr[3] = new Pair("context_classname", null);
            iCRouterAdapterDelegateLJ.LJIILLIIL("c_router_ad", "c_router_context_validation", "", null, C2097608Jq.LJIIIIZZ(pairArr));
            return;
        }
        if (!str2.equals("boc") || !c1026670cp7.LIZJ) {
            return;
        }
        LJ().LIZLLL();
    }
}
