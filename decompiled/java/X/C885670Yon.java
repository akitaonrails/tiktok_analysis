package X;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Yon, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C885670Yon extends C09AY implements Function1<FrameLayout, Unit> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ C1389910mGz LLILLJJLI;
    public final /* synthetic */ C885760Yow LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ List<AbstractC885540Yoa<?>> LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C885670Yon(Activity activity, C1389910mGz c1389910mGz, C885760Yow c885760Yow, List<String> list, boolean z, List<? extends AbstractC885540Yoa<?>> list2, String str) {
        super(1);
        this.LL = activity;
        this.LLILLJJLI = c1389910mGz;
        this.LLILLL = c885760Yow;
        this.LLILZ = list;
        this.LLILZIL = z;
        this.LLILZLL = list2;
        this.LLIZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = frameLayout;
        int iIntValue = 0;
        TuxTextView tuxTextView = new TuxTextView(frameLayout2.getContext(), null, 6, 0);
        Activity activity = this.LL;
        final C1389910mGz c1389910mGz = this.LLILLJJLI;
        final C885760Yow c885760Yow = this.LLILLL;
        final List<String> list = this.LLILZ;
        final boolean z = this.LLILZIL;
        final List<AbstractC885540Yoa<?>> list2 = this.LLILZLL;
        final String str = this.LLIZ;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, new C1361400lX0(frameLayout2.getContext(), R.style.y0));
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        tuxTextView.setTextColor(iIntValue);
        tuxTextView.setTuxFont(43);
        tuxTextView.setText(activity.getString(C19212010Ec.LIZJ.LJIIJJI()));
        C786410Ut5.h9(tuxTextView, new View.OnClickListener() { // from class: X.0Yoo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnumC885270Yo9 enumC885270Yo9;
                c1389910mGz.LIZJ();
                IMChatListApi.LJJIII.getClass();
                InterfaceC884180YmO interfaceC884180YmOLJJJIL = C890330YwJ.LIZ().LJJJIL();
                String strLIZIZ = c885760Yow.LIZ.LIZIZ();
                List<String> list3 = list;
                C878960Ydy c878960YdyLJIIIIZZ = c885760Yow.LIZ.LJIIIIZZ();
                if (c878960YdyLJIIIIZZ == null) {
                    C880790Ygv c880790Ygv = C880790Ygv.LIZ;
                    EnumC880520YgU enumC880520YgULIZ = C880690Ygl.LIZ();
                    c880790Ygv.getClass();
                    c878960YdyLJIIIIZZ = C880790Ygv.LJ(enumC880520YgULIZ);
                }
                if (z) {
                    enumC885270Yo9 = EnumC885270Yo9.SECONDARY_ALL;
                } else {
                    enumC885270Yo9 = EnumC885270Yo9.SECONDARY_SELECTED;
                }
                C885700Yoq.LIZ(interfaceC884180YmOLJJJIL, strLIZIZ, list3, c878960YdyLJIIIIZZ, enumC885270Yo9, false, null, null, 417);
                C885260Yo8.LIZIZ(list, list2, z, true, str, c885760Yow.LIZ.LIZIZ(), c885760Yow.LIZ.a1());
            }
        });
        frameLayout2.addView(tuxTextView);
        return Unit.LIZ;
    }
}
