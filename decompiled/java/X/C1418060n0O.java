package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import com.ss.android.ugc.cut_ui.CutSource;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0n0O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418060n0O extends C09AY implements Function1<List<MetaExt>, Unit> {
    public final /* synthetic */ C094D<C096H> LL;
    public final /* synthetic */ C259800zU<List<MetaExt>> LLILLJJLI;
    public final /* synthetic */ AtomicBoolean LLILLL;
    public final /* synthetic */ AtomicBoolean LLILZ;
    public final /* synthetic */ C259800zU<NLETemplateModel> LLILZIL;
    public final /* synthetic */ CutSource LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Context LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1418060n0O(int i, Context context, CutSource cutSource, String str, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C259800zU c259800zU, C259800zU c259800zU2, C094D c094d, boolean z) {
        super(1);
        this.LL = c094d;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = atomicBoolean;
        this.LLILZ = atomicBoolean2;
        this.LLILZIL = c259800zU2;
        this.LLILZLL = cutSource;
        this.LLIZ = i;
        this.LLIZLLLIL = str;
        this.LLJ = context;
        this.LLJI = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List<com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt>] */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, java.util.List] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<MetaExt> list) {
        Integer numValueOf;
        ?? r0;
        ?? r11 = (List) list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutTemplateUtils AutoCutCompressMetaTask startCompressMeta: compressMeta onSuccess size = ");
        if (r11 != 0) {
            numValueOf = Integer.valueOf(r11.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        C094D<C096H> c094d = this.LL;
        if (r11 == 0) {
            r0 = C13BV.INSTANCE;
        } else {
            r0 = r11;
        }
        c094d.LJIIIIZZ(new C095T(r0));
        C259800zU<List<MetaExt>> c259800zU = this.LLILLJJLI;
        c259800zU.element = r11;
        AtomicBoolean atomicBoolean = this.LLILLL;
        AtomicBoolean atomicBoolean2 = this.LLILZ;
        C259800zU<NLETemplateModel> c259800zU2 = this.LLILZIL;
        CutSource cutSource = this.LLILZLL;
        C094D<C096H> c094d2 = this.LL;
        C1417950n0D.LIZ(this.LLIZ, this.LLJ, cutSource, this.LLIZLLLIL, atomicBoolean, atomicBoolean2, c259800zU2, c259800zU, c094d2, this.LLJI);
        return Unit.LIZ;
    }
}
