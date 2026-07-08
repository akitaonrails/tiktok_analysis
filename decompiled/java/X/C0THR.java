package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0THR, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0THR extends C09AY implements Function1<Bitmap, Unit> {
    public final /* synthetic */ C259800zU<DialogC1389620mGW> LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ InterfaceC665370Q7z LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ View LLIZ;
    public final /* synthetic */ TakoMultipleSelectVM LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0THR(C259800zU<DialogC1389620mGW> c259800zU, Activity activity, InterfaceC665370Q7z interfaceC665370Q7z, int i, Map<String, String> map, String str, View view, TakoMultipleSelectVM takoMultipleSelectVM) {
        super(1);
        this.LL = c259800zU;
        this.LLILLJJLI = activity;
        this.LLILLL = interfaceC665370Q7z;
        this.LLILZ = i;
        this.LLILZIL = map;
        this.LLILZLL = str;
        this.LLIZ = view;
        this.LLIZLLLIL = takoMultipleSelectVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1388230mEH(this.LL, this.LLILLJJLI, this.LLILLL, bitmap2, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, null), 3);
        } else {
            DialogC1389620mGW dialogC1389620mGW = this.LL.element;
            if (dialogC1389620mGW != null) {
                C0FNV.LIZ(dialogC1389620mGW);
            }
            this.LL.element = null;
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLJJLI);
            c1389890mGx.LJIIIZ(2131822542);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }
}
