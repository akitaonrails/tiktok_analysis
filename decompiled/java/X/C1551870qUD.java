package X;

import android.accounts.NetworkErrorException;
import android.util.Pair;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.UpdatePackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0qUD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551870qUD extends AbstractC1552800qVi {
    public final AbstractC1552040qUU LIZ;
    public final OptionCheckUpdateParams LIZIZ;
    public final boolean LIZJ;

    @Override // X.AbstractC1552800qVi
    public final void LIZJ(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
        String from;
        List<UpdatePackage> list = (List) c1552250qUp.getOutputForType(C1551880qUE.class);
        Map<String, List<Pair<String, Long>>> map = (Map) c1552250qUp.getInputForType(C1551880qUE.class);
        HashMap map2 = new HashMap();
        for (UpdatePackage updatePackage : list) {
            String accessKey = updatePackage.getAccessKey();
            List arrayList = (List) map2.get(accessKey);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(updatePackage);
            map2.put(accessKey, arrayList);
        }
        OptionCheckUpdateParams optionCheckUpdateParams = this.LIZIZ;
        if (optionCheckUpdateParams != null && (from = optionCheckUpdateParams.getFrom()) != null && from.length() != 0) {
            C1551680qTu c1551680qTu = new C1551680qTu(this.LIZIZ.getFrom());
            c1551680qTu.LJFF = this.LIZIZ.isControlDownloading();
            c1552250qUp.setPipelineData("update_operation", c1551680qTu);
            AbstractC1552040qUU abstractC1552040qUU = this.LIZ;
            if (abstractC1552040qUU != null) {
                abstractC1552040qUU.LJIIIZ(map, map2, c1551680qTu);
            }
        } else {
            AbstractC1552040qUU abstractC1552040qUU2 = this.LIZ;
            if (abstractC1552040qUU2 != null) {
                abstractC1552040qUU2.LJIIIIZZ(map, map2);
            }
        }
        OptionCheckUpdateParams optionCheckUpdateParams2 = this.LIZIZ;
        if (optionCheckUpdateParams2 != null && optionCheckUpdateParams2.getCheckUpdateData() != null) {
            C1551800qU6 checkUpdateData = this.LIZIZ.getCheckUpdateData();
            checkUpdateData.LJIILIIL.LJIIJ = System.currentTimeMillis();
            if (this.LIZJ) {
                C1551780qU4.LJ(checkUpdateData);
                return;
            }
            if (!list.isEmpty()) {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((long) AbstractC19994813Le.Default.nextInt());
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((UpdatePackage) it2.next()).setRequestId(jCurrentTimeMillis);
                }
                C1551830qU9.LIZ.put(Long.valueOf(jCurrentTimeMillis), new C1553050qW7(list, checkUpdateData));
                return;
            }
            if (checkUpdateData.LJIILLIIL == 0) {
                checkUpdateData.LIZ = EnumC1552350qUz.CHECK_SUCCEED_NOT_FILTERED_ALL_DOWNLOADED;
            } else {
                checkUpdateData.LIZ = EnumC1552350qUz.CHECK_SUCCEED_FILTERED_ALL_DOWNLOADED;
            }
            C1551780qU4.LJ(checkUpdateData);
        }
    }

    public C1551870qUD(AbstractC1552040qUU abstractC1552040qUU, OptionCheckUpdateParams optionCheckUpdateParams, boolean z) {
        this.LIZ = abstractC1552040qUU;
        this.LIZIZ = optionCheckUpdateParams;
        this.LIZJ = z;
    }

    @Override // X.AbstractC1552800qVi
    public final void LIZLLL(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo, Throwable th) {
        C1551800qU6 checkUpdateData;
        C1551800qU6 checkUpdateData2;
        Map map = (Map) c1552250qUp.getInputForType(C1551880qUE.class);
        if (th instanceof C1969307nX) {
            int code = ((C1969307nX) th).getCode();
            AbstractC1552040qUU abstractC1552040qUU = this.LIZ;
            if (abstractC1552040qUU != null) {
                abstractC1552040qUU.LJI(code, th, map);
            }
            OptionCheckUpdateParams optionCheckUpdateParams = this.LIZIZ;
            if (optionCheckUpdateParams != null && (checkUpdateData2 = optionCheckUpdateParams.getCheckUpdateData()) != null) {
                checkUpdateData2.LJII = 1;
                EnumC1552280qUs enumC1552280qUs = EnumC1552280qUs.REQUEST_FAIL_INTERCEPT;
                if (code != enumC1552280qUs.getNumber() && code != EnumC1552280qUs.REQUEST_REPEAT.getNumber()) {
                    enumC1552280qUs = EnumC1552280qUs.SUCCEED;
                }
                checkUpdateData2.LJIIIZ = enumC1552280qUs;
            }
        } else {
            AbstractC1552040qUU abstractC1552040qUU2 = this.LIZ;
            if (abstractC1552040qUU2 != null) {
                abstractC1552040qUU2.LJII(th, map);
            }
        }
        OptionCheckUpdateParams optionCheckUpdateParams2 = this.LIZIZ;
        if (optionCheckUpdateParams2 != null && (checkUpdateData = optionCheckUpdateParams2.getCheckUpdateData()) != null) {
            if ((th instanceof C1553280qWU) || (th instanceof NetworkErrorException)) {
                checkUpdateData.LJIILIIL.LJI = System.currentTimeMillis();
            }
            checkUpdateData.LIZ = EnumC1552350qUz.CHECK_FAILED;
            checkUpdateData.LIZJ = th.getMessage();
            C1551780qU4.LJ(checkUpdateData);
        }
    }
}
