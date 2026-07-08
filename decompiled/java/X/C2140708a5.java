package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08a5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem$updateMusicTitleView$5", f = "VideoMusicTitleAssem.kt", l = {1308}, m = "invokeSuspend")
public final class C2140708a5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C2140708a5(InterfaceC1364105Vn<? super C2140708a5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2140708a5(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoMusicTitleAssem@8443.updateMusicTitleView$5");
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
            C633020OsG c633020OsG = C633020OsG.LIZIZ;
            this.LL = 1;
            if (c633020OsG.LJJJJJL(this) == objLJFF) {
                C1C7U.LIZIZ("VideoMusicTitleAssem@8443.updateMusicTitleView$5");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoMusicTitleAssem@8443.updateMusicTitleView$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C2140708a5(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
