package X;

import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcAvatarViewModel;
import java.util.List;

/* JADX INFO: renamed from: X.0htD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1221410htD implements InterfaceC1221510htN {
    public final /* synthetic */ C118300cf LIZ;
    public final /* synthetic */ ProfileAigcAvatarViewModel LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ C118300cf LIZLLL;
    public final /* synthetic */ List<String> LJ;

    @Override // X.InterfaceC1221510htN
    public final void LIZ(EnumC1221500htM enumC1221500htM, Integer num) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("save to album callback, result code: ");
        sbLIZ.append(enumC1221500htM);
        sbLIZ.append(",saved photo count: ");
        sbLIZ.append(num);
        C2188811AlT.LIZIZ(sbLIZ);
        int i2 = C1221490htL.LIZ[enumC1221500htM.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    C118300cf c118300cf = this.LIZLLL;
                    int i3 = c118300cf.element + 1;
                    c118300cf.element = i3;
                    this.LIZIZ.wQ2(i3, this.LIZ.element, this.LJ.size());
                    return;
                }
                throw new C1954807lC();
            }
            return;
        }
        this.LIZ.element++;
        this.LIZIZ.LLJI.LIZIZ(this.LIZJ, EnumC1997807s8.TOOLS_API);
        this.LIZIZ.wQ2(this.LIZLLL.element, this.LIZ.element, this.LJ.size());
    }

    public C1221410htD(ProfileAigcAvatarViewModel profileAigcAvatarViewModel, String str, List list, C118300cf c118300cf, C118300cf c118300cf2) {
        this.LIZ = c118300cf;
        this.LIZIZ = profileAigcAvatarViewModel;
        this.LIZJ = str;
        this.LIZLLL = c118300cf2;
        this.LJ = list;
    }
}
