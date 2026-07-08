package X;

import java.io.File;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0m1Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarResourceEncodeHelper$saveAllResourcesToAlbum$dynamicAvatarEncodeJob$1", f = "SocialAvatarResourceEncodeHelper.kt", l = {508}, m = "invokeSuspend")
public final class C1380340m1Y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C1463680oBy LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C259800zU<File> LLILZIL;
    public final /* synthetic */ List<C1378250lyB> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1380340m1Y(C1463680oBy c1463680oBy, String str, String str2, C259800zU<File> c259800zU, List<C1378250lyB> list, InterfaceC1364105Vn<? super C1380340m1Y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1463680oBy;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c259800zU;
        this.LLILZLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1380340m1Y(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarResourceEncodeHelper@5f04.saveAllResourcesToAlbum$dynamicAvatarEncodeJob$1");
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
            C1463680oBy c1463680oBy = this.LLILLJJLI;
            C1463860oCG c1463860oCG = c1463680oBy.LJII;
            C0VSJ c0vsj = new C0VSJ(this.LLILLL, "social_avatar_download_video.mp4");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            this.LLILLJJLI.getClass();
            sbLIZ.append(C1463680oBy.LJIIJJI());
            sbLIZ.append("_social_avatar_download_video_");
            sbLIZ.append(this.LLILZ);
            sbLIZ.append(".mp4");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            this.LL = 1;
            obj = C1463680oBy.LJIILIIL(c1463680oBy, c1463860oCG, true, c0vsj, strLIZIZ, 1348, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarResourceEncodeHelper@5f04.saveAllResourcesToAlbum$dynamicAvatarEncodeJob$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) obj;
        this.LLILZIL.element = pair.getFirst();
        Exception exc = (Exception) pair.getSecond();
        Boolean boolValueOf = null;
        if (exc != null) {
            List<C1378250lyB> list = this.LLILZLL;
            if (exc instanceof C1378250lyB) {
                boolValueOf = Boolean.valueOf(list.add((C1378250lyB) exc));
            }
        }
        C1C7U.LIZIZ("SocialAvatarResourceEncodeHelper@5f04.saveAllResourcesToAlbum$dynamicAvatarEncodeJob$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
