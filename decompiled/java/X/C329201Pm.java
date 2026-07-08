package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.PreviewBulletinEditWidget;
import com.bytedance.android.livesdk.model.Board;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01Pm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C329201Pm extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ PreviewBulletinEditWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329201Pm(PreviewBulletinEditWidget previewBulletinEditWidget) {
        super(1);
        this.LL = previewBulletinEditWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        PreviewBulletinEditWidget previewBulletinEditWidget = this.LL;
        previewBulletinEditWidget.LLJ = str2;
        InterfaceC1814530xJr interfaceC1814530xJrH1 = previewBulletinEditWidget.H1();
        if (interfaceC1814530xJrH1 != null) {
            this.LL.contentView.getContext();
            Board board = new Board();
            board.version = 2;
            HashMap map = new HashMap();
            map.put("decoration_entrance", str2);
            interfaceC1814530xJrH1.LJI(board, map);
        }
        return Unit.LIZ;
    }
}
