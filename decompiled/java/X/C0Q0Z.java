package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.AbsOpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.search.appdiff.ISearchLynxAppDiff;
import defpackage.x;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q0Z, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q0Z extends C0Q0Y {
    @Override // X.C0Q0Y, X.InterfaceC663520Q0w
    public final void LIZIZ(x.b bVar) {
        InterfaceC634840OvC interfaceC634840OvC;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Activity activityLIZIZ;
        Activity activityLIZ;
        View view;
        Context context;
        String strLJIIIIZZ;
        Set<String> setKeySet;
        super.LIZIZ(bVar);
        String schema = bVar.getSchema();
        Bundle bundle = new Bundle();
        Map<String, Object> bundleParams = bVar.getBundleParams();
        bVar.getLogParams();
        ISearchLynxAppDiff.LIZ.getClass();
        C649730Pe7.LIZIZ.getValue().LIZ();
        if (bundleParams != null && (setKeySet = bundleParams.keySet()) != null) {
            for (String str : setKeySet) {
                Object obj = bundleParams.get(str);
                if (obj != null) {
                    if (Intrinsics.LJFF("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", str) && C2095008Iq.LJIIJJI(obj.toString()) != null) {
                        bundle.putInt(str, CastIntegerProtector.parseInt(obj.toString()));
                    } else {
                        C786410Ut5.LJJJI(str, obj.toString(), bundle);
                    }
                }
            }
        }
        View view2 = null;
        if (TextUtils.isEmpty(schema)) {
            CompletionBlock<x.c> completionBlock = this.LIZ;
            if (completionBlock != null) {
                C2382909Vj.LIZ(completionBlock, 0, "Empty Schema", null, 4);
                return;
            }
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.LIZIZ;
        if ((interfaceC634840OvC2 != null && (activityLIZ = interfaceC634840OvC2.LIZLLL()) != null) || (((interfaceC634840OvC = this.LIZIZ) != null && (view = interfaceC634840OvC.getView()) != null && (context = view.getContext()) != null && (activityLIZ = SAFExtensionKt.LJJIII(context)) != null) || ((abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null))) {
            Map<String, Object> extra = bVar.getExtra();
            if (extra != null) {
                String strValueOf = String.valueOf(extra.get("btm"));
                if (strValueOf.length() != 0) {
                    Object obj2 = extra.get("bcm");
                    if (obj2 != null) {
                        strLJIIIIZZ = C1741890vQh.LJIIIIZZ(obj2);
                    } else {
                        strLJIIIIZZ = null;
                    }
                    BtmSDK btmSDK = BtmSDK.INSTANCE;
                    C21244318Bt c21244318Bt = new C21244318Bt();
                    c21244318Bt.LIZ = strValueOf;
                    InterfaceC634840OvC interfaceC634840OvC3 = this.LIZIZ;
                    if (interfaceC634840OvC3 != null) {
                        view2 = interfaceC634840OvC3.getView();
                    }
                    c21244318Bt.LIZIZ = PageFinder.via(view2);
                    BcmParams.Companion.getClass();
                    c21244318Bt.LIZJ = C212367188v.LIZ(strLJIIIIZZ);
                    String strCreateJumpSourceBtmTokenForJSB = btmSDK.createJumpSourceBtmTokenForJSB(c21244318Bt);
                    if (strCreateJumpSourceBtmTokenForJSB != null && strCreateJumpSourceBtmTokenForJSB.length() != 0) {
                        Uri.Builder builderBuildUpon = UriProtector.parse(schema).buildUpon();
                        builderBuildUpon.appendQueryParameter("source_btm_token", strCreateJumpSourceBtmTokenForJSB);
                        schema = builderBuildUpon.build().toString();
                    }
                }
            }
            SmartRoute smartRoute = new SmartRoute(activityLIZ);
            smartRoute.withUrl(schema);
            smartRoute.withParam(bundle);
            smartRoute.withCallback(new AbsOpenResultCallback() { // from class: X.0Q0a
                @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
                public final void onSuccess(Intent intent) {
                    this.LIZ.LJ();
                }

                @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
                public final void onFail(String str2, String str3) {
                    C0Q0Z c0q0z = this.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("open url ");
                    if (str2 == null) {
                        str2 = "";
                    }
                    sbLIZ.append(str2);
                    sbLIZ.append(" with error: ");
                    if (str3 == null) {
                        str3 = "";
                    }
                    sbLIZ.append(str3);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    CompletionBlock<x.c> completionBlock2 = c0q0z.LIZ;
                    if (completionBlock2 != null) {
                        C2382909Vj.LIZ(completionBlock2, 0, strLIZIZ, null, 4);
                    }
                }
            });
            C0P90.LIZ.getClass();
            if (!bVar.getLogParams().isEmpty()) {
                smartRoute.withParam("log_params_hashmap", new HashMap(bVar.getLogParams()));
            }
            smartRoute.open();
            return;
        }
        CompletionBlock<x.c> completionBlock2 = this.LIZ;
        if (completionBlock2 != null) {
            C2382909Vj.LIZ(completionBlock2, 0, "Cannot get current Activity", null, 4);
        }
    }
}
