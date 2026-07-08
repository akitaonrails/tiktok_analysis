package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;
import com.ss.ugc.android.davinciresource.DavinciResourceLibraryLoader;
import com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc;
import java.io.IOException;
import java.util.LinkedHashMap;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Dzr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357450Dzr implements InterfaceC354490Dv5 {
    public final CreativeInfo LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final CreativeModel LJFF;
    public final boolean LJI;
    public EnumC357480Dzu LJII = EnumC357480Dzu.NONE;
    public C357420Dzo LJIIIIZZ;
    public InterfaceC354490Dv5 LJIIIZ;
    public final C054G LJIIJ;
    public final float LJIIJJI;

    @Override // X.InterfaceC354490Dv5
    public final void cancel() {
        EnumC357480Dzu enumC357480Dzu = this.LJII;
        EnumC357480Dzu enumC357480Dzu2 = EnumC357480Dzu.CANCELED;
        if (enumC357480Dzu == enumC357480Dzu2) {
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" cancel. status=");
            sbLIZ.append(this.LJII);
            C201955140j.LIZLLL(c563650M8t, "TemplateMagicApplyTask", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C201955140j.LIZLLL(C563650M8t.LIZIZ, "TemplateMagicApplyTask", " cancel");
        if (this.LJIIIIZZ != null) {
            ((InterfaceC357410Dzn) C366380EYa.LJ.getValue()).cancelCompile();
        }
        this.LJII = enumC357480Dzu2;
        InterfaceC354490Dv5 interfaceC354490Dv5 = this.LJIIIZ;
        if (interfaceC354490Dv5 != null) {
            interfaceC354490Dv5.cancel();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIZ(X.C0FQS r15, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r16, X.InterfaceC1364105Vn<? super X.C358620E4e> r17) {
        /*
            r14 = this;
            r11 = r15
            com.bytedance.ies.nle.editor_jni.NLETemplateModel r1 = r11.LJIIJ
            r6 = 62
            r5 = 0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L10
            X.0E4e r0 = new X.0E4e
            r0.<init>(r3, r5, r4, r6)
            return r0
        L10:
            r10 = r14
            X.0Dzu r2 = r10.LJII
            X.0Dzu r0 = X.EnumC357480Dzu.PROCESSING
            if (r2 != r0) goto L26
            X.0mUb r2 = X.C1398350mUb.LIZIZ
            java.lang.String r1 = "TemplateMagicApplyTask"
            java.lang.String r0 = " start"
            X.C201955140j.LIZLLL(r2, r1, r0)
            X.0E4e r0 = new X.0E4e
            r0.<init>(r4, r5, r4, r6)
            return r0
        L26:
            long r8 = java.lang.System.currentTimeMillis()
            java.util.List<java.lang.String> r0 = r11.LJIIIZ
            java.lang.String r5 = "UGC_ASYNC_I2V"
            r2 = r16
            if (r0 == 0) goto L9d
            boolean r0 = r0.contains(r5)
            if (r0 != r3) goto L9d
            X.0Dzw r6 = new X.0Dzw
            r6.<init>(r10, r2)
        L3d:
            r6.onStart()
            X.099m r13 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r17)
            r13.<init>(r0)
            java.util.List<java.lang.String> r0 = r11.LJIIIZ
            if (r0 == 0) goto L9b
            java.util.Iterator r4 = r0.iterator()
        L51:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r2 = r4.next()
            java.lang.String r0 = "UGC_MAGIC_V2"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L69
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r5)
            if (r0 == 0) goto L51
        L69:
            X.0L1p r0 = X.C536310L1p.LIZ
            r0.getClass()
            boolean r0 = X.C536310L1p.LIZJ(r1)
            if (r0 == 0) goto L9b
            r7 = 1
        L75:
            boolean r12 = X.C377880Eri.LJIIIIZZ(r1, r3)
            X.0Dzo r0 = r10.LJIIIIZZ
            if (r0 == 0) goto L8d
            X.0Dzs r5 = new X.0Dzs
            r5.<init>(r6, r7, r8, r10, r11, r12, r13)
            X.01GW r0 = X.C366380EYa.LJ
            java.lang.Object r0 = r0.getValue()
            X.0Dzn r0 = (X.InterfaceC357410Dzn) r0
            r0.LIZ(r1, r5)
        L8d:
            java.lang.Object r1 = r13.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L9a
            X.C099Q.LIZJ(r17)
        L9a:
            return r1
        L9b:
            r7 = 0
            goto L75
        L9d:
            X.0Dzt r6 = new X.0Dzt
            r6.<init>(r2)
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357450Dzr.LJJIIZ(X.0FQS, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    public final void LJJIIJZLJL(C0FQS c0fqs, long j, boolean z, int i, String str) {
        int i2;
        String str2;
        ITemplateMobService iTemplateMobService = (ITemplateMobService) ServiceManager.get().getService(ITemplateMobService.class);
        if (iTemplateMobService != null) {
            String str3 = c0fqs.LJ;
            Integer num = c0fqs.LJII;
            int i3 = !z ? 1 : 0;
            if (z) {
                i2 = 0;
                str2 = null;
            } else {
                i2 = i;
                str2 = str;
            }
            iTemplateMobService.LJFF(str3, num, j, i3, i2, str2, c0fqs.LIZJ);
        }
        ((ITemplateMobService) ServiceManager.get().getService(ITemplateMobService.class)).LJ(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, "task_magic_v1", j, z, i, false, str, null, null, c0fqs.LIZJ, this.LIZ.getCreationId(), this.LJI, new LinkedHashMap());
    }

    public C357450Dzr(CreativeInfo creativeInfo, String str, Integer num, String str2, String str3, CreativeModel creativeModel, boolean z) {
        this.LIZ = creativeInfo;
        this.LIZIZ = str;
        this.LIZJ = num;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = creativeModel;
        this.LJI = z;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJIIJ = C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ()));
        this.LJIIJJI = 1.0f / C0L7R.LJJIJIIJIL;
        this.LJIIIIZZ = new C357420Dzo();
        DavinciResourceLibraryLoader.INSTANCE.loadLibrary();
        DAVUnZipFunc dAVUnZipFunc = new DAVUnZipFunc() { // from class: X.08SV
            @Override // com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc
            public final boolean unZip(String str4, String str5, boolean z2) throws C2225308nj {
                boolean zRenameTo = false;
                if (str4 != null && !a0.LJJJIL(str4) && str5 != null && !a0.LJJJIL(str5)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str5);
                    sbLIZ.append("_temp");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                    if (c0vsj.exists()) {
                        c0vsj.delete();
                    }
                    try {
                        C13SB.LJIJJLI(str4, strLIZIZ);
                        String absolutePath = c0vsj.getAbsolutePath();
                        if (new C0VSJ(str5).exists()) {
                            C08QA.LJIIZILJ(new C0VSJ(str5));
                        }
                        C0VSJ c0vsj2 = new C0VSJ(absolutePath);
                        C0VSJ c0vsj3 = new C0VSJ(str5);
                        if (c0vsj2.exists()) {
                            zRenameTo = c0vsj2.renameTo(c0vsj3);
                        }
                        if (z2) {
                            new C0VSJ(str4).delete();
                            return zRenameTo;
                        }
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        C201955140j.LIZIZ("TemplateMagicApplyTask", message);
                    }
                }
                return zRenameTo;
            }
        };
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (this.LJIIIIZZ != null) {
            C13W0 c13w0 = new C13W0(contextLIZ, creativeInfo);
            C356740Dyi c356740Dyi = new C356740Dyi();
            c356740Dyi.LIZ = c13w0;
            c356740Dyi.LIZIZ = c13w0;
            c356740Dyi.LIZJ = c13w0;
            c356740Dyi.LIZLLL = c13w0;
            c356740Dyi.LJ = c13w0;
            C357420Dzo.LIZIZ(contextLIZ, c356740Dyi.LIZ(), dAVUnZipFunc);
        }
    }
}
