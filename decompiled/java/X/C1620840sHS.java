package X;

import android.content.Intent;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.ogc.declaration.page.AddDateAndLocationVM;
import com.ss.android.ugc.aweme.ogc.declaration.page.LocationInfo;
import com.ss.android.ugc.aweme.poi.PoiData;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0sHS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620840sHS implements OnActivityResultCallback {
    public final int $t;
    public Object l0;

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        switch (this.$t) {
            case 0:
                onActivityResult$0(this, i, i2, intent);
                break;
            case 1:
                onActivityResult$1(this, i, i2, intent);
                break;
        }
    }

    public C1620840sHS(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onActivityResult$0(C1620840sHS c1620840sHS, int i, int i2, Intent intent) {
        ((C1611080s1i) c1620840sHS.l0).LJIIJJI();
    }

    public static final void onActivityResult$1(C1620840sHS c1620840sHS, int i, int i2, Intent intent) {
        PoiData poiData;
        if (i == 111 && i2 == -1) {
            C1579080rC6 c1579080rC6 = ((AddDateAndLocationVM) c1620840sHS.l0).LL;
            if (c1579080rC6 != null) {
                Serializable serializableExtra = intent.getSerializableExtra("poi_data");
                LocationInfo locationInfo = null;
                if ((serializableExtra instanceof PoiData) && (poiData = (PoiData) serializableExtra) != null) {
                    locationInfo = new LocationInfo(poiData.id, poiData.name);
                }
                c1579080rC6.LIZIZ = locationInfo;
                c1579080rC6.LIZJ.LIZLLL();
            }
            ((AddDateAndLocationVM) c1620840sHS.l0).xQ2();
        }
    }
}
