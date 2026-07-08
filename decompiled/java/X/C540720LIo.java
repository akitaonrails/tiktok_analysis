package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.ILyricsRuleTemplatePreloadService;
import com.ss.android.ugc.aweme.shortvideo.lyriceffect.LyricEffectAnchorRecordGate;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.lyriceffect.LyricEffectAnchorRecordGate$startWait$1", f = "LyricEffectAnchorRecordGate.kt", l = {169}, m = "invokeSuspend")
public final class C540720LIo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ LyricEffectAnchorRecordGate LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ ILyricsRuleTemplatePreloadService LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C540720LIo(String str, String str2, LyricEffectAnchorRecordGate lyricEffectAnchorRecordGate, Function0<Unit> function0, Function0<Unit> function02, ILyricsRuleTemplatePreloadService iLyricsRuleTemplatePreloadService, InterfaceC1364105Vn<? super C540720LIo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = lyricEffectAnchorRecordGate;
        this.LLILZIL = function0;
        this.LLILZLL = function02;
        this.LLIZ = iLyricsRuleTemplatePreloadService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C540720LIo(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        int i;
        C1C7U.LIZ("LyricEffectAnchorRecordGate@f3e6.startWait$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        boolean z = true;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C540730LIp c540730LIp = new C540730LIp(this.LLIZ, this.LLILLJJLI, this.LLILLL, this.LLILZ, null);
                this.LL = 1;
                obj = C099A.LIZJ(20000L, c540730LIp, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LyricEffectAnchorRecordGate@f3e6.startWait$1");
                    return objLJFF;
                }
            }
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SLOW-PATH-END key=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append('#');
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(" result=ok");
                C1426005i6.LIZ(c1398350mUb, "Anchor.Record.Gate", C2188811AlT.LIZIZ(sbLIZ));
                this.LLILZ.LIZIZ();
                CreativeDialogWrapper creativeDialogWrapper = this.LLILZ.LJ;
                if (creativeDialogWrapper != null) {
                    CreativeLoadingDialog.DefaultImpls.updateProgress$default(creativeDialogWrapper, 100, false, 2, null);
                }
                CreativeDialogWrapper creativeDialogWrapper2 = this.LLILZ.LJ;
                if (creativeDialogWrapper2 != null) {
                    creativeDialogWrapper2.dismiss();
                }
                this.LLILZIL.invoke();
            } else {
                C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("SLOW-PATH-END key=");
                sbLIZ2.append(this.LLILLJJLI);
                sbLIZ2.append('#');
                sbLIZ2.append(this.LLILLL);
                sbLIZ2.append(" result=fail wait-failed-or-timed-out (20000ms)");
                C1426005i6.LIZJ(c1398350mUb2, "Anchor.Record.Gate", C2188811AlT.LIZIZ(sbLIZ2));
                this.LLILZ.LIZIZ();
                CreativeDialogWrapper creativeDialogWrapper3 = this.LLILZ.LJ;
                if (creativeDialogWrapper3 != null) {
                    creativeDialogWrapper3.dismiss();
                }
                LyricEffectAnchorRecordGate lyricEffectAnchorRecordGate = this.LLILZ;
                String strLIZJ = lyricEffectAnchorRecordGate.LIZJ();
                String strLIZLLL = lyricEffectAnchorRecordGate.LIZLLL();
                ILyricsRuleTemplatePreloadService iLyricsRuleTemplatePreloadService = (ILyricsRuleTemplatePreloadService) PluggableExtentionKt.pluggableSpi$default(ILyricsRuleTemplatePreloadService.class, false, false, false, 14, null);
                if (strLIZJ == null || strLIZLLL == null || iLyricsRuleTemplatePreloadService == null || !iLyricsRuleTemplatePreloadService.LJII(strLIZJ, strLIZLLL)) {
                    z = false;
                }
                if (z) {
                    i = 2131830633;
                } else {
                    i = 2131829438;
                }
                C19EG c19eg = lyricEffectAnchorRecordGate.LIZIZ;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(i);
                C1390380mHk.LIZ(c19eg, 1076, creativeToastBuilder);
                this.LLILZLL.invoke();
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LyricEffectAnchorRecordGate@f3e6.startWait$1");
            return unit;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            C1398350mUb c1398350mUb3 = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("SLOW-PATH-END key=");
            sbLIZ3.append(this.LLILLJJLI);
            sbLIZ3.append('#');
            sbLIZ3.append(this.LLILLL);
            sbLIZ3.append(" result=cancelled");
            C1426005i6.LIZJ(c1398350mUb3, "Anchor.Record.Gate", C2188811AlT.LIZIZ(sbLIZ3));
            this.LLILZ.LIZIZ();
            CreativeDialogWrapper creativeDialogWrapper4 = this.LLILZ.LJ;
            if (creativeDialogWrapper4 != null) {
                creativeDialogWrapper4.dismiss();
            }
            throw e;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
