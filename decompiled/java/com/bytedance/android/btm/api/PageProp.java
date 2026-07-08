package com.bytedance.android.btm.api;

import X.C21255918Gf;
import X.C21258618Hg;
import X.C21258718Hh;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1294060jmO;
import X.InterfaceC21259518Hp;
import com.bytedance.android.btm.api.cache.ISavable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class PageProp implements Serializable, ISavable<PageProp> {
    public static final C21258618Hg Companion = new Object() { // from class: X.18Hg
    };
    public static final long serialVersionUID = 20220104;
    public boolean auto;
    public String btm;
    public boolean ignoreSystemFirstResume;
    public boolean reuse;
    public boolean singleton;
    public String sourceBtmToken;

    public PageProp() {
        this("", true, false, false, null, false);
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getAuto$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getReuse$annotations() {
    }

    public final PageProp copy(String str, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
        return new PageProp(str, z, z2, z3, str2, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageProp)) {
            return false;
        }
        PageProp pageProp = (PageProp) obj;
        return Intrinsics.LJFF(this.btm, pageProp.btm) && this.auto == pageProp.auto && this.singleton == pageProp.singleton && this.reuse == pageProp.reuse && Intrinsics.LJFF(this.sourceBtmToken, pageProp.sourceBtmToken) && this.ignoreSystemFirstResume == pageProp.ignoreSystemFirstResume;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    public int hashCode() {
        int iHashCode = this.btm.hashCode() * 31;
        boolean z = this.auto;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = (iHashCode + r0) * 31;
        boolean z2 = this.singleton;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i2 = (i + r02) * 31;
        boolean z3 = this.reuse;
        ?? r03 = z3;
        if (z3) {
            r03 = 1;
        }
        int i3 = (i2 + r03) * 31;
        String str = this.sourceBtmToken;
        return ((i3 + (str == null ? 0 : str.hashCode())) * 31) + (this.ignoreSystemFirstResume ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageProp(btm=");
        sbLIZ.append(this.btm);
        sbLIZ.append(", auto=");
        sbLIZ.append(this.auto);
        sbLIZ.append(", singleton=");
        sbLIZ.append(this.singleton);
        sbLIZ.append(", reuse=");
        sbLIZ.append(this.reuse);
        sbLIZ.append(", sourceBtmToken=");
        sbLIZ.append(this.sourceBtmToken);
        sbLIZ.append(", ignoreSystemFirstResume=");
        sbLIZ.append(this.ignoreSystemFirstResume);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.android.btm.api.cache.ISavable
    public String save() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("btm", this.btm);
            jSONObject.putOpt("auto", Boolean.valueOf(this.auto));
            jSONObject.putOpt("singleton", Boolean.valueOf(this.singleton));
            jSONObject.putOpt("reuse", Boolean.valueOf(this.reuse));
            jSONObject.putOpt("ignoreSystemFirstResume", Boolean.valueOf(this.ignoreSystemFirstResume));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public final boolean getAuto() {
        return this.auto;
    }

    public final String getBtm() {
        return this.btm;
    }

    public final boolean getIgnoreSystemFirstResume() {
        return this.ignoreSystemFirstResume;
    }

    public final boolean getReuse() {
        return this.reuse;
    }

    public final boolean getSingleton() {
        return this.singleton;
    }

    public final String getSourceBtmToken() {
        return this.sourceBtmToken;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.btm.api.cache.ISavable
    public PageProp parse(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.btm = jSONObject.optString("btm");
            this.auto = jSONObject.optBoolean("auto");
            this.singleton = jSONObject.optBoolean("singleton");
            this.reuse = jSONObject.optBoolean("reuse");
            this.ignoreSystemFirstResume = jSONObject.optBoolean("ignoreSystemFirstResume");
            return this;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C21255918Gf c21255918Gf = new C21255918Gf(e);
            InterfaceC21259518Hp interfaceC21259518Hp = C21258718Hh.LIZ;
            if (interfaceC21259518Hp != null) {
                interfaceC21259518Hp.LIZ(c21255918Gf);
            }
            return this;
        }
    }

    public final void setAuto(boolean z) {
        this.auto = z;
    }

    public final void setBtm(String str) {
        this.btm = str;
    }

    public final void setIgnoreSystemFirstResume(boolean z) {
        this.ignoreSystemFirstResume = z;
    }

    public final void setReuse(boolean z) {
        this.reuse = z;
    }

    public final void setSingleton(boolean z) {
        this.singleton = z;
    }

    public final void setSourceBtmToken(String str) {
        this.sourceBtmToken = str;
    }

    @Override // com.bytedance.android.btm.api.cache.ISavable
    public /* bridge */ /* synthetic */ PageProp parse(String str) {
        parse(str);
        return this;
    }

    public PageProp(String str, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
        this.btm = str;
        this.auto = z;
        this.singleton = z2;
        this.reuse = z3;
        this.sourceBtmToken = str2;
        this.ignoreSystemFirstResume = z4;
    }
}
