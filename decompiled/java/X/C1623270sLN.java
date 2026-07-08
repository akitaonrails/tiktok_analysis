package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0sLN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1623270sLN extends C2217421BqW implements Function2<Effect, Boolean, C1624230sMv> {
    public C1623270sLN(C1624610sNX c1624610sNX) {
        super(2, c1624610sNX, C1624610sNX.class, "isUploadPicMultiSticker", "isUploadPicMultiSticker(Lcom/ss/android/ugc/effectmanager/effect/model/Effect;Z)Lcom/ss/android/ugc/aweme/sticker/types/ar/uploadpicsticker/EffectSdkInfo;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C1624230sMv invoke(Effect effect, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        this.receiver.getClass();
        return C1624610sNX.LIZ(effect, zBooleanValue);
    }
}
