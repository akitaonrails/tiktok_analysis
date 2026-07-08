package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NPj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.music.replacemusic.CopyrightViolationSnackBarTask$showPopup$2", f = "CopyrightViolationSnackBarTask.kt", l = {152}, m = "invokeSuspend")
public final class C593450NPj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C10I5 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593450NPj(C10I5 c10i5, InterfaceC1364105Vn<? super C593450NPj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c10i5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593450NPj(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CopyrightViolationSnackBarTask@414e.showPopup$2");
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
            IReplaceMusicDownloadService iReplaceMusicDownloadService = (IReplaceMusicDownloadService) PluggableExtentionKt.pluggableSpi$default(IReplaceMusicDownloadService.class, false, false, false, 14, null);
            if (iReplaceMusicDownloadService != null) {
                Aweme aweme = this.LLILLJJLI.LLILLJJLI;
                this.LL = 1;
                if (iReplaceMusicDownloadService.LJI(aweme) == objLJFF) {
                    C1C7U.LIZIZ("CopyrightViolationSnackBarTask@414e.showPopup$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CopyrightViolationSnackBarTask@414e.showPopup$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
