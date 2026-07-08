package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import java.util.Map;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mT8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397440mT8 extends AbstractC1066890drz {
    public static InterfaceC1397450mT9 LJJIJIIJI() {
        IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
        if (iAiChatFeatureService != null) {
            return iAiChatFeatureService.LIZJ();
        }
        return null;
    }

    public final FragmentManager LJJIJIIJIL() {
        C19EG c19eg;
        FragmentManager childFragmentManager;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        Fragment fragmentLJ = interfaceC1392640mLO.LJ();
        if (fragmentLJ != null && (childFragmentManager = fragmentLJ.getChildFragmentManager()) != null) {
            return childFragmentManager;
        }
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
        if (interfaceC1392640mLO2 == null) {
            interfaceC1392640mLO2 = null;
        }
        Activity activityLIZIZ = interfaceC1392640mLO2.LIZIZ();
        if (!(activityLIZIZ instanceof C19EG) || (c19eg = (C19EG) activityLIZIZ) == null) {
            return null;
        }
        return c19eg.getSupportFragmentManager();
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1397440mT8();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.AI_IMAGINE_ANCHOR_TYPE.getTYPE();
    }

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        String extra;
        InterfaceC1397450mT9 interfaceC1397450mT9LJJIJIIJI = LJJIJIIJI();
        if (interfaceC1397450mT9LJJIJIIJI == null) {
            return null;
        }
        String aid = LJIIZILJ().getAid();
        String str = "";
        if (aid == null) {
            aid = "";
        }
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null && (extra = anchorCommonStruct.getExtra()) != null) {
            str = extra;
        }
        Map<String, String> mapLJ = interfaceC1397450mT9LJJIJIIJI.LJ(aid, str);
        if (mapLJ != null) {
            return new C1400390mXt(new AwS565S0100000_21(mapLJ, (Map<String, String>) 1270), new AwS565S0100000_21(mapLJ, (Map<String, String>) 1271), null, null, null, 28);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r0.forbidAnchor() != true) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        return super.LJJJJLL(r9);
     */
    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC1050190dR3 LJJJJLL(java.util.List<com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct> r9) {
        /*
            r8 = this;
            X.0mT9 r0 = LJJIJIIJI()
            r1 = 1
            if (r0 == 0) goto L62
            boolean r0 = r0.LIZIZ()
            if (r0 != r1) goto L62
            java.util.Iterator r3 = r9.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r0
            int r2 = r0.getType()
            X.0nKG r0 = X.EnumC1430380nKG.AI_LIVE_PHOTO_ANCHOR_TYPE
            int r0 = r0.getTYPE()
            if (r2 != r0) goto L11
            java.lang.Class<com.ss.android.ugc.aweme.services.IExternalService> r2 = com.ss.android.ugc.aweme.services.IExternalService.class
            r3 = 0
            r6 = 14
            r7 = 0
            r4 = r3
            r5 = r3
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.ss.android.ugc.aweme.services.IExternalService) r0
            if (r0 == 0) goto L5d
            com.ss.android.ugc.aweme.services.external.IAILiveService r0 = r0.getAILiveService()
            if (r0 == 0) goto L5d
            boolean r0 = r0.isAILiveEnable()
            if (r0 != r1) goto L5d
            java.lang.Class<com.ss.android.ugc.aweme.services.IExternalService> r2 = com.ss.android.ugc.aweme.services.IExternalService.class
            r4 = r3
            r5 = r3
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.ss.android.ugc.aweme.services.IExternalService) r0
            if (r0 == 0) goto L62
            com.ss.android.ugc.aweme.services.external.IAILiveService r0 = r0.getAILiveService()
            if (r0 == 0) goto L62
            boolean r0 = r0.forbidAnchor()
            if (r0 != r1) goto L62
        L5d:
            X.0dR3 r0 = super.LJJJJLL(r9)
            return r0
        L62:
            X.0mTA r0 = new X.0mTA
            r0.<init>(r8)
            X.C19719612Di.LJJIIJ(r9, r0, r1)
            X.0dR3 r0 = X.EnumC1050190dR3.NOT_FOUND
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1397440mT8.LJJJJLL(java.util.List):X.0dR3");
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        InterfaceC1397450mT9 interfaceC1397450mT9LJJIJIIJI;
        String extra;
        boolean z;
        FragmentManager fragmentManagerLJJIJIIJIL = LJJIJIIJIL();
        if (fragmentManagerLJJIJIIJIL != null && (interfaceC1397450mT9LJJIJIIJI = LJJIJIIJI()) != null) {
            InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
            InterfaceC1392640mLO interfaceC1392640mLO2 = null;
            if (interfaceC1392640mLO == null) {
                interfaceC1392640mLO = null;
            }
            String strCf = interfaceC1392640mLO.Cf();
            String aid = LJIIZILJ().getAid();
            if (aid == null) {
                aid = "";
            }
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            if (anchorCommonStruct == null || (extra = anchorCommonStruct.getExtra()) == null) {
                extra = "";
            }
            String[] strArr = {"story_immersive_anchor", "story_friends_feed_anchor"};
            InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
            if (interfaceC1392640mLO3 != null) {
                interfaceC1392640mLO2 = interfaceC1392640mLO3;
            }
            if (C13LQ.LJJIJIIJI(interfaceC1392640mLO2.LJI(), strArr) >= 0) {
                z = true;
            } else {
                z = false;
            }
            interfaceC1397450mT9LJJIJIIJI.LJIIJ(strCf, fragmentManagerLJJIJIIJIL, aid, extra, z);
        }
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJLIIIJ(C712520RxC c712520RxC, String str, boolean z) {
        C19FO c19fo;
        LifecycleCoroutineScope lifecycleScope;
        InterfaceC1397450mT9 interfaceC1397450mT9LJJIJIIJI = LJJIJIIJI();
        if (interfaceC1397450mT9LJJIJIIJI != null && interfaceC1397450mT9LJJIJIIJI.LIZIZ()) {
            Activity activityLJIILJJIL = LJIILJJIL();
            if ((activityLJIILJJIL instanceof C19EG) && (c19fo = (C19FO) activityLJIILJJIL) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19fo)) != null) {
                C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C1066380drA(this, null), 2);
            }
            InterfaceC1397450mT9 interfaceC1397450mT9LJJIJIIJI2 = LJJIJIIJI();
            if (interfaceC1397450mT9LJJIJIIJI2 != null) {
                interfaceC1397450mT9LJJIJIIJI2.LJIIIIZZ();
            }
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        String keyword;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        String strLJII = null;
        if (anchorCommonStruct == null) {
            return null;
        }
        C1397480mTC c1397480mTCLIZ = C1397470mTB.LIZ(viewGroup.getContext());
        InterfaceC1397450mT9 interfaceC1397450mT9LJJIJIIJI = LJJIJIIJI();
        String str = "";
        if (interfaceC1397450mT9LJJIJIIJI != null) {
            String aid = LJIIZILJ().getAid();
            if (aid == null) {
                aid = "";
            }
            strLJII = interfaceC1397450mT9LJJIJIIJI.LJII(aid, anchorCommonStruct.getExtra());
        }
        c1397480mTCLIZ.LIZLLL(strLJII);
        c1397480mTCLIZ.setSubTitle(anchorCommonStruct.getDescription());
        InterfaceC1397450mT9 interfaceC1397450mT9LJJIJIIJI2 = LJJIJIIJI();
        if ((interfaceC1397450mT9LJJIJIIJI2 != null && (keyword = interfaceC1397450mT9LJJIJIIJI2.LJFF()) != null) || (keyword = anchorCommonStruct.getKeyword()) != null) {
            str = keyword;
        }
        c1397480mTCLIZ.setTitle(str);
        C786410Ut5.I7(new C1401860maG(this, c2344009Gk, 4), c1397480mTCLIZ);
        c1397480mTCLIZ.setButtonIcon(C1392810mLf.LIZIZ(anchorCommonStruct));
        c1397480mTCLIZ.LIZIZ(true);
        c1397480mTCLIZ.setButtonOnClickListener(new AwS387S0200000_21(this, c1397480mTCLIZ, 56));
        viewGroup.addView(c1397480mTCLIZ);
        return c1397480mTCLIZ;
    }
}
