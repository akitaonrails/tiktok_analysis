package X;

import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinUnreadIndicatorAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OLD, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C0OLD extends C2217421BqW implements Function1<Integer, Unit> {
    public C0OLD(BulletinUnreadIndicatorAssem bulletinUnreadIndicatorAssem) {
        super(1, bulletinUnreadIndicatorAssem, BulletinUnreadIndicatorAssem.class, "scrollToTargetItem", "scrollToTargetItem(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        BulletinBaseItem bulletinBaseItem;
        int iIntValue = num.intValue();
        BulletinUnreadIndicatorAssem bulletinUnreadIndicatorAssem = (BulletinUnreadIndicatorAssem) this.receiver;
        Iterator<InterfaceC1891350zJl> it2 = bulletinUnreadIndicatorAssem.Go().getListItems().iterator();
        int iMax = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC1891350zJl next = it2.next();
            if ((next instanceof BulletinBaseItem) && (bulletinBaseItem = (BulletinBaseItem) next) != null && bulletinBaseItem.LJJIJLIJ()) {
                if (iMax < 0) {
                    break;
                }
            } else {
                iMax++;
            }
        }
        iMax = Math.max(bulletinUnreadIndicatorAssem.Go().getListItems().size() - 1, 0);
        bulletinUnreadIndicatorAssem.cO0(iMax);
        C0OPQ c0opq = C0OPQ.LIZ;
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numValueOf2 = Integer.valueOf(bulletinUnreadIndicatorAssem.No().LLILZLL);
        c0opq.getClass();
        C0OPQ.LJII(numValueOf, numValueOf2, "quick_message_location");
        return Unit.LIZ;
    }
}
