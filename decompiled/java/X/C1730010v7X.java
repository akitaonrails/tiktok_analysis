package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v7X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1730010v7X {
    public final C1728230v4f LIZ = new C1728230v4f();
    public final InterfaceC1728700v5Q LIZIZ;
    public final C1728720v5S LIZJ;

    public C1730010v7X() {
        InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
        this.LIZIZ = interfaceC20673515v3K4 != null ? interfaceC20673515v3K4.LLI() : null;
        this.LIZJ = new C1728720v5S();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.InterfaceC1729810v7D r7, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdkapi.depend.model.LiveEffect> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1730090v7f
            if (r0 == 0) goto L23
            r5 = r8
            X.0v7f r5 = (X.C1730090v7f) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            X.0v7D r7 = r5.LL
            goto L53
        L23:
            X.0v7f r5 = new X.0v7f
            r5.<init>(r6, r8)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r4)
            if (r7 == 0) goto L41
            X.0v5t r0 = r7.Um1()
            if (r0 == 0) goto L41
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = r0.LLILZLL
        L3e:
            if (r0 != 0) goto L6b
            goto L43
        L41:
            r0 = r2
            goto L3e
        L43:
            X.0v7z r0 = X.C1730290v7z.LIZ     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L66
            r5.LL = r7     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L66
            r5.LLILZ = r1     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L66
            r0.getClass()     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L66
            java.lang.Object r4 = X.C1730290v7z.LIZLLL(r1, r5)     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L66
            if (r4 != r3) goto L56
            return r3
        L53:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L66
        L56:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r4 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r4     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L66
            r2 = r4
            goto L5e
        L5a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5e:
            if (r2 == 0) goto L65
            if (r7 == 0) goto L65
            r7.wh1(r2, r1)
        L65:
            return r2
        L66:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1730010v7X.LJIIIIZZ(X.0v7D, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData r14, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r15, X.InterfaceC1364105Vn<? super X.C1730110v7h> r16) throws java.lang.Throwable {
        /*
            r13 = this;
            r6 = r15
            r3 = r16
            boolean r0 = r3 instanceof X.C1730070v7d
            if (r0 == 0) goto L56
            r4 = r3
            X.0v7d r4 = (X.C1730070v7d) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r4.LLILZ = r2
        L15:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r5 = 0
            r2 = 1
            if (r0 == 0) goto L41
            if (r0 != r2) goto L85
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r6 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L28:
            X.0X52 r1 = (X.C0X52) r1
            if (r1 == 0) goto L36
            T r0 = r1.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            if (r0 == 0) goto L36
            T r5 = r0.data
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.SaveTemplateResponse r5 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.SaveTemplateResponse) r5
        L36:
            java.lang.String r4 = ""
            r3 = 0
            if (r5 != 0) goto L5c
            X.0v7h r1 = new X.0v7h
            r1.<init>(r3, r6, r3, r4)
            return r1
        L41:
            X.C155000ia.LIZIZ(r1)
            X.08Us r1 = X.C2126308Ur.LIZIZ
            X.0v4g r0 = new X.0v4g
            r0.<init>(r13, r14, r6, r5)
            r4.LL = r6
            r4.LLILZ = r2
            java.lang.Object r1 = X.C23250099c.LJI(r4, r1, r0)
            if (r1 != r3) goto L28
            return r3
        L56:
            X.0v7d r4 = new X.0v7d
            r4.<init>(r13, r3)
            goto L15
        L5c:
            int r2 = r5.reviewStatus
            r0 = 2
            if (r2 != r0) goto L7a
            java.lang.String r10 = r5.templateId
            if (r10 == 0) goto L74
            X.0v7z r5 = X.C1730290v7z.LIZ
            r7 = 0
            r12 = 46
            r8 = r7
            r9 = r7
            r11 = r7
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r0 = X.C1730290v7z.LIZ(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 == 0) goto L74
            r6 = r0
        L74:
            X.0v7h r1 = new X.0v7h
            r1.<init>(r6)
            return r1
        L7a:
            X.0v7h r1 = new X.0v7h
            java.lang.String r0 = r5.reviewMsg
            if (r0 == 0) goto L81
            r4 = r0
        L81:
            r1.<init>(r3, r6, r2, r4)
            return r1
        L85:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1730010v7X.LJFF(com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem, X.05Vn):java.lang.Object");
    }

    public static Object LJII(Context context, C1728990v5t c1728990v5t, TemplateItem templateItem, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean z;
        if (c1728990v5t == null || c1728990v5t.LLIZLLLIL <= 1 || !(!c1728990v5t.LLJILJIL.isEmpty()) || c1728990v5t.LLJILJIL.size() >= c1728990v5t.LLIZLLLIL) {
            return null;
        }
        boolean zB0 = templateItem.b0();
        if (c1728990v5t.LLIZLLLIL > 1 && zB0 && c1728990v5t.LLJILJIL.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c1728990v5t.LLJILJIL);
        if (!z) {
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(((TemplateItem) it2.next()).getTemplateId(), templateItem.getTemplateId())) {
                        break;
                    }
                }
                arrayList.add(templateItem);
            } else {
                arrayList.add(templateItem);
            }
        }
        if (arrayList.size() < c1728990v5t.LLIZLLLIL) {
            return null;
        }
        return C1731360v9i.LIZ.LIZJ(context, arrayList, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData r14, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r15, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r16, X.InterfaceC1364105Vn<? super X.C1730110v7h> r17) throws java.lang.Throwable {
        /*
            r13 = this;
            r6 = r16
            r3 = r17
            boolean r0 = r3 instanceof X.C1730080v7e
            if (r0 == 0) goto L70
            r4 = r3
            X.0v7e r4 = (X.C1730080v7e) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r4.LLILZ = r2
        L16:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r5 = 0
            r2 = 1
            if (r0 == 0) goto L42
            if (r0 != r2) goto L9f
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r6 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L29:
            X.0X52 r1 = (X.C0X52) r1
            if (r1 == 0) goto L37
            T r0 = r1.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            if (r0 == 0) goto L37
            T r5 = r0.data
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.SaveTemplateResponse r5 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.SaveTemplateResponse) r5
        L37:
            java.lang.String r4 = ""
            r3 = 0
            if (r5 != 0) goto L76
            X.0v7h r1 = new X.0v7h
            r1.<init>(r3, r6, r3, r4)
            return r1
        L42:
            X.C155000ia.LIZIZ(r1)
            if (r15 == 0) goto L5e
            boolean r0 = r15.areContentsTheSame(r6)
            if (r0 == 0) goto L5e
            X.0v7z r0 = X.C1730290v7z.LIZ
            r0.getClass()
            boolean r0 = X.C1730290v7z.LJIILL(r15)
            if (r0 != 0) goto L5e
            X.0v7h r0 = new X.0v7h
            r0.<init>(r6)
            return r0
        L5e:
            X.08Us r1 = X.C2126308Ur.LIZIZ
            X.0v4h r0 = new X.0v4h
            r0.<init>(r13, r14, r6, r5)
            r4.LL = r6
            r4.LLILZ = r2
            java.lang.Object r1 = X.C23250099c.LJI(r4, r1, r0)
            if (r1 != r3) goto L29
            return r3
        L70:
            X.0v7e r4 = new X.0v7e
            r4.<init>(r13, r3)
            goto L16
        L76:
            int r2 = r5.reviewStatus
            r0 = 2
            if (r2 != r0) goto L94
            java.lang.String r10 = r5.templateId
            if (r10 == 0) goto L8e
            X.0v7z r5 = X.C1730290v7z.LIZ
            r7 = 0
            r12 = 46
            r8 = r7
            r9 = r7
            r11 = r7
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r0 = X.C1730290v7z.LIZ(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 == 0) goto L8e
            r6 = r0
        L8e:
            X.0v7h r1 = new X.0v7h
            r1.<init>(r6)
            return r1
        L94:
            X.0v7h r1 = new X.0v7h
            java.lang.String r0 = r5.reviewMsg
            if (r0 == 0) goto L9b
            r4 = r0
        L9b:
            r1.<init>(r3, r6, r2, r4)
            return r1
        L9f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1730010v7X.LJI(com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1729810v7D r30, android.content.Context r31, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r32, kotlin.jvm.internal.AwS427S0200000_26 r33, kotlin.jvm.internal.AwS605S0100000_26 r34, X.InterfaceC1364105Vn r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1730010v7X.LIZ(X.0v7D, android.content.Context, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem, kotlin.jvm.internal.AwS427S0200000_26, kotlin.jvm.internal.AwS605S0100000_26, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1729810v7D r22, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r23, android.view.ViewGroup r24, kotlin.jvm.internal.AwS427S0200000_26 r25, kotlin.jvm.internal.AwS605S0100000_26 r26, X.InterfaceC1364105Vn r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1730010v7X.LIZJ(X.0v7D, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem, android.view.ViewGroup, kotlin.jvm.internal.AwS427S0200000_26, kotlin.jvm.internal.AwS605S0100000_26, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1729810v7D r22, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r23, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r24, android.view.ViewGroup r25, boolean r26, kotlin.jvm.internal.AwS570S0100000_26 r27, kotlin.jvm.internal.AwS605S0100000_26 r28, X.InterfaceC1364105Vn r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1730010v7X.LIZIZ(X.0v7D, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem, android.view.ViewGroup, boolean, kotlin.jvm.internal.AwS570S0100000_26, kotlin.jvm.internal.AwS605S0100000_26, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x021c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(android.content.Context r30, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r31, java.util.List<? extends com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem> r32, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData r33, boolean r34, java.lang.String r35, kotlin.jvm.functions.Function0<kotlin.Unit> r36, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r37, X.InterfaceC1364105Vn<? super kotlin.Unit> r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1730010v7X.LIZLLL(android.content.Context, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem, java.util.List, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData, boolean, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0249  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1729810v7D r33, com.bytedance.android.livesdkapi.depend.model.LiveEffect r34, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r35, android.view.ViewGroup r36, boolean r37, boolean r38, kotlin.jvm.functions.Function0<kotlin.Unit> r39, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r40, X.InterfaceC1364105Vn<? super kotlin.Unit> r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1730010v7X.LJ(X.0v7D, com.bytedance.android.livesdkapi.depend.model.LiveEffect, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem, android.view.ViewGroup, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
