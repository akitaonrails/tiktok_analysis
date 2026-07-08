package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS130S1200000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZZv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901930ZZv {
    public static final C419910GdJ LIZ;

    static {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_refresh;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        LIZ = c419910GdJ;
    }

    public static C901960ZZy LIZ(InterfaceC902110ZaD interfaceC902110ZaD, C869590Y9l c869590Y9l, Context context, String str, Function0 function0) {
        String str2;
        if (Intrinsics.LJFF(interfaceC902110ZaD, C902000Za2.LIZ)) {
            str2 = "photo";
        } else if (Intrinsics.LJFF(interfaceC902110ZaD, C902010Za3.LIZ)) {
            str2 = "video";
        } else {
            throw new C1954807lC();
        }
        C912070ZqH.LIZIZ.LJFF().LJIIJ(c869590Y9l, C0I0B.LJFF.LIZIZ(), str2, str);
        return new C901960ZZy(context.getString(2131831013), new C902020Za4(LIZ.LIZ(context)), new AwS130S1200000_14(str2, (String) c869590Y9l, (C869590Y9l) function0, (Function0<Unit>) 0));
    }
}
