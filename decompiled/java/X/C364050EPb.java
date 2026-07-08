package X;

import com.ss.android.ugc.aweme.effect.EffectModel;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0EPb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C364050EPb extends C2217421BqW implements Function2<Integer, String, List<? extends EffectModel>> {
    public C364050EPb(C364040EPa c364040EPa) {
        super(2, c364040EPa, C364040EPa.class, "getAppliedEffects", "getAppliedEffects(ILjava/lang/String;)Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<? extends EffectModel> invoke(Integer num, String str) {
        return ((C364040EPa) this.receiver).H5(num.intValue(), str);
    }
}
