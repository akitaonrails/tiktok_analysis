package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;

/* JADX INFO: renamed from: X.0leD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365870leD implements IEvent {
    public final IMContact LIZ;
    public final List<IMContact> LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final int LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public final boolean LJIILIIL;

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

    public C1365870leD(List<IMContact> list, IMContact iMContact, int i, boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, boolean z3, boolean z4) {
        this.LIZIZ = list;
        this.LIZ = iMContact;
        this.LJIIJ = i;
        this.LIZJ = z;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = z2;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = str5;
        this.LJIILIIL = z4;
    }
}
