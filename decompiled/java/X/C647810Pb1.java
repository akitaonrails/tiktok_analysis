package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ttpobfuscated.fe;

/* JADX INFO: renamed from: X.0Pb1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647810Pb1 extends AbstractC648060PbQ implements InterfaceC647940PbE {
    public static final /* synthetic */ int LLJILLL = 0;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public long LLILZLL;
    public int LLIZ;
    public final C647900PbA LLIZLLLIL;
    public C647950PbF LLJ;
    public int LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public InterfaceC647910PbB LLJILJILJ;

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02fa, code lost:
    
        if (((java.lang.Boolean) X.C0BC5.LIZ.getValue()).booleanValue() != false) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch] */
    /* JADX WARN: Type inference failed for: r0v284, types: [T, com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch] */
    /* JADX WARN: Type inference failed for: r0v60, types: [T, X.0Pd7] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.0Pb2, X.0qES] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC648060PbQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C647810Pb1.LJ():void");
    }

    public final Map<String, Object> LJII() {
        HashMap map = new HashMap();
        Map<String, ? extends Object> map2 = this.LL.LJIIJ;
        if (map2 != null) {
            for (Map.Entry<String, ? extends Object> entry : map2.entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        String str = this.LL.LIZLLL;
        if (str != null) {
            map.put("reactId", str);
        }
        map.put(fe.e, Integer.valueOf(this.LLIZ));
        map.put("screenWidth", Integer.valueOf(C12ES.LJIIJ(this.LL.LIZJ)));
        map.put("isPreload", Boolean.FALSE);
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C647810Pb1.LJIIIIZZ():void");
    }

    public C647810Pb1(C647830Pb3 c647830Pb3) {
        super(c647830Pb3);
        this.LLILZIL = -1;
        this.LLIZ = -1;
        this.LLIZLLLIL = new C647900PbA();
        this.LLJI = 1;
        ((ArrayList) ((C647920PbC) c647830Pb3.LJIIL.getValue()).LIZ).add(this);
    }

    @Override // X.InterfaceC647940PbE
    public final void LIZJ(C1051660dTQ c1051660dTQ) {
        c1051660dTQ.LIZJ(InterfaceC647960PbG.class, this.LL.LJIIJJI.getValue());
    }
}
