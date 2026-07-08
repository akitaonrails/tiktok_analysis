package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KlI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.node.PrefetchMusicNodeKt$prefetchMusicNode$1", f = "PrefetchMusicNode.kt", l = {35, LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C526780KlI extends C09AX implements Function2<C526790KlJ, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C526780KlI(InterfaceC1364105Vn<? super C526780KlI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C526780KlI c526780KlI = new C526780KlI(interfaceC1364105Vn);
        c526780KlI.LLILLJJLI = obj;
        return c526780KlI;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "PrefetchMusicNodeKt@9723.prefetchMusicNode$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r10.LL
            r8 = 2
            r7 = 1
            if (r0 == 0) goto L1b
            if (r0 == r7) goto L7c
            if (r0 == r8) goto L7c
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1b:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r1 = r10.LLILLJJLI
            X.0KlJ r1 = (X.C526790KlJ) r1
            com.ss.android.ugc.aweme.interfaces.ITemplateMusicService r5 = X.C524940KiK.LIZ()
            if (r5 != 0) goto L2e
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L2e:
            com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam r0 = r1.LIZ
            android.app.Activity r4 = r1.LIZIZ
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r1.LIZJ
            java.lang.String r2 = r0.templateId
            r1 = 0
            if (r3 == 0) goto L65
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r3.creativeModel
            if (r0 == 0) goto L65
            com.ss.android.ugc.aweme.creative.model.UgcTemplateData r0 = r0.ugcTemplateData
        L3f:
            java.lang.String r1 = r3.shootWay
        L41:
            kotlin.Pair r0 = X.C531530Ksx.LIZ(r2, r0, r1)
            java.lang.Object r2 = r0.getFirst()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.getSecond()
            java.util.List r1 = (java.util.List) r1
            if (r2 == 0) goto L69
            int r0 = r2.length()
            if (r0 == 0) goto L69
            r10.LL = r7
            java.lang.Object r0 = r5.LIZJ(r4, r2, r10)
            if (r0 != r6) goto L7f
            X.C1C7U.LIZIZ(r9)
            return r6
        L65:
            r0 = r1
            if (r3 == 0) goto L41
            goto L3f
        L69:
            boolean r0 = r1.isEmpty()
            r7 = r7 ^ r0
            if (r7 == 0) goto L7f
            r10.LL = r8
            java.lang.Object r0 = r5.LIZLLL(r4, r1, r10)
            if (r0 != r6) goto L7f
            X.C1C7U.LIZIZ(r9)
            return r6
        L7c:
            X.C155000ia.LIZIZ(r11)
        L7f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C526780KlI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C526790KlJ c526790KlJ, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c526790KlJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
