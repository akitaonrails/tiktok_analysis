package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.share.panel.TakoBatchMessageSharePackage;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0m5q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383000m5q extends C09AY implements Function2<Context, BaseSharePackage, Unit> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ TakoMultipleSelectVM LLILZIL;
    public final /* synthetic */ InterfaceC665370Q7z LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1383000m5q(Activity activity, View view, Map<String, String> map, String str, TakoMultipleSelectVM takoMultipleSelectVM, InterfaceC665370Q7z interfaceC665370Q7z, int i) {
        super(2);
        this.LL = activity;
        this.LLILLJJLI = view;
        this.LLILLL = map;
        this.LLILZ = str;
        this.LLILZIL = takoMultipleSelectVM;
        this.LLILZLL = interfaceC665370Q7z;
        this.LLIZ = i;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, X.0mGW, android.app.Dialog] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Context context, BaseSharePackage baseSharePackage) {
        BaseSharePackage baseSharePackage2 = baseSharePackage;
        if ((baseSharePackage2 instanceof TakoBatchMessageSharePackage) && baseSharePackage2 != null) {
            C1382840m5a.LIZ.remove(baseSharePackage2);
        }
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!C036E.LIZ.LIZIZ()) {
            C0DQF.LJ(this.LLILLJJLI, this.LL.getString(2131822542), null, null, false, 28);
        } else {
            C1845390y7d.LIZ(this.LLILLL, this.LLILZ, "create_image");
            C15453063f.LIZ.getClass();
            C140D.LIZ.LJJIIJ(false);
            C259800zU c259800zU = new C259800zU();
            ?? dialogC1389620mGW = new DialogC1389620mGW(this.LL);
            dialogC1389620mGW.LJJLIIJ(false);
            dialogC1389620mGW.LJJLJ(2131822541);
            C0FNV.LIZJ(dialogC1389620mGW);
            c259800zU.element = dialogC1389620mGW;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C750870Tcr(this.LLILZIL, this.LLILZLL, this.LLILLL, c259800zU, this.LL, this.LLIZ, this.LLILZ, this.LLILLJJLI, null), 3);
        }
        return Unit.LIZ;
    }
}
