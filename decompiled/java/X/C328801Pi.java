package X;

import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.PreviewBulletinEditWidget;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.Paragraph;
import com.bytedance.android.livesdk.model.RichTextContent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Pi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.PreviewBulletinEditWidget$addObserve$12$1", f = "PreviewBulletinEditWidget.kt", l = {259}, m = "invokeSuspend")
public final class C328801Pi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PreviewBulletinEditWidget LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C328801Pi(PreviewBulletinEditWidget previewBulletinEditWidget, Map<String, String> map, InterfaceC1364105Vn<? super C328801Pi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = previewBulletinEditWidget;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C328801Pi(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<Paragraph> list;
        Paragraph paragraph;
        C1C7U.LIZ("PreviewBulletinEditWidget@2c55.addObserve$12$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2252321DDq c2252321DDq = this.LLILLJJLI.LLJILJIL;
            C328901Pj c328901Pj = new C328901Pj(null);
            this.LL = 1;
            if (C09IC.LJIJ(c2252321DDq, this, c328901Pj) == objLJFF) {
                C1C7U.LIZIZ("PreviewBulletinEditWidget@2c55.addObserve$12$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LLJILJIL.setValue(false);
        PreviewBulletinEditWidget previewBulletinEditWidget = this.LLILLJJLI;
        Map<String, String> map = this.LLILLL;
        HashMap<String, String> mapLJI = C2097608Jq.LJI(new Pair("decoration_entrance", previewBulletinEditWidget.LLJ));
        String str = map.get("deeplink_origin");
        if (str != null) {
            mapLJI.put("deeplink_origin", str);
        }
        String str2 = map.get("deeplink_start_time");
        if (str2 != null) {
            mapLJI.put("deeplink_start_time", str2);
        }
        String str3 = map.get("text");
        if (str3 == null) {
            str3 = "";
        }
        BoardItem boardItemLIZIZ = C049800Ga.LIZIZ();
        RichTextContent richTextContent = boardItemLIZIZ.richTextContent;
        if (richTextContent != null && (list = richTextContent.paragraphs) != null && (paragraph = (Paragraph) C13LP.LJJJLL(list)) != null) {
            Paragraph.TextSpan textSpan = new Paragraph.TextSpan();
            textSpan.text = str3;
            paragraph.spans = C1697810uHb.LJIILJJIL(textSpan);
        }
        LiveIconView liveIconView = previewBulletinEditWidget.LLILZ;
        if (liveIconView != null) {
            C500260Jjc.LJIILLIIL(liveIconView);
        }
        InterfaceC1814530xJr interfaceC1814530xJrH1 = previewBulletinEditWidget.H1();
        if (interfaceC1814530xJrH1 != null) {
            interfaceC1814530xJrH1.LJFF(previewBulletinEditWidget.context, boardItemLIZIZ, mapLJI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreviewBulletinEditWidget@2c55.addObserve$12$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
