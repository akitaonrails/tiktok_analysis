package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;

/* JADX INFO: renamed from: X.12Y2, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12Y2 extends SimpleServiceLoadCallback {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        switch (this.$t) {
            case 0:
                onLoad$0(this, asyncAVService, j);
                break;
            case 1:
                onLoad$1(this, asyncAVService, j);
                break;
            case 2:
                onLoad$2(this, asyncAVService, j);
                break;
            case 3:
                onLoad$3(this, asyncAVService, j);
                break;
            case 4:
                onLoad$4(this, asyncAVService, j);
                break;
            case 5:
                onLoad$5(this, asyncAVService, j);
                break;
            case 6:
                onLoad$6(this, asyncAVService, j);
                break;
            default:
                super.onLoad(asyncAVService, j);
                break;
        }
    }

    public C12Y2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onLoad$0(C12Y2 c12y2, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) c12y2.l0, ((RecordConfig.Builder) c12y2.l1).build());
    }

    public static final void onLoad$1(C12Y2 c12y2, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord(((C19574811iE) c12y2.l1).LJIIJ, ((RecordConfig.Builder) c12y2.l0).build());
    }

    public static final void onLoad$2(C12Y2 c12y2, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord(((C19574811iE) c12y2.l1).LJIIJ, ((RecordConfig.Builder) c12y2.l0).build());
    }

    public static final void onLoad$3(C12Y2 c12y2, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startImageEffectTemplateAlbum(((C19574811iE) c12y2.l1).LJIIJ, ((RecordConfig.Builder) c12y2.l0).build());
    }

    public static final void onLoad$4(C12Y2 c12y2, AsyncAVService asyncAVService, long j) {
        IRecordService iRecordServiceRecordService = asyncAVService.uiService().recordService();
        Context context = ((C19574811iE) c12y2.l1).LJIIJ;
        RecordConfig recordConfigBuild = ((RecordConfig.Builder) c12y2.l0).build();
        C19574811iE c19574811iE = (C19574811iE) c12y2.l1;
        EnumC1429610nJ1 editEffectStyleForAlbum = c19574811iE.LJJIIZ.getData(c19574811iE.LJJIFFI).getEditEffectStyleForAlbum();
        C19574811iE c19574811iE2 = (C19574811iE) c12y2.l1;
        iRecordServiceRecordService.startAlbum(context, recordConfigBuild, editEffectStyleForAlbum, c19574811iE2.LJJIIZ.getData(c19574811iE2.LJJIFFI));
    }

    public static final void onLoad$5(C12Y2 c12y2, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord(((C19574811iE) c12y2.l1).LJIIJ, ((RecordConfig.Builder) c12y2.l0).build());
    }

    public static final void onLoad$6(C12Y2 c12y2, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord(((C19574811iE) c12y2.l1).LJIIJ, ((RecordConfig.Builder) c12y2.l0).build());
    }
}
