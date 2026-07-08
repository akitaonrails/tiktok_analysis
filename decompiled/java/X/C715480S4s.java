package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0S4s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C715480S4s implements IEvent {
    public final String LIZ;
    public final String LIZIZ;
    public final EnumC1390800mIQ LIZJ;
    public final int LIZLLL;
    public final Function1<Boolean, Unit> LJ = null;

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

    public C715480S4s(String str, String str2, EnumC1390800mIQ enumC1390800mIQ, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = enumC1390800mIQ;
        this.LIZLLL = i;
    }
}
