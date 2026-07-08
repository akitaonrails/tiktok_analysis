package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS221S0300000_12;

/* JADX INFO: renamed from: X.0TuO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C761740TuO extends AbstractC766100U3k<SoundEffect> {
    public static final C01GW<String> LIZJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(27));
    public SoundEffect LIZIZ;

    public static boolean LJIILLIIL(SoundEffect soundEffect) {
        return new C0VSJ(C0U3Z.LIZIZ(soundEffect)).exists();
    }

    @Override // X.AbstractC766100U3k
    public final /* bridge */ /* synthetic */ boolean LJIILJJIL(SoundEffect soundEffect) {
        return LJIILLIIL(soundEffect);
    }

    public final void LJIILL(SoundEffect soundEffect, Function1<? super Integer, Unit> function1) {
        List urls;
        ImageModel imageModel = soundEffect.resourceUrl;
        if (imageModel != null && (urls = imageModel.getUrls()) != null && !urls.isEmpty()) {
            C207232167i.LIZIZ(C0U3Z.LIZ(soundEffect, (String) ListProtector.get(urls, 0)), new AwS221S0300000_12(this, (C761740TuO) soundEffect, (SoundEffect) function1, (Function1<? super Integer, Unit>) 32));
        } else {
            function1.invoke(-3);
        }
    }
}
