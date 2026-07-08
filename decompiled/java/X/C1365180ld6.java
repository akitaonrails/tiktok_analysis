package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ld6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365180ld6 implements InterfaceC878050YcV {
    public final /* synthetic */ InterfaceC1362600lYw LIZ;
    public final /* synthetic */ SharePackage LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ List<IMContact> LIZLLL;

    @Override // X.InterfaceC878050YcV
    public final void LIZ(AbstractC878010YcR abstractC878010YcR) {
        InterfaceC1362600lYw interfaceC1362600lYw;
        String string;
        Bundle bundle;
        Bundle bundle2;
        if (abstractC878010YcR instanceof C878020YcS) {
            InterfaceC1362600lYw interfaceC1362600lYw2 = this.LIZ;
            if (interfaceC1362600lYw2 != null) {
                interfaceC1362600lYw2.LJFF(this.LIZIZ);
            }
            SharePackage sharePackage = this.LIZIZ;
            String string2 = null;
            if (sharePackage != null && (bundle2 = sharePackage.extras) != null) {
                string = bundle2.getString("enter_from");
            } else {
                string = null;
            }
            boolean zLJFF = Intrinsics.LJFF(string, "publish_share_panel");
            SharePackage sharePackage2 = this.LIZIZ;
            if (sharePackage2 != null && (bundle = sharePackage2.extras) != null) {
                string2 = bundle.getString("enter_method");
            }
            boolean zLJFF2 = Intrinsics.LJFF(string2, "download");
            if (zLJFF || zLJFF2) {
                IInternalShareApi.LIZ.getClass();
                C1370970lmR.LIZ().LIZJ().LJIILLIIL(this.LIZIZ, this.LIZJ, new ArrayList(this.LIZLLL), System.currentTimeMillis(), C0I0B.LJFF.LIZIZ(), -1);
            }
            C1365220ldA c1365220ldA = C1365220ldA.LIZ;
            C878020YcS c878020YcS = (C878020YcS) abstractC878010YcR;
            BaseTemplate baseTemplate = c878020YcS.LIZ;
            String str = c878020YcS.LIZIZ;
            List<IMContact> list = this.LIZLLL;
            c1365220ldA.getClass();
            C1365220ldA.LJI(baseTemplate, str, list);
            return;
        }
        if (abstractC878010YcR instanceof C878040YcU) {
            InterfaceC1362600lYw interfaceC1362600lYw3 = this.LIZ;
            if (interfaceC1362600lYw3 != null) {
                interfaceC1362600lYw3.LIZ(this.LIZIZ);
            }
            String string3 = this.LIZIZ.extras.getString("share_datasource_scene", "default");
            C1365220ldA c1365220ldA2 = C1365220ldA.LIZ;
            List<IMContact> list2 = this.LIZLLL;
            c1365220ldA2.getClass();
            ArrayList<String> arrayList = C805520Vio.LIZ;
            C805530Vip.LIZ().LIZLLL("recent share", string3, list2);
            return;
        }
        if (!(abstractC878010YcR instanceof C878030YcT) || (interfaceC1362600lYw = this.LIZ) == null) {
            return;
        }
        interfaceC1362600lYw.LJI(this.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1365180ld6(InterfaceC1362600lYw interfaceC1362600lYw, SharePackage sharePackage, String str, List<? extends IMContact> list) {
        this.LIZ = interfaceC1362600lYw;
        this.LIZIZ = sharePackage;
        this.LIZJ = str;
        this.LIZLLL = list;
    }
}
