package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tiktok.eventtracking.group.PropBasicParamGroup;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07ga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class C1926207ga extends C2217421BqW implements Function1<Effect, PropBasicParamGroup> {
    public C1926207ga(C1441220nbk c1441220nbk) {
        super(1, c1441220nbk, C1441220nbk.class, "create", "create(Lcom/ss/android/ugc/effectmanager/effect/model/Effect;)Lcom/ss/android/ugc/tiktok/eventtracking/group/PropBasicParamGroup;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final PropBasicParamGroup invoke(Effect effect) {
        this.receiver.getClass();
        return C1441220nbk.LIZ(effect);
    }
}
