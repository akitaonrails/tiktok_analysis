package X;

import android.text.Spannable;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gxb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.ui.markdown.MarkDownParserDelegate$fromMarkdownWithSuspend$2", f = "MarkDown.kt", l = {}, m = "invokeSuspend")
public final class C432490Gxb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Spannable>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ TextView LLILLL;
    public final /* synthetic */ InterfaceC418240Gac LLILZ;
    public final /* synthetic */ InterfaceC426480Gnu LLILZIL;
    public final /* synthetic */ Map<String, Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C432490Gxb(TextView textView, InterfaceC418240Gac interfaceC418240Gac, InterfaceC426480Gnu interfaceC426480Gnu, String str, Map map, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = textView;
        this.LLILZ = interfaceC418240Gac;
        this.LLILZIL = interfaceC426480Gnu;
        this.LLILZLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        boolean z = this.LL;
        return new C432490Gxb(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILLJJLI, this.LLILZLL, interfaceC1364105Vn, z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Spannable> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZIZ;
        Spannable spannableLIZ;
        C1C7U.LIZ("MarkDownParserDelegate@fd82.fromMarkdownWithSuspend$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            strLIZIZ = C1859900yV2.LIZIZ.LIZIZ(this.LLILLJJLI);
        } else {
            strLIZIZ = this.LLILLJJLI;
        }
        try {
            spannableLIZ = new C2273481Dyk(strLIZIZ, new C426450Gnr(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LL)).LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            spannableLIZ = null;
        }
        C1C7U.LIZIZ("MarkDownParserDelegate@fd82.fromMarkdownWithSuspend$2");
        return spannableLIZ;
    }
}
