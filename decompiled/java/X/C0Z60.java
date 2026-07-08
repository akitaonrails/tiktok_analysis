package X;

import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.preload.api.IIMPreloadService;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Z60, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z60 {
    public static void LIZ(long j) {
        C0YNW c0ynwLIZJ;
        C1DW6 c1dw6;
        C876340YZk.LIZIZ(new C877830Yc9(j), 1);
        IIMCoreProxyService.LIZ.getClass();
        IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
        if (iIMCoreProxyServiceLIZ != null && (c0ynwLIZJ = iIMCoreProxyServiceLIZ.LIZJ(C0YM2.TIKTOK_SOCIAL_IM)) != null && (c1dw6 = (C1DW6) c0ynwLIZJ.LJIIJ.getValue()) != null) {
            ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZ(c1dw6);
        }
        IIMPreloadService iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpi$default(IIMPreloadService.class, false, false, false, 14, null);
        if (iIMPreloadService != null) {
            iIMPreloadService.LIZ();
            C1329305Id.LIZ(new C1336630kt3(new C0Z7Y(0)));
            iIMPreloadService.LIZ();
            C1329305Id.LIZ(new C332390D1h(new C332370D1f(819200, 7)));
            iIMPreloadService.LIZ();
            C1329305Id.LIZ(new C327390CsT(new C332370D1f(819200, 7)));
            iIMPreloadService.LIZ();
            C1329305Id.LIZ(new C901600ZYo(new C0Z7Z(0)));
            iIMPreloadService.LIZ();
            C1329305Id.LIZ(new C05KW(new C1334805Kg(0)));
            IChatCustomizeHelper.LIZ.getClass();
            IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
            if (iChatCustomizeHelperLIZ != null && iChatCustomizeHelperLIZ.isSupportShowCustomization()) {
                iIMPreloadService.LIZ();
                final C1334905Kh c1334905Kh = new C1334905Kh(0);
                C1329305Id.LIZ(new InterfaceC1329405Ie<InterfaceC1329505If>(c1334905Kh) { // from class: X.05Ig
                    public final C1334905Kh LIZ;
                    public final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ);

                    @Override // X.InterfaceC1329405Ie
                    public final String LIZIZ() {
                        return "message";
                    }

                    @Override // X.InterfaceC1329405Ie
                    public final void LJJIIJ(String str) {
                    }

                    @Override // X.InterfaceC1329405Ie
                    public final void release() {
                    }

                    @Override // X.InterfaceC1329405Ie
                    public final void reset() {
                    }

                    {
                        this.LIZ = c1334905Kh;
                    }

                    @Override // X.InterfaceC1329405Ie
                    public final void LIZ(List<? extends InterfaceC1329505If> list) {
                        Object obj;
                        int iIntValue;
                        Integer num;
                        for (InterfaceC1329505If interfaceC1329505If : list) {
                            Map<String, Object> mapLJJIFFI = interfaceC1329505If.LJJIFFI();
                            if (mapLJJIFFI != null) {
                                obj = mapLJJIFFI.get("MESSAGE_COUNT");
                            } else {
                                obj = null;
                            }
                            if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = this.LIZ.LIZLLL;
                            }
                            C23250099c.LIZLLL(this.LIZIZ, null, null, new C1335405Km(this, interfaceC1329505If, iIntValue, null), 3);
                        }
                    }
                });
            }
        }
    }
}
