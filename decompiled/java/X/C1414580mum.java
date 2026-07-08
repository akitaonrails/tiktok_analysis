package X;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mum, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414580mum {
    public static final C1414580mum LIZ = new C1414580mum();
    public static final AtomicReference<C1414590mun> LIZIZ = new AtomicReference<>(null);
    public static EnumC1412690mrj LIZJ;

    public static void LIZIZ(String str) {
        AtomicReference<C1414590mun> atomicReference = LIZIZ;
        C1414590mun c1414590mun = atomicReference.get();
        if (c1414590mun != null && Intrinsics.LJFF(c1414590mun.LIZIZ, str)) {
            atomicReference.set(C1414590mun.LIZ(c1414590mun, false, null, null, false, null, Long.valueOf(System.currentTimeMillis()), null, 3071));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9, kotlin.jvm.functions.Function0 r10, java.lang.String r11, java.lang.Integer r12) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1414580mum.LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, kotlin.jvm.functions.Function0, java.lang.String, java.lang.Integer):void");
    }

    public static Boolean LIZJ(C1414580mum c1414580mum, String str, boolean z, boolean z2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1414580mum.getClass();
        AtomicReference<C1414590mun> atomicReference = LIZIZ;
        C1414590mun c1414590mun = atomicReference.get();
        if (c1414590mun == null) {
            return null;
        }
        if (Intrinsics.LJFF(c1414590mun.LIZIZ, str)) {
            atomicReference.set(C1414590mun.LIZ(c1414590mun, z, null, Long.valueOf(jCurrentTimeMillis), z2, null, null, null, 3679));
            return Boolean.valueOf(!z);
        }
        return Boolean.FALSE;
    }
}
