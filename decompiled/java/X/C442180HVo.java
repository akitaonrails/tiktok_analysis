package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0HVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C442180HVo extends C0KVV {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        FragmentManager supportFragmentManager;
        C0KVW c0kvw = (C0KVW) xBaseParamModel;
        String title = c0kvw.getTitle();
        String content = c0kvw.getContent();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setText(content);
            tuxTextView.setTuxFont(31);
            tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(99)));
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                C0OM1 c0om1 = new C0OM1();
                c0om1.LIZLLL = true;
                C1250250idj c1250250idj = new C1250250idj();
                c1250250idj.LIZJ = title;
                c0om1.LIZJ = c1250250idj;
                C1251150ifB c1251150ifB = new C1251150ifB();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_x_mark_fill_small;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c1251150ifB.LIZIZ(c419910GdJ);
                c1251150ifB.LIZJ(new AwS550S0100000_6(tuxTextView, 1626));
                c0om1.LIZIZ(c1251150ifB);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJIL = c0om1;
                tuxSheet.LLJJJ = null;
                tuxSheet.LLJJIII = tuxTextView;
                tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC521770KdD(completionBlock, 13);
                tuxSheet.show(supportFragmentManager, getName());
            }
        }
    }
}
