package X;

import Y.ARunnableS22S1200000_18;
import com.ss.android.ugc.aweme.mix.mixdetail.MixVideosDialog;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0gWR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class C1168850gWR extends C2217421BqW implements InterfaceC1631620sYq<String, Object, EnumC614120O6w, Unit> {
    public C1168850gWR(Object obj) {
        super(3, obj, MixVideosDialog.class, "motaCacheSubscriber", "motaCacheSubscriber(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/mota/storage/motacache/StorageOperation;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, Object obj, EnumC614120O6w enumC614120O6w) {
        MixVideosDialog mixVideosDialog = (MixVideosDialog) this.receiver;
        mixVideosDialog.getClass();
        C2487409ou.LIZJ(new ARunnableS22S1200000_18(obj, str, mixVideosDialog, 2));
        return Unit.LIZ;
    }
}
