package X;

import android.content.Context;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.LanguageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS18S0010000_3;

/* JADX INFO: renamed from: X.07v5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2016107v5 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC497601wk LL;
    public final /* synthetic */ C2016007v4 LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ LanguageVM LLILZ;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2016107v5(InterfaceC497601wk interfaceC497601wk, C2016007v4 c2016007v4, Context context, LanguageVM languageVM, C1677480tko<Float, C1677280tkU> c1677480tko) {
        super(0);
        this.LL = interfaceC497601wk;
        this.LLILLJJLI = c2016007v4;
        this.LLILLL = context;
        this.LLILZ = languageVM;
        this.LLILZIL = c1677480tko;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C23250099c.LIZLLL(this.LL, null, null, new C05S9(this.LLILZIL, null), 3);
        this.LLILLJJLI.LLILLJJLI.invoke(new C07W6(this.LLILLL, this.LLILZ.LL));
        LanguageVM languageVM = this.LLILZ;
        languageVM.getClass();
        languageVM.setState(new AwS18S0010000_3(false, 5));
        return Unit.LIZ;
    }
}
