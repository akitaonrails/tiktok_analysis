package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06bk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1641406bk implements IEvent {
    public final String LIZ;
    public final String LIZIZ;
    public final XBaseParamModel LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1641406bk)) {
            return false;
        }
        C1641406bk c1641406bk = (C1641406bk) obj;
        return Intrinsics.LJFF(this.LIZ, c1641406bk.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1641406bk.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1641406bk.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnoleJSBEvent(eventName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", containerID=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1641406bk(String str, String str2, XBaseParamModel xBaseParamModel) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = xBaseParamModel;
    }
}
