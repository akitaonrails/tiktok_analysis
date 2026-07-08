package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.slideslip.fullwidthhorizontal.o;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sQS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1626420sQS extends C2217421BqW implements Function1<Integer, Effect> {
    public C1626420sQS(Object obj) {
        super(1, obj, o.class, "getEffectByPosition", "getEffectByPosition(I)Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Effect invoke(Integer num) {
        return ((o) this.receiver).J8(num.intValue());
    }
}
