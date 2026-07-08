package X;

import Y.ACListenerS112S0200000_8;
import Y.AObjectS383S0100000_8;
import android.os.SystemClock;
import android.widget.ImageView;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LxT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity$onPlayerCompileStart$1", f = "NewCutPlayerActivity.kt", l = {}, m = "invokeSuspend")
public final class C559810LxT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ NewCutPlayerActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C559810LxT(NewCutPlayerActivity newCutPlayerActivity, InterfaceC1364105Vn<? super C559810LxT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = newCutPlayerActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C559810LxT(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    public static Unit lambda$semisugar$invokeSuspend$lambda$0$0(NewCutPlayerActivity newCutPlayerActivity) {
        AbstractBinderC539770LEx abstractBinderC539770LEx = newCutPlayerActivity.LLILLJJLI;
        if (abstractBinderC539770LEx != null) {
            abstractBinderC539770LEx.report(1006, String.valueOf(SystemClock.uptimeMillis() - newCutPlayerActivity.LLJJJJLIIL), null, null, null, null, null);
        }
        INLEPlayer iNLEPlayer = newCutPlayerActivity.LLILZLL;
        if (iNLEPlayer != null) {
            iNLEPlayer.stop();
        }
        INLEPlayer iNLEPlayer2 = newCutPlayerActivity.LLILZLL;
        if (iNLEPlayer2 != null) {
            iNLEPlayer2.prepare();
        }
        INLEPlayer iNLEPlayer3 = newCutPlayerActivity.LLILZLL;
        if (iNLEPlayer3 != null) {
            iNLEPlayer3.play();
        }
        return Unit.LIZ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NewCutPlayerActivity@18cb.onPlayerCompileStart$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        NewCutPlayerActivity newCutPlayerActivity = this.LL;
        String string = newCutPlayerActivity.getString(2131830067);
        AObjectS383S0100000_8 aObjectS383S0100000_8 = new AObjectS383S0100000_8(this.LL, 19);
        if (!newCutPlayerActivity.isFinishing()) {
            ProgressDialogC1397780mTg progressDialogC1397780mTgLIZIZ = ProgressDialogC1397780mTg.LIZIZ(newCutPlayerActivity, string);
            ACListenerS112S0200000_8 aCListenerS112S0200000_8 = new ACListenerS112S0200000_8(progressDialogC1397780mTgLIZIZ, aObjectS383S0100000_8, 19);
            ImageView imageView = (ImageView) progressDialogC1397780mTgLIZIZ.findViewById(R.id.jz7);
            if (imageView != null) {
                C786410Ut5.Q7(imageView, aCListenerS112S0200000_8);
            }
            ImageView imageView2 = (ImageView) progressDialogC1397780mTgLIZIZ.findViewById(R.id.jz7);
            if (imageView2 != null) {
                C786410Ut5.LJZI(0, imageView2);
            }
            progressDialogC1397780mTgLIZIZ.setProgress(0);
            this.LL.LLJLL = progressDialogC1397780mTgLIZIZ;
            progressDialogC1397780mTgLIZIZ.show();
            C785410UrT.LIZIZ(progressDialogC1397780mTgLIZIZ);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(progressDialogC1397780mTgLIZIZ);
            C816490W1f.LIZ(progressDialogC1397780mTgLIZIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NewCutPlayerActivity@18cb.onPlayerCompileStart$1");
        return unit;
    }
}
