package X;

import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.friends.model.SchoolMutualStruct;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowFragment;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.0DPX, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DPX extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ CampusFlowFragment LL;
    public final /* synthetic */ EnumC337870DMj LLILLJJLI;
    public final /* synthetic */ EnumC337830DMf LLILLL;
    public final /* synthetic */ C1245860iWe LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ EnumC338610DPf LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ SchoolMutualStruct LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DPX(CampusFlowFragment campusFlowFragment, EnumC337870DMj enumC337870DMj, EnumC337830DMf enumC337830DMf, C1245860iWe c1245860iWe, boolean z, EnumC338610DPf enumC338610DPf, String str, SchoolMutualStruct schoolMutualStruct) {
        super(1);
        this.LL = campusFlowFragment;
        this.LLILLJJLI = enumC337870DMj;
        this.LLILLL = enumC337830DMf;
        this.LLILZ = c1245860iWe;
        this.LLILZIL = z;
        this.LLILZLL = enumC338610DPf;
        this.LLIZ = str;
        this.LLIZLLLIL = schoolMutualStruct;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        CampusFlowFragment campusFlowFragment = this.LL;
        assembler2.DQ2(campusFlowFragment, new AwS581S0100000_2(campusFlowFragment, 356));
        assembler2.DQ2(this.LL, new C0DPY(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL));
        EnumC337870DMj enumC337870DMj = this.LLILLJJLI;
        if (enumC337870DMj != null) {
            CampusFlowFragment campusFlowFragment2 = this.LL;
            View view = (View) ((LinkedHashMap) campusFlowFragment2.LLILLL).get(enumC337870DMj);
            if (view != null) {
                assembler2.RQ2(campusFlowFragment2, new AwS384S0200000_18(enumC337870DMj, view, 164));
                campusFlowFragment2.LLILZIL.add(enumC337870DMj);
            }
        }
        return Unit.LIZ;
    }
}
