package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0sVK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1629440sVK extends C2217421BqW implements Function2<InterfaceC1629560sVW, String, Unit> {
    public C1629440sVK(C1629430sVJ c1629430sVJ) {
        super(2, c1629430sVJ, InterfaceC1629540sVU.class, "onSuccess", "onSuccess(Lcom/ss/android/ugc/aweme/sticker/IStickerMusic;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1629560sVW interfaceC1629560sVW, String str) {
        ((InterfaceC1629540sVU) this.receiver).LIZ(interfaceC1629560sVW, str);
        return Unit.LIZ;
    }
}
