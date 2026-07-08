package X;

import com.ss.android.ugc.aweme.translation.ui.TranslationControlsAssem;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RTf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C696370RTf extends C09AY implements Function1<C0RTB, Unit> {
    public final /* synthetic */ TranslationControlsAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C696370RTf(TranslationControlsAssem translationControlsAssem) {
        super(1);
        this.LL = translationControlsAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTB c0rtb) {
        C0RTB c0rtb2 = c0rtb;
        this.LL.getClass();
        c0rtb2.LLJIJIL = C1163440gNi.LIZLLL;
        c0rtb2.LLJI = R.id.yj5;
        c0rtb2.LLILLL = C13LE.LIZ(TranslationStatusAssem.class);
        c0rtb2.LLJILJIL = this.LL.getContentView();
        return Unit.LIZ;
    }
}
