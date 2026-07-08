package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS231S0000000_3;
import njp.a;

/* JADX INFO: renamed from: X.09oo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.magic.ui.MagicPanelComponent$hanleBeforeCloseMagicPanel$2$2$1$1", f = "MagicPanelComponent.kt", l = {}, m = "invokeSuspend")
public final class C2486809oo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends String>>, Object> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ NLETrackSlot LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2486809oo(VideoPublishEditModel videoPublishEditModel, NLETrackSlot nLETrackSlot, InterfaceC1364105Vn<? super C2486809oo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = nLETrackSlot;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2486809oo(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MagicPanelComponent@546d.hanleBeforeCloseMagicPanel$2$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2486309oj c2486309oj = C2486309oj.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LL;
        NLETrackSlot nLETrackSlot = this.LLILLJJLI;
        AFwS231S0000000_3 aFwS231S0000000_3 = AFwS231S0000000_3.get$arr$(106);
        c2486309oj.getClass();
        Pair pairLIZLLL = C2486309oj.LIZLLL(videoPublishEditModel.getCreativeInfo(), nLETrackSlot, aFwS231S0000000_3);
        C1C7U.LIZIZ("MagicPanelComponent@546d.hanleBeforeCloseMagicPanel$2$2$1$1");
        return pairLIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
