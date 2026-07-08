package com.bytedance.android.btm.impl.page.unknown;

import X.C786410Ut5;
import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class UnionBufferBtm implements Serializable {
    public final String btm;
    public final BufferBtm bufferBtm;
    public final String pageId;
    public final int unionStep;

    public final UnionBufferBtm copy() {
        return new UnionBufferBtm(this.btm, this.unionStep, this.pageId, this.bufferBtm);
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("btm", this.btm);
            jSONObject.put("union_step", this.unionStep);
            jSONObject.put("page_id", this.pageId);
            jSONObject.put("buffer_btm", this.bufferBtm);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public final String getBtm() {
        return this.btm;
    }

    public final BufferBtm getBufferBtm() {
        return this.bufferBtm;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final int getUnionStep() {
        return this.unionStep;
    }

    public UnionBufferBtm(String str, int i, String str2, BufferBtm bufferBtm) {
        this.btm = str;
        this.unionStep = i;
        this.pageId = str2;
        this.bufferBtm = bufferBtm;
    }
}
