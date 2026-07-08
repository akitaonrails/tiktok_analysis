package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.MinimalRichTextEditorAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0J2Q, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J2Q extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ MinimalRichTextEditorAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0J2Q(MinimalRichTextEditorAssem minimalRichTextEditorAssem) {
        super(1);
        this.LL = minimalRichTextEditorAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.RQ2(this.LL, new C1136604cW());
        assembler2.QQ2(this.LL, new C0J2R());
        assembler2.QQ2(this.LL, new C0J2S());
        assembler2.QQ2(this.LL, new C0J2T());
        return Unit.LIZ;
    }
}
