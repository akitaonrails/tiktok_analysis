package X;

import Y.ACListenerS143S0100000_8;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MJd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C566350MJd {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(27));

    public static void LIZIZ(C19EG c19eg) {
        C566370MJf c566370MJf = new Object() { // from class: X.0MJf
        };
        int i = 0;
        List listLJIIJJI = C1697810uHb.LJIIJJI(c19eg.getString(2131820658), c19eg.getString(2131820659));
        c566370MJf.getClass();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
        Iterator it2 = listLJIIJJI.iterator();
        while (true) {
            AttributeSet attributeSet = null;
            if (!it2.hasNext()) {
                break;
            }
            String str = (String) it2.next();
            new Object() { // from class: X.0MJf
            }.getClass();
            LinearLayout linearLayout = new LinearLayout(c19eg);
            linearLayout.setOrientation(0);
            View view = new View(c19eg);
            view.setBackground(c19eg.getDrawable(R.drawable.a9n));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) C12ES.LIZJ(4.0f, c19eg), (int) C12ES.LIZJ(4.0f, c19eg));
            layoutParams.setMarginStart((int) C12ES.LIZJ(4.0f, c19eg));
            layoutParams.topMargin = (int) C12ES.LIZJ(7.5f, c19eg);
            layoutParams.bottomMargin = (int) C12ES.LIZJ(7.5f, c19eg);
            C786410Ut5.W5(view, layoutParams);
            linearLayout.addView(view);
            TuxTextView tuxTextView = new TuxTextView(c19eg, attributeSet, 6, i);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.setMarginStart((int) C12ES.LIZJ(8.0f, c19eg));
            C786410Ut5.R6(tuxTextView, layoutParams2);
            tuxTextView.setTuxFont(41);
            tuxTextView.setTextColorRes(R.attr.a1h);
            tuxTextView.setText(str);
            linearLayout.addView(tuxTextView);
            arrayList.add(linearLayout);
        }
        View viewSd = C786410Ut5.Sd(R.layout.d1f, C786410Ut5.ne(c19eg), null);
        viewSd.findViewById(R.id.wlq);
        ViewGroup viewGroup = (ViewGroup) viewSd.findViewById(R.id.xo6);
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                View view2 = (View) obj;
                if (i2 != 0) {
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams3.topMargin = (int) C12ES.LIZJ(10.0f, c19eg);
                    C786410Ut5.W5(view2, layoutParams3);
                }
                if (viewGroup != null) {
                    viewGroup.addView(view2);
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C786410Ut5.p9((RadiusLayout) viewSd.findViewById(R.id.j42), new ACListenerS143S0100000_8(viewSd, 152));
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ("https://p16-amd-va.tiktokcdn.com/obj/creation-obj-us/Group2036082144.png");
        c1331670kl3LJIIIZ.LIZLLL = true;
        c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIIZ.LIZLLL("AIGCAvatarChoosePictureProcessManager");
        c1331670kl3LJIIIZ.LJJ((InterfaceC1334290kpH) viewSd.findViewById(R.id.atn));
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIII = viewSd;
        c1390920mIc.LJIIIIZZ(1);
        DialogInterfaceOnCancelListenerC566390MJh dialogInterfaceOnCancelListenerC566390MJh = new DialogInterface.OnCancelListener() { // from class: X.0MJh
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C566400MJi.LIZ("aime_upload_page", "photo_tips", "dismiss");
            }
        };
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LL = dialogInterfaceOnCancelListenerC566390MJh;
        tuxSheet.show(c19eg.getSupportFragmentManager(), "fast_path_sheet_tag");
    }

    public static void LIZ(C19EG c19eg, final Function1 function1) {
        if (!C533930Kwp.LIZJ()) {
            C523800KgU c523800KgU = new C523800KgU();
            c523800KgU.LIZ = "bpea-storage_for_aigc_album_target34";
            c523800KgU.LIZIZ = "bpea-bpea-storage_for_aigc_album_target33";
            c523800KgU.LIZJ = "bpea-storage_for_aigc_album";
            C540290LGx.LJ(C540290LGx.LIZ, c19eg, null, new C0LH5() { // from class: X.0MJe
                @Override // X.C0LH5
                public final void LIZ(int[] iArr, String[] strArr) {
                    if (strArr != null && iArr != null) {
                        if (strArr.length != 0 && iArr.length != 0) {
                            Function1<Boolean, Unit> function12 = function1;
                            for (int i : iArr) {
                                if (i != 0) {
                                    function12.invoke(Boolean.FALSE);
                                    return;
                                }
                            }
                            function1.invoke(Boolean.TRUE);
                            return;
                        }
                    }
                    function1.invoke(Boolean.FALSE);
                }
            }, null, null, null, null, null, false, false, false, false, false, null, null, c523800KgU.LIZ().LIZ(), false, 94202);
            return;
        }
        function1.invoke(Boolean.TRUE);
    }
}
