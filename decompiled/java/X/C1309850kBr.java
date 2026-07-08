package X;

import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0kBr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309850kBr {
    public final C1310420kCm LIZ;
    public final C1310190kCP LIZIZ;
    public final C1303610k1n LIZJ;
    public TemplateData LIZLLL = TemplateData.LJII(new HashMap());
    public TemplateData LJ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0kCm] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0k1n] */
    public C1309850kBr(LynxView lynxView) {
        new WeakReference(lynxView);
        this.LIZ = new Object() { // from class: X.0kCm
        };
        this.LIZIZ = new C1310190kCP();
        this.LIZJ = new Object() { // from class: X.0k1n
        };
    }

    public final void LIZIZ(TemplateData templateData) {
        if (templateData == null) {
            return;
        }
        this.LIZLLL.LJIJJLI(templateData.LJ());
    }

    public final void LIZ(String str, TemplateData templateData) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadFromURL:");
        sbLIZ.append(str);
        LynxLog.i("PageReloadHelper", C2188811AlT.LIZIZ(sbLIZ));
        getClass();
        LIZIZ(templateData);
    }
}
