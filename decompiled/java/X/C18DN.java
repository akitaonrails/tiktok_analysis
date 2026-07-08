package X;

import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.android.btm.impl.page.unknown.UnionData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18DN, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18DN extends UnionData {
    public BufferBtm LL;
    public List<String> LLILLJJLI = new ArrayList();
    public String LLILLL;

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("class_name", getClassName());
            jSONObject.put("page_btm", getPageBtm());
            jSONObject.put("union_pre", getUnionPre());
            jSONObject.put("union_step", getUnionStep());
            jSONObject.put("page_id", getPageId());
            jSONObject.put("buffer_btm", this.LL);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public final BufferBtm getBufferBtm() {
        return this.LL;
    }

    public final List<String> getMountBtmIds() {
        return this.LLILLJJLI;
    }

    public final String getSchema() {
        return this.LLILLL;
    }

    public final void setBufferBtm(BufferBtm bufferBtm) {
        this.LL = bufferBtm;
    }

    public final void setMountBtmIds(List<String> list) {
        this.LLILLJJLI = list;
    }

    public final void setSchema(String str) {
        this.LLILLL = str;
    }
}
