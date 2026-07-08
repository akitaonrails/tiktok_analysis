package X;

import com.ss.android.ugc.aweme.feed.model.banner.FcpTemplateActionGroup;
import com.ss.android.ugc.aweme.feed.model.banner.FcpUiTemplate;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Rkr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704870Rkr extends AbstractC704860Rkq<Map<String, ? extends Object>> {
    public Map<String, ? extends Object> LIZIZ;
    public Map<String, FcpTemplateActionGroup> LIZJ;

    @Override // X.AbstractC704860Rkq
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.AbstractC704860Rkq
    public final void LIZ() {
        Map<String, ? extends Object> mapLJ;
        FcpUiTemplate fcpUiTemplate = this.LIZ;
        if (fcpUiTemplate == null || (mapLJ = fcpUiTemplate.getFieldsMap()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        this.LIZIZ = mapLJ;
    }

    @Override // X.AbstractC704860Rkq
    public final Map<String, FcpTemplateActionGroup> LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC704860Rkq
    public final /* bridge */ /* synthetic */ Map<String, ? extends Object> LIZJ() {
        return this.LIZIZ;
    }

    public C704870Rkr(FcpUiTemplate fcpUiTemplate) {
        super(fcpUiTemplate);
        this.LIZIZ = new LinkedHashMap();
        this.LIZJ = new LinkedHashMap();
    }
}
