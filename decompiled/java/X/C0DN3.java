package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0DN3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DN3 implements IEvent {
    public final EnumC337980DMu LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;

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
        sbLIZ.append("SchoolEvent{type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", schoolId='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", schoolName='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", graduationYear=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DN3(EnumC337980DMu enumC337980DMu, String str, String str2, Integer num) {
        this.LIZ = enumC337980DMu;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = num;
    }
}
