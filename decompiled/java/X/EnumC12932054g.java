package X;

import com.ss.android.ugc.aweme.feed.popup.FeedPopupService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.awemepushapi.IPushOutReachApi;
import com.ss.android.ugc.awemepushlib.interaction.PushOutReachService;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.054g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC12932054g implements InterfaceC12945054t {
    public static final /* synthetic */ EnumC12932054g[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC12932054g NORMAL_PENDANT_INIT;
    public static final EnumC12932054g OUT_APP_PUSH_INIT;
    public static final EnumC12932054g POPUP_TRIGGER_INIT;

    public EnumC12932054g() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC12932054g> getEntries() {
        return LLILLJJLI;
    }

    public abstract /* synthetic */ InterfaceC1273504yb initTriggerCallBack();

    static {
        EnumC12932054g enumC12932054g = new EnumC12932054g() { // from class: X.054n
            @Override // X.EnumC12932054g, X.InterfaceC12945054t
            public final InterfaceC1273504yb initTriggerCallBack() {
                FeedPopupService feedPopupService = (FeedPopupService) PluggableExtentionKt.pluggableSpi$default(FeedPopupService.class, false, false, false, 14, null);
                if (feedPopupService != null) {
                    return feedPopupService.LIZ();
                }
                return null;
            }
        };
        POPUP_TRIGGER_INIT = enumC12932054g;
        EnumC12932054g enumC12932054g2 = new EnumC12932054g() { // from class: X.04ya
            @Override // X.EnumC12932054g, X.InterfaceC12945054t
            public final InterfaceC1273504yb initTriggerCallBack() {
                return null;
            }
        };
        NORMAL_PENDANT_INIT = enumC12932054g2;
        EnumC12932054g enumC12932054g3 = new EnumC12932054g() { // from class: X.04yZ
            @Override // X.EnumC12932054g, X.InterfaceC12945054t
            public final InterfaceC1273504yb initTriggerCallBack() {
                return new InterfaceC1273504yb() { // from class: X.04yY
                    @Override // X.InterfaceC1273504yb
                    public final void ac(String str, Map<String, Object> map) {
                        IPushOutReachApi iPushOutReachApi;
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("initTriggerCallBack(OUT_APP_PUSH_INIT)#OutreachTriggerCallBack(");
                        sbLIZ.append(str);
                        sbLIZ.append(", ");
                        sbLIZ.append(map);
                        sbLIZ.append(')');
                        C2188811AlT.LIZIZ(sbLIZ);
                        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_outreach_out_push", true, false)) {
                            Object objLIZ = C04TD.LIZ(IPushOutReachApi.class, false);
                            if (objLIZ != null) {
                                iPushOutReachApi = (IPushOutReachApi) objLIZ;
                            } else {
                                if (C04TD.i6 == null) {
                                    synchronized (IPushOutReachApi.class) {
                                        if (C04TD.i6 == null) {
                                            C04TD.i6 = new PushOutReachService();
                                        }
                                    }
                                }
                                iPushOutReachApi = C04TD.i6;
                            }
                            iPushOutReachApi.LIZ(str, map);
                        }
                    }
                };
            }
        };
        OUT_APP_PUSH_INIT = enumC12932054g3;
        EnumC12932054g[] enumC12932054gArr = {enumC12932054g, enumC12932054g2, enumC12932054g3};
        LL = enumC12932054gArr;
        LLILLJJLI = new C2254308sP(enumC12932054gArr);
    }

    public static EnumC12932054g[] values() {
        return (EnumC12932054g[]) LL.clone();
    }

    public static EnumC12932054g valueOf(String str) {
        return (EnumC12932054g) C08FF.LIZ(EnumC12932054g.class, str);
    }

    public EnumC12932054g(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
