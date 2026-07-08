package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlService;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS445S0200000_9;

/* JADX INFO: renamed from: X.0NwY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C610200NwY implements InterfaceC888860Ytw {
    @Override // X.InterfaceC888860Ytw
    public final void LJI(Context context) {
    }

    public static InterfaceC1411705fn LIZ() {
        IFrequencyControlService iFrequencyControlService = (IFrequencyControlService) PluggableExtentionKt.pluggableSpi$default(IFrequencyControlService.class, false, false, false, 14, null);
        if (iFrequencyControlService == null) {
            return null;
        }
        return iFrequencyControlService.LIZIZ(new C053W("message_request_default_open_push_permission", new C12918053s(null, EnumC12928054c.UID, EnumC1502105uN.MESSAGE_REQUEST, EnumC12929054d.APP, 1), new C12912053m(1), C12915053p.LIZ));
    }

    @Override // X.InterfaceC888860Ytw
    public final EnumC610450Nwx getType() {
        return EnumC610450Nwx.DEFAULT_OPEN_PUSH_PERMISSION;
    }

    @Override // X.InterfaceC888860Ytw
    public final void LJII(Context context) {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        FragmentManager supportFragmentManager;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (!supportFragmentManager.LJLJJI())) {
            C1391960mKI c1391960mKI = new C1391960mKI();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_bell_activation_fill;
            c1391960mKI.LIZLLL = c419910GdJ.LIZ(context);
            c1391960mKI.LJI = 0;
            c1391960mKI.LJII = context.getString(2131837529);
            c1391960mKI.LJIIIIZZ = context.getString(2131837526);
            c1391960mKI.LIZIZ(context.getString(2131837527), AFwS292S0000000_9.get$arr$(68));
            c1391960mKI.LJIIL = false;
            c1391960mKI.LIZJ(context.getString(2131837528), new AwS445S0200000_9(this, context, 40));
            c1391960mKI.LIZ().LIZ.show(supportFragmentManager, "MessageRequestListAssemV2");
        }
        InterfaceC1411705fn interfaceC1411705fnLIZ = LIZ();
        if (interfaceC1411705fnLIZ != null) {
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
            if (iMHostApi != null) {
                jCurrentTimeMillis = iMHostApi.LIZIZ();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            IMHostApi iMHostApi2 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
            if (iMHostApi2 != null) {
                jCurrentTimeMillis2 = iMHostApi2.LIZIZ();
            } else {
                jCurrentTimeMillis2 = System.currentTimeMillis();
            }
            interfaceC1411705fnLIZ.LIZLLL(jCurrentTimeMillis, jCurrentTimeMillis2, curUserId);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("notice_type", "default_open_push_permission");
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("im_message_request_page_notice_show", linkedHashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        if (r7.LIZIZ(r0, r2) == true) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    @Override // X.InterfaceC888860Ytw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(android.content.Context r11, X.InterfaceC1364105Vn<? super java.lang.Boolean> r12) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C610200NwY.LJIIIIZZ(android.content.Context, X.05Vn):java.lang.Object");
    }
}
