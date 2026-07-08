package X;

import android.view.KeyEvent;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ixu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity$onResume$1$1", f = "BaAutoReplyListActivity.kt", l = {}, m = "invokeSuspend")
public final class C483640Ixu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaAutoReplyListActivity LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C483640Ixu(BaAutoReplyListActivity baAutoReplyListActivity, String str, InterfaceC1364105Vn<? super C483640Ixu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baAutoReplyListActivity;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C483640Ixu(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("BaAutoReplyListActivity@76f4.onResume$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        BaAutoReplyListActivity baAutoReplyListActivity = this.LL;
        KeyEvent.Callback callbackFindViewById = baAutoReplyListActivity.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = baAutoReplyListActivity.findViewById(R.id.y1z);
            baAutoReplyListActivity.LLILLJJLI = (TuxNavBar) callbackFindViewById;
        }
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = this.LLILLJJLI;
        ((TuxNavBar) callbackFindViewById).LJIJJ(c1250250idj);
        C197039127h c197039127hLLLLLZL = this.LL.LLLLLZL();
        boolean z = false;
        if (this.LL.LLILZLL.size() < 4) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLLLJ(c197039127hLLLLLZL, i);
        C197039127h c197039127hLLLLLZL2 = this.LL.LLLLLZL();
        if (this.LL.LLILZLL.size() < 4) {
            z = true;
        }
        c197039127hLLLLLZL2.setActivated(z);
        this.LL.LLLLLZL().setEnabled(true);
        this.LL.LLILZIL.notifyDataSetChanged();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaAutoReplyListActivity@76f4.onResume$1$1");
        return unit;
    }
}
