package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.PreRenderCard;
import dalvik.system.PathClassLoader;
import java.io.BufferedReader;
import java.io.IOException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS76S0100100_30;

/* JADX INFO: renamed from: X.145g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202082145g implements InterfaceC342110Db7 {
    public final C0PB8 LL;
    public final boolean LLILLJJLI;
    public final int LLILLL;

    /* JADX WARN: Type inference failed for: r11v0, types: [X.145f] */
    @Override // X.InterfaceC342110Db7
    public final void LIZ(PreRenderCard preRenderCard) {
        boolean z;
        int i;
        if (!this.LLILLJJLI) {
            return;
        }
        boolean z2 = this.LL.LIZIZ.get();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0PB8 c0pb8 = this.LL;
        boolean z3 = true;
        int i2 = 0;
        if (((Boolean) C272660AmO.LIZ.getValue()).booleanValue() && preRenderCard.LIZ != 0) {
            z = false;
        } else {
            z = true;
        }
        C202085145j c202085145jLIZIZ = null;
        if (z && c0pb8 != null && c0pb8.LIZIZ.compareAndSet(false, true)) {
            try {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (!C202079145d.LIZIZ()) {
                    C844470XAv.LIZ.getClass();
                    C202079145d.LIZJ(C844470XAv.LIZ());
                }
                final String str = c0pb8.LIZ;
                final ClassLoader classLoader = C202079145d.class.getClassLoader();
                final AwS76S0100100_30 awS76S0100100_30 = new AwS76S0100100_30(jCurrentTimeMillis2, this, 0);
                c202085145jLIZIZ = new Object(str, classLoader, awS76S0100100_30) { // from class: X.145f
                    public final String LIZ;
                    public final Function0<Boolean> LIZIZ;
                    public final ClassLoader LIZJ;

                    static {
                        try {
                            Class.forName("java.lang.BootClassLoader");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }

                    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:38:0x0083
                        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
                        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                        */
                    public final X.C202085145j LIZIZ() {
                        /*
                            Method dump skipped, instruction units count: 237
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C202081145f.LIZIZ():X.145j");
                    }

                    public final Pair<Integer, Integer> LIZ(BufferedReader bufferedReader, ClassLoader classLoader2) throws IOException {
                        String line = bufferedReader.readLine();
                        int i3 = 0;
                        int i4 = 0;
                        while (line != null && this.LIZIZ.invoke().booleanValue()) {
                            try {
                                Class.forName(line, false, classLoader2).getClassLoader();
                                i3++;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                if (C202089145n.LIZ) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("LoadClasses: class not found ");
                                    sbLIZ.append(line);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                }
                                i4++;
                            }
                            line = bufferedReader.readLine();
                        }
                        return new Pair<>(Integer.valueOf(i3), Integer.valueOf(i4));
                    }

                    {
                        this.LIZ = str;
                        this.LIZIZ = awS76S0100100_30;
                        this.LIZJ = classLoader instanceof PathClassLoader ? classLoader : null;
                    }
                }.LIZIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Throwable th = new Throwable(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ClassCardPreloader: ");
                sbLIZ.append(c0pb8.LIZ);
                C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (((Boolean) C07QO.LIZ.getValue()).booleanValue()) {
            long jCurrentTimeMillis4 = System.currentTimeMillis();
            String str2 = this.LL.LIZ;
            try {
                C844470XAv.LIZ.getClass();
                C844470XAv.LIZ().getAssets().open(str2).close();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                z3 = false;
            }
            long jCurrentTimeMillis5 = System.currentTimeMillis() - jCurrentTimeMillis4;
            C0LAB c0lab = new C0LAB();
            c0lab.LJFF("preloaded", z2);
            c0lab.LJFF("is_file_exist", z3);
            c0lab.LIZIZ(jCurrentTimeMillis5, "check_file_exist_time");
            c0lab.LJ("class_file_name", this.LL.LIZ);
            c0lab.LIZIZ(jCurrentTimeMillis3, "preload_time");
            if (c202085145jLIZIZ != null) {
                i = c202085145jLIZIZ.LIZ;
            } else {
                i = 0;
            }
            c0lab.LIZ(i, "loaded_count");
            if (c202085145jLIZIZ != null) {
                i2 = c202085145jLIZIZ.LIZIZ;
            }
            c0lab.LIZ(i2, "notFoundCount");
            c0lab.LIZ(preRenderCard.LIZ, "result_type");
            C20684815ws.LJIILLIIL("search_card_class_preload_monitor", c0lab.LIZ);
        }
    }

    public C202082145g(C0PB8 c0pb8, boolean z, int i, int i2) {
        z = (i2 & 2) != 0 ? true : z;
        i = (i2 & 4) != 0 ? ((Number) C272670AmP.LIZ.getValue()).intValue() : i;
        this.LL = c0pb8;
        this.LLILLJJLI = z;
        this.LLILLL = i;
    }
}
