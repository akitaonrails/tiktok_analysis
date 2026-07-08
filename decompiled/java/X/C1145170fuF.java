package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.PcsAudienceDecorationWidget;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fuF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145170fuF extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ PcsAudienceDecorationWidget LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1145170fuF(Fragment fragment, PcsAudienceDecorationWidget pcsAudienceDecorationWidget, long j, View view) {
        super(1);
        this.LL = fragment;
        this.LLILLJJLI = pcsAudienceDecorationWidget;
        this.LLILLL = j;
        this.LLILZ = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.DQ2(this.LL, new C1145180fuG(this.LLILLJJLI, this.LLILLL));
        assembler2.vQ2(this.LL, new C1145320fuU());
        assembler2.QQ2(this.LL, new C1159804gG(this.LLILZ));
        return Unit.LIZ;
    }
}
