package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.PreviewBulletinEditWidget;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hmL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1217150hmL extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ PreviewBulletinEditWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1217150hmL(Fragment fragment, PreviewBulletinEditWidget previewBulletinEditWidget) {
        super(1);
        this.LL = fragment;
        this.LLILLJJLI = previewBulletinEditWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.DQ2(this.LL, new C1218690hop(this.LLILLJJLI));
        assembler2.RQ2(this.LL, new C1217140hmK());
        return Unit.LIZ;
    }
}
