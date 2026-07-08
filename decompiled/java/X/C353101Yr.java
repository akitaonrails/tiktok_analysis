package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Yr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.CapCutHelperKt$updateCCMetaDataAnchorAsync$1", f = "CapCutHelper.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT}, m = "invokeSuspend")
public final class C353101Yr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353101Yr(VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn interfaceC1364105Vn, Function0 function0) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function0;
        this.LLILLL = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353101Yr(this.LLILLL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CapCutHelperKt@f8be.updateCCMetaDataAnchorAsync$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C353201Ys c353201Ys = new C353201Ys(this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c353201Ys) == objLJFF) {
                C1C7U.LIZIZ("CapCutHelperKt@f8be.updateCCMetaDataAnchorAsync$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CapCutHelperKt@f8be.updateCCMetaDataAnchorAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
