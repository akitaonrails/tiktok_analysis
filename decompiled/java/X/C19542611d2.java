package X;

import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCOptConfig;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.11d2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19542611d2 implements InterfaceC19523111Zt<InterfaceC19543611dC> {
    @Override // X.InterfaceC19523111Zt
    public final C11ZA LJIIIIZZ() {
        return new InterfaceC19543611dC() { // from class: X.0o7i
            @Override // X.InterfaceC19543611dC
            public final Object LJI(String str, String str2, C19541011cm c19541011cm) {
                C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c19541011cm));
                VCOptConfig vCOptConfigLIZ = C1461100o7o.LIZ();
                int i = vCOptConfigLIZ.sampleRate;
                int i2 = vCOptConfigLIZ.bitRate;
                int i3 = vCOptConfigLIZ.channels;
                if (i == 24000) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("error_type", "detachAudio");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("sampleRate=");
                    sbLIZ.append(i);
                    sbLIZ.append(",bitRate=");
                    sbLIZ.append(i2);
                    sbLIZ.append(",channels=");
                    sbLIZ.append(i3);
                    c2344009Gk.LJIIIIZZ("extra", C2188811AlT.LIZIZ(sbLIZ));
                    C20684815ws.LJIILLIIL("voice_conversion_extra_error", c2344009Gk.LIZ);
                    i = 44100;
                }
                List listSingletonList = Collections.singletonList(str2);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                arrayList.add(C2286608xc.LJFF(-1L));
                arrayList2.add(C2286608xc.LJFF(-1L));
                arrayList5.add(C2286608xc.LIZLLL(1.0f));
                arrayList3.add(C2286608xc.LJFF(-1L));
                arrayList4.add(C2286608xc.LJFF(-1L));
                Integer numLJ = C2286608xc.LJ(VEUtils.detachAudioFromVideos(str, (String[]) listSingletonList.toArray(new String[0]), C13LP.LLIIIILZ(arrayList), C13LP.LLIIIILZ(arrayList2), C13LP.LLIIIILZ(arrayList3), C13LP.LLIIIILZ(arrayList4), -1L, -1L, C13LP.LLI(arrayList5), vCOptConfigLIZ.channels, vCOptConfigLIZ.bitRate, i, VEUtils.CompatibleMode.Fill_silence));
                C189200o6.m2constructorimpl(numLJ);
                c23260099m.resumeWith(numLJ);
                Object objLIZ = c23260099m.LIZ();
                if (objLIZ == C099R.LJFF()) {
                    C099Q.LIZJ(c19541011cm);
                }
                return objLIZ;
            }
        };
    }
}
