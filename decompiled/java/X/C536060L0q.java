package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.ss.android.ugc.cut_ui.MediaItem;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0L0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536060L0q implements InterfaceC522270Ke1 {
    public final Activity LIZ;
    public C537930L7v LIZIZ;
    public CutsameDataItem LIZJ;

    @Override // X.InterfaceC522270Ke1
    public final ArrayList<CutSameVideoImageExtraData> LIZIZ() {
        C537930L7v c537930L7v = this.LIZIZ;
        if (C1256140inE.LIZ(c537930L7v != null ? c537930L7v.LIZ : null)) {
            return null;
        }
        ArrayList<CutSameVideoImageExtraData> arrayList = new ArrayList<>();
        Iterator<MediaItem> it2 = this.LIZIZ.LIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(new CutSameVideoImageExtraData(null, it2.next().duration, 30));
        }
        return arrayList;
    }

    @Override // X.InterfaceC522270Ke1
    public final String LIZJ() {
        CutsameDataItem cutsameDataItemLIZIZ = C536810L3n.LIZIZ();
        if (cutsameDataItemLIZIZ != null) {
            return cutsameDataItemLIZIZ.title;
        }
        return null;
    }

    @Override // X.InterfaceC522270Ke1
    public final Integer LJ() {
        CutsameDataItem cutsameDataItemLIZIZ = C536810L3n.LIZIZ();
        if (cutsameDataItemLIZIZ != null) {
            return Integer.valueOf(cutsameDataItemLIZIZ.isMvAnchor);
        }
        return null;
    }

    @Override // X.InterfaceC522270Ke1
    public final String LJI() {
        CutsameDataItem cutsameDataItemLIZIZ = C536810L3n.LIZIZ();
        if (cutsameDataItemLIZIZ != null) {
            return cutsameDataItemLIZIZ.templateId;
        }
        return null;
    }

    public C536060L0q(Activity activity) {
        this.LIZ = activity;
    }

    @Override // X.InterfaceC522270Ke1
    public final void LJFF(Intent intent) {
        ArrayList<MediaItem> arrayList;
        C537930L7v c537930L7v = this.LIZIZ;
        ArrayList<MediaItem> arrayList2 = null;
        if (c537930L7v != null) {
            arrayList = c537930L7v.LIZ;
        } else {
            arrayList = null;
        }
        if (!C1256140inE.LIZ(arrayList)) {
            C537930L7v c537930L7v2 = this.LIZIZ;
            if (c537930L7v2 != null) {
                arrayList2 = c537930L7v2.LIZ;
            }
            intent.putParcelableArrayListExtra("key_cutsame_data", arrayList2);
        }
        CutsameDataItem cutsameDataItem = this.LIZJ;
        if (cutsameDataItem != null) {
            intent.putExtra("Key_cutsame_item", cutsameDataItem);
        }
    }

    @Override // X.InterfaceC522270Ke1
    public final boolean LIZ(InterfaceC522120Kdm interfaceC522120Kdm, MediaModel mediaModel) {
        if (this.LIZ == null) {
            return false;
        }
        if (interfaceC522120Kdm == null || mediaModel == null || !mediaModel.LJIILJJIL()) {
            return true;
        }
        interfaceC522120Kdm.LJIJI();
        return true;
    }

    public final void LJII(Intent intent, C522080Kdi c522080Kdi) {
        C537930L7v c537930L7vLIZ = C537920L7u.LIZ(intent);
        String stringExtra = null;
        if (c537930L7vLIZ == null) {
            c537930L7vLIZ = null;
        }
        CutsameDataItem cutsameDataItem = (CutsameDataItem) intent.getParcelableExtra("Key_cutsame_item");
        try {
            stringExtra = intent.getStringExtra("picker_mode");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (c537930L7vLIZ != null && cutsameDataItem != null && stringExtra != null && c537930L7vLIZ.LIZ.size() > 0) {
            C0L96 c0l96ValueOf = C0L96.valueOf(stringExtra);
            this.LIZIZ = c537930L7vLIZ;
            this.LIZJ = cutsameDataItem;
            if (c0l96ValueOf == C0L96.SINGLE) {
                c522080Kdi.LIZIZ(2, 1);
                return;
            }
            if (c0l96ValueOf != C0L96.MULTI) {
                return;
            }
            ArrayList<MediaItem> arrayList = c537930L7vLIZ.LIZ;
            if (C1256140inE.LIZ(arrayList)) {
                c522080Kdi.LIZ();
                return;
            } else {
                c522080Kdi.LIZIZ(1, arrayList.size());
                return;
            }
        }
        c522080Kdi.LIZ();
    }

    @Override // X.InterfaceC522270Ke1
    public final void LIZLLL(Activity activity, int i, int i2, Intent intent) {
        new C0L82(activity, i, i2, intent, this.LIZJ, null, null).LIZ();
    }
}
