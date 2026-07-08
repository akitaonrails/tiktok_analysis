package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.MaskPopText;
import com.ss.android.ugc.aweme.feed.model.TextWithInlineLink;
import com.ss.android.ugc.tiktok.tuc.model.TUCActionData;
import com.ss.android.ugc.tiktok.tuc.platform.handler.MaskPopupWindowData;
import com.ss.android.ugc.tiktok.tuc.platform.handler.SchemaModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.101E, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public class C101E extends C101D {
    public static final C1239600iMY LIZ = new InterfaceC1239610iMZ() { // from class: X.0iMY
        @Override // X.InterfaceC1239610iMZ
        public final void LIZ(Context context, TUCActionData tUCActionData, C101B c101b) {
            Object c098200Yq;
            String str;
            try {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                String str2 = tUCActionData.extra;
                c1227904rF.getClass();
                c098200Yq = (SchemaModel) C1227904rF.LIZIZ(str2, SchemaModel.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            SchemaModel schemaModel = (SchemaModel) c098200Yq;
            if (schemaModel != null && (str = schemaModel.url) != null) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, str);
                Map<String, String> map = schemaModel.param;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        smartRouteBuildRoute.withParam(entry.getKey(), entry.getValue());
                    }
                }
                smartRouteBuildRoute.open();
            }
            c101b.invoke(Boolean.TRUE, null);
        }
    };
    public static final C1912710zsD LIZIZ = new InterfaceC1239610iMZ() { // from class: X.0zsD
        @Override // X.InterfaceC1239610iMZ
        public final void LIZ(Context context, TUCActionData tUCActionData, C101B c101b) {
            FragmentManager supportFragmentManager;
            Object c098200Yq;
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                try {
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    String str = tUCActionData.extra;
                    c1227904rF.getClass();
                    c098200Yq = (MaskPopupWindowData) C1227904rF.LIZIZ(str, MaskPopupWindowData.class);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                MaskPopupWindowData maskPopupWindowData = (MaskPopupWindowData) c098200Yq;
                if (maskPopupWindowData != null) {
                    ArrayList arrayList = new ArrayList();
                    List<MaskPopText> list = maskPopupWindowData.content;
                    if (list != null) {
                        for (MaskPopText maskPopText : list) {
                            TextWithInlineLink textWithInlineLink = maskPopText.linkText;
                            if (textWithInlineLink != null) {
                                arrayList.add(new C345890DhD(ComplianceServiceProvider.LJI().LJIL(context, textWithInlineLink), maskPopText.isListItem()));
                            }
                        }
                    }
                    C770750ULh c770750ULh = new C770750ULh();
                    String str2 = maskPopupWindowData.title;
                    if (str2 == null) {
                        str2 = "";
                    }
                    c770750ULh.LJ = str2;
                    c770750ULh.LJIILLIIL = true;
                    c770750ULh.LJI(context.getString(2131821883), AFwS271S0000000_28.get$arr$(277));
                    c770750ULh.LIZLLL(arrayList);
                    c770750ULh.LIZIZ().LIZ.show(supportFragmentManager, "tuc_base_popup");
                    String str3 = maskPopupWindowData.eventName;
                    if (str3 != null) {
                        C20684815ws.LJIILLIIL(str3, maskPopupWindowData.params);
                    }
                }
                c101b.invoke(Boolean.TRUE, null);
            }
        }
    };

    @Override // X.C101D
    public InterfaceC1239610iMZ LIZ(String str) {
        if (Intrinsics.LJFF(str, "navigation")) {
            return LIZ;
        }
        if (Intrinsics.LJFF(str, "popup")) {
            return LIZIZ;
        }
        return null;
    }
}
