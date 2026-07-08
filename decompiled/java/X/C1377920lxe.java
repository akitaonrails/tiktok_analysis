package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.pojo.ShareChannelSettings;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lxe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1377920lxe {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public static List LIZ(Activity activity) {
        ?? LL;
        Object next;
        if (!((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().enableSaveUploadVideo()) {
            return C13BV.INSTANCE;
        }
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(EnumC1377930lxf.WHATSAPP, EnumC1377930lxf.FACEBOOK, EnumC1377930lxf.SMS, EnumC1377930lxf.MESSENGER, EnumC1377930lxf.VK, EnumC1377930lxf.LINE, EnumC1377930lxf.KAKAOTALK, EnumC1377930lxf.ZALO, EnumC1377930lxf.TELEGRAM, EnumC1377930lxf.VIBER, EnumC1377930lxf.SPARK);
        try {
            List<ShareChannelSettings> silentShareList = C0CLW.LIZIZ.LIZ.getSilentShareList();
            if (((Boolean) C0AEO.LIZ.getValue()).booleanValue() && silentShareList == null) {
                silentShareList = C1380680m26.LJ();
            }
            LL = new ArrayList();
            for (ShareChannelSettings shareChannelSettings : silentShareList) {
                Iterator it2 = listLJIILJJIL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((EnumC1377930lxf) next).getKey(), shareChannelSettings.getId())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (next != null) {
                    LL.add(next);
                }
            }
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
            LL = C13LP.LL(listLJIILJJIL, 5);
        }
        ArrayList arrayList = new ArrayList((Collection) LL);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            InterfaceC1369790lkX interfaceC1369790lkXLIZ = C1374810lsd.LIZ(((EnumC1377930lxf) it3.next()).getKey(), activity, null, 4);
            if (interfaceC1369790lkXLIZ == null || !interfaceC1369790lkXLIZ.LJIIZILJ(activity)) {
                it3.remove();
            }
        }
        return arrayList;
    }
}
