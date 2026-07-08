package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Skn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C730310Skn extends C2217421BqW implements Function1<Boolean, Unit> {
    public C730310Skn(Object obj) {
        super(1, obj, C730300Skm.class, "interactiveStickerDataUpdate", "interactiveStickerDataUpdate(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        EnumC730330Skp enumC730330Skp;
        boolean zBooleanValue = bool.booleanValue();
        C730300Skm c730300Skm = (C730300Skm) this.receiver;
        c730300Skm.getClass();
        if (zBooleanValue) {
            enumC730330Skp = EnumC730330Skp.HAS_DATA;
        } else {
            enumC730330Skp = EnumC730330Skp.NO_DATA;
        }
        c730300Skm.LJIIIZ = enumC730330Skp;
        c730300Skm.LIZJ();
        if (c730300Skm.LJIIIZ == EnumC730330Skp.HAS_DATA && c730300Skm.LJIIIIZZ == EnumC730330Skp.NO_DATA) {
            ((InterfaceC730350Skr) c730300Skm.LJFF.getValue()).LIZ(4L);
        }
        c730300Skm.LIZ();
        return Unit.LIZ;
    }
}
