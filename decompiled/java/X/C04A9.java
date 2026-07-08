package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NextRequestScene;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.04A9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04A9 {
    public final SeaPdpViewModel LIZ;
    public final List<C04AA> LIZIZ = C1697810uHb.LJIIJJI(new C04AA() { // from class: X.04A5
        public static final /* synthetic */ int LIZ = 0;

        @Override // X.C04AA
        public final C0NLF getId() {
            return C0NLF.PROMOTION_TRIGGER_POPUP;
        }

        /* JADX WARN: Removed duplicated region for block: B:128:0x0208 A[Catch: all -> 0x021a, CancellationException -> 0x0253, TryCatch #4 {CancellationException -> 0x0253, all -> 0x021a, blocks: (B:126:0x0202, B:134:0x0216, B:128:0x0208, B:130:0x020c, B:133:0x0213), top: B:171:0x0202 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0154 A[Catch: all -> 0x0166, CancellationException -> 0x029d, TryCatch #5 {CancellationException -> 0x029d, all -> 0x0166, blocks: (B:86:0x014e, B:94:0x0162, B:88:0x0154, B:90:0x0158, B:93:0x015f), top: B:169:0x014e }] */
        @Override // X.C04AA
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r22, X.C0NL6 r23, org.json.JSONObject r24) {
            /*
                Method dump skipped, instruction units count: 679
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C04A5.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel, X.0NL6, org.json.JSONObject):void");
        }

        @Override // X.C04AA
        public final void LIZ(SeaPdpViewModel seaPdpViewModel, Integer num, String str, List list, String str2, String str3, String str4) {
            C04A8.LIZIZ(seaPdpViewModel, num, str, list, str2, str4);
        }
    }, new C04AA() { // from class: X.04A7
        @Override // X.C04AA
        public final C0NLF getId() {
            return C0NLF.PRE_SCENE_AUTO_CLAIMED_POPUP;
        }

        @Override // X.C04AA
        public final void LIZIZ(SeaPdpViewModel seaPdpViewModel, C0NL6 c0nl6, JSONObject jSONObject) {
            String strLIZ;
            List<NextRequestScene> list;
            ProductPackStruct productPackStruct = seaPdpViewModel.LLJIJIL;
            if (productPackStruct != null && (list = productPackStruct.nextRequestScenes) != null) {
                strLIZ = C10478047w.LIZ(list, c0nl6);
            } else {
                strLIZ = null;
            }
            LIZ(seaPdpViewModel, Integer.valueOf(C0NLF.PRE_SCENE_AUTO_CLAIMED_POPUP.getValue()), null, null, strLIZ, null, null);
        }

        @Override // X.C04AA
        public final void LIZ(SeaPdpViewModel seaPdpViewModel, Integer num, String str, List list, String str2, String str3, String str4) {
            C04A8.LIZIZ(seaPdpViewModel, num, str, list, str2, str4);
        }
    });
    public boolean LIZJ;

    public C04A9(SeaPdpViewModel seaPdpViewModel) {
        this.LIZ = seaPdpViewModel;
    }

    public final C04AA LIZ(C0NLF c0nlf) {
        C04AA next;
        Iterator<C04AA> it2 = this.LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getId() == c0nlf) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }
}
