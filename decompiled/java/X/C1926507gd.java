package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.LanguageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1926507gd extends C2217421BqW implements Function1<C07W7, Unit> {
    public C1926507gd(Object obj) {
        super(1, obj, LanguageVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/content/cell/LanguageCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07W7 c07w7) {
        C07W7 c07w72 = c07w7;
        LanguageVM languageVM = (LanguageVM) this.receiver;
        languageVM.getClass();
        if (c07w72 instanceof C07W6) {
            C07W6 c07w6 = (C07W6) c07w72;
            languageVM.vQ2(c07w6.LIZ, c07w6.LIZIZ);
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
