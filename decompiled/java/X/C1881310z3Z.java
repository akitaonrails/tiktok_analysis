package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixCardModel;
import java.util.List;

/* JADX INFO: renamed from: X.0z3Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1881310z3Z {
    public final InterfaceC1881340z3c LIZ;

    public C1881310z3Z(C1882980z6G c1882980z6G) {
        this.LIZ = c1882980z6G;
    }

    public final InterfaceC1883030z6L LIZ(Context context, MixCardModel mixCardModel) {
        InterfaceC1883030z6L interfaceC1883030z6LLIZ;
        InterfaceC1881340z3c interfaceC1881340z3c = this.LIZ;
        List list = mixCardModel.dataKeyPath;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        C1155600gB4 c1155600gB4 = new C1155600gB4(this.LIZ.LIZLLL(), C786410Ut5.J3(C1882380z5I.LJ(interfaceC1881340z3c, list)), mixCardModel);
        C1881880z4U c1881880z4ULJI = this.LIZ.LJI();
        String str = mixCardModel.cardClass;
        if (str == null) {
            str = "";
        }
        InterfaceC1881300z3Y interfaceC1881300z3YLIZ = c1881880z4ULJI.LIZ(str);
        if (interfaceC1881300z3YLIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("factory is null for cardClass: ");
            sbLIZ.append(mixCardModel.cardClass);
            C20441214yg.LJ("MixCardBuilder", C2188811AlT.LIZIZ(sbLIZ));
            interfaceC1883030z6LLIZ = null;
        } else {
            interfaceC1883030z6LLIZ = interfaceC1881300z3YLIZ.LIZ(context, c1155600gB4, this.LIZ);
            if (interfaceC1883030z6LLIZ == null) {
            }
            return interfaceC1883030z6LLIZ;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("createCard return null for cardClass: ");
        sbLIZ2.append(mixCardModel.cardClass);
        C20441214yg.LJ("MixCardBuilder", C2188811AlT.LIZIZ(sbLIZ2));
        return interfaceC1883030z6LLIZ;
    }
}
