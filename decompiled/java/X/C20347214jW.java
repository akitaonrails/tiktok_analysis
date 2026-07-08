package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.playentity.BoardsEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14jW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20347214jW extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ BoardsEntity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20347214jW(BoardsEntity boardsEntity) {
        super(1);
        this.LL = boardsEntity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.LL.LJJIJ();
        }
        return Unit.LIZ;
    }
}
