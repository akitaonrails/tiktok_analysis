package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.poi.PoiAnchorButtonInfo;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService;
import com.ss.android.ugc.aweme.poi.anchor.IPoiTagComponent;
import com.ss.android.ugc.aweme.poi.anchor.banner.PoiReTagBottomBarAssemTrigger;
import com.ss.android.ugc.aweme.poi.anchor.bottomlabel.PoiCreatorBottomLabelTriggerAssem;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoBottomLabelProtocol;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hAi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193820hAi implements IPoiAnchorService {
    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final BottomBarPriorityProtocol getPoiBottomBarAssem() {
        return new PoiReTagBottomBarAssemTrigger();
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final VideoBottomLabelProtocol getPoiCreatorBottomLabelTrigger() {
        return new PoiCreatorBottomLabelTriggerAssem();
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final IPoiTagComponent getPoiTagComponent() {
        return new C704000RjS();
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final <T> Function1<T, InterfaceC702540Rh6> getPoiTagPolicyProvider() {
        return new C1193980hAy();
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final Function0<C13IQ<? extends ReusedUISlotAssem<?>>> getPoiTagProvider() {
        return new C704250Rjr();
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final Boolean shouldAddNearbyExplore() {
        int iIntValue;
        int i;
        boolean z = false;
        if (C0TX1.LIZ && (iIntValue = ((Number) C262340APw.LIZ.getValue()).intValue()) > 0 && (i = C0TX1.LIZIZ) < iIntValue) {
            z = true;
            C0TX1.LIZIZ = i + 1;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final int getIconResByABExp(boolean z) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ls_location_icon_ab_group", true) == 1) {
            return R.raw.icon_map_thumbtack_fill;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ls_location_icon_ab_group", true) == 2) {
            if (z) {
                return R.raw.icon_map_pin_info_fill;
            }
            return R.raw.icon_map_pin_info;
        }
        if (z) {
            return R.raw.icon_map_pin_fill;
        }
        return R.raw.icon_map_pin;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final PoiAnchorButtonInfo getPoiAnchorCta(Aweme aweme) {
        PoiAnchorInfo poiAnchorInfo;
        PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
        if (poiDataStruct != null && (poiAnchorInfo = poiDataStruct.videoAnchor) != null) {
            return poiAnchorInfo.poiAnchorButton;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final boolean isPoiAnchorView2(View view) {
        return view instanceof C1196950hFl;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final boolean shouldShowCustomFeedSingleAnchor(Aweme aweme) {
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors == null || anchors.size() <= 0 || ((AnchorCommonStruct) ListProtector.get(aweme.getAnchors(), 0)).getType() != EnumC1430380nKG.POI.getTYPE() || C0XQ7.LJFF().LIZJ(AwemeExtKt.getAuthorUid(aweme)) || aweme.getPoiDataStruct() == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final boolean shouldShowOldFeedSingleAnchor(Aweme aweme) {
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors == null || anchors.size() <= 0 || ((AnchorCommonStruct) ListProtector.get(aweme.getAnchors(), 0)).getType() != EnumC1430380nKG.POI.getTYPE()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final void measureAnchorTexts(String str, TextView textView, String str2, TextView textView2, View view, InterfaceC1631630sYr<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> interfaceC1631630sYr) {
        C338880DQg.LIZ(str, textView, str2, textView2, view, interfaceC1631630sYr);
    }
}
