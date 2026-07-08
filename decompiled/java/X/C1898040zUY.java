package X;

import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.interfaces.INetworkApi;
import com.bytedance.touchpoint.api.model.InviteCodeResponse;
import com.bytedance.touchpoint.api.model.InviteInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS3S4000000_28;

/* JADX INFO: renamed from: X.0zUY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898040zUY {
    public static final C1898060zUa LIZ = new Object() { // from class: X.0zUa
    };
    public static final Keva LIZIZ = Keva.getRepo("share_invite_code");
    public static final String LIZJ = "mentor_u_code";
    public static final String LIZLLL = "item_id";
    public static final String LJ = "campaign";
    public static final String LJFF = "gameplay";

    public static void LIZ() {
        Keva keva = LIZIZ;
        String string = keva.getString(LIZJ, "");
        String string2 = keva.getString(LIZLLL, "");
        String string3 = keva.getString(LJ, "");
        String string4 = keva.getString(LJFF, "");
        if (string == null || string.length() == 0 || string2 == null || string2.length() == 0) {
            return;
        }
        LIZIZ(string2, string, string3, string4);
    }

    public static void LIZIZ(String str, String str2, final String str3, final String str4) {
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null && abstractC1896090zRP.LJJIJIL()) {
            final InviteInfo inviteInfo = new InviteInfo(str2, str);
            final AFwS217S0000000_28 aFwS217S0000000_28 = AFwS217S0000000_28.get$arr$(2);
            final AwS3S4000000_28 awS3S4000000_28 = new AwS3S4000000_28(str, str2, str3, str4, 0);
            LIZ.getClass();
            C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0zUX
                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<C1898050zUZ> c09aj) {
                    INetworkApi iNetworkApiLIZJ;
                    ListenableFuture<InviteCodeResponse> listenableFutureUploadShareInviterCode;
                    String str5;
                    C1C7U.LIZ("InviteCodeUploader@e53f.report$1");
                    String strLJIJJ = null;
                    try {
                        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
                        if (interfaceC1897260zTILIZIZ != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) != null && (listenableFutureUploadShareInviterCode = iNetworkApiLIZJ.uploadShareInviterCode(inviteInfo)) != null) {
                            InviteCodeResponse inviteCodeResponse = listenableFutureUploadShareInviterCode.get();
                            if (inviteCodeResponse != null && inviteCodeResponse.status_code == 0) {
                                int i = inviteCodeResponse.errNo;
                                if (i != 0 && i != 10003 && i != 10006 && i != 10012 && i != 20008 && i != 12003 && i != 12004) {
                                    Function0<Unit> function0 = awS3S4000000_28;
                                    if (function0 != null) {
                                        function0.invoke();
                                    }
                                } else {
                                    Function0<Unit> function02 = aFwS217S0000000_28;
                                    if (function02 != null) {
                                        function02.invoke();
                                    }
                                }
                                C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                                String str6 = str3;
                                String str7 = str4;
                                if (i == 0) {
                                    str5 = "1";
                                } else {
                                    str5 = CardStruct.IStatusCode.DEFAULT;
                                }
                                String str8 = inviteCodeResponse.errTips;
                                c1894320zOY.getClass();
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                C1619720sFe c1619720sFe = C1619720sFe.LIZ;
                                AbstractC1896090zRP abstractC1896090zRP2 = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                                if (abstractC1896090zRP2 != null) {
                                    strLJIJJ = abstractC1896090zRP2.LJIJJ();
                                }
                                linkedHashMap.put("region", strLJIJJ);
                                linkedHashMap.put("campaign", str6);
                                linkedHashMap.put("gameplay", str7);
                                linkedHashMap.put("position", "homepage_hot");
                                linkedHashMap.put("module_name", "bind_code");
                                linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str5);
                                linkedHashMap.put("error_message", str8);
                                InterfaceC1897260zTI interfaceC1897260zTILIZIZ2 = c1619720sFe.LIZIZ();
                                if (interfaceC1897260zTILIZIZ2 != null) {
                                    interfaceC1897260zTILIZIZ2.LIZ("incentive_module_interact_receipt", linkedHashMap);
                                }
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C1C7U.LIZIZ("InviteCodeUploader@e53f.report$1");
                }
            }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19336310kr(0));
            return;
        }
        Keva keva = LIZIZ;
        keva.storeString(LIZJ, str2);
        keva.storeString(LIZLLL, str);
        keva.storeString(LJ, str3);
        keva.storeString(LJFF, str4);
    }
}
