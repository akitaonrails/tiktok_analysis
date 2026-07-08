package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.OverlayImageEditorAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0J2U, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J2U extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ OverlayImageEditorAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0J2U(OverlayImageEditorAssem overlayImageEditorAssem) {
        super(1);
        this.LL = overlayImageEditorAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.RQ2(this.LL, new C1135304cJ());
        assembler2.QQ2(this.LL, new C0J2V());
        assembler2.QQ2(this.LL, new C0J2W());
        assembler2.QQ2(this.LL, new C0J2X());
        return Unit.LIZ;
    }
}
