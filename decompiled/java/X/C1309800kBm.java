package X;

import Y.ARunnableS10S2100000_20;
import Y.ARunnableS89S0200000_20;
import com.lynx.devtoolwrapper.LynxDevtool;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.performance.PerformanceController;
import com.lynx.tasm.utils.CallStackUtil;
import java.util.Map;

/* JADX INFO: renamed from: X.0kBm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1309800kBm implements InterfaceC1303630k1p {
    public final TemplateData LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Map<String, Object> LIZLLL;
    public final C1309930kBz LJ;
    public final /* synthetic */ LynxTemplateRender LJFF;

    @Override // X.InterfaceC1303630k1p
    public final void LIZ(byte[] bArr) {
        C1289620jfE.LIZLLL(new ARunnableS89S0200000_20(this, bArr, 38));
    }

    public final void LIZIZ(TemplateBundle templateBundle) {
        if (!templateBundle.LJFF()) {
            onFailed("template bundle is invalid.");
            return;
        }
        LynxDevtool lynxDevtool = this.LJFF.mDevTool;
        if (lynxDevtool != null) {
            lynxDevtool.LIZIZ(templateBundle, this.LIZ, this.LIZJ);
        }
        this.LJFF.LJJJJI.LJIILIIL("prepareTemplateEnd", null);
        if (this.LJ == null) {
            TemplateData templateDataLJIIIIZZ = this.LIZ;
            if (templateDataLJIIIIZZ == null) {
                Map<String, Object> map = this.LIZLLL;
                if (map != null) {
                    templateDataLJIIIIZZ = TemplateData.LJII(map);
                } else {
                    String str = this.LIZIZ;
                    if (str == null) {
                        str = "";
                    }
                    templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(str);
                }
            }
            this.LJFF.LJJLIIIJILLIZJL(templateBundle, templateDataLJIIIIZZ, this.LIZJ);
            return;
        }
        C1309870kBt c1309870kBtLIZ = C1309870kBt.LIZ("loadBundle", "loadBundleStart", this.LJFF.LJJJJI.LJ);
        PerformanceController performanceController = this.LJFF.LJJJJI;
        if (performanceController.LJ) {
            performanceController.LJIILIIL("loadBundleStart", null);
        }
        this.LJ.LIZLLL = templateBundle;
        this.LJFF.LJJLIIIJL(this.LJ, c1309870kBtLIZ);
    }

    @Override // X.InterfaceC1303630k1p
    public final void onFailed(String str) {
        C1289620jfE.LIZLLL(new ARunnableS10S2100000_20(this, str, CallStackUtil.LIZ(new Throwable("Fetch template resource failed")), 3));
    }

    public C1309800kBm(LynxTemplateRender lynxTemplateRender, String str, C1309930kBz c1309930kBz) {
        this.LJFF = lynxTemplateRender;
        this.LIZJ = str;
        this.LJ = c1309930kBz;
    }

    public C1309800kBm(LynxTemplateRender lynxTemplateRender, String str, TemplateData templateData) {
        this.LJFF = lynxTemplateRender;
        this.LIZ = templateData;
        this.LIZJ = str;
    }

    public C1309800kBm(LynxTemplateRender lynxTemplateRender, String str, String str2) {
        this.LJFF = lynxTemplateRender;
        this.LIZIZ = str2;
        this.LIZJ = str;
    }

    public C1309800kBm(LynxTemplateRender lynxTemplateRender, String str, Map<String, Object> map) {
        this.LJFF = lynxTemplateRender;
        this.LIZLLL = map;
        this.LIZJ = str;
    }
}
