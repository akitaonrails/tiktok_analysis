package X;

import android.view.View;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowFragment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS213S0300000_4;

/* JADX INFO: renamed from: X.0DPW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DPW extends C09AY implements Function2<C03H5, List<? extends EnumC337870DMj>, Unit> {
    public final /* synthetic */ CampusFlowFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DPW(CampusFlowFragment campusFlowFragment) {
        super(2);
        this.LL = campusFlowFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(C03H5 c03h5, List<? extends EnumC337870DMj> list) {
        View view;
        EnumC337870DMj enumC337870DMj = (EnumC337870DMj) C13LP.LJJLIIIJJI(list);
        CampusFlowFragment campusFlowFragment = this.LL;
        if (!campusFlowFragment.LLILZIL.contains(enumC337870DMj) && (view = (View) ((LinkedHashMap) campusFlowFragment.LLILLL).get(enumC337870DMj)) != null) {
            C723850SaN.LIZ(campusFlowFragment, false, null, new AwS213S0300000_4(campusFlowFragment, enumC337870DMj, view, 19), 3);
            campusFlowFragment.LLILZIL.add(enumC337870DMj);
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LL.LLILLL).entrySet()) {
            Object key = entry.getKey();
            View view2 = (View) entry.getValue();
            if (key == enumC337870DMj) {
                C786410Ut5.LJLLLLLL(0, view2);
            } else {
                C786410Ut5.LJLLLLLL(4, view2);
            }
        }
        this.LL.MR(enumC337870DMj);
        return Unit.LIZ;
    }
}
