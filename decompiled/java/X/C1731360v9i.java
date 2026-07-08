package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.tts.oecverify.BdTuring;
import java.io.File;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0v9i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1731360v9i {
    public static final C1731360v9i LIZ = new C1731360v9i();

    public static C0VSJ LJ() {
        C844470XAv.LIZ.getClass();
        C0VSJ c0vsj = new C0VSJ(C786410Ut5.w2(C844470XAv.LIZ()), "ecommerce");
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        return c0vsj;
    }

    public static String LIZ(String str) {
        String absolutePath = LJ().getAbsolutePath();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("billboard_v2_success_use_effect_template_image_");
        C1730290v7z.LIZ.getClass();
        sbLIZ.append(C1730290v7z.LJIIJ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C0VSJ c0vsj = new C0VSJ(absolutePath, strLIZIZ);
        if (c0vsj.exists()) {
            c0vsj.delete();
        }
        if (C2112608Pk.LIZLLL(str, absolutePath, strLIZIZ)) {
            return c0vsj.getAbsolutePath();
        }
        return null;
    }

    public static Object LIZIZ(String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C1729570v6p.LIZ("start", "download_image", null, null, null, 28);
        C1331660kl2.LJIIIZ(str).LJIILJJIL(new InterfaceC605070NoH() { // from class: X.0ux0
            @Override // X.InterfaceC605070NoH
            public final void onCanceled() {
                C1729570v6p.LIZ("finish", "download_image", Boolean.FALSE, "cancel", null, 16);
            }

            @Override // X.InterfaceC605070NoH
            public final void LIZ(File file) {
                if (file != null) {
                    C1729570v6p.LIZ("finish", "download_image", Boolean.TRUE, null, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), 8);
                    InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                    String absolutePath = file.getAbsolutePath();
                    C189200o6.m2constructorimpl(absolutePath);
                    interfaceC1364105Vn2.resumeWith(absolutePath);
                    return;
                }
                C1729570v6p.LIZ("finish", "download_image", Boolean.FALSE, "file is null", null, 16);
                InterfaceC1364105Vn<String> interfaceC1364105Vn3 = c23260099m;
                C189200o6.m2constructorimpl("");
                interfaceC1364105Vn3.resumeWith("");
            }

            @Override // X.InterfaceC605070NoH
            public final void onFailed(Throwable th) {
                String message;
                Boolean bool = Boolean.FALSE;
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                C1729570v6p.LIZ("finish", "download_image", bool, message, null, 16);
                InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                C189200o6.m2constructorimpl("");
                interfaceC1364105Vn2.resumeWith("");
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public static String LJII(Bitmap bitmap, String str) throws Throwable {
        C0VSJ c0vsj = new C0VSJ(LJ().getAbsolutePath(), str);
        if (c0vsj.exists()) {
            c0vsj.delete();
        }
        C1319770kRr.LJ(100, Bitmap.CompressFormat.PNG, bitmap, c0vsj);
        C1319770kRr.LIZLLL(bitmap);
        return c0vsj.getAbsolutePath();
    }

    public static Object LJFF(Context context, TemplateItem templateItem, AbstractC23140094w abstractC23140094w) {
        InterfaceC1731410v9n c1731260v9Y;
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(abstractC23140094w));
        if (context == null) {
            C189200o6.m2constructorimpl(null);
            c23260099m.resumeWith(null);
        } else {
            C430370GuB c430370GuB = new C430370GuB(context);
            AwS585S0100000_6 awS585S0100000_6 = new AwS585S0100000_6(c23260099m, 313);
            C428440Gr4 c428440Gr4 = c430370GuB.LIZIZ;
            if (c428440Gr4 != null) {
                switch (templateItem.getType()) {
                    case 1:
                        c1731260v9Y = new C1731250v9X(c428440Gr4);
                        break;
                    case 2:
                        c1731260v9Y = new C1731200v9S(c428440Gr4);
                        break;
                    case 3:
                        c1731260v9Y = new C1731280v9a(c428440Gr4);
                        break;
                    case 4:
                        c1731260v9Y = new C1730950v93(c428440Gr4);
                        break;
                    case 5:
                        c1731260v9Y = new C1731420v9o(c428440Gr4);
                        break;
                    case 6:
                        c1731260v9Y = new C1731240v9W(c428440Gr4);
                        break;
                    case 7:
                        c1731260v9Y = new C1731210v9T(c428440Gr4);
                        break;
                    case 8:
                        c1731260v9Y = new C1731270v9Z(c428440Gr4);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        c1731260v9Y = new C1731260v9Y(c428440Gr4);
                        break;
                    default:
                        c1731260v9Y = null;
                        break;
                }
                c430370GuB.LIZ = c1731260v9Y;
                if (c1731260v9Y == null) {
                    awS585S0100000_6.invoke(null);
                } else {
                    c1731260v9Y.LIZIZ(new AwS407S0200000_6(awS585S0100000_6, c430370GuB, 67));
                    InterfaceC1731410v9n interfaceC1731410v9n = c430370GuB.LIZ;
                    if (interfaceC1731410v9n != null) {
                        interfaceC1731410v9n.LIZ(templateItem);
                    }
                }
            }
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        r2.LL = r12;
        r2.LLILLJJLI = r4;
        r2.LLILLL = r7;
        r2.LLILZ = r0;
        r2.LLIZ = 1;
        r1 = LJFF(r12, r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (r1 != r3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007d -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(android.content.Context r12, java.util.List<? extends com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem> r13, X.InterfaceC1364105Vn<? super android.graphics.Bitmap> r14) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1731360v9i.LIZJ(android.content.Context, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(android.content.Context r6, java.util.List<? extends com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem> r7, X.InterfaceC1364105Vn<? super java.lang.String> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1731400v9m
            if (r0 == 0) goto L34
            r4 = r8
            X.0v9m r4 = (X.C1731400v9m) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L34
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L28
            if (r1 != r0) goto L58
            X.C155000ia.LIZIZ(r3)
        L22:
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            if (r3 != 0) goto L3a
            r0 = 0
            return r0
        L28:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            java.lang.Object r3 = r5.LIZJ(r6, r7, r4)
            if (r3 != r2) goto L22
            return r2
        L34:
            X.0v9m r4 = new X.0v9m
            r4.<init>(r5, r8)
            goto L12
        L3a:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "billboard_v2_success_use_effect_template_image_"
            r1.append(r0)
            X.0v7z r0 = X.C1730290v7z.LIZ
            r0.getClass()
            java.lang.String r0 = X.C1730290v7z.LJIIJ()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = LJII(r3, r0)
            return r0
        L58:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1731360v9i.LIZLLL(android.content.Context, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(android.content.Context r6, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r7, X.InterfaceC1364105Vn<? super java.lang.String> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1731380v9k
            if (r0 == 0) goto L39
            r4 = r8
            X.0v9k r4 = (X.C1731380v9k) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L2b
            if (r1 != r0) goto L5b
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r7 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            java.lang.String r2 = ""
            if (r3 != 0) goto L3f
            return r2
        L2b:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r7
            r4.LLILZ = r0
            java.lang.Object r3 = LJFF(r6, r7, r4)
            if (r3 != r2) goto L24
            return r2
        L39:
            X.0v9k r4 = new X.0v9k
            r4.<init>(r5, r8)
            goto L12
        L3f:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "billboard_v2_template_preview"
            r1.append(r0)
            java.lang.String r0 = r7.getTemplateId()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = LJII(r3, r0)
            if (r0 == 0) goto L5a
            return r0
        L5a:
            return r2
        L5b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1731360v9i.LJI(android.content.Context, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(android.view.View r9, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r10, X.InterfaceC1364105Vn<? super java.lang.String> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1731360v9i.LJIIIIZZ(android.view.View, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem, X.05Vn):java.lang.Object");
    }
}
