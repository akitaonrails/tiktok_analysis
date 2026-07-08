package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0toX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssemKt$TakoMultiImagePreviewContent$5$1$4$1", f = "TakoContentPreviewAssem.kt", l = {}, m = "invokeSuspend")
public final class C1679790toX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C05UN LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1679790toX(C05UN c05un, InterfaceC1364105Vn<? super C1679790toX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c05un;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1679790toX(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("TakoContentPreviewAssemKt@2e97.TakoMultiImagePreviewContent$5$1$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map<String, String> map = this.LL.LIZLLL().LLILZLL;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str = map.get("enter_from");
        String str2 = map.get("enter_method");
        String str3 = map.get("process_id");
        String str4 = this.LL.LIZLLL().LLILLL;
        String str5 = map.get("tako_session_id");
        if (str5 == null) {
            str5 = "";
        }
        String str6 = map.get("tako_chat_id");
        if (str6 == null) {
            str6 = "";
        }
        C1862330yYx.LJLJI(c1862330yYx, str, str2, str3, "image_to_video_popup", str4, null, null, null, null, null, null, null, "", str5, str6, 36832);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoContentPreviewAssemKt@2e97.TakoMultiImagePreviewContent$5$1$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
