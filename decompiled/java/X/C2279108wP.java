package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08wP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.core.ChangeAvatarCreateInfoStickerUtils$fetchAvatarInfoSticker$2$1$onSuccess$1", f = "ChangeAvatarCreateInfoStickerUtils.kt", l = {49}, m = "invokeSuspend")
public final class C2279108wP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ EffectChannelResponse LLILZ;
    public final /* synthetic */ InterfaceC1364105Vn<List<? extends Pair<C348460DlM, ? extends Effect>>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2279108wP(EffectChannelResponse effectChannelResponse, InterfaceC1364105Vn<? super List<? extends Pair<C348460DlM, ? extends Effect>>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C2279108wP> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILZ = effectChannelResponse;
        this.LLILZIL = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2279108wP c2279108wP = new C2279108wP(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c2279108wP.LLILLL = obj;
        return c2279108wP;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0039 -> B:6:0x001c). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "ChangeAvatarCreateInfoStickerUtils@2cef.fetchAvatarInfoSticker$2$1$onSuccess$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r10.LLILLJJLI
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L3f
            if (r0 != r6) goto L93
            java.lang.Object r2 = r10.LL
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r1 = r10.LLILLL
            java.util.Collection r1 = (java.util.Collection) r1
            X.C155000ia.LIZIZ(r11)
        L1c:
            if (r11 == 0) goto L21
            r1.add(r11)
        L21:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La6
            java.lang.Object r0 = r2.next()
            X.0957 r0 = (X.AnonymousClass0957) r0
            if (r0 == 0) goto L21
            r10.LLILLL = r1
            r10.LL = r2
            r10.LLILLJJLI = r6
            java.lang.Object r11 = r0.LJLIIIL(r10)
            if (r11 != r7) goto L1c
            X.C1C7U.LIZIZ(r9)
            return r7
        L3f:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r8 = r10.LLILLL
            X.01wk r8 = (X.InterfaceC497601wk) r8
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r0 = r10.LLILZ
            if (r0 == 0) goto L9b
            java.util.List r1 = r0.getCategoryResponseList()
            if (r1 == 0) goto L9b
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r4.<init>(r0)
            java.util.Iterator r3 = r1.iterator()
        L5f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r2 = (com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse) r2
            java.util.List r1 = r2.getTotalEffects()
            X.13Lf r0 = X.AbstractC19994813Le.Default
            java.lang.Object r0 = X.C13LP.LJLJJL(r1, r0)
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            if (r0 == 0) goto L87
            X.08wQ r1 = new X.08wQ
            r1.<init>(r2, r0, r5)
            r0 = 3
            X.099G r0 = X.C23250099c.LIZIZ(r8, r5, r5, r1, r0)
        L83:
            r4.add(r0)
            goto L5f
        L87:
            r0 = r5
            goto L83
        L89:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r4.iterator()
            goto L21
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9b:
            X.05Vn<java.util.List<? extends kotlin.Pair<X.0DlM, ? extends com.ss.android.ugc.effectmanager.effect.model.Effect>>> r1 = r10.LLILZIL
            X.13BV r0 = X.C13BV.INSTANCE
            X.C189200o6.m2constructorimpl(r0)
            r1.resumeWith(r0)
            goto Lb0
        La6:
            if (r1 == 0) goto L9b
            X.05Vn<java.util.List<? extends kotlin.Pair<X.0DlM, ? extends com.ss.android.ugc.effectmanager.effect.model.Effect>>> r0 = r10.LLILZIL
            X.C189200o6.m2constructorimpl(r1)
            r0.resumeWith(r1)
        Lb0:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2279108wP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
