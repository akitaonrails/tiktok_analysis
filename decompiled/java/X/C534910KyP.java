package X;

import com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentRoomDatabase;
import java.util.List;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0KyP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C534910KyP {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(364));

    public final synchronized List<C535020Kya> LIZJ() {
        return LIZ().LJFF();
    }

    public final synchronized int LJI() {
        return LIZ().LJ();
    }

    public final InterfaceC534920KyQ LIZ() {
        return ((AlbumAiContentRoomDatabase) ((C533720KwU) this.LIZ.getValue()).LIZ()).LIZ();
    }

    public final synchronized void LIZIZ(C535020Kya c535020Kya) {
        LIZ().LIZLLL(c535020Kya);
    }

    public final synchronized List<C535020Kya> LIZLLL(int i) {
        return LIZ().LIZJ(i);
    }

    public final synchronized List<C535020Kya> LJ(String str) {
        return LIZ().LJI(str);
    }

    public final synchronized List<C535020Kya> LJFF(String str) {
        return LIZ().LIZIZ(str);
    }
}
