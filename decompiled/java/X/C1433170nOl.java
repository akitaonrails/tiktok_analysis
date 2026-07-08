package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0nOl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433170nOl extends AbstractC1433570nPP {
    public final /* synthetic */ C1433500nPI LIZ;

    public C1433170nOl(C1433500nPI c1433500nPI) {
        this.LIZ = c1433500nPI;
    }

    @Override // X.AbstractC1433570nPP
    public final void onFinish(AbstractC1433460nPE abstractC1433460nPE, Object obj, PublishModel publishModel) {
        if (publishModel != null) {
            C1433240nOs.LIZ.getClass();
            C1433240nOs.LJII.remove(publishModel.creationId);
        }
        if (!(abstractC1433460nPE instanceof C492390JSr)) {
            if (!(abstractC1433460nPE instanceof C1433420nPA)) {
                if (!C297680Ble.LIZ()) {
                    C1433240nOs.LIZ.getClass();
                    C1434650nR9 c1434650nR9LIZIZ = C1433240nOs.LIZIZ(abstractC1433460nPE);
                    String str = this.LIZ.LLILZIL.LIZIZ;
                    String str2 = (String) ((LinkedHashMap) C1433240nOs.LJ).get(str);
                    if (str2 != null) {
                        try {
                            C09AE c09aeRemove = C1433240nOs.LJI.remove(str2);
                            Unit unit = null;
                            if (c09aeRemove != null && c09aeRemove.isActive()) {
                                c09aeRemove.LIZIZ(null);
                            }
                            List list = (List) ((LinkedHashMap) C1433240nOs.LIZJ).get(str2);
                            if (list != null) {
                                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(((C1433500nPI) it2.next()).LLILZIL.LIZ.creationId);
                                }
                                if (true ^ arrayList.isEmpty()) {
                                    C1433240nOs.LJII.removeAll(arrayList);
                                }
                            }
                            List<C1433500nPI> list2 = (List) ((LinkedHashMap) C1433240nOs.LIZJ).get(str2);
                            if (list2 != null) {
                                for (C1433500nPI c1433500nPI : list2) {
                                    if (!(c1433500nPI.LLILZIL.LIZLLL instanceof C1433210nOp)) {
                                        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("task[id:");
                                        sbLIZ.append(c1433500nPI.LLILZIL.LIZIZ);
                                        sbLIZ.append(",state:");
                                        sbLIZ.append(c1433500nPI.LLILZIL.LIZLLL);
                                        sbLIZ.append("] cancel,currentTask:");
                                        sbLIZ.append(str);
                                        sbLIZ.append(",groupId:");
                                        sbLIZ.append(str2);
                                        C201955140j.LJIJJ(c830690WiJ, "StoryPhotoModePublisher", C2188811AlT.LIZIZ(sbLIZ));
                                        C1433730nPf c1433730nPf = C1433730nPf.LIZ;
                                        String str3 = c1433500nPI.LLILZIL.LIZIZ;
                                        C1433230nOr c1433230nOr = new C1433230nOr("cancel_by_group", c1434650nR9LIZIZ, 2);
                                        c1433730nPf.getClass();
                                        C1433730nPf.LJFF(c1433230nOr, str3);
                                    }
                                }
                                unit = Unit.LIZ;
                            }
                            C189200o6.m2constructorimpl(unit);
                            return;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                            return;
                        }
                    }
                    return;
                }
                C1433240nOs.LIZ.getClass();
                C1433240nOs.LIZLLL(publishModel, true);
                return;
            }
            return;
        }
        C1433240nOs.LIZ.getClass();
        C1433240nOs.LIZLLL(publishModel, false);
    }
}
