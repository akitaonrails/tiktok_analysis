package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.03Gg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C814803Gg {
    public static final C814803Gg LIZ = new C814803Gg();

    public static void LIZ(Context context, FragmentManager fragmentManager, String str, String str2) {
        if (context != null) {
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setText(str2);
            tuxTextView.setTuxFont(51);
            tuxTextView.setTextColorRes(R.attr.a1h);
            tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(35)));
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LJIIIIZZ(4);
            C0OM1 c0om1 = new C0OM1();
            c0om1.LIZLLL = true;
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = str;
            c0om1.LIZJ = c1250250idj;
            C1251150ifB c1251150ifB = new C1251150ifB();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_x_mark_fill_small;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c1251150ifB.LIZIZ(c419910GdJ);
            c1251150ifB.LIZJ(new AwS545S0100000_1(tuxTextView, 1601));
            c0om1.LIZIZ(c1251150ifB);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJIL = c0om1;
            tuxSheet.LLJJJ = null;
            tuxSheet.LLJJIII = tuxTextView;
            tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.03Gh
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                }
            };
            tuxSheet.show(fragmentManager, str);
        }
    }
}
