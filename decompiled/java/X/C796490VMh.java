package X;

import Y.ACallableS245S0200000_13;
import Y.ACallableS29S0100100_13;
import Y.ACallableS69S1200000_13;
import Y.AObjectS190S0300000_9;
import android.os.CancellationSignal;
import com.ss.android.ugc.aweme.business.common.dc.SkylightUnifiedDB;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0VMh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C796490VMh implements InterfaceC611220NyC {
    public final AbstractC796540VMm LIZ;
    public final C0P49 LIZIZ;
    public final C611580Nym LIZJ = new Object() { // from class: X.0Nym
    };
    public final C726930SfL LIZLLL = new C726930SfL();
    public final C854550Xfh LJ;
    public final C854550Xfh LJFF;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Nym] */
    public C796490VMh(SkylightUnifiedDB skylightUnifiedDB) {
        this.LIZ = skylightUnifiedDB;
        this.LIZIZ = new C0P49(this, skylightUnifiedDB, 3);
        this.LJ = new C854550Xfh(skylightUnifiedDB, 39);
        this.LJFF = new C854550Xfh(skylightUnifiedDB, 40);
    }

    @Override // X.InterfaceC611220NyC
    public final Object LIZ(long j, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS29S0100100_13(this, j, 2), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC611220NyC
    public final Object LIZLLL(List<String> list, InterfaceC1364105Vn<? super List<C611300NyK>> interfaceC1364105Vn) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM skylight_story_collection WHERE author_id IN (");
        int size = list.size();
        C0VIY.LIZ(sb, size);
        sb.append(")");
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(size, sb.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                c0vn5LIZLLL.LLD(i);
            } else {
                c0vn5LIZLLL.LJIILIIL(i, str);
            }
            i++;
        }
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 25), interfaceC1364105Vn);
    }

    public final Object LJ(List list, C611360NyQ c611360NyQ) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS245S0200000_13(this, list, 24), c611360NyQ);
    }

    @Override // X.InterfaceC611220NyC
    public final Object LIZIZ(String str, UserStory userStory, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS69S1200000_13(str, userStory, this, 1), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC611220NyC
    public final Object LIZJ(List<C611300NyK> list, List<C611330NyN> list2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C0WX0.LIZIZ(this.LIZ, new AObjectS190S0300000_9(this, list, list2, 1), interfaceC1364105Vn);
    }
}
