package X;

import Y.AfS198S0100000_29;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.SimpleMusicRequestParam;
import com.ss.android.ugc.aweme.tools.music.utils.IEditMusicServiceApi;

/* JADX INFO: renamed from: X.11ZB, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11ZB implements C11ZD, InterfaceC19523111Zt<C11ZD> {
    @Override // X.InterfaceC19523111Zt
    public final C11ZA LJIIIIZZ() {
        return this;
    }

    @Override // X.C11ZD
    public final Object LIZIZ(String str, String str2, String str3, C11ZR c11zr) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c11zr));
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IEditMusicServiceApi.class, false, false, false, 14, null);
        if (objPluggableSpi$default != null) {
            ((IEditMusicServiceApi) objPluggableSpi$default).LJI(System.currentTimeMillis(), new SimpleMusicRequestParam(false, 0L, 0, str, null, false, null, str2, null, null, null, null, null, null, null, null, null, null, str3, false, false, 0L, false, 1, null, null, null, null, false, false, 0, false, false, null)).LJL(C11S5.LIZ()).LJJLL(new AfS198S0100000_29(c23260099m, 69), new AfS198S0100000_29(c23260099m, 70));
            Object objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(c11zr);
            }
            return objLIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
