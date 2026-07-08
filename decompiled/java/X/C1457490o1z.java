package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0o1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.preload.PreEmbTaskManager$syncPreLaunchExtractFrameForSinglePic$3", f = "PreEmbTaskManager.kt", l = {}, m = "invokeSuspend")
public final class C1457490o1z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ ShortVideoContext LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1457490o1z(boolean z, String str, ShortVideoContext shortVideoContext, boolean z2, String str2, InterfaceC1364105Vn<? super C1457490o1z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = shortVideoContext;
        this.LLILZ = z2;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1457490o1z(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ShortVideoContext shortVideoContext;
        String str;
        String str2;
        C1C7U.LIZ("PreEmbTaskManager@6b6b.syncPreLaunchExtractFrameForSinglePic$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_preload_frame_for_shoot_pic_opt", true, false) && this.LL && !new C0VSJ(this.LLILLJJLI).exists()) {
            C373801cm.LIZJ(C1697810uHb.LJ(this.LLILLJJLI));
            C201955140j.LJFF("PreEmbTaskManager", "performTaskForSinglePic file does not exist and waitTaskDone");
        }
        if (this.LL && !new C0VSJ(this.LLILLJJLI).exists()) {
            C201955140j.LJFF("PreEmbTaskManager", "performTaskForSinglePic file does not exist");
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PreEmbTaskManager@6b6b.syncPreLaunchExtractFrameForSinglePic$3");
            return unit;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syncPreLaunchExtractFrameForSinglePic start id:");
        sbLIZ.append(C786410Ut5.u3().getId());
        sbLIZ.append(", path: ");
        sbLIZ.append(this.LLILLJJLI);
        C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ));
        List listSingletonList = Collections.singletonList(this.LLILLJJLI);
        if (C1452450ntr.LIZ() && (shortVideoContext = this.LLILLL) != null) {
            boolean z = this.LL;
            if (z) {
                str = "photo_canvas";
                str2 = "shoot";
            } else {
                str = "multi_photo";
                str2 = "upload";
            }
            C1458370o3P c1458370o3P = C1458370o3P.LIZ;
            boolean z2 = this.LLILZ;
            String str3 = this.LLILZIL;
            c1458370o3P.getClass();
            C1458370o3P.LJFF(shortVideoContext, listSingletonList, false, str, str2, z2, str3, z, 0);
            C1458370o3P.LJIIZILJ = EnumC1155060gAC.CLOUD_CONTENT_UNDERSTANDING;
            C1458370o3P.LJIJ = EnumC2290308yD.SINGLE_SELECT_PHOTO.ordinal();
        } else {
            C1458370o3P c1458370o3P2 = C1458370o3P.LIZ;
            C1458370o3P.LJIIZILJ = EnumC1155060gAC.TOS_URI;
            C1457520o22 c1457520o22 = new C1457520o22(listSingletonList);
            C2288408xu c2288408xu = c1457520o22.LIZ;
            EnumC2290308yD enumC2290308yD = EnumC2290308yD.SINGLE_SELECT_PHOTO;
            c2288408xu.LIZLLL = enumC2290308yD.ordinal();
            C1458370o3P.LJIJ = enumC2290308yD.ordinal();
            C1457440o1u.LIZJ(c1457520o22, false, null, 6);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PreEmbTaskManager@6b6b.syncPreLaunchExtractFrameForSinglePic$3");
        return unit2;
    }
}
