package X;

import android.content.Context;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0dPC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1049040dPC {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(341));
    public Aweme LIZIZ;
    public C1049170dPP LIZJ;

    public abstract String LIZIZ();

    public final InterfaceC1008930cMV LIZ() {
        Context context;
        Object obj;
        C690870R8b c690870R8b;
        C0RF0 c0rf0;
        IFeedService iFeedService = (IFeedService) this.LIZ.getValue();
        String str = null;
        if (iFeedService == null) {
            return null;
        }
        C1049060dPE c1049060dPE = ((C1049110dPJ) this).LJFF.LLJ;
        if (c1049060dPE != null) {
            context = c1049060dPE.LIZIZ;
            obj = c1049060dPE.LJIIIZ;
        } else {
            context = null;
            obj = null;
        }
        if ((obj instanceof C690870R8b) && (c690870R8b = (C690870R8b) obj) != null && (c0rf0 = c690870R8b.LIZLLL) != null) {
            str = c0rf0.LJIIIZ;
        }
        return iFeedService.LIZJ(context, this.LIZIZ, str, true);
    }
}
