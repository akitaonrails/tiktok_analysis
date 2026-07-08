package X;

import android.content.Context;
import android.text.StaticLayout;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.container.ReferenceSheetFragment;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HFc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437900HFc {
    public static C1390920mIc LIZ(View view, C434640H2o c434640H2o, Function2 function2, Function2 function22, AbstractC329610Cw3 abstractC329610Cw3, Function1 function1) {
        int i;
        List<InterfaceC1891350zJl> listLL;
        int iLIZIZ;
        ReferenceSheetFragment referenceSheetFragment = new ReferenceSheetFragment();
        referenceSheetFragment.LL = c434640H2o;
        referenceSheetFragment.LLILLJJLI = c434640H2o.LIZ;
        referenceSheetFragment.LLILZ = function2;
        referenceSheetFragment.LLILZIL = function22;
        referenceSheetFragment.LLILZLL = new WeakReference<>(view);
        referenceSheetFragment.LLJ = abstractC329610Cw3;
        referenceSheetFragment.LLJI = function1;
        Context context = view.getContext();
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
        List<? extends InterfaceC1891350zJl> list = referenceSheetFragment.LLILLJJLI;
        int i2 = 2;
        if (list != null && (listLL = C13LP.LL(list, 10)) != null) {
            i = 0;
            for (InterfaceC1891350zJl interfaceC1891350zJl : listLL) {
                if (interfaceC1891350zJl instanceof C434520H2c) {
                    C434520H2c c434520H2c = (C434520H2c) interfaceC1891350zJl;
                    int iLIZIZ3 = C497820Jfg.LIZIZ(context);
                    c434520H2c.getClass();
                    int iLIZIZ4 = iLIZIZ3 - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2);
                    int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
                    String str = c434520H2c.LLILLJJLI;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    C444890HcV c444890HcV = new C444890HcV();
                    c444890HcV.LIZ(102);
                    StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(str, 0, str.length(), c444890HcV, iLIZIZ4);
                    builderObtain.setMaxLines(2);
                    int height = builderObtain.build().getHeight();
                    int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                    if (height > iLIZIZ6) {
                        height = iLIZIZ6;
                    }
                    String str3 = c434520H2c.LLILZ;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    C444890HcV c444890HcV2 = new C444890HcV();
                    c444890HcV2.LIZ(41);
                    StaticLayout.Builder builderObtain2 = StaticLayout.Builder.obtain(str2, 0, str2.length(), c444890HcV2, iLIZIZ4);
                    builderObtain2.setMaxLines(2);
                    int height2 = builderObtain2.build().getHeight();
                    int iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(39));
                    if (height2 > iLIZIZ7) {
                        height2 = iLIZIZ7;
                    }
                    iLIZIZ = height + height2 + iLIZIZ5;
                } else if (interfaceC1891350zJl instanceof AbstractC434530H2d) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((AbstractC434530H2d) interfaceC1891350zJl).LIZ())));
                } else {
                    iLIZIZ = 0;
                }
                i += iLIZIZ;
            }
        } else {
            i = 0;
        }
        int i3 = iLIZIZ2 + i;
        int iLIZIZ8 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(166));
        if (i3 >= iLIZIZ8) {
            iLIZIZ8 = i3;
        }
        int iMin = Math.min(iLIZIZ8, (int) (C497820Jfg.LIZ(context) * 0.5f));
        int iMin2 = Math.min(i3, (int) (C497820Jfg.LIZ(context) * 0.95f));
        if (C301460Brk.LIZJ(Integer.valueOf(c434640H2o.LIZLLL))) {
            i2 = 0;
        } else if (i3 <= iMin) {
            i2 = 1;
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(i2);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = referenceSheetFragment;
        tuxSheet.LLJJL = i3;
        c1390920mIc.LIZIZ(iMin, iMin2);
        c1390920mIc.LIZ.LLJLILLLLZIIL = false;
        if (!C301460Brk.LIZJ(Integer.valueOf(c434640H2o.LIZLLL))) {
            c1390920mIc.LIZ.LLJLL = true;
        }
        return c1390920mIc;
    }
}
