package X;

import Y.AgS0S1411100_8;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0MLO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.component.OnThisDayUnifiedPublishComponent$publish$1", f = "OnThisDayUnifiedPublishComponent.kt", l = {99, 127, 162, 206}, m = "invokeSuspend")
public final class C0MLO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public CreativeDialogWrapper LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0MLM LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ ForwardMedia LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MLO(C0MLM c0mlm, Context context, ForwardMedia forwardMedia, boolean z, InterfaceC1364105Vn<? super C0MLO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0mlm;
        this.LLILZ = context;
        this.LLILZIL = forwardMedia;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MLO(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CreativeLoadingDialog creativeLoadingDialogCreateLoadingDialog;
        int size;
        List<PhotoModeImageUrlModel> imageList;
        String str;
        MediaModel mediaModel;
        C1C7U.LIZ("OnThisDayUnifiedPublishComponent@4f3.publish$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("OnThisDayUnifiedPublishComponent@4f3.publish$1");
                return unit;
            }
            creativeLoadingDialogCreateLoadingDialog = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C19576911iZ c19576911iZ = C19576911iZ.LIZ;
            C19EG activity = this.LLILLL.getActivity();
            CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
            creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE);
            creativeLoadingDialogBuilder.clickCancelListener(new AwS587S0100000_8(this.LLILLL, 433));
            creativeLoadingDialogBuilder.loadingMessage(this.LLILZ.getString(2131847921));
            creativeLoadingDialogCreateLoadingDialog = c19576911iZ.createLoadingDialog(activity, 1605, creativeLoadingDialogBuilder);
            CreativeDialogWrapper creativeDialogWrapper = (CreativeDialogWrapper) creativeLoadingDialogCreateLoadingDialog;
            creativeDialogWrapper.show();
            C1DFB c1dfb = C0PEM.LIZJ;
            C0MLT c0mlt = new C0MLT(this.LLILLL, this.LLILZ, null);
            this.LL = creativeDialogWrapper;
            this.LLILLJJLI = 1;
            if (C23250099c.LJI(this, c1dfb, c0mlt) == objLJFF) {
                C1C7U.LIZIZ("OnThisDayUnifiedPublishComponent@4f3.publish$1");
                return objLJFF;
            }
        }
        MediaModel mediaModel2 = this.LLILZIL.localMedia;
        if (mediaModel2 != null && mediaModel2.LJIIJ()) {
            size = 1;
        } else {
            PhotoModeImageInfo photoModeImageInfo = this.LLILZIL.photoModeImageInfo;
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                size = imageList.size();
            } else {
                size = 0;
            }
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LLILZLL) {
            str = "publish_story";
        } else {
            str = "publish";
        }
        if (C565720MGs.LIZ(this.LLILZIL) || ((mediaModel = this.LLILZIL.localMedia) != null && mediaModel.LJIIJ())) {
            if (size > 1) {
                C0MKJ c0mkj = C0MKJ.LIZ;
                Context context = this.LLILZ;
                ForwardMedia forwardMedia = this.LLILZIL;
                C0MMK c0mmkG2 = this.LLILLL.G2();
                CreativeInfo creativeInfo = this.LLILLL.H2().getCreativeInfo();
                c0mkj.getClass();
                InterfaceC346201Wa interfaceC346201WaLJIL = C09IC.LJIL(new C2501109r7(new C0MLQ(creativeLoadingDialogCreateLoadingDialog, this.LLILLL, jCurrentTimeMillis, size, str, null), C09IC.LJIL(C0MKJ.LJJ(context, forwardMedia, c0mmkG2, creativeInfo), C0PEM.LIZJ), 0), C2108108Nr.LIZ);
                AgS0S1411100_8 agS0S1411100_8 = new AgS0S1411100_8(this.LLILLL, jCurrentTimeMillis, size, str, this.LLILZ, this.LLILZIL, this.LLILZLL, creativeLoadingDialogCreateLoadingDialog, 0);
                this.LL = null;
                this.LLILLJJLI = 2;
                if (interfaceC346201WaLJIL.collect(agS0S1411100_8, this) == objLJFF) {
                    C1C7U.LIZIZ("OnThisDayUnifiedPublishComponent@4f3.publish$1");
                    return objLJFF;
                }
            } else if (size == 1) {
                C0MKJ c0mkj2 = C0MKJ.LIZ;
                Context context2 = this.LLILZ;
                ForwardMedia forwardMedia2 = this.LLILZIL;
                C0MMK c0mmkG22 = this.LLILLL.G2();
                CreativeInfo creativeInfo2 = this.LLILLL.H2().getCreativeInfo();
                CreativeModel creativeModel = this.LLILLL.H2().creativeModel;
                c0mkj2.getClass();
                InterfaceC346201Wa interfaceC346201WaLJIL2 = C09IC.LJIL(new C2501109r7(new C0MLP(creativeLoadingDialogCreateLoadingDialog, this.LLILLL, jCurrentTimeMillis, 1, str, null), C09IC.LJIL(C0MKJ.LJIIIZ(context2, forwardMedia2, c0mmkG22, creativeInfo2, creativeModel), C0PEM.LIZJ), 0), C2108108Nr.LIZ);
                AgS0S1411100_8 agS0S1411100_82 = new AgS0S1411100_8(this.LLILLL, jCurrentTimeMillis, 1, str, this.LLILZ, this.LLILZIL, this.LLILZLL, creativeLoadingDialogCreateLoadingDialog, 1);
                this.LL = null;
                this.LLILLJJLI = 3;
                if (interfaceC346201WaLJIL2.collect(agS0S1411100_82, this) == objLJFF) {
                    C1C7U.LIZIZ("OnThisDayUnifiedPublishComponent@4f3.publish$1");
                    return objLJFF;
                }
            }
        } else {
            C0MKJ c0mkj3 = C0MKJ.LIZ;
            Context context3 = this.LLILZ;
            ForwardMedia forwardMedia3 = this.LLILZIL;
            C0MMK c0mmkG23 = this.LLILLL.G2();
            CreativeInfo creativeInfo3 = this.LLILLL.H2().getCreativeInfo();
            c0mkj3.getClass();
            InterfaceC346201Wa interfaceC346201WaLJIL3 = C09IC.LJIL(new C2501109r7(new C0MLR(creativeLoadingDialogCreateLoadingDialog, this.LLILLL, jCurrentTimeMillis, str, null), C09IC.LJIL(C0MKJ.LJIIIIZZ(context3, forwardMedia3, c0mmkG23, creativeInfo3), C0PEM.LIZJ), 0), C2108108Nr.LIZ);
            final C0MLM c0mlm = this.LLILLL;
            final Context context4 = this.LLILZ;
            final boolean z = this.LLILZLL;
            final ForwardMedia forwardMedia4 = this.LLILZIL;
            final String str2 = str;
            final CreativeLoadingDialog creativeLoadingDialog = creativeLoadingDialogCreateLoadingDialog;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0MLS
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Bundle extras;
                    C0MKG c0mkg = (C0MKG) obj2;
                    if (c0mlm.LLIZLLLIL) {
                        C0ML7 c0ml7 = C0ML7.LIZ;
                        long jX1 = c0mlm.X1(jCurrentTimeMillis);
                        String str3 = str2;
                        c0ml7.getClass();
                        C0ML7.LJIIJJI(2, 1, 0, jX1, str3, "");
                        return Unit.LIZ;
                    }
                    C0ML7 c0ml72 = C0ML7.LIZ;
                    long jX12 = c0mlm.X1(jCurrentTimeMillis);
                    String str4 = str2;
                    c0ml72.getClass();
                    C0ML7.LJIIJJI(0, 1, 0, jX12, str4, "");
                    C0MKJ c0mkj4 = C0MKJ.LIZ;
                    Context context5 = context4;
                    VideoPublishEditModel videoPublishEditModelH2 = c0mlm.H2();
                    c0mkj4.getClass();
                    Intent intentLJIILJJIL = C0MKJ.LJIILJJIL(context5, c0mkg, videoPublishEditModelH2);
                    new C1438570nXT("forward");
                    try {
                        extras = intentLJIILJJIL.getExtras();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        extras = null;
                    }
                    C1438570nXT.LJII(extras, c0mlm.H2());
                    c0mlm.W1(z, forwardMedia4);
                    VideoPublishEditModel videoPublishEditModelH22 = c0mlm.H2();
                    C0CHQ.LIZ().LJI().LJ();
                    videoPublishEditModelH22.setNewVersion(3);
                    C566860MLc.LIZ(c0mlm.H2());
                    if (z) {
                        c0mlm.c3().iX(new AwS552S0100000_8(creativeLoadingDialog, 663));
                    } else {
                        c0mlm.T2().MC(new AwS552S0100000_8(creativeLoadingDialog, 664));
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = null;
            this.LLILLJJLI = 4;
            if (interfaceC346201WaLJIL3.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("OnThisDayUnifiedPublishComponent@4f3.publish$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OnThisDayUnifiedPublishComponent@4f3.publish$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
