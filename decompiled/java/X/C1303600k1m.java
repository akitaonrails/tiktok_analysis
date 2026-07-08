package X;

import Y.ARunnableS10S2100000_20;
import com.lynx.devtoolwrapper.LynxDevtool;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.utils.CallStackUtil;

/* JADX INFO: renamed from: X.0k1m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1303600k1m implements InterfaceC1303630k1p {
    public final TemplateData LIZ;
    public final String LIZIZ;
    public final /* synthetic */ LynxTemplateRender LIZJ;

    @Override // X.InterfaceC1303630k1p
    public final void LIZ(byte[] bArr) {
        C1309850kBr c1309850kBr;
        LynxDevtool lynxDevtool = this.LIZJ.mDevTool;
        if (lynxDevtool != null && (c1309850kBr = lynxDevtool.LIZIZ) != null) {
            c1309850kBr.LIZJ.getClass();
        }
        this.LIZJ.LJJJJI.LJIILIIL("prepareTemplateEnd", null);
        this.LIZJ.LJJLIIIIJ(bArr, this.LIZIZ, this.LIZ);
    }

    @Override // X.InterfaceC1303630k1p
    public final void onFailed(String str) {
        C1289620jfE.LIZLLL(new ARunnableS10S2100000_20(this, str, CallStackUtil.LIZ(new Throwable("Fetch template resource failed")), 4));
    }

    public C1303600k1m(LynxTemplateRender lynxTemplateRender, String str, TemplateData templateData) {
        this.LIZJ = lynxTemplateRender;
        this.LIZ = templateData;
        this.LIZIZ = str;
    }
}
