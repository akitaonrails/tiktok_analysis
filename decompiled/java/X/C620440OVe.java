package X;

import android.view.View;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.BulletinCreatorEditAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: renamed from: X.0OVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C620440OVe implements InterfaceC619970OTj {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ BulletinCreatorEditAssem LIZIZ;

    @Override // X.InterfaceC619970OTj
    public final boolean isAvailable() {
        if (!this.LIZ || !this.LIZIZ.mp() || !this.LIZIZ.op().To()) {
            return false;
        }
        C0OP4.LIZ.getClass();
        return C0OP4.LIZ().getBoolean("has_show_video_upload", false) ^ true;
    }

    @Override // X.InterfaceC619970OTj
    public final void q0(Function0<Unit> function0) {
        View viewFindViewById = this.LIZIZ.LJJIJL().findViewById(R.id.d4k);
        if (viewFindViewById != null) {
            String string = viewFindViewById.getContext().getString(2131828128);
            C450720Hlu c450720Hlu = new C450720Hlu(viewFindViewById.getContext());
            c450720Hlu.LLILZ = string;
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZIZ = viewFindViewById;
            c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
            c1391600mJi.LJIIL = true;
            c450720Hlu.LLILLJJLI.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
            c450720Hlu.LLILLJJLI.LJFF = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            c450720Hlu.LJ(AFwS195S0000000_9.get$arr$(51));
            c450720Hlu.LIZJ(new AwS588S0100000_9(function0, (Function0<Unit>) 41));
            c450720Hlu.LLILLJJLI.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
            c450720Hlu.LIZIZ().show();
            return;
        }
        function0.invoke();
    }

    public C620440OVe(boolean z, BulletinCreatorEditAssem bulletinCreatorEditAssem) {
        this.LIZ = z;
        this.LIZIZ = bulletinCreatorEditAssem;
    }
}
