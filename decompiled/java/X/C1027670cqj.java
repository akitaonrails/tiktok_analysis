package X;

import android.app.Activity;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.dfid.AutoDFIDManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterAdapterService;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterModelTransform;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1027670cqj extends AbstractC1027770cqt {
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(357));
    public final String LLILZ = "openAdApp";

    @Override // X.AbstractC1027770cqt, X.InterfaceC1063710dmr
    public final String getName() {
        return this.LLILZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4 A[Catch: all -> 0x0198, TryCatch #1 {all -> 0x0198, blocks: (B:3:0x001c, B:5:0x0028, B:7:0x002c, B:9:0x0031, B:10:0x0035, B:12:0x004d, B:15:0x005d, B:17:0x0063, B:18:0x0067, B:20:0x0070, B:23:0x007d, B:25:0x0087, B:31:0x0092, B:32:0x009a, B:34:0x00a4, B:36:0x00ad, B:38:0x00bf, B:40:0x00c5, B:41:0x00c7, B:44:0x00d4, B:47:0x00db, B:49:0x00e9, B:52:0x00f2, B:63:0x0171, B:65:0x017f, B:66:0x0183, B:67:0x0194, B:62:0x016b, B:61:0x0165, B:54:0x00fd, B:56:0x0107, B:57:0x0110), top: B:74:0x001c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad A[Catch: all -> 0x0198, TryCatch #1 {all -> 0x0198, blocks: (B:3:0x001c, B:5:0x0028, B:7:0x002c, B:9:0x0031, B:10:0x0035, B:12:0x004d, B:15:0x005d, B:17:0x0063, B:18:0x0067, B:20:0x0070, B:23:0x007d, B:25:0x0087, B:31:0x0092, B:32:0x009a, B:34:0x00a4, B:36:0x00ad, B:38:0x00bf, B:40:0x00c5, B:41:0x00c7, B:44:0x00d4, B:47:0x00db, B:49:0x00e9, B:52:0x00f2, B:63:0x0171, B:65:0x017f, B:66:0x0183, B:67:0x0194, B:62:0x016b, B:61:0x0165, B:54:0x00fd, B:56:0x0107, B:57:0x0110), top: B:74:0x001c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016b A[Catch: all -> 0x0198, TryCatch #1 {all -> 0x0198, blocks: (B:3:0x001c, B:5:0x0028, B:7:0x002c, B:9:0x0031, B:10:0x0035, B:12:0x004d, B:15:0x005d, B:17:0x0063, B:18:0x0067, B:20:0x0070, B:23:0x007d, B:25:0x0087, B:31:0x0092, B:32:0x009a, B:34:0x00a4, B:36:0x00ad, B:38:0x00bf, B:40:0x00c5, B:41:0x00c7, B:44:0x00d4, B:47:0x00db, B:49:0x00e9, B:52:0x00f2, B:63:0x0171, B:65:0x017f, B:66:0x0183, B:67:0x0194, B:62:0x016b, B:61:0x0165, B:54:0x00fd, B:56:0x0107, B:57:0x0110), top: B:74:0x001c, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.InterfaceC1027790cqv r37, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r38) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1027670cqj.LIZJ(X.0cqv, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock):void");
    }

    public final boolean LJ(InterfaceC1027790cqv interfaceC1027790cqv, CompletionBlock<InterfaceC1027930cr9> completionBlock) {
        String containerID;
        C1051660dTQ c1051660dTQ;
        Context contextLIZ;
        Context contextLIZIZ;
        String aid;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        AwemeRawAd awemeRawAdLJJIJLIJ2;
        boolean z;
        BaseBundle baseBundle;
        Activity activityLIZJ;
        Activity activityLIZJ2;
        String refer = interfaceC1027790cqv.getRefer();
        if (Intrinsics.LJFF(refer, "landing_page")) {
            return false;
        }
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ != null) {
            c1051660dTQ = (C1051660dTQ) c1537480q70LIZIZ.LJFF(C1051660dTQ.class);
        } else {
            c1051660dTQ = null;
        }
        Aweme awemeZr = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).zr(C1027610cqd.LIZJ(c1051660dTQ));
        if (!((ICRouterAdapterService) ServiceManager.get().getService(ICRouterAdapterService.class)).LIZJ(LSPassThroughRecordSizeConfig.DEFAULT, awemeZr, C1027610cqd.LIZLLL(awemeZr))) {
            return false;
        }
        C1544050qHb c1544050qHb = C1544050qHb.LIZ;
        String jsbSecureDataflowId = interfaceC1027790cqv.getJsbSecureDataflowId();
        String str = this.LLILZ;
        c1544050qHb.getClass();
        C443120HZe c443120HZeLIZ = C1544050qHb.LIZ(jsbSecureDataflowId, str);
        Integer num = (Integer) c443120HZeLIZ.getSecond();
        String str2 = (String) c443120HZeLIZ.getThird();
        if (num != null) {
            num.intValue();
            if (c1051660dTQ == null || (contextLIZ = (Context) c1051660dTQ.LIZIZ(Context.class)) == null) {
                C844470XAv.LIZ.getClass();
                contextLIZ = C844470XAv.LIZ();
            }
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 == null || (contextLIZIZ = interfaceC634840OvC2.getContext()) == null || (((activityLIZJ = C0J3A.LIZJ(contextLIZIZ)) != null && activityLIZJ.isFinishing()) || ((activityLIZJ2 = C0J3A.LIZJ(contextLIZIZ)) != null && activityLIZJ2.isDestroyed()))) {
                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                contextLIZIZ = abstractC1387200mCcLIZIZ != null ? abstractC1387200mCcLIZIZ.LIZIZ() : null;
            }
            String strLJ = C1027610cqd.LJ(contextLIZIZ, awemeZr, interfaceC1027790cqv.getAdClickFrom(), interfaceC1027790cqv.getUrl());
            ICRouterManager iCRouterManager = (ICRouterManager) ServiceManager.get().getService(ICRouterManager.class);
            if (awemeZr == null || (aid = awemeZr.getAid()) == null) {
                aid = "";
            }
            if (awemeZr != null) {
                awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(awemeZr);
            } else {
                awemeRawAdLJJIJLIJ = null;
            }
            ICRouterModelTransform iCRouterModelTransform = (ICRouterModelTransform) this.LLILLL.getValue();
            if (awemeZr != null) {
                awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(awemeZr);
            } else {
                awemeRawAdLJJIJLIJ2 = null;
            }
            C1025880cnq c1025880cnq = new C1025880cnq(contextLIZ, aid, awemeZr, awemeRawAdLJJIJLIJ, iCRouterModelTransform.LIZ(awemeRawAdLJJIJLIJ2));
            C1026920cpW c1026920cpW = new C1026920cpW(strLJ, num.intValue(), Intrinsics.LJFF(interfaceC1027790cqv.isDeeplink(), 1), null);
            C1025520cnG c1025520cnG = new C1025520cnG(null, "all_jsb", null, refer, "draw_ad", LSPassThroughRecordSizeConfig.DEFAULT, refer, null, 901);
            AwS382S0200000_16 awS382S0200000_16 = new AwS382S0200000_16((CompletionBlock) completionBlock, (CompletionBlock<InterfaceC1027930cr9>) this, (C1027670cqj) 59);
            if (c1051660dTQ != null && (baseBundle = (BaseBundle) c1051660dTQ.LIZIZ(Bundle.class)) != null && baseBundle.getBoolean("not_open_by_profile_page")) {
                z = true;
            } else {
                z = false;
            }
            iCRouterManager.LIZJ(c1025880cnq, c1025520cnG, c1026920cpW, awS382S0200000_16, !z).LJI();
            return true;
        }
        C2382909Vj.LIZ(completionBlock, 0, str2, null, 4);
        return true;
    }

    public final void LIZLLL(CompletionBlock completionBlock, String str, String str2) {
        Context baseContext;
        Activity activityLJFF = C2214201BlK.LJFF();
        String containerID = null;
        boolean zLIZJ = false;
        if (activityLJFF != null && (baseContext = activityLJFF.getBaseContext()) != null) {
            C988570bpf.LIZ.getClass();
            if (C1041070dCL.LIZ() != null && C1028210crb.LJIJI(baseContext, str)) {
                C1029270ctJ c1029270ctJ = C1029270ctJ.LIZ;
                if (C1041070dCL.LIZ() != null) {
                    zLIZJ = C1025140cme.LIZJ(baseContext, UriProtector.parse(str));
                }
                c1029270ctJ.getClass();
                C1029270ctJ.LIZLLL(str2, str, zLIZJ);
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    containerID = interfaceC634840OvC.getContainerID();
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1027930cr9.class, containerID);
                ((InterfaceC1027930cr9) xBaseModelLIZJ).setCode(1);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                return;
            }
        }
        C2382909Vj.LIZ(completionBlock, 0, "can not open third app", null, 4);
    }

    @Override // X.AbstractC1549150qPp
    public final /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        AutoDFIDManager.LIZJ(new C839020Wvk[]{new C839020Wvk(1207964161, new int[]{11098, 11097, 11094, 11093, 11092, 11091, 11090, 11089, 11088, 11087, 11086, 11085})});
        try {
            LIZJ((InterfaceC1027790cqv) xBaseParamModel, completionBlock);
            AutoDFIDManager.LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AutoDFIDManager.LIZIZ();
            throw th;
        }
    }
}
