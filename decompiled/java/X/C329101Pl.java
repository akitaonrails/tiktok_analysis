package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.PreviewBulletinEditWidget;
import com.bytedance.android.livesdk.model.Board;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Pl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.PreviewBulletinEditWidget$enterDecorationEditFromScheme$1$1$2$1", f = "PreviewBulletinEditWidget.kt", l = {}, m = "invokeSuspend")
public final class C329101Pl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Board LL;
    public final /* synthetic */ PreviewBulletinEditWidget LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329101Pl(Board board, PreviewBulletinEditWidget previewBulletinEditWidget, String str, InterfaceC1364105Vn<? super C329101Pl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = board;
        this.LLILLJJLI = previewBulletinEditWidget;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C329101Pl(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1814530xJr interfaceC1814530xJrH1;
        String str;
        C1C7U.LIZ("PreviewBulletinEditWidget@2c55.enterDecorationEditFromScheme$1$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL != null && (interfaceC1814530xJrH1 = this.LLILLJJLI.H1()) != null) {
            Board board = this.LL;
            HashMap map = new HashMap();
            PreviewBulletinEditWidget previewBulletinEditWidget = this.LLILLJJLI;
            Board board2 = this.LL;
            String str2 = this.LLILLL;
            map.put("decoration_entrance", previewBulletinEditWidget.LLJ);
            if (board2 != null && C125800ds.LIZIZ(board2)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_empty", str);
            map.put("previous_page", str2);
            interfaceC1814530xJrH1.LJI(board, map);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreviewBulletinEditWidget@2c55.enterDecorationEditFromScheme$1$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
