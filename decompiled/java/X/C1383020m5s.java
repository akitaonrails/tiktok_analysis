package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.share.panel.TakoLongImageSharePackage;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0m5s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383020m5s extends C09AY implements Function2<Context, BaseSharePackage, Unit> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ Map<String, String> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ Bitmap LLILZIL;
    public final /* synthetic */ TakoMultipleSelectVM LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1383020m5s(Activity activity, Map<String, String> map, String str, View view, Bitmap bitmap, TakoMultipleSelectVM takoMultipleSelectVM) {
        super(2);
        this.LL = activity;
        this.LLILLJJLI = map;
        this.LLILLL = str;
        this.LLILZ = view;
        this.LLILZIL = bitmap;
        this.LLILZLL = takoMultipleSelectVM;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Context context, BaseSharePackage baseSharePackage) {
        TakoLongImageSharePackage takoLongImageSharePackage;
        BaseSharePackage baseSharePackage2 = baseSharePackage;
        if (baseSharePackage2 instanceof TakoLongImageSharePackage) {
            takoLongImageSharePackage = (TakoLongImageSharePackage) baseSharePackage2;
        } else {
            takoLongImageSharePackage = null;
        }
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(this.LL);
        dialogC1389620mGW.LJJLIIJ(false);
        dialogC1389620mGW.LJJLJ(2131846630);
        C786410Ut5.J4(dialogC1389620mGW);
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1388440mEc(takoLongImageSharePackage, dialogC1389620mGW, this.LLILZ, this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZIL, baseSharePackage2, this.LLILZLL, null), 3);
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str = this.LLILLJJLI.get("enter_from");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = this.LLILLJJLI.get("enter_method");
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.LLILLJJLI.get("process_id");
        if (str4 == null) {
            str4 = "";
        }
        String str5 = this.LLILLJJLI.get("tako_session_id");
        if (str5 != null) {
            str2 = str5;
        }
        C1862330yYx.LJJ(c1862330yYx, str, str3, str4, str2, this.LLILLJJLI.get("tako_chat_id"), "share_generate_image_page", "download", null, null, null, null, null, null, null, C2097908Jt.LIZJ(new Pair("message_id", this.LLILLL)), 49024);
        C12FB.LIZJ("save", this.LLILLJJLI);
        return Unit.LIZ;
    }
}
