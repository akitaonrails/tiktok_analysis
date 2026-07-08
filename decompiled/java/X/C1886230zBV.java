package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdkapi.host.ILiveHostSandbox;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zBV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1886230zBV extends AbstractC1886210zBT {
    public static final void LIZLLL(CompletionBlock<InterfaceC1886250zBX> completionBlock) {
        InterfaceC1886250zBX interfaceC1886250zBX = (InterfaceC1886250zBX) C1909107dp.LIZJ(InterfaceC1886250zBX.class, null);
        InterfaceC1886240zBW interfaceC1886240zBW = (InterfaceC1886240zBW) C1909107dp.LIZJ(InterfaceC1886240zBW.class, null);
        interfaceC1886240zBW.setErrorCode(0);
        interfaceC1886240zBW.setError("");
        interfaceC1886240zBW.setErrorDescription("");
        interfaceC1886250zBX.setResponse(interfaceC1886240zBW);
        completionBlock.onSuccess(interfaceC1886250zBX, "");
    }

    public static void LIZJ(CompletionBlock completionBlock, EnumC993660bxs enumC993660bxs) {
        InterfaceC1886250zBX interfaceC1886250zBX = (InterfaceC1886250zBX) C1909107dp.LIZJ(InterfaceC1886250zBX.class, null);
        InterfaceC1886240zBW interfaceC1886240zBW = (InterfaceC1886240zBW) C1909107dp.LIZJ(InterfaceC1886240zBW.class, null);
        interfaceC1886240zBW.setErrorCode(Integer.valueOf(enumC993660bxs.getErrorCode()));
        interfaceC1886240zBW.setErrorDescription(enumC993660bxs.getErrorMessage());
        interfaceC1886240zBW.setError(enumC993660bxs.name());
        interfaceC1886250zBX.setResponse(interfaceC1886240zBW);
        completionBlock.onFailure(0, enumC993660bxs.getErrorMessage(), interfaceC1886250zBX);
    }

    public final void LJ(Context context, CompletionBlock completionBlock, String str) {
        Object c098200Yq;
        if (str != null && str.length() != 0) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(UriProtector.parse(str));
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf/N/ILzSAUv4UmvRvfF6qbZrPV/QrE8H7TrGJR7dsdsv+JacpeJ98SADVikQXEMdv", null));
                LIZLLL(completionBlock);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                LIZJ(completionBlock, EnumC993660bxs.UNKNOWN_JUMP_TYPE);
            }
            C189200o6.m1boximpl(c098200Yq);
            return;
        }
        LIZJ(completionBlock, EnumC993660bxs.URL_EMPTY);
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        boolean z;
        int i;
        InterfaceC1886220zBU interfaceC1886220zBU = (InterfaceC1886220zBU) xBaseParamModel;
        String packageName = interfaceC1886220zBU.getPackageName();
        Number jumpType = interfaceC1886220zBU.getJumpType();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            if (Intrinsics.LJFF(jumpType, Integer.valueOf(EnumC993670bxt.TYPE_WEB_URL.getValue()))) {
                LJ(context, completionBlock, interfaceC1886220zBU.getUrl());
                return;
            }
            String deeplink = interfaceC1886220zBU.getDeeplink();
            C1886260zBY c1886260zBY = new C1886260zBY(deeplink, interfaceC1886220zBU.getAppID(), interfaceC1886220zBU.getRoomID(), interfaceC1886220zBU.getTaskID(), interfaceC1886220zBU.getAnchorID(), interfaceC1886220zBU.getGameID(), interfaceC1886220zBU.getGameName(), packageName);
            if (deeplink != null && deeplink.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(UriProtector.parse(deeplink));
                ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intent, 1207968513);
                try {
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, context);
                    C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf/N/ILzSHTvIPh/96NzeiT7s8AAVV/F09tWBMdIJOqQo=", null));
                    i = 1;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJ("DownloadPartneringGameMethod", e.getMessage());
                    i = 0;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gp_open_deeplink");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(c1886260zBY.LIZ, "deeplink_url");
                c474500IjALIZ.LJJII(c1886260zBY.LIZIZ, "app_id");
                c474500IjALIZ.LJJII(c1886260zBY.LIZJ, "room_id");
                c474500IjALIZ.LJJII(c1886260zBY.LIZLLL, "task_id");
                c474500IjALIZ.LJJII(c1886260zBY.LJ, "anchor_id");
                c474500IjALIZ.LJJII(c1886260zBY.LJFF, "game_id");
                c474500IjALIZ.LJJII(c1886260zBY.LJI, "game_name");
                c474500IjALIZ.LJJII(c1886260zBY.LJII, "package_name");
                c474500IjALIZ.LJJII(Integer.valueOf(i), "success");
                c474500IjALIZ.LIZ();
                if (i != 0) {
                    LIZLLL(completionBlock);
                    return;
                }
            }
            if (Intrinsics.LJFF(jumpType, Integer.valueOf(EnumC993670bxt.TYPE_DEEPLINK_FALLBACK_STORE.getValue()))) {
                IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
                if (iGamePartnershipService != null && iGamePartnershipService.Je0() != null) {
                    if (packageName == null) {
                        packageName = "";
                    }
                    if (C843920X8s.LJII(context, packageName, "")) {
                        LIZLLL(completionBlock);
                        return;
                    }
                }
                LIZJ(completionBlock, EnumC993660bxs.NO_GOOGLE_PLAY_STORE_INSTALLED);
                return;
            }
            if (Intrinsics.LJFF(jumpType, Integer.valueOf(EnumC993670bxt.TYPE_DEEPLINK_FALLBACK_WEB.getValue()))) {
                LJ(context, completionBlock, interfaceC1886220zBU.getUrl());
                LIZLLL(completionBlock);
            } else if (Intrinsics.LJFF(jumpType, Integer.valueOf(EnumC993670bxt.TYPE_BROWSER_WEB.getValue()))) {
                LJ(context, completionBlock, interfaceC1886220zBU.getUrl());
                LIZLLL(completionBlock);
            } else {
                LIZJ(completionBlock, EnumC993660bxs.UNKNOWN_JUMP_TYPE);
            }
        }
    }
}
