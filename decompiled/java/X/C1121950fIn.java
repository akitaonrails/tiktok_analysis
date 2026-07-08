package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.OneStopSheetFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS74S0301000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fIn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121950fIn implements InterfaceC518920KWs {
    public static final /* synthetic */ int LLJIJIL = 0;
    public DataChannel LL;
    public int LLILLJJLI;
    public int LLILZIL;
    public int LLILZLL;
    public long LLIZ;
    public boolean LLJI;
    public String LLILLL = "";
    public String LLILZ = "";
    public String LLIZLLLIL = "";
    public int LLJ = -1;

    public final Map<String, String> LIZIZ() {
        if (this.LLIZLLLIL.length() == 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.LLIZLLLIL);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
            }
            return linkedHashMap;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LJI() {
        OneStopSheetFragment oneStopSheetFragmentLIZLLL = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LIZLLL(null);
        if (!(oneStopSheetFragmentLIZLLL instanceof LiveSheetFragment) || oneStopSheetFragmentLIZLLL == null) {
            return;
        }
        FragmentManager fragmentManagerLJII = C500260Jjc.LJII(this.LL);
        Class<?> cls = oneStopSheetFragmentLIZLLL.getClass();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", this.LLILLL, bundle);
        bundle.putLong("click_go_live_time_stamp", this.LLIZ);
        C786410Ut5.LJJJI("pcs_track_context", this.LLIZLLLIL, bundle);
        C19322110iZ.LIZLLL(fragmentManagerLJII, cls, "live_smb_one_stop_sheet", null, bundle);
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.SX0(C0UNN.class, "service_one_stop_shop");
        }
    }

    @Override // X.InterfaceC518920KWs
    public final String getShowEntrance() {
        return this.LLILLL;
    }

    public final void LIZ(Boolean bool, int i, Function0 function0) {
        if (bool != null) {
            bool.booleanValue();
            if (1 != this.LLILLJJLI || this.LLJI) {
                return;
            }
            AwS74S0301000_17 awS74S0301000_17 = new AwS74S0301000_17(bool, (Boolean) this, (C1121950fIn) i, (int) function0, (Function0<Unit>) 2);
            if (!Intrinsics.LJFF(bool, Boolean.TRUE) && i == 2) {
                LJI();
            } else {
                awS74S0301000_17.invoke();
            }
        }
    }
}
