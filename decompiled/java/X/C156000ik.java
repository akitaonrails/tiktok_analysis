package X;

import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00ik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C156000ik {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Function0 function0) {
        InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
        if (interfaceC975870bVBLJFF != null && !(!interfaceC975870bVBLJFF.LJ().isEmpty())) {
            String strLJJIII = interfaceC975870bVBLJFF.LJJIII();
            if (strLJJIII == null || strLJJIII.length() <= 0) {
                strLJJIII = null;
            }
            C480460Ism.LIZ().getClass();
            ((MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class)).getMatchPlaybookInfo(strLJJIII).LJIILIIL(new C0UO0()).LJJLL(new C516201zk(function0, 282), new C516201zk(function0, 283));
            return;
        }
        function0.invoke();
    }
}
