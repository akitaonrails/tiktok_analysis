package X;

import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Abh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C2182751Abh extends C2217421BqW implements Function1<Long, Unit> {
    public C2182751Abh(Object obj) {
        super(1, obj, C2182701Abc.class, "handleStopFlyMicGiftEvent", "handleStopFlyMicGiftEvent(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        long jLongValue = l.longValue();
        C2182701Abc c2182701Abc = (C2182701Abc) this.receiver;
        if (c2182701Abc.LIZIZ.state().compareTo(EnumC918810a19.StateJoined) >= 0) {
            C930480aJy c930480aJy = C930480aJy.LIZ;
            Long lValueOf = Long.valueOf(jLongValue);
            c930480aJy.getClass();
            if (Intrinsics.LJFF(C930480aJy.LJJIJL(lValueOf), c2182701Abc.LIZIZ.LJ())) {
                AnimatedDrawable2 animatedDrawable2 = c2182701Abc.LJIIIIZZ;
                if (animatedDrawable2 != null) {
                    animatedDrawable2.stop();
                }
                AnimatedDrawable2 animatedDrawable22 = c2182701Abc.LJIIIZ;
                if (animatedDrawable22 != null) {
                    animatedDrawable22.stop();
                }
            }
        }
        return Unit.LIZ;
    }
}
