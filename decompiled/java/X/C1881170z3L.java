package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.debug.DebugPreviewFragment;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.debug.MixLayoutDebugPreviewActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z3L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1881170z3L extends AbstractC1882430z5N {
    public final C1881180z3M LLJILJILJ;

    @Override // X.AbstractC1882430z5N
    public final void LJIILL(boolean z) {
        C23250099c.LIZLLL(LJIIIZ().LJIILL(), C0PEM.LIZJ, null, new C1881160z3K(this, null), 2);
    }

    @Override // X.AbstractC1882430z5N
    public final void LJIJJ(FragmentManager fragmentManager) {
        DebugPreviewFragment debugPreviewFragment = new DebugPreviewFragment();
        debugPreviewFragment.LLJ = this;
        e(debugPreviewFragment);
        debugPreviewFragment.show(fragmentManager, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1881170z3L(MixLayoutDebugPreviewActivity mixLayoutDebugPreviewActivity, C1881180z3M c1881180z3M) {
        super(mixLayoutDebugPreviewActivity, "mix_layout_debug_page");
        this.LLJILJILJ = c1881180z3M;
        if (c1881180z3M.LIZIZ.length() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = new JSONObject(c1881180z3M.LIZIZ);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt != null) {
                    linkedHashMap.put(next, objOpt);
                }
            }
            C1882380z5I.LJII(LJII(), linkedHashMap);
        }
        if (this.LLJILJILJ.LIZ.length() != 0) {
            JSONObject jSONObject2 = new JSONObject(this.LLJILJILJ.LIZ);
            Iterator<String> itKeys2 = jSONObject2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                String strOptString = jSONObject2.optString(next2);
                if (strOptString.length() != 0) {
                    try {
                        Class<?> cls = Class.forName(strOptString);
                        if (InterfaceC1883030z6L.class.isAssignableFrom(cls)) {
                            LJIIIZ().LJI().LIZIZ(next2, cls, null);
                        }
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }
        }
    }
}
