package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Dmd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC349250Dmd implements InterfaceC1446570nkN {
    public final VideoPublishEditModel LIZ;
    public final InterfaceC1452170ntP LIZIZ;
    public String LIZJ = "";

    public AbstractC349250Dmd(C349280Dmg c349280Dmg) {
        this.LIZ = c349280Dmg.LIZ;
        this.LIZIZ = c349280Dmg.LIZIZ;
    }

    @Override // X.InterfaceC1446570nkN
    public final void LIZLLL(final InterfaceC349260Dme interfaceC349260Dme) {
        C05YQ c05yq = C05YQ.LIZ;
        String str = this.LIZJ;
        c05yq.getClass();
        if (C2286708xd.LIZJ(str)) {
            C0CNO.LIZLLL(0L, new AwS549S0100000_5(this, 1313));
            if (interfaceC349260Dme != null) {
                interfaceC349260Dme.onSuccess();
                return;
            }
            return;
        }
        C05YQ.LIZ("requirement_ftgru", "unet_denoise_44k_music_model_v1.0", new InterfaceC1446480nkE() { // from class: X.0Dmc
            @Override // X.InterfaceC1446480nkE
            public final void onFailure() {
                InterfaceC349260Dme interfaceC349260Dme2 = interfaceC349260Dme;
                if (interfaceC349260Dme2 != null) {
                    interfaceC349260Dme2.onFailure();
                }
            }

            @Override // X.InterfaceC1446480nkE
            public final void onSuccess(String str2) {
                AbstractC349250Dmd abstractC349250Dmd = this.LIZ;
                abstractC349250Dmd.LIZJ = str2;
                C0CNO.LIZLLL(0L, new AwS549S0100000_5(abstractC349250Dmd, 1314));
                InterfaceC349260Dme interfaceC349260Dme2 = interfaceC349260Dme;
                if (interfaceC349260Dme2 != null) {
                    interfaceC349260Dme2.onSuccess();
                }
            }
        });
    }
}
