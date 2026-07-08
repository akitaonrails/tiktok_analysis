package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04gX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1161504gX extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ BoardsDisplayView LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1161504gX(Fragment fragment, BoardsDisplayView boardsDisplayView) {
        super(1);
        this.LL = fragment;
        this.LLILLJJLI = boardsDisplayView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.DQ2(this.LL, new C1766206vs(this.LLILLJJLI));
        Fragment fragment = this.LL;
        assembler2.QQ2(fragment, new C1161404gW(fragment));
        return Unit.LIZ;
    }
}
