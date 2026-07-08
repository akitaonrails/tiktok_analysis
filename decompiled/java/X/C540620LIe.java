package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.EditorProRecordVideoContext;
import com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.ILyricsRuleTemplatePreloadService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.lyriceffect.LyricEffectAnchorAlbumComponent$proceedToRecord$job$1", f = "LyricEffectAnchorAlbumComponent.kt", l = {237}, m = "invokeSuspend")
public final class C540620LIe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C540660LIi LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ ILyricsRuleTemplatePreloadService LLIZ;
    public final /* synthetic */ EditorProRecordVideoContext LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C540620LIe(C540660LIi c540660LIi, Activity activity, String str, String str2, Function0<Unit> function0, ILyricsRuleTemplatePreloadService iLyricsRuleTemplatePreloadService, EditorProRecordVideoContext editorProRecordVideoContext, InterfaceC1364105Vn<? super C540620LIe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c540660LIi;
        this.LLILLL = activity;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = function0;
        this.LLIZ = iLyricsRuleTemplatePreloadService;
        this.LLIZLLLIL = editorProRecordVideoContext;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C540620LIe(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objI3 = obj;
        C1C7U.LIZ("LyricEffectAnchorAlbumComponent@3409.proceedToRecord$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objI3);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objI3);
            C540660LIi c540660LIi = this.LLILLJJLI;
            Activity activity = this.LLILLL;
            Pair<Integer, ? extends Function1<? super InterfaceC1364105Vn<? super Boolean>, ? extends Object>>[] pairArr = {new Pair<>(C2286608xc.LJ(95), new C540610LId(this.LLIZ, this.LLILZ, this.LLILZIL, this.LLILLJJLI, this.LLIZLLLIL, null))};
            this.LL = 1;
            objI3 = c540660LIi.i3(activity, pairArr, false, this);
            if (objI3 == objLJFF) {
                C1C7U.LIZIZ("LyricEffectAnchorAlbumComponent@3409.proceedToRecord$job$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) objI3).booleanValue();
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SLOW-PATH-END key=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append('#');
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(" result=");
        if (zBooleanValue) {
            str = "ok";
        } else {
            str = "fail";
        }
        sbLIZ.append(str);
        C1426005i6.LIZ(c1398350mUb, "Anchor.Album.GateRecord", C2188811AlT.LIZIZ(sbLIZ));
        if (zBooleanValue) {
            this.LLILZLL.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LyricEffectAnchorAlbumComponent@3409.proceedToRecord$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
