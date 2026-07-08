package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.celebration.CelebrationRenderedVideo;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.model.CelebrationMaterialResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MPf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.preload.CelebrationRepo$requestOneCelebrationMaterial$2$job$1$1", f = "CelebrationRepo.kt", l = {473}, m = "invokeSuspend")
public final class C567930MPf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ CelebrationRenderedVideo LLILZ;
    public final /* synthetic */ CelebrationMaterialResponse LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567930MPf(int i, CelebrationRenderedVideo celebrationRenderedVideo, CelebrationMaterialResponse celebrationMaterialResponse, InterfaceC1364105Vn<? super C567930MPf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
        this.LLILZ = celebrationRenderedVideo;
        this.LLILZIL = celebrationMaterialResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C567930MPf(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jCurrentTimeMillis;
        int size;
        boolean z;
        int size2;
        Object objLJI = obj;
        C1C7U.LIZ("CelebrationRepo@2cdd.requestOneCelebrationMaterial$2$job$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        boolean z2 = true;
        if (i != 0) {
            if (i == 1) {
                jCurrentTimeMillis = this.LL;
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            C554890LpX c554890LpX = C554890LpX.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CeleRepo-material, downloading render video for celebrationType: ");
            sbLIZ.append(this.LLILLL);
            C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
            jCurrentTimeMillis = System.currentTimeMillis();
            C566620MKe c566620MKe = C566620MKe.LIZ;
            int i2 = this.LLILLL;
            CelebrationRenderedVideo celebrationRenderedVideo = this.LLILZ;
            this.LL = jCurrentTimeMillis;
            this.LLILLJJLI = 1;
            c566620MKe.getClass();
            objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C566720MKo(i2, celebrationRenderedVideo, null));
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("CelebrationRepo@2cdd.requestOneCelebrationMaterial$2$job$1$1");
                return objLJFF;
            }
        }
        String str = (String) objLJI;
        C568060MPs c568060MPs = C568060MPs.LIZ;
        int i3 = this.LLILLL;
        List<Long> list = this.LLILZ.originalItemIds;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        List<Aweme> list2 = this.LLILZIL.data;
        if (list2 != null) {
            size2 = list2.size();
        } else {
            size2 = 0;
        }
        C568060MPs.LIZ(c568060MPs, i3, "download_render_video", size, z, jCurrentTimeMillis2, size2, "first_render", null, null, null, 1920);
        if (str.length() > 0) {
            C554890LpX c554890LpX2 = C554890LpX.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("CeleRepo-material, render video download success: ");
            sbLIZ2.append(str);
            C201955140j.LIZJ(c554890LpX2, C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            C554890LpX c554890LpX3 = C554890LpX.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("CeleRepo-material, render video download failed for celebrationType: ");
            sbLIZ3.append(this.LLILLL);
            C201955140j.LJIJI(c554890LpX3, C2188811AlT.LIZIZ(sbLIZ3));
        }
        if (str.length() <= 0) {
            z2 = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z2);
        C1C7U.LIZIZ("CelebrationRepo@2cdd.requestOneCelebrationMaterial$2$job$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
