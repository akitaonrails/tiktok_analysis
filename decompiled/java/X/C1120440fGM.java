package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import webcast.data.EcPreLiveCheckListStepData;
import webcast.data.EcPreLiveChecklistData;
import webcast.data.TopRightBannerContainerComponent;

/* JADX INFO: renamed from: X.0fGM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120440fGM extends ConstraintLayout implements InterfaceC1141530foN, C0ULX {
    public final TuxTextView LL;
    public final TuxTextView LLILLJJLI;
    public final C0FJH LLILLL;
    public final List<EcPreLiveCheckListStepData> LLILZ;
    public boolean LLILZIL;
    public View.OnClickListener LLILZLL;

    @Override // X.C0ULX
    public final void LJZI(View view, Function0<Unit> function0) {
    }

    @Override // X.C0ULX
    public final boolean LLZLLLL(int i, Object obj) {
        return false;
    }

    @Override // X.C0ULX
    public View getBannerView() {
        return this;
    }

    public String getContainerId() {
        return "ECBeforeLiveChecklistBannerView";
    }

    @Override // X.C0ULX
    public final void onHide() {
    }

    @Override // X.C0ULX
    public final void onPause() {
    }

    @Override // X.C0ULX
    public final void onResume() {
    }

    @Override // X.C0ULX
    public final void onShow() {
    }

    private final List<EcPreLiveCheckListStepData> getActionableSteps() {
        List<EcPreLiveCheckListStepData> list = this.LLILZ;
        ArrayList arrayList = new ArrayList();
        for (EcPreLiveCheckListStepData ecPreLiveCheckListStepData : list) {
            long j = ecPreLiveCheckListStepData.checkListStepType;
            if (j != 4 && j != 0) {
                arrayList.add(ecPreLiveCheckListStepData);
            }
        }
        return arrayList;
    }

    private final EcPreLiveCheckListStepData getAllDoneStep() {
        EcPreLiveCheckListStepData next;
        Iterator<EcPreLiveCheckListStepData> it2 = this.LLILZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.checkListStepType == 4) {
                break;
            }
        }
        return next;
    }

    public final void l0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "live_take_page");
        linkedHashMap.put("author_id", getAuthorID());
        linkedHashMap.put("module_name", "prepare_checklist");
        linkedHashMap.put("click_area", "detail");
        linkedHashMap.put("checklist_progress", getChecklistProgressForTracking());
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_module_click", linkedHashMap);
    }

    @Override // X.C0ULX
    public final void onDetach() {
        if (this.LLILZIL) {
            C1548820qPI.LJIIIIZZ("talent_live_billboard_status", this);
            C1548820qPI.LJIIIIZZ("talent_live_giveaway_status", this);
            C1548820qPI.LJIIIIZZ("talent_live_product_list_num", this);
            this.LLILZIL = false;
        }
    }

    private final String getAuthorID() {
        String currentUserID;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        return (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) ? "" : currentUserID;
    }

    private final String getChecklistProgressForTracking() {
        int displayableStepsCount = getDisplayableStepsCount();
        return displayableStepsCount <= 0 ? CardStruct.IStatusCode.DEFAULT : String.valueOf(e0(displayableStepsCount) + 1);
    }

    private final int getDisplayableStepsCount() {
        return getActionableSteps().size();
    }

    public final void n0() {
        String str;
        int displayableStepsCount = getDisplayableStepsCount();
        int iE0 = e0(displayableStepsCount);
        EcPreLiveCheckListStepData ecPreLiveCheckListStepDataH0 = h0(displayableStepsCount);
        TuxTextView tuxTextView = this.LL;
        String str2 = ecPreLiveCheckListStepDataH0 != null ? ecPreLiveCheckListStepDataH0.titleText : null;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        tuxTextView.setText(str2);
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (ecPreLiveCheckListStepDataH0 != null && (str = ecPreLiveCheckListStepDataH0.contentText) != null) {
            str3 = str;
        }
        tuxTextView2.setText(str3);
        C0FJH c0fjh = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(iE0);
        sbLIZ.append('/');
        sbLIZ.append(displayableStepsCount);
        c0fjh.setText(C2188811AlT.LIZIZ(sbLIZ));
        C0FJH c0fjh2 = this.LLILLL;
        c0fjh2.LLJL = iE0;
        c0fjh2.LLJJLIIIJLLLLLLLZ = displayableStepsCount;
        c0fjh2.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLILZIL) {
            C1548820qPI.LJIIIIZZ("talent_live_billboard_status", this);
            C1548820qPI.LJIIIIZZ("talent_live_giveaway_status", this);
            C1548820qPI.LJIIIIZZ("talent_live_product_list_num", this);
            this.LLILZIL = false;
        }
    }

    public final int e0(int i) {
        if (i <= 0) {
            return 0;
        }
        List<EcPreLiveCheckListStepData> actionableSteps = getActionableSteps();
        int iLJ = C13LZ.LJ(0, 0, i - 1);
        while (true) {
            if (iLJ >= i) {
                break;
            }
            if (!((EcPreLiveCheckListStepData) ListProtector.get(actionableSteps, iLJ)).ifFinish) {
                if (iLJ >= 0) {
                    return iLJ;
                }
            } else {
                iLJ++;
            }
        }
        return i;
    }

    public final EcPreLiveCheckListStepData h0(int i) {
        List<EcPreLiveCheckListStepData> actionableSteps = getActionableSteps();
        if (i <= 0) {
            EcPreLiveCheckListStepData allDoneStep = getAllDoneStep();
            if (allDoneStep == null) {
                return (EcPreLiveCheckListStepData) C13LP.LJJLIIIJL(this.LLILZ);
            }
            return allDoneStep;
        }
        int iE0 = e0(i);
        if (iE0 < i) {
            List<EcPreLiveCheckListStepData> actionableSteps2 = getActionableSteps();
            if (!(actionableSteps2 instanceof Collection) || !actionableSteps2.isEmpty()) {
                Iterator<EcPreLiveCheckListStepData> it2 = actionableSteps2.iterator();
                while (it2.hasNext()) {
                    if (!it2.next().ifFinish) {
                        return (EcPreLiveCheckListStepData) C13LP.LJJJLZIJ(C13LZ.LJ(iE0, 0, i - 1), actionableSteps);
                    }
                }
            }
        }
        EcPreLiveCheckListStepData allDoneStep2 = getAllDoneStep();
        if (allDoneStep2 == null) {
            return (EcPreLiveCheckListStepData) C13LP.LJJLIIIJL(actionableSteps);
        }
        return allDoneStep2;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String str = c262100zr.LIZ;
        int iHashCode = str.hashCode();
        boolean zLIZIZ = false;
        if (iHashCode != 124401362) {
            if (iHashCode != 543288725) {
                if (iHashCode == 1750278354 && str.equals("talent_live_billboard_status")) {
                    InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                    if (interfaceC1107590evd != null) {
                        zLIZIZ = C1871910yoP.LIZIZ(interfaceC1107590evd, "exist", false);
                    }
                    j0(3L, zLIZIZ);
                    n0();
                    return;
                }
                return;
            }
            if (!str.equals("talent_live_product_list_num")) {
                return;
            }
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null && C1871910yoP.LIZLLL(interfaceC1107590evd2, "productNum", 0) > 0) {
                zLIZIZ = true;
            }
            j0(1L, zLIZIZ);
            n0();
            return;
        }
        if (!str.equals("talent_live_giveaway_status")) {
            return;
        }
        InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
        if (interfaceC1107590evd3 != null) {
            zLIZIZ = C1871910yoP.LIZIZ(interfaceC1107590evd3, "exist", false);
        }
        j0(2L, zLIZIZ);
        n0();
    }

    @Override // X.C0ULX
    public void setOnCloseClickListener(View.OnClickListener onClickListener) {
        this.LLILZLL = onClickListener;
    }

    public final void j0(long j, boolean z) {
        boolean z2;
        EcPreLiveCheckListStepData next;
        Iterator<EcPreLiveCheckListStepData> it2 = this.LLILZ.iterator();
        while (true) {
            z2 = false;
            if (it2.hasNext()) {
                next = it2.next();
                if (next.checkListStepType == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EcPreLiveCheckListStepData ecPreLiveCheckListStepData = next;
        if (ecPreLiveCheckListStepData != null && z && !ecPreLiveCheckListStepData.ifFinish) {
            ecPreLiveCheckListStepData.ifFinish = true;
        }
        EcPreLiveCheckListStepData allDoneStep = getAllDoneStep();
        if (allDoneStep != null) {
            List<EcPreLiveCheckListStepData> actionableSteps = getActionableSteps();
            if (!actionableSteps.isEmpty()) {
                if (!actionableSteps.isEmpty()) {
                    Iterator<EcPreLiveCheckListStepData> it3 = actionableSteps.iterator();
                    while (it3.hasNext()) {
                        if (!it3.next().ifFinish) {
                            break;
                        }
                    }
                    z2 = true;
                } else {
                    z2 = true;
                }
            }
            allDoneStep.ifFinish = z2;
        }
    }

    public C1120440fGM(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZ = new ArrayList();
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bwn, this, true);
        this.LL = (TuxTextView) findViewById(R.id.zdd);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.zdc);
        this.LLILLL = (C0FJH) findViewById(R.id.zdb);
        C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.0fGO
            @Override // X.AbstractViewOnClickListenerC420730Ged
            public final void LIZ(View view) {
                String str;
                if (view != null) {
                    C1120440fGM c1120440fGM = this.LLILZ;
                    EcPreLiveCheckListStepData ecPreLiveCheckListStepDataH0 = c1120440fGM.h0(c1120440fGM.getDisplayableStepsCount());
                    if (ecPreLiveCheckListStepDataH0 != null && (str = ecPreLiveCheckListStepDataH0.jumpSchema) != null && str.length() != 0) {
                        SmartRouter.buildRoute(context, str).open();
                    }
                    this.LLILZ.l0();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(700L);
            }
        }, this);
    }

    @Override // X.C0ULX
    public final boolean c0(DataChannel dataChannel, LifecycleOwner lifecycleOwner, TopRightBannerContainerComponent topRightBannerContainerComponent) throws JSONException {
        EcPreLiveChecklistData ecPreLiveChecklistData = topRightBannerContainerComponent.ecPreliveChecklist;
        if (ecPreLiveChecklistData == null || ecPreLiveChecklistData.checkListStepData.isEmpty()) {
            return false;
        }
        ((ArrayList) this.LLILZ).clear();
        ((ArrayList) this.LLILZ).addAll(ecPreLiveChecklistData.checkListStepData);
        n0();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "live_take_page");
        linkedHashMap.put("author_id", getAuthorID());
        linkedHashMap.put("module_name", "prepare_checklist");
        linkedHashMap.put("checklist_progress", getChecklistProgressForTracking());
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_module_show", linkedHashMap);
        if (!this.LLILZIL) {
            C1548820qPI.LJFF("talent_live_billboard_status", this, getContainerId());
            C1548820qPI.LJFF("talent_live_giveaway_status", this, getContainerId());
            C1548820qPI.LJFF("talent_live_product_list_num", this, getContainerId());
            this.LLILZIL = true;
        }
        return true;
    }
}
