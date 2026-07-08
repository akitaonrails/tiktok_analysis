package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DtG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.track.ui.TrackPanelComponent$TrackPanelAction$enterAiExtend$2$1", f = "TrackPanelComponent.kt", l = {}, m = "invokeSuspend")
public final class C353360DtG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C359170E6h LL;
    public final /* synthetic */ C0E7Z LLILLJJLI;
    public final /* synthetic */ C0E48 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ NLETrackSlot LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353360DtG(C359170E6h c359170E6h, C0E7Z c0e7z, C0E48 c0e48, String str, String str2, NLETrackSlot nLETrackSlot, long j, InterfaceC1364105Vn<? super C353360DtG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c359170E6h;
        this.LLILLJJLI = c0e7z;
        this.LLILLL = c0e48;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = nLETrackSlot;
        this.LLIZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353360DtG(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TrackPanelComponent$TrackPanelAction@b53e.enterAiExtend$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C359170E6h c359170E6h = this.LL;
        C0E7Z c0e7z = this.LLILLJJLI;
        C19A3 c19a3 = c0e7z.LLJJI;
        C0E48 c0e48 = this.LLILLL;
        VideoPublishEditModel editModel = c0e7z.getEditModel();
        String str = this.LLILZ;
        String str2 = this.LLILZIL;
        NLETrackSlot nLETrackSlot = this.LLILZLL;
        long j = this.LLIZ;
        c359170E6h.getClass();
        C359170E6h.LJI(c19a3, c0e48, editModel, str, str2, nLETrackSlot, j);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TrackPanelComponent$TrackPanelAction@b53e.enterAiExtend$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
