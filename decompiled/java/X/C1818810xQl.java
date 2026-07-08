package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.operationbtm.viewmodel.SceneryModeOperationListViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xQl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1818810xQl extends C09AY implements Function1<C1818830xQn, Unit> {
    public final /* synthetic */ SceneryModeOperationListViewModel LL;
    public final /* synthetic */ C1818820xQm LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1818810xQl(SceneryModeOperationListViewModel sceneryModeOperationListViewModel, C1818820xQm c1818820xQm) {
        super(1);
        this.LL = sceneryModeOperationListViewModel;
        this.LLILLJJLI = c1818820xQm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1818830xQn c1818830xQn) {
        EnumC1818710xQb enumC1818710xQb;
        Object next;
        C1818830xQn c1818830xQn2 = c1818830xQn;
        List<ITEM> listListGetAll = this.LL.listGetAll();
        if (listListGetAll != 0) {
            SceneryModeOperationListViewModel sceneryModeOperationListViewModel = this.LL;
            C1818820xQm c1818820xQm = this.LLILLJJLI;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listListGetAll, 10));
            for (ITEM item : listListGetAll) {
                arrayList.add(new C1818820xQm(item.LL, item.LLILLJJLI, item.LLILLL, Intrinsics.LJFF(item.LL, c1818820xQm.LL), item.LLILZIL, item.LLILZLL));
            }
            sceneryModeOperationListViewModel.listSetItems(arrayList);
            Iterator it2 = arrayList.iterator();
            while (true) {
                enumC1818710xQb = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((C1818820xQm) next).LLILZ) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1818820xQm c1818820xQm2 = (C1818820xQm) next;
            EnumC1818710xQb enumC1818710xQb2 = c1818830xQn2.LLILLJJLI;
            sceneryModeOperationListViewModel.setState(new C1818860xQq(c1818820xQm2));
            if (c1818820xQm2 != null) {
                enumC1818710xQb = c1818820xQm2.LLILZLL;
            }
            if (enumC1818710xQb2 == EnumC1818710xQb.CROP && enumC1818710xQb == EnumC1818710xQb.LAYOUT) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_scenery_crop_editing_page");
                c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                c474500IjALIZ.LJJII(((C1815530xLT) sceneryModeOperationListViewModel.LL.getValue()).LLILLL, "decoration_entrance");
                c474500IjALIZ.LJJII("click", "action_type");
                c474500IjALIZ.LIZ();
            }
        }
        return Unit.LIZ;
    }
}
