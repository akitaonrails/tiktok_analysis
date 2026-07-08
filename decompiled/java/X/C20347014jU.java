package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.playentity.BoardsEntity;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14jU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20347014jU extends C09AY implements Function1<AbstractC758530TpD, Unit> {
    public final /* synthetic */ BoardsEntity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20347014jU(BoardsEntity boardsEntity) {
        super(1);
        this.LL = boardsEntity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC758530TpD abstractC758530TpD) {
        String str;
        AbstractC758530TpD abstractC758530TpD2 = abstractC758530TpD;
        Map<String, String> map = abstractC758530TpD2.LIZ;
        Long lValueOf = null;
        if (map != null && map.get("state_id") != null) {
            Map<String, String> map2 = abstractC758530TpD2.LIZ;
            if (map2 != null) {
                str = map2.get("state_id");
            } else {
                str = null;
            }
            C20361214lm c20361214lm = this.LL.LLJJJJLIIL;
            if (c20361214lm != null) {
                lValueOf = Long.valueOf(c20361214lm.LIZIZ);
            }
            if (Intrinsics.LJFF(str, String.valueOf(lValueOf))) {
                BoardsEntity boardsEntity = this.LL;
                C20361214lm c20361214lm2 = boardsEntity.LLJJJJLIIL;
                InterfaceC20354714kj interfaceC20354714kj = boardsEntity.LLJJL;
                if (c20361214lm2 != null && interfaceC20354714kj != null) {
                    if (abstractC758530TpD2 instanceof C758540TpE) {
                        PlayEntityUtilKt.LJII(boardsEntity, 2, c20361214lm2, interfaceC20354714kj, true);
                    } else if (abstractC758530TpD2 instanceof C758520TpC) {
                        PlayEntityUtilKt.LJ(boardsEntity, 2, c20361214lm2, interfaceC20354714kj);
                    } else if (abstractC758530TpD2 instanceof C758550TpF) {
                        PlayEntityUtilKt.LIZJ(boardsEntity, "", c20361214lm2, interfaceC20354714kj, true);
                    } else {
                        throw new C1954807lC();
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
