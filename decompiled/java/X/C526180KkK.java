package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KkK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene$preFetchMusic$3", f = "MvChoosePhotoScene.kt", l = {3266}, m = "invokeSuspend")
public final class C526180KkK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ MvChoosePhotoScene LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C526180KkK(String str, MvChoosePhotoScene mvChoosePhotoScene, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C526180KkK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = mvChoosePhotoScene;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526180KkK(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "MvChoosePhotoScene@c985.preFetchMusic$3"
            X.C1C7U.LIZ(r5)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r6.LL
            r4 = 1
            if (r0 == 0) goto L54
            if (r0 != r4) goto L6b
            X.C155000ia.LIZIZ(r7)
        L13:
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r7 = (com.ss.android.ugc.aweme.creative.model.music.AVMusic) r7
            if (r7 == 0) goto L42
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r3 = r6.LLILLL
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r2 = r6.LLILZ
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r3.shortVideoContext
            if (r1 == 0) goto L2d
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r1.cameraComponentModel
            int r0 = r0.mMusicStart
            r7.setMusicBeginTime(r0)
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r1.cameraComponentModel
            int r0 = r0.musicEndTime
            r7.setMusicEndTime(r0)
        L2d:
            r3.avMusic = r7
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = X.C389120FNm.LIZ(r7)
            r3.musicModel = r0
            if (r2 == 0) goto L42
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L4e
        L42:
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r1 = r6.LLILZ
            if (r1 == 0) goto L4e
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.invoke(r0)
        L4e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L54:
            X.C155000ia.LIZIZ(r7)
            com.ss.android.ugc.aweme.interfaces.ITemplateMusicService r1 = X.C524940KiK.LIZ()
            if (r1 == 0) goto L42
            java.lang.String r0 = r6.LLILLJJLI
            r6.LL = r4
            java.lang.Object r7 = r1.LIZIZ(r0, r6)
            if (r7 != r2) goto L13
            X.C1C7U.LIZIZ(r5)
            return r2
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C526180KkK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
