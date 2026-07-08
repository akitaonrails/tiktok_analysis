package X;

import Y.ACallableS413S0100000_5;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.android.ugc.gamora.editorpro.model.EditorProCancelData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Ej5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.topbar.EPCancelFlow$cancelActual$5", f = "EPCancelFlow.kt", l = {238}, m = "invokeSuspend")
public final class C372530Ej5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C372540Ej6 LLILLJJLI;
    public final /* synthetic */ EditorProCancelData LLILLL;
    public final /* synthetic */ VideoPublishEditModel LLILZ;
    public final /* synthetic */ Function2<Boolean, Boolean, Unit> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ C0E48 LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C372530Ej5(C372540Ej6 c372540Ej6, EditorProCancelData editorProCancelData, VideoPublishEditModel videoPublishEditModel, Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z, C0E48 c0e48, InterfaceC1364105Vn<? super C372530Ej5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c372540Ej6;
        this.LLILLL = editorProCancelData;
        this.LLILZ = videoPublishEditModel;
        this.LLILZIL = function2;
        this.LLILZLL = z;
        this.LLIZ = c0e48;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C372530Ej5(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC366350EXx interfaceC366350EXx;
        C0EGY c0egy;
        VideoPublishEditModel videoPublishEditModel;
        C1C7U.LIZ("EPCancelFlow@eb7a.cancelActual$5");
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
            C372520Ej4 c372520Ej4LLLLLLIL = this.LLILLJJLI.LIZIZ.LLLLLLIL();
            if (c372520Ej4LLLLLLIL.LIZLLL() && Intrinsics.LJFF(c372520Ej4LLLLLLIL.LIZ.nr(), Boolean.TRUE)) {
                if (C365940EWi.LIZ(this.LLILZ) && (videoPublishEditModel = this.LLILZ) != null && !videoPublishEditModel.creativeModel.draftInfoModel.isDraft) {
                    C361680EFy.LJJIIZI(videoPublishEditModel, C350870DpF.LJI(this.LLIZ), videoPublishEditModel.getVideoLength(), true);
                }
                EditModelProvider.Companion.getClass();
                C386320FCs editorProFileCenter = C0E1T.LIZ().getEditorProFileCenter();
                editorProFileCenter.getClass();
                C15O7.LIZJ(new ACallableS413S0100000_5(editorProFileCenter, 4));
                C0E1T.LIZ().setBgmSoundTrimModel$tools_camera_edit_release(null);
                this.LLILZIL.invoke(false, Boolean.valueOf(this.LLILZLL));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EPCancelFlow@eb7a.cancelActual$5");
                return unit;
            }
            ((C0E5S) this.LLILLJJLI.LJI.getValue()).w6(null, false, false);
            if (this.LLILLL.effectMultiTrackMode && (c0egy = (C0EGY) this.LLILLJJLI.LIZ.LJIIL(null, C0EGY.class)) != null) {
                c0egy.KL2();
            }
            if (C301680Bs6.LIZ() && (interfaceC366350EXx = (InterfaceC366350EXx) this.LLILLJJLI.LIZ.LJIIL(null, InterfaceC366350EXx.class)) != null) {
                this.LL = 1;
                if (interfaceC366350EXx.YE(this) == objLJFF) {
                    C1C7U.LIZIZ("EPCancelFlow@eb7a.cancelActual$5");
                    return objLJFF;
                }
            }
        }
        ((InterfaceC377540ErA) this.LLILLJJLI.LJII.getValue()).Vc0(this.LLILLL, null, false, false);
        EditModelProvider.Companion.getClass();
        C386320FCs editorProFileCenter2 = C0E1T.LIZ().getEditorProFileCenter();
        editorProFileCenter2.getClass();
        C15O7.LIZJ(new ACallableS413S0100000_5(editorProFileCenter2, 4));
        C0E1T.LIZ().setBgmSoundTrimModel$tools_camera_edit_release(null);
        this.LLILZIL.invoke(false, Boolean.valueOf(this.LLILZLL));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EPCancelFlow@eb7a.cancelActual$5");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
