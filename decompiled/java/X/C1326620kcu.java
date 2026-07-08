package X;

import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.ecommerce.image.EcomImageDiskCacheData;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0kcu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326620kcu {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ(java.lang.String r4) {
        /*
            r2 = 0
            r3 = 1
            if (r4 == 0) goto L66
            int r0 = r4.length()
            if (r0 == 0) goto L66
            java.lang.String r0 = "."
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 6
            java.util.List r2 = kotlin.text.a0.LJJLIIIJILLIZJL(r4, r1, r2, r0)
            int r1 = r2.size()
            r0 = 2
            if (r1 >= r0) goto L1d
            return r4
        L1d:
            java.lang.Object r4 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L32
            int r0 = r4.hashCode()
            java.lang.String r3 = "b7349"
            java.lang.String r2 = "b4891"
            java.lang.String r1 = "b0865"
            switch(r0) {
                case 91986784: goto L33;
                case 91990569: goto L3c;
                case 92016550: goto L44;
                case 92073303: goto L4d;
                case 92109822: goto L56;
                case 92194243: goto L5e;
                default: goto L32;
            }
        L32:
            return r4
        L33:
            java.lang.String r0 = "b0482"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L43
            return r4
        L3c:
            boolean r0 = r4.equals(r1)
            if (r0 != 0) goto L43
            return r4
        L43:
            return r1
        L44:
            java.lang.String r0 = "b1478"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L5d
            return r4
        L4d:
            java.lang.String r0 = "b3190"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L65
            return r4
        L56:
            boolean r0 = r4.equals(r2)
            if (r0 != 0) goto L5d
            return r4
        L5d:
            return r2
        L5e:
            boolean r0 = r4.equals(r3)
            if (r0 != 0) goto L65
            return r4
        L65:
            return r3
        L66:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1326620kcu.LIZ(java.lang.String):java.lang.String");
    }

    public static final String LJ(String str, String str2) {
        if (str2 != null && str2.length() > 0) {
            return str2;
        }
        if (str == null) {
            return null;
        }
        C1199304md.LIZ.getClass();
        if (!C1199304md.LIZJ.getValue().booleanValue()) {
            return null;
        }
        EcomImageDiskCacheData ecomImageDiskCacheData = C1199304md.LIZIZ;
        if (!ecomImageDiskCacheData.enableFirstScreenOperationCache || !ecomImageDiskCacheData.firstScreenOperationApiList.contains(str)) {
            return null;
        }
        return "ecom_operation_cache";
    }

    public static final void LIZIZ(List<String> list, String str, String str2, String str3, EnumC1335820krk enumC1335820krk, boolean z, String str4, String str5) {
        C1507890pLH c1507890pLHLIZ;
        int preloadTaskPriority;
        String strLJ = LJ(str, str4);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        String strLIZ = LIZ(str3);
        for (String str6 : list) {
            final C1326610kct c1326610kct = new C1326610kct(str6, z, str, strLJ);
            EcomResourceBystander ecomResourceBystander = EcomResourceBystander.LIZ;
            if (enumC1335820krk != null) {
                preloadTaskPriority = enumC1335820krk.getPreloadTaskPriority();
            } else {
                preloadTaskPriority = 2;
            }
            InterfaceC1508110pLd interfaceC1508110pLd = new InterfaceC1508110pLd() { // from class: X.0kd2
                @Override // X.InterfaceC1508110pLd
                public final InterfaceC1508150pLh LIZ(final C1508120pLe c1508120pLe) {
                    Executor executor;
                    final InterfaceC1320200kSY<Object> interfaceC1320200kSYInvoke = c1326610kct.invoke();
                    InterfaceC589510NAf<Object> interfaceC589510NAf = new InterfaceC589510NAf<Object>() { // from class: X.0kd7
                        @Override // X.InterfaceC589510NAf
                        public final void LIZJ(AbstractC1321260kUG abstractC1321260kUG) {
                        }

                        @Override // X.InterfaceC589510NAf
                        public final void LIZ(InterfaceC1320200kSY<Object> interfaceC1320200kSY) {
                            c1508120pLe.onSuccess();
                        }

                        @Override // X.InterfaceC589510NAf
                        public final void LIZIZ(InterfaceC1320200kSY<Object> interfaceC1320200kSY) {
                            String message;
                            Throwable thLIZLLL;
                            C03W6 c03w6 = c1508120pLe;
                            if (interfaceC1320200kSY == null || (thLIZLLL = ((AbstractC1321260kUG) interfaceC1320200kSY).LIZLLL()) == null || (message = thLIZLLL.getMessage()) == null) {
                                message = " failure";
                            }
                            c03w6.LIZ(message);
                        }

                        @Override // X.InterfaceC589510NAf
                        public final void LIZLLL(AbstractC1321260kUG abstractC1321260kUG) {
                            c1508120pLe.LIZ("cancel");
                        }
                    };
                    C1507890pLH c1507890pLHLIZ2 = C1507890pLH.LIZJ.LIZ();
                    if (c1507890pLHLIZ2 == null || (executor = c1507890pLHLIZ2.LIZIZ.LIZIZ) == null) {
                        executor = C1326680kd0.LIZ;
                    }
                    interfaceC1320200kSYInvoke.LIZJ(interfaceC589510NAf, executor);
                    return new InterfaceC1508150pLh() { // from class: X.0kd4
                        @Override // X.InterfaceC1508150pLh
                        public final void LIZ() {
                            interfaceC1320200kSYInvoke.close();
                        }
                    };
                }
            };
            ecomResourceBystander.getClass();
            C1507990pLR c1507990pLRLJIIL = EcomResourceBystander.LJIIL(str2, strLIZ, preloadTaskPriority, str, interfaceC1508110pLd, str5, str6);
            arrayList.add(c1507990pLRLJIIL);
            String str7 = c1507990pLRLJIIL.LJIILIIL;
            if (z) {
                C1326660kcy.LIZ.LIZIZ(str, str7);
            }
        }
        if ((!arrayList.isEmpty()) && (c1507890pLHLIZ = C1507890pLH.LIZJ.LIZ()) != null) {
            c1507890pLHLIZ.LIZ(arrayList);
        }
        C1505950pI9.LIZJ(System.currentTimeMillis() - jCurrentTimeMillis, "preloadImageToDiskTime", str);
    }

    public static final void LIZJ(List<String> list, String str, String str2, Bitmap.Config config, EnumC1335820krk enumC1335820krk, String str3, boolean z, String str4, String str5) {
        C1507890pLH c1507890pLHLIZ;
        int preloadTaskPriority;
        String strLJ = LJ(str3, str4);
        ArrayList arrayList = new ArrayList();
        String strLIZ = LIZ(str2);
        for (String str6 : list) {
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str6));
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.setBitmapConfig(config);
            imageDecodeOptionsBuilder.getClass();
            c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
            c1325700kbQLIZLLL.LJ = C1324670kZl.LIZJ;
            if (enumC1335820krk != null) {
                c1325700kbQLIZLLL.LJIIL = enumC1335820krk.getFrescoPriority();
            } else {
                C1322400kW6.LIZ.getClass();
                if (C1322400kW6.LIZIZ.priorityOptimizeSwitch > 0) {
                    c1325700kbQLIZLLL.LJIIL = EnumC1331380kka.MEDIUM;
                }
            }
            C1326590kcr.LIZIZ(c1325700kbQLIZLLL, strLJ);
            C1325710kbR c1325710kbRLIZ = c1325700kbQLIZLLL.LIZ();
            C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
            if (c1325540kbALIZ.LIZLLL.get(c1325540kbALIZ.LJIIJJI.LIZIZ(c1325710kbRLIZ, null)) == null) {
                final C1326630kcv c1326630kcv = new C1326630kcv(c1325710kbRLIZ, str3, z);
                EcomResourceBystander ecomResourceBystander = EcomResourceBystander.LIZ;
                if (enumC1335820krk != null) {
                    preloadTaskPriority = enumC1335820krk.getPreloadTaskPriority();
                } else {
                    preloadTaskPriority = 2;
                }
                InterfaceC1508110pLd interfaceC1508110pLd = new InterfaceC1508110pLd() { // from class: X.0kd1
                    @Override // X.InterfaceC1508110pLd
                    public final InterfaceC1508150pLh LIZ(final C1508120pLe c1508120pLe) {
                        Executor executor;
                        final InterfaceC1320200kSY<Object> interfaceC1320200kSYInvoke = c1326630kcv.invoke();
                        InterfaceC589510NAf<Object> interfaceC589510NAf = new InterfaceC589510NAf<Object>() { // from class: X.0kd8
                            @Override // X.InterfaceC589510NAf
                            public final void LIZJ(AbstractC1321260kUG abstractC1321260kUG) {
                            }

                            @Override // X.InterfaceC589510NAf
                            public final void LIZ(InterfaceC1320200kSY<Object> interfaceC1320200kSY) {
                                c1508120pLe.onSuccess();
                            }

                            @Override // X.InterfaceC589510NAf
                            public final void LIZIZ(InterfaceC1320200kSY<Object> interfaceC1320200kSY) {
                                String message;
                                Throwable thLIZLLL;
                                C03W6 c03w6 = c1508120pLe;
                                if (interfaceC1320200kSY == null || (thLIZLLL = ((AbstractC1321260kUG) interfaceC1320200kSY).LIZLLL()) == null || (message = thLIZLLL.getMessage()) == null) {
                                    message = " failure";
                                }
                                c03w6.LIZ(message);
                            }

                            @Override // X.InterfaceC589510NAf
                            public final void LIZLLL(AbstractC1321260kUG abstractC1321260kUG) {
                                c1508120pLe.LIZ("cancel");
                            }
                        };
                        C1507890pLH c1507890pLHLIZ2 = C1507890pLH.LIZJ.LIZ();
                        if (c1507890pLHLIZ2 == null || (executor = c1507890pLHLIZ2.LIZIZ.LIZIZ) == null) {
                            executor = C1326680kd0.LIZ;
                        }
                        interfaceC1320200kSYInvoke.LIZJ(interfaceC589510NAf, executor);
                        return new InterfaceC1508150pLh() { // from class: X.0kd5
                            @Override // X.InterfaceC1508150pLh
                            public final void LIZ() {
                                interfaceC1320200kSYInvoke.close();
                            }
                        };
                    }
                };
                ecomResourceBystander.getClass();
                C1507990pLR c1507990pLRLJIIL = EcomResourceBystander.LJIIL(str, strLIZ, preloadTaskPriority, str3, interfaceC1508110pLd, str5, str6);
                arrayList.add(c1507990pLRLJIIL);
                String str7 = c1507990pLRLJIIL.LJIILIIL;
                if (z && str3 != null) {
                    C1326660kcy.LIZ.LIZIZ(str3, str7);
                }
            }
        }
        if ((!arrayList.isEmpty()) && (c1507890pLHLIZ = C1507890pLH.LIZJ.LIZ()) != null) {
            c1507890pLHLIZ.LIZ(arrayList);
        }
    }
}
