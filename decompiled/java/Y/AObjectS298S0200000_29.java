package Y;

import X.AbstractC19412910xD;
import X.C13LE;
import X.C19339910lR;
import X.C19374410r0;
import X.C19374510r1;
import X.C19375410rA;
import X.C2184641Aek;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C838680WvC;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.legoImp.task.ColdBootPreloadInstanceTask;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AObjectS298S0200000_29 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.10bQ] */
    public static final Object invoke$0(AObjectS298S0200000_29 aObjectS298S0200000_29) {
        final I18nManagerServiceApi i18nManagerServiceApiLIZ;
        ColdBootPreloadInstanceTask coldBootPreloadInstanceTask = (ColdBootPreloadInstanceTask) aObjectS298S0200000_29.l0;
        final Context context = (Context) aObjectS298S0200000_29.l1;
        coldBootPreloadInstanceTask.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("bddigit_sdk_init_switch", false)) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);
            if (i18nServiceApi != null && i18nServiceApi.LIZ() != null) {
                i18nManagerServiceApiLIZ = i18nServiceApi.LIZ();
            } else {
                i18nManagerServiceApiLIZ = null;
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init start, time=");
            sbLIZ.append(jCurrentTimeMillis2);
            C2188811AlT.LIZIZ(sbLIZ);
            final HashMap map = new HashMap();
            map.put("zh-Hant-TW", "zh-Hant");
            map.put("fr-CA", "fr-CA");
            map.put("pt", "pt-PT");
            Function0<String> function0 = new Function0<String>() { // from class: X.10r6
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return i18nManagerServiceApiLIZ.LJIILJJIL(context);
                }
            };
            C19374410r0 c19374410r0 = new C19374410r0(function0, new Function1<String, String>() { // from class: X.10bQ
                /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.lang.String] */
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(String str) {
                    InterfaceC1910030znt interfaceC1910030zntLJIIL;
                    if (str != null) {
                        ?? r3 = map.get(str);
                        if (r3 == 0 && (interfaceC1910030zntLJIIL = i18nManagerServiceApiLIZ.LJIIL(context)) != null) {
                            return interfaceC1910030zntLJIIL.getLanguage();
                        }
                        return r3;
                    }
                    return str;
                }
            });
            if (!C19374510r1.LIZJ) {
                synchronized (C13LE.LIZ(C19374510r1.class)) {
                    try {
                        if (!C19374510r1.LIZJ) {
                            C19374510r1.LIZIZ = c19374410r0;
                            String str = (String) function0.invoke();
                            C838680WvC c838680WvCLIZ = C838680WvC.LIZ();
                            c838680WvCLIZ.getClass();
                            try {
                                c838680WvCLIZ.LIZIZ(context, "en");
                                if (!c838680WvCLIZ.LIZ.containsKey("en")) {
                                    c838680WvCLIZ.LIZ.put("en", C19375410rA.LIZ());
                                }
                                c838680WvCLIZ.LIZJ(context, str);
                                C838680WvC.LIZJ = true;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            C19374510r1.LIZJ = true;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("init end, cost=");
            sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis2);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        C2184641Aek.LIZ = System.currentTimeMillis() - jCurrentTimeMillis;
        return null;
    }

    public static final Object invoke$1(AObjectS298S0200000_29 aObjectS298S0200000_29) {
        AbstractC19412910xD abstractC19412910xD = (AbstractC19412910xD) aObjectS298S0200000_29.l0;
        abstractC19412910xD.LLIZLLLIL = (List) aObjectS298S0200000_29.l1;
        abstractC19412910xD.notifyDataSetChanged();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS298S0200000_29 aObjectS298S0200000_29) {
        StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) aObjectS298S0200000_29.l0;
        NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) aObjectS298S0200000_29.l1;
        String str = StickerPropDetailFragment._pnsPageId;
        if (stickerPropDetailFragment.LLJJL.getParent() instanceof ViewGroup) {
            String strLIZ = stickerPropDetailFragment.s.LIZ();
            if (!strLIZ.isEmpty()) {
                if (C19339910lR.LIZIZ().getInt(C19339910lR.LIZ(strLIZ), 0) == 0) {
                    stickerPropDetailFragment.FS(newFaceStickerBean);
                    return null;
                }
                return null;
            }
            if (C19339910lR.LIZIZ().getInt("click_status", 0) != 0) {
                return null;
            }
            stickerPropDetailFragment.FS(newFaceStickerBean);
            return null;
        }
        return null;
    }

    public AObjectS298S0200000_29(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
