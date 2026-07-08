package X;

import android.graphics.PointF;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11mp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19603311mp extends C09AY implements Function0<C19603411mq> {
    public C19603311mp() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11mq] */
    @Override // kotlin.jvm.functions.Function0
    public final C19603411mq invoke() {
        return new InterfaceC19578611iq() { // from class: X.11mq
            @Override // X.InterfaceC19578611iq
            public final boolean onClick(InteractStickerStruct interactStickerStruct) {
                return false;
            }

            @Override // X.InterfaceC19578611iq
            public final boolean onClick(InteractStickerStruct interactStickerStruct, PointF pointF) {
                return false;
            }
        };
    }
}
