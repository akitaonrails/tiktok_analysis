package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.bottom.font.CustomizedBoardTextFontAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04e2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1146004e2 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ CustomizedBoardTextFontAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146004e2(CustomizedBoardTextFontAssem customizedBoardTextFontAssem) {
        super(1);
        this.LL = customizedBoardTextFontAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        if (((C01DP) this.LL.LLIZLLLIL.getValue()).LIZ()) {
            assembler2.QQ2(this.LL, new C1133404c0());
        }
        if (!((C01DP) this.LL.LLIZLLLIL.getValue()).LIZ()) {
            assembler2.QQ2(this.LL, new C1133804c4());
        }
        if (((C01DP) this.LL.LLIZLLLIL.getValue()).LLILLL == 5) {
            assembler2.RQ2(this.LL, new C1146104e3());
        } else {
            assembler2.QQ2(this.LL, new C1146204e4());
        }
        return Unit.LIZ;
    }
}
