package X;

import kotlin.Unit;
import zoo.b;

/* JADX INFO: renamed from: X.0FUZ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0FUZ extends C1696260uF6 implements InterfaceC1631620sYq<b, Float, Float, Unit> {
    public C0FUZ(C0FUL c0ful) {
        super(3, c0ful, C0FUL.class, "onMoveBegin", "onMoveBegin(Lcom/ss/android/ugc/tools/utils/gesture/MoveGestureDetector;FF)Z", 8);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(b bVar, Float f, Float f2) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        ((C0FUM) this.receiver).LLLLLLLLL(bVar, fFloatValue, fFloatValue2);
        return Unit.LIZ;
    }
}
