package X;

import android.content.Context;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventStickerData;
import com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerResourceMetaData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13vq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.sticker.StorySocialEventStickerResourceProcessor$buildTaskScheduler$downloadStickerTask$1", f = "StorySocialEventStickerResourceProcessor.kt", l = {76}, m = "invokeSuspend")
public final class C20168813vq extends C09AX implements Function2<C20169813w0<StorySocialEventStickerData>, InterfaceC1364105Vn<? super C20170413w6>, Object> {
    public int LL;
    public final /* synthetic */ C20169013vs LLILLJJLI;
    public final /* synthetic */ SocialStickerResourceMetaData LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ StorySocialEventStickerData LLILZLL;
    public final /* synthetic */ C20168613vo LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20168813vq(C20169013vs c20169013vs, SocialStickerResourceMetaData socialStickerResourceMetaData, Context context, String str, StorySocialEventStickerData storySocialEventStickerData, C20168613vo c20168613vo, InterfaceC1364105Vn<? super C20168813vq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20169013vs;
        this.LLILLL = socialStickerResourceMetaData;
        this.LLILZ = context;
        this.LLILZIL = str;
        this.LLILZLL = storySocialEventStickerData;
        this.LLIZ = c20168613vo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20168813vq(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r8 = r20
            java.lang.String r7 = "StorySocialEventStickerResourceProcessor@c743.buildTaskScheduler$downloadStickerTask$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            r4 = r19
            int r0 = r4.LL
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L52
            if (r0 != r3) goto L77
            X.C155000ia.LIZIZ(r8)
        L18:
            X.13w6 r8 = (X.C20170413w6) r8
            if (r8 == 0) goto L75
            X.13vo r0 = r4.LLIZ
            r8.LIZ = r0
            X.13vz r5 = r8.LIZIZ
        L22:
            X.13vz r0 = X.EnumC20169713vz.SUCCESS
            if (r5 != r0) goto L35
            com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventStickerData r0 = r4.LLILZLL
            com.ss.android.ugc.aweme.creative.model.story.stickercreate.SocialStickerMetaData r1 = r0.getMetaData()
            com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerResourceMetaData r0 = r4.LLILLL
            java.lang.String r0 = r0.getLocalPath()
            r1.setStickerPath(r0)
        L35:
            if (r8 != 0) goto L4e
            X.13w6 r8 = new X.13w6
            X.13vo r9 = r4.LLIZ
            X.13vz r10 = X.EnumC20169713vz.FAILED
            r11 = 0
            r13 = 0
            java.lang.Integer r14 = X.C2286608xc.LJ(r3)
            r15 = 0
            r18 = 236(0xec, float:3.31E-43)
            r16 = r15
            r17 = r15
            r8.<init>(r9, r10, r11, r13, r14, r15, r16, r17, r18)
        L4e:
            X.C1C7U.LIZIZ(r7)
            return r8
        L52:
            X.C155000ia.LIZIZ(r8)
            X.13vs r2 = r4.LLILLJJLI
            com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerResourceMetaData r0 = r4.LLILLL
            int r1 = r0.getType()
            android.content.Context r0 = r4.LLILZ
            X.13vr r2 = r2.LIZJ(r1, r0)
            if (r2 == 0) goto L75
            com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerResourceMetaData r1 = r4.LLILLL
            java.lang.String r0 = r4.LLILZIL
            r4.LL = r3
            java.lang.Object r8 = r2.LIZ(r1, r0, r4)
            if (r8 != r6) goto L18
            X.C1C7U.LIZIZ(r7)
            return r6
        L75:
            r8 = r5
            goto L22
        L77:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20168813vq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C20169813w0<StorySocialEventStickerData> c20169813w0, InterfaceC1364105Vn<? super C20170413w6> interfaceC1364105Vn) {
        return ((a) create(c20169813w0, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
