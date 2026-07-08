package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk.SceneryPictureViewModel;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.ImageContent;
import com.bytedance.android.livesdk.model.SceneryContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xQL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1818550xQL extends C09AY implements Function1<C612620O1c, Unit> {
    public final /* synthetic */ SceneryPictureViewModel LL;
    public final /* synthetic */ Bitmap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1818550xQL(SceneryPictureViewModel sceneryPictureViewModel, Bitmap bitmap) {
        super(1);
        this.LL = sceneryPictureViewModel;
        this.LLILLJJLI = bitmap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C612620O1c c612620O1c) {
        ImageContent imageContent;
        BoardItem boardItem = this.LL.wQ2().LL;
        if (boardItem != null && boardItem.boardItemType == 6) {
            Bitmap bitmap = this.LLILLJJLI;
            SceneryContent sceneryContent = boardItem.sceneryContent;
            if (sceneryContent != null && (imageContent = sceneryContent.imageContent) != null) {
                imageContent.LIZ = bitmap;
            }
        }
        this.LL.setState(new C612640O1e(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
