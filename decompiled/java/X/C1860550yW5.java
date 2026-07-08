package X;

import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoReferenceAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.ss.android.ugc.aweme.tako.ccl.model.request.ExtraRequestInfo;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yW5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$uploadImagesAndAskQuestion$1", f = "MessageViewModel.kt", l = {2900}, m = "invokeSuspend")
public final class C1860550yW5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageViewModel LLILLJJLI;
    public final /* synthetic */ TakoReferenceAskInfo LLILLL;
    public final /* synthetic */ TakoEditAskInfo LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ List<BaseImage> LLILZLL;
    public final /* synthetic */ List<ConvertStyleItem> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ Integer LLJIJIL;
    public final /* synthetic */ int LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ Function1<List<BaseImage>, Unit> LLJJ;
    public final /* synthetic */ Function1<Long, Unit> LLJJI;
    public final /* synthetic */ ExtraRequestInfo LLJJIII;
    public final /* synthetic */ Map<String, String> LLJJIJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1860550yW5(MessageViewModel messageViewModel, TakoReferenceAskInfo takoReferenceAskInfo, TakoEditAskInfo takoEditAskInfo, String str, List<BaseImage> list, List<ConvertStyleItem> list2, String str2, boolean z, int i, Integer num, int i2, String str3, String str4, Function1<? super List<BaseImage>, Unit> function1, Function1<? super Long, Unit> function12, ExtraRequestInfo extraRequestInfo, Map<String, String> map, InterfaceC1364105Vn<? super C1860550yW5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageViewModel;
        this.LLILLL = takoReferenceAskInfo;
        this.LLILZ = takoEditAskInfo;
        this.LLILZIL = str;
        this.LLILZLL = list;
        this.LLIZ = list2;
        this.LLIZLLLIL = str2;
        this.LLJ = z;
        this.LLJI = i;
        this.LLJIJIL = num;
        this.LLJILJIL = i2;
        this.LLJILJILJ = str3;
        this.LLJILLL = str4;
        this.LLJJ = function1;
        this.LLJJI = function12;
        this.LLJJIII = extraRequestInfo;
        this.LLJJIJI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1860550yW5(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[PHI: r3
      0x00a4: PHI (r3v10 long) = (r3v1 long), (r3v11 long) binds: [B:43:0x023f, B:22:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x023a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r124) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1860550yW5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
