package X;

import android.content.Context;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ip9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.StoryPublishHelper$storyCancelUploadSheet$1$2", f = "StoryPublishHelper.kt", l = {114}, m = "invokeSuspend")
public final class C1257330ip9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C09AE LLILLJJLI;
    public final /* synthetic */ C259800zU<AwemeDraft> LLILLL;
    public final /* synthetic */ IAVDraftService LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ Function0<Object> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ C0HTT<C737030Svd> LLJI;
    public final /* synthetic */ Aweme LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1257330ip9(C09AE c09ae, C259800zU<AwemeDraft> c259800zU, IAVDraftService iAVDraftService, Context context, Function0<? extends Object> function0, String str, String str2, String str3, C0HTT<C737030Svd> c0htt, Aweme aweme, InterfaceC1364105Vn<? super C1257330ip9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c09ae;
        this.LLILLL = c259800zU;
        this.LLILZ = iAVDraftService;
        this.LLILZIL = context;
        this.LLILZLL = function0;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = str3;
        this.LLJI = c0htt;
        this.LLJIJIL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1257330ip9(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryPublishHelper@650e.storyCancelUploadSheet$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C09AE c09ae = this.LLILLJJLI;
            this.LL = 1;
            if (c09ae.LJJZ(this) == objLJFF) {
                C1C7U.LIZIZ("StoryPublishHelper@650e.storyCancelUploadSheet$1$2");
                return objLJFF;
            }
        }
        AwemeDraft awemeDraft = this.LLILLL.element;
        if (awemeDraft != null) {
            IAVDraftService iAVDraftService = this.LLILZ;
            Context context = this.LLILZIL;
            Function0<Object> function0 = this.LLILZLL;
            String str = this.LLIZ;
            String str2 = this.LLIZLLLIL;
            String str3 = this.LLJ;
            if (iAVDraftService != null) {
                iAVDraftService.editPostedDraft(context, awemeDraft);
            }
            function0.invoke();
            C1219980hqu.LIZ.getClass();
            C1219980hqu.LIZ(0, str, str2, str3);
        } else {
            C0HTT<C737030Svd> c0htt = this.LLJI;
            Aweme aweme = this.LLJIJIL;
            String str4 = this.LLIZ;
            String str5 = this.LLIZLLLIL;
            String str6 = this.LLJ;
            c0htt.LLIIL(new C737030Svd(2, aweme));
            C1219980hqu.LIZ.getClass();
            C1219980hqu.LIZ(1, str4, str5, str6);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryPublishHelper@650e.storyCancelUploadSheet$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
