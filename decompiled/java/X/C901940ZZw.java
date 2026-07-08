package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZZw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901940ZZw extends C09AY implements InterfaceC1631630sYr<Uri, View, C428600GrK, Animatable, Unit> {
    public final /* synthetic */ Function1<InterfaceC902450Zal, Unit> LL;
    public final /* synthetic */ C901890ZZr LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;
    public final /* synthetic */ BaseTemplate LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C0ZSW LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C901940ZZw(Function1<? super InterfaceC902450Zal, Unit> function1, C901890ZZr c901890ZZr, C869590Y9l c869590Y9l, BaseTemplate baseTemplate, String str, C0ZSW c0zsw) {
        super(4);
        this.LL = function1;
        this.LLILLJJLI = c901890ZZr;
        this.LLILLL = c869590Y9l;
        this.LLILZ = baseTemplate;
        this.LLILZIL = str;
        this.LLILZLL = c0zsw;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C901890ZZr c901890ZZr = this.LLILLJJLI;
        C869590Y9l c869590Y9l = this.LLILLL;
        BaseTemplate baseTemplate = this.LLILZ;
        String str = this.LLILZIL;
        C0ZSW c0zsw = this.LLILZLL;
        c901890ZZr.LLJILJILJ.setValue(EnumC901970ZZz.LLILLL);
        C869590Y9l c869590Y9l2 = c901890ZZr.LLJ;
        if (c869590Y9l2 == null || !C0ZDX.LJJJJ(c869590Y9l2)) {
            c901890ZZr.LJIIIZ(c869590Y9l, baseTemplate, str, c0zsw);
        }
        Function1<InterfaceC902450Zal, Unit> function1 = this.LL;
        if (function1 != null) {
            function1.invoke(C0ICO.LIZ);
        }
        return Unit.LIZ;
    }
}
