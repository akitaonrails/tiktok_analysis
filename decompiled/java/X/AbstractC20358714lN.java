package X;

import android.content.Context;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14lN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20358714lN {
    public final DataChannel LIZ;
    public final Playbook LIZIZ;
    public final WeakReference<Context> LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(514));

    public void LIZ(PlayRule playRule) {
    }

    public InterfaceC20357214l8 LIZLLL() {
        return null;
    }

    public WeakReference<LiveSheetFragment> LJ(C20359414lU c20359414lU, C20361214lm c20361214lm, Long l, Function1<? super Context, Unit> function1) {
        return null;
    }

    public AbstractC20358714lN(DataChannel dataChannel, Playbook playbook, WeakReference<Context> weakReference) {
        this.LIZ = dataChannel;
        this.LIZIZ = playbook;
        this.LIZJ = weakReference;
    }

    public PlayRule LIZIZ(long j, String str, String str2, String str3) {
        Set services = ServiceManager.get().getServices(PlayRule.class);
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(services, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj : services) {
            linkedHashMap.put(((PlayRule) obj).getConfig().LIZ, obj);
        }
        PlayRule playRule = (PlayRule) linkedHashMap.get(str);
        if (playRule == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("can't find the play entity impl by name=");
            sbLIZ.append(str);
            C20441214yg.LJ("BaseDirectorV2", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        playRule.LIZIZ(this.LIZ);
        playRule.LJJIIJ(this.LIZIZ);
        playRule.LJIJI(this.LIZJ);
        playRule.LJIIJJI(str2);
        playRule.LJIILIIL(str3);
        playRule.getConfig().LIZLLL = j;
        playRule.LJIJJLI(new C20358314lJ(this));
        playRule.LJIIIZ(new C20358614lM(this));
        playRule.LJJI(LIZLLL());
        LIZ(playRule);
        return playRule;
    }
}
