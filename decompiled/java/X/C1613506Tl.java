package X;

import com.ss.android.ugc.aweme.feed.landscape.cell.assem.caption.LandscapeCellCaptionSwitchAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;

/* JADX INFO: renamed from: X.06Tl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.landscape.cell.assem.caption.LandscapeCellCaptionSwitchAssem$registerCaptionToggleChange$1", f = "LandscapeCellCaptionSwitchAssem.kt", l = {}, m = "invokeSuspend")
public final class C1613506Tl extends C09AX implements InterfaceC1631620sYq<Boolean, Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LandscapeCellCaptionSwitchAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1613506Tl(LandscapeCellCaptionSwitchAssem landscapeCellCaptionSwitchAssem, InterfaceC1364105Vn<? super C1613506Tl> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = landscapeCellCaptionSwitchAssem;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LandscapeCellCaptionSwitchAssem@8179.registerCaptionToggleChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        Object obj3 = this.LLILLJJLI;
        C20703515zt c20703515zt = C20703515zt.LIZ;
        Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(this.LLILLL)).getAweme();
        c20703515zt.getClass();
        if (!C20703515zt.LJJIII(aweme)) {
            obj2 = obj3;
        }
        C1C7U.LIZIZ("LandscapeCellCaptionSwitchAssem@8179.registerCaptionToggleChange$1");
        return obj2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, Boolean bool2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C1613506Tl c1613506Tl = new C1613506Tl(this.LLILLL, interfaceC1364105Vn);
        c1613506Tl.LL = bool;
        c1613506Tl.LLILLJJLI = bool2;
        return c1613506Tl.invokeSuspend(Unit.LIZ);
    }
}
