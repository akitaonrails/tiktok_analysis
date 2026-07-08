package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.data.multi_guest_social_data.Avatar;
import webcast.data.multi_guest_social_data.Video;

/* JADX INFO: renamed from: X.157r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.AvatarResourceManager$downloadFiles$1$quiteTask$1", f = "AvatarResourceManager.kt", l = {48}, m = "invokeSuspend")
public final class C204693157r extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ Avatar LLILLJJLI;
    public final /* synthetic */ AtomicInteger LLILLL;
    public final /* synthetic */ AtomicInteger LLILZ;
    public final /* synthetic */ C259800zU<AtomicInteger> LLILZIL;
    public final /* synthetic */ C259800zU<AtomicReference<String>> LLILZLL;
    public final /* synthetic */ AbstractC1529700puS LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C204693157r(Avatar avatar, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, C259800zU<AtomicInteger> c259800zU, C259800zU<AtomicReference<String>> c259800zU2, AbstractC1529700puS abstractC1529700puS, InterfaceC1364105Vn<? super C204693157r> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = avatar;
        this.LLILLL = atomicInteger;
        this.LLILZ = atomicInteger2;
        this.LLILZIL = c259800zU;
        this.LLILZLL = c259800zU2;
        this.LLIZ = abstractC1529700puS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C204693157r(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AvatarResourceManager@c8eb.downloadFiles$1$quiteTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C204692157q c204692157q = C204692157q.LIZ;
            Video video = this.LLILLJJLI.videoStatic;
            AtomicInteger atomicInteger = this.LLILLL;
            AtomicInteger atomicInteger2 = this.LLILZ;
            AtomicInteger atomicInteger3 = this.LLILZIL.element;
            AtomicReference<String> atomicReference = this.LLILZLL.element;
            AbstractC1529700puS abstractC1529700puS = this.LLIZ;
            this.LL = 1;
            c204692157q.getClass();
            obj = C204692157q.LIZJ(0, abstractC1529700puS, atomicInteger, atomicInteger2, atomicInteger3, atomicReference, this, video);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AvatarResourceManager@c8eb.downloadFiles$1$quiteTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AvatarResourceManager@c8eb.downloadFiles$1$quiteTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
