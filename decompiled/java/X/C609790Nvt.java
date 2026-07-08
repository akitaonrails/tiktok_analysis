package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.fackbook.imagepipeline.IImagePipelineOutService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Nvt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609790Nvt {
    public static final C609790Nvt LIZ = new C609790Nvt();
    public static final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ);
    public static final Set<String> LIZJ = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final Set<String> LIZLLL = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final Set<String> LJ = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final Map<String, C09AE> LJFF = new LinkedHashMap();

    public static C1328130kfL LIZ() {
        C1328130kfL c1328130kfLLJJIII;
        try {
            return C1328130kfL.LJIILIIL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                boolean zLJJIIZI = false;
                IImagePipelineOutService iImagePipelineOutService = (IImagePipelineOutService) PluggableExtentionKt.pluggableSpi$default(IImagePipelineOutService.class, false, false, false, 14, null);
                if (iImagePipelineOutService == null) {
                    c1328130kfLLJJIII = null;
                } else {
                    zLJJIIZI = a0.LJJIIZI(iImagePipelineOutService.getClass().getSimpleName(), "ImagePipelineConfigFactory", false);
                    c1328130kfLLJJIII = iImagePipelineOutService.LJJIII();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TabIconManager#getPipelineFactory, error: ");
                sbLIZ.append(e);
                sbLIZ.append(", service is null: ");
                sbLIZ.append(c1328130kfLLJJIII == null);
                sbLIZ.append(", factory is null: ");
                sbLIZ.append(c1328130kfLLJJIII == null);
                sbLIZ.append(", classIsImpl: ");
                sbLIZ.append(zLJJIIZI);
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                C189200o6.m2constructorimpl(Unit.LIZ);
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return null;
            }
        }
    }

    public static final boolean LIZIZ(String str) {
        C1333180knU c1333180knULJIIIZ;
        InterfaceC1326920kdO interfaceC1326920kdO;
        EnumC1320950kTl enumC1320950kTl = EnumC1320950kTl.FULL_FETCH;
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
        c1325700kbQLIZLLL.LJIJI = "tab_icon_cache";
        c1325700kbQLIZLLL.LJI = EnumC1325560kbC.CUSTOM;
        c1325700kbQLIZLLL.LIZIZ = enumC1320950kTl;
        c1325700kbQLIZLLL.LJIIL = EnumC1331380kka.HIGH;
        C592490NLr c592490NLrLIZ = C1324810kZz.LJI().LIZ(c1325700kbQLIZLLL.LIZ(), null);
        C1328130kfL c1328130kfLLIZ = LIZ();
        if (c1328130kfLLIZ != null && (c1333180knULJIIIZ = c1328130kfLLIZ.LJIIIZ()) != null && (interfaceC1326920kdO = (InterfaceC1326920kdO) c1333180knULJIIIZ.get("tab_icon_cache")) != null) {
            return interfaceC1326920kdO.LJII(c592490NLrLIZ);
        }
        return false;
    }
}
