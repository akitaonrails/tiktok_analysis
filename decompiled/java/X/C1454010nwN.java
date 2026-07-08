package X;

import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS136S1100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1454010nwN extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1454020nwO LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1454010nwN(C1454020nwO c1454020nwO, boolean z, Function1<? super Boolean, Unit> function1, boolean z2, String str) {
        super(0);
        this.LL = c1454020nwO;
        this.LLILLJJLI = z;
        this.LLILLL = function1;
        this.LLILZ = z2;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1454020nwO c1454020nwO = this.LL;
        c1454020nwO.LLJJ = true;
        c1454020nwO.n5().vW1().setValue(C1452730nuJ.LIZJ());
        this.LL.x5().LIZIZ();
        C1454020nwO c1454020nwO2 = this.LL;
        c1454020nwO2.LLJJJ = (C1450610nqt) c1454020nwO2.H5().V51(C1450610nqt.class);
        this.LL.H5().NH0(true);
        C1456140nzo.LIZIZ(this.LL.n5(), false, false, false, false, 12);
        C1454020nwO c1454020nwO3 = this.LL;
        c1454020nwO3.i3(new AwS136S1100000_22(this.LLILZIL, c1454020nwO3, 1));
        this.LL.d6();
        String strY7 = this.LL.y7(this.LLILLJJLI);
        if (Intrinsics.LJFF(strY7, "ai_photo_cover")) {
            VideoPublishEditModel videoPublishEditModelN5 = this.LL.N5();
            videoPublishEditModelN5.creativeModel.aiCoverMobModel.hasEnteredAiCover = true;
            C1454050nwR.LIZ.getClass();
            if (videoPublishEditModelN5.creativeModel.aiCoverMobModel.usedPicCnt == null) {
                C1454050nwR.LJIIJ(videoPublishEditModelN5);
            }
        }
        super/*ge.i*/.show();
        this.LLILLL.invoke(Boolean.TRUE);
        if (this.LLILZ) {
            this.LL.u8();
        }
        C1454060nwS c1454060nwS = C1454060nwS.LIZ;
        VideoPublishEditModel videoPublishEditModelN52 = this.LL.N5();
        C1155300gAa c1155300gAa = new C1155300gAa(strY7, this.LLILZIL, Intrinsics.LJFF(strY7, "ai_photo_cover") ? this.LL.N5().creativeModel.aiCoverMobModel.usedPicCnt : null);
        c1454060nwS.getClass();
        int iIntValue = C580270MpN.LJIIJJI(videoPublishEditModelN52).getSecond().intValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", videoPublishEditModelN52.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModelN52.getCreationId());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModelN52));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModelN52));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LIZ(iIntValue, "pic_cnt");
        C1413430msv.LJFF(videoPublishEditModelN52, c0lab);
        C580270MpN.LJFF(videoPublishEditModelN52, c0lab);
        C1454050nwR.LIZJ(c0lab, c1155300gAa);
        C20684815ws.LJIILLIIL("enter_collage_template_page", c0lab.LIZ);
        SingleImageData singleImageData = this.LL.LLJJIJIL;
        if (singleImageData == null || singleImageData.getCollageInfo() == null) {
            this.LL.m6();
        } else {
            this.LL.L7();
        }
        return Unit.LIZ;
    }
}
