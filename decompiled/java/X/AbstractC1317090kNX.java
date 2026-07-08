package X;

import Y.ARunnableS120S0100000_20;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.DisplayMetrics;
import com.bytedance.sdui.event.SDUIEventManager;
import com.bytedance.sdui.render.bridge.ReadableMap;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.bytedance.sdui.serializedData.common.event.GlobalEvent;
import com.ss.android.ugc.aweme.hybridkit.sdui.SDUIWsServiceImpl;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.spark.SparkHostApiImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kNX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1317090kNX extends ContextWrapper implements InterfaceC1297970jsh {
    public C1297860jsW LL;
    public final Map<String, ReadableMap> LLILLJJLI;
    public C1298420jtQ LLILLL;
    public C1317070kNV LLILZ;
    public C1313660kI0 LLILZIL;
    public WeakReference<C1313470kHh> LLILZLL;
    public WeakReference<C1298370jtL> LLIZ;
    public C1317130kNb LLIZLLLIL;
    public final DisplayMetrics LLJ;
    public List<InterfaceC1314970kK7> LLJI;
    public final C1317140kNc LLJIJIL;
    public final boolean LLJILJIL;
    public String LLJILJILJ;
    public C1317210kNj LLJILLL;
    public C1317760kOc LLJJ;
    public List<GlobalEvent> LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public C1314440kJG LLJJIJIIJIL;
    public String LLJJIJIL;
    public final SDUIEventManager LLJJJ;
    public boolean LLJJJIL;
    public final C1317100kNY LLJJJJ;

    public void LIZJ(Exception exc, int i, JSONObject jSONObject) {
    }

    @Override // X.InterfaceC1297970jsh
    public abstract void handleException(Exception exc);

    public final C1313470kHh LIZIZ() {
        return this.LLILZLL.get();
    }

    public final void LIZLLL() {
        ISparkHostApi iSparkHostApi;
        SparkHostApiImpl sparkHostApiImplLLIZ;
        if (this.LLJJJIL) {
            return;
        }
        this.LLJJJIL = true;
        int i = C1317360kNy.LIZ;
        C1317210kNj c1317210kNj = this.LLJILLL;
        c1317210kNj.LIZIZ = null;
        C1290750jh3.LIZLLL(new ARunnableS120S0100000_20(c1317210kNj, 317));
        C1314440kJG c1314440kJG = this.LLJJIJIIJIL;
        Iterator it2 = ((HashMap) c1314440kJG.LIZ).values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1314850kJv) it2.next()).onDestroy();
        }
        ((HashMap) c1314440kJG.LIZ).clear();
        C1317760kOc c1317760kOc = this.LLJJ;
        c1317760kOc.getClass();
        SDUIWsServiceImpl sDUIWsServiceImpl = C1317350kNx.LIZIZ.LIZ;
        if (sDUIWsServiceImpl != null) {
            C19719512Dh.LIZ(sDUIWsServiceImpl.LIZJ).remove(c1317760kOc);
            if (((ArrayList) sDUIWsServiceImpl.LIZJ).isEmpty() && (iSparkHostApi = sDUIWsServiceImpl.LIZIZ.LIZIZ) != null && (sparkHostApiImplLLIZ = iSparkHostApi.LLIZ()) != null) {
                sparkHostApiImplLLIZ.LLLLIIL();
            }
        }
        c1317760kOc.LJII = true;
        this.LLIZLLLIL.LJIIIIZZ();
    }

    public final SDUIBaseUI LIZ(int i) {
        HashMap<Integer, SDUIBaseUI> map;
        C1313470kHh c1313470kHh = this.LLILZLL.get();
        if (c1313470kHh == null || (map = c1313470kHh.LJFF) == null) {
            return null;
        }
        return map.get(Integer.valueOf(i));
    }

    public final void LJ(SDUIBaseUI sDUIBaseUI) {
        C1317140kNc c1317140kNc = this.LLJIJIL;
        if (c1317140kNc == null) {
            return;
        }
        c1317140kNc.getClass();
        sDUIBaseUI.getClass();
    }

    public AbstractC1317090kNX(Context context, DisplayMetrics displayMetrics) {
        super(context);
        this.LLILLJJLI = new HashMap();
        this.LLILZ = null;
        this.LLIZLLLIL = null;
        this.LLJILJIL = true;
        this.LLJILJILJ = null;
        this.LLJJI = null;
        this.LLJJIII = "";
        this.LLJJIJI = "";
        this.LLJJIJIL = "";
        this.LLJJJIL = false;
        this.LLJJJJ = new C1317100kNY(this);
        new WeakReference(context);
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        this.LLJ = displayMetrics2;
        displayMetrics2.setTo(displayMetrics);
        this.LLJIJIL = new C1317140kNc();
        this.LLJJJ = new SDUIEventManager(this);
    }
}
