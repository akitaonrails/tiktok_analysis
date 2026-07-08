package Y;

import X.C1869670ykn;
import X.C1900370zYJ;
import X.C1900590zYf;
import X.InterfaceC1364105Vn;
import X.InterfaceC1900470zYT;
import X.InterfaceC346701Wf;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeFilterModel;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationCreatorResultViewModel;
import com.ss.android.ugc.aweme.notification.v2.widget.container.NotificationWidgetContainer;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public class AgS211S0200000_28 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS211S0200000_28(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object emit$0(AgS211S0200000_28 agS211S0200000_28, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        List<NoticeFilterModel> list;
        NoticeTabModel noticeTabModel;
        if (((Boolean) obj).booleanValue()) {
            InterfaceC1900470zYT interfaceC1900470zYTAp = ((NotificationWidgetContainer) agS211S0200000_28.l0).ap();
            if (interfaceC1900470zYTAp != null) {
                interfaceC1900470zYTAp.p0((C1900370zYJ) ((NotificationWidgetContainer) agS211S0200000_28.l0).LLJJ.getValue());
            }
            InterfaceC1900470zYT interfaceC1900470zYTAp2 = ((NotificationWidgetContainer) agS211S0200000_28.l0).ap();
            if (interfaceC1900470zYTAp2 != null) {
                List<Integer> list2 = ((NotificationCreatorResultViewModel) agS211S0200000_28.l1).LLJ;
                C1869670ykn c1869670yknDp = ((NotificationWidgetContainer) agS211S0200000_28.l0).dp();
                if (c1869670yknDp != null && (noticeTabModel = c1869670yknDp.LLILLL) != null) {
                    list = noticeTabModel.filterOptionList;
                } else {
                    list = null;
                }
                interfaceC1900470zYTAp2.A9(new C1900590zYf(list2, list));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x010a: INVOKE (r0 I:java.lang.Object) = (r5 I:X.01Wf), (r1 I:java.lang.Object), (r4 I:X.05Vn) INTERFACE call: X.01Wf.emit(java.lang.Object, X.05Vn):java.lang.Object A[MD:(T, X.05Vn<? super kotlin.Unit>):java.lang.Object (m)] (LINE:50331914), block:B:44:0x00fb */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d A[Catch: Exception -> 0x00fa, TryCatch #0 {Exception -> 0x00fa, blocks: (B:26:0x0080, B:28:0x008d, B:33:0x00b4, B:35:0x00bc, B:38:0x00d8, B:32:0x00b1, B:42:0x00f6), top: B:50:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc A[Catch: Exception -> 0x00fa, TryCatch #0 {Exception -> 0x00fa, blocks: (B:26:0x0080, B:28:0x008d, B:33:0x00b4, B:35:0x00bc, B:38:0x00d8, B:32:0x00b1, B:42:0x00f6), top: B:50:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1 A[RETURN] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.01Wf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.AgS211S0200000_28 r9, java.lang.Object r10, X.InterfaceC1364105Vn r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS211S0200000_28.emit$1(Y.AgS211S0200000_28, java.lang.Object, X.05Vn):java.lang.Object");
    }
}
