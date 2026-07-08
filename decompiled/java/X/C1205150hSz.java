package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Layout;
import com.bytedance.hox.Hox;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.nearby.roaming.NearbyRegionListFragment;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0hSz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1205150hSz {
    public static final C1205150hSz LIZ = new C1205150hSz();
    public static long LIZIZ;

    public static int LIZ(TuxTextView tuxTextView) {
        if (tuxTextView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("......：name = ");
            sbLIZ.append((Object) tuxTextView.getText());
            C2188811AlT.LIZIZ(sbLIZ);
            Layout layout = tuxTextView.getLayout();
            if (layout == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("layout have done,name = ");
                sbLIZ2.append((Object) tuxTextView.getText());
                C2188811AlT.LIZIZ(sbLIZ2);
                return 0;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("layout have not done,name = ");
            sbLIZ3.append((Object) tuxTextView.getText());
            C2188811AlT.LIZIZ(sbLIZ3);
            if (layout.getLineCount() <= 0 || layout.getEllipsisCount(layout.getLineCount() - 1) <= 0) {
                return 0;
            }
            return 1;
        }
        return 0;
    }

    public static void LIZIZ(C19EG c19eg) {
        if (c19eg != null) {
            Hox hoxLIZ = Hox.LLJILJIL.LIZ(c19eg);
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("fromStart", "MainFragment", bundle);
            hoxLIZ.TQ2(bundle, "For You", false);
        }
    }

    public static boolean LIZJ(C19EG c19eg, long j, String str) {
        String str2;
        if (SystemClock.elapsedRealtime() - LIZIZ < 500) {
            C1205170hT1.LIZ.getClass();
            return C1205170hT1.LIZJ();
        }
        LIZIZ = SystemClock.elapsedRealtime();
        String strLIZ = C2177408g0.LIZ("nearby_experience_track", "click_change_region", null);
        C1200000hKg.LIZIZ(strLIZ).start();
        C1205260hTA.LIZ.getClass();
        C20684815ws.onEventV3("click_change_region");
        C1205170hT1.LIZ.getClass();
        if (!C1205170hT1.LIZJ()) {
            InterfaceC1199990hKf interfaceC1199990hKfLIZIZ = C1200000hKg.LIZIZ(strLIZ);
            interfaceC1199990hKfLIZIZ.LJIJI("roaming_disable");
            interfaceC1199990hKfLIZIZ.LJJIFFI();
            return false;
        }
        NearbyRegionListFragment nearbyRegionListFragment = new NearbyRegionListFragment(strLIZ);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19eg, 2490);
        Long lValueOf = Long.valueOf(j);
        try {
            if (c19eg.getSupportFragmentManager().LJJJJZI("NearbyRegionListFragment") != null) {
                InterfaceC1199990hKf interfaceC1199990hKfLIZIZ2 = C1200000hKg.LIZIZ(strLIZ);
                interfaceC1199990hKfLIZIZ2.LJIJI("repeat_add");
                interfaceC1199990hKfLIZIZ2.LJJIFFI();
            } else {
                boolean zLJII = ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LJII(0, c19eg);
                C1201930hNn c1201930hNn = C1201930hNn.LIZ;
                if (zLJII) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c1201930hNn.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enable_location", str2);
                if (str != null) {
                    linkedHashMap.put("enter_method", str);
                }
                C20684815ws.LJIILLIIL("enter_change_region", linkedHashMap);
                nearbyRegionListFragment.LLJI = lValueOf;
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LJIIIIZZ(1);
                int iLJIIIIZZ = (int) (((double) C12ES.LJIIIIZZ(c19eg)) * 0.9d);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJL = iLJIIIIZZ;
                tuxSheet.LLJLL = true;
                tuxSheet.LLJJIJI = nearbyRegionListFragment;
                tuxSheet.LLJLILLLLZIIL = false;
                tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC1208810hYt(awS562S0100000_18, 0);
                tuxSheet.LLJJIJIIJIL = true;
                tuxSheet.show(c19eg.getSupportFragmentManager(), "NearbyRegionListFragment");
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C1205170hT1.LIZ.getClass();
        if (C1205170hT1.LIZ()) {
            C1205180hT2 c1205180hT2LIZLLL = C1205170hT1.LIZLLL(c19eg);
            if (c1205180hT2LIZLLL != null) {
                c1205180hT2LIZLLL.LLILLL = true;
                c1205180hT2LIZLLL.LLIZ.setCompoundDrawablesRelative(null, null, (Drawable) c1205180hT2LIZLLL.LLILZIL.getValue(), null);
                c1205180hT2LIZLLL.LLILZ = true;
            }
        } else {
            C1205180hT2 c1205180hT2LIZLLL2 = C1205170hT1.LIZLLL(c19eg);
            if (c1205180hT2LIZLLL2 != null) {
                c1205180hT2LIZLLL2.LIZJ();
                return true;
            }
        }
        return true;
    }
}
