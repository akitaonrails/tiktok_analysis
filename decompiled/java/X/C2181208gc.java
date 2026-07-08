package X;

import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.debug.MixLayoutDebugPreviewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08gc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.debug.MixLayoutDebugPreviewActivity$loadDataFromFile$2$1", f = "MixLayoutDebugPreviewActivity.kt", l = {}, m = "invokeSuspend")
public final class C2181208gc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ MixLayoutDebugPreviewActivity LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181208gc(String str, MixLayoutDebugPreviewActivity mixLayoutDebugPreviewActivity, String str2, String str3, InterfaceC1364105Vn<? super C2181208gc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = mixLayoutDebugPreviewActivity;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2181208gc(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EditText editText;
        TextView textView;
        EditText editText2;
        C1C7U.LIZ("MixLayoutDebugPreviewActivity@39f5.loadDataFromFile$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.length() > 0 && (editText2 = this.LLILLJJLI.LL) != null) {
            editText2.setText(this.LL);
        }
        if (this.LLILLL.length() > 0 && (textView = this.LLILLJJLI.LLILZ) != null) {
            textView.setText(this.LLILLL);
        }
        if (this.LLILZ.length() > 0 && (editText = this.LLILLJJLI.LLILZLL) != null) {
            editText.setText(this.LLILZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixLayoutDebugPreviewActivity@39f5.loadDataFromFile$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
