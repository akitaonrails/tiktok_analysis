package X;

import Y.ACListenerS108S0200000_4;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS407S0200000_6;
import njp.a;

/* JADX INFO: renamed from: X.0Xmb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audio.copyrightdetect.longvideo.EditLongVideoAudioCopyrightController$showAuthorizeDialogIfNeed$1$1", f = "EditLongVideoAudioCopyrightController.kt", l = {}, m = "invokeSuspend")
public final class C858830Xmb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C856690Xj9 LL;
    public final /* synthetic */ FragmentManager LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ VideoPublishEditModel LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C858830Xmb(C856690Xj9 c856690Xj9, FragmentManager fragmentManager, Context context, VideoPublishEditModel videoPublishEditModel, int i, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1364105Vn<? super C858830Xmb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c856690Xj9;
        this.LLILLJJLI = fragmentManager;
        this.LLILLL = context;
        this.LLILZ = videoPublishEditModel;
        this.LLILZIL = i;
        this.LLILZLL = function0;
        this.LLIZ = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C858830Xmb(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditLongVideoAudioCopyrightController@31d.showAuthorizeDialogIfNeed$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C856690Xj9 c856690Xj9 = this.LL;
        FragmentManager fragmentManager = this.LLILLJJLI;
        Context context = this.LLILLL;
        VideoPublishEditModel videoPublishEditModel = this.LLILZ;
        int i = this.LLILZIL;
        Function0<Unit> function0 = this.LLILZLL;
        Function0<Unit> function02 = this.LLIZ;
        c856690Xj9.getClass();
        C856830XjN.LIZLLL();
        C858290Xlj.LIZ.getClass();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bm7, null, false);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS407S0200000_6(viewTd, function0, 45));
        c0om1.LIZIZ(c1251150ifB);
        C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.csy);
        if (c197039127h != null) {
            c197039127h.setButtonVariant(0);
            C786410Ut5.U8(c197039127h, new ACListenerS108S0200000_4(viewTd, function02, 3));
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIL = c0om1;
        tuxSheet.LLJJJ = null;
        tuxSheet.LLJJIII = viewTd;
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJIIJIL = true;
        tuxSheet2.LL = new DialogInterfaceOnCancelListenerC346360Dhy(viewTd, 0);
        tuxSheet2.show(fragmentManager, "showAuthorizeDialog");
        C856790XjJ c856790XjJ = C856790XjJ.LIZ;
        String creationId = videoPublishEditModel.getCreationId();
        String str = videoPublishEditModel.mShootWay;
        if (str == null) {
            str = "";
        }
        String strValueOf = String.valueOf(videoPublishEditModel.getDraftId());
        String strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel);
        String strLJIILIIL = C1428470nHB.LJIILIIL(videoPublishEditModel);
        int iLIZ = c856690Xj9.LIZ();
        String musicId = videoPublishEditModel.getMusicId();
        boolean zLIZIZ = C857680Xkk.LIZIZ(videoPublishEditModel);
        c856790XjJ.getClass();
        C856790XjJ.LJIIIIZZ(iLIZ, i, zLIZIZ ? 1 : 0, creationId, str, strValueOf, strLJIILL, strLJIILIIL, musicId);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditLongVideoAudioCopyrightController@31d.showAuthorizeDialogIfNeed$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
