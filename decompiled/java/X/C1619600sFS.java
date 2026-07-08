package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.service.impl.AutoMessageTooltipHelper;
import com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sFS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1619600sFS extends C09AY implements Function0<Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ List<C869590Y9l> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Activity LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1619600sFS(View view, boolean z, List<C869590Y9l> list, String str, Activity activity) {
        super(0);
        this.LL = view;
        this.LLILLJJLI = z;
        this.LLILLL = list;
        this.LLILZ = str;
        this.LLILZIL = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AutoMessageTooltipHelper autoMessageTooltipHelper = AutoMessageTooltipHelper.LIZIZ;
        View view = this.LL;
        boolean z = this.LLILLJJLI;
        List<C869590Y9l> list = this.LLILLL;
        String str = AutoMessageTooltipHelper.LIZLLL;
        String str2 = this.LLILZ;
        autoMessageTooltipHelper.getClass();
        if (view != null && !z && str.length() != 0 && !Intrinsics.LJFF(str, str2) && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator<C869590Y9l> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(String.valueOf(it2.next().getSender()), str)) {
                    AutoMessageTooltipHelper autoMessageTooltipHelper2 = AutoMessageTooltipHelper.LIZIZ;
                    Activity activity = this.LLILZIL;
                    View view2 = this.LL;
                    autoMessageTooltipHelper2.getClass();
                    C450720Hlu c450720Hlu = new C450720Hlu(activity);
                    C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                    c1391600mJi.LIZIZ = view2;
                    c1391600mJi.LJIIIZ = true;
                    c1391600mJi.LJIJJ = true;
                    c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
                    c450720Hlu.LJIIJ(2131830947);
                    c450720Hlu.LLILLJJLI.LJII = 3000L;
                    C1905770zh1.LIZJ(c450720Hlu, "inbox_auto_message", true, new View.OnClickListener() { // from class: X.0sFU
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                        }
                    });
                    EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.INBOX;
                    C1905770zh1.LIZ(c450720Hlu, "inbox_auto_message", enumC1584360rKc, AFwS264S0000000_24.get$arr$(750));
                    AutoMessageTooltipHelper.LIZJ = c450720Hlu.LIZIZ();
                    ((INoticeCountTabBadgePresentService) C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(657)).getValue()).LIZ();
                    AutoMessageTooltipHelper.LJ = true;
                    C0P0T c0p0t = AutoMessageTooltipHelper.LIZJ;
                    if (c0p0t != null) {
                        ((Keva) C1619610sFT.LIZ.getValue()).storeBoolean("is_tooltip_displayed", true);
                        if (C295090BhT.LIZ()) {
                            C1905750zgz.LIZIZ.LJFF(new C1619360sF4("inbox_auto_message", null, enumC1584360rKc, false, 3000L, EnumC1619300sEy.SWITCH_TAB, c0p0t, null, 130), null);
                        } else {
                            C1905750zgz c1905750zgz = C1905750zgz.LIZIZ;
                            c1905750zgz.LJIIIZ(c0p0t, "inbox_auto_message");
                            c1905750zgz.LIZ("inbox_auto_message", enumC1584360rKc);
                            c0p0t.show();
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
