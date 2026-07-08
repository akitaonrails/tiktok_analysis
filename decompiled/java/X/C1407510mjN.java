package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.social.sendtodm.MultiImageSendToDMComponent;
import com.ss.android.ugc.gamora.editor.services.IDMCreativeEditService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mjN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.sendtodm.MultiImageSendToDMComponent$iMEditSharePanelCallback$2$1$showCombinePanel$1", f = "MultiImageSendToDMComponent.kt", l = {}, m = "invokeSuspend")
public final class C1407510mjN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MultiImageSendToDMComponent LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407510mjN(MultiImageSendToDMComponent multiImageSendToDMComponent, boolean z, boolean z2, InterfaceC1364105Vn<? super C1407510mjN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = multiImageSendToDMComponent;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407510mjN(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiImageSendToDMComponent@9b62.iMEditSharePanelCallback$2$1$showCombinePanel$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IDMCreativeEditService iDMCreativeEditServiceO2 = this.LL.o2();
        if (iDMCreativeEditServiceO2 != null) {
            iDMCreativeEditServiceO2.LJIIIIZZ(this.LLILLJJLI ? 1 : 0, this.LLILLL ? 1 : 0, this.LL.T2());
        }
        VideoPublishEditModel videoPublishEditModelT2 = this.LL.T2();
        boolean zLIZIZ = C1441980ncy.LIZIZ(this.LL.T2());
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", videoPublishEditModelT2.getEnterFrom());
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModelT2));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModelT2));
        c0lab.LJ("shoot_way", videoPublishEditModelT2.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModelT2.getCreationId());
        c0lab.LIZ(C580270MpN.LJIIJJI(videoPublishEditModelT2).getSecond().intValue(), "pic_cnt");
        C580270MpN.LJFF(videoPublishEditModelT2, c0lab);
        c0lab.LIZ(zLIZIZ ? 1 : 0, "is_from_multi_photo_special_page");
        C20684815ws.LJIILLIIL("show_save_local_on_edit_page", c0lab.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiImageSendToDMComponent@9b62.iMEditSharePanelCallback$2$1$showCombinePanel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
