package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.lynx.tasm.TemplateData;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ql6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679540Ql6 extends C679510Ql3 implements InterfaceC621710Oa1 {
    public final String LJIIJJI;
    public final TemplateData LJIIL;
    public Map<String, String> LJIILIIL;
    public final Boolean LJIILJJIL;
    public Map<String, ? extends Object> LJIILL;
    public Integer LJIILLIIL;
    public List<? extends Class<? extends InterfaceC1063710dmr>> LJIIZILJ;
    public C1162570gMJ LJIJ;
    public C1312970kGt LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public boolean LJIL;
    public Function1<? super SparkContext, Unit> LJJ;
    public final Function1<? super C1538590q8n, Unit> LJJI;
    public final Map<Class<?>, ? extends Object> LJJIFFI;

    public C679540Ql6() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{ itemId: ");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", schema: ");
        sbLIZ.append(this.LJIJJLI);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC621710Oa1
    public final String getIdentifier() {
        return this.LJIJJ;
    }

    @Override // X.InterfaceC621710Oa1
    public final String getSchema() {
        return this.LJIJJLI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C679540Ql6(String str, TemplateData templateData, Boolean bool, Map map, Integer num, C1162570gMJ c1162570gMJ, C1312970kGt c1312970kGt, String str2, String str3, Function1 function1, int i) {
        str = (i & 1) != 0 ? null : str;
        templateData = (i & 2) != 0 ? null : templateData;
        bool = (i & 8) != 0 ? null : bool;
        map = (i & 16) != 0 ? null : map;
        num = (i & 32) != 0 ? null : num;
        c1162570gMJ = (i & 128) != 0 ? null : c1162570gMJ;
        c1312970kGt = (i & 256) != 0 ? null : c1312970kGt;
        str2 = (i & 512) != 0 ? null : str2;
        function1 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : function1;
        super(map, null);
        this.LJIIJJI = str;
        this.LJIIL = templateData;
        this.LJIILIIL = null;
        this.LJIILJJIL = bool;
        this.LJIILL = map;
        this.LJIILLIIL = num;
        this.LJIIZILJ = null;
        this.LJIJ = c1162570gMJ;
        this.LJIJI = c1312970kGt;
        this.LJIJJ = str2;
        this.LJIJJLI = str3;
        this.LJIL = false;
        this.LJJ = function1;
        this.LJJI = null;
        this.LJJIFFI = null;
    }
}
