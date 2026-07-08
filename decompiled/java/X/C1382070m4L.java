package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.manager.MAFListManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS259S0000000_21;

/* JADX INFO: renamed from: X.0m4L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1382070m4L extends AbstractC2250601D7a<MAFIMUser, IMContact> {
    public boolean LJI;
    public final PrivacySettingsFeature LJII = C1336205Ku.LIZ(false).getImPrivacySettings();
    public final AFwS259S0000000_21 LJIIIIZZ = AFwS259S0000000_21.get$arr$(12);

    @Override // X.AbstractC2250601D7a
    public final Function1<MAFIMUser, IMContact> LIZJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC2250601D7a
    public final Object LJ(InterfaceC1364105Vn<? super List<MAFIMUser>> interfaceC1364105Vn) {
        if (!this.LJII.LJIJ() && !this.LJI) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(MAFListManager.LIZLLL.getValue().LJFF());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadInternal:");
        sbLIZ.append(arrayList.size());
        C2188811AlT.LIZIZ(sbLIZ);
        return new ArrayList(arrayList);
    }

    @Override // X.AbstractC2250601D7a
    public final Object LJI(InterfaceC1364105Vn<? super List<MAFIMUser>> interfaceC1364105Vn) {
        return new ArrayList();
    }
}
