package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import androidx.fragment.app.Fragment;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import java.util.Map;
import kotlin.jvm.internal.AFwS196S0000000_10;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pb3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647830Pb3 {
    public final Fragment LIZ;
    public final C648330Pbr LIZIZ;
    public final C19EG LIZJ;
    public String LIZLLL;
    public LynxView LJ;
    public boolean LJFF;
    public String LJI;
    public Integer LJII;
    public DynamicPatch LJIIIIZZ;
    public int LJIIIZ;
    public Map<String, ? extends Object> LJIIJ;
    public final C01GW LJIIJJI;
    public final C01GW LJIIL;
    public Object LJIILIIL;
    public int LJIILJJIL;
    public C648850Pch LJIILL;
    public C645770PUp LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public InterfaceC1541990qEH LJIJI;
    public boolean LJIJJ;
    public TemplateData LJIJJLI;
    public EnumC586350MzB LJIL;
    public String LJJ;
    public long LJJI;

    public final void LIZIZ(String str) {
        this.LJI = str;
        this.LIZIZ.setDebugTag(str);
    }

    public C647830Pb3(Fragment fragment, C648330Pbr c648330Pbr) {
        Context baseContext;
        ContextWrapper contextWrapper;
        this.LIZ = fragment;
        this.LIZIZ = c648330Pbr;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(c648330Pbr.getContext());
        if (c19egLIZIZ == null) {
            Context context = c648330Pbr.getContext();
            if ((context instanceof MutableContextWrapper) && (contextWrapper = (ContextWrapper) context) != null) {
                baseContext = contextWrapper.getBaseContext();
            } else {
                baseContext = null;
            }
            if (baseContext instanceof C19EG) {
                c19egLIZIZ = (C19EG) baseContext;
            } else {
                c19egLIZIZ = null;
            }
        }
        this.LIZJ = c19egLIZIZ;
        this.LJFF = true;
        this.LJI = "";
        this.LJIIJJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(779));
        this.LJIIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(780));
        this.LJIILJJIL = -1;
        this.LJIL = EnumC586350MzB.UNKNOWN;
        this.LJJ = "";
    }

    public final void LIZ(String str, JSONObject jSONObject) {
        C648850Pch c648850Pch = this.LJIILL;
        if (c648850Pch != null) {
            c648850Pch.LIZ(str, jSONObject);
        }
    }
}
