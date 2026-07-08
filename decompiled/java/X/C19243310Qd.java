package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Qd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19243310Qd {
    public static C19243710Qh LIZ() {
        IPluginService.PluginData next;
        C19243710Qh c19243710Qh = new C19243710Qh() { // from class: X.10Qf
            /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x00dd A[PHI: r1
              0x00dd: PHI (r1v6 boolean) = (r1v5 boolean), (r1v8 boolean), (r1v8 boolean), (r1v8 boolean) binds: [B:57:0x00d9, B:15:0x003e, B:17:0x0042, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.C19243710Qh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int LIZ(X.InterfaceC19244510Qp r10) {
                /*
                    Method dump skipped, instruction units count: 228
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19243510Qf.LIZ(X.10Qp):int");
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x00c0 A[PHI: r1
              0x00c0: PHI (r1v5 boolean) = (r1v4 boolean), (r1v7 boolean), (r1v7 boolean), (r1v7 boolean) binds: [B:53:0x00bc, B:15:0x003f, B:17:0x0043, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.C19243710Qh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZIZ(X.InterfaceC19244510Qp r10) {
                /*
                    r9 = this;
                    com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                    java.lang.Class<com.ss.android.ugc.aweme.plugin.IPluginService> r0 = com.ss.android.ugc.aweme.plugin.IPluginService.class
                    java.lang.Object r0 = r1.getService(r0)
                    com.ss.android.ugc.aweme.plugin.IPluginService r0 = (com.ss.android.ugc.aweme.plugin.IPluginService) r0
                    java.util.List r0 = r0.getCurrentPluginListPluginData()
                    java.util.Iterator r3 = r0.iterator()
                L14:
                    boolean r0 = r3.hasNext()
                    r8 = 0
                    r7 = 1
                    if (r0 == 0) goto Lc2
                    java.lang.Object r2 = r3.next()
                    r0 = r2
                    com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r0 = (com.ss.android.ugc.aweme.plugin.IPluginService.PluginData) r0
                    int r1 = r0.id
                    X.10Pl r0 = X.EnumC19241510Pl.TOOLTIP_PROTECTION
                    int r0 = r0.getValue()
                    if (r1 != r0) goto L14
                L2d:
                    com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r2 = (com.ss.android.ugc.aweme.plugin.IPluginService.PluginData) r2
                    if (r2 == 0) goto L5b
                    com.ss.android.ugc.aweme.plugin.IPluginService$ShowConfig r0 = r2.showConfig
                    if (r0 == 0) goto Lbb
                    java.lang.Boolean r0 = r0.shouldShow
                    if (r0 == 0) goto Lbb
                    boolean r1 = r0.booleanValue()
                L3d:
                    com.ss.android.ugc.aweme.plugin.IPluginService$PluginDataWrapper r0 = r2.configData
                    if (r0 == 0) goto Lc0
                    com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipDataProtection r0 = r0.tooltipDataProtection
                    if (r0 == 0) goto Lc0
                    java.lang.Boolean r0 = r0.enabled
                    if (r0 == 0) goto Lc0
                    boolean r0 = r0.booleanValue()
                L4d:
                    if (r1 == 0) goto Lc5
                    if (r0 == 0) goto Lc5
                    if (r2 == 0) goto L5b
                    com.ss.android.ugc.aweme.plugin.IPluginService$PluginDataWrapper r0 = r2.configData
                    if (r0 == 0) goto L5b
                    com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipDataProtection r5 = r0.tooltipDataProtection
                    if (r5 != 0) goto L5d
                L5b:
                    com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipDataProtection r5 = X.C19243710Qh.LIZ
                L5d:
                    java.util.List<com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipsByScene> r0 = r5.tooltipPriority
                    java.util.Iterator r6 = r0.iterator()
                L63:
                    boolean r0 = r6.hasNext()
                    if (r0 == 0) goto Lc5
                    java.lang.Object r0 = r6.next()
                    com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipsByScene r0 = (com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipsByScene) r0
                    int r4 = r0.scene
                    int r0 = r10.getScene()
                    if (r4 != r0) goto L63
                    java.util.List<java.lang.Integer> r1 = r5.protection
                    if (r1 == 0) goto L86
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
                    boolean r0 = r1.contains(r0)
                    if (r0 == 0) goto L86
                    return r8
                L86:
                    java.util.List<com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipsByScene> r0 = r5.removeTooltips
                    if (r0 == 0) goto L63
                    java.util.Iterator r3 = r0.iterator()
                L8e:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L63
                    java.lang.Object r0 = r3.next()
                    com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipsByScene r0 = (com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipsByScene) r0
                    int r1 = r0.scene
                    java.util.List<java.lang.Integer> r0 = r0.tooltips
                    if (r4 != r1) goto L8e
                    java.util.Iterator r2 = r0.iterator()
                La4:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L8e
                    java.lang.Object r0 = r2.next()
                    java.lang.Number r0 = (java.lang.Number) r0
                    int r1 = r0.intValue()
                    int r0 = r10.getType()
                    if (r0 != r1) goto La4
                    return r8
                Lbb:
                    r1 = 1
                    if (r2 == 0) goto Lc0
                    goto L3d
                Lc0:
                    r0 = 1
                    goto L4d
                Lc2:
                    r2 = 0
                    goto L2d
                Lc5:
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19243510Qf.LIZIZ(X.10Qp):boolean");
            }
        };
        C1911930zqx.LIZ.getClass();
        if (C1911930zqx.LIZJ() && (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || C1911930zqx.LIZIZ())) {
            Iterator<IPluginService.PluginData> it2 = ((IPluginService) ServiceManager.get().getService(IPluginService.class)).getCurrentPluginListPluginData().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (next.id == EnumC19241510Pl.COHORT_NEW_USER_MODE.getValue()) {
                    break;
                }
            }
            IPluginService.PluginData pluginData = next;
            if ((pluginData == null || !Intrinsics.LJFF(pluginData.showConfig.shouldShow, Boolean.FALSE)) && C1911930zqx.LIZIZ.getInt("active_days", 0) < 4) {
                return c19243710Qh;
            }
        }
        return new C19243710Qh() { // from class: X.10Qe
            /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x00ec A[PHI: r1
              0x00ec: PHI (r1v6 boolean) = (r1v5 boolean), (r1v8 boolean), (r1v8 boolean), (r1v8 boolean) binds: [B:62:0x00e8, B:15:0x003e, B:17:0x0042, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.C19243710Qh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int LIZ(X.InterfaceC19244510Qp r10) {
                /*
                    Method dump skipped, instruction units count: 243
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19243410Qe.LIZ(X.10Qp):int");
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x00fb A[PHI: r1
              0x00fb: PHI (r1v7 boolean) = (r1v6 boolean), (r1v9 boolean), (r1v9 boolean), (r1v9 boolean) binds: [B:63:0x00f7, B:15:0x003f, B:17:0x0043, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.C19243710Qh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZIZ(X.InterfaceC19244510Qp r11) {
                /*
                    Method dump skipped, instruction units count: 258
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19243410Qe.LIZIZ(X.10Qp):boolean");
            }
        };
    }
}
