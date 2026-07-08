package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.detail.jsb.JSBVideoDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS89S1000000_4;

/* JADX INFO: renamed from: X.0DOu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338500DOu extends C0DP4 {
    public final AbstractC1604130rqV LLILLL;

    public C338500DOu() {
        C01GW<AbstractC1604130rqV> c01gw = C165H.LJ;
        this.LLILLL = C165H.LJ.getValue();
    }

    public final void LIZLLL(CompletionBlock completionBlock, Throwable th) {
        AbstractC1604130rqV abstractC1604130rqV = this.LLILLL;
        String name = getName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("idl handle: exception ");
        sbLIZ.append(th);
        abstractC1604130rqV.LJFF(name, C2188811AlT.LIZIZ(sbLIZ));
        String message = th.getMessage();
        if (message == null) {
            message = "unknown";
        }
        C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
    }

    public static JSBVideoDetailShareVM LIZJ(Fragment fragment, C19EG c19eg, String str) {
        C19EG c19eg2;
        if (fragment != null) {
            AwS89S1000000_4 awS89S1000000_4 = new AwS89S1000000_4(str, 2);
            C736950SvV c736950SvV = new C736950SvV(C13LE.LIZ(JSBVideoDetailShareVM.class), awS89S1000000_4, new C452070Ho5(), C724750Sbp.LJII(fragment), C1220000hqw.LIZ(fragment), AFwS232S0000000_4.get$arr$(256), new C451460Hn6(fragment, false), new C451620HnM(fragment, true), new C338520DOw(fragment));
            Context context = fragment.getContext();
            if (context != null) {
                ((JSBVideoDetailShareVM) c736950SvV.getValue()).CQ2(context);
            }
            ((JSBVideoDetailShareVM) c736950SvV.getValue()).LLILZLL = str;
            return (JSBVideoDetailShareVM) c736950SvV.getValue();
        }
        AwS89S1000000_4 awS89S1000000_42 = new AwS89S1000000_4(str, 3);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(JSBVideoDetailShareVM.class);
        AFwS232S0000000_4 aFwS232S0000000_4 = AFwS232S0000000_4.get$arr$(257);
        C0I27 c0i27 = new C0I27(c19eg);
        C0I28 c0i28 = new C0I28(c19eg);
        C338530DOx c338530DOx = new C338530DOx(c19eg);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(c19eg);
        if (c19eg instanceof HasDefaultViewModelProviderFactory) {
            c19eg2 = c19eg;
        } else {
            c19eg2 = null;
        }
        C736950SvV c736950SvV2 = new C736950SvV(c19719912DlLIZ, awS89S1000000_42, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(c19eg2), aFwS232S0000000_4, c0i27, c0i28, c338530DOx);
        ((JSBVideoDetailShareVM) c736950SvV2.getValue()).CQ2(c19eg);
        ((JSBVideoDetailShareVM) c736950SvV2.getValue()).LLILZLL = str;
        return (JSBVideoDetailShareVM) c736950SvV2.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[PHI: r6
      0x0020: PHI (r6v1 androidx.lifecycle.LifecycleOwner) = (r6v0 androidx.lifecycle.LifecycleOwner), (r6v6 androidx.lifecycle.LifecycleOwner) binds: [B:10:0x0019, B:12:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r10, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r11, X.EnumC1063300dmC r12) {
        /*
            r9 = this;
            r4 = r10
            X.0DP5 r4 = (X.C0DP5) r4
            r3 = r9
            X.0OvC r0 = r3.IBridgeSdkContext
            r6 = 0
            if (r0 == 0) goto L30
            android.app.Activity r5 = r0.LIZLLL()
        Ld:
            boolean r0 = r5 instanceof X.C19EG
            if (r0 == 0) goto L2f
            X.19EG r5 = (X.C19EG) r5
            if (r5 == 0) goto L2f
            X.198i r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIILLIIL(r5)
            if (r1 == 0) goto L20
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r6 = r1
            if (r1 != 0) goto L21
        L20:
            r1 = r5
        L21:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.0Cng r2 = new X.0Cng
            r8 = 0
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.C948503nH.LJ(r1, r0, r2)
        L2f:
            return
        L30:
            r5 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C338500DOu.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }

    public final void LJ(List<? extends Aweme> list, JSBVideoDetailShareVM jSBVideoDetailShareVM, C0DP5 c0dp5, CompletionBlock<InterfaceC338540DOy> completionBlock, int i) {
        boolean z;
        boolean z2;
        AbstractC1604130rqV abstractC1604130rqV = this.LLILLL;
        String name = getName();
        StringBuilder sb = new StringBuilder("idl handle: result ");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends Aweme> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getAid());
        }
        sb.append(arrayList);
        abstractC1604130rqV.LJFF(name, sb.toString());
        String containerID = null;
        if ((!list.isEmpty()) && jSBVideoDetailShareVM != null) {
            if (c0dp5.getHasMore().intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (i == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            for (Aweme aweme : list) {
                IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
                if (iAwemeService != null) {
                    iAwemeService.LLILLL(aweme);
                }
            }
            if (jSBVideoDetailShareVM.LLILZIL == null && !jSBVideoDetailShareVM.isDataEmpty()) {
                C948503nH.LJI(jSBVideoDetailShareVM, C23271099x.INSTANCE, new C326450Cqx(jSBVideoDetailShareVM, list, z, z2, null));
            } else if (jSBVideoDetailShareVM.LLILZIL == null && ((Boolean) C0AAL.LIZ.getValue()).booleanValue()) {
                C948503nH.LJI(jSBVideoDetailShareVM, C23271099x.INSTANCE, new C326440Cqw(jSBVideoDetailShareVM, list, z, null));
            } else {
                C099F c099f = jSBVideoDetailShareVM.LLILZIL;
                if (c099f != null) {
                    c099f.LJJLIIIJILLIZJL(new C326480Cr0(list, z));
                }
            }
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC338540DOy.class, containerID), "");
    }
}
