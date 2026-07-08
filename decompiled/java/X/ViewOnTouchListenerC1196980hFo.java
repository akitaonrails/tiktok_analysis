package X;

import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.poi.PoiAnchorButtonInfo;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0hFo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ViewOnTouchListenerC1196980hFo implements View.OnTouchListener {
    public EnumC1197000hFq LL = EnumC1197000hFq.NORMAL;

    public final Map<String, String> LIZ(PoiDataStruct poiDataStruct) {
        int iLIZJ;
        Integer num;
        PoiAnchorInfo poiAnchorInfo;
        PoiAnchorButtonInfo poiAnchorButtonInfo;
        if (this.LL == EnumC1197000hFq.CTA) {
            if (poiDataStruct != null && (poiAnchorInfo = poiDataStruct.videoAnchor) != null && (poiAnchorButtonInfo = poiAnchorInfo.poiAnchorButton) != null) {
                num = poiAnchorButtonInfo.style;
            } else {
                num = null;
            }
            iLIZJ = C1175120ggY.LIZJ(num);
        } else {
            iLIZJ = 0;
        }
        return C2097608Jq.LJIIIIZZ(new Pair("anchor_click_part", this.LL.getAreaName()), new Pair("click_type", String.valueOf(iLIZJ)));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0 && view != null) {
            if (view.getId() == R.id.re2) {
                this.LL = EnumC1197000hFq.MIDDLE_TAG;
            } else if (view.getId() == R.id.qza || view.getId() == R.id.qzd) {
                this.LL = EnumC1197000hFq.CTA;
                return false;
            }
        }
        return false;
    }
}
