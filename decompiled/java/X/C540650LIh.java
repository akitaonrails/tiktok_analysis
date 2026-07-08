package X;

import com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.ILyricsRuleTemplatePreloadService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0LIh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.lyriceffect.LyricEffectAnchorAlbumComponent$proceedToEdit$deferred$1$2", f = "LyricEffectAnchorAlbumComponent.kt", l = {330}, m = "invokeSuspend")
public final class C540650LIh extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ ILyricsRuleTemplatePreloadService LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C540650LIh(ILyricsRuleTemplatePreloadService iLyricsRuleTemplatePreloadService, String str, String str2, InterfaceC1364105Vn<? super C540650LIh> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = iLyricsRuleTemplatePreloadService;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C540650LIh(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        C1C7U.LIZ("LyricEffectAnchorAlbumComponent@3409.proceedToEdit$deferred$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z3 = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ILyricsRuleTemplatePreloadService iLyricsRuleTemplatePreloadService = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            this.LL = 1;
            obj = iLyricsRuleTemplatePreloadService.LIZIZ(str, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LyricEffectAnchorAlbumComponent@3409.proceedToEdit$deferred$1$2");
                return objLJFF;
            }
        }
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLILLJJLI.LJI(this.LLILLL, this.LLILZ) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            z3 = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z3);
        C1C7U.LIZIZ("LyricEffectAnchorAlbumComponent@3409.proceedToEdit$deferred$1$2");
        return boolValueOf;
    }
}
