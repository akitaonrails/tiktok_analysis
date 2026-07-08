package X;

import Y.AfS191S0100000_22;
import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.collections.ListProtector;
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
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nQD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1434070nQD implements InterfaceC1433860nPs {
    public static final Map<String, String> LLJ = new HashMap();
    public final InterfaceC1434080nQE LL;
    public final String LLILLJJLI;
    public final PublishModel LLILLL;
    public final boolean LLILZ;
    public final C1434100nQG LLILZIL;
    public final C01GW LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;

    @Override // X.InterfaceC1433360nP4
    public final void LIZLLL(String str) {
    }

    @Override // X.InterfaceC1433360nP4
    public final void LJ() {
        this.LLIZLLLIL = Math.max(this.LLIZLLLIL, this.LLIZ);
        this.LLIZ = 0;
    }

    @Override // X.InterfaceC1433860nPs
    public final boolean LIZ() {
        return this.LLILZ;
    }

    public void LJI(boolean z) {
        Object next;
        C1433730nPf.LJJI(this);
        if (((IAVPublishService) this.LLILZLL.getValue()).isParallelPublishTaskFinished()) {
            PublishProgressDialogAddHelper.LIZ.getClass();
            PublishProgressDialogAddHelper.LJI();
            return;
        }
        this.LLILZIL.LIZIZ(5);
        ArrayList arrayList = new ArrayList(((IAVPublishService) this.LLILZLL.getValue()).getAllProgressValidPublishModel());
        arrayList.remove(this.LLILLL);
        if (arrayList.size() <= 0) {
            return;
        }
        PublishModel publishModel = (PublishModel) ListProtector.get(arrayList, 0);
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (!LJII((PublishModel) next, publishModel)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PublishModel publishModel2 = (PublishModel) next;
        if (publishModel2 == null) {
            LJIIIZ(publishModel);
            LJIIIIZZ(publishModel, new AwS601S0100000_22(this, 224));
        } else {
            LJIIIZ(publishModel);
            LJIIIIZZ(publishModel, new AwS388S0200000_22(this, publishModel2, 45));
        }
    }

    public final void LJIIIZ(PublishModel publishModel) {
        C1434100nQG c1434100nQG = this.LLILZIL;
        HashMap map = (HashMap) LLJ;
        c1434100nQG.LJIIIIZZ.setValue((String) map.get(publishModel.creationId));
        C1434100nQG c1434100nQG2 = this.LLILZIL;
        c1434100nQG2.LJIIIZ.setValue(publishModel.editModel);
        map.remove(publishModel.creationId);
    }

    public static final boolean LJII(PublishModel publishModel, PublishModel publishModel2) {
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
        LJI(false);
    }

    @Override // X.InterfaceC1433360nP4
    public void LJFF(int i, C1434900nRY c1434900nRY) {
        String str;
        PublishModel publishModel;
        if (c1434900nRY != null && (publishModel = c1434900nRY.LIZJ) != null) {
            str = publishModel.publishId;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, this.LLILZIL.LJIIIIZZ.getValue())) {
            return;
        }
        if (c1434900nRY != null && c1434900nRY.LJ) {
            i = c1434900nRY.LJFF;
        }
        int i2 = this.LLIZLLLIL;
        if (i < i2) {
            this.LLILZIL.LIZIZ(i2);
        } else {
            this.LLILZIL.LIZIZ(i);
            this.LLIZ = i;
        }
    }

    public final void LJIIIIZZ(PublishModel publishModel, Function1<? super Bitmap, Unit> function1) {
        AbstractC19484711Kz.LJII(new C1466820oH2(this, publishModel, 1)).LJJ(C1701940uOG.LIZIZ()).LJJIJIIJI(C11S5.LIZ()).LJJIIJZLJL(new AfS191S0100000_22(function1, 14));
    }

    public C1434070nQD(C1447790nmL c1447790nmL, String str, PublishModel publishModel) {
        this.LL = c1447790nmL;
        this.LLILLJJLI = str;
        this.LLILLL = publishModel;
        C1434100nQG state = c1447790nmL.getState();
        this.LLILZIL = state;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(137));
        this.LLILZLL = c01gwLIZIZ;
        if (c1447790nmL.LJFF(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PublishParallel ParallelPublishForUICallback ");
            sbLIZ.append(str);
            sbLIZ.append(" created");
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            ((HashMap) LLJ).put(publishModel.creationId, str);
            Object obj = null;
            if (!Intrinsics.LJFF(((IAVPublishService) c01gwLIZIZ.getValue()).getCurrentPublishTaskId(), str) && ((IAVPublishService) c01gwLIZIZ.getValue()).getAllProgressValidPublishModel().size() != 1) {
                this.LLIZLLLIL = 5;
                List<PublishModel> allProgressValidPublishModel = ((IAVPublishService) c01gwLIZIZ.getValue()).getAllProgressValidPublishModel();
                if (allProgressValidPublishModel.size() >= 2 && state.LJI.getValue() == null) {
                    Iterator<PublishModel> it2 = allProgressValidPublishModel.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        PublishModel next = it2.next();
                        if (!LJII(next, (PublishModel) C13LP.LJJJLL(allProgressValidPublishModel))) {
                            obj = next;
                            break;
                        }
                    }
                    PublishModel publishModel2 = (PublishModel) obj;
                    if (publishModel2 != null) {
                        LJIIIIZZ(publishModel2, new AwS601S0100000_22(this, 219));
                    }
                }
            } else {
                state.LIZJ(null);
                state.LIZLLL(null);
                LJIIIZ(publishModel);
                LJIIIIZZ(publishModel, new AwS601S0100000_22(this, 220));
                Iterator it3 = new ArrayList(((IAVPublishService) c01gwLIZIZ.getValue()).getAllProgressValidPublishModel()).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    PublishModel publishModel3 = (PublishModel) next2;
                    if (!Intrinsics.LJFF(publishModel3, this.LLILLL) && !LJII(publishModel3, this.LLILLL)) {
                        obj = next2;
                        break;
                    }
                }
                PublishModel publishModel4 = (PublishModel) obj;
                if (publishModel4 != null) {
                    LJIIIIZZ(publishModel4, new AwS601S0100000_22(this, 222));
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
        LJI(true);
    }
}
