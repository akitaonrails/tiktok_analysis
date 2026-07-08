package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.request.ExtraRequestInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yPb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$askQuestionWithVideoSug$1", f = "MessageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1856530yPb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MessageViewModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ ExtraRequestInfo LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ BaseVideo LLIZ;
    public final /* synthetic */ BaseImage LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ Integer LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ TakoEditAskInfo LLJILLL;
    public final /* synthetic */ String LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1856530yPb(int i, int i2, int i3, TakoEditAskInfo takoEditAskInfo, MessageViewModel messageViewModel, BaseImage baseImage, BaseVideo baseVideo, ExtraRequestInfo extraRequestInfo, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = messageViewModel;
        this.LLILLJJLI = str;
        this.LLILLL = extraRequestInfo;
        this.LLILZ = num;
        this.LLILZIL = i;
        this.LLILZLL = str2;
        this.LLIZ = baseVideo;
        this.LLIZLLLIL = baseImage;
        this.LLJ = i2;
        this.LLJI = i3;
        this.LLJIJIL = num2;
        this.LLJILJIL = str3;
        this.LLJILJILJ = str4;
        this.LLJILLL = takoEditAskInfo;
        this.LLJJ = str5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        MessageViewModel messageViewModel = this.LL;
        String str = this.LLILLJJLI;
        ExtraRequestInfo extraRequestInfo = this.LLILLL;
        Integer num = this.LLILZ;
        int i = this.LLILZIL;
        String str2 = this.LLILZLL;
        BaseVideo baseVideo = this.LLIZ;
        BaseImage baseImage = this.LLIZLLLIL;
        return new C1856530yPb(i, this.LLJ, this.LLJI, this.LLJILLL, messageViewModel, baseImage, baseVideo, extraRequestInfo, num, this.LLJIJIL, str, str2, this.LLJILJIL, this.LLJILJILJ, this.LLJJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageViewModel@9229.askQuestionWithVideoSug$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.XQ2(this.LLILLJJLI);
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this.LL);
        C1DFB c1dfb = C0PEM.LIZJ;
        MessageViewModel messageViewModel = this.LL;
        ExtraRequestInfo extraRequestInfo = this.LLILLL;
        Integer num = this.LLILZ;
        int i = this.LLILZIL;
        String str = this.LLILZLL;
        String str2 = this.LLILLJJLI;
        BaseVideo baseVideo = this.LLIZ;
        BaseImage baseImage = this.LLIZLLLIL;
        C23250099c.LIZLLL(viewModelScope, c1dfb, null, new C1860530yW3(i, this.LLJ, this.LLJI, this.LLJILLL, messageViewModel, baseImage, baseVideo, extraRequestInfo, num, this.LLJIJIL, str, str2, this.LLJILJIL, this.LLJILJILJ, this.LLJJ, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageViewModel@9229.askQuestionWithVideoSug$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
