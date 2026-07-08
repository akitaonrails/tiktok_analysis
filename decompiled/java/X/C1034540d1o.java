package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0d1o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1034540d1o implements IEvent {
    public static final /* synthetic */ int LJFF = 0;
    public final String LIZ;
    public final int LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final String LJ;

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

    public /* synthetic */ C1034540d1o(int i, String str, String str2, String str3) {
        this(i, str, str2, str3, null);
    }

    public C1034540d1o(int i, String str, String str2, String str3, Integer num) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = num;
        this.LIZLLL = str2;
        this.LJ = str3;
    }
}
