package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.RestrictDialog;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Ka8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.RestrictDialog$onViewCreated$2", f = "RestrictDialog.kt", l = {}, m = "invokeSuspend")
public final class C519860Ka8 extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ RestrictDialog LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C519860Ka8(RestrictDialog restrictDialog, String str, InterfaceC1364105Vn<? super C519860Ka8> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = restrictDialog;
        this.LLILLL = str;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C519860Ka8 c519860Ka8 = new C519860Ka8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c519860Ka8.LL = view;
        return c519860Ka8.invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RestrictDialog@5514.onViewCreated$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        View view = (View) this.LL;
        this.LLILLJJLI.getClass();
        C1018703yb.LIZIZ("tiktokec_button_click", C2097608Jq.LJIIJ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("previous_page", "edit_profile"), new Pair("page_name", "change_restriction"), new Pair("button_name", "copy_address")));
        ClipboardManager clipboardManager = (ClipboardManager) C786410Ut5.H2(view.getContext(), "clipboard");
        Cert certFindCert = CertProviderManagerKt.findCert("bpea-C_end_account_shop_binding_and_name_consistency", 1476399112);
        try {
            String str = this.LLILLL;
            C20145713s7.LIZJ(clipboardManager, ClipData.newPlainText(str, str), certFindCert);
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLJJLI.requireActivity());
            c1389890mGx.LJIIIZ(2131833260);
            c1389890mGx.LJIIJJI();
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RestrictDialog@5514.onViewCreated$2");
        return unit;
    }
}
