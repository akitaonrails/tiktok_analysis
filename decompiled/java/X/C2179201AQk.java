package X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.PlayModel;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1AQk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179201AQk implements InterfaceC2178301AMy {
    public static final String LJIIIIZZ = C2179201AQk.class.getSimpleName();
    public final Context LIZ;
    public final InterfaceC2179191AQj LIZIZ;
    public final C1AOB LIZJ;
    public C2179231AQn LJFF;
    public long LJI;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4054));
    public EnumC2179211AQl LJ = EnumC2179211AQl.INIT;
    public InterfaceC2178461ANo LJII = new C2178451ANn();

    @Override // X.InterfaceC2178301AMy
    public final void LJFF(C1AN0 c1an0) {
    }

    @Override // X.InterfaceC2178301AMy
    public final void LJI() {
    }

    @Override // X.InterfaceC2178301AMy
    public final void LJII() {
    }

    @Override // X.InterfaceC2178301AMy
    public final void LJIIIIZZ(C1ANF c1anf) {
    }

    @Override // X.InterfaceC2178301AMy
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC2178301AMy
    public final void LJIIJ(long j) {
    }

    @Override // X.InterfaceC2178301AMy
    public final void LJIIJJI(long j) {
    }

    @Override // X.InterfaceC2178301AMy
    public final void LJIIL() {
    }

    @Override // X.InterfaceC2178301AMy
    public final void LJIILIIL() {
    }

    @Override // X.InterfaceC2178301AMy
    public final void LJIILJJIL(EnumC1782190wTh enumC1782190wTh) {
    }

    @Override // X.InterfaceC2178301AMy
    public final void LJIILL() {
    }

    public final InterfaceC2179221AQm LIZIZ() {
        return (InterfaceC2179221AQm) this.LIZLLL.getValue();
    }

    public final boolean LIZ(EnumC2179211AQl enumC2179211AQl) {
        EnumC2179211AQl enumC2179211AQl2 = this.LJ;
        if (enumC2179211AQl2 == EnumC2179211AQl.INIT) {
            this.LJ = enumC2179211AQl;
            return true;
        }
        if (enumC2179211AQl2.LL > enumC2179211AQl.LL) {
            this.LJ = enumC2179211AQl;
            return true;
        }
        return false;
    }

    public final void LIZJ(C1AN0 c1an0) {
        String str;
        C2179231AQn c2179231AQn = this.LJFF;
        if (c2179231AQn == null) {
            return;
        }
        if (c2179231AQn.LIZLLL != null && LIZ(EnumC2179211AQl.AFD)) {
            AssetFileDescriptor assetFileDescriptor = c2179231AQn.LIZLLL;
            if (assetFileDescriptor != null) {
                LIZIZ().LJIIZILJ(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getDeclaredLength());
                return;
            }
            return;
        }
        String str2 = c2179231AQn.LIZIZ;
        if (str2 != null && str2.length() > 0 && LIZ(EnumC2179211AQl.LOCAL_FILE)) {
            LIZIZ().LJIJ(c2179231AQn.LIZIZ);
            return;
        }
        String str3 = c2179231AQn.LIZJ;
        if (str3 != null && str3.length() > 0 && (str = c2179231AQn.LIZ) != null && str.length() != 0 && LIZ(EnumC2179211AQl.PRELOAD_CACHE)) {
            LIZIZ().LJ(c2179231AQn.LIZ, c2179231AQn.LIZJ);
            return;
        }
        PlayModel playModel = c2179231AQn.LJ;
        if (playModel != null && playModel.videoModelJsonObj != null && LIZ(EnumC2179211AQl.VIDEO_MODEL)) {
            PlayModel playModel2 = c2179231AQn.LJ;
            if (playModel2 == null) {
                return;
            }
            LIZIZ().LIZJ(playModel2.getResolution(), playModel2.getVideoModel());
            return;
        }
        String str4 = c2179231AQn.LIZ;
        if (str4 != null && str4.length() != 0 && LIZ(EnumC2179211AQl.PLAY_URL)) {
            LIZIZ().LJIJI(c2179231AQn.LIZ);
        } else {
            this.LJ = EnumC2179211AQl.INIT;
            this.LIZIZ.LJFF(c1an0);
        }
    }

    public C2179201AQk(Context context, C1ARQ c1arq, C1AOB c1aob) {
        this.LIZ = context;
        this.LIZIZ = c1arq;
        this.LIZJ = c1aob;
    }
}
