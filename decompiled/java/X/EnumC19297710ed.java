package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.popup.FeedPopupService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10ed, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class EnumC19297710ed implements InterfaceC19297910ef {
    public static final EnumC19297710ed DEBUG_FETCH_INIT;
    public static final EnumC19297710ed IN_APP_PUSH_INIT;
    public static final /* synthetic */ EnumC19297710ed[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19297710ed POPUP_FETCH_INIT;

    public EnumC19297710ed() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC19297710ed> getEntries() {
        return LLILLJJLI;
    }

    public abstract /* synthetic */ AbstractC637050Oyl initFetchCallBack();

    static {
        EnumC19297710ed enumC19297710ed = new EnumC19297710ed() { // from class: X.10ec
            @Override // X.EnumC19297710ed, X.InterfaceC19297910ef
            public final AbstractC637050Oyl initFetchCallBack() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("An operation is not implemented: ");
                sbLIZ.append("Not yet implemented");
                throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        DEBUG_FETCH_INIT = enumC19297710ed;
        EnumC19297710ed enumC19297710ed2 = new EnumC19297710ed() { // from class: X.10ee
            @Override // X.EnumC19297710ed, X.InterfaceC19297910ef
            public final AbstractC637050Oyl initFetchCallBack() {
                FeedPopupService feedPopupService = (FeedPopupService) PluggableExtentionKt.pluggableSpi$default(FeedPopupService.class, false, false, false, 14, null);
                if (feedPopupService != null) {
                    return feedPopupService.LIZLLL();
                }
                return null;
            }
        };
        POPUP_FETCH_INIT = enumC19297710ed2;
        EnumC19297710ed enumC19297710ed3 = new EnumC19297710ed() { // from class: X.10eb
            @Override // X.EnumC19297710ed, X.InterfaceC19297910ef
            public final AbstractC637050Oyl initFetchCallBack() {
                return new AbstractC637050Oyl() { // from class: X.10ea
                    @Override // X.AbstractC637050Oyl
                    public final void LIZ(C20554115bn c20554115bn, String str, n nVar, Map<String, Object> map) {
                        InnerPushMessage innerPushMessage;
                        InnerPushUITemplate uiTemplate;
                        InnerPushConfig config;
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("in-app push receive info ");
                        sbLIZ.append(nVar);
                        C1720106oR.LJI("OutreachSignalRegistryConfig", C2188811AlT.LIZIZ(sbLIZ));
                        n nVarLJJIJ = nVar.LJJIJ("dynamic_inapp_push_info");
                        if (nVarLJJIJ == null) {
                            C1720106oR.LJI("OutreachSignalRegistryConfig", "return by missing key dynamic_inner_push_info");
                            return;
                        }
                        Map mapLJ = null;
                        try {
                            innerPushMessage = (InnerPushMessage) new Gson().LIZJ(nVarLJJIJ, InnerPushMessage.class);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            innerPushMessage = null;
                        }
                        if (innerPushMessage == null) {
                            uiTemplate = null;
                            config = null;
                        } else {
                            uiTemplate = innerPushMessage.getUiTemplate();
                            config = innerPushMessage.getConfig();
                        }
                        if (uiTemplate != null && config != null) {
                            String mobEventJsonStr = innerPushMessage.getMobEventJsonStr();
                            if (mobEventJsonStr != null) {
                                try {
                                    mapLJ = (Map) new Gson().LJIIIIZZ(mobEventJsonStr, Map.class);
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    int i2 = C2187451AjH.LIZ;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("parse mob string error ");
                                    sbLIZ2.append(mobEventJsonStr);
                                    C1720106oR.LJI("OutreachSignalRegistryConfig", C2188811AlT.LIZIZ(sbLIZ2));
                                    mapLJ = C2097608Jq.LJ();
                                }
                            }
                            int type = innerPushMessage.getType();
                            String label = innerPushMessage.getLabel();
                            if (label == null) {
                                label = "";
                            }
                            new C19323510in(type, label, config, uiTemplate, mapLJ, innerPushMessage.getExtrasMap(), 268).LIZIZ();
                            return;
                        }
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("return by ui or config is null ");
                        sbLIZ3.append(uiTemplate);
                        sbLIZ3.append(", ");
                        sbLIZ3.append(config);
                        C1720106oR.LJI("OutreachSignalRegistryConfig", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                };
            }
        };
        IN_APP_PUSH_INIT = enumC19297710ed3;
        EnumC19297710ed[] enumC19297710edArr = {enumC19297710ed, enumC19297710ed2, enumC19297710ed3};
        LL = enumC19297710edArr;
        LLILLJJLI = new C2254308sP(enumC19297710edArr);
    }

    public static EnumC19297710ed[] values() {
        return (EnumC19297710ed[]) LL.clone();
    }

    public static EnumC19297710ed valueOf(String str) {
        return (EnumC19297710ed) C08FF.LIZ(EnumC19297710ed.class, str);
    }

    public EnumC19297710ed(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
