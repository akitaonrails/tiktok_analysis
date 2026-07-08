package X;

import com.bytedance.aigc.proto.FlowDomain;
import com.bytedance.aigc.proto.SceneDomain;

/* JADX INFO: renamed from: X.0LeR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C548010LeR {
    public static final C547180Ld6 LIZ = new C547180Ld6(FlowDomain.CUSTOMIZE, SceneDomain.CUSTOMIZE, null);
    public static final C547180Ld6 LIZIZ;
    public static final C547180Ld6 LIZJ;
    public static final C547180Ld6 LIZLLL;
    public static final C547180Ld6 LJ;
    public static final C547180Ld6 LJFF;
    public static final C547180Ld6 LJI;
    public static final C547180Ld6 LJII;
    public static final C547180Ld6 LJIIIIZZ;
    public static final C547180Ld6 LJIIIZ;

    static {
        FlowDomain flowDomain = FlowDomain.PREPARE;
        LIZIZ = new C547180Ld6(flowDomain, SceneDomain.ID_INPUT, null);
        FlowDomain flowDomain2 = FlowDomain.CONSUME;
        LIZJ = new C547180Ld6(flowDomain2, SceneDomain.USER_PROFILE, null);
        LIZLLL = new C547180Ld6(flowDomain, SceneDomain.PROMPT_PAGE, null);
        FlowDomain flowDomain3 = FlowDomain.GENERATE;
        LJ = new C547180Ld6(flowDomain3, SceneDomain.SERVER, null);
        LJFF = new C547180Ld6(flowDomain2, SceneDomain.PUBLISH, null);
        LJI = new C547180Ld6(flowDomain2, SceneDomain.DRAFT, null);
        SceneDomain sceneDomain = SceneDomain.RECALL;
        LJII = new C547180Ld6(flowDomain2, SceneDomain.CLOUD_DRAFT, null);
        LJIIIIZZ = new C547180Ld6(flowDomain3, SceneDomain.SOCIAL, null);
        LJIIIZ = new C547180Ld6(flowDomain2, sceneDomain, null);
    }
}
