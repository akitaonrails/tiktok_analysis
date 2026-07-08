package X;

import com.ss.android.ugc.gamora.recorder.sticker.l0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sLY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1623380sLY extends C2217421BqW implements Function0<Unit> {
    public C1623380sLY(l0 l0Var) {
        super(0, l0Var, C1624010sMZ.class, "hideStickerView", "hideStickerView(Lcom/ss/android/ugc/aweme/sticker/presenter/IStickerModule;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC1623190sLF interfaceC1623190sLFU = ((InterfaceC1623390sLZ) this.receiver).U();
        if (interfaceC1623190sLFU != null) {
            interfaceC1623190sLFU.hide();
        }
        return Unit.LIZ;
    }
}
