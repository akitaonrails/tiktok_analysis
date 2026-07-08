package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS86S1000000_1;

/* JADX INFO: renamed from: X.037m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7920037m extends C09AY implements Function1<TuxTextView, Unit> {
    public final /* synthetic */ Icon LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7920037m(Icon icon, Context context, String str, String str2, String str3) {
        super(1);
        this.LL = icon;
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TuxTextView tuxTextView) {
        SpannableString spannableString;
        HashMap<String, Object> mapLJIIJ;
        TuxTextView tuxTextView2 = tuxTextView;
        String text = this.LL.getText();
        Object obj = null;
        if (text != null) {
            spannableString = new SpannableString(text);
            C786410Ut5.p2(spannableString, new UnderlineSpan(), 0, spannableString.length(), 33);
        } else {
            spannableString = null;
        }
        tuxTextView2.setText(spannableString);
        tuxTextView2.setTextColorRes(R.attr.a1h);
        tuxTextView2.setTuxFont(81);
        if (this.LL.getTextLink() != null) {
            String daInfo = this.LL.getDaInfo();
            if (daInfo != null && (mapLJIIJ = C1741890vQh.LJIIJ(daInfo)) != null) {
                obj = mapLJIIJ.get("text_button_name");
            }
            String strValueOf = String.valueOf(obj);
            C1748720vbi.LJFF(tuxTextView2, new C049X(), new AwS86S1000000_1(strValueOf, 20), new AwS52S1000000_1(strValueOf, 34));
        }
        final Icon icon = this.LL;
        final Context context = this.LLILLJJLI;
        final String str = this.LLILLL;
        final String str2 = this.LLILZ;
        final String str3 = this.LLILZIL;
        C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.037k
            @Override // X.AbstractViewOnClickListenerC420730Ged
            public final void LIZ(View view) {
                if (view != null) {
                    Icon icon2 = icon;
                    Context context2 = context;
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    String str4 = str;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = "";
                    }
                    map2.put("page_name", str4);
                    String str6 = str2;
                    if (str6 == null) {
                        str6 = "";
                    }
                    map2.put("previous_page", str6);
                    String str7 = str3;
                    if (str7 != null) {
                        str5 = str7;
                    }
                    map2.put("entrance_info", str5);
                    map.put("trackParams", C1741890vQh.LJIIIIZZ(map2));
                    icon2.openTextLink(context2, map);
                    C1748720vbi.LIZLLL(view, new C049Y(), new AwS580S0100000_1(icon, 585));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(700L);
            }
        }, tuxTextView2);
        return Unit.LIZ;
    }
}
