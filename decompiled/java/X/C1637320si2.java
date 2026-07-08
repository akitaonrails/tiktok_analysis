package X;

import android.content.Context;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0si2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637320si2 extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ ViewOnClickListenerC1638020sjA LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1637320si2(boolean z, Context context, ViewOnClickListenerC1638020sjA viewOnClickListenerC1638020sjA, String str, String str2) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = context;
        this.LLILLL = viewOnClickListenerC1638020sjA;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        String strK4;
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    if (iIntValue == 4) {
                        this.LLILLL.LJII(1, R.drawable.crd, C786410Ut5.k4(Locale.getDefault(), this.LLILLJJLI.getString(R.string.jqb), Arrays.copyOf(new Object[0], 0)));
                    }
                } else {
                    this.LLILLL.LJII(1, R.drawable.crd, C786410Ut5.k4(Locale.getDefault(), this.LLILLJJLI.getString(2131834932), Arrays.copyOf(new Object[0], 0)));
                }
            } else {
                this.LLILLL.LJII(1, R.drawable.crd, C786410Ut5.k4(Locale.getDefault(), this.LLILLJJLI.getString(R.string.jrk), Arrays.copyOf(new Object[0], 0)));
            }
        } else {
            if (this.LL) {
                strK4 = C786410Ut5.k4(Locale.getDefault(), this.LLILLJJLI.getString(2131834735), Arrays.copyOf(new Object[0], 0));
            } else {
                strK4 = C786410Ut5.k4(Locale.getDefault(), this.LLILLJJLI.getString(R.string.jp2), Arrays.copyOf(new Object[0], 0));
            }
            this.LLILLL.LJII(0, R.drawable.crc, strK4);
        }
        final ViewOnClickListenerC1638020sjA viewOnClickListenerC1638020sjA = this.LLILLL;
        final C19518211Xw c19518211Xw = viewOnClickListenerC1638020sjA.LLJLIL;
        if (c19518211Xw != null) {
            final Context context = this.LLILLJJLI;
            final String str = this.LLILZ;
            final String str2 = this.LLILZIL;
            HandlerHook.viewPostDelay(c19518211Xw, new Runnable() { // from class: X.0sii
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DesignerInfoHandler@c189.createRequestListener$1$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DesignerInfoHandler@c189.createRequestListener$1$1$1");
                }

                public final void LIZ() {
                    String string;
                    if (!C1635900sfk.LIZ()) {
                        c19518211Xw.setText(C786410Ut5.k4(Locale.getDefault(), context.getString(2131837642), Arrays.copyOf(new Object[]{Integer.valueOf(viewOnClickListenerC1638020sjA.LLJ.LIZ(str, str2))}, 1)));
                        return;
                    }
                    InterfaceC1638030sjB interfaceC1638030sjB = viewOnClickListenerC1638020sjA.LLJJJJLIIL;
                    if (interfaceC1638030sjB != null) {
                        interfaceC1638030sjB.getFollowCount();
                        C19518211Xw c19518211Xw2 = c19518211Xw;
                        ViewOnClickListenerC1638020sjA viewOnClickListenerC1638020sjA2 = viewOnClickListenerC1638020sjA;
                        String str3 = str;
                        String str4 = str2;
                        Context context2 = viewOnClickListenerC1638020sjA2.LLJJIJI;
                        if (context2 == null || (string = context2.getString(2131837642)) == null) {
                            string = "";
                        }
                        c19518211Xw2.setText(C786410Ut5.j4(string, Arrays.copyOf(new Object[]{String.valueOf(C19374310qz.LIZ(Long.valueOf(viewOnClickListenerC1638020sjA2.LLJ.LIZ(str3, str4)), new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13), null, 0, 28))}, 1)));
                    }
                }
            }, 1000L);
        }
        return Unit.LIZ;
    }
}
