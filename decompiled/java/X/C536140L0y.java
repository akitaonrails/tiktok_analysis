package X;

import android.view.View;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L0y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.viewholder.AILivePhotoShootViewHolder$clickListener$1$1$onLoad$1", f = "AILivePhotoShootViewHolder.kt", l = {44}, m = "invokeSuspend")
public final class C536140L0y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C535990L0j LLILLJJLI;
    public final /* synthetic */ AsyncAVService LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C536140L0y(C535990L0j c535990L0j, AsyncAVService asyncAVService, View view, InterfaceC1364105Vn<? super C536140L0y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c535990L0j;
        this.LLILLL = asyncAVService;
        this.LLILZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C536140L0y(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String localPath;
        String localPath2;
        C1C7U.LIZ("AILivePhotoShootViewHolder@8c86.clickListener$1$1$onLoad$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Integer numLJ = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.showProgressDialog();
            C1DFB c1dfb = C0PEM.LIZJ;
            C536150L0z c536150L0z = new C536150L0z(this.LLILLJJLI, this.LLILZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c536150L0z) == objLJFF) {
                C1C7U.LIZIZ("AILivePhotoShootViewHolder@8c86.clickListener$1$1$onLoad$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.dismissProgressDialog();
        MusicModel musicModel = this.LLILLJJLI.getShortVideoContext().creativeModel.aiLivePhotoModel.consumptionModel.getMusicModel();
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.creationId(this.LLILLJJLI.getShortVideoContext().getCreationId());
        builder.shootWay(this.LLILLJJLI.getShortVideoContext().shootWay);
        builder.enterFrom(this.LLILLJJLI.getShortVideoContext().enterFrom);
        builder.enterMethod(this.LLILLJJLI.getShortVideoContext().enterMethod);
        builder.aiLivePhotoParam(this.LLILLJJLI.getShortVideoContext().creativeModel.aiLivePhotoModel.consumptionModel);
        if (musicModel != null) {
            localPath = musicModel.getLocalPath();
        } else {
            localPath = null;
        }
        if (C570490MZb.LJ(localPath)) {
            if (musicModel == null || (localPath2 = musicModel.getLocalPath()) == null) {
                localPath2 = "";
            }
            builder.musicPath(localPath2);
            if (musicModel != null) {
                numLJ = C2286608xc.LJ(musicModel.getMusicStart());
            }
            builder.musicStart(numLJ);
            IRecordService iRecordServiceRecordService = this.LLILLL.uiService().recordService();
            C19EG c19eg = this.LLILLJJLI.activity;
            if (c19eg == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AILivePhotoShootViewHolder@8c86.clickListener$1$1$onLoad$1");
                return unit;
            }
            iRecordServiceRecordService.startRecord(c19eg, builder.build(), this.LLILLJJLI.getShortVideoContext().creativeModel.aiLivePhotoModel.consumptionModel.getMusicModel(), true);
        } else {
            this.LLILLL.uiService().recordService().startRecord(this.LLILZ.getContext(), builder.build());
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AILivePhotoShootViewHolder@8c86.clickListener$1$1$onLoad$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
