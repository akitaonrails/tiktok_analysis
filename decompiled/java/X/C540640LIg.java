package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.ILyricsRuleTemplatePreloadService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LIg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.lyriceffect.LyricEffectAnchorAlbumComponent$proceedToEdit$deferred$1", f = "LyricEffectAnchorAlbumComponent.kt", l = {321}, m = "invokeSuspend")
public final class C540640LIg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C540660LIi LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ ILyricsRuleTemplatePreloadService LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C540640LIg(C540660LIi c540660LIi, Activity activity, ILyricsRuleTemplatePreloadService iLyricsRuleTemplatePreloadService, String str, String str2, InterfaceC1364105Vn<? super C540640LIg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c540660LIi;
        this.LLILLL = activity;
        this.LLILZ = iLyricsRuleTemplatePreloadService;
        this.LLILZIL = str;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C540640LIg(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricEffectAnchorAlbumComponent@3409.proceedToEdit$deferred$1");
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
            C540660LIi c540660LIi = this.LLILLJJLI;
            Activity activity = this.LLILLL;
            Pair<Integer, ? extends Function1<? super InterfaceC1364105Vn<? super Boolean>, ? extends Object>>[] pairArr = {new Pair<>(C2286608xc.LJ(50), new C540630LIf(this.LLILZ, this.LLILZIL, this.LLILZLL, null)), new Pair<>(C2286608xc.LJ(95), new C540650LIh(this.LLILZ, this.LLILZIL, this.LLILZLL, null))};
            this.LL = 1;
            obj = c540660LIi.i3(activity, pairArr, true, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LyricEffectAnchorAlbumComponent@3409.proceedToEdit$deferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("LyricEffectAnchorAlbumComponent@3409.proceedToEdit$deferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
