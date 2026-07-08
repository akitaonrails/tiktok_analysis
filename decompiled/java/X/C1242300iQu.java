package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.module.NotificationChunkVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS127S0101000_19;

/* JADX INFO: renamed from: X.0iQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1242300iQu implements InterfaceC1906690ziV, InterfaceC336510DHd {
    public final C1242390iR3 LL;
    public final NotificationChunkVM LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(265));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(264));

    @Override // X.InterfaceC1906690ziV
    public final void LLJIJIL() {
    }

    @Override // X.InterfaceC1906690ziV
    public final void LIZ(int i) {
        this.LL.LJJ().LIZIZ();
    }

    public final void LIZIZ(int i) {
        ArrayList arrayList;
        NotificationChunkVM notificationChunkVM = this.LLILLJJLI;
        Collection collection = (Collection) ((LiveData) notificationChunkVM.LLJILJILJ.getValue()).getValue();
        Integer numValueOf = null;
        if (collection != null) {
            arrayList = new ArrayList(collection);
            int i2 = i + 1;
            int i3 = 0;
            if (arrayList != null && !arrayList.isEmpty() && i2 >= 0 && i2 < arrayList.size() && (ListProtector.get(arrayList, i2) instanceof C1242240iQo)) {
                C1242240iQo c1242240iQo = (C1242240iQo) ListProtector.get(arrayList, i2);
                C1242280iQs c1242280iQs = notificationChunkVM.LLJILJIL;
                c1242280iQs.LIZ.remove(c1242240iQo);
                c1242280iQs.LIZIZ.remove(c1242240iQo);
                MusNotice musNotice = c1242240iQo.LLILLJJLI;
                if (musNotice != null) {
                    c1242280iQs.LIZJ.remove(musNotice);
                }
                Iterator<C1242250iQp> it2 = c1242280iQs.LIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().LL = i3;
                    i3++;
                }
                ListProtector.remove(arrayList, i2);
                ((LiveData) notificationChunkVM.LLJILJILJ.getValue()).setValue(arrayList);
                ((LiveData) notificationChunkVM.LLJILLL.getValue()).setValue(Boolean.TRUE);
                notificationChunkVM.vQ2(c1242240iQo.LLILLJJLI);
                return;
            }
        } else {
            arrayList = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delete invalid:");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        if (arrayList != null) {
            numValueOf = Integer.valueOf(arrayList.size());
        }
        sbLIZ.append(numValueOf);
        C1720106oR.LIZ("NotificationChunkVM", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1242300iQu(C1242390iR3 c1242390iR3, NotificationChunkVM notificationChunkVM) {
        this.LL = c1242390iR3;
        this.LLILLJJLI = notificationChunkVM;
    }

    public final void LIZJ(String str, boolean z) {
        if (z) {
            ((List) this.LLILLL.getValue()).add(str);
        } else {
            ((List) this.LLILLL.getValue()).remove(str);
        }
        Integer value = this.LL.LJJ().LIZ().getValue();
        int size = ((List) this.LLILLL.getValue()).size();
        if (value == null || value.intValue() != size) {
            this.LL.LJJ().LIZ().setValue(Integer.valueOf(((List) this.LLILLL.getValue()).size()));
        }
    }

    @Override // X.InterfaceC1906690ziV
    public final void LLJLLIL(int i, C1242320iQw c1242320iQw) {
        FragmentManager supportFragmentManager;
        if (this.LLILLJJLI.LLJIJIL == EnumC1242330iQx.COLLAPSE) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZ("NotificationChunk", "Do not support delete in collapse mode");
            return;
        }
        c1242320iQw.LIZ.lambda$onLongClick$0();
        C1390850mIV c1390850mIV = new C1390850mIV();
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(R.string.gm7);
        c1247510iZJ.LIZJ = 1;
        c1247510iZJ.LIZ(new AwS127S0101000_19(this, i, 1));
        c1390850mIV.LIZIZ(c1247510iZJ);
        TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
        C1242310iQv c1242310iQv = this.LL.LLIZLLLIL;
        Fragment fragment = c1242310iQv.LLILLJJLI;
        if (fragment == null || (supportFragmentManager = fragment.getFragmentManager()) == null) {
            supportFragmentManager = c1242310iQv.LL.getSupportFragmentManager();
        }
        tuxActionSheetLIZJ.show(supportFragmentManager, "DELETE_NOTICE_ACTION_SHEET_TAG");
    }
}
