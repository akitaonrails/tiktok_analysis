package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.poi.anchor.IPoiTagComponent;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0SPm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720880SPm extends FrameLayout {
    public final C01GW LL;
    public final IPoiTagComponent LLILLJJLI;

    private final IPoiService getPoiService() {
        return (IPoiService) this.LL.getValue();
    }

    public C720880SPm(Context context, AttributeSet attributeSet) {
        IPoiTagComponent poiTagComponent;
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(464));
        IPoiService poiService = getPoiService();
        if (poiService != null) {
            poiTagComponent = poiService.getPoiTagComponent();
        } else {
            poiTagComponent = null;
        }
        this.LLILLJJLI = poiTagComponent;
        if (poiTagComponent != null) {
            FrameLayout.inflate(context, poiTagComponent.contentLayoutId(), this);
            poiTagComponent.onViewCreated(this);
        }
    }
}
