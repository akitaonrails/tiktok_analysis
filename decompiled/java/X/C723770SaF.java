package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS64S0210000_11;

/* JADX INFO: renamed from: X.0SaF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723770SaF {
    public static final <T extends AbstractC738140SxQ> boolean LIZ(LifecycleOwner lifecycleOwner, C0RUV<T> c0ruv, Assembler assembler, AssemSupervisor assemSupervisor) {
        C2238881Ck2<?> c2238881Ck2LIZ;
        C13IQ<? extends T> c13iq = c0ruv.LL;
        if (c13iq == null || (c2238881Ck2LIZ = C2238831Cjx.LIZ(C09R7.LIZ(c13iq))) == null) {
            return false;
        }
        if (c2238881Ck2LIZ.LJ == EnumC725160ScU.SUCCESS) {
            Object obj = c2238881Ck2LIZ.LIZLLL;
            if (obj == null) {
                obj = null;
            }
            AbstractC724890Sc3 abstractC724890Sc3 = (AbstractC724890Sc3) obj;
            if (abstractC724890Sc3 == null) {
                return false;
            }
            if (abstractC724890Sc3.LLILZ.LIZ.get() >= 3) {
                abstractC724890Sc3.LIZJ(lifecycleOwner, assembler, assemSupervisor, new AwS377S0200000_11((C0RUV) c0ruv, assemSupervisor, (AssemSupervisor) 144));
                C723800SaI c723800SaI = assemSupervisor.LLILZ;
                if (c723800SaI != null) {
                    c723800SaI.LIZIZ++;
                }
                return true;
            }
            C723800SaI c723800SaI2 = assemSupervisor.LLILZ;
            if (c723800SaI2 != null) {
                c723800SaI2.LIZJ++;
            }
            return false;
        }
        C723800SaI c723800SaI3 = assemSupervisor.LLILZ;
        if (c723800SaI3 != null) {
            c723800SaI3.LIZJ++;
        }
        return false;
    }

    public static boolean LIZIZ(LifecycleOwner lifecycleOwner, C0RTC c0rtc, Assembler assembler, AssemSupervisor assemSupervisor) {
        C2238881Ck2<?> c2238881Ck2LIZ;
        C13IQ<? extends T> c13iq = c0rtc.LLILLL;
        if (c13iq == 0 || (c2238881Ck2LIZ = C2238831Cjx.LIZ(C09R7.LIZ(c13iq))) == null) {
            return false;
        }
        if (c2238881Ck2LIZ.LJ == EnumC725160ScU.SUCCESS) {
            Object obj = c2238881Ck2LIZ.LIZLLL;
            if (obj == null) {
                obj = null;
            }
            AbstractC724890Sc3 abstractC724890Sc3 = (AbstractC724890Sc3) obj;
            if (abstractC724890Sc3 == null) {
                return false;
            }
            if (abstractC724890Sc3.LLILZ.LIZ.get() >= 3) {
                abstractC724890Sc3.LIZJ(lifecycleOwner, assembler, assemSupervisor, new AwS64S0210000_11(c0rtc, (C0RTC<Object>) assemSupervisor, (AssemSupervisor) false, true));
                C723800SaI c723800SaI = assemSupervisor.LLILZ;
                if (c723800SaI != null) {
                    c723800SaI.LIZIZ++;
                }
                return true;
            }
            C723800SaI c723800SaI2 = assemSupervisor.LLILZ;
            if (c723800SaI2 == null) {
                return false;
            }
            c723800SaI2.LIZJ++;
            return false;
        }
        C723800SaI c723800SaI3 = assemSupervisor.LLILZ;
        if (c723800SaI3 == null) {
            return false;
        }
        c723800SaI3.LIZJ++;
        return false;
    }
}
