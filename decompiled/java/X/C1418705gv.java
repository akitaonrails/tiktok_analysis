package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05gv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.data.MediaProvider$warmUpFirstScreenAssetsSuspend$2$2", f = "MediaProvider.kt", l = {308}, m = "invokeSuspend")
public final class C1418705gv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C540820LIy LLILLL;
    public final /* synthetic */ List<SocMediaResource> LLILZ;
    public final /* synthetic */ C0L20 LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ C238400w2 LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1418705gv(C540820LIy c540820LIy, List<SocMediaResource> list, C0L20 c0l20, boolean z, C238400w2 c238400w2, InterfaceC1364105Vn<? super C1418705gv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c540820LIy;
        this.LLILZ = list;
        this.LLILZIL = c0l20;
        this.LLILZLL = z;
        this.LLIZ = c238400w2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1418705gv(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jElapsedRealtime;
        C1C7U.LIZ("MediaProvider@7017.warmUpFirstScreenAssetsSuspend$2$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jElapsedRealtime = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            jElapsedRealtime = SystemClock.elapsedRealtime();
            C540820LIy c540820LIy = this.LLILLL;
            List<SocMediaResource> list = this.LLILZ;
            C0L20 c0l20 = this.LLILZIL;
            boolean z = this.LLILZLL;
            this.LL = jElapsedRealtime;
            this.LLILLJJLI = 1;
            if (c540820LIy.LIZJ(list, 4, c0l20, z, null, this) == objLJFF) {
                C1C7U.LIZIZ("MediaProvider@7017.warmUpFirstScreenAssetsSuspend$2$2");
                return objLJFF;
            }
        }
        this.LLIZ.element = SystemClock.elapsedRealtime() - jElapsedRealtime;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaProvider@7017.warmUpFirstScreenAssetsSuspend$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
