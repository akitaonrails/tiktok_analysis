package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QPB, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QPB implements InterfaceC2753014t {
    public static C0QPB LLILZLL;
    public final ECSearchEntranceData LL;
    public EnumC669620QOi LLILLJJLI;
    public SearchResultParam LLILZ;
    public CopyOnWriteArrayList<C669600QOg> LLILLL = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<C669600QOg> LLILZIL = new CopyOnWriteArrayList<>();

    public final C669600QOg LIZ() {
        CopyOnWriteArrayList<C669600QOg> copyOnWriteArrayList;
        try {
            copyOnWriteArrayList = this.LLILZIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "getLastSearchId failed");
        }
        if (!copyOnWriteArrayList.isEmpty()) {
            return (C669600QOg) C13LP.LJJLIIIJJI(copyOnWriteArrayList);
        }
        CopyOnWriteArrayList<C669600QOg> copyOnWriteArrayList2 = this.LLILLL;
        if (!copyOnWriteArrayList2.isEmpty()) {
            return (C669600QOg) C13LP.LJJLIIIJJI(copyOnWriteArrayList2);
        }
        return null;
    }

    public C0QPB(ECSearchEntranceData eCSearchEntranceData) {
        this.LL = eCSearchEntranceData;
        UUID.randomUUID().toString();
    }

    public final void LIZIZ(SearchResultParam searchResultParam, boolean z) {
        int iLIZIZ;
        Object obj;
        Fragment fragment;
        LifecycleOwner lifecycleOwnerLJFF;
        C650960Pg6 immutableData;
        if (Intrinsics.LJFF(this.LLILZ, searchResultParam)) {
            return;
        }
        this.LLILZ = searchResultParam;
        this.LLILLL = this.LLILZIL;
        this.LLILZIL = new CopyOnWriteArrayList<>();
        EnumC669620QOi enumC669620QOi = this.LLILLJJLI;
        if (enumC669620QOi != null) {
            iLIZIZ = C669740QOu.LIZIZ(enumC669620QOi);
        } else {
            iLIZIZ = -1;
        }
        if (!z) {
            return;
        }
        C674790QdR c674790QdR = C674790QdR.LIZ;
        int iLIZIZ2 = C669740QOu.LIZIZ(EnumC669620QOi.SHOP);
        C646000PVm c646000PVm = C650950Pg5.Companion;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        C669560QOc c669560QOc = null;
        if (abstractC1387200mCcLIZIZ != null) {
            obj = abstractC1387200mCcLIZIZ.LIZ;
        } else {
            obj = null;
        }
        if (obj instanceof Fragment) {
            fragment = (Fragment) obj;
        } else {
            fragment = null;
        }
        AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ2 != null) {
            lifecycleOwnerLJFF = abstractC1387200mCcLIZIZ2.LJFF();
        } else {
            lifecycleOwnerLJFF = null;
        }
        c646000PVm.getClass();
        C650950Pg5 c650950Pg5LJIIIZ = C646000PVm.LJIIIZ(fragment, lifecycleOwnerLJFF);
        if (c650950Pg5LJIIIZ != null && (immutableData = c650950Pg5LJIIIZ.getImmutableData()) != null) {
            c669560QOc = immutableData.searchEcommerceModel;
        }
        C674790QdR.LIZJ(c674790QdR, searchResultParam, true, false, iLIZIZ2, iLIZIZ, null, new C672630QZx(null, c669560QOc), null, false, 416);
    }
}
