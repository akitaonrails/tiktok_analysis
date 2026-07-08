package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAvatarConfigSetting;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.157t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.AvatarResourceManager$downloadFiles$1", f = "AvatarResourceManager.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C204695157t extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C259800zU LLILLJJLI;
    public C259800zU LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ AbstractC1529700puS LLIZ;
    public final /* synthetic */ Avatar LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C204695157t(AbstractC1529700puS abstractC1529700puS, Avatar avatar, InterfaceC1364105Vn<? super C204695157t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = abstractC1529700puS;
        this.LLIZLLLIL = avatar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C204695157t c204695157t = new C204695157t(this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c204695157t.LLILZLL = obj;
        return c204695157t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.concurrent.atomic.AtomicReference] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        C259800zU c259800zU;
        C259800zU c259800zU2;
        C1C7U.LIZ("AvatarResourceManager@c8eb.downloadFiles$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        if (i != 0) {
            if (i == 1) {
                jCurrentTimeMillis = this.LLILZ;
                c259800zU2 = this.LLILLL;
                c259800zU = this.LLILLJJLI;
                atomicInteger2 = (AtomicInteger) this.LL;
                atomicInteger = (AtomicInteger) this.LLILZLL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILZLL;
            if (MultiGuestAvatarConfigSetting.INSTANCE.getValue().mockAvatarDownloadFail == 1) {
                AbstractC1529700puS abstractC1529700puS = this.LLIZ;
                if (abstractC1529700puS != null) {
                    abstractC1529700puS.LIZ(-999);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AvatarResourceManager@c8eb.downloadFiles$1");
                return unit;
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            atomicInteger = new AtomicInteger(0);
            atomicInteger2 = new AtomicInteger(0);
            c259800zU = new C259800zU();
            c259800zU.element = new AtomicInteger(0);
            c259800zU2 = new C259800zU();
            c259800zU2.element = new AtomicReference();
            AnonymousClass0957[] anonymousClass0957Arr = {C23250099c.LIZIZ(interfaceC497601wk, null, null, new C204693157r(this.LLIZLLLIL, atomicInteger, atomicInteger2, c259800zU, c259800zU2, this.LLIZ, null), 3), C23250099c.LIZIZ(interfaceC497601wk, null, null, new C204694157s(this.LLIZLLLIL, atomicInteger, atomicInteger2, c259800zU, c259800zU2, this.LLIZ, null), 3)};
            this.LLILZLL = atomicInteger;
            this.LL = atomicInteger2;
            this.LLILLJJLI = c259800zU;
            this.LLILLL = c259800zU2;
            this.LLILZ = jCurrentTimeMillis;
            this.LLILZIL = 1;
            if (C1D9F.LIZIZ(anonymousClass0957Arr, this) == objLJFF) {
                C1C7U.LIZIZ("AvatarResourceManager@c8eb.downloadFiles$1");
                return objLJFF;
            }
        }
        int i2 = (atomicInteger.get() + atomicInteger2.get()) / 2;
        long jCurrentTimeMillis2 = (System.currentTimeMillis() - jCurrentTimeMillis) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (i2 >= 100) {
            AbstractC1529700puS abstractC1529700puS2 = this.LLIZ;
            if (abstractC1529700puS2 != null) {
                abstractC1529700puS2.LIZJ();
            }
            C936400aTW.LIZIZ((int) jCurrentTimeMillis2, 0, true, "", this.LLIZLLLIL.avatarId);
        } else {
            AbstractC1529700puS abstractC1529700puS3 = this.LLIZ;
            if (abstractC1529700puS3 != null) {
                int i3 = ((AtomicInteger) c259800zU.element).get();
                ((AtomicReference) c259800zU2.element).get();
                abstractC1529700puS3.LIZ(i3);
            }
            C936400aTW.LIZIZ((int) jCurrentTimeMillis2, ((AtomicInteger) c259800zU.element).get(), false, (String) ((AtomicReference) c259800zU2.element).get(), this.LLIZLLLIL.avatarId);
        }
        C20441214yg.LIZIZ("AvatarResourceManager", "downloadFiles progress=" + i2 + " duration=" + jCurrentTimeMillis2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AvatarResourceManager@c8eb.downloadFiles$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
