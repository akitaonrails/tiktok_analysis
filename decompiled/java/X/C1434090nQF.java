package X;

import Y.AfS191S0100000_22;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.model.StoryGroupPublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.PublishProgressDialogAddHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nQF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434090nQF implements InterfaceC1433860nPs {
    public static final Map<String, String> LLIZLLLIL = new HashMap();
    public final InterfaceC1434080nQE LL;
    public final String LLILLJJLI;
    public final PublishModel LLILLL;
    public final boolean LLILZ;
    public final C1434100nQG LLILZIL;
    public final C01GW LLILZLL;
    public int LLIZ;

    @Override // X.InterfaceC1433360nP4
    public final void LIZLLL(String str) {
    }

    public final List<PublishModel> LJII() {
        List<PublishModel> allProgressValidPublishModel;
        IAVPublishService iAVPublishService = (IAVPublishService) this.LLILZLL.getValue();
        return (iAVPublishService == null || (allProgressValidPublishModel = iAVPublishService.getAllProgressValidPublishModel()) == null) ? C13BV.INSTANCE : allProgressValidPublishModel;
    }

    @Override // X.InterfaceC1433360nP4
    public final void LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishParallel ParallelPublishForUICallback ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" onCancel");
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        this.LLIZ = Math.max(this.LLIZ, 0);
    }

    @Override // X.InterfaceC1433860nPs
    public final boolean LIZ() {
        return this.LLILZ;
    }

    public final void LJI(PublishModel publishModel) {
        boolean z;
        Object obj;
        Object next;
        C1433730nPf.LJJI(this);
        if (publishModel != null) {
            this.LLILZIL.LIZ.remove(publishModel.publishId);
            ((HashMap) LLIZLLLIL).remove(publishModel.creationId);
        }
        IAVPublishService iAVPublishService = (IAVPublishService) this.LLILZLL.getValue();
        int iIntValue = 0;
        if (iAVPublishService != null && iAVPublishService.isParallelPublishTaskFinished()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PublishParallel ParallelPublishForUICallback ");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(" all task finish");
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            PublishProgressDialogAddHelper.LIZ.getClass();
            PublishProgressDialogAddHelper.LJI();
            return;
        }
        ArrayList arrayList = new ArrayList(LJII());
        arrayList.remove(this.LLILLL);
        if (arrayList.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder("PublishParallel ParallelPublishForUICallback ");
        sb.append(this.LLILLJJLI);
        sb.append(" isPublishSerial:false, switchToNextImage, allPublishModel:");
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((PublishModel) it2.next()).publishId);
        }
        sb.append(arrayList2.toArray(new String[0]));
        C201955140j.LJIIL(sb.toString());
        Iterator it3 = arrayList.iterator();
        while (true) {
            obj = null;
            if (it3.hasNext()) {
                next = it3.next();
                Integer num = this.LLILZIL.LIZ.get(((PublishModel) next).publishId);
                if (num == null || num.intValue() < 100) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PublishModel publishModel2 = (PublishModel) next;
        if (publishModel2 == null) {
            this.LL.hide();
            return;
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next2 = it4.next();
            if (!LJIIIIZZ((PublishModel) next2, publishModel2)) {
                obj = next2;
                break;
            }
        }
        PublishModel publishModel3 = (PublishModel) obj;
        if (publishModel3 == null) {
            LJIIJ(publishModel2);
            LJIIIZ(publishModel2, new AwS601S0100000_22(this, 228));
        } else {
            LJIIJ(publishModel2);
            LJIIIZ(publishModel2, new AwS388S0200000_22(this, publishModel3, 47));
        }
        Integer num2 = this.LLILZIL.LIZ.get(publishModel2.publishId);
        if (num2 != null) {
            iIntValue = num2.intValue();
        }
        this.LLILZIL.LIZIZ(iIntValue);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("PublishParallel ParallelPublishForUICallback ");
        sbLIZ2.append(this.LLILLJJLI);
        sbLIZ2.append(" switchToNextImage nextShowProgress:");
        sbLIZ2.append(iIntValue);
        sbLIZ2.append(", publishId:");
        sbLIZ2.append(publishModel2.publishId);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJIIJ(PublishModel publishModel) {
        this.LLILZIL.LJIIIIZZ.setValue((String) ((HashMap) LLIZLLLIL).get(publishModel.creationId));
        C1434100nQG c1434100nQG = this.LLILZIL;
        c1434100nQG.LJIIIZ.setValue(publishModel.editModel);
    }

    public static final boolean LJIIIIZZ(PublishModel publishModel, PublishModel publishModel2) {
        String str;
        String str2;
        if (publishModel2 == null) {
            return false;
        }
        StoryGroupPublishModel storyGroupPublishModel = publishModel.storyGroupPublishModel;
        if (storyGroupPublishModel == null || (str = storyGroupPublishModel.groupId) == null) {
            str = publishModel.creationId;
        }
        StoryGroupPublishModel storyGroupPublishModel2 = publishModel2.storyGroupPublishModel;
        if (storyGroupPublishModel2 == null || (str2 = storyGroupPublishModel2.groupId) == null) {
            str2 = publishModel2.creationId;
        }
        return Intrinsics.LJFF(str, str2);
    }

    @Override // X.InterfaceC1433360nP4
    public final void LIZIZ(C1434650nR9 c1434650nR9, PublishModel publishModel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishParallel ParallelPublishForUICallback ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" onError");
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        LJI(publishModel);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    @Override // X.InterfaceC1433360nP4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(int r4, X.C1434900nRY r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L2a
            com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r0 = r5.LIZJ
            if (r0 == 0) goto L15
            java.lang.String r2 = r0.publishId
            if (r2 == 0) goto L15
            X.0nQG r0 = r3.LLILZIL
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r0.LIZ
            r0.put(r2, r1)
        L15:
            com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r0 = r5.LIZJ
            if (r0 == 0) goto L2a
            java.lang.String r1 = r0.publishId
        L1b:
            X.0nQG r0 = r3.LLILZIL
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r0.LJIIIIZZ
            java.lang.Object r0 = r0.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L2c
            return
        L2a:
            r1 = 0
            goto L1b
        L2c:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "PublishParallel ParallelPublishForUICallback "
            r1.append(r0)
            java.lang.String r0 = r3.LLILLJJLI
            r1.append(r0)
            java.lang.String r0 = " onProgressUpdate "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJIIL(r0)
            if (r5 == 0) goto L52
            boolean r1 = r5.LJ
            r0 = 1
            if (r1 != r0) goto L52
            int r4 = r5.LJFF
        L52:
            int r1 = r3.LLIZ
            if (r4 >= r1) goto L5c
            X.0nQG r0 = r3.LLILZIL
            r0.LIZIZ(r1)
            return
        L5c:
            X.0nQG r0 = r3.LLILZIL
            r0.LIZIZ(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1434090nQF.LJFF(int, X.0nRY):void");
    }

    public final void LJIIIZ(PublishModel publishModel, Function1<? super Bitmap, Unit> function1) {
        AbstractC19484711Kz.LJII(new C1466820oH2(this, publishModel, 2)).LJJ(C1701940uOG.LIZIZ()).LJJIJIIJI(C11S5.LIZ()).LJJIIJZLJL(new AfS191S0100000_22(function1, 15));
    }

    public C1434090nQF(C1447790nmL c1447790nmL, String str, PublishModel publishModel) {
        String currentPublishTaskId;
        this.LL = c1447790nmL;
        this.LLILLJJLI = str;
        this.LLILLL = publishModel;
        C1434100nQG state = c1447790nmL.getState();
        this.LLILZIL = state;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(167));
        this.LLILZLL = c01gwLIZIZ;
        if (c1447790nmL.LJFF(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PublishParallel ParallelPublishForUICallback ");
            sbLIZ.append(str);
            sbLIZ.append(" created");
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            ((HashMap) LLIZLLLIL).put(publishModel.creationId, str);
            IAVPublishService iAVPublishService = (IAVPublishService) c01gwLIZIZ.getValue();
            Object obj = null;
            if (iAVPublishService != null) {
                currentPublishTaskId = iAVPublishService.getCurrentPublishTaskId();
            } else {
                currentPublishTaskId = null;
            }
            if (!Intrinsics.LJFF(currentPublishTaskId, str) && LJII().size() != 1) {
                this.LLIZ = 5;
                List<PublishModel> listLJII = LJII();
                if (listLJII.size() >= 2 && state.LJI.getValue() == null) {
                    Iterator<PublishModel> it2 = listLJII.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        PublishModel next = it2.next();
                        if (!LJIIIIZZ(next, (PublishModel) C13LP.LJJJLL(listLJII))) {
                            obj = next;
                            break;
                        }
                    }
                    PublishModel publishModel2 = (PublishModel) obj;
                    if (publishModel2 != null) {
                        LJIIIZ(publishModel2, new AwS601S0100000_22(this, 225));
                    }
                }
            } else {
                state.LIZJ(null);
                state.LIZLLL(null);
                LJIIJ(publishModel);
                LJIIIZ(publishModel, new AwS601S0100000_22(this, 226));
                Iterator it3 = new ArrayList(LJII()).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    PublishModel publishModel3 = (PublishModel) next2;
                    if (!Intrinsics.LJFF(publishModel3, this.LLILLL) && !LJIIIIZZ(publishModel3, this.LLILLL)) {
                        obj = next2;
                        break;
                    }
                }
                PublishModel publishModel4 = (PublishModel) obj;
                if (publishModel4 != null) {
                    LJIIIZ(publishModel4, new AwS601S0100000_22(this, 227));
                }
            }
            this.LLILZ = true;
        }
    }

    @Override // X.InterfaceC1433360nP4
    public final void LIZJ(CreateBaseAwemeResponse createBaseAwemeResponse, boolean z, PublishModel publishModel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishParallel ParallelPublishForUICallback ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" onSuccess");
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        LJI(publishModel);
    }
}
