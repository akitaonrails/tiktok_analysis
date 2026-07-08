package X;

import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M64, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.airemix.api.service.AIRemixDraftBoxConversationManagerAsync$getProfileAIRemixDataAsync$1$1", f = "IAIRemixDraftBoxConversationManager.kt", l = {}, m = "invokeSuspend")
public final class C0M64 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0M68 LL;
    public final /* synthetic */ C00IR LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M64(C0M68 c0m68, C00IR c00ir, InterfaceC1364105Vn<? super C0M64> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0m68;
        this.LLILLJJLI = c00ir;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0M64(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIRemixDraftBoxConversationManagerAsync@fde2.getProfileAIRemixDataAsync$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0M68 c0m68 = this.LL;
        C00IR c00ir = this.LLILLJJLI;
        C0M67 c0m67 = (C0M67) c0m68;
        final C0M6E c0m6e = c0m67.LIZ;
        final int i = c0m67.LIZIZ;
        final Runnable runnable = c0m67.LIZJ;
        AwemeDraft awemeDraft = c0m67.LIZLLL;
        final Function0 function0 = c0m67.LJ;
        c0m6e.getClass();
        C1C7U.LIZ("AbsDraftBoxViewHolder@51fe.bindAIRemixVideoCoverAsync$1L$1L");
        if (i != c0m6e.LLIZ.get()) {
            C1C7U.LIZIZ("AbsDraftBoxViewHolder@51fe.bindAIRemixVideoCoverAsync$1L$1L");
        } else if (c00ir != null && c00ir.LIZIZ > awemeDraft.saveTime && !c00ir.LIZ.isEmpty()) {
            final String str = c00ir.LIZ;
            C0M66.LIZ(new Runnable() { // from class: X.0M65
                @Override // java.lang.Runnable
                public final void run() {
                    final C0M6E c0m6e2 = c0m6e;
                    final int i2 = i;
                    String str2 = str;
                    final Function0 function02 = function0;
                    final Runnable runnable2 = runnable;
                    c0m6e2.getClass();
                    C1C7U.LIZ("AbsDraftBoxViewHolder@51fe.bindAIRemixVideoCoverAsync$1L$1L$1L");
                    if (i2 != c0m6e2.LLIZ.get()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("bindAIRemixVideoCoverAsync: stale ai remix cover result, skip. seq=");
                        sbLIZ.append(i2);
                        C201955140j.LIZIZ("AbsDraftBoxViewHolder", C2188811AlT.LIZIZ(sbLIZ));
                        C1C7U.LIZIZ("AbsDraftBoxViewHolder@51fe.bindAIRemixVideoCoverAsync$1L$1L$1L");
                        return;
                    }
                    if (str2.isEmpty()) {
                        c0m6e2.LLIZLLLIL.LIZJ(false);
                        runnable2.run();
                    } else {
                        final SmartImageView smartImageView = c0m6e2.LLILLJJLI;
                        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                        c1320810kTXLIZJ.LJII(str2);
                        c1320810kTXLIZJ.LJIILJJIL = smartImageView.getController();
                        c1320810kTXLIZJ.LJIIIIZZ = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0M6B
                            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                            public final void LIZLLL(String str3, Throwable th) {
                                if (i2 != c0m6e2.LLIZ.get()) {
                                    return;
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("bindAIRemixVideoCoverAsync: ai remix cover load failed, fallback to draft cover. seq=");
                                sbLIZ2.append(i2);
                                C201955140j.LIZIZ("AbsDraftBoxViewHolder", C2188811AlT.LIZIZ(sbLIZ2));
                                c0m6e2.LLIZLLLIL.LIZJ(false);
                                runnable2.run();
                            }

                            /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
                            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LJ(java.lang.String r10, java.lang.Object r11, android.graphics.drawable.Animatable r12) {
                                /*
                                    r9 = this;
                                    int r1 = r2
                                    X.0M6E r0 = r1
                                    java.util.concurrent.atomic.AtomicInteger r0 = r0.LLIZ
                                    int r0 = r0.get()
                                    if (r1 != r0) goto L76
                                    X.0M6E r0 = r1
                                    X.0Lt1 r1 = r0.LLIZLLLIL
                                    r0 = 1
                                    r1.LIZJ(r0)
                                    com.bytedance.lighten.loader.SmartImageView r0 = r3
                                    android.graphics.drawable.Drawable r8 = r0.getDrawable()
                                    X.0M6E r7 = r1
                                    com.bytedance.lighten.loader.SmartImageView r6 = r3
                                    r7.getClass()
                                    r5 = 0
                                    if (r8 == 0) goto L57
                                    boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
                                    if (r0 != 0) goto L62
                                    int r4 = r8.getIntrinsicWidth()
                                    int r3 = r8.getIntrinsicHeight()
                                    if (r4 > 0) goto L36
                                    int r4 = r6.getWidth()
                                L36:
                                    if (r3 > 0) goto L3c
                                    int r3 = r6.getHeight()
                                L3c:
                                    if (r4 <= 0) goto L57
                                    if (r3 <= 0) goto L57
                                    android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L53
                                    android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r4, r3, r0)     // Catch: java.lang.Throwable -> L53
                                    android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L53
                                    r1.<init>(r2)     // Catch: java.lang.Throwable -> L53
                                    r0 = 0
                                    r8.setBounds(r0, r0, r4, r3)     // Catch: java.lang.Throwable -> L53
                                    r8.draw(r1)     // Catch: java.lang.Throwable -> L53
                                    goto L59
                                L53:
                                    r0 = move-exception
                                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                                L57:
                                    r8 = r5
                                    goto L62
                                L59:
                                    android.graphics.drawable.BitmapDrawable r8 = new android.graphics.drawable.BitmapDrawable
                                    android.content.res.Resources r0 = r6.getResources()
                                    r8.<init>(r0, r2)
                                L62:
                                    r7.LLJ = r8
                                    X.0M6E r0 = r1
                                    android.graphics.drawable.Drawable r1 = r0.LLJ
                                    if (r1 == 0) goto L6f
                                    com.bytedance.lighten.loader.SmartImageView r0 = r3
                                    r0.setPlaceholderImage(r1)
                                L6f:
                                    kotlin.jvm.functions.Function0 r0 = r4
                                    if (r0 == 0) goto L76
                                    r0.invoke()
                                L76:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C0M6B.LJ(java.lang.String, java.lang.Object, android.graphics.drawable.Animatable):void");
                            }
                        };
                        c0m6e2.LLILLJJLI.setController(c1320810kTXLIZJ.LIZ());
                        C201955140j.LIZIZ("AbsDraftBoxViewHolder", "bindAIRemixVideoCoverAsync: start ai remix cover load");
                    }
                    C1C7U.LIZIZ("AbsDraftBoxViewHolder@51fe.bindAIRemixVideoCoverAsync$1L$1L$1L");
                }
            });
            C1C7U.LIZIZ("AbsDraftBoxViewHolder@51fe.bindAIRemixVideoCoverAsync$1L$1L");
        } else {
            c0m6e.LLIZLLLIL.LIZJ(false);
            runnable.run();
            C1C7U.LIZIZ("AbsDraftBoxViewHolder@51fe.bindAIRemixVideoCoverAsync$1L$1L");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIRemixDraftBoxConversationManagerAsync@fde2.getProfileAIRemixDataAsync$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
