package X;

import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0O9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C614890O9v implements InterfaceC1194100hBA {
    public static final C614890O9v LIZ = new C614890O9v();
    public static volatile boolean LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0O9q] */
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
    @Override // X.InterfaceC1194100hBA
    public final void start() {
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        C622680Oba.LIZJ(this);
        if (C296960BkU.LIZ()) {
            C614860O9s.LIZIZ.LIZJ(new InterfaceC612240Nzq<C614810O9n>() { // from class: X.0O9q
                @Override // X.InterfaceC612240Nzq
                public final void LIZ(C614810O9n c614810O9n, EnumC612210Nzn enumC612210Nzn) {
                    C614810O9n c614810O9n2 = c614810O9n;
                    if (enumC612210Nzn == EnumC612210Nzn.OPTIMISTIC) {
                        C1440005kM.LIZ(new C614900O9w(c614810O9n2.LIZIZ, c614810O9n2.LIZ, c614810O9n2.LIZJ, c614810O9n2.LIZLLL, null, false, false, false, true, 240));
                    }
                }
            });
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C614900O9w c614900O9w) throws JSONException {
        String str = c614900O9w.LIZIZ;
        if (str != null) {
            C1188450h23.LIZJ(str, c614900O9w.LIZ);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("poi_id", c614900O9w.LIZIZ);
        jSONObject.put("is_collected", c614900O9w.LIZ ? 1 : 0);
        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "poiCollectStatusChange"));
        if (C296960BkU.LIZ() && !c614900O9w.LJIIIIZZ) {
            C614860O9s c614860O9s = C614860O9s.LIZIZ;
            String str2 = c614900O9w.LIZIZ;
            if (str2 == null) {
                str2 = "";
            }
            c614860O9s.LIZIZ(new C614810O9n(str2, c614900O9w.LIZJ, c614900O9w.LIZLLL, "scene_tobe_offline", str2, c614900O9w.LIZ));
        }
    }
}
