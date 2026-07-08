package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MJ1, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.LyricsRuleTemplateApplier$apply$launchLyric$1$1$1", f = "LyricsRuleTemplateApplier.kt", l = {}, m = "invokeSuspend")
public final class C0MJ1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1415130mvf LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MJ1(C1415130mvf c1415130mvf, String str, String str2, String str3, InterfaceC1364105Vn<? super C0MJ1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1415130mvf;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MJ1(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        NLEModel nLEModelLIZJ;
        NLETrack mainTrack;
        VideoPublishEditModel videoPublishEditModelInvoke;
        CreativeModel creativeModel;
        AutoCutModel autoCutModel;
        String str;
        C1463670oBx c1463670oBx;
        C1C7U.LIZ("LyricsRuleTemplateApplier@cea7.apply$launchLyric$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1452170ntP value = this.LL.LIZ.g().getValue();
        Unit unit = null;
        if ((value instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) value) != null) {
            nLEModelLIZJ = c1463670oBx.LIZJ();
            if (nLEModelLIZJ != null) {
                C1463860oCG c1463860oCG = c1463670oBx.LJI;
                if (c1463860oCG == null) {
                    c1463860oCG = null;
                }
                c1463860oCG.setDataSource(nLEModelLIZJ);
            }
        } else {
            nLEModelLIZJ = null;
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(".DataSourceSynced");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("key=");
        sbLIZ2.append(this.LLILLL);
        sbLIZ2.append(" syncedNleHash=");
        sbLIZ2.append(System.identityHashCode(nLEModelLIZJ));
        C1426005i6.LIZ(c1398350mUb, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        if (nLEModelLIZJ != null && (mainTrack = nLEModelLIZJ.getMainTrack()) != null) {
            C1415130mvf c1415130mvf = this.LL;
            String str2 = this.LLILZ;
            mainTrack.setExtra("using_template_type", String.valueOf(EnumC1412640mre.LYRICS_RULE_TEMPLATE.getValue()));
            Function0<VideoPublishEditModel> function0 = c1415130mvf.LJFF;
            if (function0 != null && (videoPublishEditModelInvoke = function0.invoke()) != null && (creativeModel = videoPublishEditModelInvoke.creativeModel) != null && (autoCutModel = creativeModel.autoCutModel) != null && (str = autoCutModel.curTemplateId) != null && str.length() > 0) {
                str2 = str;
            }
            mainTrack.setExtra("using_template_id", str2);
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("LyricsRuleTemplateApplier@cea7.apply$launchLyric$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
