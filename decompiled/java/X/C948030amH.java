package X;

import Y.AfS7S0401000_15;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.api.ILayoutSettingApi;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import tikcast.linkmic.common.AnchorPanelLayoutTypeSetting;
import webcast.api.linkmic_multi_guest.GuideLayoutDetailsResponse;
import webcast.api.linkmic_multi_guest.GuideLayoutUpdateParams;

/* JADX INFO: renamed from: X.0amH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948030amH {
    public List<C948400ams> LIZ = C13BV.INSTANCE;
    public int LIZIZ;
    public final List<AnchorPanelLayoutTypeSetting> LIZJ;
    public int LIZLLL;
    public String LJ;
    public String LJFF;
    public int LJI;

    public C948030amH() {
        Integer num;
        String str;
        String str2;
        GuideLayoutDetailsResponse.AnchorLayoutSetting anchorLayoutSetting;
        List<AnchorPanelLayoutTypeSetting> list;
        Integer num2;
        C948100amO c948100amOLIZ = C0H79.LIZ();
        this.LIZIZ = (c948100amOLIZ == null || (num2 = c948100amOLIZ.LIZIZ) == null) ? 1 : num2.intValue();
        C948100amO c948100amOLIZ2 = C0H79.LIZ();
        this.LIZJ = (c948100amOLIZ2 == null || (anchorLayoutSetting = c948100amOLIZ2.LIZ) == null || (list = anchorLayoutSetting.panelLayoutTypeSetting) == null) ? new ArrayList<>() : list;
        C948100amO c948100amOLIZ3 = C0H79.LIZ();
        this.LIZLLL = c948100amOLIZ3 != null ? c948100amOLIZ3.LIZJ : 4;
        C948100amO c948100amOLIZ4 = C0H79.LIZ();
        String str3 = "";
        this.LJ = (c948100amOLIZ4 == null || (str2 = c948100amOLIZ4.LIZLLL) == null) ? "" : str2;
        C948100amO c948100amOLIZ5 = C0H79.LIZ();
        if (c948100amOLIZ5 != null && (str = c948100amOLIZ5.LJ) != null) {
            str3 = str;
        }
        this.LJFF = str3;
        C948100amO c948100amOLIZ6 = C0H79.LIZ();
        this.LJI = (c948100amOLIZ6 == null || (num = c948100amOLIZ6.LJFF) == null) ? 0 : num.intValue();
    }

    public final void LIZLLL() {
        C948100amO c948100amOLIZ = C0H79.LIZ();
        if (c948100amOLIZ != null) {
            c948100amOLIZ.LIZIZ = Integer.valueOf(this.LIZIZ);
        }
        C948100amO c948100amOLIZ2 = C0H79.LIZ();
        if (c948100amOLIZ2 != null) {
            GuideLayoutDetailsResponse.AnchorLayoutSetting anchorLayoutSetting = new GuideLayoutDetailsResponse.AnchorLayoutSetting();
            anchorLayoutSetting.panelLayoutTypeSetting = this.LIZJ;
            c948100amOLIZ2.LIZ = anchorLayoutSetting;
        }
        C948100amO c948100amOLIZ3 = C0H79.LIZ();
        if (c948100amOLIZ3 != null) {
            c948100amOLIZ3.LIZJ = this.LIZLLL;
        }
        C948100amO c948100amOLIZ4 = C0H79.LIZ();
        if (c948100amOLIZ4 != null) {
            c948100amOLIZ4.LJ = this.LJFF;
        }
        C948100amO c948100amOLIZ5 = C0H79.LIZ();
        if (c948100amOLIZ5 != null) {
            c948100amOLIZ5.LIZLLL = this.LJ;
        }
        C948100amO c948100amOLIZ6 = C0H79.LIZ();
        if (c948100amOLIZ6 != null) {
            c948100amOLIZ6.LJFF = Integer.valueOf(this.LJI);
        }
    }

    public final AnchorPanelLayoutTypeSetting LIZ(int i) {
        int iIntValue;
        AnchorPanelLayoutTypeSetting anchorPanelLayoutTypeSetting = null;
        for (AnchorPanelLayoutTypeSetting anchorPanelLayoutTypeSetting2 : this.LIZJ) {
            if (anchorPanelLayoutTypeSetting2.panelLayoutType == i) {
                anchorPanelLayoutTypeSetting = anchorPanelLayoutTypeSetting2;
            }
        }
        if (anchorPanelLayoutTypeSetting == null) {
            C942210act.LIZ.getClass();
            List listLJI = C942210act.LJI(i);
            if (!listLJI.isEmpty()) {
                iIntValue = ((Number) ListProtector.get(listLJI, listLJI.size() - 1)).intValue();
            } else {
                iIntValue = 0;
            }
            AnchorPanelLayoutTypeSetting anchorPanelLayoutTypeSetting3 = new AnchorPanelLayoutTypeSetting();
            anchorPanelLayoutTypeSetting3.panelLayoutType = i;
            anchorPanelLayoutTypeSetting3.maxPosition = iIntValue + 1;
            return anchorPanelLayoutTypeSetting3;
        }
        return anchorPanelLayoutTypeSetting;
    }

    public final C11KQ LIZJ(int i, Function0 function0, Function1 function1, Function0 function02) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchPanelLayoutType: ");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("LayoutSettingRepository", C2188811AlT.LIZIZ(sbLIZ));
        return LIZIZ(this, 2, Integer.valueOf(i), null, Long.valueOf(LIZ(i).maxPosition), function0, function1, function02, 4);
    }

    public static C11KQ LIZIZ(C948030amH c948030amH, int i, Integer num, Integer num2, Long l, Function0 function0, Function1 function1, Function0 function02, int i2) {
        int iIntValue;
        long jLongValue;
        Function1 function12 = function1;
        Integer num3 = num2;
        Function0 function03 = null;
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            num3 = null;
        }
        if ((i2 & 8) != 0) {
            l = null;
        }
        if ((i2 & 16) != 0) {
            function0 = null;
        }
        if ((i2 & 32) != 0) {
            function12 = null;
        }
        if ((i2 & 64) == 0) {
            function03 = function02;
        }
        c948030amH.getClass();
        GuideLayoutUpdateParams guideLayoutUpdateParams = new GuideLayoutUpdateParams();
        guideLayoutUpdateParams.guideLayoutUpdateScene = i;
        guideLayoutUpdateParams.frameSetting = 1L;
        int iIntValue2 = 1;
        if (i != 1) {
            if (i != 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("switch layout, invalid guideLayoutUpdateScene: ");
                sbLIZ.append(i);
                C20441214yg.LJ("LayoutSettingRepository", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                if (num != null) {
                    iIntValue2 = num.intValue();
                }
                guideLayoutUpdateParams.panelLayoutType = iIntValue2;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                guideLayoutUpdateParams.availableSpotForGuest = jLongValue;
            }
        } else {
            if (num3 != null) {
                iIntValue = num3.intValue();
            } else {
                iIntValue = 4;
            }
            guideLayoutUpdateParams.showAvailableSpot = iIntValue;
        }
        if (function0 != null) {
            function0.invoke();
        }
        C480460Ism.LIZ().getClass();
        return ((ILayoutSettingApi) C480460Ism.LIZLLL(ILayoutSettingApi.class)).updateGuideLayout(guideLayoutUpdateParams).LJFF(new C0UO0()).LJIILL(new AfS7S0401000_15(function12, i, c948030amH, num3, function03, 5)).LJIIL(new C516201zk(function03, 270));
    }
}
