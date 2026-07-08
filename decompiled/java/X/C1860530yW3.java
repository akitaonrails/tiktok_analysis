package X;

import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.request.ExtraRequestInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yW3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$askQuestionWithVideoSug$1$1", f = "MessageViewModel.kt", l = {3186}, m = "invokeSuspend")
public final class C1860530yW3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageViewModel LLILLJJLI;
    public final /* synthetic */ ExtraRequestInfo LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ BaseVideo LLIZLLLIL;
    public final /* synthetic */ BaseImage LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ Integer LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ TakoEditAskInfo LLJJ;
    public final /* synthetic */ String LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1860530yW3(int i, int i2, int i3, TakoEditAskInfo takoEditAskInfo, MessageViewModel messageViewModel, BaseImage baseImage, BaseVideo baseVideo, ExtraRequestInfo extraRequestInfo, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageViewModel;
        this.LLILLL = extraRequestInfo;
        this.LLILZ = num;
        this.LLILZIL = i;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = baseVideo;
        this.LLJ = baseImage;
        this.LLJI = i2;
        this.LLJIJIL = i3;
        this.LLJILJIL = num2;
        this.LLJILJILJ = str3;
        this.LLJILLL = str4;
        this.LLJJ = takoEditAskInfo;
        this.LLJJI = str5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        MessageViewModel messageViewModel = this.LLILLJJLI;
        ExtraRequestInfo extraRequestInfo = this.LLILLL;
        Integer num = this.LLILZ;
        int i = this.LLILZIL;
        String str = this.LLILZLL;
        String str2 = this.LLIZ;
        BaseVideo baseVideo = this.LLIZLLLIL;
        BaseImage baseImage = this.LLJ;
        return new C1860530yW3(i, this.LLJI, this.LLJIJIL, this.LLJJ, messageViewModel, baseImage, baseVideo, extraRequestInfo, num, this.LLJILJIL, str, str2, this.LLJILJILJ, this.LLJILLL, this.LLJJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0355 A[PHI: r3 r13
      0x0355: PHI (r3v25 long) = (r3v20 long), (r3v26 long) binds: [B:72:0x0133, B:70:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x0355: PHI (r13v5 java.lang.String) = (r13v0 java.lang.String), (r13v6 java.lang.String) binds: [B:72:0x0133, B:70:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x037d A[PHI: r5
      0x037d: PHI (r5v1 java.lang.Integer) = (r5v0 java.lang.Integer), (r5v14 java.lang.Integer) binds: [B:41:0x00c7, B:43:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012d A[PHI: r3
      0x012d: PHI (r3v26 long) = (r3v19 long), (r3v27 long) binds: [B:124:0x035a, B:68:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0131 A[PHI: r3 r13
      0x0131: PHI (r3v20 long) = (r3v26 long), (r3v27 long) binds: [B:70:0x012f, B:68:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x0131: PHI (r13v0 java.lang.String) = (r13v6 java.lang.String), (r13v7 java.lang.String) binds: [B:70:0x012f, B:68:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r132) {
        /*
            Method dump skipped, instruction units count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1860530yW3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
