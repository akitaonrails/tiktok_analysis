package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.anchor.IPoiTagComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0RjS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704000RjS implements IPoiTagComponent {
    public C1188960h2s LIZ;

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiTagComponent
    public final int contentLayoutId() {
        return R.layout.e9d;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiTagComponent
    public final void onTagShow() {
        C1188960h2s c1188960h2s = this.LIZ;
        if (c1188960h2s != null) {
            c1188960h2s.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiTagComponent
    public final void onViewCreated(View view) {
        C1188960h2s c1188960h2s = (C1188960h2s) view.findViewById(R.id.x24);
        this.LIZ = c1188960h2s;
        if (c1188960h2s != null) {
            c1188960h2s.LIZJ(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiTagComponent
    public final void onBind(Aweme aweme, String str) {
        String str2;
        PoiDataStruct poiDataStruct;
        if (C721902rp.LIZIZ(aweme, "meta_tag_poi_check_in")) {
            if (aweme != null && (poiDataStruct = aweme.getPoiDataStruct()) != null) {
                str2 = poiDataStruct.poiName;
            } else {
                str2 = null;
            }
            if (C703302op.LIZ(str2)) {
                C1188960h2s c1188960h2s = this.LIZ;
                if (c1188960h2s != null) {
                    C339190DRl.LIZLLL(c1188960h2s);
                }
                C1188960h2s c1188960h2s2 = this.LIZ;
                if (c1188960h2s2 != null) {
                    c1188960h2s2.LIZ(aweme, str, "meta_tag");
                    return;
                }
                return;
            }
        }
        C1188960h2s c1188960h2s3 = this.LIZ;
        if (c1188960h2s3 == null) {
            return;
        }
        C339190DRl.LIZIZ(c1188960h2s3);
    }
}
