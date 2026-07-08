package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModel;
import defpackage.d2;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0lBu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348320lBu implements d2 {
    public static final C1348320lBu LIZ = new C1348320lBu();
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static final MediatorLiveData LIZLLL;

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        LIZIZ = C452501pT.LIZ(enumC452301pR, AFwS209S0000000_21.get$arr$(92));
        C01GW c01gwLIZ = C452501pT.LIZ(enumC452301pR, AFwS209S0000000_21.get$arr$(91));
        LIZJ = c01gwLIZ;
        LIZLLL = (MediatorLiveData) c01gwLIZ.getValue();
    }

    public static d2 LJIIL() {
        return (d2) LIZIZ.getValue();
    }

    @Override // defpackage.d2
    public final boolean LIZJ() {
        return LJIIL().LIZJ();
    }

    @Override // defpackage.d2
    public final LiveData<d2.a> LIZLLL() {
        return LJIIL().LIZLLL();
    }

    @Override // defpackage.d2
    public final int LJFF() {
        return LJIIL().LJFF();
    }

    @Override // defpackage.d2
    public final float LIZ(String str) {
        return LJIIL().LIZ(str);
    }

    @Override // defpackage.d2
    public final void LIZIZ(String str) {
        LJIIL().LIZIZ(str);
    }

    @Override // defpackage.d2
    public final void LJ(String str) {
        LJIIL().LJ(str);
    }

    @Override // defpackage.d2
    public final void LJII(String str) {
        LJIIL().LJII(str);
    }

    @Override // defpackage.d2
    public final boolean LJIIJ(String str) {
        return LJIIL().LJIIJ(str);
    }

    @Override // defpackage.d2
    public final int LJIIJJI(String str) {
        return LJIIL().LJIIJJI(str);
    }

    @Override // defpackage.d2
    public final void LJI(String str, String str2) {
        LJIIL().LJI(str, str2);
    }

    @Override // defpackage.d2
    public final void LJIIIIZZ(String str, String str2) {
        LJIIL().LJIIIIZZ(str, str2);
    }

    @Override // defpackage.d2
    public final void LJIIIZ(String str, AudioCommentModel audioCommentModel) {
        LJIIL().LJIIIZ(str, audioCommentModel);
    }
}
