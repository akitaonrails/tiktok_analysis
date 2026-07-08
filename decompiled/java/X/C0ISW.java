package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ISW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0ISW extends C09AY implements Function2<List<? extends Room>, String, Unit> {
    public final /* synthetic */ C0ISJ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ISW(C0ISJ c0isj) {
        super(2);
        this.LL = c0isj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(List<? extends Room> list, String str) {
        List<? extends Room> list2 = list;
        C0ISJ c0isj = this.LL;
        try {
            ListIterator<Room> listIterator = c0isj.LLJILJIL.listIterator(c0isj.LLLLLLZZ + 1);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removeDuplicateData: currentIndex = ");
            sbLIZ.append(c0isj.LLLLLLZZ);
            C20441214yg.LIZIZ("BackupDataManager", C2188811AlT.LIZIZ(sbLIZ));
            while (listIterator.hasNext()) {
                Room next = listIterator.next();
                EnterRoomConfig enterRoomConfig = c0isj.LLJILJILJ.get(c0isj.LLJILJIL.indexOf(next));
                if (list2.contains(next)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onPageScrollStateChanged callback: remove ");
                    sbLIZ2.append(next.getId());
                    C20441214yg.LIZIZ("BackupDataManager", C2188811AlT.LIZIZ(sbLIZ2));
                    listIterator.remove();
                    c0isj.LLJILJILJ.remove(enterRoomConfig);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }
}
