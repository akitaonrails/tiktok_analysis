package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FSr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C390470FSr extends C1696260uF6 implements Function1<StickerModel, StickerModel> {
    public C390470FSr(C390390FSj c390390FSj) {
        super(1, c390390FSj, C390390FSj.class, "addSticker", "addSticker(Lcom/ss/android/ugc/aweme/tools/sticker/core/StickerModel;Lcom/ss/ugc/android/editor/core/api/CommitLevel;)Lcom/ss/android/ugc/aweme/tools/sticker/core/StickerModel;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final StickerModel invoke(StickerModel stickerModel) {
        return ((C390390FSj) this.receiver).f3(stickerModel, EnumC356070Dxd.COMMIT);
    }
}
