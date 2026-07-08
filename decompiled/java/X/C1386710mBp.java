package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0mBp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386710mBp implements InterfaceC1282004zy {
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public C2189821An6 LLILZIL;
    public Aweme LLILZLL;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_landscape_portrait", this.LL);
        linkedHashMap.put("landscape_portrait", this.LLILLJJLI);
        linkedHashMap.put("is_pgc", this.LLILLL);
        linkedHashMap.put("is_inspiration_srp_video", this.LLILZ);
        return linkedHashMap;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        String eventType;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C0SXF.LJIILJJIL(c2344009Gk, this.LLILZLL, null);
        C0SXF.LIZIZ(c2344009Gk, this.LLILZIL);
        C2189821An6 c2189821An6 = this.LLILZIL;
        if (((Boolean) C1386740mBs.LIZ.getValue()).booleanValue()) {
            C726220SeC c726220SeC = C726220SeC.LIZIZ;
            if (c2189821An6 == null || (eventType = c2189821An6.getEventType()) == null) {
                eventType = "";
            }
            if (c726220SeC.LJII(eventType)) {
                c2344009Gk.LJFF("message_id", c2189821An6 != null ? c2189821An6.getAiStudioMessageId() : null);
                c2344009Gk.LJFF("session_id", c2189821An6 != null ? c2189821An6.getAiStudioSessionId() : null);
                c2344009Gk.LJFF("enter_method", c2189821An6 != null ? c2189821An6.getEnterMethodValue() : null);
            }
        }
        C734780Ss0.LIZ(c2344009Gk, null, this.LLILZIL);
        C0SXF.LJIIIZ(c2344009Gk, this.LLILZLL, null, this.LLILZIL, Boolean.FALSE);
        C0SXF.LJIIL(c2344009Gk, this.LLILZLL);
        return c2344009Gk.LIZ;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }
}
