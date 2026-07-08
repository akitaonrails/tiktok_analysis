package X;

import Y.AfS141S0200000_5;
import Y.AkS470S0100000_5;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EZh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366710EZh extends AbstractC365870EWb {
    public final C554970Lpf LIZ;
    public final ArrayList<String> LIZIZ = new ArrayList<>();
    public final int LIZJ = 5;
    public final int LIZLLL = 150;
    public final boolean LJ = !C297640Bla.LIZ();

    @Override // X.AbstractC365870EWb
    public final boolean LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC365900EWe
    public final int LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC365900EWe
    public final C554970Lpf getParams() {
        return this.LIZ;
    }

    @Override // X.InterfaceC365900EWe
    public final int getPriority() {
        return this.LIZLLL;
    }

    public C366710EZh(C554970Lpf c554970Lpf) {
        this.LIZ = c554970Lpf;
    }

    @Override // X.InterfaceC365900EWe
    public final Object LIZJ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        List<SingleImageData> imageList;
        if (this.LIZ.LJ.LJIIL()) {
            ImageAlbumData imageAlbumData = this.LIZ.LJ.LJJJJIZL.imageAlbumData;
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                Iterator<SingleImageData> it2 = imageList.iterator();
                while (it2.hasNext()) {
                    String filterId = it2.next().getFilterInfo().getFilterId();
                    if (filterId.length() > 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJLIIIIJ(""));
                        sbLIZ.append(filterId);
                        if (!C2354709Kn.LIZIZ(C2188811AlT.LIZIZ(sbLIZ))) {
                            this.LIZIZ.add(filterId);
                        }
                    }
                }
            }
            return Boolean.valueOf(this.LIZIZ.isEmpty());
        }
        String str = this.LIZ.LJ.LJJJJIZL.selectedFilterId;
        if (str != null && str.length() != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJLIIIIJ(""));
            sbLIZ2.append(str);
            if (C2354709Kn.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2))) {
                return true;
            }
            ArrayList arrayList = new ArrayList(a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(it3.next(), CardStruct.IStatusCode.DEFAULT)) {
                    it3.remove();
                }
            }
            if (arrayList.isEmpty()) {
                return true;
            }
            this.LIZIZ.add(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
            return false;
        }
        return true;
    }

    @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
    public final Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        List<SingleImageData> imageList;
        boolean z = false;
        if (this.LIZ.LJ.LJIIL()) {
            ImageAlbumData imageAlbumData = this.LIZ.LJ.LJJJJIZL.imageAlbumData;
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null && !imageList.isEmpty()) {
                Iterator<SingleImageData> it2 = imageList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!a0.LJJJIL(it2.next().getFilterInfo().getFilterId())) {
                        z = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(!z);
        }
        String str = this.LIZ.LJ.LJJJJIZL.selectedFilterId;
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC365870EWb
    public final Object LJII(InterfaceC1364105Vn<? super List<DraftFileRestoreResult>> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftFilterRestoreHandler");
        sbLIZ.append(" ; restore start ...");
        C0M7M.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c2252611DEt.LJJII(new AwS371S0200000_5(this, (C11JF) C0CHQ.LIZ().LJJIL().LIZIZ().LIZIZ(false).LJJJ(new AkS470S0100000_5(this, 3), false).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS141S0200000_5(c2252611DEt, this, 2), new AfS141S0200000_5(c2252611DEt, this, 3)), 279));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
