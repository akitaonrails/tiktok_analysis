package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FSs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C390480FSs extends C1696260uF6 implements Function1<StickerModel, Unit> {
    public C390480FSs(C390390FSj c390390FSj) {
        super(1, c390390FSj, C390390FSj.class, "updateSticker", "updateSticker(Lcom/ss/android/ugc/aweme/tools/sticker/core/StickerModel;Lcom/ss/ugc/android/editor/core/api/CommitLevel;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(StickerModel stickerModel) {
        ((C390390FSj) this.receiver).k3(stickerModel, EnumC356070Dxd.COMMIT);
        return Unit.LIZ;
    }
}
