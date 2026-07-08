package X;

import com.bytedance.ies.nle.editor_jni.NLECompileLevel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449980nps extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC1450050npz LL;
    public final /* synthetic */ NLECompileLevel LLILLJJLI;
    public final /* synthetic */ C817403Hg LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1449980nps(InterfaceC1450050npz interfaceC1450050npz, NLECompileLevel nLECompileLevel, C817403Hg c817403Hg, String str, int i, int i2, String str2) {
        super(0);
        this.LL = interfaceC1450050npz;
        this.LLILLJJLI = nLECompileLevel;
        this.LLILLL = c817403Hg;
        this.LLILZ = str;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC1450050npz interfaceC1450050npz = this.LL;
        NLECompileLevel nLECompileLevel = this.LLILLJJLI;
        Integer numValueOf = nLECompileLevel != null ? Integer.valueOf(nLECompileLevel.swigValue()) : null;
        float f = this.LLILLL.element;
        NLECompileLevel nLECompileLevel2 = this.LLILLJJLI;
        Integer numValueOf2 = nLECompileLevel2 != null ? Integer.valueOf(nLECompileLevel2.swigValue()) : null;
        C1449990npt c1449990npt = C1449990npt.LIZ;
        String strSubstring = this.LLILZ;
        c1449990npt.getClass();
        int iLJJJJ = a0.LJJJJ(strSubstring, '.', 0, 6);
        if (iLJJJJ != -1) {
            strSubstring = strSubstring.substring(0, iLJJJJ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strSubstring);
        sbLIZ.append("_watermark.mp4");
        interfaceC1450050npz.LIZIZ(new ImageSynthesisResult(this.LLIZ, this.LLILZIL, this.LLILZLL, numValueOf, null, null, new ImageSynthesisResult(this.LLILZ, this.LLILZIL, this.LLILZLL, numValueOf2, null, Float.valueOf(f), null, null, C2188811AlT.LIZIZ(sbLIZ), 208, null), null, null, 432, null));
        return Unit.LIZ;
    }
}
