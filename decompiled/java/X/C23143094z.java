package X;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.094z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23143094z {
    public static /* synthetic */ InterfaceC346201Wa LIZ(InterfaceC23142094y interfaceC23142094y, AbstractC2252651DEx abstractC2252651DEx, int i, EnumC2252401DDy enumC2252401DDy, int i2) {
        CoroutineContext coroutineContext = abstractC2252651DEx;
        if ((i2 & 1) != 0) {
            coroutineContext = C23271099x.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            enumC2252401DDy = EnumC2252401DDy.SUSPEND;
        }
        return interfaceC23142094y.fuse(coroutineContext, i, enumC2252401DDy);
    }
}
