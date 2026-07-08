package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import com.ss.android.ugc.cut_ui.CutSource;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0n0N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418050n0N extends C09AY implements Function1<List<MetaExt>, Unit> {
    public final /* synthetic */ C1417970n0F LL;
    public final /* synthetic */ C259800zU<List<MetaExt>> LLILLJJLI;
    public final /* synthetic */ CutSource LLILLL;
    public final /* synthetic */ C259800zU<NLETemplateModel> LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1418050n0N(C1417970n0F c1417970n0F, C259800zU<List<MetaExt>> c259800zU, CutSource cutSource, C259800zU<NLETemplateModel> c259800zU2, Context context, String str, int i, boolean z) {
        super(1);
        this.LL = c1417970n0F;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = cutSource;
        this.LLILZ = c259800zU2;
        this.LLILZIL = context;
        this.LLILZLL = str;
        this.LLIZ = i;
        this.LLIZLLLIL = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.util.List] */
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
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<MetaExt> list) {
        Integer numValueOf;
        List<MetaExt> list2 = list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutTemplateUtils AUTO_CUT_COMPRESS_META_SUCCESS: compressMeta onSuccess size = ");
        VecMeta vecMetaLIZLLL = null;
        if (list2 != 0) {
            numValueOf = Integer.valueOf(list2.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        C1417970n0F c1417970n0F = this.LL;
        if (list2 != 0) {
            vecMetaLIZLLL = C1418020n0K.LIZLLL(list2);
        }
        c1417970n0F.onCompressDone(vecMetaLIZLLL);
        this.LLILLJJLI.element = list2;
        C1418000n0I.LIZ.LJ(this.LLILLL, this.LLILZ.element, this.LLILZIL, list2, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LL);
        return Unit.LIZ;
    }
}
