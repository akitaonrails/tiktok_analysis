package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.inbox.bulletin.view.BaseBulletinBarAssem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBubbleStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0OVH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OVH implements InterfaceC619970OTj {
    public final /* synthetic */ Function0<Boolean> LIZ;
    public final /* synthetic */ BaseBulletinBarAssem LIZIZ;
    public final /* synthetic */ Function0<Unit> LIZJ;

    @Override // X.InterfaceC619970OTj
    public final boolean isAvailable() {
        return (!this.LIZ.invoke().booleanValue() || C1982307pd.LIZIZ() || this.LIZIZ.LLJJIJIIJIL == null) ? false : true;
    }

    @Override // X.InterfaceC619970OTj
    public final void q0(Function0<Unit> function0) {
        String string;
        BaseBulletinBarAssem baseBulletinBarAssem = this.LIZIZ;
        C0OM3 c0om3 = baseBulletinBarAssem.LLJILJILJ;
        if (c0om3 != null) {
            Function0<Unit> function02 = this.LIZJ;
            BulletinBubbleStruct bulletinBubbleStruct = baseBulletinBarAssem.LLJJIJIIJIL;
            if (bulletinBubbleStruct == null || (string = bulletinBubbleStruct.content) == null || !(!a0.LJJJIL(string))) {
                string = c0om3.getContext().getString(2131827264);
            }
            C450720Hlu c450720Hlu = new C450720Hlu(c0om3.getContext());
            c450720Hlu.LLILZ = string;
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZIZ = c0om3;
            c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
            c1391600mJi.LJIIL = true;
            c450720Hlu.LLILLJJLI.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
            c450720Hlu.LLILLJJLI.LJFF = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            c450720Hlu.LJ(new AwS553S0100000_9(function02, (Function0<Unit>) 1859));
            c450720Hlu.LIZJ(new AwS588S0100000_9(function0, (Function0<Unit>) 688));
            c450720Hlu.LLILLJJLI.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
            c450720Hlu.LIZIZ().show();
            return;
        }
        function0.invoke();
    }

    public C0OVH(Function0<Boolean> function0, BaseBulletinBarAssem baseBulletinBarAssem, Function0<Unit> function02) {
        this.LIZ = function0;
        this.LIZIZ = baseBulletinBarAssem;
        this.LIZJ = function02;
    }
}
