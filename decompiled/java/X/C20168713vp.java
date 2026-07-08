package X;

import android.content.Context;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventStickerData;
import com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerResourceMetaData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13vp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.sticker.StorySocialEventStickerResourceProcessor$buildTaskScheduler$1$task$1", f = "StorySocialEventStickerResourceProcessor.kt", l = {99}, m = "invokeSuspend")
public final class C20168713vp extends C09AX implements Function2<C20169813w0<StorySocialEventStickerData>, InterfaceC1364105Vn<? super C20170413w6>, Object> {
    public int LL;
    public final /* synthetic */ C20169013vs LLILLJJLI;
    public final /* synthetic */ SocialStickerResourceMetaData LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C20168613vo LLILZLL;
    public final /* synthetic */ C20168613vo LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20168713vp(C20169013vs c20169013vs, SocialStickerResourceMetaData socialStickerResourceMetaData, Context context, String str, C20168613vo c20168613vo, C20168613vo c20168613vo2, InterfaceC1364105Vn<? super C20168713vp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20169013vs;
        this.LLILLL = socialStickerResourceMetaData;
        this.LLILZ = context;
        this.LLILZIL = str;
        this.LLILZLL = c20168613vo;
        this.LLIZ = c20168613vo2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20168713vp(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C20170413w6 c20170413w6;
        Object objLIZ = obj;
        C1C7U.LIZ("StorySocialEventStickerResourceProcessor@c743.buildTaskScheduler$1$task$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            InterfaceC20168913vr interfaceC20168913vrLIZJ = this.LLILLJJLI.LIZJ(this.LLILLL.getType(), this.LLILZ);
            if (interfaceC20168913vrLIZJ != null) {
                SocialStickerResourceMetaData socialStickerResourceMetaData = this.LLILLL;
                String str = this.LLILZIL;
                this.LL = 1;
                objLIZ = interfaceC20168913vrLIZJ.LIZ(socialStickerResourceMetaData, str, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("StorySocialEventStickerResourceProcessor@c743.buildTaskScheduler$1$task$1");
                    return objLJFF;
                }
            }
            c20170413w6 = new C20170413w6(this.LLILZLL, EnumC20169713vz.FAILED, 0L, null, C2286608xc.LJ(1), false, false, 0, 236);
            C1C7U.LIZIZ("StorySocialEventStickerResourceProcessor@c743.buildTaskScheduler$1$task$1");
            return c20170413w6;
        }
        c20170413w6 = (C20170413w6) objLIZ;
        if (c20170413w6 != null) {
            c20170413w6.LIZ = this.LLIZ;
        } else {
            c20170413w6 = new C20170413w6(this.LLILZLL, EnumC20169713vz.FAILED, 0L, null, C2286608xc.LJ(1), false, false, 0, 236);
        }
        C1C7U.LIZIZ("StorySocialEventStickerResourceProcessor@c743.buildTaskScheduler$1$task$1");
        return c20170413w6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C20169813w0<StorySocialEventStickerData> c20169813w0, InterfaceC1364105Vn<? super C20170413w6> interfaceC1364105Vn) {
        return ((a) create(c20169813w0, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
