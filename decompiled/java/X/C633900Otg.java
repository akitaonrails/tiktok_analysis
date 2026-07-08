package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS149S0101000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: renamed from: X.0Otg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C633900Otg extends C09AY implements Function1<C20656615sK, Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C633900Otg(View view, AwS149S0101000_9 awS149S0101000_9) {
        super(1);
        this.LL = view;
        this.LLILLJJLI = awS149S0101000_9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C20656615sK c20656615sK) {
        C20515215Pi c20515215Pi = new C1257230ioz((ViewGroup) this.LL, true).LIZ;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_music_note_s_alt;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c20515215Pi.LJFF(c419910GdJ);
        C633880Ote c633880Ote = C633880Ote.LIZ;
        Context context = this.LL.getContext();
        c633880Ote.getClass();
        String string = context.getString(2131837735);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(2131837736));
        SpannableString spannableString = new SpannableString(string);
        C786410Ut5.p2(spannableString, new C0P45(context, 0), 0, spannableString.length(), 17);
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) spannableString);
        C1057450dcl c1057450dcl = c20515215Pi.LIZ;
        c1057450dcl.LJFF = spannableStringBuilderAppend;
        c1057450dcl.LJIIJ = 0;
        c1057450dcl.LJIILL = true;
        c20515215Pi.LIZ.LJIILJJIL = new AwS588S0100000_9(c20656615sK, 435);
        C633880Ote.LIZIZ = c20515215Pi;
        c20515215Pi.LIZLLL();
        Function0<Unit> function0 = this.LLILLJJLI;
        if (function0 != null) {
            function0.invoke();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        C20684815ws.LJIILLIIL("artist_popup_show", c2344009Gk.LIZ);
        return Unit.LIZ;
    }
}
